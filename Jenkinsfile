pipeline {
    agent any

    environment {
        // Set the environment variables (adjust as needed)
        DOCKER_IMAGE = "selenium/standalone-chrome:119.0"
        PROJECT_DIR = "/app"
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the repository
                git branch: 'main', url: 'https://github.com/BaniprasadMangaraj/flipkart-automation.git'
            }
        }

        stage('Build') {
            steps {
                script {
                    // Build Maven project
                    sh 'mvn clean install -DskipTests'
                }
            }
        }

        stage('Start Selenium Grid') {
            steps {
                script {
                    // Start the Selenium Standalone container
                    sh 'docker-compose -f docker-compose.yml up -d chrome'
                }
            }
        }

        stage('Run Tests') {
            steps {
                script {
                    // Run the Selenium tests
                    sh 'docker-compose -f docker-compose.yml run selenium-tests'
                }
            }
        }

        stage('Stop Selenium Grid') {
            steps {
                script {
                    // Stop the Selenium container
                    sh 'docker-compose down'
                }
            }
        }

        stage('Post-Processing') {
            steps {
                script {
                    // Archive test reports
                    archiveArtifacts artifacts: '**/target/surefire-reports/*.xml', allowEmptyArchive: true

                    // Optionally, generate a test report (for visualization)
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
    }

    post {
        always {
            // Clean up workspace after pipeline run
            cleanWs()
        }
        success {
            echo 'Build and tests completed successfully!'
        }
        failure {
            echo 'Build or tests failed. Please check the logs.'
        }
    }
}
