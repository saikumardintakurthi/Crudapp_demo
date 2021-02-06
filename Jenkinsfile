pipeline{
	agent any
	tools { 
        maven 'Maven 3.3.9' 
        jdk 'jdk8' 
    }
	
	stages{
	  stage('clean stage'){
	   steps{
	     withMaven(maven : 'maven_3_5_0'){
	     	sh 'mvn clean'
	     }	   
	   }	  
	  }
	  stage('compile stage'){
	  steps{
	     withMaven(maven : 'maven_3_5_0'){
	     	sh 'mvn compile'
	     }	   
	   }	
	  
	  }
	  stage('build stage'){
	  steps{
	     withMaven(maven : 'maven_3_5_0'){
	     	sh 'mvn build'
	     }	   
	   }	
	  
	  }
	  stage('package stage'){
	  steps{
	     withMaven(maven : 'maven_3_5_0'){
	     	sh 'mvn package'
	     }	   
	   }	
	  
	  }
	  
	  
	  
	  
	  
	  }
	}
