pipeline{
    agent any
    tools{
        maven 'Maven'
    }
    stages{
        stage("SCM Checkout"){
            steps{
            git 'https://github.com/shahnawazm786/MasterThoughtsReport.git'
            }
        }
        stage("Maven Build"){
            steps{
                bat 'mvn clean package'
            }
        }
    }
}