podTemplate(
  label: "migration-custom",
  cloud: "kubernetes", 
  inheritFrom: "migration-agent",
  containers: [
    containerTemplate(
        name: "jnlp", 
        image: "eclipsecbijenkins/migration-fat-agent:3.29", 
        resourceRequestMemory: "6144Mi", 
        resourceLimitMemory: "6144Mi"
    )
  ]) {
    node("migration-custom") {
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
				DEST_DIR=/home/data/httpd/download.eclipse.org/kitalpha/updates/nightly
				VERSION=1.4.x
				ssh genie.kitalpha@projects-storage.eclipse.org rm -rf ${DEST_DIR}
				ssh genie.kitalpha@projects-storage.eclipse.org rm -rf ${DEST_DIR}/component/${VERSION}
				ssh genie.kitalpha@projects-storage.eclipse.org rm -rf ${DEST_DIR}/runtime/${VERSION}
				ssh genie.kitalpha@projects-storage.eclipse.org rm -rf ${DEST_DIR}/runtimecore/${VERSION}
				ssh genie.kitalpha@projects-storage.eclipse.org rm -rf ${DEST_DIR}/sdk/${VERSION}
				
				ssh genie.kitalpha@projects-storage.eclipse.org mkdir -p ${DEST_DIR}/component/${VERSION}
				ssh genie.kitalpha@projects-storage.eclipse.org mkdir -p ${DEST_DIR}/runtime/${VERSION}
				ssh genie.kitalpha@projects-storage.eclipse.org mkdir -p ${DEST_DIR}/runtimecore/${VERSION}
				ssh genie.kitalpha@projects-storage.eclipse.org mkdir -p ${DEST_DIR}/sdk/${VERSION}
				
				scp -r releng/plugins/org.polarsys.kitalpha.releng.samplecomponent.updatesite/target/repository/* genie.kitalpha@projects-storage.eclipse.org:${DEST_DIR}/component/${VERSION}
				scp -r releng/plugins/org.polarsys.kitalpha.releng.runtime.updatesite/target/repository/* genie.kitalpha@projects-storage.eclipse.org:${DEST_DIR}/runtime/${VERSION}
				scp -r releng/plugins/org.polarsys.kitalpha.releng.runtime.core.updatesite/target/repository/* genie.kitalpha@projects-storage.eclipse.org:${DEST_DIR}/runtimecore/${VERSION}
				scp -r releng/plugins/org.polarsys.kitalpha.releng.sdk.updatesite/target/repository/* genie.kitalpha@projects-storage.eclipse.org:${DEST_DIR}/sdk/${VERSION}
				
				echo "deploy product"
				DEST_DIR=/home/data/httpd/download.eclipse.org/kitalpha/products/nightly/${VERSION}
				ssh genie.kitalpha@projects-storage.eclipse.org rm -rf ${DEST_DIR}
				ssh genie.kitalpha@projects-storage.eclipse.org mkdir -p ${DEST_DIR}
				scp -r releng/plugins/org.polarsys.kitalpha.releng.sdk.product/target/products/*.zip genie.kitalpha@projects-storage.eclipse.org:${DEST_DIR}
			  
            '''
        }
      }
    }
  }
}