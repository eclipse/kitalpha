/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

This file describes the steps to be taken towards the configuration of a Jenkins build job for the viewpoint ComponentSample.

PREREQUISITES:

Make sure to have the following prerequisites:
- Jenkins build system installed either locally or on a remote server, you need to have administrative rights to be able to congfigure jobs.
- A target application installed in your local machine, e.g. Kitalpha.

JOB CONFIGURAITON:

1. Log on to Jenkins application
2. Create a new free-style Jenkins Job
3. In "Gestion de code source" section, select the type of repository where the viewpoints plugins are located
4. In "URL du repository" section, enter svn+ssh://ComponentSample/ComponentSample.git
5. In "Repertoire local du module" section, enter "svn/svn_viewpoint"
6. In "Build" section, click on "avanc�" button
7. In "Fichier du build", enter E:/git/kitalpha/kitalpha/architecture description/dsl/examples/plugins/org.polarsys.kitalpha.vp.componentsample.releng/releng-scripts/build_ComponentSample/releng/build.xml
8. Save the job and you are done.
