pipeline {
  agent any
  stages {
    stage('stage 1') {
      parallel {
        stage('stage 1') {
          steps {
            bat 'echo 11'
          }
        }

        stage('step 2') {
          steps {
            timestamps() {
              bat 'echo $a'
            }

          }
        }

      }
    }

    stage('stage2') {
      steps {
        bat 'echo 2'
      }
    }

    stage('junit') {
      steps {
        junit '**/target/surefire-reports/*.xml'
      }
    }

  }
  environment {
    a = '122'
  }
}