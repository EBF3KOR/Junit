pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat "javac -cp .;lib\\junit.jar;lib\\hamcrest-core-1.3.jar src\\main\\java\\HelloWorld.java src\\test\\java\\TestHelloWorld.java"
            }
        }
        stage('Test') {
            steps {
                bat "java -cp .;lib\\junit.jar;lib\\hamcrest-core-1.3.jar org.junit.runner.JUnitCore src\\test\\java\\TestHelloWorld"
            }
        }
    }
}
