@Library('generic-lib') _

job('example2') {
  steps {
    shell('echo Hello World!')
  }
  steps {
    sayHello()
  }
}