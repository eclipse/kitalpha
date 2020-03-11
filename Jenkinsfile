pipeline {
  agent {
    kubernetes {
      label 'migration-custom'
      defaultContainer 'migration'
      yaml """
apiVersion: "v1"
kind: "Pod"
spec:
  containers:
  - name: "migration"
    image: "eclipsecbijenkins/migration-fat-agent:3.29"
    tty: true
    command:
    - cat
    env:
    - name: "MAVEN_OPTS"
      value: "-Duser.home=/home/jenkins"
    resources:
      limits:
        memory: "6144Mi"
        cpu: "2000m"
      requests:
        memory: "6144Mi"
        cpu: "1000m"
    volumeMounts:
    - name: "settings-xml"
      mountPath: "/home/jenkins/.m2/settings.xml"
      subPath: "settings.xml"
      readOnly: true
    - name: "settings-security-xml"
      mountPath: "/home/jenkins/.m2/settings-security.xml"
      subPath: "settings-security.xml"
      readOnly: true
    - name: "toolchains-xml"
      mountPath: "/home/jenkins/.m2/toolchains.xml"
      subPath: "toolchains.xml"
      readOnly: true
    - name: "m2-repo"
      mountPath: "/home/jenkins/.m2/repository"
      readOnly: false
    - name: "tools"
      mountPath: "/opt/tools"
      readOnly: false
    - name: "volume-known-hosts"
      mountPath: "/home/jenkins/.ssh"
      readOnly: false
  volumes:
  - name: "settings-xml"
    secret:
      items:
      - key: "settings.xml"
        path: "settings.xml"
      secretName: "m2-secret-dir"
  - name: "settings-security-xml"
    secret:
      items:
      - key: "settings-security.xml"
        path: "settings-security.xml"
      secretName: "m2-secret-dir"
  - name: "toolchains-xml"
    configMap:
      items:
      - key: "toolchains.xml"
        path: "toolchains.xml"
      name: "m2-dir"
  - name: "m2-repo"
    emptyDir:
      medium: ""
  - name: "tools"
    persistentVolumeClaim:
      claimName: "tools-claim-jiro-kitalpha"
      readOnly: true
  - name: "volume-known-hosts"
    configMap:
      name: "known-hosts"
"""
    }
}  
  
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
  post {
    always {
	   archiveArtifacts artifacts: '**/*.log, **/*.layout, releng/plugins/org.polarsys.kitalpha.releng.samplecomponent.updatesite/target/repository/**, releng/plugins/org.polarsys.kitalpha.releng.runtime.core.updatesite/target/repository/**,releng/plugins/org.polarsys.kitalpha.releng.runtime.updatesite/target/repository/**,releng/plugins/org.polarsys.kitalpha.releng.sdk.updatesite/target/repository/**, releng/plugins/org.polarsys.kitalpha.releng.sdk.product/target/products/*.zip'
       junit '**/target/surefire-reports/*.xml'
    }
  }
  
}