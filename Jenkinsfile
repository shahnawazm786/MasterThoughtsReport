<<<<<<< HEAD
pipeline 
{ 
agent any tools 
	{ maven 'maven-3.6.3' } 
	stages { stage ('Build') 
	{ steps { sh 'mvn clean package' } } } }
=======
pipeline {
    agent any
    tools { 
        maven 'maven-3.3.6' 
        jdk 'jdk8' 
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                ''' 
            }
        }

        stage ('Build') {
            steps {
                echo 'This is a minimal pipeline.'
            }
        }
    }
}
>>>>>>> 7ae07cde78304f46cac54e0f95821e3e4c8ea913
