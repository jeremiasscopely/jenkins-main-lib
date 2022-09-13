import javaposse.jobdsl.dsl.Job




Job job = new PipelineJob(
        name: "job_test",
        description: "testing",
        // scriptText: """@Library('main_lib',) _
        scriptText: """@Library(['main_lib', 'generic-lib']) _
            poc1()
        """
).build(this)
