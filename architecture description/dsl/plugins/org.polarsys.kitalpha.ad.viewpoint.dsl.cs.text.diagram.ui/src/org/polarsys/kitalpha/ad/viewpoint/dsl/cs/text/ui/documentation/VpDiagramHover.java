/*******************************************************************************
 * Copyright (c) 2014-2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.documentation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Tuples;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramChildren;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.SynchronizationMode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpdiagramGrammarAccess;

import com.google.common.base.Strings;
import com.google.inject.Inject;

/**
 * 
 * @author Faycal ABKA
 *
 */
public class VpDiagramHover extends CommonEObjectHover {
	
	@Inject
	private IGrammarAccess grammarAccess;
	
	@Inject
	private ILabelProvider labelProvider;
	
	@Override
	protected Pair<EObject, IRegion> getXtextElementAt(XtextResource resource, int offset) {
		IParseResult parseResult = resource.getParseResult();
		
		if (parseResult != null && grammarAccess instanceof VpdiagramGrammarAccess){
			VpdiagramGrammarAccess g = (VpdiagramGrammarAccess)grammarAccess;
			
			ILeafNode leafNode = NodeModelUtils.findLeafNodeAtOffset(parseResult.getRootNode(), offset);
			String value = leafNode.getText();
			
			
			if (!Strings.isNullOrEmpty(value) && 
					(value.equalsIgnoreCase(g.getSynchronizationModeAccess().getUnsynchronizableUnsynchronizableKeyword_0_0().getValue()) ||
					value.equalsIgnoreCase(g.getSynchronizationModeAccess().getNot_SynchronizedNot_SynchronizedKeyword_1_0().getValue()) ||
					value.equalsIgnoreCase(g.getSynchronizationModeAccess().getSynchronizedSynchronizedKeyword_2_0().getValue()))){
				
				EObject semanticObject = NodeModelUtils.findActualSemanticObjectFor(leafNode);
				return Tuples.create(semanticObject, (IRegion)new Region(leafNode.getOffset(), leafNode.getLength()));
			}
			
		}
		return super.getXtextElementAt(resource, offset);
	}
	
	@Override
	public Object getHoverInfo(EObject first, ITextViewer textViewer, IRegion hoverRegion) {

		if (first instanceof DiagramChildren){
			if (((DiagramChildren)first).getSynchronizationMode().equals(SynchronizationMode.NOT_SYNCHRONIZED)){
				return"The Mapping Will Be Always Not synchronized"; //$NON-NLS-1$;
			}
			if (((DiagramChildren)first).getSynchronizationMode().equals(SynchronizationMode.SYNCHRONIZED)){
				return "The Mapping Will Be always Synchronized"; //$NON-NLS-1$
			}
			if (((DiagramChildren)first).getSynchronizationMode().equals(SynchronizationMode.UNSYNCHRONIZABLE)){
				return "The Synchronization Of The Mapping Depends On the Synchronization Defined By The User"; //$NON-NLS-1$
			}
		}
		
		return super.getHoverInfo(first, textViewer, hoverRegion);
	}

}
