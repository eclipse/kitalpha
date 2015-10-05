
// Generated on 02.10.2015 at 04:29:42 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.kitalpha.vp.componentsampleperformance.contextual.explorer.queries.performance;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.explorer.contextual.core.query.IQuery;
import org.polarsys.kitalpha.vp.componentsampleperformance.ComponentSamplePerformance.Performance;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OwnedViewpointElementQuery implements IQuery {

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * Default constructor
	   * @generated
	   */
	public OwnedViewpointElementQuery() {
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
		Performance object = (Performance) object_p;

		if (object.getStatus() != null)
			result.add(object.getStatus());

		return result;
	}

}