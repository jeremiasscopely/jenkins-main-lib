
new PipelineJob(
        name: "job_test",
        description: "testing",
        // scriptText: """@Library(['main_lib', 'generic-lib']) _
        scriptText: """@Library('main_lib') _
            test2()
        """
).build(this)