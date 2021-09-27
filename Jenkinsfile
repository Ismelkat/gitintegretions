node {
	stage ('SCM checkout'){
		git "https://github.com/Ismelkat/gitintegretions"
		}
	stage ('Build'){
    	dir("target") {
	   sh "mvn clean install"
       }
       	dir("target") {
	   sh "java -jar com.my-app-1.jar"
       }
		}
		pipeline {
			agent { label 'jenkins-slave'}
			stages {
				stage('checkout'){
					steps {
						checkout([$class: 'GitSCM', branches: [[name: '*/main']], doGenerateSubmoduleConfigurations: false, extensions: [],	submoduleCfg: [], userRemoteConfigs: [[credentialsId: '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', url: 'https://github.com/Ismelkat/gitintegretions.git']]])
					}
    }
  }
}
}
