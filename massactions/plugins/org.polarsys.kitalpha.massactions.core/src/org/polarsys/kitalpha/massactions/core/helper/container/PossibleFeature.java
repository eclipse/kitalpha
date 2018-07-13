/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.core.helper.container;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.kitalpha.massactions.core.helper.CommonFeaturesHelper;

/**
 * A feature container used in the
 * {@link CommonFeaturesHelper#getAllCommonFeaturesMap(java.util.List)} method
 * for identifying the common features for a collection of {@link EObject}. This
 * feature might or not be retained in the final selection of features, hence
 * the name.
 *
 * @author Sandu Postaru
 * 
 */
public class PossibleFeature {

	private final EStructuralFeature feature;
	private final String featureName;
	private final String featureType;

	public PossibleFeature(EStructuralFeature feature) {
		this.feature = feature;
		this.featureName = feature.getName();
		this.featureType = feature.getEType().getName();
	}

	public String getFeatureName() {
		return featureName;
	}

	public String getFeatureType() {
		return featureType;
	}
	
	public EStructuralFeature getFeature() {
		return feature;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((featureName == null) ? 0 : featureName.hashCode());
		result = prime * result + ((featureType == null) ? 0 : featureType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		PossibleFeature other = (PossibleFeature) obj;
		if (featureName == null) {
			if (other.featureName != null) {
				return false;
			}
		} else if (!featureName.equals(other.featureName)) {
			return false;
		}
		if (featureType == null) {
			if (other.featureType != null) {
				return false;
			}
		} else if (!featureType.equals(other.featureType)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PossibleFeature [featureName=" + featureName + ", featureType=" + featureType + "]";
	}

}
