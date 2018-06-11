/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.ui.menus;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.CompoundContributionItem;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;
import org.eclipse.ui.services.IServiceLocator;

import org.polarsys.kitalpha.composer.api.NsURIAnalyzer;
import org.polarsys.kitalpha.composer.api.profiles.ComposerProfile;
import org.polarsys.kitalpha.composer.api.profiles.IComposerProfileRegistry;
import org.polarsys.kitalpha.composer.ui.Activator;
import org.polarsys.kitalpha.composer.ui.actions.LaunchComposerAction;
import org.polarsys.kitalpha.composer.ui.actions.LaunchFromProfileAction;
import org.polarsys.kitalpha.composer.ui.launch.CodeManagerLaunchConfigurationHelper;

/**
 * Contribution item to add the Run Composer menu item.
 * 
 
 */
public class CodegenManagerContributionItem extends CompoundContributionItem {

	private boolean enabled = false;

	public CodegenManagerContributionItem() {
	}

	/**
	 * Creates the contribution with the given id.
	 * 
	 * @param id
	 *            the id.
	 */
	public CodegenManagerContributionItem(String id) {
		super(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.actions.CompoundContributionItem#getContributionItems()
	 */
	@Override
	protected IContributionItem[] getContributionItems() {
		List<IContributionItem> items = getPopupMenu();
		enabled = !items.isEmpty();
		if (!enabled) {
			setVisible(false);
		} else {
			setVisible(true);
		}
		return items.toArray(new IContributionItem[items.size()]);
	}

	/**
	 * Returns all composer actions that are available for the current selected
	 * item.
	 * 
	 * @return all composer actions that are available for the current selected
	 *         item.
	 */
	public List<IContributionItem> getPopupMenu() {
		List<IContributionItem> result = new ArrayList<IContributionItem>();

		Set<ILaunchConfiguration> allConfigs = new HashSet<ILaunchConfiguration>();

		ISelectionProvider selectionProvider = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActivePart()
				.getSite().getSelectionProvider();
		if (selectionProvider != null) {
			ISelection selection = selectionProvider.getSelection();

			List<Object> adaptedSelection = adaptSelection(selection);

			for (Object o : adaptedSelection) {
				allConfigs.addAll(getLaunchConfigurations(o));
			}
			for (ILaunchConfiguration launchConfig : allConfigs) {
				result.add(new ActionContributionItem(new LaunchComposerAction(
						launchConfig)));
			}
		
			result.add(new Separator());
			
			IServiceLocator serviceLocator = PlatformUI.getWorkbench()
			.getActiveWorkbenchWindow().getActivePage().getActivePart()
			.getSite();
			String id = "org.eclipse.debug.ui.commands.from.composer";
			String commandId ="org.eclipse.debug.ui.commands.OpenRunConfigurations";
			
			CommandContributionItemParameter param = new CommandContributionItemParameter(serviceLocator, id, commandId, CommandContributionItem.STYLE_PUSH);
			param.label = "Edit or setup configurations ...";
			CommandContributionItem i = new CommandContributionItem(param);
			result.add(i);


			
			result.add(new Separator());
			
			List<IAction> fromProfiles = getFromProfiles(adaptedSelection);
			if (fromProfiles != null && !fromProfiles.isEmpty()) {
				MenuManager profiles = new MenuManager("New configuration from a profile ...");
				for (IAction profileAction : fromProfiles) {
					profiles.add(new ActionContributionItem(profileAction));
				}
				result.add(profiles);
			}

		}
		return result;
	}

	private List<IAction> getFromProfiles(List<Object> adaptedSelection) {
		SortedSet<ComposerProfile> profiles = new TreeSet<ComposerProfile>(
				new ComposerProfileComparator());

		for (Object o : adaptedSelection) {
			Collection<String> businessUris = new HashSet<String>();
			if (o instanceof IFile) {
				IFile file = (IFile) o;
				businessUris = NsURIAnalyzer.getNsURIs(file.getLocation()
						.toFile());
			} else if (o instanceof EObject) {
				EObject object = (EObject) o;
				businessUris.add(object.eClass().getEPackage().getNsURI());
				for (EClass eClass : object.eClass().getEAllSuperTypes()) {
					businessUris.add(eClass.getEPackage().getNsURI());
				}
			}

			for (String businessUri : businessUris) {
				profiles.addAll(IComposerProfileRegistry.INSTANCE
						.getBySemanticNsURI(businessUri));
			}
		}

		List<IAction> result = new ArrayList<IAction>();
		for (ComposerProfile profile : profiles) {
			result.add(new LaunchFromProfileAction(profile, adaptedSelection));
		}
		return result;
	}

	private Set<ILaunchConfiguration> getLaunchConfigurations(Object o) {
		Set<ILaunchConfiguration> result = new HashSet<ILaunchConfiguration>();
		if (o instanceof IFile) {
			IFile file = (IFile) o;

			//
			// Get ns uris from the file.
			File ioFile = file.getLocation().toFile();

			for (String uri : NsURIAnalyzer.getNsURIs(ioFile)) {
				try {
					ILaunchConfiguration[] launchConfigurations = CodeManagerLaunchConfigurationHelper
							.getAllCodeManagerLaunchConfigurationsWithMMUri(uri);
					result.addAll(new HashSet<ILaunchConfiguration>(Arrays
							.asList(launchConfigurations)));
				} catch (CoreException e) {
					Activator.getDefault().getLog().log(e.getStatus());
				}
			}

		} else if (o instanceof EObject) {
			List<EObject> eObjects = new ArrayList<EObject>(1);
			eObjects.add((EObject) o);
			String nsURI = ((EObject) o).eClass().getEPackage().getNsURI();
			ILaunchConfiguration[] launchConfigurations = new ILaunchConfiguration[0];
			try {
				launchConfigurations = CodeManagerLaunchConfigurationHelper
						.getAllCodeManagerLaunchConfigurationsWithMMUri(nsURI);
			} catch (CoreException e) {
				Activator.getDefault().getLog().log(e.getStatus());
			}
			result.addAll(new HashSet<ILaunchConfiguration>(Arrays
					.asList(launchConfigurations)));
		}
		return result;
	}

	private List<Object> adaptSelection(ISelection selection) {
		List<Object> result = new ArrayList<Object>();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			for (Object o : structuredSelection.toArray()) {
				Object adaptedObject = adaptObject(o);
				if (adaptedObject != null) {
					result.add(adaptedObject);
				}
			}
		}
		return result;
	}

	private Object adaptObject(Object o) {
		if (o instanceof IFile) {
			return o;
		}
		if (o instanceof EObject) {
			return o;
		}
		return null;
	}

	private static final class ComposerProfileComparator implements
			Comparator<ComposerProfile> {

		@Override
		public int compare(ComposerProfile arg0, ComposerProfile arg1) {
			return arg0.getName().compareTo(arg1.getName());
		}
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

}
