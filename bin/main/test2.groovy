def call(){

  pipeline {

    agent none

    stages{
      stage("print"){
        print("test!!")
      }
    }

  }
}