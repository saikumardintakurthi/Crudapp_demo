pipeline{
	agent any
	tools { 
        maven 'Maven 3.6.3' 
        jdk 'jdk8' 
    }
	
	
	stages{
	  stage('clean stage'){
	   steps{
	     
	     	sh 'mvn clean'
	        
	   }	  
	  }
	  stage('compile stage'){
	  steps{
	    
	     	sh 'mvn compile'
	        
	   }	
	  
	  }
	  stage('build stage'){
	  steps{
	     
	     	sh 'mvn build'
	     	   
	   }	
	  
	  }
	  stage('package stage'){
	  steps{
	     
	     	sh 'mvn package'
	        
	   }	
	  
	  }
	  
	  
	  
	  
	  
	  }
	}
