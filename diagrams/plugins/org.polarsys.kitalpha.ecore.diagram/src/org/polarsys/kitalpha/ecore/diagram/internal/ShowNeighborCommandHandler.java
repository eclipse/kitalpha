package org.polarsys.kitalpha.ecore.diagram.internal;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DragAndDropTarget;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.tools.api.command.view.CreateDDiagramElementCommand;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationElementMapping;
import org.eclipse.ui.PlatformUI;

public class ShowNeighborCommandHandler extends AbstractHandler {

//	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		DiagramEditor diagramEditor = (DiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		IDiagramGraphicalViewer viewer = diagramEditor.getDiagramGraphicalViewer();

		EditPart editPart = viewer.getFocusEditPart();
		DDiagramElement diagramElement = ((DDiagramElement) ((Node) editPart.getModel()).getElement());
		EObject eObject = diagramElement.getTarget();

		if (eObject instanceof EClass) 
		{
			EClass eClass = (EClass) eObject;
			Collection<EClass> neigbors = getNeighbor(eClass);

			RepresentationElementMapping mapping = diagramElement.getMapping();
			final EObject container = diagramElement.eContainer();

			CompoundCommand command = new CompoundCommand();
			TransactionalEditingDomain editingDomain = (TransactionalEditingDomain) AdapterFactoryEditingDomain.getEditingDomainFor((DragAndDropTarget) container);
			
			for (EClass nb : neigbors) 
			{
				Command nodeCreationCmd = new CreateDDiagramElementCommand(editingDomain, nb, (AbstractNodeMapping) mapping, (DragAndDropTarget) container);
				command.append(nodeCreationCmd);
			}
			
			Command refreshCmd = new RecordingCommand(editingDomain) {
				@Override
				protected void doExecute() {
					DialectManager.INSTANCE.refresh((DRepresentation) container,  new NullProgressMonitor());
				}

			};
			command.append(refreshCmd);
			
			editingDomain.getCommandStack().execute(command);
		}
		return null;
	}

	public static Collection<EClass> getNeighbor(EClass eClass) {
		Collection<EClass> neigbors = new UniqueEList<EClass>();
		neigbors.addAll(eClass.getESuperTypes());
		for (EReference ref : eClass.getEReferences()) 
		{
			neigbors.add((EClass) ref.getEType());
		}

		Session session = SessionManager.INSTANCE.getSession(eClass);
		ECrossReferenceAdapter eCrossReferenceAdapter = session.getSemanticCrossReferencer();
		Collection<Setting> list = eCrossReferenceAdapter.getInverseReferences(eClass, true);
		if (list != null && list.size() > 0) 
		{
			List<EClass> local = new UniqueEList<EClass>();
			for (Setting s : list) 
			{
				EStructuralFeature structuralFeature = s.getEStructuralFeature();
				if (EcorePackage.Literals.ECLASS__ESUPER_TYPES.equals(structuralFeature)) 
				{
					local.add((EClass) s.getEObject());
				} 
				else 
				{
					if (EcorePackage.Literals.EREFERENCE__EREFERENCE_TYPE.equals(structuralFeature)) 
					{
						local.add((EClass) ((EReference) s.getEObject()).getEType());
					}
				}

			}
			neigbors.addAll(local);
		}
		return neigbors;
	}

}
