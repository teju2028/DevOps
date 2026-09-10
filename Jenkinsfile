pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/teju2028/DevOps.git'
            }
        }

        stage('Compile') {
            steps {
                bat 'javac Factorial.java TestFactorial.java'
            }
        }

        stage('Test') {
            steps {
                bat 'java TestFactorial'
            }
        }

        stage('Run') {
            steps {
                bat 'java Factorial'
            }
        }

        stage('Package JAR') {
            steps {
                bat 'jar cfm factorial.jar manifest.txt Factorial.class TestFactorial.class'
            }
        }

        stage('Archive JAR') {
            steps {
                archiveArtifacts artifacts: 'factorial.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo 'Successful build, test, run and package'
        }

        failure {
            echo 'Failed in build, test, run etc. Check once.'
        }
    }
}
