import jobs.dsl.common.PipelineJob


new PipelineJob(
        name: "job_test",
        description: "testing",
        scriptText: """@Library('main_lib')_
            test2()
        """
).build(this)