def call(){


  pipeline {

    agent none

    stages {
      stage("Call library Android file"){
        steps{
          lib_sch_android(operationName: 'callMehod2')
        }
      }
      stage("Call library IOS file"){
        steps{
          lib_sch_ios(operationName: 'callMehod3')
        }
      }
      stage("Call library SLACK file"){
        steps{
          lib_sch_slack(operationName: 'callMehod1')
        }
      }
      stage("Call other lib"){
        steps{
          mlib_test(operationName: 'callMehod1')
        }
      }
    }

  }
}