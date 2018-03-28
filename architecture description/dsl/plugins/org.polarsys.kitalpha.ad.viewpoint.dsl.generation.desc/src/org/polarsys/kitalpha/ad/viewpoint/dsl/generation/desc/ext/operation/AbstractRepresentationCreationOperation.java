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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.ext.operation;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.util.ObjectAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.LayoutService;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.LayoutType;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.CreateRepresentationCommand;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.CustomDataConstants;
import org.eclipse.sirius.business.api.session.DefaultLocalSessionCreationOperation;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionCreationOperation;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.DragAndDropTarget;
import org.eclipse.sirius.diagram.business.api.query.EdgeMappingQuery;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.business.api.refresh.CanonicalSynchronizer;
import org.eclipse.sirius.diagram.business.api.refresh.CanonicalSynchronizerFactory;
import org.eclipse.sirius.diagram.ui.internal.refresh.SynchronizeGMFModelCommand;
import org.eclipse.sirius.diagram.business.api.refresh.DiagramCreationUtil;
import org.eclipse.sirius.ecore.extender.business.api.accessor.ModelAccessor;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.table.metamodel.table.DTable;
import org.eclipse.sirius.table.metamodel.table.description.TableDescription;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.ui.business.internal.commands.ChangeViewpointSelectionCommand;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.ext.command.CreateEdgeCommand;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.ext.command.CreateNodeCommand;

/**
 * <p>
 * This operation allows to :
 * <ul>
 * <li> create a Sirius representation file (aird)</li>
 * <li> associate a model to the representation as a semantic resource</li>
 * <li> select a set of viewpoint </li>
 * <li> create diagrams on model semantic elements</li>
 * </ul>
 * </p>
 * @author Boubekeur Zendagui
 */
@SuppressWarnings("restriction")
public abstract class AbstractRepresentationCreationOperation extends WorkspaceModifyOperation{

	/** Semantic elements to create representation for them */
	protected List<EObject> semanticElemens = new ArrayList<EObject>();
	
	/** Sirius representation files extension **/
	private final static String _AIRD_FILE_EXTENSION = "aird";
	
	/** Viewpoint and diagrams names **/
	private String _viewpointPluginID = "";
	private String _viewpointName = "";
	private List<String> _representationsNames = new ArrayList<String>();
	
	/** List of all representation names to create**/
	protected Set<Viewpoint> viewpoints = new HashSet<Viewpoint>();
	protected List<RepresentationDescription> representationsDescriptions = new ArrayList<RepresentationDescription>();
	
	/** Representation file information **/
	private String representationFileName;
	private URI representationFileURI;
	private IProject representationProject;
	
	/** {@link URI} of the model **/
	private URI _modelURI;
	
	/**
	 * Return the elements this operation will create representations for. This method is 
	 * to be implemented by derived classes. 
	 * @param session the current session used to edit aird
	 * @return a {@link List} of semantic elements 
	 */
	public abstract List<EObject> getSemanticElements(Session session, URI modelUri);
	
	/**
	 * 
	 * @param currentSemantic
	 * @return
	 */
	public abstract String getLabelFrom(EObject currentSemantic, RepresentationDescription description);
	
	public abstract boolean initializeDiagram(DDiagram diagram);
	
	/**
	 * @see #AbstractRepresentationCreationOperation(URI, String, String, String, List)
	 */
	public AbstractRepresentationCreationOperation(URI modelURI, String fileName, String viewpointPluginID, String viewpointName) {
		this(modelURI, fileName, viewpointPluginID, viewpointName, null);
	}
	
	/**
	 * @param modelURI 
	 * 				{@link URI} of the ecore model
	 * 
	 * @param fileName 
	 * 				name of the representation file that will be generated. This can be a 
	 * 				simple name or an FQN. It accept <code> null</code>. If it value is 
	 * 				<code>null</code>, the generated representation file will have the same 
	 * 				name of the ecore model
	 * 
	 * @param viewpointPluginID 
	 * 				ID of the plug-in hosting the VSM file 
	 * @param viewpointName 
	 * 				the name of a plug-in
	 * @param representations 
	 * 				à {@link List} of representation description names to create
	 */
	public AbstractRepresentationCreationOperation(URI modelURI, String fileName, String viewpointPluginID, String viewpointName, List<String> representations) {
		super();
		this._modelURI = modelURI;
		this._viewpointName = viewpointName;
		this._viewpointPluginID = viewpointPluginID;
		this._representationsNames = representations;
		initRepresentationFileInformations(fileName);
		initViewpointsList(representations == null);
	}
	
