import com.poc.common.PipelineJob

@Library('generic-lib') _

new PipelineJob(
        name: "job_test",
        description: "testing",
        scriptText: """@Library('main_lib')_
            test2()
        """
).build(this)