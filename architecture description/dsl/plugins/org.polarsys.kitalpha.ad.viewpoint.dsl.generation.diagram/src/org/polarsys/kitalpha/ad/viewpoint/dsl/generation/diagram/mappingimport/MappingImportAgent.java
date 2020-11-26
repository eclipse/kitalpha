/*******************************************************************************
 * Copyright (c) 2014, 2019 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.mappingimport;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.business.internal.metamodel.helper.ContentHelper;
import org.eclipse.sirius.diagram.business.internal.metamodel.helper.MappingHelper;
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
	private Layer layer;
	/**
	 * _MappingImportList contains import data. (see {@link MappingImportData}).
	 */
	private List<MappingImportData> mappingImportList;
	
	/**
	 * Default Constructor.
	 * It allows to create an import agent for a specific Layer. Note that each Agent is 
	 * associated with one and only one layer. 
	 * @param layer
	 */
	public MappingImportAgent(Layer layer) {
		if (layer == null)
		{
			throw new IllegalArgumentException("Mapping Import Agent Layer can not be null"); ////$NON-NLS-1$
		}
		
		this.layer = layer;
		mappingImportList = new ArrayList<MappingImportData>();
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
		return this.layer;
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
			return layer.equals(this.layer);
		}
		
		return false;
	}
	
	public boolean isImportRegistred(MappingImportData data){
		boolean result = false;
		for (MappingImportData iMappingImportData : mappingImportList) 
		{
			if (iMappingImportData.equals(data) || iMappingImportData.originalEquals(data))
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
	public void patchImports(boolean save) throws AutoImportException{
		// First, ADD all auto imported mapping.
		for (MappingImportData iMappingImportData : mappingImportList) 
		{
			// Take into account only mapping added automatically by the agent.
			// Patch Auto Import handle a root mapping and all its children 
			if (iMappingImportData.getParent() == null && 
				iMappingImportData.getImportKind().equals(MappingImportKind.AUTO))
			{
				patchAutoImport(iMappingImportData);
			}
		}
		
		// Second, UPDATE the mapping reuse of any imported mapping 
		for (MappingImportData iMappingImportData : mappingImportList) 
		{
			patchMappingReuse(iMappingImportData);
		}
	}
	
	/**
	 * Clear the registered mappings
	 */
	public void clear(){
		mappingImportList.clear();
		this.layer = null;
	}
	
	
	private void patchAutoImport(MappingImportData data) throws AutoImportException{

		/** I. Create the Container/Node(/BorderedNode) Import */
		createImport(data);
		
		/****** II. Add The created import the it parent *******/
		addImportToItParent(data);
		
		/********** III. fire children patching ****************/
		for (MappingImportData iMappingImportData : lookForChildrenOf(data)) 
		{
			patchAutoImport(iMappingImportData);
		}
	}

	/**
	 * @param data : the current import data
	 * @throws Exception 
	 */
	private void addImportToItParent(MappingImportData data) throws AutoImportException {
		MappingImportData parentData = data.getParent();
		AbstractNodeMapping importedMapping = data.getImportedMapping();
		AbstractNodeMapping originalMapping = data.getOriginalMapping();
		
		if (importedMapping == null)
		{
			throw new AutoImportException(AutoImportException.MSG_CANT_FIND_MAPPING);
		}
		
		if (parentData == null)
		{
			if (importedMapping instanceof NodeMappingImport)
			{
				this.layer.getNodeMappings().add((NodeMappingImport)importedMapping);
			}
			
			if (importedMapping instanceof ContainerMappingImport)
			{
				this.layer.getContainerMappings().add((ContainerMappingImport)importedMapping);
			}
		}
		else
		{
			// Get the Parent Original Mapping
			AbstractNodeMapping parentImportedMapping = parentData.getImportedMapping();
			
			if (importedMapping instanceof ContainerMapping)
			{
				ContainerMapping parentContainerImportedMapping = (ContainerMapping)parentImportedMapping;
				parentContainerImportedMapping.getSubContainerMappings().remove(originalMapping);
				parentContainerImportedMapping.getSubContainerMappings().add((ContainerMapping)importedMapping);
			}
			
			if (parentImportedMapping instanceof NodeMapping)
			{
				NodeMapping parentNodeImportedMapping = (NodeMapping)parentImportedMapping;
				if (parentNodeImportedMapping.getBorderedNodeMappings().contains(originalMapping))
				{
					parentNodeImportedMapping.getBorderedNodeMappings().remove(originalMapping);
					parentNodeImportedMapping.getBorderedNodeMappings().add((NodeMapping)importedMapping);
				}
			}

			if (parentImportedMapping instanceof ContainerMapping)
			{
				ContainerMapping parentContainerImportedMapping = (ContainerMapping)parentImportedMapping;
				if (parentContainerImportedMapping.getSubContainerMappings().contains(originalMapping))
				{
					parentContainerImportedMapping.getSubContainerMappings().remove(originalMapping);
					parentContainerImportedMapping.getSubContainerMappings().add((ContainerMapping)importedMapping);
				}
				if (parentContainerImportedMapping.getSubNodeMappings().contains(originalMapping))
				{
					parentContainerImportedMapping.getSubNodeMappings().remove(originalMapping);
					parentContainerImportedMapping.getSubNodeMappings().add((NodeMapping)importedMapping);
				}

				if (parentContainerImportedMapping.getBorderedNodeMappings().contains(originalMapping))
				{
					parentContainerImportedMapping.getBorderedNodeMappings().remove(originalMapping);
					parentContainerImportedMapping.getBorderedNodeMappings().add((NodeMapping)importedMapping);
				}
			}
		}
	}

	/**
	 * @param data : the current import data
	 */
	private void createImport(MappingImportData data) {
		AbstractNodeMapping originalMapping = data.getOriginalMapping();
		AbstractNodeMapping importedMapping = data.getImportedMapping();
		if (importedMapping == null && originalMapping != null)
		{
			AbstractNodeMapping mappingImport = null;
			if (originalMapping instanceof ContainerMapping)
			{
				ContainerMapping containerMappingOriginal = (ContainerMapping)originalMapping;
				// Create a new Container AMpping Import
				ContainerMappingImport containerMappingImport = DescriptionFactory.eINSTANCE.createContainerMappingImport();
				mappingImport = containerMappingImport;
				// Define the mapping link between the original mapping and the new imported mapping 
				containerMappingImport.setImportedMapping(containerMappingOriginal);
			}
			
			if (originalMapping instanceof NodeMapping)
			{
				NodeMapping nodeOriginalMapping = (NodeMapping)originalMapping;
				// create a new Node Mapping Import
				NodeMappingImport nodeMappingImport= DescriptionFactory.eINSTANCE.createNodeMappingImport();
				mappingImport = nodeMappingImport;
				// Define the mapping link between the original mapping and the new imported mapping
				nodeMappingImport.setImportedMapping(nodeOriginalMapping);
			}
			
			if (mappingImport != null)
			{
				// Inherits data from the original mapping
				mappingImport.setName(originalMapping.getName()+"_Import");
				mappingImport.setLabel((originalMapping.getLabel() != null ? originalMapping.getLabel()+"_Import" : mappingImport.getName()));
				mappingImport.setDomainClass(originalMapping.getDomainClass());
				mappingImport.setPreconditionExpression(originalMapping.getPreconditionExpression());
				mappingImport.setSemanticElements(originalMapping.getSemanticElements());
				
				// Inherit all tool of the original Container Mapping except of DROP tools
				reuseTools(originalMapping, mappingImport);
				
				// Reuse all mapping contained in and reused by the original mapping
				reuseMappings(originalMapping, mappingImport);
			}
			else
			{
				// TODO: Throw an exception
			}
			
			data.setImportedMapping(mappingImport);
			data.setGenerated(true);
		}
	}
	
	public static void reuseMappings(AbstractNodeMapping originalMapping, AbstractNodeMapping importedMapping){
		// Reuse all Bordered Nodes of the the original mapping (the contained one and reused one)
		importedMapping.getReusedBorderedNodeMappings().addAll(MappingHelper.getAllBorderedNodeMappings(originalMapping ));
		
		if (importedMapping instanceof ContainerMappingImport)
		{
			ContainerMapping originalContainerMapping = (ContainerMapping)originalMapping;
			ContainerMappingImport containerImport = (ContainerMappingImport) importedMapping;
			// Reuse all Nodes of the the original mapping (contained and reused)
			containerImport.getReusedNodeMappings().addAll(MappingHelper.getAllNodeMappings(originalContainerMapping));
			// Reuse all Containers of the the original mapping (contained and reused)
			containerImport.getReusedContainerMappings().addAll(MappingHelper.getAllContainerMappings(originalContainerMapping));
		}
	}
	
	/**
	 * This method reuse all tools of the original Mapping into the imported mapping
	 * @param originalMapping
	 * @param importedMapping
	 */
	public static void reuseTools(AbstractNodeMapping originalMapping, AbstractNodeMapping importedMapping){
		if (originalMapping != null && importedMapping != null)
		{
			if (importedMapping instanceof NodeMappingImport)
			{
				NodeMappingImport nodeMappingImport = (NodeMappingImport) importedMapping;
				nodeMappingImport.getDropDescriptions().addAll(((NodeMapping)originalMapping).getDropDescriptions());
			}
			
			if (importedMapping instanceof ContainerMappingImport)
			{
				ContainerMappingImport containerMappingImport = (ContainerMappingImport) importedMapping;
				containerMappingImport.getDropDescriptions().addAll(((ContainerMapping)originalMapping).getDropDescriptions());
			}

			importedMapping.getDetailDescriptions().addAll(originalMapping.getDetailDescriptions());
			importedMapping.setDeletionDescription(originalMapping.getDeletionDescription());
			importedMapping.getPasteDescriptions().addAll(originalMapping.getPasteDescriptions());
			importedMapping.setDoubleClickDescription(originalMapping.getDoubleClickDescription());
			importedMapping.setLabelDirectEdit(originalMapping.getLabelDirectEdit());
			importedMapping.getNavigationDescriptions().addAll(originalMapping.getNavigationDescriptions());
		}
	}
	
	private List<MappingImportData> lookForChildrenOf(MappingImportData data){
		List<MappingImportData> result = new ArrayList<MappingImportData>();
		if (data != null)
		{
			for (MappingImportData iMappingImportData : mappingImportList) 
			{
				if (iMappingImportData.getParent() != null && iMappingImportData.getParent().equals(data))
				{
					result.add(iMappingImportData);
				}
			}
		}
		
		return result;
	}
	
	private void patchMappingReuse(MappingImportData dataToReuse){
		// Update reuse of each imported mapping
		for (MappingImportData iMappingImportData : mappingImportList) 
		{
			AbstractNodeMapping reusingNode = iMappingImportData.getImportedMapping();
			AbstractNodeMapping nodeToReuse = dataToReuse.getImportedMapping();
			// Reuse of a Node or a BorderedNode
			if (nodeToReuse instanceof NodeMapping)
			{
				reuseBorderedNode(reusingNode, dataToReuse);
				if (reusingNode instanceof ContainerMapping)
				{
					ContainerMapping reusingContainer = (ContainerMapping)reusingNode;
					reuseNode(reusingContainer, dataToReuse);
				}
			}
			else // Reuse of a container
			{
				if (nodeToReuse instanceof ContainerMapping &&
						reusingNode instanceof ContainerMapping)
				{
					ContainerMapping reusingContainer = (ContainerMapping)reusingNode;
					reuseContainer(reusingContainer, dataToReuse);
				}
			}
		}
	}
	
	public static void reuseBorderedNode(AbstractNodeMapping reusing, MappingImportData dataToReuse){
		boolean reused = false;
		NodeMapping reusedNodeMapping = null;
		for (NodeMapping iBorderedNode : reusing.getReusedBorderedNodeMappings()) 
		{
			if (iBorderedNode.equals(dataToReuse.getOriginalMapping()))
			{
				reusedNodeMapping = iBorderedNode;
				reused = true;
				break;
			}
		}
		
		if (reused)
		{
			reusing.getReusedBorderedNodeMappings().remove(reusedNodeMapping);
			reusing.getReusedBorderedNodeMappings().add((NodeMapping)dataToReuse.getImportedMapping());
		}
	}
	
	public static void reuseNode(ContainerMapping reusing, MappingImportData dataToReuse){
		boolean reused = false;
		NodeMapping reusedNodeMapping = null;
		for (NodeMapping iNode : reusing.getReusedNodeMappings()) 
		{
			if (iNode.equals(dataToReuse.getOriginalMapping()))
			{
				reusedNodeMapping = iNode;
				reused = true;
				break;
			}
		}
		
		if (reused)
		{
			reusing.getReusedNodeMappings().remove(reusedNodeMapping);
			reusing.getReusedNodeMappings().add((NodeMapping)dataToReuse.getImportedMapping());
		}
	}
	
	public static void reuseContainer(ContainerMapping reusing, MappingImportData dataToReuse){
		boolean reused = false;
		ContainerMapping reusedContainerMapping = null;
		for (ContainerMapping iContainer : reusing.getReusedContainerMappings()) 
		{
			if (iContainer.equals(dataToReuse.getOriginalMapping()))
			{
				reusedContainerMapping = iContainer;
				reused = true;
				break;
			}
		}
		
		if (reused)
		{
			reusing.getReusedContainerMappings().remove(reusedContainerMapping);
			reusing.getReusedContainerMappings().add((ContainerMapping)dataToReuse.getImportedMapping());
		}
	}
	
	private void registerImportData(MappingImportData data){
		if (! isImportRegistred(data))
		{
			mappingImportList.add(data);
			computeAutoImport(data);
		}
		else
		{
			for (MappingImportData iMappingImportData : mappingImportList) 
			{
				if ((iMappingImportData.equals(data) || iMappingImportData.originalEquals(data))
						&& iMappingImportData.getImportKind().equals(MappingImportKind.AUTO))
				{
					iMappingImportData.setGenerated(true);
					iMappingImportData.setImportKind(data.getImportKind());
					iMappingImportData.setImportedMapping(data.getImportedMapping());
					iMappingImportData.setParent(data.getParent());
				}
			}
		}
	}
	
	private void computeAutoImport(MappingImportData currentData){
		AbstractNodeMapping originalMapping = currentData.getOriginalMapping();
		
		/********************** Handle container of original Mapping ***********************/
		if (! (originalMapping.eContainer() instanceof Layer))
		{
			MappingImportData parrentData = createOrGetParentDataOf(currentData);
			if (! isImportRegistred(parrentData))
			{
				registerImportData(parrentData);
			}
			
			if (currentData.getParent() == null &&
					currentData.getImportKind().equals(MappingImportKind.AUTO))
			{
				currentData.setParent(parrentData);
			}
		}
		
		/********************** Handle mapping reusing original Mapping ***********************/
		// get the Layer of original_m.
		Layer originalLayer = getCorrespondingLayer(originalMapping);
		
		// check any element
		if (originalMapping instanceof NodeMapping)
		{
			for (ContainerMapping iContainerMapping : originalLayer.getContainerMappings()) 
			{
				if (iContainerMapping.getReusedBorderedNodeMappings().contains(originalMapping) 
						|| iContainerMapping.getReusedNodeMappings().contains(originalMapping))
				{
					registerImportData(new MappingImportData(iContainerMapping));
				}
			}
			
			for (NodeMapping iNodeMapping : originalLayer.getNodeMappings()) 
			{
				if (iNodeMapping.getReusedBorderedNodeMappings().contains(originalMapping) 
						&& ! originalMapping.equals(iNodeMapping))
				{
					registerImportData(new MappingImportData(iNodeMapping));
				}
			}
		}
		
		// check only containers
		if (originalMapping instanceof ContainerMapping)
		{
			for (ContainerMapping iContainerMapping : originalLayer.getContainerMappings()) 
			{
				if (iContainerMapping.getReusedContainerMappings().contains(originalMapping) 
						&& ! originalMapping.equals(iContainerMapping))
				{
					registerImportData(new MappingImportData(iContainerMapping));
				}
			}
		}
	}
	
	private MappingImportData createOrGetParentDataOf(MappingImportData data){
		if (data.getParent() != null)
		{
			return data.getParent();
		}
		else
		{
			if (!(data.getOriginalMapping().eContainer() instanceof Layer))
			{
				AbstractNodeMapping parentOriginalMapping = (AbstractNodeMapping)data.getOriginalMapping().eContainer();
				MappingImportData parentData = new MappingImportData(parentOriginalMapping);
				return lookForMappingInRegisteredMapping(parentData);
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
			for (MappingImportData iMappingImportData : mappingImportList) 
			{
				if (iMappingImportData.equals(data))
				{
					return iMappingImportData;
				}
			}
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
			{
				parent = parent.eContainer();
			}
			
			if (parent != null && parent instanceof Layer)
			{
				return (Layer) parent;
			}
		}
		return null;
	}
}
