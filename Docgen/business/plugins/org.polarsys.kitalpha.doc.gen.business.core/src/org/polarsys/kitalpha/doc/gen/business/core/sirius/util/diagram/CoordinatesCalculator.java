/*******************************************************************************
 * Copyright (c) 2014, 2021 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.sirius.util.diagram;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.geometry.Translatable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.image.PartPositionInfo;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.render.util.DiagramImageUtils;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.impl.DEdgeImpl;
import org.eclipse.sirius.diagram.ui.edit.api.part.AbstractDiagramEdgeEditPart.ViewEdgeFigure;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.SiriusNoteEditPart;
import org.eclipse.sirius.diagram.ui.tools.internal.render.SiriusDiagramSVGGenerator;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.description.AnnotationEntry;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.doc.gen.business.core.Activator;
import org.polarsys.kitalpha.doc.gen.business.core.internal.GenDocDiagramEditPartService;
import org.polarsys.kitalpha.doc.gen.business.core.preference.helper.DocgenDiagramPreferencesHelper;
import org.polarsys.kitalpha.doc.gen.business.core.scope.GenerationGlobalScope;
import org.polarsys.kitalpha.doc.gen.business.core.scope.ScopeStatus;
import org.polarsys.kitalpha.doc.gen.business.core.sirius.util.session.DiagramSessionHelper;
import org.polarsys.kitalpha.doc.gen.business.core.util.IDiagramHelper;
import org.polarsys.kitalpha.doc.gen.business.core.util.SiriusHelper;

/**
 * @author Boubekeur Zendagui
 * @author Faycal Abka
 * 
 */
@SuppressWarnings("restriction")
public class CoordinatesCalculator {

	public static final Map<String, Map<Rectangle, EObject>> COORDINATES_MAP = new HashMap<String, Map<Rectangle, EObject>>();

	private final GenDocDiagramEditPartService tool = new GenDocDiagramEditPartService();

	private IFile imageFile;
	private DDiagram diagram;
	private Collection<IDiagramHelper> helpers;
	private static Map<String, IDiagramHelper> helperMap = new HashMap<String, IDiagramHelper>();
	private Session session;

	private double scalingFactor = 1.0d; //Default scaling value

	private static IProgressMonitor progressMonitor = new NullProgressMonitor();

	public CoordinatesCalculator(IFile imageFile, DDiagram diagram,
			IDiagramHelper filter) {
		this(imageFile, diagram, filter, null);
	}
	
	private ImageReader getImageReader() {
		return ImageIO.getImageReadersBySuffix(DocgenDiagramPreferencesHelper.getImageFileExtension()).next();
	}

	public CoordinatesCalculator(IFile imageFile, DDiagram diagram, IDiagramHelper filter, Session session) {
		super();
		this.imageFile = imageFile;
		if (diagram.eIsProxy()) {
			resolveProxy(diagram, session);
		} else {
			this.diagram = diagram;
		}
		this.helpers = new HashSet<IDiagramHelper>(); 
		this.helpers.add(filter);
		if (session != null)
			this.session = session;
		else
			this.session = getSessionFromDiagram(diagram);
	}

	/**
	 * Contribute additional helpers
	 * @param helpers
	 */
	public void contributeHelpers(Collection<IDiagramHelper> helpers) {
		this.helpers.addAll(helpers);
	}

	/**
	 * if diagram is a proxy we need to resolve it.
	 * 
	 * @param diagram
	 *            the ddiagram to resolve proxy.
	 * @param session
	 *            the sirius session referencing diagram resource. If null, we
	 *            try to find out the session from proxy uri.
	 */
	private void resolveProxy(DDiagram diagram, Session session) {
		URI diagramUri = EcoreUtil.getURI(diagram);
		if (diagramUri != null && this.session == null) {
			EcoreUtil.getURI(diagram).trimFragment();
			this.session = SessionManager.INSTANCE.getSession(diagramUri.trimFragment(), progressMonitor);
		}
		this.diagram = (DDiagram) EcoreUtil.resolve(diagram,
				this.session.getSessionResource());
	}

