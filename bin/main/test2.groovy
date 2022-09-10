def call(){


  pipeline {

    agent none

    stages{
      stage("Call library Android file"){
        steps{
          libAndroid(operationName: 'callMehod2')
        }
      }
      stage("Call library IOS file"){
        steps{
          libIOS(operationName: 'callMehod3')
        }
      }
      stage("Call library SLACK file"){
        steps{
            script {
              sh libSlack(operationName: 'callMehod1')
                
                // libSlack(operationName: 'callMehod1')
            }
        }
      }
    }

  }
}