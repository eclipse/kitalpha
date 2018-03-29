/*******************************************************************************
 * Copyright (c) 2015, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.validation.condition;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.sirius.diagram.ContainerLayout;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerChildren;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node;

/**
 * @author Boubekeur Zendagui
 */
public class ContainerChildrenRepresentationContraint implements IAdditionalConstraint{

	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint#isObjectInScope(java.lang.Object)
	 */
	@Override
	public boolean isObjectInScope(Object object) {
		return object instanceof Container;
	}

	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint#validationRules(java.lang.Object)
	 */
	@Override
	public ValidationStatus validationRules(Object data) {
		Container container = (Container) data;
		final ContainerLayout contentLayout = container.getContentLayout();
		if (contentLayout.equals(ContainerLayout.FREE_FORM) || 
				contentLayout.equals(ContainerLayout.LIST))
			return ValidationStatus.Ok;
		
		final ContainerChildren children = container.getChildren();
		
		if (children == null)
			return ValidationStatus.Ok;
		
		if (children.getOwned_nodes().isEmpty() && children.getReused_nodes().isEmpty())
			return ValidationStatus.Ok;
		
		EList<AbstractNode> allNodes = new BasicEList<AbstractNode>();
		final EList<AbstractNode> owned_nodes = children.getOwned_nodes();
		if (owned_nodes.isEmpty())
		{
			allNodes.addAll(owned_nodes);
		}
		
		final EList<AbstractNode> reused_nodes = children.getReused_nodes();
		if (!reused_nodes.isEmpty())
		{
			allNodes.addAll(reused_nodes);
		}
		
		for (AbstractNode abstractNode : allNodes) 
		{
			if (abstractNode instanceof Node)
				return ValidationStatus.Error;

			if (abstractNode instanceof Container)
			{
				ContainerLayout contentLayout2 = ((Container) abstractNode).getContentLayout();
				if (contentLayout2.equals(ContainerLayout.HORIZONTAL_STACK) || 
						contentLayout2.equals(ContainerLayout.VERTICAL_STACK))
					return ValidationStatus.Error;
			}
		}
		return ValidationStatus.Ok;
	}

	/*
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint#getMessage(org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus, java.lang.Object)
	 */
	@Override
	public String getMessage(ValidationStatus status, Object object) {
		return "Stacks Containers are not compatible with Node and Stacks-Container children";
	}

}
