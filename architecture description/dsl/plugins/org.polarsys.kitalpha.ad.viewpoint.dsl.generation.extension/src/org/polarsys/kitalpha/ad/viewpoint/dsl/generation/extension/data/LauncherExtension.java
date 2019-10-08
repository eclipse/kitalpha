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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.data;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.constant.Messages;

/**
 * @author Boubekeur Zendagui
 */

public class LauncherExtension {
	
	/** Name of configuration element used to declare the FCore generator extension. 
	 *  This data is as defined in the extension point ********/
	private String configurationElementName_;
	
	/** Name of attribute as defined in the extension point ********/
	private String extensionNameAttributeName_;
	private String extensionCategoryAttributeName_;
	private String extensionDescriptionAttributeName_;
	private String extensionFCoreAttributeName_;

	// The extension for which the luncher is created
	public IExtension iExtension;

	/** the values of the attributes as provided in the Extension "iExtension" **/
	public String extensionNameAttributeValue;
	public String extensionCategoryAttributeValue = ""; //$NON-NLS-1$
	public String extensionDescriptionAttributeValue = ""; //$NON-NLS-1$
	public String extensionFCoreAttributeValue;

	@Deprecated
	private boolean isExtensionDisplayable = false;

	/** 
	 * Allows to know if the extension is active or not. 
	 * This attribute is useful when the user selection is active. So each 
	 * selected extension are active. The unselected one are not active.
	 */
	private boolean active_;

	/**
	 * active_ parameter default getter
	 * @return True if the extension is active. False else
	 */
	public boolean isActive() {
		return active_;
	}

	/**
	 * active_ parameter default setter
	 * @param active
	 */
	public void setActive(boolean active) {
		this.active_ = active;
	}

	/**
	 * Default constructor. 
	 * @param iExtension : The extension as defined in the plug-in
	 * 
	 * @param configurationElementName : the name of the configuration element 
	 * 		  as defined in the extension point. This information allows to read
	 * 		  the extension _iExtension in order to look for the attribute containing
	 * 		  the FCore Path.
	 * 
	 * @param extensionFCoreAttributeName : The name of the attribute as defined 
	 * 		  in the extension point. This information allows to localize the 
	 * 		  attribute containing the FCore Path. 
	 */
	public LauncherExtension(IExtension iExtension, 
			String configurationElementName,
			String extensionFCoreAttributeName)
	{
		this.iExtension = iExtension;
		active_ = true;
		configurationElementName_ = configurationElementName;
		extensionFCoreAttributeName_ = extensionFCoreAttributeName;

		setPropertiesValues();
	}
	
	/**
	 * This method allows to set extension informations that allow to compute 
	 * data to display in the selection UI.
	 * 
	 * @param extensionNameAttributeName : The name of the Name attribute as 
	 * 		  defined in the extension point
	 * 
	 * @param extensionCategoryAttributeName : The name of the Category attribute  
	 * 		  as defined in the extension point
	 * 
	 * @param extensionDescriptionAttributeName : The name of the Description   
	 * 		  attribute as defined in the extension point
	 */

	public void setDiplayableData(String extensionNameAttributeName,
			String extensionCategoryAttributeName,
			String extensionDescriptionAttributeName)
	{
		extensionNameAttributeName_ = extensionNameAttributeName;
		extensionCategoryAttributeName_ = extensionCategoryAttributeName;
		extensionDescriptionAttributeName_ = extensionDescriptionAttributeName;

		for (IConfigurationElement iConfigurationElement : iExtension.getConfigurationElements()) 
		{
			if (iConfigurationElement.getName().equalsIgnoreCase(configurationElementName_))
			{
				if (extensionNameAttributeName_ != null && extensionNameAttributeName_.length() > 0)
				{
					extensionNameAttributeValue = iConfigurationElement.getAttribute(extensionNameAttributeName_);
					if (extensionNameAttributeValue == null || extensionNameAttributeValue.trim().length() == 0)
						checkAttribut(iConfigurationElement, extensionNameAttributeName_, true);
				}

				if (extensionCategoryAttributeName_ != null && extensionCategoryAttributeName_.length() > 0)
				{
					extensionCategoryAttributeValue = iConfigurationElement.getAttribute(extensionCategoryAttributeName_);
					if (extensionCategoryAttributeValue == null )
					{
						extensionCategoryAttributeValue = ""; //$NON-NLS-1$
						checkAttribut(iConfigurationElement, extensionCategoryAttributeName_, false);
					}
				}

				if (extensionDescriptionAttributeName_ != null && extensionDescriptionAttributeName_.length() > 0)
				{
					extensionDescriptionAttributeValue = iConfigurationElement.getAttribute(extensionDescriptionAttributeName_);
					if (extensionDescriptionAttributeValue == null )
					{
						extensionDescriptionAttributeValue = ""; //$NON-NLS-1$
						checkAttribut(iConfigurationElement, extensionDescriptionAttributeName_, false);
					}
				}

			}
		}
	}

