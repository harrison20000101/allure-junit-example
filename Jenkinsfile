pipeline {
    agent any
    stages {
        stage("Build") {
            steps {
                bat './mvnw -Dmaven.test.failure.ignore=true clean verify'
            }
        }
        stage("Reports") {
            steps {
                allure results: [[path: 'target/allure-results']]
            }
        }
    }
    post {
        always {
            deleteDir()
        }
    }
}
