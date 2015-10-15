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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.ContainerMappingImport;
import org.eclipse.sirius.diagram.description.DescriptionFactory;
import org.eclipse.sirius.diagram.description.Layer;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.description.NodeMappingImport;

/**
 * @author Boubekeur Zendagui
 */

public class MappingImportAgent {
	/**
	 * _Layer is a generated Layer.
	 */
	private Layer _Layer;
	/**
	 * _MappingImportList contains import data. (see {@link MappingImportData}).
	 */
	private List<MappingImportData> _MappingImportList;
	
	/**
	 * Default Constructor.
	 * It allows to create an import agent for a specific Layer. Note that each Agent is 
	 * associated with one and only one layer. 
	 * @param layer
	 */
	public MappingImportAgent(Layer layer) {
		if (layer == null)
			throw new IllegalArgumentException("Mapping Import Agent Layer can not be null");
		
		_Layer = layer;
		_MappingImportList = new ArrayList<MappingImportData>();
	}
	
	/**
	 * It allows to create a specific import Agent for the layer wherein is created the eObject parameter.
	 * @param eObject : Any generated doremi element (a Layer or a Container/node/bordered node mapping)
	 */
	public MappingImportAgent(EObject eObject) {
		this(getCorrespondingLayer(eObject));
	}
	
	/**
	 * Register a Mapping import specified by the user in the VPDesp model
	 * @param original
	 * @param imported
	 */
	public void registerSpecifiedImport(AbstractNodeMapping original, AbstractNodeMapping imported){
		MappingImportData data = new MappingImportData(original, imported, MappingImportKind.SPECIFIED);
		registerImportData(data);
	}
	
	/**
	 * Register a Mapping imported automatically.
	 * @param original
	 */
	public void registerAutoImport(AbstractNodeMapping original){
		MappingImportData data = new MappingImportData(original, null, MappingImportKind.AUTO);
		registerImportData(data);
	}
	
	public Layer get_Layer() {
		return _Layer;
	}
	
	/**
	 * This method allows to know if the current agent is the one managing the eObject parameter
	 * @param eObject: Can be a layer or any Container/Node/Bordered Mapping
	 * @return true if the registered _layer is equals to the layer of the eObject parameter 
	 */
	public boolean isAgentConcerned(EObject eObject){
		Layer layer = getCorrespondingLayer(eObject);
		if (layer != null)
		{
			return layer.equals(_Layer);
		}
		
		return false;
	}
	
