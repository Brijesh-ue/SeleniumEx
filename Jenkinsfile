pipeline{
  agent any
  tools{
    maven 'Maven'
  }
  stages{
    stage('Checkout'){
      steps{
        git branch:'main',url:'https://github.com/Brijesh-ue/SeleniumEx.git'
      }
    }
    stage('Build'){
      steps{
        sh 'mvn clean package'
      }
    }
    stage('Test'){
      steps{
        sh 'mvn test'
      }
    }
    stage('Check Target Folder'){
      steps{
        sh 'ls -l target'
      }
    }
    stage('Run Application'){
      steps{
        sh 'mvn exec:java -Dexec.mainClass="com.example.App"'
      }
    }
  }
}