	/**
	 * Initialize representation file information
	 * @param fileName representation file name
	 */
	private void initRepresentationFileInformations(String fileName){
		this.representationFileName =  getRepresentationFileName(fileName);
		this.representationFileURI = getRepresentationUri(fileName);
		this.representationProject = getRepresentationProject(fileName);
	}
	
	/**
	 * Initialize Viewpoints list
	 */
	private void initViewpointsList(boolean allRepresentations){
		// Step 1: initialize Viewpoint list
		for (Viewpoint viewpoint : ViewpointRegistry.getInstance().getViewpoints()) 
		{
			if (viewpoint.getName().equals(_viewpointName) && viewpoint.eResource().getURI().segmentsList().contains(_viewpointPluginID))
			{// This version handle only one viewpoint
				viewpoints.add(viewpoint);
				break;
			}
		}

		// Step 2: initialize Representation list
		if (! viewpoints.isEmpty())
		{
			for (Viewpoint viewpoint : viewpoints) 
			{
				EList<RepresentationDescription> ownedRepresentations = viewpoint.getOwnedRepresentations();
				if (ownedRepresentations != null && ! ownedRepresentations.isEmpty())
				{
					if (allRepresentations)
					{
						_representationsNames = new ArrayList<String>();
						representationsDescriptions.addAll(ownedRepresentations);
						for (RepresentationDescription representationDescription : ownedRepresentations) 
						{
							_representationsNames.add(representationDescription.getName());
						}
					}
					else
					{
						for (RepresentationDescription representationDescription : ownedRepresentations) 
						{
							final String name = representationDescription.getName();
							if (_representationsNames.contains(name))
							{
								representationsDescriptions.add(representationDescription);
							}
						}
					}
				}
			}
		}
	}
	
	/**
	 * Check if diagram and matrix generation can be done
	 * @return True if all data are not null and not empty
	 */
	private boolean canGenerate(){
		if (_modelURI == null ) return false;
		if (_viewpointName == null || _viewpointName.isEmpty() ) return false;
		if (_viewpointPluginID == null || _viewpointPluginID.isEmpty() ) return false;
		if (_representationsNames == null || _representationsNames.isEmpty() ) return false;
		
		return true;
	}
	
	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
		if (canGenerate() == false)
			return ;
		
		/** Step 1: create representation file and get the session **/
		Session session = createRepresentationFile(monitor);
		
