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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.*;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.ViewpointActivityExplorer.ViewpointActivityExplorerPackage
 * @generated
 */
public class ViewpointActivityExplorerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ViewpointActivityExplorerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewpointActivityExplorerSwitch() {
		if (modelPackage == null) {
			modelPackage = ViewpointActivityExplorerPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ViewpointActivityExplorerPackage.PAGE: {
				Page page = (Page)theEObject;
				T result = casePage(page);
				if (result == null) result = caseActivityExplorerItem(page);
				if (result == null) result = caseDynamicIcon(page);
				if (result == null) result = casePredicateElement(page);
				if (result == null) result = caseIcon(page);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewpointActivityExplorerPackage.PREDICATE_ELEMENT: {
				PredicateElement predicateElement = (PredicateElement)theEObject;
				T result = casePredicateElement(predicateElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewpointActivityExplorerPackage.OVERVIEW: {
				Overview overview = (Overview)theEObject;
				T result = caseOverview(overview);
				if (result == null) result = caseDynamicIcon(overview);
				if (result == null) result = caseIcon(overview);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewpointActivityExplorerPackage.ICON: {
				Icon icon = (Icon)theEObject;
				T result = caseIcon(icon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewpointActivityExplorerPackage.ACTIVITY_EXPLORER_ITEM: {
				ActivityExplorerItem activityExplorerItem = (ActivityExplorerItem)theEObject;
				T result = caseActivityExplorerItem(activityExplorerItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewpointActivityExplorerPackage.DYNAMIC_ICON: {
				DynamicIcon dynamicIcon = (DynamicIcon)theEObject;
				T result = caseDynamicIcon(dynamicIcon);
				if (result == null) result = caseIcon(dynamicIcon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewpointActivityExplorerPackage.SECTION_EXTENSION: {
				SectionExtension sectionExtension = (SectionExtension)theEObject;
				T result = caseSectionExtension(sectionExtension);
				if (result == null) result = caseActivityExplorerItem(sectionExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewpointActivityExplorerPackage.ACTIVITY_EXTENSION: {
				ActivityExtension activityExtension = (ActivityExtension)theEObject;
				T result = caseActivityExtension(activityExtension);
				if (result == null) result = casePredicateElement(activityExtension);
				if (result == null) result = caseIcon(activityExtension);
				if (result == null) result = caseActivityExplorerItem(activityExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER: {
				ViewpointActivityExplorer viewpointActivityExplorer = (ViewpointActivityExplorer)theEObject;
				T result = caseViewpointActivityExplorer(viewpointActivityExplorer);
				if (result == null) result = caseAspect(viewpointActivityExplorer);
				if (result == null) result = caseNamedElement(viewpointActivityExplorer);
				if (result == null) result = caseViewpointElement(viewpointActivityExplorer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewpointActivityExplorerPackage.PAGES: {
				Pages pages = (Pages)theEObject;
				T result = casePages(pages);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewpointActivityExplorerPackage.SECTIONS: {
				Sections sections = (Sections)theEObject;
				T result = caseSections(sections);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewpointActivityExplorerPackage.ACTIVITIES: {
				Activities activities = (Activities)theEObject;
				T result = caseActivities(activities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicateElement(PredicateElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overview</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overview</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverview(Overview object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIcon(Icon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Explorer Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Explorer Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityExplorerItem(ActivityExplorerItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Icon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Icon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicIcon(DynamicIcon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSectionExtension(SectionExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityExtension(ActivityExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Viewpoint Activity Explorer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Viewpoint Activity Explorer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewpointActivityExplorer(ViewpointActivityExplorer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pages</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pages</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePages(Pages object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sections</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sections</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSections(Sections object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivities(Activities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Viewpoint Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Viewpoint Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewpointElement(ViewpointElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAspect(Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ViewpointActivityExplorerSwitch
