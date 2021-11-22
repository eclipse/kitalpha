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
package org.polarsys.kitalpha.common.sirius.extension.rotativeimage.junit.tests.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Map;

import org.junit.Test;
import org.polarsys.kitalpha.common.sirius.extension.rotativeimage.extension.RotativeDescription;

/**
 * Checks the loading of the RotativeImage extension point
 * 
 * @author <a href="mailto:arnaud.dieumegard@obeo.fr">Arnaud Dieumegard</a>
 */
public class ExtensionPointTest extends AbstractRotativeImageTest {
    
    private static final String ROTATIVE_IMAGE_PATH = "/org.polarsys.kitalpha.common.sirius.extension.rotativeimage.junit.tests/icons/rotationIcon.svg";
    private static final String FOURIMAGES_IMAGE_PATH = "/org.polarsys.kitalpha.common.sirius.extension.rotativeimage.junit.tests/icons/4imagesIcon.svg";
    

	/**
	 * Test Rotative Image extension loading
	 */
    @Test
	public void checkExtensionContribution() {
	    Map<String, RotativeDescription> descriptions = org.polarsys.kitalpha.common.sirius.extension.rotativeimage.Activator.getDefault().getDescriptions();
	    assertNotNull(descriptions);
        assertNotNull(descriptions.get(ROTATIVE_IMAGE_PATH));
	    assertEquals(RotativeDescription.ROTATIVE, descriptions.get(ROTATIVE_IMAGE_PATH).mode);
	    assertNotNull(descriptions.get(FOURIMAGES_IMAGE_PATH));
	    assertEquals(RotativeDescription.FOUR_IMAGES, descriptions.get(FOURIMAGES_IMAGE_PATH).mode);
	}

    /**
     * Test Rotative Image BestDescription - Nominal case
     */
    @Test
    public void checkBestDescription() {
        RotativeDescription description = org.polarsys.kitalpha.common.sirius.extension.rotativeimage.Activator.getDefault().getBestDescription(ROTATIVE_IMAGE_PATH);
        assertNotNull(description);
        
        assertEquals(ROTATIVE_IMAGE_PATH, description.id);
        assertEquals(RotativeDescription.ROTATIVE, description.mode);
    }

    /**
     * Test Rotative Image BestDescription - Wrong parameter cases: empty name, null name
     */
    @Test
    public void checkBestDescriptionNoMatch() {
        RotativeDescription description = org.polarsys.kitalpha.common.sirius.extension.rotativeimage.Activator.getDefault().getBestDescription("");
        assertNull(description);

        description = org.polarsys.kitalpha.common.sirius.extension.rotativeimage.Activator.getDefault().getBestDescription(null);
        assertNull(description);
    }

}
