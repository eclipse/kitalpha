/*******************************************************************************
 * Copyright (c) 2017, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpspecGrammarAccess;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecPackage;

@SuppressWarnings("all")
public class VpspecSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VpspecGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == VpspecPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case VpspecPackage.VIEWPOINT:
				sequence_Viewpoint(context, (Viewpoint) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Viewpoint returns Viewpoint
	 *
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
	protected void sequence_Viewpoint(ISerializationContext context, Viewpoint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
