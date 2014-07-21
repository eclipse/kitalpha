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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.mappingimport;

import org.eclipse.sirius.diagram.description.AbstractNodeMapping;

/**
 * @author Boubekeur Zendagui
 */

public class MappingImportData {
	/**
	 * Define the kind of the Import. Kind can be SPECIFIED or AUTO.
	 */
	private MappingImportKind import_kind;
	/**
	 * The original Mapping is the mapping defined in the extended diagram.
	 */
	private AbstractNodeMapping original_mapping;
	/**
	 * The imported Mapping is the mapping specified/generated in the diagram extension.
	 */
	private AbstractNodeMapping imported_mapping;
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
	 * @param original_m : the mapping defined in the target original odesign model
	 * @param imported_m : the generated mapping import 
	 * @param kind
	 */
	public MappingImportData(AbstractNodeMapping original_m, AbstractNodeMapping imported_m, MappingImportKind kind) {
		original_mapping = original_m;
		
		if (imported_m != null)
		{
			imported_mapping = imported_m;
			if (kind != null)
				import_kind = kind;
			else
				import_kind = MappingImportKind.SPECIFIED;
		}
		else
		{
			import_kind = MappingImportKind.AUTO;
		}
	}
	
	public MappingImportData(AbstractNodeMapping original_m) {
		this(original_m, null, null);
	}
	
	@Override
	public boolean equals(Object arg0) {
		if (arg0 instanceof MappingImportData)
		{
			MappingImportData parameter = (MappingImportData) arg0;

			if (parameter.getImport_kind() == null)
			{
				return parameter.getOriginal_mapping().equals(original_mapping);
			}
			else
			{
				switch (parameter.getImport_kind()) {
				case SPECIFIED:
					return (parameter.getImport_kind().equals(import_kind)
							&& parameter.getImported_mapping().equals(imported_mapping)
							&& parameter.getOriginal_mapping().equals(original_mapping));

				case AUTO:
					return (parameter.getImport_kind().equals(import_kind)
							&& parameter.getOriginal_mapping().equals(original_mapping));

				}
			}
		}
		return super.equals(arg0);
	}
	
	public boolean original_equals(Object arg0){
		return (arg0 instanceof MappingImportData 
					? ((MappingImportData)arg0).getOriginal_mapping().equals(original_mapping) 
					: false);
	}
	
	public MappingImportKind getImport_kind() {
		return import_kind;
	}

	public void setImport_kind(MappingImportKind mapping_kind) {
		this.import_kind = mapping_kind;
	}

	public AbstractNodeMapping getOriginal_mapping() {
		return original_mapping;
	}

	public void setOriginal_mapping(AbstractNodeMapping original_mapping) {
		this.original_mapping = original_mapping;
	}

	public AbstractNodeMapping getImported_mapping() {
		return imported_mapping;
	}

	public void setImported_mapping(AbstractNodeMapping imported_mapping) {
		this.imported_mapping = imported_mapping;
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
