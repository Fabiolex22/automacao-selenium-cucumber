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

        stage('Relatório Cucumber') {
            steps {
                cucumber fileIncludePattern: 'target/cucumber.json'
            }
        }
    }

    post {
        always {
            echo "Pipeline finalizada!"
        }
    }
}
