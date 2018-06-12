/**
 * Copyright (c) 2015, 2018 Thales Global Services.
 * All rights reserved.
 */
package org.polarsys.kitalpha.composer.api.path.decoders;

/**
 * @author Guillaume Gebhart
 *
 */
public interface IVariableDecoder {

	String decodePath(final String path, final Object object);
	
}
