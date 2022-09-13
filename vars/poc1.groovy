def call(){


  pipeline {

    agent none

    stages {
      stage("Call library Android file"){
        steps{
          lib_sch_Android(operationName: 'callMehod2')
        }
      }
      stage("Call library IOS file"){
        steps{
          lib_sch_IOS(operationName: 'callMehod3')
        }
      }
      stage("Call library SLACK file"){
        steps{
          lib_sch_Slack(operationName: 'callMehod1')
        }
      }
    }

  }
}