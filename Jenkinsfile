pipeline {
    agent any

    stages {
        stage('Build & Test') {
            steps {
                bat "mvn clean test verify"
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'target/cucumber-html-reports/**/*', fingerprint: true
            junit 'target/surefire-reports/*.xml'
        }
    }
}
