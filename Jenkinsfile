pipeline{
	agent any
	
	
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
