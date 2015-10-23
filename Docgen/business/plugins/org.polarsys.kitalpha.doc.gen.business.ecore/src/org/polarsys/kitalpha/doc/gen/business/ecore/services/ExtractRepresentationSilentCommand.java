/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.ecore.services;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.polarsys.kitalpha.doc.gen.business.ecore.Activator;


import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.ViewpointFactory;
import org.eclipse.sirius.business.api.dialect.command.MoveRepresentationCommand;
import org.eclipse.sirius.business.api.resource.ResourceDescriptor;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.danalysis.DAnalysisSession;
import org.eclipse.sirius.business.api.session.resource.AirdResource;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;

/**
 * Reworked code from {@link org.eclipse.sirius.ui.tools.internal.wizards.ExtractRepresentationsWizard}
 * @author Boubekeur Zendagui
 */

@SuppressWarnings("restriction")
public class ExtractRepresentationSilentCommand {

	private final TransactionalEditingDomain domain;

	private Session session;

	private Collection<DRepresentation> representations;

	private Resource pickedResource;

	private URI fragmentResourceURI;

	/**
	 * Constructor.
	 * 
	 * @param session
	 *            origin session.
	 * @param domain
	 *            the editing domain
	 * @param movableRepresentations
	 *            the DView instance
	 */
	public ExtractRepresentationSilentCommand(Session session, URI fragmentResourceURI, TransactionalEditingDomain domain, Collection<DRepresentation> movableRepresentations) {
		this.domain = session.getTransactionalEditingDomain();
		this.session = session;
		this.representations = movableRepresentations;
		this.fragmentResourceURI = fragmentResourceURI;
	}

	public boolean execute() {
//		closeRepresentations(representations);
		final IRunnableWithProgress op = new DiagramFileCreationOperation();
		boolean errorCatch = false;
		errorCatch = createAIRDFile(op, errorCatch);
		if (errorCatch) 
			return false;

		final DAnalysis slaveAnalysis = prepareNewAnalysis();
		moveRepresentations(slaveAnalysis);
		return true;
	}

	/**
	 * @param slaveAnalysis
	 */
	 private void moveRepresentations(final DAnalysis slaveAnalysis) {
		 final IRunnableWithProgress moveReps = new IRunnableWithProgress() {
			 public void run(final IProgressMonitor mon) {
				 domain.getCommandStack().execute(new MoveRepresentationCommand(session, slaveAnalysis, representations));
			 }
		 };

		 try {
			 moveReps.run(new NullProgressMonitor());
		 } catch (final InterruptedException e) {
			 Activator.getDefault().getLog().log(new Status(IStatus.INFO, Activator.PLUGIN_ID, "the move representations action was interrupted", e));
		 } catch (final InvocationTargetException e) {
			 Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,"the move representations encountered an exception", e));
		 }
	 }

	 /**
	  * @param op
	  * @param errorCatch
	  * @return
	  */
	 private boolean createAIRDFile(final IRunnableWithProgress op, final boolean error) {
		 boolean errorCatch = error;
		 try {
			 op.run(new NullProgressMonitor());
		 } catch (final InterruptedException e) {
			 errorCatch = true;
			 // return false;
		 } catch (final InvocationTargetException e) {
			 Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,"Error creating aird session data", e.getTargetException())); //$NON-NLS-1$
			 errorCatch = true;
		 }
		 return errorCatch;
	 }

	 /**
	  * @return
	  */
	 private DAnalysis prepareNewAnalysis() {
		 final DAnalysis slaveAnalysis = ViewpointFactory.eINSTANCE.createDAnalysis();
		 domain.getCommandStack().execute(new LocalPrepareNewAnalysisCommand(domain, pickedResource, slaveAnalysis, session));
		 return slaveAnalysis;
	 }

	 @SuppressWarnings("unused")
	private void closeRepresentations(final Collection<DRepresentation> diagrams) {
		 final IEditingSession uiSession = SessionUIManager.INSTANCE.getUISession(session);
		 if (uiSession != null) {
			 for (DRepresentation representation : diagrams) {
				 closeOpenedEditor(uiSession, representation);
			 }
		 }
	 }

	 /**
	  * @param uiSession
	  * @param representation
	  */
	 private void closeOpenedEditor(final IEditingSession uiSession, final DRepresentation representation) {
		 final IEditorPart editor = uiSession.getEditor(representation);
		 if (editor != null) {
			 editor.getEditorSite().getPage().closeEditor(editor, false);
		 }
	 }

	 /**
	  * return the newly created resource.
	  * 
	  * @return the newly created resource.
	  */
	 public Resource getCreatedResource() {
		 return pickedResource;
	 }

	 private class DiagramFileCreationOperation extends WorkspaceModifyOperation {

		 public DiagramFileCreationOperation() {
			 super(null);
		 }

		 @Override
		 protected void execute(final IProgressMonitor monitor) throws CoreException, InterruptedException {
			 final ResourceSet set = session.getTransactionalEditingDomain().getResourceSet();
			 final Set<Resource> allSessionResources = session.getReferencedSessionResources();
			 boolean fragmentAvailable = false;
			 for (Resource resource : allSessionResources) 
			 {
				 if (resource instanceof AirdResource && resource.getURI().equals(fragmentResourceURI))
				 {
					 fragmentAvailable = true;
					 break;
				 }
			 }
			 
			 if (fragmentAvailable)
			 {
				 pickedResource = set.getResource(fragmentResourceURI, true);
			 }
			 else
			 {
				 pickedResource = set.createResource(fragmentResourceURI);
				 try {
					 pickedResource.save(Collections.emptyMap());
				 } catch (IOException e) {
					 e.printStackTrace();
				 }
			 }
		 }
	 }
	 
	 /**
	  * Reworked code from {@link fr.obeo.dsl.viewpoint.tools.internal.command.PrepareNewAnalysisCommand}
	  */
	 private class LocalPrepareNewAnalysisCommand extends RecordingCommand {

			private DAnalysis slaveAnalysis;

			private Resource resource;

			private Session session;

			/**
			 * Specific command to prepare the new analysis.
			 * 
			 * @param domain
			 *            the editing domain.
			 * @param resource
			 *            the current resource.
			 * @param newAnalysis
			 *            the new analysis.
			 * @param session
			 *            the current session.
			 */
			public LocalPrepareNewAnalysisCommand(TransactionalEditingDomain domain, Resource resource, DAnalysis newAnalysis, Session session) {
				super(domain, "Prepare new Analysis");
				this.slaveAnalysis = newAnalysis;
				this.resource = resource;
				this.session = session;
			}

			/**
			 * {@inheritDoc}
			 */
			@Override
			protected void doExecute() {
				if (slaveAnalysis != null && resource != null) {
					resource.getContents().add(slaveAnalysis);
				}
				if (slaveAnalysis != null && session instanceof DAnalysisSession) {
					((DAnalysisSession) session).addReferencedAnalysis(slaveAnalysis);
					for (final Resource semResource : session.getSemanticResources()) {
						if (!semResource.getContents().isEmpty()) {
							slaveAnalysis.getSemanticResources().add(new ResourceDescriptor(semResource.getURI()));
						}
					}
				}
			}

			/**
			 * {@inheritDoc}
			 */
			@Override
			public boolean canUndo() {
				return false;
			}
		}
}
