/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.ui.helper;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.egf.core.domain.TargetPlatformResourceSet;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.core.producer.MissingExtensionException;
import org.eclipse.egf.model.fcore.Activity;
import org.eclipse.egf.pattern.EGFPatternPlugin;
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
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.IProgressService;
import org.polarsys.kitalpha.doc.gen.business.core.ui.Messages;
import org.polarsys.kitalpha.doc.gen.business.core.util.MonitorServices;


public class InvokeActivityHelper {

	private static EditingDomain editingDomain;

	public static boolean validateAndInvoke(Activity activity) {
		try {
			Diagnostic diagnostic = Diagnostician.INSTANCE.validate(activity);
			Shell shell = PlatformUI.getWorkbench().getDisplay()
					.getActiveShell();
			if (diagnostic.getSeverity() != Diagnostic.ERROR) {
				invoke(activity);
				return true;
			} else {
				MessageDialog.openError(shell,
						Messages.InvokeActivityHelper_Error,
						diagnostic.getMessage());
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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void invokeOutOfUIThread(Activity activity)
			throws MissingExtensionException, InvocationException,
			CoreException {
		ActivityManagerProducer producer = EGFProducerPlugin
				.getActivityManagerProducer(activity);
		final IActivityManager activityManager = producer
				.createActivityManager(activity);
		activityManager.initializeContext();
		IWorkbench wb = PlatformUI.getWorkbench();
		final IProgressService ps = wb.getProgressService();

		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				try {
					ps.busyCursorWhile(new IRunnableWithProgress() {
						@Override
						public void run(IProgressMonitor monitor) {
							try {
								MonitorServices.initMonitor(monitor);
								activityManager.invoke(monitor);
								activityManager.dispose();
								MonitorServices.dispose();
							} catch (Exception e) {
								EGFPatternPlugin.getDefault().logError(e);
							}
						}
					});
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void invoke(Activity activity, IProgressMonitor monitor)
			throws MissingExtensionException, InvocationException,
			CoreException {
		ActivityManagerProducer producer = EGFProducerPlugin
				.getActivityManagerProducer(activity);
		final IActivityManager activityManager = producer
				.createActivityManager(activity);
		activityManager.initializeContext();

		try {
			MonitorServices.initMonitor(monitor);
			activityManager.invoke(monitor);
			activityManager.dispose();
			MonitorServices.dispose();
		} catch (Exception e) {
			EGFPatternPlugin.getDefault().logError(e);
		}


	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void invoke(Activity activity)
			throws MissingExtensionException, InvocationException,
			CoreException {
		ActivityManagerProducer producer = EGFProducerPlugin
				.getActivityManagerProducer(activity);
		final IActivityManager activityManager = producer
				.createActivityManager(activity);
		activityManager.initializeContext();

		Job job = new Job(
				Messages.InvokeActivityHelper_HTML_Documentation_Generation) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					MonitorServices.initMonitor(monitor);
					activityManager.invoke(monitor);
					activityManager.dispose();
					MonitorServices.dispose();
				} catch (Exception e) {
					EGFPatternPlugin.getDefault().logError(e);
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;
			}
		};
		job.setUser(true);
		job.schedule();
	}

	public static Activity getActivity(URI activityURI) {
		EditingDomain editingDomain = getEditingDomain();
		ResourceSet rs = editingDomain.getResourceSet();
		return (Activity) rs.getEObject(activityURI, true);
	}

	private static EditingDomain getEditingDomain() {
		if (editingDomain == null) {
			initializeEditingDomain();
		}
		return editingDomain;
	}

	private static void initializeEditingDomain() {
		final AdapterFactory adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		final CommandStack statck = new BasicCommandStack();
		final ResourceSet resourceSet = new TargetPlatformResourceSet();
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, statck,
				resourceSet);
	}
}
