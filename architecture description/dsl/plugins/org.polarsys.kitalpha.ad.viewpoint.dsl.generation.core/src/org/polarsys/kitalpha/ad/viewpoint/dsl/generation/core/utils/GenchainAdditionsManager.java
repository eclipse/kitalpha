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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.core.utils;

import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.egf.portfolio.genchain.generationChain.FeatureAddition;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChain;
import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChainFactory;
import org.eclipse.egf.portfolio.genchain.generationChain.PluginAddition;

/**
 * @author Boubekeur Zendagui
 */

public class GenchainAdditionsManager {

	public static GenchainAdditionsManager INSTANCE = new GenchainAdditionsManager();
	
	private ArrayList<String> pluginList_ = new ArrayList<String>();
	private ArrayList<String> featureList_ = new ArrayList<String>();
	private String vpName_ = null;
	
	public void initGenchainAdditionsResources(){
		pluginList_.clear();
		featureList_.clear();
		vpName_ = null;
	}

	public void addAdditions(GenerationChain chain){
		if (pluginList_!= null && !pluginList_.isEmpty()){
			PluginAddition plug = GenerationChainFactory.eINSTANCE.createPluginAddition();
			for (String iPlugin : pluginList_) {
				plug.getAdditions().add(iPlugin);
			}
			plug.setName("Generated Plugins for "+vpName_);
			chain.getElements().add(plug);
		}
		if (featureList_ != null && !featureList_.isEmpty()){
			FeatureAddition feat = GenerationChainFactory.eINSTANCE.createFeatureAddition();
			for (String iFeature : featureList_) {
				feat.getAdditions().add(iFeature);
			}
			feat.setName("Generated Features for "+vpName_);
			chain.getElements().add(feat);
		}
	}
	
	public void setVpName(String name){
		if (vpName_ == null){
			vpName_ = name;
		}
	}
	
	/**
	 * Register a Plugin to include in the generated generationChain as Plugin 
	 * addition 
	 * @param iPluginName the plugin to add in the generation as PluginAddition
	 */
	public void registerPlugin(String iPluginName){
		if (! pluginList_.contains(iPluginName)){
			pluginList_.add(iPluginName);
		}
	}
	
	/**
	 * Register a Feature to include in the generated generationChain as Feature 
	 * addition  
	 * @param iFeatureName the feature to add in the generation as FeatureAddition
	 */
	public void registerFeature(String iFeatureName){
		if (! featureList_.contains(iFeatureName)){
			featureList_.add(iFeatureName);
		}
	}
	
	@Deprecated
	public void registerPlugin(IProject iPlugin){
		if (! pluginList_.contains(iPlugin.getName())){
			pluginList_.add(iPlugin.getName());
		}
	}
	
	@Deprecated
	public void registerFeature(IProject iFeature){
		if (! featureList_.contains(iFeature.getName())){
			featureList_.add(iFeature.getName());
		}
	}

//************************************************************************************	
//  !!!!!!!!!!!!!!!!!!!!!!!!!!! Never used methods !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//************************************************************************************	
//	public List<String> getWSPluginsNames(){
//		 List<String> plugList = new ArrayList<String>();
//        for (IPluginModelBase iPluginModelBase : PluginRegistry.getWorkspaceModels()) 
//		  {
//            plugList.add(iPluginModelBase.getBundleDescription().getSymbolicName());
//        }
//        
//		return plugList;
//	}
//
//	public List<String> getWSFeaturesNames(){
//		List<String> featList = new ArrayList<String>();
//        for (IFeatureModel iFeatureModel : 
//				PDECore.getDefault().getFeatureModelManager().getWorkspaceModels()) 
//		  {
//            featList.add(iFeatureModel.getFeature().getId());
//        }
//		return featList;
//	} 
	
}
