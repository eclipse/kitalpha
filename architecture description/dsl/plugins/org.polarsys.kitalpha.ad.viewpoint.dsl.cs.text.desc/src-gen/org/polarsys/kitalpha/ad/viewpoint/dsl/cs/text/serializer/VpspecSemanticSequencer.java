/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.serializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpspecGrammarAccess;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecPackage;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class VpspecSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VpspecGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == VpspecPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case VpspecPackage.VIEWPOINT:
				sequence_Viewpoint(context, (Viewpoint) semanticObject); 
				return; 
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
	 *         (type+='Activity-Explorer' VP_Aspects+=[ViewpointActivityExplorer|FQN])? 
	 *         (type+='Services' VP_Aspects+=[ServiceSet|FQN])? 
	 *         (type+='Build' VP_Aspects+=[Build|FQN])? 
	 *         (type+='Configuration' VP_Aspects+=[Configuration|FQN])?
	 *     )
	 */
	protected void sequence_Viewpoint(EObject context, Viewpoint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
