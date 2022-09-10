def call(){

  
  @Library("generic-lib") _

  pipeline {

    agent none

    stages{
      stage("print"){
        steps{
          echo "Testado!!!!"
        }
      }
      sayHello()
    }

  }
}