		/** Step 2: Create diagrams on EPackages**/
		if (session != null)
		{
			// Collect semantic elements
			semanticElemens = getSemanticElements(session, _modelURI);
			// Create diagrams if session was well created in the previous step
			List<DRepresentation> newAndCreatedRepresentations = createRepresentations(session, monitor);
						
			// Create diagram content
			if (newAndCreatedRepresentations.isEmpty() == false)
			{
				for (DRepresentation dRepresentation : newAndCreatedRepresentations) 
				{
					if (dRepresentation instanceof DDiagram)
					{
						if (initializeDiagram((DDiagram) dRepresentation))
							populateEntitiesDiagram(session, (DDiagram) dRepresentation);
					}
					
					// Refresh representation.
					refreshRepresentation(session, dRepresentation);
					
					// Layout diagram content
					if (dRepresentation instanceof DDiagram)
						arrangeAll(session, (DDiagram) dRepresentation);
				}
			}
			
			// Save session
			session.save(monitor);
			
			// CLose session
		}
	}
	
	/**
	 * Create diagram content
	 * @param session used {@link Session} to edit diagrams
	 * @param diagram {@link DDiagram} to populate with containers, nodes and edges
	 */
	private void populateEntitiesDiagram(final Session session, final DDiagram diagram){
		List<EObject> semantics = getSemanticElements(session, _modelURI);
		for (EObject semantic : semantics) 
		{
			populateNodesAndContainers(session, diagram, semantic);
			populateEdges(session, diagram, semantic);
		}
	}
	
	private void populateEdges(final Session session, final DDiagram diagram, EObject ePackage){
		/** List of diagram description edges mapping**/
		final DiagramDescription description = diagram.getDescription();
		EList<EdgeMapping> allEdgeMappings = description.getDefaultLayer().getEdgeMappings();
		// Create and execute edge creation commands
		TransactionalEditingDomain transactionalEditingDomain = session.getTransactionalEditingDomain();
		for (EdgeMapping edgeMapping : allEdgeMappings) 
		{
			boolean useDomainElement = edgeMapping.isUseDomainElement();
			if (useDomainElement)
			{
				EdgeMappingQuery edgeMappingQuery = new EdgeMappingQuery(edgeMapping);
				Collection<EObject> candidates = edgeMappingQuery.evaluateCandidateExpression((DSemanticDiagram)diagram, session.getInterpreter(), (DragAndDropTarget)diagram);
				for (EObject eObject : candidates) 
				{
					CreateEdgeCommand command = new CreateEdgeCommand(session, diagram, edgeMapping, eObject, useDomainElement);
					transactionalEditingDomain.getCommandStack().execute(command);
				}
			}
			else
			{
				for (EObject semantic : ePackage.eContents()) 
				{
					CreateEdgeCommand command = new CreateEdgeCommand(session, diagram, edgeMapping, semantic, useDomainElement);
					transactionalEditingDomain.getCommandStack().execute(command);
				}
			}
		}
		transactionalEditingDomain.getCommandStack().flush();
	}

	/**
	 * Create nodes and containers diagram children
	 * @param session used {@link Session} to edit diagrams
	 * @param diagram {@link DDiagram} to populate with nodes and containers
	 * @param ePackage {@link EPackage} 
	 */
	private void populateNodesAndContainers(final Session session, final DDiagram diagram, EObject ePackage) {
		/** List of diagram description node and container mapping**/
		EList<AbstractNodeMapping> abstractNodeMappings = new BasicEList<AbstractNodeMapping>();
		final DiagramDescription description = diagram.getDescription();
		/** Handle description NodeMppings **/
		EList<NodeMapping> nodeMappings = description.getAllNodeMappings();
		if (! nodeMappings.isEmpty())
			abstractNodeMappings.addAll(nodeMappings);
		
		/** Handle description ContainerMppings **/
		EList<ContainerMapping> containerMappings = description.getAllContainerMappings();
		if (! containerMappings.isEmpty())
			abstractNodeMappings.addAll(containerMappings);
		
		final ModelAccessor modelAccessor = session.getModelAccessor();
		for (final AbstractNodeMapping abstractNodeMapping : abstractNodeMappings) 
		{
			final String domainClass = abstractNodeMapping.getDomainClass();
			// Handling EPackage content
			for (final EObject element : ePackage.eContents()) 
			{
				if (modelAccessor.eInstanceOf(element, domainClass))
				{
					CreateNodeCommand command = new CreateNodeCommand(session, diagram, abstractNodeMapping, element);
					session.getTransactionalEditingDomain().getCommandStack().execute(command);
				}
			}
		}
	}
	
	/**
	 * Create all diagrams for semantic element
	 * @param session The {@link Session} opened on the created representation file 
	 * @param monitor {@link IProgressMonitor}
	 */
	private List<DRepresentation> createRepresentations(final Session session, IProgressMonitor monitor){
		List<DRepresentation> result = new ArrayList<DRepresentation>();
		
		for (EObject semantic : semanticElemens) 
		{
			Collection<DRepresentation> representations = DialectManager.INSTANCE.getRepresentations(semantic, session);
			if (representations.isEmpty())
			{
				// Create all representation
				for (String representationName : _representationsNames) 
				{
					final DRepresentation newRepresentation = createRepresentation(semantic, session, representationName, monitor);
					if (newRepresentation != null)
						result.add(newRepresentation);
				}
			}
			else
			{
				// get created representations
				List<String> availableRepresentation = new ArrayList<String>();
				for (DRepresentation representation : representations) 
				{
					RepresentationDescription description = null;
					if (representation instanceof DDiagram)
					{
						final DDiagram dDiagram = (DDiagram) representation;
						description = dDiagram.getDescription();
					}
					
					if (representation instanceof DTable)
					{
						final DTable dTable = (DTable) representation;
						description = dTable.getDescription();
					}
					
					if (description != null)
					{
						availableRepresentation.add(description.getName());
						// Add an existing representation to the result to refresh and layout it
						for (RepresentationDescription desc : representationsDescriptions) 
						{
							if (desc.getName().equals(description.getName()))
								result.add(representation);
						}
						
					}
				}
				
				// Create only missing representations
				for (String string : _representationsNames) 
				{
					if (! availableRepresentation.contains(string))
					{
						final DRepresentation newRepresentation = createRepresentation(semantic, session, string, monitor);
						if (newRepresentation != null)
							result.add(newRepresentation);
					}
				}
			}
		}
		return result;
	}
	
	/**
	 * Create a Table representation
	 * @param semantic model element root of the representation to create
	 * @param session {@link Session} used to create the representation
	 * @param representationName
	 * @param representationLabelc
	 * @param monitor {@link IProgressMonitor} to trace representation creation
	 * @return True if the representation is well created, false otherwise
	 */
	private DRepresentation createRepresentation(final EObject semantic, final Session session, String representationName, IProgressMonitor monitor){
		final RepresentationDescription representationDescription = getRepresentationDescription(representationName);
		String domainClass = null;
		if (representationDescription instanceof DiagramDescription)
			domainClass = ((DiagramDescription) representationDescription).getDomainClass();
		if (representationDescription instanceof TableDescription)
			domainClass = ((TableDescription) representationDescription).getDomainClass();
		
		DRepresentation createRepresentation = null;
		if (domainClass != null && session.getModelAccessor().eInstanceOf(semantic, domainClass))
			createRepresentation = createRepresentation(semantic, session, representationDescription, monitor);
		
		return createRepresentation;
	}
	
	/**
	 * 
	 * @param representationName the name of sought representation
	 * @return a {@link RepresentationDescription} or null
	 */
	private RepresentationDescription getRepresentationDescription(String representationName){
		for (RepresentationDescription representation : representationsDescriptions) 
		{
			if (representation.getName().equals(representationName))
				return representation;
		}
		return null;
	}

	/**
	 * Create one representation for a given semantic element in a given session
	 * @param semantic model element root of the representation to create
	 * @param session {@link Session} used to create the representation
	 * @param description {@link RepresentationDescription} used to create the representation
	 * @param name representation name
	 * @param monitor {@link IProgressMonitor} to trace representation creation
	 * @return the created {@link DRepresentation}
	 */
	private DRepresentation createRepresentation(final EObject semantic, final Session session, final RepresentationDescription description, IProgressMonitor monitor) {
		String name = getLabelFrom(semantic, description);
		CreateRepresentationCommand createRepresentationCommand = new CreateRepresentationCommand(session, description, semantic, name, monitor);
		session.getTransactionalEditingDomain().getCommandStack().execute(createRepresentationCommand);
		DRepresentation createdRepresentation = createRepresentationCommand.getCreatedRepresentation();
		return createdRepresentation;
	}
	
	/**
	 * Allows to arrange all on a given diagram
	 * @param session uses {@link Session} to edit diagrams
	 * @param diagram {@link DDiagram} to arrange
	 */
	private void arrangeAll(final Session session, final DDiagram diagram){
		final DiagramCreationUtil util = new DiagramCreationUtil(diagram);
		Diagram associatedGMFDiagram = null;
		if (!util.findAssociatedGMFDiagram()) 
		{// If GMF diagram is not initialized, create it
			util.createNewGMFDiagram();
			associatedGMFDiagram = util.getAssociatedGMFDiagram();
			if (associatedGMFDiagram != null) 
				session.getServices().putCustomData(CustomDataConstants.GMF_DIAGRAMS, diagram, associatedGMFDiagram);
		}
		else
		{// Get the GMF diagram
			associatedGMFDiagram = util.getAssociatedGMFDiagram();
		}
		
		// Synchronize Sirius diagram with GMF diagram 
		final TransactionalEditingDomain domain = session.getTransactionalEditingDomain();
		if (associatedGMFDiagram != null) 
		{
			final CanonicalSynchronizer canonicalSynchronizer = CanonicalSynchronizerFactory.INSTANCE.createCanonicalSynchronizer(associatedGMFDiagram);
			Command gmfNotationModelSynchronizationCmd = new SynchronizeGMFModelCommand(domain, canonicalSynchronizer);
			domain.getCommandStack().execute(gmfNotationModelSynchronizationCmd);
		}
		
		final Diagram associatedGMFDiagram_f = associatedGMFDiagram;
		Display.getDefault().syncExec(new Runnable() {
			@SuppressWarnings({ "rawtypes", "unchecked" })
			public void run() {
				Shell shell = new Shell(Display.getDefault());
				try {
					DiagramEditPart diagramEP = org.eclipse.sirius.diagram.ui.tools.internal.part.OffscreenEditPartFactory.getInstance().createDiagramEditPart(associatedGMFDiagram_f, shell);
					
					/** Register Nodes Edit Part in diagram viewpoint Registry **/
					final ListIterator listIterator = associatedGMFDiagram_f.getChildren().listIterator();
					while (listIterator.hasNext())
					{
						final Object next = listIterator.next();
						org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart g = ((org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart)diagramEP.getPrimaryEditParts().get(0));
						next.toString();
						diagramEP.getViewer().getEditPartRegistry().put(next, g);
					}
					
					/** Define hint**/
					List<Object> hints = new ArrayList<Object>(2);
					hints.add(LayoutType.DEFAULT);
					hints.add(diagramEP);
					IAdaptable layoutHint = new ObjectAdapter(hints);

					/** Process layout **/
					EList children =  null;
					try {
						children =  associatedGMFDiagram_f.getChildren();
					} catch (IllegalArgumentException e) {
					}
					
					if (children != null && children.isEmpty() == false)
					{
						List layoutNodes = LayoutService.getInstance().getLayoutNodes(diagramEP, associatedGMFDiagram_f.getChildren());
						if (layoutNodes.isEmpty() == false) 
						{
							Runnable layoutRun = LayoutService.getInstance().layoutLayoutNodes(layoutNodes, false, layoutHint);
							layoutRun.run();
						}
					}
				}
				finally {
				}
			}
		});
		
	}
	
	/**
	 * Refresh a given diagram.
	 * @param session session used to edit <code>diagram</code>
	 * @param diagram the diagram to refresh
	 */
	private void refreshRepresentation(final Session session, final DRepresentation representation){
		final TransactionalEditingDomain editingDomain = session.getTransactionalEditingDomain();
		RecordingCommand command = new RecordingCommand(editingDomain) {
			@Override
			protected void doExecute() {
				representation.refresh();
			}
		};
		editingDomain.getCommandStack().execute(command);
	}
	

	/**
	 * Create the representation file for the model
	 * @param monitor {@link IProgressMonitor} to trace operation
	 */
	private Session createRepresentationFile(IProgressMonitor monitor){
		monitor.subTask("create the representation model..."); //$NON-NLS-1$ 
		/** Get the project containing the model**/
		IProject project = this.representationProject; 
		
		/** Create the aird file and create a Session **/
		Session session = SessionManager.INSTANCE.getSession(representationFileURI, new NullProgressMonitor());
		if (session == null)
			session = createAird(project, representationFileURI, monitor);
		
		if (session != null)
		{
			session.save(monitor);
			session.open(monitor);
		}
		else
		{// Session is not created
			throw new RuntimeException("Can't create a session for " + representationFileURI.toString());
		} 
		
		// Command to link ecore model to the session
		AddSemanticResourceCommand addSemanticResourceCommand = new AddSemanticResourceCommand(session, _modelURI, new SubProgressMonitor(monitor, 1));
		// Command to select Viewpoint in the current session
		ChangeViewpointSelectionCommand changeViewpointSelectionCommand = new ChangeViewpointSelectionCommand(session, new ViewpointSelectionCallback(), viewpoints, 
				Collections.<Viewpoint> emptySet(), false, new SubProgressMonitor(monitor, 1));
		
		// Execute the 2 created commands bellow
		CompoundCommand compoundCommand = new CompoundCommand("Link resources to representation"); //$NON-NLS-1$ 
		compoundCommand.append(addSemanticResourceCommand);
		compoundCommand.append(changeViewpointSelectionCommand);
		session.getTransactionalEditingDomain().getCommandStack().execute(compoundCommand);
		
		return session;
	}
	
	/**
	 * Reworked code from org.eclipse.emf.ecoretools.design.wizard.EcoreModelingProjectCreationOperation.createAird(IProject, URI, IProgressMonitor) 
	 */
	public static Session createAird(IProject project, URI representationsURI, IProgressMonitor monitor) {
		Session session = null;
		// Get the corresponding modeling project
		Option<ModelingProject> modelingProject = ModelingProject.asModelingProject(project);
		if (modelingProject.some()) 
		{ // If project is a modeling project, then get it session
			session = modelingProject.get().getSession();
		} 

		if (session == null) 
		{// Else, create a new session
			SessionCreationOperation sessionCreationOperation = new DefaultLocalSessionCreationOperation(representationsURI, monitor);
			try {
				sessionCreationOperation.execute();
				session = sessionCreationOperation.getCreatedSession();
			} catch (CoreException e) {
				throw new RuntimeException("Can't create session for " + representationsURI, e);
			}
		}
		
		return session;
	}
	
	/**
	 * Compute the representation file {@link URI}. This file will be created near of model
	 * @return the representation file {@link URI}
	 */
	private URI getRepresentationUri(String fileName){
		String stringRepresentationURI = "";

		if (isFqnFileName(fileName))
		{
			stringRepresentationURI = fileName;
		}
		else
		{
			URI modelUriWithoutFileExtension = this._modelURI.trimFileExtension();
			if (modelUriWithoutFileExtension != null && modelUriWithoutFileExtension.segmentCount() > 1)
			{
				for (int i = 1; i < modelUriWithoutFileExtension.segments().length - 1; i++) 
				{
					stringRepresentationURI += "/" + modelUriWithoutFileExtension.segments()[i];
				}
				stringRepresentationURI += "/" + this.representationFileName;
			}
			else
			{
				throw new RuntimeException("Model URI is not valid");
			}
		}
		
		if (stringRepresentationURI.length() > 0)
			return URI.createPlatformResourceURI(stringRepresentationURI, true);
		else
			throw new RuntimeException("Error on creating representation URI");
		
	}
	
	private boolean isFqnFileName(String fileName){
		if (fileName != null && !fileName.isEmpty() && fileName.contains("/"))
			return true;
		else
			return false;
	}
	
	/**
	 * Check if fileName value is valid. If it is not the case, this method return model file name + ".aird"
	 * @param fileName representation file name. This parameter accept <code> null <code/> value
	 * @return a valid representation file name
	 */
	private String getRepresentationFileName(String fileName){
		if (fileName == null || (fileName != null && fileName.trim().length() <1 ))
		{
			URI modelUriWithoutFileExtension = this._modelURI.trimFileExtension();
			if (modelUriWithoutFileExtension != null && modelUriWithoutFileExtension.segmentCount() > 1)
			{
				String modelName = modelUriWithoutFileExtension.lastSegment();
				modelName += "." +_AIRD_FILE_EXTENSION;
				return modelName;
			}
			else
			{
				throw new RuntimeException("Model file URI is not valid");
			}
		}
		else
		{
			boolean fqnFileName = isFqnFileName(fileName);
			if (fqnFileName)
			{
				String[] segments = fileName.split("/");
				String lastSegment = segments[segments.length - 1];
				if (lastSegment.contains(_AIRD_FILE_EXTENSION))
					return lastSegment;
				else
					return lastSegment + "." +_AIRD_FILE_EXTENSION;
					
			}
		}
		return fileName;
	}
	
	
	/**
	 * @return the {@link IProject} containing the model
	 */
	private IProject getRepresentationProject(String fileName){
		String projectName = null;
		List<String> foldersToCreate = new ArrayList<String>();
		
		if (isFqnFileName(fileName))
		{/* The file name provided by user is like: /PluginID/folders/filename.aird
		  * In this case, the project and folder will be created if they are not available */ 
			String[] segments = fileName.split("/");
			projectName = segments[0];
			// create the list of folders to create
			for (int i = 1; i < segments.length - 1; i++) 
			{
				foldersToCreate.add(segments[i]);
			}
		}
		else
		{// The file name provided by user is like: filename.aird
			// FIXME: Check id we use the well segment 
			if (_modelURI.isPlatform())
			{// Case of platform URI (Plug-in or Resource URI) 
				projectName = _modelURI.segment(1);
			}
			else
			{// Case of hierarchical URI. Only URI FQN like are handled.
				projectName = _modelURI.segment(0);
			}
		}

		// Get/create the project from/into the workspace
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		NullProgressMonitor NPM = new NullProgressMonitor();
		
		try {
			if (! project.exists())
			{
				project.create(NPM);
			}
			project.open(NPM);
		} catch (CoreException e) {
			throw new RuntimeException("Project with name : " + projectName + " can't be localized", e);
		}
		
		// Create folders if needed
		if (! foldersToCreate.isEmpty())
		{
			IFolder currentFolder = null;
			for (String folderName : foldersToCreate) 
			{
				if (currentFolder == null)
				{// Case of the first iteration, get the folder from the project
					currentFolder = project.getFolder(folderName);
				}
				else
				{// Case of the other iterations, get the folder from it parent folder
					currentFolder = currentFolder.getFolder(folderName);
				}
				
				if (! currentFolder.exists())
				{ // Create the folder if it is was not created yet.
					try {
						currentFolder.create(true, true, NPM);
					} catch (CoreException e) {
						throw new RuntimeException("Can't create folder : " + currentFolder , e);
					}
				}
			}
		}
		
		return project;
	}
	
}
