/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.m2t.componentsample.to.html.sysout.generator;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.Type;
import org.polarsys.kitalpha.m2t.componentsample.to.html.helper.ComputeLinkHelper;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentModel;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.HardwareComponent;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.SoftwareComponent;

import componentSampleAllocation.ComponentModelType;
import componentSampleAllocation.ComponentSampleFile;
import componentSampleAllocation.ComponentSampleHardware;
import componentSampleAllocation.ComponentSampleSoftware;
import componentSampleAllocation.ComponentType;
import componentSampleAllocation.ContainedBy;
import componentSampleAllocation.Contains;
import componentSampleAllocation.UsedBy;
import componentSampleAllocation.Uses;

/**
 * 
 * @author Faycal Abka
 *
 */
public class HtmlDocGenerator {
	
	
	public void generate(ComponentSampleFile file, IPath folder_path, StringBuffer buf, boolean isSingleFileStrategy){
		
		EList<Type> types = file.getOwnedTypes();
		
		for (Type type : types) {
			
			if (type instanceof ComponentModelType){
				ComponentModelType cmt = (ComponentModelType)type;
				generateType(cmt, folder_path, buf, isSingleFileStrategy);
			} else {
				//It is ComponentType
				ComponentType ctype = (ComponentType)type;
				generateType(ctype, folder_path, buf);
			}
		}
		
		//This is ugly, but we assum that the main page is index
		buf.append("<a href='index.html' align='center'>Index</a>");
	}

	private void generateType(ComponentType ctype, IPath folder_path, StringBuffer buf) {
		//Generate each component
		
		if (ctype instanceof ComponentSampleHardware){
			generateHardware((ComponentSampleHardware)ctype, buf);
		} else {
			generateSoftware((ComponentSampleSoftware)ctype, buf);
		}
	}

	private void generateSoftware(ComponentSampleSoftware ctype, StringBuffer buf) {
		buf
			.append("<p id='").append(((SoftwareComponent)ctype.getReferencedElement()).getName().replaceAll(" ", "_")).append("'>")
			.append("<table border=1 width='100%' BORDERCOLOR='#0000FF'><tr align='left'>")
			.append("<th width='30%' bgcolor='#7BCDEF'>Component</th><th bgcolor='#CCFFCC'><i>")
			.append(((SoftwareComponent)ctype.getReferencedElement()).getName())
			.append("</i></th></tr>");
		
		String description = ((SoftwareComponent)ctype.getReferencedElement()).getDescription();
		buf.append("<tr><td bgcolor='#8BCDEF'>Description</td><td bgcolor='#BCFFCC'>");
		
		if (description != null && !description.isEmpty())
			buf.append(description);
		else
			buf.append("No Description Provided For This Component");
		
		buf.append("</td></tr>");
		buf.append("<tr><td bgcolor='#9BCDEF'>Type</td><td bgcolor='#ACFFCC'>Software - ")
			.append(((SoftwareComponent)ctype.getReferencedElement()).getType().toString()).append("</td></tr>");
		buf.append("<tr><td bgcolor='#ABCDEF'>Used Components</td><td bgcolor='#9CFFCC'>");
		
		buf.append("<ul>");
		
		EList<Uses> usedComponents = ctype.getUsedComponents();
		for (Uses uses : usedComponents) {
			buf.append("<li><a href=\"").append(uses.getLink()).append("\">").append(uses.getComponentName()).append("</li></a>");
		}
		buf.append("</ul></td></tr>");
		
		buf.append("<tr><td bgcolor='#BBCDEF'>Used By</td><td bgcolor='#8CFFCC'>");
		buf.append("<ul>");
		
		EList<UsedBy> usedBy = ctype.getUsedByComponent();
		
		for (UsedBy usedBy2 : usedBy) {
			buf.append("<li><a href=\"").append(usedBy2.getLink()).append("\">").append(usedBy2.getComponentName());
			buf.append("</a></li>");
		}
		
		buf.append("</ul></td></tr><tr><td bgcolor='#CBCDEF'>");
		buf.append("Containd By</td><td bgcolor='#7CFFCC'>");
		
		ContainedBy containedBy = ctype.getContainedByComponent();
		if (containedBy != null)
			buf.append("<a href=\"").append(containedBy.getLink()).append("\">").append(containedBy.getComponentName()).append("</a>");
		
		buf.append("</td></tr>").append("</table></p>");
	}

