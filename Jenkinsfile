pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Use GitHub credentials for checkout
                git url: 'https://github.com/Jafestro/Time_Calculator.git',
                    credentialsId: '30427c88-1b76-4310-86cf-20de9c949f4e'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Code Coverage') {
            steps {
                jacoco execPattern: '**/target/jacoco.exec'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
            jacoco execPattern: '**/target/jacoco.exec'
        }
    }
}
