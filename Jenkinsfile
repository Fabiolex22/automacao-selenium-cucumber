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

        stage('Run Tests') {
            steps {
                dir('.') {
                    bat 'mvn clean test'
                }
            }
        }

        stage('Generate Cucumber Report') {
            steps {
                dir('.') {
                    bat 'mvn verify -DskipTests'
                }
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
