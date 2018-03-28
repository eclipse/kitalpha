/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.task;

import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.adapter.TaskProductionAdapter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.log.ViewpointDslLogger;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.internal.icons.GenerateIconPrecondition;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.exception.ViewpointResourceException;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resourceimpl.GenmodelProviderImpl;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resourceimpl.ViewpointResourceProviderRegistry;

/**
 * @author Boubekeur Zendagui
 */

public class generateEditToolsIconsTask extends TaskProductionAdapter {

	private static final String LVPS_ICONS_FOLDER_ = "icons";

	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		EMFDomain model = productionContext.getInputValue(VPDESC_MODEL, EMFDomain.class);
		Viewpoint vp = (Viewpoint) model.getContent().get(0);
		try {
			generateToolsIcon(vp, LVPS_ICONS_FOLDER_);
		} catch (ViewpointResourceException e) {
			throw new InvocationException(e);
		}
	}

	public void generateToolsIcon(Viewpoint viewpoint, String dslvpIconFolder) throws ViewpointResourceException{
		if (! GenerateIconPrecondition.generateIcon())
			return ;
		
		GenmodelProviderImpl genmodelProvider = ViewpointResourceProviderRegistry.getInstance().getGenmodelProvider();
		GenModel genModel = genmodelProvider.getGenModel();
		GenPackage genPackage =  genmodelProvider.getGenPackage();

		String dslvpProjectName = viewpoint.eResource().getURI().segment(1);

		// This is an adapted java code of the method doGenerate defined in the Pattern CreateChildIconForGenClass (plug-in : org.eclipse.egf.emf.pattern.edit)
		for (GenClass genClass : genPackage.getGenClasses())
			if (genModel.isCreationCommands() && genModel.isCreationIcons()) 
				for (GenFeature feature : genClass.getCreateChildFeaturesIncludingDelegation()) 
					for (GenClass childClass : genClass.getChildrenClasses(feature)) 
					{
						String iconSrcPath = getIconSourcePath(viewpoint, childClass);
						if (iconSrcPath != null && iconSrcPath.trim().length() > 0)
						{
							String srcIconPath = "/"+dslvpProjectName +"/"+dslvpIconFolder +"/"+ iconSrcPath;
							CopyImageFromTo(srcIconPath, genClass.getCreateChildIconFileName(feature,childClass));
						}
					}

		// This is an adapted java code of the method doGenerate defined in the Pattern CreateChildIconForGenPackage 
		// (plug-in : org.eclipse.egf.emf.pattern.edit)
		// The Source icon path is got from the corresponding vpspec.Class children class.
		if (genModel.isCreationCommands() && genModel.isCreationIcons() && genPackage.isChildCreationExtenders())
		{
			Map<GenPackage, Map<GenClass, List<GenClass.ChildCreationData>>> packages = null;
			try{
				packages = genPackage.getExtendedChildCreationData();
			}catch (Exception e) {
				// FIXME: Investigate why EMF bug when trying to get "getExtendedChildCreationData()"
				// TODO: handle exception
			}
			if (packages != null)
			{
				for (Map.Entry<GenPackage,Map<GenClass,List<GenClass.ChildCreationData>>> packageEntry : packages.entrySet()) 
					for (Map.Entry<GenClass,List<GenClass.ChildCreationData>> classEntry : packageEntry.getValue().entrySet()) 
					{
						GenClass genClass=classEntry.getKey();
						for (GenClass.ChildCreationData childCreationData : classEntry.getValue()) 
							if (childCreationData.createClassifier instanceof GenClass && 
									( childCreationData.delegatedFeature == null || 
											classEntry.getKey().getAllGenFeatures().contains(childCreationData.delegatedFeature))) 
							{
								GenClass childClass=(GenClass)childCreationData.createClassifier;
								GenFeature feature=childCreationData.createFeature;
								String iconSrcPath = getIconSourcePath(viewpoint, childClass);
								if (iconSrcPath != null && iconSrcPath.trim().length() > 0)
								{
									String srcIconPath = "/"+dslvpProjectName +"/"+dslvpIconFolder +"/"+ iconSrcPath;
									CopyImageFromTo(srcIconPath, genClass.getCreateChildIconFileName(genModel,feature,childClass));
								}
							}
					}
			}
		}
	}

	private void CopyImageFromTo(String srcPath, String destPath){
		IPath sourcePath = new Path(srcPath);
		IFile sourceFile = ResourcesPlugin.getWorkspace().getRoot().getFile(sourcePath);

		if (sourceFile.exists()){
			IPath destinationPath = new Path(destPath);
			IFile destinationFile = ResourcesPlugin.getWorkspace().getRoot().getFile(destinationPath);

			try {
				destinationFile.setContents(sourceFile.getContents(), IFile.REPLACE, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}else{
			ViewpointDslLogger.doLogWarning("Unable to find the icon : " + srcPath);
		}
	}

	private String getIconSourcePath(Viewpoint viewpoint, GenClass childClass){
		Data data = viewpoint.getVP_Data();

		if (data != null)
		{
			EList<Class> classList = data.getVP_Classes();
			if (classList != null )
			{
				for (Class iClass : classList)
				{
					String ecoreClassName = childClass.getEcoreClass().getName();
					if (iClass.getName().toLowerCase().equals(ecoreClassName.toLowerCase()))
						return iClass.getIcon();

				}
			}
		}

		return null;
	}

}
