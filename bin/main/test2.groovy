def call(){


  pipeline {

    agent none

    stages{
      stage("print"){
        steps{
          echo "Testado!!!!"
        }
      }
    }

  }
}