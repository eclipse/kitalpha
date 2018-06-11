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
package org.polarsys.kitalpha.doc.gen.business.core.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.egf.model.pattern.Pattern;
import org.eclipse.egf.model.pattern.PatternException;
import org.eclipse.egf.model.pattern.PatternParameter;
import org.eclipse.egf.pattern.l10n.EGFPatternMessages;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.osgi.util.NLS;
import org.polarsys.kitalpha.doc.gen.business.core.helper.IConceptsHelper;
import org.polarsys.kitalpha.doc.gen.business.core.scope.SubClassEmfModelVisitorWithScoping;
import org.polarsys.kitalpha.doc.gen.business.core.services.ExtensionService;
import org.polarsys.kitalpha.doc.gen.business.core.services.IndexerService;


public class DocgenCommonSubClassEmfModelVisitor extends SubClassEmfModelVisitorWithScoping {

	private List<Pattern> originePatterns;

	@Override
	public void setPatterns(List<Pattern> patterns) throws PatternException {
		for (Pattern p : patterns) 
		{
			EList<PatternParameter> parameters = p.getAllParameters();
			if (parameters.size() != 1) {
				throw new PatternException(NLS.bind(EGFPatternMessages.strategy_error4, p.getName()));
			}
			
			registerPattern(p, parameters.get(0));
		}
		this.originePatterns = patterns;
	}

	private void registerPattern(Pattern p, PatternParameter patternParameter) {
		String type = patternParameter.getType();
		List<Pattern> patterns = type2patterns.get(type);
		if (patterns == null)
		{
			patterns = new ArrayList<Pattern>();
			type2patterns.put(type, patterns);
		}
		
		patterns.add(p);
	}

	@Override
	protected List<Pattern> findPatterns(Object model) {
		if (model instanceof EObject) 
		{
			indexElement(model);
			List<Pattern> list = new ArrayList<Pattern>();
			List<EClass> eAllSuperTypes = getSuperTypes(model);
			// also useful to match all eObjects
			eAllSuperTypes.add(EcorePackage.eINSTANCE.getEObject());
			for (EClass superType : eAllSuperTypes) 
			{
				String fullName = EcoreUtil.getURI(superType).toString();
				List<Pattern> patterns = type2patterns.get(fullName);
				if (patterns != null) {
					list.addAll(patterns);
				}
			}

			List<Pattern> result = new ArrayList<Pattern>();
			for (Pattern pattern : originePatterns) 
			{
				if (list.contains(pattern)) {
					result.add(pattern);
				}
			}
			return result;
		}

		return Collections.emptyList();
	}

	private void indexElement(Object model) {
		List<IConceptsHelper> conceptsHelperList = ExtensionService.INSTANCE.getConceptsHelpersList();
		if (conceptsHelperList != null && ! conceptsHelperList.isEmpty())
		{
			for (IConceptsHelper iConceptsHelper : conceptsHelperList) 
			{
				if (iConceptsHelper.accept(model))
				{
					String conceptLabel = iConceptsHelper.getConceptLabel(model);
					if (!IndexerService.INSTANCE.checkConceptExistence(conceptLabel)) {
						IndexerService.INSTANCE.getElements().add(conceptLabel);
					}

					break;
				}
			}
		}
	}

}
