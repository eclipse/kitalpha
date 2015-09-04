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
package org.polarsys.kitalpha.doc.gen.business.ecore.genchain.extension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.egf.core.domain.TargetPlatformResourceSet;
import org.eclipse.egf.model.pattern.Pattern;
import org.eclipse.egf.model.pattern.PatternFactory;
import org.eclipse.egf.model.pattern.Substitution;
import org.eclipse.egf.portfolio.genchain.extension.DefaultEmfDocumentationExtension;
import org.eclipse.egf.portfolio.genchain.generationChain.EcoreElement;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChainPackage;
import org.eclipse.emf.common.util.URI;
import org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.DocgenGenchainExtensionFactory;
import org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGeneration;

/**
 * @author Thomas Guiu, Boubekeur Zendagui
 */
public class KitalphaDocumentationExtension extends DefaultEmfDocumentationExtension { 
	private static final URI PATTERN = URI.createURI("platform:/plugin/org.polarsys.kitalpha.doc.gen.business.ecore.genchain/egf/DocgenGenchainExtension.fcore#_UcpgMB1kEeSL-4aCmHxj2g", false);

	private static final List<String> CONFLICT_LIST = Arrays.asList(new String[] { "basic.documentation.generation" });

	public List<String> getConflictingExtensions() {
		return CONFLICT_LIST;
	}

	@Override
	public String getLabel() {
		return "Kitalpha Emf Documentation";
	}

	@Override
	protected void computeDefaultProperties(Map<String, String> context) {
		super.computeDefaultProperties(context);
		properties.put(GenerationChainPackage.eINSTANCE.getDocumentationGeneration_PluginName(), "org.polarsys.kitalpha.doc.generation");
	};

	@Override
	public List<Substitution> getSubstitutions() {
		TargetPlatformResourceSet set = new TargetPlatformResourceSet();
		List<Substitution> substitutions = new ArrayList<Substitution>();
		final Substitution substitution = PatternFactory.eINSTANCE.createSubstitution();
		final Pattern pattern = (Pattern) set.getEObject(PATTERN, true);
		substitution.getReplacement().add(pattern);
		substitutions.add(substitution);
		return substitutions;
	}

	@Override
	public EcoreElement createEcoreElement(Map<String, String> properties) {
		final KitalphaDocumentationGeneration element = DocgenGenchainExtensionFactory.eINSTANCE.createKitalphaDocumentationGeneration();
		String modelPath = properties.get(MODEL_PATH);
		element.setModelPath(modelPath);

		String out = properties.get(GenerationChainPackage.eINSTANCE.getDocumentationGeneration_OutputDirectoryPath().getName());
		element.setOutputDirectoryPath(out);

		String plugin = properties.get(GenerationChainPackage.eINSTANCE.getDocumentationGeneration_PluginName().getName());
		element.setPluginName(plugin);
		return element;
	}

}
