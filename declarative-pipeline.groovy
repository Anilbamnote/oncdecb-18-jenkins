pipeline {
    agent any //{label 'slave'}
    stages {
        stage('git_checkout') {
            steps {
                git branch: 'develop', url: 'https://github.com/cloud-blitz/angular-java.git'
            }
        }
        stage('build') {
            steps {
                echo "buils success"
            }
        }
        stage('test') {
            steps {
                echo "test success"
            }
        }
        stage('deploy') {
            steps {
                echo "depoly success"
            }
        }
    }
}