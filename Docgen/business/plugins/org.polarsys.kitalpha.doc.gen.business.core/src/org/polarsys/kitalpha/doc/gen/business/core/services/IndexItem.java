/*******************************************************************************
 * Copyright (c) 2019, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.services;

import java.util.Objects;

import org.polarsys.kitalpha.doc.gen.business.core.util.EscapeChars;

/**
 * 
 * @author Faycal Abka
 *
 */
public class IndexItem implements Comparable<IndexItem>{
	
	private final String conceptName;
	private final String conceptType;
	private final String iconTag;
	private final String linkTagTowardPage;
	private final String fileName;
	private final String escapedForHTMLConceptName;
	
	/**
	 * New index item
	 * @param conceptName not null concept name
	 * @param conceptType not null type of concept
	 * @param iconTag not null icon html tag
	 * @param linkTagTowardPage not null html link toward page element
	 * @param fileName the target file where the content is generated
	 */
	public IndexItem(String conceptName, String conceptType, String iconTag, String linkTagTowardPage, String fileName) {
		super();
		this.conceptName = conceptName;
		this.conceptType = conceptType;
		this.iconTag = iconTag;
		this.linkTagTowardPage = linkTagTowardPage;
		this.fileName = fileName;
		this.escapedForHTMLConceptName = EscapeChars.forHTML(conceptName);
	}
	
	public String getConceptName() {
		return conceptName;
	}
	
	public String getIconTag() {
		return iconTag;
	}
	
	public String getLinkTagTowardPageElement() {
		return linkTagTowardPage;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public String getConceptType() {
		return conceptType;
	}
	
	public String getEscapedForHTMLConceptName() {
		return escapedForHTMLConceptName;
	}

	@Override
	public boolean equals(Object arg0) {
		if (arg0 instanceof IndexItem) {
			IndexItem item = (IndexItem)arg0;
			return getConceptName().equalsIgnoreCase(item.getConceptName()) &&
					getIconTag().equalsIgnoreCase(item.getIconTag()) &&
					getLinkTagTowardPageElement().equalsIgnoreCase(item.getLinkTagTowardPageElement()) &&
					getFileName().equalsIgnoreCase(item.getFileName());
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(getConceptName()) + 
				Objects.hashCode(getIconTag()) +
				Objects.hashCode(getLinkTagTowardPageElement()) +
				Objects.hashCode(getFileName());
	}


	@Override
	public int compareTo(IndexItem arg0) {
		return getConceptName().compareTo(arg0.getConceptName());
	}
	
}
