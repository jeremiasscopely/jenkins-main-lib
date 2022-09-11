
def returnNodes(){
    String nodes = "nodetest1-nodetest2-nodetest3"
    return nodes 
}


new PipelineJob(
        name: "job_test",
        description: "testing",
        // scriptText: """@Library('main_lib',) _
        scriptText: """@Library(['main_lib', 'generic-lib']) _
            test2('${returnNodes()'})
        """
).build(this)