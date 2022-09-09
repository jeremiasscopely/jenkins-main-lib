

import javaposse.jobdsl.dsl.Job
import javaposse.jobdsl.dsl.DslFactory

class PipelineJob {

    String name
    String description = ""
    String scriptText
    
    boolean allowConcurrent = true

    Job build(DslFactory context) {


        Job job = context.pipelineJob(JobProperties.name(name))
        job.description description.stripIndent() + "<br>This job is managed by code, do not edit manually. You can find the code <a href=\"https://github.com/scopely/jenkins-toolbelt\">here</a>."

        job.logRotator {
            daysToKeep 365
            numToKeep 200
            artifactDaysToKeep 30
            artifactNumToKeep 10
        }

        if (Jenkins.getBooleanParameter('DEBUG')) {
            job.disabled(true)
        }

        job.definition {
            cps {
                sandbox(true)
                script(scriptText.stripIndent())
            }
        }

        if (!allowConcurrent) {
            job.configure {
                (it / 'concurrentBuild').setValue('false')
            }
        }

        return (job)
    }
}
