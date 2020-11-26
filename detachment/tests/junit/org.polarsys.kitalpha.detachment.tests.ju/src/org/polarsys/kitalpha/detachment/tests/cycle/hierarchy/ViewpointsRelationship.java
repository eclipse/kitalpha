/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.detachment.tests.cycle.hierarchy;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.IViewpointTreeDescription;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.ViewpointTreeDescription;

/**
 * 
 * @author Faycal ABKA
 *
 */
public class ViewpointsRelationship {
	
	private static final String VP1_NAME = "zombie";
	private static final String VP1_ID = "zombie.id";
	private static final String VP1_PATH_FRAGMENT = "/zombie/path.vp#_zombie";
	
	private static final String VP2_NAME = "vampire";
	private static final String VP2_ID = "vampire.id";
	private static final String VP2_PATH_FRAGMENT = "/vampire/path.vp#_vampire";
	
	private static final String VP3_NAME = "root";
	private static final String VP3_ID = "root.id";
	private static final String VP3_PATH_FRAGMENT = "/root/path.vp#/";
	
	private static final String VP_ARG_NULL = null;
	
	private static final String ROOT_NSURI = "http://root";
	private static final String ZOMBIE_NSURI = "http://zombie";
	private static final String VAMPIRE_NSURI = "http://vampire";
	private static final String NONE_NSURI = "http://none";
	
	private IViewpointTreeDescription zombie;
	private IViewpointTreeDescription vampire;
	private IViewpointTreeDescription none;
	private IViewpointTreeDescription root;
	
	
	@Before
	public void init(){
		this.zombie = new ViewpointTreeDescription(VP1_NAME, VP1_ID, VP1_PATH_FRAGMENT);
		this.vampire = new ViewpointTreeDescription(VP2_NAME, VP2_ID, VP2_PATH_FRAGMENT);
		this.none = new ViewpointTreeDescription(VP_ARG_NULL, VP_ARG_NULL, VP_ARG_NULL);
		this.root = new ViewpointTreeDescription(VP3_NAME, VP3_ID, VP3_PATH_FRAGMENT);
		
		
		root.addViewpointNsUri(ROOT_NSURI);
		zombie.addViewpointNsUri(ZOMBIE_NSURI);
		vampire.addViewpointNsUri(VAMPIRE_NSURI);
		none.addViewpointNsUri(NONE_NSURI);
		
		root.addChild(vampire);
		vampire.addParent(root);
		root.addChild(zombie);
		zombie.addParent(root);
		root.addChild(none);
		none.addParent(root);
		
		zombie.addDependency(vampire);
		
		root.setAsCandidateToKeep(true);
		root.updateCandidates(true);
		
	}

	@Test
	public void testViewpointTreeDescription() {
		//test init
		Assert.assertEquals("Name initialization failed for Zombie", VP1_NAME, zombie.getViewpointName());
		Assert.assertEquals("Name initialization failed for Vampire", VP2_NAME, vampire.getViewpointName());
		Assert.assertEquals("Name initialization failed for root", VP3_NAME, root.getViewpointName());
		
		Assert.assertEquals("ID initialization failed for Zombie", VP1_ID, zombie.getViewpointId());
		Assert.assertEquals("ID initialization failed for Vampire", VP2_ID, vampire.getViewpointId());
		Assert.assertEquals("ID initialization failed for root", VP3_ID, root.getViewpointId());
		
		Assert.assertEquals("Path initialization failed for Zombie", VP1_PATH_FRAGMENT, zombie.getRootEObject());
		Assert.assertEquals("Path initialization failed for Vampire", VP2_PATH_FRAGMENT, vampire.getRootEObject());
		Assert.assertEquals("Path initialization failed for root", VP3_PATH_FRAGMENT, root.getRootEObject());
		
		Assert.assertNull(none.getViewpointName());
		Assert.assertNull(none.getViewpointId());
		Assert.assertNull(none.getRootEObject());
	}

