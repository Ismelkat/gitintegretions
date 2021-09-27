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
}
