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

        // Removido: gerar relatório HTML (pois não existe mais no POM)
        // Removido: publicação de relatório HTML inexistente

        stage('Resultados no Console') {
            steps {
                echo "Testes executados. Veja a saída do console para os resultados do Cucumber."
            }
        }
    }

    post {
        always {
            echo "Pipeline finalizada!"
        }
    }
}
