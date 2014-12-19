package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.helper;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration.VpDslConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ConfigurationElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ExtensionGeneratrionConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Generation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.conf.desc.aird.model.DescAirdGenConf.AirdGenerationConfiguration;

public class AirdGenerationConfigurationHelper {

	public static boolean generate(EObject anyModelElement){
		Configuration vpConf = VpDslConfigurationHelper.getViewpointConfiguration(anyModelElement);
		EList<ConfigurationElement> vpConfigurationElements = vpConf.getVpConfigurationElements();
		if (vpConfigurationElements != null && vpConfigurationElements.isEmpty() == false)
		{
			for (ConfigurationElement configurationElement : vpConfigurationElements) 
			{
				if (configurationElement instanceof Generation)
				{
					EList<ExtensionGeneratrionConfiguration> ownedExtGenConf = ((Generation) configurationElement).getOwnedExtensionGenConf();
					if (ownedExtGenConf != null && ownedExtGenConf.isEmpty() == false)
					{
						for (ExtensionGeneratrionConfiguration extGenConf : ownedExtGenConf) 
						{
							if (extGenConf instanceof AirdGenerationConfiguration)
							{
								return ((AirdGenerationConfiguration) extGenConf).isGenRepresentations();
							}
						}
					}
				}
			}
		}
		return true;
	}
}
