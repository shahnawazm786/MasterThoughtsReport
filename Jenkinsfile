pipeline{
	agent any
	tools
	{
		maven 'maven-3.6.3'
	}
	stages{
		stage('initial'){
		steps { sh 'mvn clean package'} 
		}
	}
}