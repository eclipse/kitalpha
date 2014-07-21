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

package org.polarsys.kitalpha.ad.af.dsl.generation.desc.internal;

import java.util.Stack;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.egf.domain.Activator;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ArchitectureFramework;
import org.polarsys.kitalpha.ad.af.dsl.generation.desc.graph.GenerationGraph;
import org.polarsys.kitalpha.ad.af.dsl.generation.desc.graph.GenerationGraphCycle;
import org.polarsys.kitalpha.ad.af.dsl.generation.desc.graph.GenerationStack;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.manager.GenerationEventManager;

/**
 * @author Boubekeur Zendagui
 */

public class AFViewpointGenerationOrchetrator{
	
	/**
	 * This method manages vpdsl viewpoint generation. It launch the generation 
	 * of one vpdsl viewpoint and create a listener that listen to 
	 * ViewpointGenerationEndEvent.
	 * 
	 * When the listener intercept a ViewpointGenerationEndEvent, it launch the 
	 * generation of the next vpdsl viewpoints registered in 
	 * <code>_viewpointToGenerate<code> list.
	 */
	public void orchestrateVPGeneration(ArchitectureFramework af_description,
										String afModelStringURI, 
										IProgressMonitor monitor){
		GenerationGraph generationGraph = new GenerationGraph(af_description);
		if (generationGraph.isEmpty() == false)
		{
			// Check if there is cycles
			GenerationGraphCycle cycleDetect = new GenerationGraphCycle(generationGraph);
			cycleDetect.analyse();
			if (cycleDetect.exist())
			{
				String message = "The next cyclic references have to be resolved \n" + cycleDetect.cyclesToString();
				Activator.getDefault().log(new Status(Status.ERROR, Activator.getDefault().getPluginID(), message));
				return;
			}
			
			// Create the generation Stack
			GenerationStack stack = new GenerationStack();
			stack.compute(generationGraph);
			stack.print();
			Stack<Viewpoint> vpStack = stack.getViewpointStack();
			
			// Create the viewpoint generation listener
			VpGenerationListenerForOrchestration listener = 
				new VpGenerationListenerForOrchestration(vpStack, af_description, afModelStringURI, monitor);
			// Register it
			GenerationEventManager.getInstance().addGenerationListener(listener);
		}
	}
}