	public boolean isImportRegistred(MappingImportData data){
		boolean result = false;
		for (MappingImportData iMappingImportData : _MappingImportList) 
		{
			if (iMappingImportData.equals(data) || iMappingImportData.original_equals(data))
			{
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * This methods update the model in order to include the auto Imported Mapping
	 * and update the reuse mapping
	 * @throws Exception 
	 */
	public void patchImports(boolean save) throws Exception{
		// First, ADD all auto imported mapping.
		for (MappingImportData iMappingImportData : _MappingImportList) 
		{
			// Take into account only mapping added automatically by the agent.
			// Patch Auto Import handle a root mapping and all its children 
			if (iMappingImportData.getParent() == null && 
				iMappingImportData.getImport_kind().equals(MappingImportKind.AUTO))
			{
				patchAutoImport(iMappingImportData);
			}
		}
		
		// Second, UPDATE the mapping reuse of any imported mapping 
		for (MappingImportData iMappingImportData : _MappingImportList) 
		{
			patchMappingReuse(iMappingImportData);
		}
	}
	
	/**
	 * Clear the registered mappings
	 */
	public void clear(){
		_MappingImportList.clear();
		_Layer = null;
	}
	
	
	private void patchAutoImport(MappingImportData data) throws Exception{

		/** I. Create the Container/Node(/BorderedNode) Import */
		createImport(data);
		
		/****** II. Add The created import the it parent *******/
		addImportToItParent(data);
		
		/********** III. fire children patching ****************/
		for (MappingImportData iMappingImportData : lookForChildrenOf(data)) 
			patchAutoImport(iMappingImportData);
	}

	/**
	 * @param data : the current import data
	 * @throws Exception 
	 */
	private void addImportToItParent(MappingImportData data) throws Exception {
		MappingImportData parent_data = data.getParent();
		AbstractNodeMapping imported_mapping = data.getImported_mapping();
		AbstractNodeMapping original_mapping = data.getOriginal_mapping();
		
		if (imported_mapping == null)
		{
			throw new Exception("Import Agent doesn't find a MappingImport");
		}
		
		if (parent_data == null)
		{
			if (imported_mapping instanceof NodeMappingImport)
				_Layer.getNodeMappings().add((NodeMappingImport)imported_mapping);
			
			if (imported_mapping instanceof ContainerMappingImport)
				_Layer.getContainerMappings().add((ContainerMappingImport)imported_mapping);
		}
		else
		{
			// Get the Parent Original Mapping
			AbstractNodeMapping parent_imported_m = parent_data.getImported_mapping();
			
			if (imported_mapping instanceof ContainerMapping)
			{
				ContainerMapping parent_container_imported_m = (ContainerMapping)parent_imported_m;
				parent_container_imported_m.getSubContainerMappings().remove(original_mapping);
				parent_container_imported_m.getSubContainerMappings().add((ContainerMapping)imported_mapping);
			}
			
			if (parent_imported_m instanceof NodeMapping)
			{
				NodeMapping parent_Node_imported_m = (NodeMapping)parent_imported_m;
				if (parent_Node_imported_m.getBorderedNodeMappings().contains(original_mapping))
				{
					parent_Node_imported_m.getBorderedNodeMappings().remove(original_mapping);
					parent_Node_imported_m.getBorderedNodeMappings().add((NodeMapping)imported_mapping);
				}
			}

			if (parent_imported_m instanceof ContainerMapping)
			{
				ContainerMapping parent_container_imported_m = (ContainerMapping)parent_imported_m;
				if (parent_container_imported_m.getSubContainerMappings().contains(original_mapping))
				{
					parent_container_imported_m.getSubContainerMappings().remove(original_mapping);
					parent_container_imported_m.getSubContainerMappings().add((ContainerMapping)imported_mapping);
				}
				if (parent_container_imported_m.getSubNodeMappings().contains(original_mapping))
				{
					parent_container_imported_m.getSubNodeMappings().remove(original_mapping);
					parent_container_imported_m.getSubNodeMappings().add((NodeMapping)imported_mapping);
				}

				if (parent_container_imported_m.getBorderedNodeMappings().contains(original_mapping))
				{
					parent_container_imported_m.getBorderedNodeMappings().remove(original_mapping);
					parent_container_imported_m.getBorderedNodeMappings().add((NodeMapping)imported_mapping);
				}
			}
		}
	}

	/**
	 * @param data : the current import data
	 */
	private void createImport(MappingImportData data) {
		AbstractNodeMapping original_m = data.getOriginal_mapping();
		AbstractNodeMapping imported_m = data.getImported_mapping();
		if (imported_m == null && original_m != null)
		{
			AbstractNodeMapping mapping_import = null;
			if (original_m instanceof ContainerMapping)
			{
				ContainerMapping container_mapping_original = (ContainerMapping)original_m;
				// Create a new Container AMpping Import
				ContainerMappingImport container_mapping_import = DescriptionFactory.eINSTANCE.createContainerMappingImport();
				mapping_import = container_mapping_import;
				// Define the mapping link between the original mapping and the new imported mapping 
				container_mapping_import.setImportedMapping(container_mapping_original);
			}
			
			if (original_m instanceof NodeMapping)
			{
				NodeMapping node_original_m = (NodeMapping)original_m;
				// create a new Node Mapping Import
				NodeMappingImport node_mapping_import= DescriptionFactory.eINSTANCE.createNodeMappingImport();
				mapping_import = node_mapping_import;
				// Define the mapping link between the original mapping and the new imported mapping
				node_mapping_import.setImportedMapping(node_original_m);
			}
			
			if (mapping_import != null)
			{
				// Inherits data from the original mapping
				mapping_import.setName(original_m.getName()+"_Import");
				mapping_import.setLabel((original_m.getLabel() != null ? original_m.getLabel()+"_Import" : mapping_import.getName()));
				mapping_import.setDomainClass(original_m.getDomainClass());
				mapping_import.setPreconditionExpression(original_m.getPreconditionExpression());
				mapping_import.setSemanticElements(original_m.getSemanticElements());
				
				// Inherit all tool of the original Container Mapping except of DROP tools
				reuseTools(original_m, mapping_import);
				
				// Reuse all mapping contained in and reused by the original mapping
				reuseMappings(original_m, mapping_import);
			}
			else
			{
				// TODO: Throw an exception
			}
			
			data.setImported_mapping(mapping_import);
			data.setGenerated(true);
		}
	}
	
	public static void reuseMappings(AbstractNodeMapping original_m, AbstractNodeMapping imported_m){
		// Reuse all Bordered Nodes of the the original mapping (the contained one and reused one)
		imported_m.getReusedBorderedNodeMappings().addAll(original_m.getAllBorderedNodeMappings());
		
		if (imported_m instanceof ContainerMappingImport)
		{
			ContainerMapping original_container_m = (ContainerMapping)original_m;
			ContainerMappingImport container_import = (ContainerMappingImport) imported_m;
			// Reuse all Nodes of the the original mapping (contained and reused)
			container_import.getReusedNodeMappings().addAll(original_container_m.getAllNodeMappings());
			// Reuse all Containers of the the original mapping (contained and reused)
			container_import.getReusedContainerMappings().addAll(original_container_m.getAllContainerMappings());
		}
	}
	
	/**
	 * This method reuse all tools of the original Mapping into the imported mapping
	 * @param original_m
	 * @param imported_m
	 */
	public static void reuseTools(AbstractNodeMapping original_m, AbstractNodeMapping imported_m){
		if (original_m != null && imported_m != null)
		{
			if (imported_m instanceof NodeMappingImport)
			{
				NodeMappingImport node_mapping_import = (NodeMappingImport) imported_m;
				node_mapping_import.getDropDescriptions().addAll(((NodeMapping)original_m).getDropDescriptions());
			}
			
			if (imported_m instanceof ContainerMappingImport)
			{
				ContainerMappingImport container_mapping_import = (ContainerMappingImport) imported_m;
				container_mapping_import.getDropDescriptions().addAll(((ContainerMapping)original_m).getDropDescriptions());
			}

			imported_m.getDetailDescriptions().addAll(original_m.getDetailDescriptions());
			imported_m.setDeletionDescription(original_m.getDeletionDescription());
			imported_m.getPasteDescriptions().addAll(original_m.getPasteDescriptions());
			imported_m.setDoubleClickDescription(original_m.getDoubleClickDescription());
			imported_m.setLabelDirectEdit(original_m.getLabelDirectEdit());
			imported_m.getNavigationDescriptions().addAll(original_m.getNavigationDescriptions());
		}
	}
	
	private List<MappingImportData> lookForChildrenOf(MappingImportData data){
		List<MappingImportData> result = new ArrayList<MappingImportData>();
		if (data != null)
		{
			for (MappingImportData iMappingImportData : _MappingImportList) 
				if (iMappingImportData.getParent() != null &&
						iMappingImportData.getParent().equals(data))
				{
					result.add(iMappingImportData);
				}
		}
		
		return result;
	}
	
	private void patchMappingReuse(MappingImportData data_to_reuse){
		// Update reuse of each imported mapping
		for (MappingImportData iMappingImportData : _MappingImportList) 
		{
			AbstractNodeMapping reusing_node = iMappingImportData.getImported_mapping();
			AbstractNodeMapping node_to_reuse = data_to_reuse.getImported_mapping();
			// Reuse of a Node or a BorderedNode
			if (node_to_reuse instanceof NodeMapping)
			{
				reuseBorderedNode(reusing_node, data_to_reuse);
				if (reusing_node instanceof ContainerMapping)
				{
					ContainerMapping reusing_container = (ContainerMapping)reusing_node;
					reuseNode(reusing_container, data_to_reuse);
				}
			}
			else // Reuse of a container
			{
				if (node_to_reuse instanceof ContainerMapping &&
						reusing_node instanceof ContainerMapping)
				{
					ContainerMapping reusing_container = (ContainerMapping)reusing_node;
					reuseContainer(reusing_container, data_to_reuse);
				}
			}
		}
	}
	
	public static void reuseBorderedNode(AbstractNodeMapping reusing, MappingImportData data_to_reuse){
		boolean reused = false;
		NodeMapping reused_Node_Mapping = null;
		for (NodeMapping iBorderedNode : reusing.getReusedBorderedNodeMappings()) 
		{
			if (iBorderedNode.equals(data_to_reuse.getOriginal_mapping()))
			{
				reused_Node_Mapping = iBorderedNode;
				reused = true;
				break;
			}
		}
		
		if (reused)
		{
			reusing.getReusedBorderedNodeMappings().remove(reused_Node_Mapping);
			reusing.getReusedBorderedNodeMappings().add((NodeMapping)data_to_reuse.getImported_mapping());
		}
	}
	
	public static void reuseNode(ContainerMapping reusing, MappingImportData data_to_reuse){
		boolean reused = false;
		NodeMapping reused_Node_Mapping = null;
		for (NodeMapping iNode : reusing.getReusedNodeMappings()) 
		{
			if (iNode.equals(data_to_reuse.getOriginal_mapping()))
			{
				reused_Node_Mapping = iNode;
				reused = true;
				break;
			}
		}
		
		if (reused)
		{
			reusing.getReusedNodeMappings().remove(reused_Node_Mapping);
			reusing.getReusedNodeMappings().add((NodeMapping)data_to_reuse.getImported_mapping());
		}
	}
	
	public static void reuseContainer(ContainerMapping reusing, MappingImportData data_to_reuse){
		boolean reused = false;
		ContainerMapping reused_Container_Mapping = null;
		for (ContainerMapping iContainer : reusing.getReusedContainerMappings()) 
		{
			if (iContainer.equals(data_to_reuse.getOriginal_mapping()))
			{
				reused_Container_Mapping = iContainer;
				reused = true;
				break;
			}
		}
		
		if (reused)
		{
			reusing.getReusedContainerMappings().remove(reused_Container_Mapping);
			reusing.getReusedContainerMappings().add((ContainerMapping)data_to_reuse.getImported_mapping());
		}
	}
	
	private void registerImportData(MappingImportData data){
		if (! isImportRegistred(data))
		{
			_MappingImportList.add(data);
			computeAutoImport(data);
		}
		else
		{
			for (MappingImportData iMappingImportData : _MappingImportList) 
			{
				if ((iMappingImportData.equals(data) || iMappingImportData.original_equals(data))
						&& iMappingImportData.getImport_kind().equals(MappingImportKind.AUTO))
				{
					iMappingImportData.setGenerated(true);
					iMappingImportData.setImport_kind(data.getImport_kind());
					iMappingImportData.setImported_mapping(data.getImported_mapping());
					iMappingImportData.setParent(data.getParent());
				}
			}
		}
	}
	
	private void computeAutoImport(MappingImportData current_data){
		AbstractNodeMapping original_m = current_data.getOriginal_mapping();
		
		/********************** Handle container of original Mapping ***********************/
		if (! (original_m.eContainer() instanceof Layer))
		{
			MappingImportData parrent_data = createOrGetParentDataOf(current_data);
			if (! isImportRegistred(parrent_data))
			{
				registerImportData(parrent_data);
			}
			
			if (current_data.getParent() == null &&
					current_data.getImport_kind().equals(MappingImportKind.AUTO))
			{
				current_data.setParent(parrent_data);
			}
		}
		
		/********************** Handle mapping reusing original Mapping ***********************/
		// get the Layer of original_m.
		Layer original_layer = getCorrespondingLayer(original_m);
		
		// check any element
		if (original_m instanceof NodeMapping)
		{
			for (ContainerMapping iContainerMapping : original_layer.getContainerMappings()) 
				if (iContainerMapping.getReusedBorderedNodeMappings().contains(original_m) ||
					iContainerMapping.getReusedNodeMappings().contains(original_m))
				{
					registerImportData(new MappingImportData(iContainerMapping));
				}
			
			for (NodeMapping iNodeMapping : original_layer.getNodeMappings()) 
				if (iNodeMapping.getReusedBorderedNodeMappings().contains(original_m))
					if (! original_m.equals(iNodeMapping))
					{
						registerImportData(new MappingImportData(iNodeMapping));
					}
		}
		
		// check only containers
		if (original_m instanceof ContainerMapping)
			for (ContainerMapping iContainerMapping : original_layer.getContainerMappings()) 
				if (iContainerMapping.getReusedContainerMappings().contains(original_m))
					if (! original_m.equals(iContainerMapping))
					{
						registerImportData(new MappingImportData(iContainerMapping));
					}
	}
	
	private MappingImportData createOrGetParentDataOf(MappingImportData data){
		if (data.getParent() != null)
		{
			return data.getParent();
		}
		else
		{
			if (!(data.getOriginal_mapping().eContainer() instanceof Layer))
			{
				AbstractNodeMapping parent_original_mapping = (AbstractNodeMapping)data.getOriginal_mapping().eContainer();
				MappingImportData parent_data = new MappingImportData(parent_original_mapping);
				return lookForMappingInRegisteredMapping(parent_data);
			}
			else
			{
				return null;
			}
		}
	}
	
	private MappingImportData lookForMappingInRegisteredMapping(MappingImportData data){
		if (data != null)
		{
			for (MappingImportData iMappingImportData : _MappingImportList) 
				if (iMappingImportData.equals(data))
					return iMappingImportData;
		}
		return data;
	}
	
	private static Layer getCorrespondingLayer(EObject eObject){
		if (eObject instanceof Layer)
		{
			return (Layer) eObject;
		}
		
		if (eObject instanceof AbstractNodeMapping)
		{
			AbstractNodeMapping aNodeMapping = (AbstractNodeMapping)eObject;
			EObject parent = aNodeMapping.eContainer();
			
			while (parent.eContainer() != null && !(parent instanceof Layer)) 
				parent = parent.eContainer();
			
			if (parent != null && parent instanceof Layer)
				return (Layer) parent;
		}
		return null;
	}
}
