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
                cucumber fileIncludePattern: 'target/cucumber.json'
            }
        }

        stage('Resultados no Console') {
            steps {
                echo "Testes executados. Veja os relatórios à esquerda."
            }
        }
    }

    post {
        always {
            echo "Pipeline finalizada!"
        }
    }
}
