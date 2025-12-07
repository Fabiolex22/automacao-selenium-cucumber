pipeline {
    agent any

    tools {
        jdk 'jdk17'
        maven 'maven3'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Generate Cucumber Report') {
            steps {
                bat 'mvn verify'
            }
        }

        stage('Publish HTML Report') {
            steps {
                publishHTML([
                    reportName: 'Cucumber Report',
                    reportDir: 'target/cucumber-html-reports',
                    reportFiles: 'index.html',
                    keepAll: true,
                    alwaysLinkToLastBuild: true
                ])
            }
        }
    }
}
