/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.templates.SimpleTemplateVariableResolver;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContext;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorer;


/**
 * 
 * @author Faycal Abka
 *
 */
public class ActivityExplorerTemplateVariableResolver extends CommonTemplateVariableResolver {
	
	public static final String PAGE_NAME = "pageName_id";
	public static final String PAGE_INDEX = "pageIndex";
	public static final String SECTION_NAME = "sectionName_id";
	public static final String SECTION_INDEX = "sectionIndex";
	public static final String ACTIVITY_NAME = "activityName_id";
	public static final String ACTIVITY_INDEX = "activityIndex";
	
	public static final String PAGE_NAME_DESCRIPTION = "Page Name for computing the id of the Page";
	public static final String PAGE_INDEX_DESCRIPTION = "Page Index for computing the index of the Page";
	public static final String SECTION_NAME_DESCRIPTION = "Section Name for computing the id of the Section";
	public static final String SECTION_INDEX_DESCRIPTION = "Section Index for computing the index of the Section";
	public static final String ACTIVITY_NAME_DESCRIPTION = "Activity Name for computing the id of the Activity";
	public static final String ACTIVITY_INDEX_DESCRIPTION = "Activity index for computing the index of the Activity";
	 
	private static final Map<URI, Long> pageIndexes = new HashMap<URI, Long>();
	private static final Map<URI, Long> sectionIndexes = new HashMap<URI, Long>();
	private static final Map<URI, Long> activityIndexes = new HashMap<URI, Long>();
	
	
	private static Map<URI, Boolean> updateMaps = new HashMap<URI, Boolean>();
	
	
	public static class PageName extends SimpleTemplateVariableResolver {

		protected PageName() {
			super(PAGE_NAME, PAGE_NAME_DESCRIPTION);
		}
		
		@Override
		protected String resolve(TemplateContext context) {
			initIdenxes(context);
			return computeId(context, true, "page_", pageIndexes);
		}
	}
	
	public static class PageIndex extends SimpleTemplateVariableResolver {

		protected PageIndex() {
			super(PAGE_INDEX, PAGE_INDEX_DESCRIPTION);
		}
		
		@Override
		protected String resolve(TemplateContext context) {
			initIdenxes(context);
			return String.valueOf(computeIndex(context, false, pageIndexes));
		}
	}
	
	public static class SectionName extends SimpleTemplateVariableResolver {

		protected SectionName() {
			super(SECTION_NAME, SECTION_NAME_DESCRIPTION);
		}
		
		@Override
		protected String resolve(TemplateContext context) {
			initIdenxes(context);
			return computeId(context, true, "section_", sectionIndexes);
		}
	}
	
	public static class SectionIndex extends SimpleTemplateVariableResolver {

		protected SectionIndex() {
			super(SECTION_INDEX, SECTION_INDEX_DESCRIPTION);
		}
		
		@Override
		protected String resolve(TemplateContext context) {
			initIdenxes(context);
			return String.valueOf(computeIndex(context, false, sectionIndexes));
		}
	}
	
	
	public static class ActivityName extends SimpleTemplateVariableResolver {

		protected ActivityName() {
			super(ACTIVITY_NAME, ACTIVITY_NAME_DESCRIPTION);
		}
		
		@Override
		protected String resolve(TemplateContext context) {
			initIdenxes(context);
			return computeId(context, true, "activity_", activityIndexes);
		}
	}
	
	public static class ActivityIndex extends SimpleTemplateVariableResolver {

		protected ActivityIndex() {
			super(ACTIVITY_INDEX, ACTIVITY_INDEX_DESCRIPTION);
		}
		
		@Override
		protected String resolve(TemplateContext context) {
			initIdenxes(context);
			return String.valueOf(computeIndex(context, false, activityIndexes));
		}
	}
	
	private static String computeId(TemplateContext context, boolean increment, String prefix, Map<URI, Long> map)
	{
		Long index = computeIndex(context, increment, map);
		return prefix + index;
	}
	
	private static Long computeIndex(TemplateContext context, boolean increment, Map<URI, Long> map)
	{
		
		if (map == null) {
			return Long.valueOf(0); //This for avoid throwing exception.
		}
		
		XtextTemplateContext xTemplateContext = (XtextTemplateContext)context;
		EObject model = xTemplateContext.getContentAssistContext().getCurrentModel();
		URI uri = EcoreUtil2.getNormalizedResourceURI(model);
		Long index = map.get(uri);
		
		if (index == null) {
			index = Long.valueOf(0);
			map.put(uri, index);
		}
		
		if (increment){
			index++;
			map.put(uri, index);
		}
		
		return index;
	}
	
	
	public static void initIdenxes(TemplateContext context)
	{
			XtextTemplateContext xTemplateContext = (XtextTemplateContext)context;
			ViewpointActivityExplorer model = (ViewpointActivityExplorer)EcoreUtil2.getRootContainer(xTemplateContext.getContentAssistContext().getCurrentModel());
			URI uri = EcoreUtil2.getNormalizedResourceURI(model);
		if (updateMaps.get(uri) == null || updateMaps.get(uri)){ //Interpreted that the templates needs to be updated
			pageIndexes.put(uri, (long) 1);
			sectionIndexes.put(uri, (long) 1);
			activityIndexes.put(uri, (long) 1);
			updateMaps.put(uri, false);
		}
	}
}
