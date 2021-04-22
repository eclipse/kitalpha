pipeline {
	agent { label 'migration-6gb' }

	tools {
		maven 'apache-maven-latest'
		jdk 'openjdk-jdk14-latest'
	}
	environment {
	    JACOCO_VERSION = "0.8.6"
	    MVN_QUALITY_PROFILES = '-P core -P test'
	    JACOCO_EXEC_FILE_PATH = '${WORKSPACE}/jacoco.exec'
	}
	stages {
		stage('Package & Test Kitalpha') {
			steps {
				wrap([$class: 'Xvnc', takeScreenshot: false, useXauthority: true]) {
					script {
						def jacocoPrepareAgent = "-Djacoco.destFile=$JACOCO_EXEC_FILE_PATH -Djacoco.append=true org.jacoco:jacoco-maven-plugin:$JACOCO_VERSION:prepare-agent"
						sh 'mvn  -Dmaven.test.failure.ignore=true -Dtycho.localArtifacts=ignore ${jacocoPrepareAgent} clean install -P core -P sign -P product -P test -e -f releng/plugins/org.polarsys.kitalpha.releng.parent/pom.xml'
					}
				}
			}
		}
		stage('Deploy') {
			steps {
				sshagent ( ['projects-storage.eclipse.org-bot-ssh']) {
					script {
						def VERSION = BRANCH_NAME
						if (VERSION.matches("v\\d\\.\\d\\.x")) {
							VERSION = VERSION.substring(1)
						}
	
						def DEST_UPDATESITE_DIR='/home/data/httpd/download.eclipse.org/kitalpha/updates/nightly'
						def DEST_PRODUCT_DIR='/home/data/httpd/download.eclipse.org/kitalpha/products/nightly/'+VERSION
	
						sh "echo 'deploy update sites'"
						sh "ssh genie.kitalpha@projects-storage.eclipse.org rm -rf ${DEST_UPDATESITE_DIR}/component/${VERSION}"
						sh "ssh genie.kitalpha@projects-storage.eclipse.org rm -rf ${DEST_UPDATESITE_DIR}/runtime/${VERSION}"
						sh "ssh genie.kitalpha@projects-storage.eclipse.org rm -rf ${DEST_UPDATESITE_DIR}/runtimecore/${VERSION}"
						sh "ssh genie.kitalpha@projects-storage.eclipse.org rm -rf ${DEST_UPDATESITE_DIR}/sdk/${VERSION}"
	
						sh "ssh genie.kitalpha@projects-storage.eclipse.org mkdir -p ${DEST_UPDATESITE_DIR}/component/${VERSION}"
						sh "ssh genie.kitalpha@projects-storage.eclipse.org mkdir -p ${DEST_UPDATESITE_DIR}/runtime/${VERSION}"
						sh "ssh genie.kitalpha@projects-storage.eclipse.org mkdir -p ${DEST_UPDATESITE_DIR}/runtimecore/${VERSION}"
						sh "ssh genie.kitalpha@projects-storage.eclipse.org mkdir -p ${DEST_UPDATESITE_DIR}/runtimecore/${VERSION}/targets/"
						sh "ssh genie.kitalpha@projects-storage.eclipse.org mkdir -p ${DEST_UPDATESITE_DIR}/sdk/${VERSION}"
	
						sh "scp -r releng/plugins/org.polarsys.kitalpha.releng.samplecomponent.updatesite/target/repository/* genie.kitalpha@projects-storage.eclipse.org:${DEST_UPDATESITE_DIR}/component/${VERSION}"
						sh "scp -r releng/plugins/org.polarsys.kitalpha.releng.runtime.updatesite/target/repository/* genie.kitalpha@projects-storage.eclipse.org:${DEST_UPDATESITE_DIR}/runtime/${VERSION}"
						sh "scp -r releng/plugins/org.polarsys.kitalpha.releng.runtime.core.updatesite/target/repository/* genie.kitalpha@projects-storage.eclipse.org:${DEST_UPDATESITE_DIR}/runtimecore/${VERSION}"
						sh "scp -r releng/plugins/org.polarsys.kitalpha.releng.targets/*.target* genie.kitalpha@projects-storage.eclipse.org:${DEST_UPDATESITE_DIR}/runtimecore/${VERSION}/targets"
						sh "scp -r releng/plugins/org.polarsys.kitalpha.releng.sdk.updatesite/target/repository/* genie.kitalpha@projects-storage.eclipse.org:${DEST_UPDATESITE_DIR}/sdk/${VERSION}"
	
						sh "echo 'deploy product'"
						sh "ssh genie.kitalpha@projects-storage.eclipse.org rm -rf ${DEST_PRODUCT_DIR}"
						sh "ssh genie.kitalpha@projects-storage.eclipse.org mkdir -p ${DEST_PRODUCT_DIR}"
						sh "scp -r releng/plugins/org.polarsys.kitalpha.releng.sdk.product/target/products/*.zip genie.kitalpha@projects-storage.eclipse.org:${DEST_PRODUCT_DIR}"
					}
				}
			}
		}
	}
	post {
		always {
			archiveArtifacts artifacts: '**/*.log, **/*.layout, releng/plugins/org.polarsys.kitalpha.releng.samplecomponent.updatesite/target/repository/**, releng/plugins/org.polarsys.kitalpha.releng.runtime.core.updatesite/target/repository/**,releng/plugins/org.polarsys.kitalpha.releng.runtime.updatesite/target/repository/**,releng/plugins/org.polarsys.kitalpha.releng.sdk.updatesite/target/repository/**, releng/plugins/org.polarsys.kitalpha.releng.sdk.product/target/products/*.zip, releng/plugins/org.polarsys.kitalpha.releng.targets'
			junit '**/target/surefire-reports/*.xml'
		}
	}
}