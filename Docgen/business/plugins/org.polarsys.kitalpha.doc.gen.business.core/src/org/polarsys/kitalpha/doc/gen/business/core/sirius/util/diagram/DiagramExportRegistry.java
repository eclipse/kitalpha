/*******************************************************************************
 * Copyright (c) 2020 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.sirius.util.diagram;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;

/**
 * This Registry stores various information regarding diagrams for which an image is generated.
 * We store the File and its name. These information are stored when diagrams are generated and 
 * are queried to avoid to re-generate diagrams.
 * 
 * @author Arnaud Dieumegard
 */
public class DiagramExportRegistry {
	
	private static DiagramExportRegistry INSTANCE;
	
	private Map<String, DiagramExportRegistryObject> mapDiagramToExportObject;
	
	public class DiagramExportRegistryObject {
		private IFile file;
		private DRepresentationDescriptor descriptor;
		private String mapName;
		private String diagramName;
		
		public DiagramExportRegistryObject(IFile file, DRepresentationDescriptor descriptor, String mapName, String diagramName) {
			this.file = file;
			this.descriptor = descriptor;
			this.mapName = mapName;
			this.diagramName = diagramName;
		}
		
		public IFile getFile() {
			return this.file;
		}
		
		public DRepresentationDescriptor getRepresentationDescriptor() {
			return this.descriptor;
		}
		
		public String getMapName() {
			return this.mapName;
		}
		
		public String getDiagramName() {
			return this.diagramName;
		}
	}
	
	private DiagramExportRegistry() {
		mapDiagramToExportObject = new HashMap<String, DiagramExportRegistryObject>();
	}
	
	public static DiagramExportRegistry getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new DiagramExportRegistry();
		}
		return INSTANCE;
	}
	
	public void addEntry(DDiagram diagram, IFile file, DRepresentationDescriptor descriptor, String mapName, String diagramName) {
		DiagramExportRegistryObject obj = new DiagramExportRegistryObject(file, descriptor, mapName, diagramName);
		getInstance().mapDiagramToExportObject.put(diagram.getUid(), obj);
	}
	
	public DiagramExportRegistryObject getDiagramRelatedRegistryObject(DDiagram diagram) {
		return getInstance().mapDiagramToExportObject.get(diagram.getUid());
	}
	
	public Boolean hasDataForDiagram(DDiagram diagram) {
		return getInstance().mapDiagramToExportObject.containsKey(diagram.getUid());
	}
	
	public void clean() {
		getInstance().mapDiagramToExportObject.clear();
	}

}
