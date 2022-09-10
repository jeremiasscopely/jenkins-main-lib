def call(){


  pipeline {

    agent none

    stages{
      stage("print"){
        steps{
          echo "Testado!!!!"
        }
      }
      stage("print2"){
        steps{
          sayHello()
        }
      }
    }

  }
}