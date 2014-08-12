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
import java.util.Set;

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
import org.eclipse.emf.common.util.BasicEList;
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
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.render.util.DiagramImageUtils;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.doc.gen.business.core.util.IDiagramHelper;


import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.viewpoint.description.AnnotationEntry;

import org.eclipse.sirius.diagram.ui.edit.api.part.AbstractDiagramEdgeEditPart.ViewEdgeFigure;
import org.eclipse.sirius.diagram.ui.tools.api.part.DiagramEditPartService;

/**
 * @author S0021936
 * 
 */
public class CoordinatesCalculator {
	private static final String JPG = "JPG";
	private final ImageReader READER = (ImageReader) ImageIO.getImageReadersBySuffix(JPG).next();
	public static final Map<String, Map<EObject, Rectangle>> COORDINATES_MAP = new HashMap<String, Map<EObject, Rectangle>>();
	private IFile imageFile;
	private DDiagram diagram;
	private Map<EObject, Rectangle> postitionMap = new HashMap<EObject, Rectangle>();
	private IDiagramHelper helper;
	private EList children;
	private Session session;
	
	private static IProgressMonitor progressMonitor = new NullProgressMonitor();

	public CoordinatesCalculator(IFile imageFile, DDiagram diagram,
			IDiagramHelper filter) {
		this(imageFile, diagram, filter, null);
	}

	public CoordinatesCalculator(IFile imageFile, DDiagram diagram,
			IDiagramHelper filter, Session session) {
		super();
		this.imageFile = imageFile;
		if (diagram.eIsProxy()) {
			resolveProxy(diagram, session);
		} else {
			this.diagram = diagram;
		}
		this.helper = filter;
		if (session != null)
			this.session = session;
		else
			this.session = getSessionFromDiagram(diagram);
	}

