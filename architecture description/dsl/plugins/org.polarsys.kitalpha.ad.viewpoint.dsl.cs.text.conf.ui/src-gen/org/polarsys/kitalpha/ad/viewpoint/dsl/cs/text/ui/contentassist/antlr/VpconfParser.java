/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpconfGrammarAccess;

import com.google.inject.Inject;

public class VpconfParser extends AbstractContentAssistParser {
	
	@Inject
	private VpconfGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpconfParser createParser() {
		org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpconfParser result = new org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpconfParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getConfigurationElementAccess().getAlternatives(), "rule__ConfigurationElement__Alternatives");
					put(grammarAccess.getExtensionGeneratrionConfigurationAccess().getAlternatives(), "rule__ExtensionGeneratrionConfiguration__Alternatives");
					put(grammarAccess.getQualifierAccess().getAlternatives_0(), "rule__Qualifier__Alternatives_0");
					put(grammarAccess.getQualifierAccess().getAlternatives_1(), "rule__Qualifier__Alternatives_1");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getConfigurationAccess().getGroup(), "rule__Configuration__Group__0");
					put(grammarAccess.getTargetApplicationAccess().getGroup(), "rule__TargetApplication__Group__0");
					put(grammarAccess.getGenerationConfigurationAccess().getGroup(), "rule__GenerationConfiguration__Group__0");
					put(grammarAccess.getGenerationConfigurationAccess().getGroup_3(), "rule__GenerationConfiguration__Group_3__0");
					put(grammarAccess.getGenerationAccess().getGroup(), "rule__Generation__Group__0");
					put(grammarAccess.getGDataAccess().getGroup(), "rule__GData__Group__0");
					put(grammarAccess.getGDataAccess().getGroup_3(), "rule__GData__Group_3__0");
					put(grammarAccess.getGDataAccess().getGroup_3_0(), "rule__GData__Group_3_0__0");
					put(grammarAccess.getGDataAccess().getGroup_3_1(), "rule__GData__Group_3_1__0");
					put(grammarAccess.getGDataAccess().getGroup_3_2(), "rule__GData__Group_3_2__0");
					put(grammarAccess.getGDataAccess().getGroup_3_3(), "rule__GData__Group_3_3__0");
					put(grammarAccess.getGDataAccess().getGroup_3_4(), "rule__GData__Group_3_4__0");
					put(grammarAccess.getGDataAccess().getGroup_3_5(), "rule__GData__Group_3_5__0");
					put(grammarAccess.getDiagramGenerationConfigurationAccess().getGroup(), "rule__DiagramGenerationConfiguration__Group__0");
					put(grammarAccess.getDiagramGenerationConfigurationAccess().getGroup_3(), "rule__DiagramGenerationConfiguration__Group_3__0");
					put(grammarAccess.getDocumentationGenerationConfigurationAccess().getGroup(), "rule__DocumentationGenerationConfiguration__Group__0");
					put(grammarAccess.getDocumentationGenerationConfigurationAccess().getGroup_3(), "rule__DocumentationGenerationConfiguration__Group_3__0");
					put(grammarAccess.getModelsAirdGenerationConfigurationAccess().getGroup(), "rule__ModelsAirdGenerationConfiguration__Group__0");
					put(grammarAccess.getModelsAirdGenerationConfigurationAccess().getGroup_3(), "rule__ModelsAirdGenerationConfiguration__Group_3__0");
					put(grammarAccess.getReleaseAccess().getGroup(), "rule__Release__Group__0");
					put(grammarAccess.getReleaseAccess().getGroup_3(), "rule__Release__Group_3__0");
					put(grammarAccess.getReleaseAccess().getGroup_4(), "rule__Release__Group_4__0");
					put(grammarAccess.getReleaseAccess().getGroup_5(), "rule__Release__Group_5__0");
					put(grammarAccess.getReleaseAccess().getGroup_5_3(), "rule__Release__Group_5_3__0");
					put(grammarAccess.getReleaseAccess().getGroup_5_3_1(), "rule__Release__Group_5_3_1__0");
					put(grammarAccess.getViewConfigurationAccess().getGroup(), "rule__ViewConfiguration__Group__0");
					put(grammarAccess.getViewConfigurationAccess().getGroup_3(), "rule__ViewConfiguration__Group_3__0");
					put(grammarAccess.getViewConfigurationAccess().getGroup_4(), "rule__ViewConfiguration__Group_4__0");
					put(grammarAccess.getVersionAccess().getGroup(), "rule__Version__Group__0");
					put(grammarAccess.getVersionAccess().getGroup_1(), "rule__Version__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1_1(), "rule__Version__Group_1_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1_1_1(), "rule__Version__Group_1_1_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1_1_1_2(), "rule__Version__Group_1_1_1_2__0");
					put(grammarAccess.getQualifierAccess().getGroup(), "rule__Qualifier__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getConfigurationAccess().getNameAssignment_2(), "rule__Configuration__NameAssignment_2");
					put(grammarAccess.getConfigurationAccess().getVpConfigurationElementsAssignment_4(), "rule__Configuration__VpConfigurationElementsAssignment_4");
					put(grammarAccess.getTargetApplicationAccess().getTypeAssignment_2(), "rule__TargetApplication__TypeAssignment_2");
					put(grammarAccess.getGenerationConfigurationAccess().getProjectNameAssignment_2(), "rule__GenerationConfiguration__ProjectNameAssignment_2");
					put(grammarAccess.getGenerationConfigurationAccess().getNsuriAssignment_3_1(), "rule__GenerationConfiguration__NsuriAssignment_3_1");
					put(grammarAccess.getGenerationAccess().getOwnedDataGenerationConfAssignment_3(), "rule__Generation__OwnedDataGenerationConfAssignment_3");
					put(grammarAccess.getGenerationAccess().getOwnedExtensionGenConfAssignment_4(), "rule__Generation__OwnedExtensionGenConfAssignment_4");
					put(grammarAccess.getGDataAccess().getModelAssignment_3_0_2(), "rule__GData__ModelAssignment_3_0_2");
					put(grammarAccess.getGDataAccess().getEditAssignment_3_1_2(), "rule__GData__EditAssignment_3_1_2");
					put(grammarAccess.getGDataAccess().getEditorAssignment_3_2_2(), "rule__GData__EditorAssignment_3_2_2");
					put(grammarAccess.getGDataAccess().getTestAssignment_3_3_2(), "rule__GData__TestAssignment_3_3_2");
					put(grammarAccess.getGDataAccess().getJavaDocAssignment_3_4_2(), "rule__GData__JavaDocAssignment_3_4_2");
					put(grammarAccess.getGDataAccess().getOverwriteEcoreAssignment_3_5_2(), "rule__GData__OverwriteEcoreAssignment_3_5_2");
					put(grammarAccess.getDiagramGenerationConfigurationAccess().getOverwriteVSMAssignment_3_2(), "rule__DiagramGenerationConfiguration__OverwriteVSMAssignment_3_2");
					put(grammarAccess.getDocumentationGenerationConfigurationAccess().getEcoreToHtmlAssignment_3_1(), "rule__DocumentationGenerationConfiguration__EcoreToHtmlAssignment_3_1");
					put(grammarAccess.getModelsAirdGenerationConfigurationAccess().getGenRepresentationsAssignment_3_2(), "rule__ModelsAirdGenerationConfiguration__GenRepresentationsAssignment_3_2");
					put(grammarAccess.getReleaseAccess().getViewpointVersionAssignment_3_2(), "rule__Release__ViewpointVersionAssignment_3_2");
					put(grammarAccess.getReleaseAccess().getViewpointDescriptionAssignment_4_2(), "rule__Release__ViewpointDescriptionAssignment_4_2");
					put(grammarAccess.getReleaseAccess().getRequiredExecutionEnvironmentAssignment_5_3_0(), "rule__Release__RequiredExecutionEnvironmentAssignment_5_3_0");
					put(grammarAccess.getReleaseAccess().getRequiredExecutionEnvironmentAssignment_5_3_1_1(), "rule__Release__RequiredExecutionEnvironmentAssignment_5_3_1_1");
					put(grammarAccess.getViewConfigurationAccess().getVisibleAssignment_3_2(), "rule__ViewConfiguration__VisibleAssignment_3_2");
					put(grammarAccess.getViewConfigurationAccess().getActivableAssignment_4_2(), "rule__ViewConfiguration__ActivableAssignment_4_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpconfParser typedParser = (org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.antlr.internal.InternalVpconfParser) parser;
			typedParser.entryRuleConfiguration();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public VpconfGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(VpconfGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
