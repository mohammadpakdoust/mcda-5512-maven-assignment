pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/mohammadpakdoust/mcda-5512-maven-assignment.git'
            }
        }

        stage('Build, Test, and Package') {
            steps {
                sh 'mvn clean test package'
            }
        }

        stage('Show Artifacts') {
            steps {
                sh 'ls -lh target'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
        success {
            echo 'Build completed successfully.'
        }
        failure {
            echo 'Build failed.'
        }
    }
}