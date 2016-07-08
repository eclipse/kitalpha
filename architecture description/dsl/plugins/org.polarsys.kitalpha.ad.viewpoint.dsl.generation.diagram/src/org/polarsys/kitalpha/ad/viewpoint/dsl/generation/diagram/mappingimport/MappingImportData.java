/*******************************************************************************
 * Copyright (c) 2014-2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.mappingimport;

import org.eclipse.sirius.diagram.description.AbstractNodeMapping;

/**
 * @author Boubekeur Zendagui
 */

public class MappingImportData {
	/**
	 * Define the kind of the Import. Kind can be SPECIFIED or AUTO.
	 */
	private MappingImportKind importKind;
	/**
	 * The original Mapping is the mapping defined in the extended diagram.
	 */
	private AbstractNodeMapping originalMapping;
	/**
	 * The imported Mapping is the mapping specified/generated in the diagram extension.
	 */
	private AbstractNodeMapping importedMapping;
	/**
	 * The parent Mapping of the original_mapping as defined in the original diagram.
	 */
	private MappingImportData parent;
	/**
	 * This is used when patching the generated doremi model. 
	 */
	private boolean generated = false;
	
	
	/**
	 * Default Constructor. This constructor is used to create data for specified import by user 
	 * or auto generated import.
	 * 
	 * Specials cases :
	 * 		1- If the value of imported_m is NULL and kind is NULL then the kind is set to: 
	 * 		   MappingImportKind.AUTO
	 * 		2- If the value of imported_m is NOT NULL and kind is NULL then the kind is set to: 
	 * 		   MappingImportKind.SPECIFIED
	 * 
	 * @param originalMapping : the mapping defined in the target original odesign model
	 * @param importedMapping : the generated mapping import 
	 * @param kind
	 */
	public MappingImportData(AbstractNodeMapping originalMapping, AbstractNodeMapping importedMapping, MappingImportKind kind) {
		this.originalMapping = originalMapping;
		
		if (importedMapping != null)
		{
			this.importedMapping = importedMapping;
			if (kind != null)
			{
				this.importKind = kind;
			}
			else
			{
				this.importKind = MappingImportKind.SPECIFIED;
			}
		}
		else
		{
			this.importKind = MappingImportKind.AUTO;
		}
	}
	
	public MappingImportData(AbstractNodeMapping originalMapping) {
		this(originalMapping, null, null);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object arg0) {
		if (arg0 instanceof MappingImportData)
		{
			MappingImportData parameter = (MappingImportData) arg0;

			if (parameter.getImportKind() == null)
			{
				return parameter.getOriginalMapping().equals(originalMapping);
			}
			else
			{
				switch (parameter.getImportKind()) {
				case SPECIFIED:
					return (parameter.getImportKind().equals(importKind)
							&& parameter.getImportedMapping().equals(importedMapping)
							&& parameter.getOriginalMapping().equals(originalMapping));

				case AUTO:
					return (parameter.getImportKind().equals(importKind)
							&& parameter.getOriginalMapping().equals(originalMapping));

				}
			}
		}
		return super.equals(arg0);
	}
	
	public boolean originalEquals(Object arg0){
		return (arg0 instanceof MappingImportData 
					? ((MappingImportData)arg0).getOriginalMapping().equals(originalMapping) 
					: false);
	}
	
	public MappingImportKind getImportKind() {
		return importKind;
	}

	public void setImportKind(MappingImportKind mappingKind) {
		this.importKind = mappingKind;
	}

	public AbstractNodeMapping getOriginalMapping() {
		return originalMapping;
	}

	public void setOriginalMapping(AbstractNodeMapping originalMapping) {
		this.originalMapping = originalMapping;
	}

	public AbstractNodeMapping getImportedMapping() {
		return importedMapping;
	}

	public void setImportedMapping(AbstractNodeMapping importedMapping) {
		this.importedMapping = importedMapping;
	}

	public MappingImportData getParent() {
		return parent;
	}

	public void setParent(MappingImportData parent) {
		this.parent = parent;
	}

	public boolean isGenerated() {
		return generated;
	}

	public void setGenerated(boolean generated) {
		this.generated = generated;
	}
}
