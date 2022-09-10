def call(){

  def imported = libraryResource "lib/common/commonSteps.groovy"

  pipeline {

    agent none

    stages{
      stage("print"){
        steps{
          echo "Testado!!!!"
        }
        imported.common()
      }
    }

  }
}