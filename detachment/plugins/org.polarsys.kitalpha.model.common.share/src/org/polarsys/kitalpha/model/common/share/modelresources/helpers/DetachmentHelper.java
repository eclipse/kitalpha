/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.share.modelresources.helpers;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/**
 * 
 * @author Faycal Abka,
 * 	       Boubekeur Zendagui
 *
 */
public class DetachmentHelper {
	
	private static Map<URI, Resource> loadedResources = new HashMap<URI, Resource>();
	private static final Logger _LOGGER = Logger.getLogger(DetachmentHelper.class); 
	
	public static URI getPlatformURIFromNSURI(URI uri){
		Resource r = null;
		r = loadedResources.get(uri);
		if (r == null)
		{
			ResourceSet rs = new ResourceSetImpl();
			URI genmodelURI = EcorePlugin.getEPackageNsURIToGenModelLocationMap().get(uri.toString());
			if (genmodelURI != null && genmodelURI.isPlatformPlugin()) 	{
				r = rs.createResource(genmodelURI);
				loadedResources.put(uri, r);
			}
		}
		
		if (r != null)
		{
			try {
				if (!r.isLoaded()) {
					r.load(null);
				}
			} 
			catch (IOException e) {
				_LOGGER.error("Unable to load resource " + uri, e);
			}
			/**************************/
			
			EList<EObject> genContents = r.getContents();;
			if (genContents != null && ! genContents.isEmpty())
			{
				EList<GenPackage> genmodels = ((GenModel)genContents.get(0)).getGenPackages();
				for(GenPackage genPackage: genmodels)
				{
					return genPackage.getEcorePackage().eResource().getURI();
				}
			}
		}

		return null;
	}
	
	public static URI getPlatformResourceURIFromEObject(EObject eObject){
		EObject rootContainer = EcoreUtil.getRootContainer(eObject);
		if (rootContainer instanceof EPackage)
		{
			String nsURI2 = ((EPackage) rootContainer).getNsURI();
			if (nsURI2 == null) {
				return null;
			}
			return DetachmentHelper.getPlatformURIFromNSURI(URI.createURI(nsURI2));
		}
		else
		{
			// FIXME: Why detach go back to ecore of the current object ?
			String nsURI = eObject.eClass().getEPackage().getNsURI();
			return DetachmentHelper.getPlatformURIFromNSURI(URI.createURI(nsURI));
		}
	}
	
	
	
	//TODO check the extension of the uri of all helpers (ie, aird)
	public static Collection<String> getRefrencedModelURIFromAirdResource(Resource airdResource){
		Collection<String> result = null;
		
		
		try {
			URI uri = airdResource.getURI();
			String projectName = uri.segment(1);
			String airdRelativePath = getRelativePath(uri);
			
			//Assume the resource exists
			IFile airdFile = (IFile) ResourcesPlugin.getWorkspace().getRoot().getProject(projectName).findMember(airdRelativePath);
			
			
			SAXParserFactory saxFactory = SAXParserFactory.newInstance();
			saxFactory.setNamespaceAware(false);
			SAXModelsElementsParser modelEltParser = new SAXModelsElementsParser();
			SAXParser saxParser = saxFactory.newSAXParser();
			XMLReader xmlReader = saxParser.getXMLReader();
			xmlReader.setContentHandler(modelEltParser);
			InputSource is = new InputSource();
			is.setByteStream(airdFile.getContents());
			xmlReader.parse(is);
			
			return modelEltParser.getMelodyModellers();
			
			
		} catch (ParserConfigurationException | SAXException | CoreException | IOException e) {
			_LOGGER.error(e);
		}
		
		return result;
	}
	
	
	private static String getRelativePath(URI uri) {
		StringBuilder buf = new StringBuilder();
		String[] segments = uri.segments();
		
		if (segments.length > 1){
			for (int i = 2; i < segments.length - 1; i++){
				buf.append(segments[i]).append("/");
			}
		}
		buf.append(uri.lastSegment());
		
		return buf.toString();
	}


	public static class SAXModelsElementsParser extends DefaultHandler {
		
		Collection<String> melodyModellers;
		
		@Override
		public void startDocument() throws SAXException{
			melodyModellers = new HashSet<String>();
		}
		
		@Override
		public void startElement(String namespaceURI, String name, String qname, Attributes attr)
				throws SAXException {
			
			if (qname != null && qname.equals("models")){ //$NON-NLS-1
				String fileModelName = attr.getValue("href"); //$NON-NLS-1
				
				if (fileModelName != null && !fileModelName.isEmpty()){
					if (fileModelName.contains("#")){ //NON-NLS-1
						fileModelName = fileModelName.substring(0, fileModelName.indexOf("#"));
					}
					melodyModellers.add(fileModelName);
				}
			}
		}

		@Override
		public void endDocument() throws SAXException {
		}


		public Collection<String> getMelodyModellers() {
			return melodyModellers;
		}
		
	}


	public static Collection<Resource> getRefrencedModelResources(
			Resource resource, Collection<String> refrencedModels) {
		
		Collection<Resource> refrencedResources = new HashSet<Resource>();
		
		ResourceSet resourceSet = resource.getResourceSet();
		EList<Resource> resources = resourceSet.getResources();
		
		for (Resource resource2 : resources) {
			String resourceName = resource2.getURI().lastSegment();
			
			if (refrencedModels.contains(resourceName)){
				refrencedResources.add(resource2);
			}
		}
		
		return refrencedResources;
	}
	
	
	public static Collection<Resource> getRefrencedModelResources(Resource resource) {
		
		Collection<Resource> refrencedResources = new HashSet<Resource>();
		Collection<String> refrencedModels = getRefrencedModelURIFromAirdResource(resource);
		
		ResourceSet resourceSet = resource.getResourceSet();
		EList<Resource> resources = resourceSet.getResources();
		
		for (Resource resource2 : resources) {
			String resourceName = resource2.getURI().lastSegment();
			
			if (refrencedModels != null && refrencedModels.contains(resourceName)){
				refrencedResources.add(resource2);
			}
		}
		
		return refrencedResources;
	}

}
