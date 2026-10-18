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
            // Automatically parses JUnit XML test reports and publishes them to the Jenkins dashboard
            junit 'target/surefire-reports/*.xml'
        }
        success {
            echo 'Pipeline completed successfully and test reports published!'
        }
        failure {
            echo 'Pipeline failed. Check test reports for details.'
        }
    }
}