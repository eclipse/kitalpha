/*******************************************************************************
 * Copyright (c) 2021 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.sirius.rotativeimage.junit.tests.testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.junit.After;
import org.junit.Before;

/**
 * Abstract Rotative image plugin test
 * 
 * @author <a href="mailto:arnaud.dieumegard@obeo.fr">Arnaud Dieumegard</a>
 */
public class AbstractRotativeImageTest {
    
    protected static final String PLATFORM_PLUGIN_PATH = "platform:/plugin/";
    protected static final String ROTATIVEIMAGE_TEST_PLUGIN_NAME = "org.polarsys.kitalpha.sirius.rotativeimage.junit.tests";
    
	private ResourceSet resourceSet;

    private static final String CANNOT_BE_ADDEDRESOURCESET = " cannot be added to the ResourceSet";
	private static final String CANNOT_BE_LOADED  = " cannot be loaded";
	private static final String AIRD = "aird";
		
	private List<Resource> resources;
	private List<Session> sessions;
	
	@Before
	public void setup(){
		resourceSet = new ResourceSetImpl();
		resources = new ArrayList<>();
		sessions = new ArrayList<>();
		org.eclipse.swt.graphics.Resource.setNonDisposeHandler(null);
		for (URI uri : resourcesToLoad()) {
		    Resource resource = resourceSet.getResource(uri, true);
		    if (resource == null) {
		        throw new IllegalArgumentException(uri + CANNOT_BE_ADDEDRESOURCESET);
		    } else {
		        try {
                    resource.load(null);
                    if (uri.fileExtension().equals(AIRD)) {
                        Session session = SessionManager.INSTANCE.getSession(uri, new NullProgressMonitor());
                        getSessions().add(session);
                    }
                } catch (IOException e) {
                    throw new IllegalArgumentException(resource.toString() + CANNOT_BE_LOADED, e.getCause());
                }
		    }
        }
	}
    
    public List<URI> resourcesToLoad() {
        return new ArrayList<>();
    }


	@After
	public void tearDown(){
		for (Resource resource : resourceSet.getResources())
		{
			resource.unload();
		}
		resourceSet.getResources().clear();
		resourceSet = null;
		resources = null;
		
		for (Session session: getSessions()) {
		    if (session != null) {
		        session.close(new NullProgressMonitor());
		    }
        }
		sessions = null;
	}

    protected List<Resource> getResources() {
        return resources;
    }

    protected List<Session> getSessions() {
        return sessions;
    }

}
