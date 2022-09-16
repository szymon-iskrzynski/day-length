pipeline {
    agent any
    tools {
        maven 'M3'
    }

    stages {
        stage ('Compile Stage') {
            steps {
                    sh 'mvn clean compile'
            }
        }

        stage ('Testing Stage') {

            steps {
                    sh 'mvn test'
            }
        }
    }
}