pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/Ruthik005/learn_devops.git'
            }
        }

        stage('Maven Clean & Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            // Parses JUnit XML test reports for the dashboard
            junit 'target/surefire-reports/*.xml'
        }
        success {
            // Sends an email notification on build success
            emailext (
                subject: "SUCCESS: Job '${env.JOB_NAME} [Build #${env.BUILD_NUMBER}]'",
                body: "Good news! The pipeline completed successfully.\n\nCheck console output at: ${env.BUILD_URL}",
                to: 'ruthikpyla2005@gmail.com' // Replace with your actual email address
            )
        }
        failure {
            // Sends an email notification on build failure
            emailext (
                subject: "FAILED: Job '${env.JOB_NAME} [Build #${env.BUILD_NUMBER}]'",
                body: "Alert! The pipeline has failed.\n\nPlease check console output at: ${env.BUILD_URL}",
                to: 'ruthikpyla2005@gmail.com' // Replace with your actual email address
            )
        }
    }
}