Pipeline{
    agent any
    stages{
        stage('compute out'){
            steps{
                git branch:main, url:'https://github.com/teju2028/DevOps.git'
            }
        }
        stage('compile')
        {
            steps{
                bat 'javac Factorial.java TestFactorial.java'
            }
        }
        stage('test')
        {
            steps{
                bat 'java TestFactorial'
            }
        }
        stage('run')
        {
            steps{
                bat 'java Factorial'
            }
        }
        stage('package jar')
        {
            steps{
                'jar crm factorial.java manifest.txt Factorial.class'
            }
        }
        stage('archieve jar')
        {
            steps{
                'archieveArtifact Artifact: factorial.jar'
            }
        }
    }
    post{
        success{
            echo 'Successful build,test,run etc'
        }
        failure{
            echo 'Failed in build,test,run etc..check once'
        }
    }
}
