/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.share.modelresources.helpers;

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/**
 * 
 * @author Faycal Abka
 *
 */
public class DetachmentHelper {
	
	public static URI getPlatformURIFromNSURI(URI uri){

		ResourceSet rs = new ResourceSetImpl();
		
		URI genmodelURI = EcorePlugin.getEPackageNsURIToGenModelLocationMap().get(uri.toString());

		if (genmodelURI != null){

			Resource r = rs.createResource(genmodelURI);

			try {
				if (!r.isLoaded()){
					r.load(null);
				}
			} catch (IOException e) {
			}

			EList<EObject> genContents = r.getContents();
			if (genContents != null && !genContents.isEmpty()){
				EList<GenPackage> genmodels = ((GenModel)genContents.get(0)).getGenPackages();
				for(GenPackage genPackage: genmodels){
					URI platformURI = genPackage.getEcorePackage().eResource().getURI();
					return platformURI;
				}
			}
		}
		return null;
	}
	
	
	public static URI getPlatformResourceURIFromEObject(EObject eObject){
		String nsURI = eObject.eClass().getEPackage().getNsURI();
		return DetachmentHelper.getPlatformURIFromNSURI(URI.createURI(nsURI));
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
			
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	private static String getRelativePath(URI uri) {
		StringBuffer buf = new StringBuffer();
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
		
		public void startDocument() throws SAXException{
			melodyModellers = new HashSet<String>();
		}
		
		
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
			
			if (refrencedModels.contains(resourceName)){
				refrencedResources.add(resource2);
			}
		}
		
		return refrencedResources;
	}

}
