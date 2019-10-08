package org.polarsys.capella.example.capellatags.CapellaTags.provider.sections;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.core.properties.sections.NamedElementSection;
import org.polarsys.capella.core.model.handler.helpers.CapellaAdapterHelper;
import org.polarsys.capella.example.capellatags.CapellaTags.CapellaTag;

/**
 * This is the item provider adapter for a {@link CapellaTagSection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CapellaTagSection extends NamedElementSection {
	/**
	 * @generated
	 */
	@Override
	public boolean select(Object toTest) {
		EObject obj = CapellaAdapterHelper.resolveSemanticObject(toTest);

		return obj != null && obj.eClass().equals(
				org.polarsys.capella.example.capellatags.CapellaTags.CapellaTagsPackage.eINSTANCE.getCapellaTag());
	}
}
