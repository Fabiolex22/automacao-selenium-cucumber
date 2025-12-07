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
                bat "mvn clean test"
            }
        }

        stage('Publicar Relatório Cucumber') {
            steps {
                publishHTML(target: [
                    reportDir: 'target',
                    reportFiles: 'cucumber-report.html',
                    reportName: 'Relatório Cucumber',
                    keepAll: true,
                    alwaysLinkToLastBuild: true
                ])
            }
        }
    }

    post {
        always {
            echo "Pipeline finalizada!"
        }
    }
}
