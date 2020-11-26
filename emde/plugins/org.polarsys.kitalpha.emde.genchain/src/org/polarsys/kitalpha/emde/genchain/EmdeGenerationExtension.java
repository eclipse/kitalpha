/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.genchain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.egf.core.domain.TargetPlatformResourceSet;
import org.eclipse.egf.model.pattern.Pattern;
import org.eclipse.egf.model.pattern.PatternFactory;
import org.eclipse.egf.model.pattern.Substitution;
import org.eclipse.egf.portfolio.genchain.extension.DefaultEmfGenerationExtension;
import org.eclipse.egf.portfolio.genchain.generationChain.EmfGeneration;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChainPackage;
import org.eclipse.egf.portfolio.genchain.utils.StringUtils;
import org.eclipse.emf.common.util.URI;
import org.polarsys.kitalpha.emde.genchain.extension.model.ExtensionFactory;

/**
 * @author Thomas Guiu
 * 
 */
public class EmdeGenerationExtension extends DefaultEmfGenerationExtension {
	private static final URI PATTERN_ECORE = URI.createURI("platform:/plugin/org.polarsys.kitalpha.emde.genchain/egf/EmdeExtension.fcore#_tgjjMMGjEd-9MM7ZmqaWEg", false);
	private static final URI PATTERN_GENMODEL = URI.createURI("platform:/plugin/org.polarsys.kitalpha.emde.genchain/egf/EmdeExtension.fcore#_WEYlsMI9Ed-9MM7ZmqaWEg", false);

	private static final List<String> CONFLICT_LIST = Arrays.asList(new String[] { "basic.emf.generation" });

	@Override
	public List<String> getConflictingExtensions() {
		return CONFLICT_LIST;
	}

	@Override
	public String getLabel() {
		return "Kitalpha eMDE Emf Generation";
	}

	@Override
	protected void computeDefaultProperties(Map<String, String> context) {
		super.computeDefaultProperties(context);
		String project = context.get(CONTEXT_CURRENT_PROJECT_NAME);
		final String modelName = context.get(CONTEXT_MODEL_NAME);
		if (project != null && modelName != null) {
			String base = project;
			int idx = project.lastIndexOf(".");
			if (idx != -1) {
				base = project.substring(0, idx) + ".model";
				project = base + '.' + modelName;
			}
			properties.put(GenerationChainPackage.eINSTANCE.getEmfGeneration_BasePackage(), base.toLowerCase());
			properties.put(GenerationChainPackage.eINSTANCE.getEmfGeneration_PluginName(), StringUtils.format1(project).toLowerCase());
		}
	};

	@Override
	public List<Substitution> getSubstitutions() {
		TargetPlatformResourceSet set = new TargetPlatformResourceSet();
		List<Substitution> substitutions = new ArrayList<Substitution>();
		final Substitution substitution = PatternFactory.eINSTANCE.createSubstitution();
		Pattern pattern = (Pattern) set.getEObject(PATTERN_GENMODEL, true);
		substitution.getReplacement().add(pattern);
		pattern = (Pattern) set.getEObject(PATTERN_ECORE, true);
		substitution.getReplacement().add(pattern);
		substitutions.add(substitution);
		return substitutions;
	}

	@Override
	protected EmfGeneration doCreateEcoreElement() {
		return ExtensionFactory.eINSTANCE.createEmdeGeneration();
	}
}
