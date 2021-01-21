/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.utils;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.domain.TargetPlatformResourceSet;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.core.producer.MissingExtensionException;
import org.eclipse.egf.model.fcore.Activity;
import org.eclipse.egf.producer.EGFProducerPlugin;
import org.eclipse.egf.producer.manager.ActivityManagerProducer;
import org.eclipse.egf.producer.manager.IActivityManager;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

/**
 * @author Boubekeur Zendagui
 */

public class InvocationHelper {

	private static EditingDomain editingDomain;
	
	public static boolean validateAndInvoke(Activity activity, IProgressMonitor monitor) {
		try {
			Diagnostic diagnostic = Diagnostician.INSTANCE.validate(activity);
			if (diagnostic.getSeverity() != Diagnostic.ERROR) {
				invoke(activity, monitor);
				return true;
			}
		} catch (MissingExtensionException e) {
			e.printStackTrace();
		} catch (InvocationException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void invoke(Activity activity, IProgressMonitor monitor) throws MissingExtensionException, InvocationException,CoreException {
		final ActivityManagerProducer producer = EGFProducerPlugin.getActivityManagerProducer(activity);
		final IActivityManager activityManager = producer.createActivityManager(activity);
		activityManager.initializeContext();

		try {
			activityManager.invoke(monitor);
			activityManager.dispose();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Activity getActivity(URI activityURI) {
		EditingDomain editingDomain = getEditingDomain();
		ResourceSet rs = editingDomain.getResourceSet();
		return (Activity) rs.getEObject(activityURI, true);
	}

	private static EditingDomain getEditingDomain() {
		if (editingDomain == null) 
			initializeEditingDomain();
		
		return editingDomain;
	}

	private static void initializeEditingDomain() {
		final AdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		final CommandStack statck = new BasicCommandStack();
		final ResourceSet resourceSet = new TargetPlatformResourceSet();
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, statck, resourceSet);
	}
}
