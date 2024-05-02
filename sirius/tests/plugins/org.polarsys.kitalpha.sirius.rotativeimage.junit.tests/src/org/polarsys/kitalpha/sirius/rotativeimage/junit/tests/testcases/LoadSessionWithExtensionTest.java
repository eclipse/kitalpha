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

import java.util.Collection;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.tests.support.api.SiriusDiagramTestCase;
import org.eclipse.sirius.tests.support.api.TestsUtil;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.swt.graphics.Resource;
import org.junit.Assert;

/**
 * Checks the loading of the RotativeImage extension point
 * 
 * @author <a href="mailto:arnaud.dieumegard@obeo.fr">Arnaud Dieumegard</a>
 */
public class LoadSessionWithExtensionTest extends SiriusDiagramTestCase {

    protected static final String PLATFORM_PLUGIN_PATH = "platform:/plugin/";
    protected static final String ROTATIVEIMAGE_TEST_PLUGIN_NAME = "/org.polarsys.kitalpha.sirius.rotativeimage.junit.tests";
    
    private static final String TEST_XMI_PATH = ROTATIVEIMAGE_TEST_PLUGIN_NAME + "/models/Test1.xmi";
    private static final String TEST_AIRD_PATH = ROTATIVEIMAGE_TEST_PLUGIN_NAME + "/models/Test1.aird";
    private static final String TEST_ODESIGN_PATH = ROTATIVEIMAGE_TEST_PLUGIN_NAME + "/description/test.odesign";

    private static final String ID_REPRESENTATION_DESCRIPTOR = "_idds4E1NEeySgagIY4HK9g";
    private static final String ID_REPRESENTATION_DESCRIPTOR_PNG = "_h9U1ME4GEeyTxN2ah5Tp3g";
    private static final String ID_REPRESENTATION_DESCRIPTOR_FAULTY_ROTATIVE_PNG = "_4gkTAE6SEeyXs6TJVt2feA";
    private static final String ID_REPRESENTATION_DESCRIPTOR_FAULTY_ROTATIVE_SVG = "_BTwm8E6TEeyXs6TJVt2feA";

    private static final String[] ALL_REPRESENTATION_ID = {ID_REPRESENTATION_DESCRIPTOR, ID_REPRESENTATION_DESCRIPTOR_PNG, ID_REPRESENTATION_DESCRIPTOR_FAULTY_ROTATIVE_PNG, ID_REPRESENTATION_DESCRIPTOR_FAULTY_ROTATIVE_SVG};
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        Resource.setNonDisposeHandler(null);
        genericSetUp(TEST_XMI_PATH, TEST_ODESIGN_PATH, TEST_AIRD_PATH);
    }

    /**
     * Open selected diagrams in session.
     */
    public void testDiagramsOpening() {
    	for (String repId : ALL_REPRESENTATION_ID) {
	        DRepresentationDescriptor desc = getRepresentationDescriptor(session, repId);
	        assertNotNull(desc);
	
	        DDiagram ddiagram = (DDiagram) desc.getRepresentation();
	        assertNotNull(ddiagram);
	        
	        DialectEditor editor = (DialectEditor) DialectUIManager.INSTANCE.openEditor(session, ddiagram, new NullProgressMonitor());
	        TestsUtil.synchronizationWithUIThread();
	        DialectUIManager.INSTANCE.refreshEditor(editor, new NullProgressMonitor());
	        TestsUtil.synchronizationWithUIThread();
	        DialectUIManager.INSTANCE.closeEditor(editor, false);
	        TestsUtil.synchronizationWithUIThread();
    	}
    }

    public DRepresentationDescriptor getRepresentationDescriptor(Session session, String id) {
        Collection<DRepresentationDescriptor> representationDescriptors = DialectManager.INSTANCE.getAllRepresentationDescriptors(session);
        for (DRepresentationDescriptor representationDescriptor : representationDescriptors) {

            String descriptorFragment;
            try {
                descriptorFragment = representationDescriptor.getRepPath().getResourceURI().fragment();
            } catch (NullPointerException e) {
                descriptorFragment = "";
            }

            String descriptorUid = representationDescriptor.getUid();

            if (id.equals(descriptorFragment) || id.equals(descriptorUid)) {
                return representationDescriptor;
            }
        }
        return null;
    }

    @Override
    protected void tearDown() throws Exception {
        doCleanup();
        super.tearDown();
    }

    private void doCleanup() {
        final IEditingSession sessionUI = SessionUIManager.INSTANCE.getUISession(session);
        if (sessionUI != null) {
            SessionUIManager.INSTANCE.remove(sessionUI);
            sessionUI.close();
            TestsUtil.emptyEventsFromUIThread();
        }
        if (session != null) {
            doRemoveSession();
            doCloseSession();
            session = null;
        }
        viewpoints.clear();
    }

    private void doCloseSession() {
        session.close(new NullProgressMonitor());
        Assert.assertFalse("Can't close the session", session.isOpen());
    }

    private void doRemoveSession() {
        SessionManager.INSTANCE.remove(session);
        for (final Session session2 : SessionManager.INSTANCE.getSessions()) {
            Assert.assertFalse("Remove failed", session2.equals(session));
        }
    }

}
