/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.templates
 
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

class GenBuildDocumentation implements IGenerator {

	var String viewpointShortName = null
	var String repositoryUrl = null
	var String buildFilePath = null
	
	def setRepositoryURL(String url) {
		repositoryUrl = url
	}
	
	def setBuildFilePath(String path) {
		buildFilePath = path
	}
	
	def setViewpointShortName(String name) {
		viewpointShortName = name	
	}
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		fsa.generateFile("README.txt", generateContent())
	}
	
	def CharSequence generateContent() '''
/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

This file describes the steps to be taken towards the configuration of a Jenkins build job for the viewpoint «viewpointShortName».

PREREQUISITES:

Make sure to have the following prerequisites:
- Jenkins build system installed either locally or on a remote server, you need to have administrative rights to be able to congfigure jobs.
- A target application installed in your local machine, e.g. Kitalpha.

JOB CONFIGURAITON:

1. Log on to Jenkins application
2. Create a new free-style Jenkins Job
3. In "Gestion de code source" section, select the type of repository where the viewpoints plugins are located
4. In "URL du repository" section, enter «repositoryUrl»
5. In "Repertoire local du module" section, enter "svn/svn_viewpoint"
6. In "Build" section, click on "avancé" button
7. In "Fichier du build", enter «buildFilePath»
8. Save the job and you are done.
	'''	
}