	@Test
	public void testGetViewpointName() {
		Assert.assertEquals("Getting Name failed for Zombie", VP1_NAME, zombie.getViewpointName());
		Assert.assertEquals("Getting Name failed for Vampire", VP2_NAME, vampire.getViewpointName());
		Assert.assertEquals("Getting Name failed for root", VP3_NAME, root.getViewpointName());
	}

	@Test
	public void testGetViewpointId() {
		Assert.assertEquals("Getting ID failed for Zombie", VP1_ID, zombie.getViewpointId());
		Assert.assertEquals("Getting ID failed for Vampire", VP2_ID, vampire.getViewpointId());
		Assert.assertEquals("Getting ID failed for root", VP3_ID, root.getViewpointId());
	}

	@Test
	public void testGetChildren() {
		Collection<IViewpointTreeDescription> zombieChildren = zombie.getChildren();
		Assert.assertEquals("Zombie cannot have children", 0, zombieChildren.size());
		
		Collection<IViewpointTreeDescription> vampireChildren = vampire.getChildren();
		Assert.assertEquals("Vampire cannot have children", 0, vampireChildren.size());
		
		Collection<IViewpointTreeDescription> noneChildren = none.getChildren();
		Assert.assertEquals("None cannot have children", 0, noneChildren.size());
		
		Collection<IViewpointTreeDescription> rootChildren = root.getChildren();
		Assert.assertEquals("Root must have children", 3, rootChildren.size());
		Assert.assertFalse(rootChildren.contains(root));
	}

	@Test
	public void testGetDependencies(){
		Collection<IViewpointTreeDescription> zombieDependencies = zombie.getDependencies();
		Assert.assertEquals(1, zombieDependencies.size());
		Collection<IViewpointTreeDescription> vampireDependencies = vampire.getDependencies();
		Assert.assertEquals(0, vampireDependencies.size());
	}

	@Test
	public void testGetRootEObject() {
		Assert.assertEquals("Path initialization failed for Zombie", VP1_PATH_FRAGMENT, zombie.getRootEObject());
		Assert.assertEquals("Path initialization failed for Vampire", VP2_PATH_FRAGMENT, vampire.getRootEObject());
		Assert.assertEquals("Path initialization failed for root", VP3_PATH_FRAGMENT, root.getRootEObject());
	}

	@Test
	public void testAddChild() {
		IViewpointTreeDescription v = new ViewpointTreeDescription("V", "V.ID", "/V/path/V.vp#V");
		Collection<IViewpointTreeDescription> rootChildren = root.getChildren();
		Assert.assertEquals("Root must have children", 3, rootChildren.size());
		Assert.assertFalse(rootChildren.contains(root));
		root.addChild(v);
		Assert.assertEquals("Root Children are 4", 4, rootChildren.size());
		Assert.assertFalse(rootChildren.contains(root));
		root.addChild(v);
		Assert.assertEquals("Root Children are 4", 4, rootChildren.size());
		Assert.assertFalse(rootChildren.contains(root));
		root.addChild(root);
		Assert.assertEquals("Root Children are 4", 4, rootChildren.size());
		Assert.assertFalse(rootChildren.contains(root));
	}

	@Test
	public void testAddDependency() {
		Collection<IViewpointTreeDescription> noneDependencies = none.getDependencies();
		Assert.assertEquals(0, noneDependencies.size());
		none.addDependency(root);
		Assert.assertEquals(1, noneDependencies.size());
	}

	@Test
	public void testHasChildren() {
		Assert.assertFalse(zombie.hasChildren());
		Assert.assertFalse(vampire.hasChildren());
		Assert.assertFalse(none.hasChildren());
		Assert.assertTrue(root.hasChildren());
	}

	@Test
	public void testHasDependencies() {
		assertFalse(root.hasDependencies());
		assertTrue(zombie.hasDependencies());
	}