	private void generateHardware(ComponentSampleHardware ctype, StringBuffer buf) {
		buf
			.append("<p id='").append(((HardwareComponent)ctype.getReferencedElement()).getName().replaceAll(" ", "_")).append("'>")
			.append("<table border=1 width='100%' BORDERCOLOR='#ED7F10'><tr align='left'>")
			.append("<th width='30%' bgcolor='#7BCDEF'>Component</th><th bgcolor='#CCFFCC'><i>")
			.append(((HardwareComponent)ctype.getReferencedElement()).getName())
			.append("</i></th></tr>");
		
		String description = ((HardwareComponent)ctype.getReferencedElement()).getDescription();
		buf.append("<tr><td bgcolor='#8BCDEF'>Description</td><td bgcolor='#BCFFCC'>");
		
		if (description != null && !description.isEmpty())
			buf.append(description);
		else
			buf.append("No Description Provided For This Component");
		
		buf.append("</td></tr>");
		buf.append("<tr><td bgcolor='#9BCDEF'>Type</td><td bgcolor='#ACFFCC'>Hardware - ")
			.append(((HardwareComponent)ctype.getReferencedElement()).getType().toString()).append("</td></tr>");
		buf.append("<tr><td bgcolor='#ABCDEF'>Used Components</td><td bgcolor='#9CFFCC'>");
		
		buf.append("<ul>");
		
		EList<Uses> usedComponents = ctype.getUsedComponents();
		for (Uses uses : usedComponents) {
			buf.append("<li><a href=\"").append(uses.getLink()).append("\">").append(uses.getComponentName()).append("</a></li>");
		}
		buf.append("</ul></td></tr>");
		
		buf.append("<tr><td bgcolor='#BBCDEF'>Used By</td><td bgcolor='#8CFFCC'>");
		buf.append("<ul>");
		
		EList<UsedBy> usedBy = ctype.getUsedByComponent();
		
		for (UsedBy usedBy2 : usedBy) {
			buf.append("<li><a href=\"").append(usedBy2.getLink()).append("\">").append(usedBy2.getComponentName());
			buf.append("</a></li>");
		}
		buf.append("</ul></td></tr><tr><td bgcolor='#CBCDEF'>");
		buf.append("Contains</td><td bgcolor='#7CFFCC'>");
		
		EList<Contains> contains = ctype.getContainsComponents();
		 
		buf.append("<ul>");
		for (Contains contains2 : contains) {
			buf.append("<li><a href=\"").append(contains2.getLink()).append("\">").append(contains2.getComponentName()).append("</a></li>");
		}
		
		buf.append("</ul></td></tr><tr><td bgcolor='#CBCDEF'>");
		buf.append("Containd By</td><td bgcolor='#6CFFCC'>");
		
		ContainedBy containedBy = ctype.getContainedByComponent();
		if (containedBy != null)
			buf.append("<a href=\"").append(containedBy.getLink()).append("\">").append(containedBy.getComponentName()).append("</a>");
		
		buf.append("</td></tr>").append("</table></p>");
		
	}

	private void generateType(ComponentModelType cmt, IPath folder_path, StringBuffer buf, boolean isSingleFileStrategy) {
		EList<ComponentSampleSoftware> softwares = cmt.getSoftwarecomponents();
		EList<ComponentSampleHardware> hardwares = cmt.getHardwareComponents();
		
		buf.append("<p><h2 align='center'>Model System: <i>").append(((ComponentModel)cmt.getReferencedElement()).getName()).append("</i></h2></p>");
		buf.append("<p id='");
		String name = ((ComponentModel)cmt.getReferencedElement()).getName();
		if (name != null && !name.isEmpty())
			buf.append(name.replaceAll(" ", "_")).append("'>");
		else
			buf.append(name);
		
		buf.append("<table border=1 bordercolor='BLUE' width='100%'><tr><th bgcolor='#9999FF' colspan=2>Software Components</th></tr>");
		
		for (ComponentSampleSoftware componentSampleSoftware : softwares) {
			SoftwareComponent s = (SoftwareComponent)componentSampleSoftware.getReferencedElement();
			buf.append("<tr><td align='center' width='45%'><a href='");
			
			if (isSingleFileStrategy)
				buf.append(ComputeLinkHelper.computeSingleLink(s));
			else
				buf.append(ComputeLinkHelper.computeLink(s)).append("'>");
			
			buf.append(s.getName()).append("</a></td><td>");
			
			if (s.getDescription() != null && !s.getDescription().isEmpty())
				buf.append(s.getDescription());
			else
				buf.append("No Description Provided for this component");
			
			buf.append("</td></tr></li>");
		}
		buf.append("</table></p><br/>");
		
		buf.append("<p><table border=1 bordercolor='RED' width='100%'><tr><th bgcolor='#FF9999' colspan=2>Hardware Components</th></tr>");
		
		for (ComponentSampleHardware componentSampleHardware : hardwares) {
			HardwareComponent h = (HardwareComponent)componentSampleHardware.getReferencedElement();
			buf.append("<tr><td align='center' width='45%'><a href='");
			
			if (isSingleFileStrategy)
				buf.append(ComputeLinkHelper.computeSingleLink(h));
			else
				buf.append(ComputeLinkHelper.computeLink(h)).append("'>");
			
			buf.append(h.getName()).append("</a></td><td>");
			
			if (h.getDescription() != null && !h.getDescription().isEmpty())
				buf.append(h.getDescription());
			else
				buf.append("No Description Provided for this component");
			
			buf.append("</td></tr></li>");
		}
		buf.append("</table></p><br/>");
	}
}
