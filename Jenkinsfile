pipeline {
	agent { label 'migration-6gb' }

	tools {
		maven 'apache-maven-latest'
		jdk 'openjdk-jdk17-latest'
	}
	environment {
		BUILD_KEY = (github.isPullRequest() ? CHANGE_TARGET : BRANCH_NAME).replaceFirst(/^v/, '')
	    JACOCO_VERSION = "0.8.6"
	    MVN_QUALITY_PROFILES = '-P core -P product -P test'
	    JACOCO_EXEC_FILE_PATH = '${WORKSPACE}/jacoco.exec'
	}
	stages {
		stage('Package & Test Kitalpha') {
			steps {
				wrap([$class: 'Xvnc', takeScreenshot: false, useXauthority: true]) {
					script {
						def jacocoPrepareAgent = "-Djacoco.destFile=$JACOCO_EXEC_FILE_PATH -Djacoco.append=true org.jacoco:jacoco-maven-plugin:$JACOCO_VERSION:prepare-agent"
						def sign = github.isPullRequest() ? '' : '-Psign'
						currentBuild.description = BUILD_KEY
						sh "mvn -Dmaven.test.failure.ignore=true -Dtycho.localArtifacts=ignore ${jacocoPrepareAgent} clean verify -P core ${sign} -P product -P test -e -f releng/plugins/org.polarsys.kitalpha.releng.parent/pom.xml"
					}
				}
			}
		}
		stage('Deploy') {
			when {
				anyOf {
					branch pattern : "v\\d\\.\\d\\.x", comparator: "REGEXP";
					branch pattern : "master.*", comparator: "REGEXP";
				}
			}
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
		stage('Publish tests results') {
			steps {
				junit allowEmptyResults: true, testResults: '*.xml,**/target/surefire-reports/*.xml'
				sh "mvn -Djacoco.dataFile=$JACOCO_EXEC_FILE_PATH org.jacoco:jacoco-maven-plugin:$JACOCO_VERSION:report $MVN_QUALITY_PROFILES -e -f releng/plugins/org.polarsys.kitalpha.releng.parent/pom.xml"
			}
		}
		stage('Perform Sonar analysis') {
			environment {
			    PROJECT_NAME = 'kitalpha'
	    		SONARCLOUD_TOKEN = credentials('sonar-token-kitalpha')
			    SONAR_PROJECT_KEY = 'eclipse_kitalpha'
			}
			steps {
				withEnv(['MAVEN_OPTS=-Xmx4g']) {
					script {
						def jacocoParameters = "-Dsonar.coverage.jacoco.xmlReportPaths='target/site/jacoco/jacoco.xml,target/surefire-reports/TEST*.xml' -Dsonar.java.coveragePlugin=jacoco -Dsonar.core.codeCoveragePlugin=jacoco "
						def sonarExclusions = "-Dsonar.exclusions='**/generated/**/*.java,**/src-gen/**/*.java' "
						def javaVersion = "8"
						def sonarCommon = "sonar:sonar -Dsonar.projectKey=$SONAR_PROJECT_KEY -Dsonar.organization=eclipse -Dsonar.host.url=https://sonarcloud.io -Dsonar.login='$SONARCLOUD_TOKEN' -Dsonar.skipDesign=true -Dsonar.dynamic=reuseReports -Dsonar.java.source=${javaVersion} -Dsonar.scanner.force-deprecated-java-version=true "
						def sonarBranchAnalysis = "-Dsonar.branch.name=${BRANCH_NAME}"
						def sonarPullRequestAnalysis = (github.isPullRequest() ? "-Dsonar.pullrequest.provider=GitHub -Dsonar.pullrequest.github.repository=eclipse/$PROJECT_NAME -Dsonar.pullrequest.key=${CHANGE_ID} -Dsonar.pullrequest.branch=${CHANGE_BRANCH}" : "" )
						def sonar = sonarCommon + jacocoParameters + sonarExclusions + (github.isPullRequest() ? sonarPullRequestAnalysis : sonarBranchAnalysis)
						sh "mvn ${sonar} $MVN_QUALITY_PROFILES -e -f releng/plugins/org.polarsys.kitalpha.releng.parent/pom.xml"
					}
				}
			}
		}
	}
	post {
		always {
			archiveArtifacts artifacts: '**/*.log, **/*.layout, releng/plugins/org.polarsys.kitalpha.releng.samplecomponent.updatesite/target/repository/**, releng/plugins/org.polarsys.kitalpha.releng.runtime.core.updatesite/target/repository/**,releng/plugins/org.polarsys.kitalpha.releng.runtime.updatesite/target/repository/**,releng/plugins/org.polarsys.kitalpha.releng.sdk.updatesite/target/repository/**, releng/plugins/org.polarsys.kitalpha.releng.sdk.product/target/products/*.zip, releng/plugins/org.polarsys.kitalpha.releng.targets'
		}
	}
}
