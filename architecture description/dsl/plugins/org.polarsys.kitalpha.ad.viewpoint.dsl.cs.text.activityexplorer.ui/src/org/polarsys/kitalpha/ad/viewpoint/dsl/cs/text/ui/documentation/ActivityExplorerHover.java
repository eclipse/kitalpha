/*******************************************************************************
 * Copyright (c) 2015, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.Activity;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ActivityExplorerItem;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.Overview;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.Page;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.Section;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.util.ProjectUtil;

/**
 *
 * @author Faycal Abka
 *
 */
public class ActivityExplorerHover extends CommonEObjectHover {

	private boolean descriptionSelector = false;
	private boolean iconSelector = false;
	private boolean activitiesSelectors = false;
	private boolean headerSelector = false;

	@Override
	protected Pair<EObject, IRegion> getXtextElementAt(final XtextResource resource, final int offset) {
		final IParseResult parseResult = resource.getParseResult();
		if (parseResult != null){
			final ILeafNode leafNode = NodeModelUtils.findLeafNodeAtOffset(parseResult.getRootNode(), offset);
			final EObject semanticObject = NodeModelUtils.findActualSemanticObjectFor(leafNode);
			final String value = leafNode != null? leafNode.getText() : null;

			if (value != null){
				if (value.equals("page") && (semanticObject instanceof Page)){ //$NON-NLS-1$
					return Tuples.create(semanticObject, (IRegion)new Region(leafNode.getOffset(), leafNode.getLength()));
				}

				if (value.equals("header") && (semanticObject instanceof Page)){ //$NON-NLS-1$
					headerSelector = true;
					return Tuples.create(semanticObject, (IRegion)new Region(leafNode.getOffset(), leafNode.getLength()));
				}

				if (value.equals("description") && (semanticObject != null)){ //$NON-NLS-1$
					descriptionSelector = true;
					return Tuples.create(semanticObject, (IRegion)new Region(leafNode.getOffset(), leafNode.getLength()));
				}

				if (value.equals("icon") && (semanticObject instanceof Activity)){ //$NON-NLS-1$
					iconSelector = true;
					return Tuples.create(semanticObject, (IRegion)new Region(leafNode.getOffset(), leafNode.getLength()));
				}

				if (value.equals("activity") && (semanticObject instanceof Activity)){ //$NON-NLS-1$
					return Tuples.create(semanticObject, (IRegion)new Region(leafNode.getOffset(), leafNode.getLength()));
				}

				if (value.equals("activities") && (semanticObject instanceof Section)){ //$NON-NLS-1$
					activitiesSelectors = true;
					return Tuples.create(semanticObject, (IRegion)new Region(leafNode.getOffset(), leafNode.getLength()));
				}

				if (value.equals("section") && (semanticObject instanceof Section)){ //$NON-NLS-1$
					return Tuples.create(semanticObject, (IRegion)new Region(leafNode.getOffset(), leafNode.getLength()));
				}
			}
		}
		return super.getXtextElementAt(resource, offset);
	}

	@Override
	public Object getHoverInfo(final EObject first, final ITextViewer textViewer, final IRegion hoverRegion) {
		if (first instanceof Overview){
			final Overview overview = (Overview)first;
			return getOverviewHTMLText(overview);
		}

		if (first instanceof Page){
			final Page page = (Page)first;
			if (headerSelector){
				return getHeaderHTMLText(page);
			}
			return getPageHTMLText(page);
		}

		if (first instanceof Section){
			final Section section = (Section)first;
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
			final Activity activity = (Activity)first;
			return getActivityHTMLText(activity);
		}

		return super.getHoverInfo(first, textViewer, hoverRegion);
	}

	private Object getPageHTMLText(final Page page) {
		final StringBuffer result = new StringBuffer();
		final EList<Section> ownedSections = page.getOwnedSections();

		result.append("<table border='0' width='100%'><tr><td colspan='2'><b>");
		setLabelOrName(page, result);
		result.append("</b></td></tr>");
		result.append("<tr><td width='20'></td><td>");
		for (final Section section : ownedSections) {
			result.append(getSectionHTMLText(section));
		}
		result.append("</td></tr></table>");

		return result.toString();
	}

