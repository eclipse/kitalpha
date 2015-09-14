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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.documentation;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Tuples;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Activity;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ActivityExplorerItem;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Overview;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Page;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.Section;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.util.ProjectUtil;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ActivityExplorerHover extends CommonEObjectHover {
	
	private static boolean descriptionSelector = false;
	private static boolean iconSelector = false;
	private static boolean activitiesSelectors = false;
	private static boolean headerSelector = false;
	
	@Override
	protected Pair<EObject, IRegion> getXtextElementAt(XtextResource resource, final int offset) {
		IParseResult parseResult = resource.getParseResult();
		if (parseResult != null){
			ILeafNode leafNode = NodeModelUtils.findLeafNodeAtOffset(parseResult.getRootNode(), offset);
			String value = leafNode.getText();
			
			if (value != null && value.equals("page")){ //$NON-NLS-1$
				EObject semanticObject = NodeModelUtils.findActualSemanticObjectFor(leafNode);
				if (semanticObject != null && semanticObject instanceof Page){
					return Tuples.create(semanticObject, (IRegion)new Region(leafNode.getOffset(), leafNode.getLength()));
				}
			}
			
			if (value != null && value.equals("header")){ //$NON-NLS-1$
				EObject semanticObject = NodeModelUtils.findActualSemanticObjectFor(leafNode);
				if (semanticObject != null && semanticObject instanceof Page){
					headerSelector = true;
					return Tuples.create(semanticObject, (IRegion)new Region(leafNode.getOffset(), leafNode.getLength()));
				}
			}
			
			if (value != null && value.equals("description")){ //$NON-NLS-1$
				EObject semanticObject = NodeModelUtils.findActualSemanticObjectFor(leafNode);
				if (semanticObject != null){
					descriptionSelector = true;
					return Tuples.create(semanticObject, (IRegion)new Region(leafNode.getOffset(), leafNode.getLength()));
				}
			}
			
			if (value != null && value.equals("icon")){ //$NON-NLS-1$
				EObject semanticObject = NodeModelUtils.findActualSemanticObjectFor(leafNode);
				if (semanticObject != null && semanticObject instanceof Activity){
					iconSelector = true;
					return Tuples.create(semanticObject, (IRegion)new Region(leafNode.getOffset(), leafNode.getLength()));
				}
			}
			
			if (value != null && value.equals("activity")){ //$NON-NLS-1$
				EObject semanticObject = NodeModelUtils.findActualSemanticObjectFor(leafNode);
				if (semanticObject != null && semanticObject instanceof Activity){
					return Tuples.create(semanticObject, (IRegion)new Region(leafNode.getOffset(), leafNode.getLength()));
				}
			}
			
			if (value != null && value.equals("activities")){ //$NON-NLS-1$
				EObject semanticObject = NodeModelUtils.findActualSemanticObjectFor(leafNode);
				if (semanticObject != null && semanticObject instanceof Section){
					activitiesSelectors = true;
					return Tuples.create(semanticObject, (IRegion)new Region(leafNode.getOffset(), leafNode.getLength()));
				}
			}
			
			if (value != null && value.equals("section")){ //$NON-NLS-1$
				EObject semanticObject = NodeModelUtils.findActualSemanticObjectFor(leafNode);
				if (semanticObject != null && semanticObject instanceof Section){
					return Tuples.create(semanticObject, (IRegion)new Region(leafNode.getOffset(), leafNode.getLength()));
				}
			}
		}
		return super.getXtextElementAt(resource, offset);
	}
	
	@Override
	public Object getHoverInfo(EObject first, ITextViewer textViewer, IRegion hoverRegion) {
			if (first instanceof Overview){
				Overview overview = (Overview)first;
				return getOverviewHTMLText(overview);
			}
			
			if (first instanceof Page){
				Page page = (Page)first;
				if (headerSelector){
					return getHeaderHTMLText(page);
				}
				
				return getPageHTMLText(page);
			}
			
			if (first instanceof Section){
				Section section = (Section)first;
				if (descriptionSelector){
					descriptionSelector = false;
					return section.getDescription();
				}
				
				if (activitiesSelectors){
					activitiesSelectors = false;
					return getActivitiesHTMLText(section);
				}
				
				return getSectionHTMLText(section);
			}
			
			if (first instanceof Activity){
				Activity activity = (Activity)first;
				
				return getActivityHTMLText(activity);
			}
			
			return super.getHoverInfo(first, textViewer, hoverRegion);
	}

	private Object getPageHTMLText(Page page) {
		StringBuffer result = new StringBuffer();
		EList<Section> ownedSections = page.getOwnedSections();
		
		result.append("<table border='0' width='100%'><tr><td colspan='2'><b>");
		setLabelOrName(page, result);
		result.append("</b></td></tr>");
		result.append("<tr><td width='20'></td><td>");
		for (Section section : ownedSections) {
			result.append(getSectionHTMLText(section));
		}
		result.append("</td></tr></table>");
		
		return result.toString();
	}

	private Object getSectionHTMLText(Section section) {
		StringBuffer result = new StringBuffer();
		
		result.append("<table border='0' width='100%'>");
		result.append("<tr>");
		result.append("<td  colspan='2' style='background:#CFCBFF; color:#333333'>");
		setLabelOrName(section, result);
		result.append("</td>");
		result.append("</tr><tr>");
		result.append("<td width='80'></td><td>");
		result.append(getActivitiesHTMLText(section));
		result.append("</td></tr></table>");
		
		return result.toString();
	}

	private Object getActivitiesHTMLText(Section section) {
		StringBuffer result = new StringBuffer();
		EList<Activity> ownedActivities = section.getOwnedActivities();
		
		for (Activity activity : ownedActivities) {
			result.append(getActivityDescription(activity));
			result.append("<br/>");
		}
		
		return result.toString();
	}

	private Object getActivityHTMLText(Activity activity) {
		
		if (descriptionSelector){
			descriptionSelector = false;
			return activity.getDescription();
		}
		
		if (iconSelector){
			iconSelector = false;
			return getActivityIcon(activity);
		}
		
		
		return getActivityDescription(activity);
	}

	private Object getActivityDescription(Activity activity) {
		StringBuffer result = new StringBuffer();
		
		result.append("<table border='0' width='100%'>");
		result.append("<tr>");
		result.append("<td  width='80'>");
		result.append(getActivityIcon(activity));
		result.append("</td>");
		result.append("<td>");
		result.append(getLink(activity));
		result.append("</td>");
		result.append("</table>");
		
		return result.toString();
	}

	private Object getLink(Activity activity) {
		String label = activity.getLabel();
		if (label == null || label.isEmpty())
			label = activity.getName();
		return "<a style='text-decoration: none; color:#000099'>" + label + "</a>";
	}

	private Object getActivityIcon(Activity activity) {
		StringBuffer result = new StringBuffer();
		
		String iconPath = activity.getImagePathOff();
		IProject project = ProjectUtil.getEclipseProjectOf(activity);
		IFolder iconsFolder = ProjectUtil.getFolderInProject(project, "icons");
		IFile icon = iconsFolder.getFile(iconPath);
		
		result.append("<img src='");
		if (icon != null)
			result.append(icon.getLocation().toPortableString());
		else
			result.append("icons/").append(iconPath);
		
		result.append("'/>");
		
		return result.toString();
	}

	private Object getOverviewHTMLText(Overview overview) {

		if (descriptionSelector){
			descriptionSelector = false;
			return overview.getDescription();
		}
		
		
		StringBuffer result = new StringBuffer();

		String description = overview.getDescription();
		String imageOn = overview.getImagePathOn();
		String imageOff = overview.getImagePathOff();


		Pair<IFile, IFile> icons = getIconFiles(overview, imageOn, imageOff);

		result.append("<table border='0' width='100%'>")
		.append("<tr><td width='150'><img src='");

		if (icons.getFirst() != null)
			result.append(icons.getFirst().getLocation().toPortableString());
		else
			result.append("icons/").append(imageOn);

		result.append("'/></td><td rowspan='2'/>").append(description)
		.append("</td></tr><tr><td width='150'><img src='");

		if (icons.getSecond() != null)
			result.append(icons.getSecond().getLocation().toPortableString());
		else
			result.append("icons/").append(imageOn);

		result.append("'/></td></tr></table>");

		return result.toString();
	}
	
	protected Pair<IFile, IFile> getIconFiles(EObject eObject, String first, String second){
		IProject project = ProjectUtil.getEclipseProjectOf(eObject);
		IFolder iconsFolder = ProjectUtil.getFolderInProject(project, "icons");
		IFile firstIcon = iconsFolder.getFile(first);
		IFile secondIcon = iconsFolder.getFile(second);
		
		return Tuples.create(firstIcon, secondIcon);
	}
	
	private Object getHeaderHTMLText(Page page) {
		
		if (descriptionSelector){
			descriptionSelector = false;
			return page.getDescription();
		}
		
		StringBuffer result = new StringBuffer();
		
		String iconOn = page.getImagePathOn();
		String iconOff = page.getImagePathOff();
		
		Pair<IFile, IFile> icons = getIconFiles(page, iconOn, iconOff);
		
		result.append("<table border='0' width='100%'>").append("<tr><td>");
		appendIconPath(result, icons.getFirst(), iconOn);
		result.append("</td><td>");
		appendIconPath(result, icons.getSecond(), iconOff);
		result.append("</td></table>");
		
		return result.toString();
	}
	
	private void appendIconPath(StringBuffer buf, IFile file, String iconName){
		buf.append("<img src='");
		if (file != null)
			buf.append(file.getLocation().toPortableString());
		else
			buf.append("icons/").append(iconName);
		buf.append("'/>");
	}
	
	private void setLabelOrName(ActivityExplorerItem item, StringBuffer buffer){
		String label = item.getLabel();
		if (label == null || label.isEmpty())
			label = item.getName();
		
		buffer.append(label);
	}
}
