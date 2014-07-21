/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.composer.ui.launch.tabs.widgets.library;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import org.polarsys.kitalpha.composer.ui.launch.tabs.widgets.library.providers.LibraryItem;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.File;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.Type;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

public class ConflictValidator {
	Iterator<Object> iterator;

	boolean value = true;
	private Text description;
	private List<Resource> resources;
	private ResourceSet set;

	private static ConflictValidator instance;

	public static ConflictValidator getInstance() {
		if (null == instance) { // Premier appel
			instance = new ConflictValidator();
		}

		return instance;
	}

	private ConflictValidator() {
		set = new ResourceSetImpl();
	}

	public Text getWidget(Composite container) {

		GridData gd = new GridData();
		gd.horizontalAlignment = GridData.FILL;
		gd.grabExcessHorizontalSpace = true;
		gd.grabExcessVerticalSpace = true;
		Group group = new Group(container, SWT.NONE);
		group.setText("Selection validation");
		group.setLayout(new GridLayout(1, true));
		group.setLayoutData(gd);

		description = new Text(group, SWT.MULTI | SWT.READ_ONLY | SWT.WRAP
				| SWT.V_SCROLL);
		description.setEditable(false);

		gd = new GridData(GridData.HORIZONTAL_ALIGN_FILL
				| GridData.VERTICAL_ALIGN_FILL);
		gd.grabExcessVerticalSpace = true;
		gd.grabExcessHorizontalSpace = true;
		gd.horizontalSpan = 1;
		gd.minimumHeight = 100;

		description.setLayoutData(gd);
		return description;
	}

	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
		loadResources(resources, true);
	}

	private boolean internalConflict(Object e1, Object e2) {
		boolean result = false;

		if (e1 instanceof LibraryItem && e2 instanceof LibraryItem) {

			LibraryItem i1 = (LibraryItem) e1;
			Resource r1 = i1.getItem();
			ResourceSet set1 = new ResourceSetImpl();
			loadResource(r1, set1);
			EcoreUtil.resolveAll(set1);

			LibraryItem i2 = (LibraryItem) e2;
			Resource r2 = i2.getItem();
			ResourceSet set2 = new ResourceSetImpl();
			loadResource(r2, set2);
			EcoreUtil.resolveAll(set2);
			result = simpleResourceComparison(set1, set2);

			set1.getResources().clear();
			set2.getResources().clear();
		}

		return result;
	}

	private boolean simpleResourceComparison(ResourceSet set1, ResourceSet set2) {
		boolean result = false;
		if (!set1.getResources().isEmpty()) {

			for (org.eclipse.emf.ecore.resource.Resource r0 : set1
					.getResources()) {
				for (org.eclipse.emf.ecore.resource.Resource r1 : set2
						.getResources()) {
					URI uri0 = r0.getURI();
					URI uri1 = r1.getURI();
					result = result || uri0.equals(uri1);
				}
			}
		} else {
			result = false;
		}

		return result;
	}

	public void isConflictReverse(LibraryItem item, List<LibraryItem> items) {
		
		for (LibraryItem i : items) {
			if (!(i.equals(item))) {
			
			if(i.isConflictWith(item.getItem())){
				i.removeWith(item.getItem());
			}
				}
			}
	}

	public void isConflict(List<LibraryItem> items, LibraryItem item) {
		for (LibraryItem i : items) {
			if (!(i.equals(item))) {
				boolean value = false;
			
					value = internalConflict(i, item);
					
					if (value) {
						searchConflictElements(i, item);
					}
			}
		}
		
		if (item.isValid())
			item.clearErrorsMsg();
	}

	private void searchConflictElements(LibraryItem item1, LibraryItem item2) {

		ResourceSet set = new ResourceSetImpl();

		Resource reuse1 = item1.getItem();
		Resource reuse2 = item2.getItem();

		org.eclipse.emf.ecore.resource.Resource res1 = loadResource(reuse1, set);
		org.eclipse.emf.ecore.resource.Resource res2 = loadResource(reuse2, set);
		TreeIterator<EObject> it1 = res1.getAllContents();
		while (it1.hasNext()) {

			EObject eObj1 = it1.next();
			if (eObj1 instanceof Type) {
				EObject ref1 = ((Type) eObj1).getReferencedElement();

				TreeIterator<EObject> it2 = res2.getAllContents();
				while (it2.hasNext()) {
					EObject eObj2 = it2.next();
					if (eObj2 instanceof Type) {
						EObject ref2 = ((Type) eObj2).getReferencedElement();
						if (ref2.equals(ref1))
							item2
									.addErrorsMsg(reuse1,"Library :"
											+ reuse2.getName()
											+ "=> The file "
											+ (((File) eObj2.eContainer())
													.getName())
											+ " reference the same element(s) than the file "
											+ (((File) eObj1.eContainer())
													.getName())
											+ " in the library "
											+ reuse1.getName());
					}
				}
			}
		}

		set.getResources().clear();

	}

	private List<org.eclipse.emf.ecore.resource.Resource> loadResources(
			List<Resource> resources_p, boolean clear) {
		if (clear)
			set.getResources().clear();

		for (Resource res : resources_p) {
			loadResource(res, set);

		}

		return set.getResources();
	}

	private org.eclipse.emf.ecore.resource.Resource loadResource(
			Object resource_p, ResourceSet tempory) {
		org.eclipse.emf.ecore.resource.Resource res = null;
		if (resource_p instanceof Resource) {
			Resource resource = (Resource) resource_p;
			final String path = resource.getPath();
			if (path != null) {
				IResource wr = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(path));
				URI uri = null;
				if(wr!= null){
					uri = URI.createPlatformResourceURI(path, false);
				}else{
					uri = URI.createPlatformPluginURI(path, false);
				}
				res = tempory.getResource(uri, true);
				
			}

		}
		return res;
	}
}