	private Object getSectionHTMLText(final Section section) {
		final StringBuffer result = new StringBuffer();

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

	private Object getActivitiesHTMLText(final Section section) {
		final StringBuffer result = new StringBuffer();
		final EList<Activity> ownedActivities = section.getOwnedActivities();

		for (final Activity activity : ownedActivities) {
			result.append(getActivityDescription(activity));
			result.append("<br/>");
		}

		return result.toString();
	}

	private Object getActivityHTMLText(final Activity activity) {

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

	private Object getActivityDescription(final Activity activity) {
		final StringBuffer result = new StringBuffer();

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

	private Object getLink(final Activity activity) {
		String label = activity.getLabel();
		if ((label == null) || label.isEmpty()){
			label = activity.getName();
		}
		return "<a style='text-decoration: none; color:#000099'>" + label + "</a>";
	}

	private Object getActivityIcon(final Activity activity) {

		final StringBuffer result = new StringBuffer();

		final String iconPath = activity.getImagePathOff();

		if ((iconPath != null) && !iconPath.isEmpty()){
			final IProject project = ProjectUtil.getEclipseProjectOf(activity);
			final IFolder iconsFolder = ProjectUtil.getFolderInProject(project, "icons");
			final IFile icon = iconsFolder.getFile(iconPath);

			result.append("<img src='");
			if (icon != null){
				result.append(icon.getLocation().toPortableString());
			} else {
				result.append("icons/").append(iconPath);
			}
			result.append("'/>");
		}

		return result.toString();
	}

	private Object getOverviewHTMLText(final Overview overview) {

		if (descriptionSelector){
			descriptionSelector = false;
			return overview.getDescription();
		}


		final StringBuffer result = new StringBuffer();

		final String description = overview.getDescription();
		final String imageOn = overview.getImagePathOn();
		final String imageOff = overview.getImagePathOff();


		final Pair<IFile, IFile> icons = getIconFiles(overview, imageOn, imageOff);

		result.append("<table border='0' width='100%'>")
		.append("<tr><td width='150'><img src='");

		if (icons.getFirst() != null){
			result.append(icons.getFirst().getLocation().toPortableString());
		} else {
			result.append("icons/").append(imageOn);
		}
		result.append("'/></td><td rowspan='2'/>").append(description)
		.append("</td></tr><tr><td width='150'><img src='");

		if (icons.getSecond() != null){
			result.append(icons.getSecond().getLocation().toPortableString());
		} else {
			result.append("icons/").append(imageOn);
		}

		result.append("'/></td></tr></table>");

		return result.toString();
	}

	protected Pair<IFile, IFile> getIconFiles(final EObject eObject, final String first, final String second){
		IFile firstIcon = null;
		IFile secondIcon = null;

		final IProject project = ProjectUtil.getEclipseProjectOf(eObject);
		final IFolder iconsFolder = ProjectUtil.getFolderInProject(project, "icons");

		if ((first != null) && !first.isEmpty()){
			firstIcon = iconsFolder.getFile(first);
		}

		if ((second != null) && !first.isEmpty()){
			secondIcon = iconsFolder.getFile(second);
		}

		return Tuples.create(firstIcon, secondIcon);
	}

	private Object getHeaderHTMLText(final Page page) {

		if (descriptionSelector){
			descriptionSelector = false;
			return page.getDescription();
		}

		final StringBuffer result = new StringBuffer();

		final String iconOn = page.getImagePathOn();
		final String iconOff = page.getImagePathOff();

		final Pair<IFile, IFile> icons = getIconFiles(page, iconOn, iconOff);

		result.append("<table border='0' width='100%'>").append("<tr>");
		if (icons.getFirst() != null){
			result.append("<td>");
			appendIconPath(result, icons.getFirst(), iconOn);
			result.append("</td>");
		}
		if (icons.getSecond() != null){
			result.append("<td>");
			appendIconPath(result, icons.getSecond(), iconOff);
			result.append("</td>");
		}
		result.append("</tr></table>");

		return result.toString();
	}

	private void appendIconPath(final StringBuffer buf, final IFile file, final String iconName){
		buf.append("<img src='");
		if (file != null){
			buf.append(file.getLocation().toPortableString());
		} else {
			buf.append("icons/").append(iconName);
		}
		buf.append("'/>");
	}

	private void setLabelOrName(final ActivityExplorerItem item, final StringBuffer buffer){
		String label = item.getLabel();
		if ((label == null) || label.isEmpty()){
			label = item.getName();
		}
		buffer.append(label);
	}
}
