new PipelineJob(
        name: "job_test",
        description: "testing",
        // scriptText: """@Library(['main_lib']) _
        scriptText: """@Library(['main_lib', 'generic-lib']) _
            test2()
        """
).build(this)