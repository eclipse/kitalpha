/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.extension;

import org.eclipse.core.runtime.Assert;
import org.polarsys.kitalpha.emde.extension.registry.URIFactory;

/**
 * @author Xavier Maysonnave
 * 
 */
public class ExtendedModel extends Model<ExtendedModel> {

	private final ExtensibleModel parent;

	private final String path;

	private final String qualifiedName;

	public ExtendedModel(ExtensibleModel parent, String name, URIFactory uriFactory) {
		super(name, uriFactory);
		Assert.isNotNull(parent);
		this.parent = parent;
		this.parent.addExtendedModel(this);
		path = getParent().getPath() + SEPARATOR + getName();
		qualifiedName = getParent().getQualifiedName() + SEPARATOR + getName();
	}

	/**
	 * Obtains my path, which is my fully-qualified slash-separated ID that is
	 * unique within the global namespace.
	 * 
	 * @return my unique path
	 */
	@Override
	public final String getPath() {
		return path;
	}

	@Override
	public boolean equals(Object other_p) {
		return (other_p instanceof ExtendedModel) && ((ExtendedModel) other_p).getPath().equals(getPath());
	}

	/**
	 * Obtains my parent category, or <code>null</code> if I am a top-level
	 * category.
	 * 
	 * @return my parent, if I have one
	 */
	public ExtensibleModel getParent() {
		return parent;
	}

	/**
	 * Obtains my qualified name, which includes my ancestors' names separated
	 * by slashes.
	 * 
	 * @return my qualified name
	 */
	@Override
	public String getQualifiedName() {
		return qualifiedName;
	}

	// @Override
	// public int hashCode() {
	// return getName().hashCode();
	// }

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("ExtendedModel[extend="); //$NON-NLS-1$
		result.append(getParent().getName());
		result.append(", name="); //$NON-NLS-1$
		result.append(getName());
		result.append(", adapterFactory="); //$NON-NLS-1$
		result.append(getURIFactory().getAdapterFactoryName());
		result.append(']');
		return result.toString();
	}

}
