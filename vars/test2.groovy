def call(){


  pipeline {

    agent none

    stages{
      stage("Call generic library"){
        steps{
          Lib-Android(operationName: 'callMehod2')
        }
      }
      stage("Call generic library"){
        steps{
          Lib-IOS(operationName: 'callMehod3')
        }
      }
      stage("Call generic library"){
        steps{
          Lib-Slack(operationName: 'callMehod1')
        }
      }
    }

  }
}