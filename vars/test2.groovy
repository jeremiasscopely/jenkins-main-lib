def call(){

  def utils = library('mylib').com.mycorp.jenkins.Utils.new(this)
  utils.handyStuff()

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