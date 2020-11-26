/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.composer.examples.basic.ecore.gen.generator.launcher;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;

import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.api.ParameterError;
import org.polarsys.kitalpha.composer.extension.points.IGenerator;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.Root;
import org.polarsys.kitalpha.composer.examples.basic.ecore.gen.generator.GenFile;

public class AcceleoEcoreLauncher implements IGenerator {

    public void generateCode(Root allocRoot_p, final Map<String, Parameter> generatorParams_p, IPath target_f) {
    	try {
    		IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder(target_f);
			GenFile genFile = new GenFile(allocRoot_p, folder.getLocation().toFile(), Collections.EMPTY_LIST);
			genFile.doGenerate(new BasicMonitor());
			folder.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public Map<String, Parameter> getParameters() {
        // TODO Auto-generated method stub
        return null;
    }

    public Map<String, ParameterError> validateParameters(Map<String, Parameter> valuedParameters_p) {
        // TODO Auto-generated method stub
        return null;
    }

}
