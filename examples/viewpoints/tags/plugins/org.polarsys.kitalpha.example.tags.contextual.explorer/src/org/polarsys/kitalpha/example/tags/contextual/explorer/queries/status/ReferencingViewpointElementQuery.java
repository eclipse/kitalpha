
// Generated on 20.07.2016 at 05:07:02 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.kitalpha.example.tags.contextual.explorer.queries.status;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.amalgam.explorer.contextual.core.query.IQuery;

import org.polarsys.kitalpha.example.tags.tags.Tag;

import org.polarsys.kitalpha.example.tags.tags.History;

/**
* <!-- begin-user-doc -->
* <!-- end-user-doc -->
* <p>
* </p>
*
* @generated
*/
public class ReferencingViewpointElementQuery implements IQuery {

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * Default constructor
	   * @generated
	   */
	public ReferencingViewpointElementQuery() {
		// TODO Auto-generated constructor stub
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param object_p: The model element for which the Contextual Explorer extension is generated
	* @return List of object to display in the parent category
	* @generated
	*/
	public List<Object> compute(Object object_p) {
		List<Object> result = new ArrayList<Object>();
		Resource resource = ((EObject) object_p).eResource();
		if (resource != null) {
			for (TreeIterator<EObject> iter = resource.getAllContents(); iter.hasNext();) {
				EObject eObject = iter.next();

				if (eObject instanceof Tag) {
					Tag referencingElement = (Tag) eObject;
					if (referencingElement.getStatus() != null && referencingElement.getStatus().equals(object_p))
						result.add(eObject);
				}

				if (eObject instanceof History) {
					History referencingElement = (History) eObject;
					if (referencingElement.getOldStatus() != null && referencingElement.getOldStatus().equals(object_p))
						result.add(eObject);
				}
			}
		}
		return result;
	}

}