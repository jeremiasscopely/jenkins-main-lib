def call(String nodes){

  String splitedNodes = nodes.split("-")

  pipeline {

    agent none

    stages {
      stage("echoooooooo"){
        steps{
          echo "${nodes}"
        }
      }
      stage("echoooooooo2"){
        steps{
          echo "${splitedNodes}"
        }
      }
      stage("clean") {
        matrix {
          axes {
            axis {
              name 'NODE'
              values '${splitedNodes}'
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