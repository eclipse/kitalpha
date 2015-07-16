package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpspecGrammarAccess;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecPackage;

@SuppressWarnings("all")
public class VpspecSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VpspecGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == VpspecPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case VpspecPackage.VIEWPOINT:
				if(context == grammarAccess.getViewpointRule()) {
					sequence_Viewpoint(context, (Viewpoint) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         shortName=ID? 
	 *         name=STRING 
	 *         description=EString? 
	 *         (parents+=[Viewpoint|FQN] parents+=[Viewpoint|FQN]*)? 
	 *         (dependencies+=[Viewpoint|FQN] dependencies+=[Viewpoint|FQN]*)? 
	 *         (useViewpoint+=[Viewpoint|FQN] useViewpoint+=[Viewpoint|FQN]*)? 
	 *         (useAnyEMFResource+=EString useAnyEMFResource+=EString*)? 
	 *         (useDiagramResource+=EString useDiagramResource+=EString*)? 
	 *         (useWorkspaceResource+=EString useWorkspaceResource+=EString*)? 
	 *         (useFSResource+=EString useFSResource+=EString*)? 
	 *         VP_Data=[Data|FQN]? 
	 *         (type+='UI' VP_Aspects+=[UIDescription|FQN])? 
	 *         (type+='Diagrams' VP_Aspects+=[DiagramSet|FQN])? 
	 *         (type+='Activity Explorer' VP_Aspects+=[ViewpointActivityExplorer|FQN])? 
	 *         (type+='Services' VP_Aspects+=[ServiceSet|FQN])? 
	 *         (type+='Build' VP_Aspects+=[Build|FQN])? 
	 *         (type+='Configuration' VP_Aspects+=[Configuration|FQN])?
	 *     )
	 */
	protected void sequence_Viewpoint(EObject context, Viewpoint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
