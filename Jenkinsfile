pipeline{
    agent any
    tools{ 
    maven 'maven-3.6.3'  
    }
    stages{
        stage("Maven Build"){
            steps{
                bat 'mvn clean package install test'
            }
        }
    }
  }
