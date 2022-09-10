def call(){


  pipeline {

    agent none

    stages{
      stage("Call generic library"){
        steps{
          libAndroid(operationName: 'callMehod2')
        }
      }
      stage("Call generic library"){
        steps{
          libIOS(operationName: 'callMehod3')
        }
      }
      stage("Call generic library"){
        steps{
          libSlack(operationName: 'callMehod1')
        }
      }
    }

  }
}