	private Session getSessionFromDiagram(DDiagram diagram) {
		if (diagram instanceof DSemanticDiagram) {
			return SessionManager.INSTANCE.getSession(((DSemanticDiagram) diagram).getTarget());
		}
		return null;
	}

	private static final MyComparator MY_COMPARATOR = new MyComparator();

	private static class MyComparator implements Comparator<EObject> {

		public int compare(EObject a, EObject b) {
			EObject aContainer = a.eContainer();
			EObject bContainer = b.eContainer();
			if (EcoreUtil.equals(aContainer, bContainer)) {
				return 0;
			}
			if (aContainer == null) {
				return 1;
			}
			if (bContainer == null) {
				return -1;
			}
			return compare(aContainer, bContainer);
		}

	}

	public double getScalingFactor() {
		return scalingFactor;
	}

	/**
	 * @return the map containing object's coordinates
	 */
	public Map<Rectangle, EObject> getPositionMap() {
		if (diagram == null || imageFile == null || !imageFile.exists()) {
			return Collections.emptyMap();
		}

		final Map<Rectangle, EObject> result = new LinkedHashMap<>();
		final String diagramId = EcoreUtil.getURI(diagram).fragment();
		if (COORDINATES_MAP.containsKey(diagramId)) 
		{
			final Map<Rectangle, EObject> map = COORDINATES_MAP.get(diagramId);
			if (! map.isEmpty())
			{
				result.putAll(map);
			}
		}
		else
		{
			PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
				public void run() {
					try {
						result.putAll(getResultMap());

						if (! result.isEmpty()) {
							COORDINATES_MAP.put(diagramId, result);
						}

					} catch (Exception e) {
						Activator.logWarning(e.getMessage());
					}
				}
			});
		}

		// Clean positions of all out of scope model element 
		return removeObjectOutOfScope(result);
	}

	/**
	 * Remove generated Rectangle for out of scope model element. 
	 * @param postitions a {@link Map} containing areas.
	 * @return a cleaned {@link Map} containing only areas for in scope model elements.
	 */
	private Map<Rectangle, EObject> removeObjectOutOfScope(Map<Rectangle, EObject> postitions){
		if (GenerationGlobalScope.getInstance().getScopeStatus().equals(ScopeStatus.LIMITED))
		{
			final Map<Rectangle, EObject> result = new LinkedHashMap<>();
			for (Entry<Rectangle, EObject> entry : postitions.entrySet()) 
			{
				final EObject value = entry.getValue();
				if (value instanceof DRepresentationDescriptor) {
					/*
					 * Handle navigable note
					 */

					boolean isInScope = GenerationGlobalScope.getInstance().isCopyInScope(((DRepresentationDescriptor)value).getTarget());

					if (isInScope) {
						Collection<DRepresentation> allRepresentations = DialectManager.INSTANCE.getAllRepresentations(session);
						final DDiagram candidateDiagram = DiagramSessionHelper.findCorrespondingDiagram((DRepresentationDescriptor)value, allRepresentations);

						/**
						 * Handle only DSemanticDiagram. Table and other diagrams are not exported. Notes which navigate
						 * to other diagrams will be not navigable in exported HTML.
						 */
						if (candidateDiagram instanceof DSemanticDiagram) {
							result.put(entry.getKey(), value);
						}
					}
				} else {
					final boolean isInScope = GenerationGlobalScope.getInstance().isCopyInScope(value);
					if (isInScope) {
						result.put(entry.getKey(), value);
					}
				}
			}
			return result;
		}
		else
		{
			return postitions;
		}
	}

	/**
	 * Because the graphical representation of one {@link DDiagramElement} can be composed of many views, 
	 * so we have to accept a view only if the element associated with it is different from the one associated 
	 * with it parent.
	 * 
	 * @param view {@link View} element
	 * @return True if the view is the main one, False otherwise.
	 */
	private boolean acceptView(View view){
		final EObject element = view.getElement();
		final EObject eContainer = view.eContainer();
		final EObject containerView = eContainer;
		if (containerView instanceof View)
		{
			final EObject containerElement = ((View) containerView).getElement();
			return ! containerElement.equals(element);
		}
		throw new IllegalArgumentException("Illegal parameter: Class -> " + this.getClass().getName() + ", method -> acceptView(View view)");
	}
	
	@Deprecated
	public Map<Rectangle, EObject> getRectanglesMap(View view, Map<?, ?> registry, int deltaX, int deltaY) {
		Map<Rectangle, EObject> result = new LinkedHashMap<>();

		GraphicalEditPart gep = (GraphicalEditPart) registry.get(view);
		if (gep != null) 
		{
			final EObject nodeElement = view.getElement();

			if (gep instanceof SiriusNoteEditPart && ((SiriusNoteEditPart)gep).isRepresentationLink()) {
				
				/*
				 * Handle navigable note
				 */
				
				if (nodeElement instanceof DRepresentationDescriptor) {
					DRepresentationDescriptor descriptor = (DRepresentationDescriptor)nodeElement;

					Rectangle bounds = null;
					bounds = gep.getFigure().getBounds();
					bounds = bounds.getCopy();
					scale(bounds);
					if (bounds != null) {
						bounds.performTranslate(deltaX, deltaY);
					}

					final boolean acceptView = acceptView(view);
					if (acceptView) {
						result.put(bounds, descriptor);
					}
				}
			} else {
				if (nodeElement instanceof DDiagramElement) 
				{
					final DDiagramElement element = (DDiagramElement) nodeElement;
					final EObject eObject = getSemanticElement(element);

					Rectangle bounds = null;
					// If the view is an Edge, so handle the bounds of it center label
					if (view instanceof Edge) 
					{
						if (gep.getFigure() instanceof ViewEdgeFigure) 
						{
							Rectangle originalBound = ((ViewEdgeFigure) gep.getFigure()).getFigureViewEdgeNameFigure().getBounds();
							bounds = new Rectangle(originalBound);
						}
					}
					else
					{
						Rectangle originalBound = gep.getFigure().getBounds();
						bounds = new Rectangle(originalBound);
					}

					scale(bounds);

					// Translate parent before handling children
					if (bounds != null) 
					{
						bounds.performTranslate(deltaX, deltaY);
					}

					final boolean acceptView = acceptView(view);

					// Handle children of the current view.
					if (! (view instanceof Edge)) 
					{
						@SuppressWarnings("rawtypes")
						final EList children = view.getChildren();
						for (Object object : children) 
						{
							if (object instanceof View)
							{
								int newDeltaX = acceptView && ! isBorderedNode((View)object) ? bounds.x + 5 : deltaX;
								int newDeltaY = acceptView && ! isBorderedNode((View)object) ? bounds.y + 6 : deltaY;
								final Map<Rectangle, EObject> rectanglesMap = getRectanglesMap((View) object, registry, newDeltaX  , newDeltaY  );
								if (! rectanglesMap.isEmpty())
									result.putAll(rectanglesMap);
							}
						}
					}

					// Handle current view
					if (acceptView && helpers.stream().anyMatch(help -> help.select(eObject))) 
					{
						result.put(bounds, eObject);
					}
				}
			}
		}
		return result;
	}
	
	/**
	 * Compute and format the {@code <Rectangle,EObject>} pair for the {@code info} element
	 * @param info An info element
	 * @param registry
	 * @param deltaX X coordinate shift to be applied on edge elements rectangle
	 * @param deltaY Y coordinate shift to be applied on edge elements rectangle
	 * @return A {@code <Rectangle,EObject>} entry for the {@code info} element
	 */
	public Map<Rectangle, EObject> getInfoRectangleMap(PartPositionInfo info, Map<?, ?> registry, int deltaX, int deltaY) {
		Map<Rectangle, EObject> result = new LinkedHashMap<>();

		final EObject nodeElement = info.getView().getElement();
		final View view = info.getView();
		Rectangle bounds = new Rectangle(info.getPartX(), info.getPartY(), info.getPartWidth(), info.getPartHeight());

		/*
		 * Handle navigable note
		 */
		if (nodeElement instanceof DRepresentationDescriptor) {
			DRepresentationDescriptor descriptor = (DRepresentationDescriptor)nodeElement;
			final boolean acceptView = acceptView(view);
			if (acceptView) {
				result.put(bounds, descriptor);
			}
		} else if (nodeElement instanceof DDiagramElement) {
			final DDiagramElement element = (DDiagramElement) nodeElement;
			final EObject eObject = getSemanticElement(element);

			if (view instanceof Edge) 
			{
				// If the view is an Edge, so handle the bounds of it center label
				GraphicalEditPart gep = (GraphicalEditPart) registry.get(view);
				if (gep.getFigure() instanceof ViewEdgeFigure) 
				{
					Rectangle originalBound = ((ViewEdgeFigure) gep.getFigure()).getFigureViewEdgeNameFigure().getBounds();
					bounds = new Rectangle(originalBound);
					scale(bounds);
					if (bounds != null) 
					{
						bounds.performTranslate(deltaX, deltaY);
					}
				}
			}

			final boolean acceptView = acceptView(view);
			
			// Handle current view
			if (acceptView && helpers.stream().anyMatch(help -> help.select(eObject)))
			{
				result.put(bounds, eObject);
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private Map<Rectangle, EObject> getResultMap() {
		Diagram gmfDiagram = getDiagram();
		if (gmfDiagram != null) 
		{
			if (gmfDiagram.eIsProxy()) {
				gmfDiagram = (Diagram) EcoreUtil.resolve(gmfDiagram, gmfDiagram.eContainer());
			}
			Shell shell = new Shell();

			DiagramEditPart diagramEP = tool.createDiagramEditPart(gmfDiagram,
					shell, PreferencesHint.USE_DEFAULTS);
			/* refresh to avoid blank images */
			diagramEP.getRoot().refresh();

			/* validate to have all nodes in the right position */
			diagramEP.getFigure().validate();
			/*
			 * In the case of connection on EditParts created during first
			 * Refresh they will not appear until we refresh a second time
			 * Example of such cases are exchanges on DFI (mch)
			 */
			diagramEP.getRoot().refresh();

			/*
			 * flush the viewer to have all connections and ports
			 */
			EditPartViewer viewer = diagramEP.getViewer();

			viewer.flush();
			Map<?, ?> registry = viewer.getEditPartRegistry();

			Dimension imageSize = getImageSize();
			int width = imageSize.width;
			int height = imageSize.height;

			Rectangle imageBounds = DiagramImageUtils.calculateImageRectangle(diagramEP.getPrimaryEditParts(), 10, new Dimension(10, 10));

			scalingFactor = SiriusHelper.initAutoScaling(tool, diagramEP);

			scale(imageBounds);

			int deltaX = imageBounds.getTopRight().x - width;
			int deltaY = imageBounds.getBottomLeft().y - height;

			Map<Rectangle, EObject> result = new LinkedHashMap<>();

			SiriusDiagramSVGGenerator gen = new SiriusDiagramSVGGenerator(diagramEP, true);
			List<PartPositionInfo> infos = gen.getDiagramPartInfo();
			infos.stream().filter(info -> info.getView().getElement() != null).forEach(info -> {
				result.putAll(getInfoRectangleMap(info, registry, -deltaX, -deltaY));
			});

			cleanGenerationData(gmfDiagram, shell, diagramEP);
			return result;
		}
		return Collections.emptyMap();
	}


	/**
	 * Scale the translatable is the factor is less than 1
	 * @param t to scale
	 */
	private void scale(Translatable t) {
		double factor = getScalingFactor();
		if (factor < 1.0d && t != null) {
			t.performScale(factor);
		}
	}

	/**
	 * Check if the Edge has a Center Label.
	 * @param view an Edge
	 * @param registry
	 * @return True if the Edge has a Center label, False otherwise.
	 */
	private boolean edgeHasCenterLabel(View view, Map<?, ?> registry){
		final EObject element = view.getElement();
		if (element instanceof DEdgeImpl)
		{
			final String name = ((DEdgeImpl) element).getName();
			return name != null && name.trim().length() > 0;
		}
		else
			return false;
	}

	/**
	 * Clean data created to compute map areas.
	 * @param gmfDiagram the exported diagram {@link Diagram}
	 * @param shell a {@link Shell}
	 * @param diagramEP {@link DiagramEditPart}
	 */
	private void cleanGenerationData(Diagram gmfDiagram, Shell shell, DiagramEditPart diagramEP) {
		shell.dispose();
		// //
		diagramEP.deactivate();
		// Memory leak : also disposing the
		// DiagramGraphicalViewer associated to this
		// DiagramEditPart
		diagramEP.getViewer().flush();
		CommandStack commandStack = diagramEP.getViewer().getEditDomain().getCommandStack();
		commandStack.flush();

		if (diagramEP.getViewer().getControl() != null)
		{
			diagramEP.getViewer().getControl().dispose();
		}

		((DiagramEditDomain) diagramEP.getViewer().getEditDomain()).removeViewer(diagramEP.getViewer());

		//
		DiagramEventBroker.stopListening(TransactionUtil
				.getEditingDomain(gmfDiagram));

		if (commandStack instanceof DiagramCommandStack) 
		{
			IOperationHistory operationHistory = OperationHistoryFactory.getOperationHistory();
			operationHistory.dispose(((DiagramCommandStack) commandStack).getUndoContext(),
					true, true, true);
		}
	}

	private Dimension getImageSize() {
		try {
			if (imageFile != null && imageFile.exists()) {
				String fullPath = imageFile.getLocation().toString();
				ImageInputStream imageInputStream = null;
				try {
					imageInputStream = ImageIO.createImageInputStream(new File(fullPath));
					ImageReader reader = getImageReader();
					reader.setInput(imageInputStream);
					if (reader.getInput() != null) {
						return new Dimension(reader.getWidth(0), reader.getHeight(0));
					}
				} finally {
					if (null != imageInputStream) {
						imageInputStream.close();
					}
				}
			}
		} catch (Exception e) {
			Activator.logWarning(e.getMessage());
		}
		return new Dimension(-1, -1);
	}

	private Diagram getDiagram() {

		for (AnnotationEntry annotationEntry : diagram.getOwnedAnnotationEntries()) 
		{
			if (annotationEntry.getSource().equals("GMF_DIAGRAMS")) 
			{
				EObject data = annotationEntry.getData();
				if (data instanceof Diagram)
					return (Diagram) data;
			}
		}
		// try to find out gmf diagram by an other way (if annotation
		// GMF_DIAGRAMS doesn't exist)
		final Resource airdResource;
		if (diagram.eResource() != null) 
		{
			airdResource = diagram.eResource();
		}
		else 
		{
			airdResource = session.getSessionResource();
		}
		TreeIterator<EObject> allContents = airdResource.getAllContents();
		while (allContents.hasNext()) 
		{
			EObject eObject = allContents.next();
			if (eObject instanceof Diagram) 
			{
				Diagram gmfDiag = (Diagram) eObject;
				if (EcoreUtil.equals(gmfDiag.getElement(), diagram)) 
				{
					return gmfDiag;
				}
			}
		}
		return null;
	}

	private boolean isBorderedNode(View node) {
		EObject element = node.getElement();
		if (element instanceof DNode) 
		{
			EObject parent = element.eContainer();
			if (parent instanceof AbstractDNode) 
			{
				return ((AbstractDNode) parent).getOwnedBorderedNodes().contains(element);
			}
		}
		return false;
	}

	private EObject getSemanticElement(DDiagramElement element) {
		Collection<EObject> semanticObjects = helpers.stream()
				.map(help -> help.getSemanticElement(element))
				.filter(semElem -> semElem != null)
				.collect(Collectors.toSet());
		if (!semanticObjects.isEmpty()) {
			IDiagramHelper semanticObjectHelper = null;
			for (EObject object: semanticObjects) {
				semanticObjectHelper = helperMap.get(object.getClass().getCanonicalName());
			}
			// helper is still null so its the first iteration on this type of objects
			if (semanticObjectHelper == null) {
				for (EObject object: semanticObjects) {
					Optional<IDiagramHelper> optHelp = helpers.stream().filter(help -> help.select(object)).findFirst();
					if (optHelp.isPresent()) {
						helperMap.put(object.getClass().getCanonicalName(), optHelp.get());
						return object;
					}
				}
			} else {
				return semanticObjectHelper.getSemanticElement(element);
			}
		}
		return null;
	}


	// Faire une translation pour les objects contenus
	// Cette translation est due au fait que les coordonnées des objects
	// contenus sont relatifs aux conteneurs.
	@Deprecated
	private Map<Rectangle, EObject> proceed(Map<Rectangle, EObject> resultMap, Map<View, EObject> nodeMap) {
		Map<Rectangle, EObject> map = new HashMap<Rectangle, EObject>(resultMap);

		ArrayList<View> arrayList = new ArrayList<View>(nodeMap.keySet());

		Collections.sort(arrayList, MY_COMPARATOR);

		// Result to return.
		Map<Rectangle, EObject> result = new LinkedHashMap<Rectangle, EObject>();

		ArrayList<EObject> keyList = new ArrayList<EObject>();
		for (View node : arrayList) 
		{
			EObject childObject = nodeMap.get(node);
			keyList.add(childObject);
			Rectangle childRectangle = getRectangle(map, childObject);
			translateContainedRectangle(map, node, childRectangle);
		}

		for (EObject key : keyList) 
		{
			result.put(getRectangle(map, key), key);
		}
		return result;
	}

	/**
	 * Get the Rectangle from the Map. Rectangle are key of the Map.
	 * @param map
	 * @param modelElement
	 * @return
	 */
	@Deprecated
	private Rectangle getRectangle(Map<Rectangle, EObject> map, EObject modelElement){
		for (Map.Entry<Rectangle, EObject> entry : map.entrySet()) 
		{
			if (entry.getValue().equals(modelElement))
				return entry.getKey();
		}

		throw new RuntimeException("Can't get rectable form model element: " + modelElement.toString());
	}

	@Deprecated
	private void translateContainedRectangle(Map<Rectangle, EObject> map, View node, Rectangle childRectangle) {
		if (!isBorderedNode(node)) 
		{
			Set<EObject> parentList = getParentList(node);
			for (EObject parentObject : parentList) 
			{
				Rectangle parentRectangle = getRectangle(map, parentObject);
				Point topLeft = parentRectangle.getTopLeft();
				// Translation
				childRectangle.performTranslate(topLeft.x + 5, topLeft.y + 6);
			}
		}
	}

	@Deprecated
	private Set<EObject> getParentList(View childNode) {
		Set<EObject> set = new HashSet<EObject>();
		EObject eContainer = childNode.eContainer();
		if (eContainer == null || eContainer instanceof Diagram) {
			return Collections.emptySet();
		}

		if (eContainer instanceof Node) 
		{
			Node node = (Node) eContainer;
			EObject nodeElement = node.getElement();
			
			if (nodeElement instanceof DDiagramElement && helpers.stream().anyMatch(help -> help.isContainer((DDiagramElement) nodeElement))) 
			{
				DDiagramElement element = (DDiagramElement) nodeElement;
				EObject eObject = getSemanticElement(element);
				set.add(eObject);
			}
			set.addAll(getParentList(node));
		}
		return set;
	}

	@Deprecated
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private List<Object> getChildren(View view) {
		List<Object> result = new ArrayList<Object>();
		EList children = view.getChildren();
		result.addAll(children);
		for (Object object : children) 
		{
			if (object instanceof View) 
			{
				View child = (View) object;
				result.addAll(getChildren(child));
			}
		}
		return result;
	}

	/**
	 * Synchronizes the diagram with its designer diagram.
	 * 
	 * @param diagram
	 *            the diagram to synchronize.
	 */
	@Deprecated
	private void synchronizeDiagram(final Diagram diagram, final TransactionalEditingDomain domain) {
		// Do nothing. To remove in the next version
	}
}
