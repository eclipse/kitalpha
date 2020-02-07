pipeline {
  agent { label 'migration' }
  
  tools {
        maven 'apache-maven-latest'
        jdk 'oracle-jdk8-latest'
  }
  stages {
    stage('Package & test Kitalpha') {
      steps {
      	wrap([$class: 'Xvnc', takeScreenshot: false, useXauthority: true]) {
        	sh 'mvn  -Dmaven.test.failure.ignore=true -Dtycho.localArtifacts=ignore clean install  -e -f releng/plugins/org.polarsys.kitalpha.releng.parent/pom.xml'
        }
      }
    }
    stage('Deploy') {
      when {
         not { changeRequest() }
      }
      steps {
          sshagent ( ['projects-storage.eclipse.org-bot-ssh']) {
            sh '''
				echo "deploy update sites"
				DEST_DIR = /home/data/httpd/download.eclipse.org/kitalpha/updates/nightly/master
				ssh genie.kitalpha@projects-storage.eclipse.org rm -rf ${DEST_DIR}
				ssh genie.kitalpha@projects-storage.eclipse.org mkdir -p ${DEST_DIR}
				ssh genie.kitalpha@projects-storage.eclipse.org mkdir -p ${DEST_DIR}/component
				ssh genie.kitalpha@projects-storage.eclipse.org mkdir -p ${DEST_DIR}/runtime
				ssh genie.kitalpha@projects-storage.eclipse.org mkdir -p ${DEST_DIR}/runtimecore
				ssh genie.kitalpha@projects-storage.eclipse.org mkdir -p ${DEST_DIR}/sdk
				
				scp -r releng/plugins/org.polarsys.kitalpha.releng.samplecomponent.updatesite/target/repository/* genie.kitalpha@projects-storage.eclipse.org:${DEST_DIR}/component
				scp -r releng/plugins/org.polarsys.kitalpha.releng.runtime.updatesite/target/repository/* genie.kitalpha@projects-storage.eclipse.org:${DEST_DIR}/runtime
				scp -r releng/plugins/org.polarsys.kitalpha.releng.runtime.core.updatesite/target/repository/* genie.kitalpha@projects-storage.eclipse.org:${DEST_DIR}/runtimecore
				scp -r releng/plugins/org.polarsys.kitalpha.releng.sdk.updatesite/target/repository/* genie.kitalpha@projects-storage.eclipse.org:${DEST_DIR}/sdk
				
				echo "deploy product"
				DEST_DIR = /home/data/httpd/download.eclipse.org/kitalpha/products/nightly/master
				ssh genie.kitalpha@projects-storage.eclipse.org rm -rf ${DEST_DIR}
				ssh genie.kitalpha@projects-storage.eclipse.org mkdir -p ${DEST_DIR}
				scp -r releng/plugins/org.polarsys.kitalpha.releng.sdk.product/target/products/*.zip genie.kitalpha@projects-storage.eclipse.org:${DEST_DIR}
			  
            '''
        }
      }
    }
  }
  post {
    always {
	   archiveArtifacts artifacts: '**/*.log, **/*.layout, releng/plugins/org.polarsys.kitalpha.releng.samplecomponent.updatesite/target/repository/**, releng/plugins/org.polarsys.kitalpha.releng.runtime.core.updatesite/target/repository/**,releng/plugins/org.polarsys.kitalpha.releng.runtime.updatesite/target/repository/**,releng/plugins/org.polarsys.kitalpha.releng.sdk.updatesite/target/repository/**, releng/plugins/org.polarsys.kitalpha.releng.sdk.product/target/products/*.zip'
       junit '**/target/surefire-reports/*.xml'
    }
  }
  
}