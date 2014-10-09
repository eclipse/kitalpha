package org.polarsys.kitalpha.transposer.m2t.simplecomponent.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.ComponentElement;
import org.polarsys.kitalpha.emde.example.simplecomponent.model.simplecomponent.SimplecomponentPackage;
import org.polarsys.kitalpha.transposer.m2t.simplecomponent.ecore.Activator;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper;

public class SimplecomponentDomainHelper implements IDomainHelper {

	public SimplecomponentDomainHelper() {
	}

	@Override
	public Collection<Class<?>> getAllDomainMetaclasses() {
		Set<Class<?>> eAllEClasses = new LinkedHashSet<Class<?>>();
		Set<EClass> allEClasses = getAllClasses();
		
		for(EClass eClass: allEClasses){
			Class<?> instanceClass = eClass.getInstanceClass();
			if (instanceClass != null){
				eAllEClasses.add(instanceClass);
			}
		}
		return eAllEClasses;
	}

	private Set<EClass> getAllClasses() {
		Set<EClass> allEClasses = new LinkedHashSet<EClass>();
		for(EPackage ePackage: getEPackages()){
			addEClasses(ePackage, allEClasses);
		}
		return allEClasses;
	}
	
	

	private void addEClasses(EPackage ePackage, Set<EClass> allEClasses) {
		for(EClassifier eClassifier: ePackage.getEClassifiers()){
			if (eClassifier instanceof EClass){
				allEClasses.add((EClass)eClassifier);
			}
		}
	}

	private Set<EPackage> getEPackages() {
		Set<EPackage> eAllPackages = new LinkedHashSet<EPackage>();
		eAllPackages.add(SimplecomponentPackage.eINSTANCE);
		return eAllPackages;
	}
	
	

	@Override
	public Collection<Object> getAnalysisSources(Collection<?> eObjects) {
		Collection<Object> eObjectToAnalyse = new ArrayList<Object>();
		
		for(Object obj: eObjects){
			eObjectToAnalyse.add(obj);
			if (obj instanceof ComponentElement){
				TreeIterator<EObject> contents = ((ComponentElement)obj).eAllContents();
				while (contents.hasNext()){
					eObjectToAnalyse.add(contents.next());
				}
			}
		}
		return eObjectToAnalyse;
	}

	@Override
	public Class<?> getDomainMetaclass(String className) {
		try {
			return Class.forName(className);
		} catch (ClassNotFoundException e){
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "No Domain Class called : " + className, e));
		}
		return null;
	}

	@Override
	public Class<?> getDomainMetaclass(Object arg0) {
		if (arg0 instanceof ComponentElement)
			return ((ComponentElement)arg0).eClass().getInstanceClass();
		return null;
	}

	@Override
	public String getName(Object arg0) {
		if (arg0 instanceof ComponentElement)
			return ((ComponentElement)arg0).getName();
		return "";  //$NON-NLS-1$
	}

	@Override
	public boolean isDomainFor(Object arg0) {
		boolean isDomain = false ; 
//		if (arg0 instanceof IFile) {
//			IFile file = (IFile) arg0;
//			isDomain = file.getFileExtension().equals("simplecomponent");	//$NON-NLS-1$
//		}
		if (arg0 instanceof ComponentElement) 
			isDomain = true;
		
		return isDomain;
	}

	@Override
	public boolean isHotSpot(Object arg0) {
		return arg0 instanceof ComponentElement;
	}

}
