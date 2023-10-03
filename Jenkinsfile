pipeline {
    agent any

    stages {
            stage('Build') {
                steps {
                    bat 'mvn clean'
                    bat 'mvn compile'
                }
            }
            stage('Test') {
                steps {
                    bat 'mvn test'
                }
                post {
                    always {
                        junit 'target/surefire-reports/*.xml'
                    }
                }
            }
        }
}