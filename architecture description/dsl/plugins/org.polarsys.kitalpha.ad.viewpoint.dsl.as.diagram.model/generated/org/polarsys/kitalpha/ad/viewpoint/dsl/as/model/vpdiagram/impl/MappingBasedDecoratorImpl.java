/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.sirius.diagram.description.DiagramElementMapping;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.MappingBasedDecorator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Based Decorator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.MappingBasedDecoratorImpl#getExternalMappings <em>External Mappings</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.impl.MappingBasedDecoratorImpl#getInternalMappings <em>Internal Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingBasedDecoratorImpl extends AbstractDecoratorImpl implements MappingBasedDecorator {

	/**
	 * The cached value of the '{@link #getExternalMappings() <em>External Mappings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagramElementMapping> externalMappings;
	/**
	 * The cached value of the '{@link #getInternalMappings() <em>Internal Mappings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagramElement> internalMappings;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingBasedDecoratorImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpdiagramPackage.Literals.MAPPING_BASED_DECORATOR;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<DiagramElementMapping> getExternalMappings() {

		if (externalMappings == null) {
			externalMappings = new EObjectResolvingEList<DiagramElementMapping>(DiagramElementMapping.class, this, VpdiagramPackage.MAPPING_BASED_DECORATOR__EXTERNAL_MAPPINGS);
		}
		return externalMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<DiagramElement> getInternalMappings() {

		if (internalMappings == null) {
			internalMappings = new EObjectResolvingEList<DiagramElement>(DiagramElement.class, this, VpdiagramPackage.MAPPING_BASED_DECORATOR__INTERNAL_MAPPINGS);
		}
		return internalMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpdiagramPackage.MAPPING_BASED_DECORATOR__EXTERNAL_MAPPINGS:
				return getExternalMappings();
			case VpdiagramPackage.MAPPING_BASED_DECORATOR__INTERNAL_MAPPINGS:
				return getInternalMappings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VpdiagramPackage.MAPPING_BASED_DECORATOR__EXTERNAL_MAPPINGS:
				getExternalMappings().clear();
				getExternalMappings().addAll((Collection<? extends DiagramElementMapping>)newValue);
				return;
			case VpdiagramPackage.MAPPING_BASED_DECORATOR__INTERNAL_MAPPINGS:
				getInternalMappings().clear();
				getInternalMappings().addAll((Collection<? extends DiagramElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VpdiagramPackage.MAPPING_BASED_DECORATOR__EXTERNAL_MAPPINGS:
				getExternalMappings().clear();
				return;
			case VpdiagramPackage.MAPPING_BASED_DECORATOR__INTERNAL_MAPPINGS:
				getInternalMappings().clear();
				return;
		}
		super.eUnset(featureID);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VpdiagramPackage.MAPPING_BASED_DECORATOR__EXTERNAL_MAPPINGS:
				return externalMappings != null && !externalMappings.isEmpty();
			case VpdiagramPackage.MAPPING_BASED_DECORATOR__INTERNAL_MAPPINGS:
				return internalMappings != null && !internalMappings.isEmpty();
		}
		return super.eIsSet(featureID);
	}



} //MappingBasedDecoratorImpl
