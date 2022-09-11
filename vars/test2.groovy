def call(String[] nodes){


  pipeline {

    agent none

    stages {
      stage("clean") {
        matrix {
          axes {
            axis {
              name 'NODE'
              values nodes
            }
          }
          stages {
              stage('Put offline') {
                steps {
                  echo "Putting node ${NODE} offline"
                }
              }
          }
        }
      }
    }

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
          libSlack(operationName: 'callMehod1')
        }
      }
    }

  }
}