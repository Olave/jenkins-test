pipeline {
  agent any
  stages {
    stage('stage 1') {
      steps {
        bat 'echo 11'
      }
    }

    stage('stage2') {
      steps {
        bat 'echo 2'
      }
    }

  }
  environment {
    a = '122'
  }
}