	/**
	 * if diagram is a proxy we need to resolve it.
	 * 
	 * @param diagram
	 *            the ddiagram to resolve proxy.
	 * @param session
	 *            the doremi session referencing diagram resource. If null, we
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
		if (diagram instanceof DSemanticDiagram)
			return SessionManager.INSTANCE.getSession(((DSemanticDiagram) diagram).getTarget());
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

	/**
	 * @return the map containing object's coordinates
	 */
	public Map<EObject, Rectangle> getPositionMap() {
		if (diagram == null || imageFile == null || imageFile.exists() == false) {
			return Collections.emptyMap();
		}
		final String diagramId = EcoreUtil.getURI(diagram).fragment();
		if (COORDINATES_MAP.containsKey(diagramId)) {
			return COORDINATES_MAP.get(diagramId);
		}
		PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

			public void run() {
				try {
					postitionMap = getResultMap();
					COORDINATES_MAP.put(diagramId, postitionMap);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		return postitionMap;
	}

	@SuppressWarnings("unchecked")
	private Map<EObject, Rectangle> getResultMap() {
		Map<EObject, Rectangle> result = new HashMap<EObject, Rectangle>();
		Diagram gmfDiagram = getDiagram();
		if (gmfDiagram != null) 
		{
			if (gmfDiagram.eIsProxy()) {
				gmfDiagram = (Diagram) EcoreUtil.resolve(gmfDiagram, gmfDiagram.eContainer());
			}
			Shell shell = new Shell();

			final DiagramEditPartService tool = new DiagramEditPartService();
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
			Map<EObject, Rectangle> diagramMap = new HashMap<EObject, Rectangle>();
			Map<View, EObject> nodeMap = new HashMap<View, EObject>();

			List<Object> list = new ArrayList<Object>();
			List<EObject> translateList = new ArrayList<EObject>();
			Collection<? extends Object> allNodes = getChildren(gmfDiagram);
			list.addAll(allNodes);
			list.addAll(gmfDiagram.getEdges());
			children = new BasicEList();
			children.addAll(gmfDiagram.getChildren());
			children.addAll(gmfDiagram.getEdges());
			
			// /////////////////

			for (Object child : list) 
			{
				if (child instanceof View) 
				{
					View node = (View) child;
					GraphicalEditPart gep = (GraphicalEditPart) registry.get(node);
					if (gep != null) 
					{
						EObject nodeElement = node.getElement();
						if (nodeElement instanceof DDiagramElement) 
						{
							DDiagramElement element = (DDiagramElement) nodeElement;
							EObject eObject = getSemanticElement(element);
							if (!diagramMap.containsKey(eObject) && helper.select(eObject)) 
							{
								Rectangle bounds = gep.getFigure().getBounds();
								if (node instanceof Edge) 
								{
									// reduceBounds(bounds);
									if (gep.getFigure() instanceof ViewEdgeFigure) 
									{
										bounds = ((ViewEdgeFigure) gep
												.getFigure())
												.getFigureViewEdgeNameFigure()
												.getBounds();
										// diagramMap.put(eObject, rectangle);
									}
								}
								diagramMap.put(eObject, bounds);
								nodeMap.put(node, eObject);
								if (isDirectDiagramChild(node)) 
								{
									translateList.add(eObject);
								}
							}
						}
					}
				}
			}


			// Faire une translation de l'origine des objects contenus dans le
			// diagramme.
			// Cette translation est due au troncage en exportant le diagramme
			// en image.
			Dimension imageSize = getImageSize();
			int width = imageSize.width;
			int height = imageSize.height;
			Rectangle imageBounds = DiagramImageUtils.calculateImageRectangle(
					diagramEP.getPrimaryEditParts(), 10, new Dimension(10, 10));
			int deltaX = (imageBounds.getTopRight().x) - width;
			int deltaY = imageBounds.getBottomLeft().y - height;
			result.putAll(diagramMap);
			for (Entry<EObject, Rectangle> entry : diagramMap.entrySet()) 
			{
				EObject object = entry.getKey();
				if (translateList.contains(object)) 
				{
					Rectangle rectangle = entry.getValue();
					Point topLeft = rectangle.getTopLeft();
					Integer x1 = topLeft.x - deltaX;
					Integer y1 = topLeft.y - deltaY;
					Point bottomRight = rectangle.getBottomRight();
					Integer x2 = bottomRight.x - deltaX;
					Integer y2 = bottomRight.y - deltaY;
					Point newTopLeft = new Point(x1, y1);
					Point newBottomRight = new Point(x2, y2);
					result.put(object, new Rectangle(newTopLeft, newBottomRight));
				}
			}
			shell.dispose();

			Map<EObject, Rectangle> map = proceed(result, nodeMap);

			// //
			diagramEP.deactivate();
			// Memory leak : also disposing the
			// DiagramGraphicalViewer associated to this
			// DiagramEditPart
			diagramEP.getViewer().flush();
			CommandStack commandStack = diagramEP.getViewer().getEditDomain().getCommandStack();
			commandStack.flush();
			
			if (diagramEP.getViewer().getControl() != null)
				diagramEP.getViewer().getControl().dispose();
			
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
			// ((DefaultOperationHistory)operationHistory).

			//

			return map;
		}
		return Collections.emptyMap();
	}

	private boolean isDirectDiagramChild(View node) {
		if (children.contains(node)) {
			return true;
		} else {
			return getParentList(node).isEmpty();
		}
	}

	private EObject getSemanticElement(DDiagramElement element) {
		return helper.getSemanticElement(element);
	}


	// Faire une translation pour les objects contenus
	// Cette translation est due au fait que les coordonnées des objects
	// contenus sont relatifs aux conteneurs.
	private Map<EObject, Rectangle> proceed(Map<EObject, Rectangle> resultMap,
			Map<View, EObject> nodeMap) {
		Map<EObject, Rectangle> map = new HashMap<EObject, Rectangle>(resultMap);
		ArrayList<View> arrayList = new ArrayList<View>(nodeMap.keySet());
		Collections.sort(arrayList, MY_COMPARATOR);
		ArrayList<EObject> keyList = new ArrayList<EObject>();
		for (View node : arrayList) 
		{
			EObject childObject = nodeMap.get(node);
			keyList.add(childObject);
			Rectangle childRectangle = map.get(childObject);

			translateContainedRectangle(map, node, childRectangle);
		}

		Map<EObject, Rectangle> result = new LinkedHashMap<EObject, Rectangle>();
		for (EObject key : keyList) 
		{
			result.put(key, map.get(key));
		}
		// keyList = keys;
		// KEYS_MAP.put(diagram, keyList);
		return result;
	}

	private void translateContainedRectangle(Map<EObject, Rectangle> map, View node, Rectangle childRectangle) {
		if (!isBorderedNode(node)) 
		{
			Set<EObject> parentList = getParentList(node);
			for (EObject parentObject : parentList) 
			{
				Rectangle parentRectangle = map.get(parentObject);
				Point topLeft = parentRectangle.getTopLeft();
				// Translation
				childRectangle.performTranslate(topLeft.x + 5, topLeft.y + 6);
				// map.put(childObject, childRectangle);
			}
		}
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
			if (nodeElement instanceof DDiagramElement && helper.isContainer((DDiagramElement) nodeElement)) 
			{
				DDiagramElement element = (DDiagramElement) nodeElement;
				EObject eObject = getSemanticElement(element);
				set.add(eObject);
			}
			set.addAll(getParentList(node));
		}
		return set;
	}

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

	private Dimension getImageSize() {
		try {
			if (imageFile != null && imageFile.exists()) {
				String fullPath = imageFile.getLocation().toString();
				ImageInputStream imageInputStream = ImageIO
						.createImageInputStream(new File(fullPath));
				READER.setInput(imageInputStream);
				if (READER.getInput() != null) 
				{
					Dimension size = new Dimension(READER.getWidth(0), READER.getHeight(0));
					imageInputStream.close();
					return size;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
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

	/**
	 * Synchronizes the diagram with its designer diagram.
	 * 
	 * @param diagram
	 *            the diagram to synchronize.
	 */
	private void synchronizeDiagram(final Diagram diagram,
			final TransactionalEditingDomain domain) {
		// ViewpointGMFDiagramSynchronizer.synchronizeViewpointDiagram(diagram,
		// domain);
		// CanonicalSynchronizer canonicalSynchronizer =
		// CanonicalSynchronizerFactory.INSTANCE.createCanonicalSynchronizer(diagram);
		// canonicalSynchronizer.synchronize();
	}
}
