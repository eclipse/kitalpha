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

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist;

import java.util.List;

import org.eclipse.xtext.ui.editor.contentassist.FQNPrefixMatcher;
import org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher;
import org.eclipse.xtext.util.Strings;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class CommonPrefixMatcher extends FQNPrefixMatcher {
	
	// TODO make delegate injectable via named binding
	@Inject
	private PrefixMatcher.IgnoreCase delegate;
	
	@Inject(optional = true)
	@Named("org.eclipse.xtext.ui.editor.contentassist.FQNPrefixMatcher.delimiter")
	private char delimiter = '.';
	
	@Inject
	private LastSegmentFinder lastSegmentFinder;

	public boolean isCandidateMatchingPrefix2(String name, String prefix) {
		String lastSegment = lastSegmentFinder.getLastSegment(name, delimiter);
		if (lastSegment !=null) {
			if (lastSegment.startsWith(prefix)) {
				return true;
			}
			//Forbidden keywords are preceeded by ^
			if (lastSegment.startsWith( "^" + prefix)) {
				return true;
			}
		}
		//case where there is no last segment, try to match current name
		if (name.startsWith(prefix)) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean isCandidateMatchingPrefix(String name, String prefix) {
		if (isCandidateMatchingPrefix2(name, prefix))
			return true;
		if (name.indexOf(delimiter) >= 0) { // assume a fqn if delimiter is present
			if (prefix.indexOf(delimiter) < 0) { 
				// prefix is without a dot - either namespace or last segment
				// namespace was checked prior by delegate
				String lastSegment = lastSegmentFinder.getLastSegment(name, delimiter);
				if (lastSegment != null && delegate.isCandidateMatchingPrefix(lastSegment, prefix))
					return true;
			} else {
				List<String> splitPrefix = Strings.split(prefix, '.');
				if (splitPrefix.isEmpty())
					return false;
				List<String> splitName = Strings.split(name, '.');
				if (splitName.size() < splitPrefix.size()) {
					return false;
				}
				for(int i = 0; i < splitPrefix.size() ; i++) {
					if (!delegate.isCandidateMatchingPrefix(splitName.get(i), splitPrefix.get(i)))
						return false;
				}
				return true;
			}
		}
		return false;
	}


}
