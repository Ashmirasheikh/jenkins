pipeline {
    agent any
    stages {
        stage('pull') {
            steps {
                git 'https://github.com/Ashmirasheikh/jenkins.git'
            }
        }
    }
}