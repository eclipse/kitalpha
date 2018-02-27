/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.integration.sirius.actions;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.danalysis.DAnalysisSession;
import org.eclipse.sirius.common.tools.api.util.EqualityHelper;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelection;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.polarsys.kitalpha.ad.integration.sirius.Activator;
import org.polarsys.kitalpha.ad.integration.sirius.dialog.ViewpointSelectionDialog;

import com.google.common.collect.Maps;

public class ViewpointsSelectionAction implements IObjectActionDelegate {

	private Shell shell;
	private IStructuredSelection sselect;

	/**
	 * Constructor for Action1.
	 */
	public ViewpointsSelectionAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		final Session session = getSessionFromSelection(sselect);
		if (session == null) {
			Activator.getDefault().logError("Cannot find the related Doremi session. Exiting.");
			return;
		}

		session.getSemanticCrossReferencer();
		final SortedMap<Viewpoint, Boolean> viewpointsMap = getViewpointsWithMonitor(session);

		final SortedMap<Viewpoint, Boolean> copyOfViewpointsMap = Maps.newTreeMap(new ViewpointRegistry.ViewpointComparator());
		copyOfViewpointsMap.putAll(viewpointsMap);

		ViewpointSelectionDialog dialog = new ViewpointSelectionDialog(shell, viewpointsMap);
		if (dialog.open() == Window.OK) {
			final Map<Viewpoint, Boolean> changes = dialog.getChanges();
			if (!changes.isEmpty())
				session.getTransactionalEditingDomain().getCommandStack().execute(new RecordingCommand(session.getTransactionalEditingDomain()) {

					@Override
					protected void doExecute() {
						ViewpointSelectionCallback viewpointSelectionCallback = new ViewpointSelectionCallback();
						NullProgressMonitor monitor = new NullProgressMonitor();
						for (Entry<Viewpoint, Boolean> entry : changes.entrySet()) {
							if (entry.getValue())
								viewpointSelectionCallback.selectViewpoint(entry.getKey(), session, monitor);
							else
								viewpointSelectionCallback.deselectViewpoint(entry.getKey(), session, monitor);
						}
					}
				});

		}
	}

	private static SortedMap<Viewpoint, Boolean> getViewpointsWithMonitor(final Session session) {
		final SortedSet<Viewpoint> allViewpoints = new TreeSet<Viewpoint>(new ViewpointRegistry.ViewpointComparator());
		final SortedMap<Viewpoint, Boolean> viewpointsMap = Maps.newTreeMap(new ViewpointRegistry.ViewpointComparator());

		// collect all applicable viewpoints
		for (final Resource resource : session.getSemanticResources()) {
			if (resource != null && resource.getURI() != null) {
				final String currentFileExtension = resource.getURI().fileExtension();
				if (currentFileExtension != null)
					allViewpoints.addAll(ViewpointSelection.getViewpoints(currentFileExtension));

			}
		}

		Collection<Viewpoint> selectedViewpoints = session.getSelectedViewpoints(false);
		for (final Viewpoint viewpoint : allViewpoints) {
			boolean selected = false;

			for (Viewpoint selectedViewpoint : selectedViewpoints) {
				if (EqualityHelper.areEquals(selectedViewpoint, viewpoint)) {
					selected = true;
					break;
				}
			}
			viewpointsMap.put(viewpoint, Boolean.valueOf(selected));
		}
		return viewpointsMap;
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			sselect = (IStructuredSelection) selection;
		}
		if (sselect == null || sselect.isEmpty())
			action.setEnabled(false);
		else {
			Session session = getSessionFromSelection(sselect);
			action.setEnabled(session != null && session.isOpen());
		}
	}

	// toutes les methodes qui suivent viennent de melody (et devraient plutot
	// être dispo dans Sirius)
	protected static Session getSessionFromSelection(IStructuredSelection selection) {
		// Gets the FIRST selected session from current selection.for

		for (Object object : selection.toArray()) {
			if (object instanceof Session) {
				return (Session) object;
			} else if (object instanceof IFile) {
				return getSessionForDiagramFile((IFile) object);
			}
		}
		return null;
	}

	public static Session getSessionForDiagramFile(IFile diagramResourceFile) {
		// Iterate over active sessions to search the ones that semantic
		// resources are contained by the project.
		for (Session session : SessionManager.INSTANCE.getSessions()) {
			if (session instanceof DAnalysisSession && isAnalysisFileInvolvedIn((DAnalysisSession) session, diagramResourceFile)) {
					return session;
			}
		}
		return null;
	}

	public static boolean isAnalysisFileInvolvedIn(DAnalysisSession session, IFile analysisFile) {
		try {
			// Precondition.
			if ((null == session) || (null == analysisFile)) {
				return false;
			}
			// Get all resources involved in the session.
			for (Resource resource : getAllAirdResources(session)) {
				if (analysisFile.equals(WorkspaceSynchronizer.getFile(resource))) {
					return true;
				}
			}
		} catch (IllegalStateException exception) {
			// Could occur in case the session has been already closed.
		}
		return false;
	}

	public static Collection<Resource> getAllAirdResources(Session session) {
		Collection<Resource> allAnalysisResources = new HashSet<Resource>(session.getReferencedSessionResources());
		allAnalysisResources.add(session.getSessionResource());
		return allAnalysisResources;
	}
}