	@Test
	public void testGetParents() {
		Collection<IViewpointTreeDescription> zombieParents = zombie.getParents();
		Assert.assertEquals("Zombie must come from root", 1, zombieParents.size());
		
		Collection<IViewpointTreeDescription> vampireParents = vampire.getParents();
		Assert.assertEquals("Vampire must come from root", 1, vampireParents.size());
		
		Collection<IViewpointTreeDescription> noneParents = none.getParents();
		Assert.assertEquals("None must come from root", 1, noneParents.size());
		
		Collection<IViewpointTreeDescription> rootParent = root.getParents();
		Assert.assertEquals("Root have no parents", 0, rootParent.size());
		Assert.assertFalse(rootParent.contains(root));
	}

	@Test
	public void testAddParent() {
		assertEquals(0, root.getParents().size());
		root.addParent(root);
		assertEquals(0, root.getParents().size());
		assertEquals(1, zombie.getParents().size());
		zombie.addParent(vampire);
		assertEquals(2, zombie.getParents().size());
	}

	@Test
	public void testHasParents() {
		Assert.assertTrue(zombie.hasParents());
		Assert.assertTrue(vampire.hasParents());
		Assert.assertTrue(none.hasParents());
		Assert.assertFalse(root.hasParents());
	}

	@Test
	public void testIsCandidateToKeep() {
		Assert.assertTrue(root.isCandidateToKeep());
		Assert.assertTrue(zombie.isCandidateToKeep());
		Assert.assertTrue(vampire.isCandidateToKeep());
		Assert.assertTrue(none.isCandidateToKeep());
	}

	@Test
	public void testSetAsCandidateToKeep() {
		testIsCandidateToKeep();
		root.setAsCandidateToKeep(false);
		Assert.assertFalse(root.isCandidateToKeep());
		root.updateCandidates(false);
		Assert.assertFalse(root.isCandidateToKeep());
		Assert.assertFalse(zombie.isCandidateToKeep());
		Assert.assertFalse(vampire.isCandidateToKeep());
		Assert.assertFalse(none.isCandidateToKeep());
	}

	@Test
	public void testGetViewpointNsUri() {
		Assert.assertTrue(root.getViewpointNsUri().contains(ROOT_NSURI));
		Assert.assertTrue(vampire.getViewpointNsUri().contains(VAMPIRE_NSURI));
		Assert.assertTrue(zombie.getViewpointNsUri().contains(ZOMBIE_NSURI));
		Assert.assertTrue(none.getViewpointNsUri().contains(NONE_NSURI));
	}

	@Test
	public void testAddViewpointNsUri() {
		final String newRootNSURI = "http://root/1.0.x";
		Assert.assertFalse(root.getViewpointNsUri().contains(newRootNSURI));
		root.addViewpointNsUri(newRootNSURI);
		Assert.assertTrue(root.getViewpointNsUri().contains(newRootNSURI));
	}

	@Test
	public void testAddAllViewpointNsUri() {
		Collection<String> nsUris = new HashSet<>();
		nsUris.add("A");
		nsUris.add("B");
		Assert.assertFalse(root.getViewpointNsUri().contains("A"));
		Assert.assertFalse(root.getViewpointNsUri().contains("B"));
		root.addAllViewpointNsUri(nsUris);
		Assert.assertTrue(root.getViewpointNsUri().contains("A"));
		Assert.assertTrue(root.getViewpointNsUri().contains("B"));
	}

	@Test
	public void testGetUsedViewpoints(){
		Collection<IViewpointTreeDescription> usedViewpoints = root.getUsedViewpoints();
		Assert.assertEquals(0, usedViewpoints.size());
		root.addUsedViewpoint(none);
		Assert.assertEquals(1, usedViewpoints.size());
		root.addUsedViewpoint(vampire);
		Assert.assertEquals(2, usedViewpoints.size());
		root.addUsedViewpoint(zombie);
		Assert.assertEquals(3, usedViewpoints.size());
	}

	@Test
	public void testAddUsedViewpoint() {
		testGetUsedViewpoints();
	}


	@Test
	public void testUpdateCandidates() {
		testSetAsCandidateToKeep();
	}

}
