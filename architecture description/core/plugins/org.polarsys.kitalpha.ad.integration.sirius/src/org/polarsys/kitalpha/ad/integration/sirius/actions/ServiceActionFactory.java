/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.integration.sirius.actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.menus.ExtensionContributionFactory;
import org.eclipse.ui.menus.IContributionRoot;
import org.eclipse.ui.services.IServiceLocator;
import org.polarsys.kitalpha.ad.common.utils.URIFix;
import org.polarsys.kitalpha.ad.common.utils.URIHelper;
import org.polarsys.kitalpha.ad.integration.sirius.Activator;
import org.polarsys.kitalpha.ad.integration.sirius.providers.SiriusSelectionProvider;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.edit.provider.ServiceItemProvider;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.edit.provider.ViewpointItemProvider;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.edit.provider.ViewpointItemProviderAdapterFactory;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ModelManager;
import org.polarsys.kitalpha.ad.viewpoint.integration.services.Implementations;
import org.polarsys.kitalpha.ad.viewpoint.integration.services.ServiceImplementation;
import org.polarsys.kitalpha.ad.viewpoint.integration.services.ServiceRunner;
import org.polarsys.kitalpha.ad.viewpoint.ui.provider.AFSelectionProvider;
import org.polarsys.kitalpha.ad.viewpoint.utils.ModelAccessor;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

/**
 * @author Thomas Guiu
 * 
 */
public class ServiceActionFactory extends ExtensionContributionFactory {
	private final AFSelectionProvider selectionProvider = new SiriusSelectionProvider();

	public ServiceActionFactory() {
	}

	@Override
	public void createContributionItems(IServiceLocator serviceLocator, IContributionRoot additions) {
		List<Object> selection = selectionProvider.getSelection();
		if (selection.isEmpty() || !(selection.get(0) instanceof EObject))
			return;
		EObject selectedObj = (EObject)selection.get(0);
		MenuManager menu = new MenuManager("Viewpoint Services");
		try {
			fillMenu(menu, selectedObj);
		} catch (Exception e) {
			Activator.getDefault().logError(e);
		}
		additions.addContributionItem(menu, null);
	}

	private void fillMenu(IMenuManager dynamicMenu, EObject selectedObj) {

		Map<Viewpoint, ModelManager> vp2mgr = new LinkedHashMap<Viewpoint, ModelManager>();
		Map<Viewpoint, List<ViewpointElement>> vp2elt = new HashMap<Viewpoint, List<ViewpointElement>>();

		computeActiveServices(vp2mgr, vp2elt, selectedObj);

		ViewpointItemProviderAdapterFactory adapterFactory = new ViewpointItemProviderAdapterFactory();
		ViewpointItemProvider provider = (ViewpointItemProvider) adapterFactory.createViewpointAdapter();
		Object url = provider.getImage((Object) null);

		ImageDescriptor vpImage = ExtendedImageRegistry.getInstance().getImageDescriptor(url);
		url = ((ServiceItemProvider) adapterFactory.createServiceAdapter()).getImage((Object) null);
		ImageDescriptor actionImage = ExtendedImageRegistry.getInstance().getImageDescriptor(url);

		for (Viewpoint vp : vp2mgr.keySet()) {
			ModelManager vpMgr = vp2mgr.get(vp);
			if (!vp2elt.containsKey(vp)) {
				continue;
			}
			MenuManager mi = new MenuManager(vp.getName());
			mi.setImageDescriptor(vpImage);
			dynamicMenu.add(mi);

			for (ViewpointElement elt : vp2elt.get(vp)) {
				Action action = new ServiceAction(vpMgr, (Service) elt, selectionProvider);
				action.setText(elt.getName() == null ? "no name" : elt.getName());
				action.setImageDescriptor(actionImage);
				mi.add(action);
			}
		}

	}

	private void computeActiveServices(Map<Viewpoint, ModelManager> vp2mgr, Map<Viewpoint, List<ViewpointElement>> vp2elt, EObject selectedObj) {
		for (Viewpoint vp : sort(getAvailableViewpoints())) {
			if (selectedObj == null || vp.isAbstract() || !ViewpointManager.getInstance(selectedObj).isActive(vp.getId())) {
				continue;
			}
			ModelManager vpMgr = ModelManager.createWorkspaceManager(vp);
			vp2mgr.put(vp, vpMgr);
			ServiceRunner runner = new ServiceRunner();
			for (ViewpointElement elt : sort(vpMgr.getServiceHandler().getElements())) {
				Service action = (Service) elt;
				if (runner.canRun(action, vpMgr, selectionProvider.getSelection())) {
					List<ViewpointElement> list = vp2elt.get(vp);
					if (list == null) {
						list = new ArrayList<ViewpointElement>();
						vp2elt.put(vp, list);
					}
					list.add(elt);
				}
			}
		}
	}

	/**
	 * From ViewpointController
	 */
	public Viewpoint[] getAvailableViewpoints() {
		List<Viewpoint> vps = new ArrayList<Viewpoint>();
		Resource[] resources = ViewpointManager.getAvailableViewpoints();

		ResourceSet set = new ResourceSetImpl();
		for (Resource resource : resources) {
			String path2 = resource.getPath();
			if ((path2 == null) || "".equals(path2)) {
				continue;
			}
			URI uri = URIHelper.createURI(resource);
			try {
				Viewpoint vp = (Viewpoint) set.getEObject(uri, true);
				vps.add(vp);
			} catch (Exception e) {
				Activator.getDefault().logWarning(e);
			}
		}

		Viewpoint[] array = vps.toArray(new Viewpoint[vps.size()]);
		return array;
	}

	private Viewpoint[] sort(Viewpoint[] vps) {
		Arrays.sort(vps, new Comparator<Viewpoint>() {

			public int compare(Viewpoint arg0, Viewpoint arg1) {
				String name0 = arg0.getName() == null ? "" : arg0.getName();
				String name1 = arg1.getName() == null ? "" : arg1.getName();

				return name0.compareTo(name1);
			}
		});
		return vps;
	}

	private List<ViewpointElement> sort(List<ViewpointElement> elements) {
		Collections.sort(elements, new Comparator<ViewpointElement>() {

			public int compare(ViewpointElement arg0, ViewpointElement arg1) {
				String name0 = arg0.getName() == null ? "" : arg0.getName();
				String name1 = arg1.getName() == null ? "" : arg1.getName();

				return name0.compareTo(name1);
			}
		});
		return elements;
	}

}
