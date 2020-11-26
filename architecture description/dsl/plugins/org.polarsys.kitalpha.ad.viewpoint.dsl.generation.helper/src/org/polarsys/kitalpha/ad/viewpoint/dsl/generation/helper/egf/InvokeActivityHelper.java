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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.egf;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
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

public class InvokeActivityHelper {

	private static EditingDomain editingDomain;
	
	/**
	 * This check the activity given by parameter and run it 
	 * ( @see InvokeActivityHelper#invoke(Activity, String)).
	 * @param activity the EGF activity to invoke
	 * @param generationName the name to display in the progress bar
	 * @return
	 * @throws CoreException 
	 * @throws InvocationException 
	 * @throws MissingExtensionException 
	 */
	public static boolean validateAndInvoke(Activity activity, String generationName)  {
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(activity);
		if (diagnostic.getSeverity() != Diagnostic.ERROR) 
		{
			try {
				invoke(activity, generationName);
				return true;
			} catch (MissingExtensionException e) {
				e.printStackTrace();
			} catch (InvocationException e) {
				e.printStackTrace();
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	/**
	 * This run the activity given as parameter.
	 * @param activity the EGF activity to invoke
	 * @param generationName the name to display in the progress bar
	 * @throws MissingExtensionException
	 * @throws InvocationException
	 * @throws CoreException
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void invoke(Activity activity, String generationName)
		throws MissingExtensionException, InvocationException, CoreException {
		
		ActivityManagerProducer producer = EGFProducerPlugin.getActivityManagerProducer(activity);
		final IActivityManager activityManager = producer.createActivityManager(activity);
		activityManager.initializeContext();
		Job job = new Job("Viewpoint generation") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					activityManager.invoke(monitor);
					activityManager.dispose();
				} catch (InvocationException e) {
					e.printStackTrace();
				}
				return Status.OK_STATUS;
			}
		};
		job.setUser(true);
		job.schedule();
		
	}

	/**
	 * @param activityURI the URI of an activity
	 * @return the activity defined by the activityURI parameter
	 */
	public static Activity getActivity(URI activityURI) {
		EditingDomain editingDomain = getEditingDomain();
		ResourceSet rs = editingDomain.getResourceSet();
		return (Activity) rs.getEObject(activityURI, true);
	}

	/**
	 * @return the value of the editingDomain property.
	 */
	private static EditingDomain getEditingDomain() {
		if (editingDomain == null)
			return initializeEditingDomain();
		
		return editingDomain;
	}

	/**
	 * This initialize the editing domain property 
	 */
	private static EditingDomain initializeEditingDomain() {
		final AdapterFactory adapterFactory = 
					new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		final CommandStack statck = new BasicCommandStack();
		final ResourceSet resourceSet = new TargetPlatformResourceSet();
		return new AdapterFactoryEditingDomain(adapterFactory, statck, resourceSet);
	}
}
