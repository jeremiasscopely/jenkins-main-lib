import javaposse.jobdsl.dsl.Job




Job job = new PipelineJob(
        name: "carpetaaa/job_test",
        description: "testing",
        // scriptText: """@Library('main_lib',) _
        scriptText: """@Library(['main_lib', 'generic-lib', 'mylib']) _
            poc1()
        """
).build(this)