	/**
	 * 
	 * @param iExtension
	 * @param configurationElementName
	 * @param extensionFCoreAttributeName
	 * @param extensionNameAttributeName
	 * @param extensionCategoryAttributeName
	 * @param extensionDescriptionAttributeName
	 * @param dispalyable
	 */
	@Deprecated
	public LauncherExtension(IExtension iExtension, 
			String configurationElementName,
			String extensionFCoreAttributeName,
			String extensionNameAttributeName,
			String extensionCategoryAttributeName,
			String extensionDescriptionAttributeName,
			boolean dispalyable)
	{
		this.iExtension = iExtension;
		active_ = true;
		configurationElementName_ = configurationElementName;
		extensionFCoreAttributeName_ = extensionFCoreAttributeName;

		extensionNameAttributeName_ = extensionNameAttributeName;
		extensionCategoryAttributeName_ = extensionCategoryAttributeName;
		extensionDescriptionAttributeName_ = extensionDescriptionAttributeName;

		isExtensionDisplayable = dispalyable;

		setPropertiesValues();
	}

	private void setPropertiesValues()
	{
		for (IConfigurationElement iConfigurationElement : iExtension.getConfigurationElements()) 
		{
			if (iConfigurationElement.getName().equalsIgnoreCase(configurationElementName_))
			{
				if (extensionFCoreAttributeName_ != null && extensionFCoreAttributeName_.length() > 0)
				{
					extensionFCoreAttributeValue = iConfigurationElement.getAttribute(extensionFCoreAttributeName_);
					if (extensionFCoreAttributeValue == null || extensionFCoreAttributeValue.trim().length() == 0)
						checkAttribut(iConfigurationElement, extensionFCoreAttributeName_, true);
				}

				if (isExtensionDisplayable)
				{
					if (extensionNameAttributeName_ != null && extensionNameAttributeName_.length() > 0)
					{
						extensionNameAttributeValue = iConfigurationElement.getAttribute(extensionNameAttributeName_);
						if (extensionNameAttributeValue == null || extensionNameAttributeValue.trim().length() == 0)
							checkAttribut(iConfigurationElement, extensionNameAttributeName_, isExtensionDisplayable);
					}

					if (extensionCategoryAttributeName_ != null && extensionCategoryAttributeName_.length() > 0)
					{
						extensionCategoryAttributeValue = iConfigurationElement.getAttribute(extensionCategoryAttributeName_);
						if (extensionCategoryAttributeValue == null )
						{
							extensionCategoryAttributeValue = ""; //$NON-NLS-1$
							checkAttribut(iConfigurationElement, extensionCategoryAttributeName_, false);
						}
					}

					if (extensionDescriptionAttributeName_ != null && extensionDescriptionAttributeName_.length() > 0)
					{
						extensionDescriptionAttributeValue = iConfigurationElement.getAttribute(extensionDescriptionAttributeName_);
						if (extensionDescriptionAttributeValue == null )
						{
							extensionDescriptionAttributeValue = ""; //$NON-NLS-1$
							checkAttribut(iConfigurationElement, extensionDescriptionAttributeName_, false);
						}
					}
				}
			}
		}
	}

	private void checkAttribut(IConfigurationElement iConfigurationElement, String AttributeName, boolean mandadory){
		boolean found = false;
		String message = Messages.bind(Messages.Launcher_Extension_Attribut_NotExist, configurationElementName_, AttributeName);

		for (String name : iConfigurationElement.getAttributeNames()) 
			if (name.equalsIgnoreCase(AttributeName))
			{
				found = true;
				break;
			}

		if (! found)
		{
			if (mandadory)
				throw new IllegalArgumentException(message);
			else
				// Display an information in the Log
				System.out.println(message);
		}
	}
}
