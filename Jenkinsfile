pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat "javac -cp .;lib\\junit.jar;lib\\hamcrest-core-1.3.jar HelloWorld.java TestHelloWorld.java"
            }
        }
        stage('Test') {
            steps {
                bat "java -cp .;lib\\junit.jar;lib\\hamcrest-core-1.3.jar org.junit.runner.JUnitCore TestHelloWorld"
            }
        }
    }
}
