pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                // Pulls the latest code from your GitHub repository
                git branch: 'main', url: 'https://github.com/Ruthik005/learn_devops.git'
            }
        }

        stage('Maven Clean & Test') {
            steps {
                // Executes the Maven build and runs JUnit tests on Windows
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            echo 'Pipeline execution completed.'
        }
    }
}