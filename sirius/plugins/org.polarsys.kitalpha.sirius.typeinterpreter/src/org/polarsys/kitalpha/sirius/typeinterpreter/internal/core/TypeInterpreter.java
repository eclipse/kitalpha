/*******************************************************************************
 * Copyright (c) 2009, 2011 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *      Thales Global Services S.A.S - Initial API and implementation.
 *******************************************************************************/
package org.polarsys.kitalpha.sirius.typeinterpreter.internal.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.statements.FROM;
import org.eclipse.emf.query.statements.IQueryResult;
import org.eclipse.emf.query.statements.SELECT;
import org.eclipse.emf.query.statements.WHERE;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.common.tools.api.contentassist.ContentContext;
import org.eclipse.sirius.common.tools.api.contentassist.ContentInstanceContext;
import org.eclipse.sirius.common.tools.api.contentassist.ContentProposal;
import org.eclipse.sirius.common.tools.api.interpreter.EvaluationException;
import org.eclipse.sirius.common.tools.api.interpreter.IConverter;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterContext;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterProvider;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterStatus;
import org.eclipse.sirius.common.tools.api.util.StringUtil;
import org.eclipse.sirius.ecore.extender.business.api.accessor.ExtenderService;
import org.eclipse.sirius.ecore.extender.business.api.accessor.MetamodelDescriptor;
import org.eclipse.sirius.ecore.extender.business.api.accessor.ModelAccessor;

/**
 * Interpreter that works only for collection expression.
 * 
 * Examples:
 * 
 * <pre>
 * instancesof:EClass, EAttribute // returns all instances of EClass and EAttribute
 * typesof:Package // (UML2) returns all instances of Package (strictly, it means that instances of Model are not returned).
 * instancesofAndAncestors:Class // returns all instances of Class and the complete ancestors of these instances (useful for tree wizard).
 * </pre>
 * 
 * This expression returns all objects that are in the current session and that
 * are instances of <code>EClass</code> or <code>EAttribute</code>.
 * 
 * @author ymortier
 */
public class TypeInterpreter implements IInterpreter, IInterpreterProvider {

	/** The prefix. */
	private static final String EXPRESSION_PREFIX = "instancesof:";

	/** Prefix for strict types. */
	private static final String STRICT_PREFIX = "typesof:";

	/** The prefix with ancestor. */
	private static final String EXPRESSION_PREFIX_WITH_ANCESTORS = "instancesofAndAncestors:";
	
	/** The prefix with ancestor. */
	private static final String STRICT_PREFIX_WITH_ANCESTORS = "typesofAndAncestors:";

	/** The model accessor. */
	private ModelAccessor modelAccessor;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.obeo.dsl.common.tools.api.interpreter.IInterpreter#addImport(java.
	 * lang.String)
	 */
	public void addImport(String dependency) {
		// empty.
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.obeo.dsl.common.tools.api.interpreter.IInterpreter#clearImports()
	 */
	public void clearImports() {
		// empty.
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.obeo.dsl.common.tools.api.interpreter.IInterpreter#clearVariables()
	 */
	public void clearVariables() {
		// empty.
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.obeo.dsl.common.tools.api.interpreter.IInterpreter#dispose()
	 */
	public void dispose() {
		this.modelAccessor = null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.obeo.dsl.common.tools.api.interpreter.IInterpreter#getImports()
	 */
	public Collection<String> getImports() {
		return Collections.<String> emptyList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.obeo.dsl.common.tools.api.interpreter.IInterpreter#getPrefix()
	 */
	public String getPrefix() {
		return EXPRESSION_PREFIX;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.obeo.dsl.common.tools.api.interpreter.IInterpreter#getVariable(java
	 * .lang.String)
	 */
	public Object getVariable(String name) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.obeo.dsl.common.tools.api.interpreter.IInterpreter#getVariablePrefix()
	 */
	public String getVariablePrefix() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.obeo.dsl.common.tools.api.interpreter.IInterpreter#getVariables()
	 */
	public Map<String, ?> getVariables() {
		return Collections.<String, Object> emptyMap();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.obeo.dsl.common.tools.api.interpreter.IInterpreter#provides(java.lang
	 * .String)
	 */
	public boolean provides(String expression) {
		return expression != null
				&& (expression.startsWith(getPrefix())
						|| expression
								.startsWith(EXPRESSION_PREFIX_WITH_ANCESTORS) || expression
						.startsWith(STRICT_PREFIX)|| expression
						.startsWith(STRICT_PREFIX_WITH_ANCESTORS));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.obeo.dsl.common.tools.api.interpreter.IInterpreter#removeImport(java
	 * .lang.String)
	 */
	public void removeImport(String dependency) {
		// empty.
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.obeo.dsl.common.tools.api.interpreter.IInterpreter#setProperty(java
	 * .lang.Object, java.lang.Object)
	 */
	public void setProperty(Object key, Object value) {
		// empty.
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.obeo.dsl.common.tools.api.interpreter.IInterpreter#setVariable(java
	 * .lang.String, java.lang.Object)
	 */
	public void setVariable(String name, Object value) {
		// empty.
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.obeo.dsl.common.tools.api.interpreter.IInterpreter#unSetVariable(java
	 * .lang.String)
	 */
	public void unSetVariable(String name) {
		// empty.
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.obeo.dsl.common.tools.api.contentassist.IProposalProvider#getProposals
	 * (fr.obeo.dsl.common.tools.api.contentassist.ContentContext)
	 */
	public List<ContentProposal> getProposals(ContentContext context) {
		//
		// returns a new list in case of clients directly modify the list.
		return new ArrayList<>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.obeo.dsl.common.tools.api.contentassist.IProposalProvider#getProposals
	 * (fr.obeo.dsl.common.tools.api.contentassist.ContentInstanceContext)
	 */
	public List<ContentProposal> getProposals(ContentInstanceContext context) {
		if (!context.getTextSoFar().startsWith(EXPRESSION_PREFIX)) {
			if (EXPRESSION_PREFIX.startsWith(context.getTextSoFar())) {
				ContentProposal contentProposal = new ContentProposal(
						EXPRESSION_PREFIX.substring(context.getTextSoFar()
								.length()), EXPRESSION_PREFIX,
						StringUtil.EMPTY_STRING);
				List<ContentProposal> result = new ArrayList<>(1);
				result.add(contentProposal);
				return result;
			}
			return Collections.<ContentProposal> emptyList();
		}

		EPackage selectedPackage = context.getCurrentSelected().eClass()
				.getEPackage();
		List<EClass> classes = collectClasses(selectedPackage);

		String prefix = context.getTextSoFar().substring(0,
				context.getCursorPosition());
		int lastIndex = prefix.lastIndexOf(',');
		lastIndex = Math.max(lastIndex, prefix.indexOf(':'));
		if (lastIndex >= 0) {
			prefix = prefix.substring(lastIndex + 1).trim();
		}

		filter(classes, prefix);
		Collections.sort(classes, new Comparator<EClass>() {
			public int compare(EClass o1, EClass o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		List<ContentProposal> proposals = new ArrayList<>(
				classes.size());
		for (EClass eClass : classes) {
			ContentProposal contentProposal = new ContentProposal(eClass
					.getName().substring(prefix.length()), eClass.getName(),
					"Type " + eClass.getEPackage().getName() + "::"
							+ eClass.getName());
			proposals.add(contentProposal);
		}
		return proposals;
	}

	private void filter(List<EClass> classes, String prefix) {
		for (Iterator<EClass> iterator = classes.iterator(); iterator.hasNext();) {
			EClass class1 = iterator.next();
			if (!class1.getName().startsWith(prefix))
				iterator.remove();
		}
	}

	private List<EClass> collectClasses(EPackage selectedPackage) {
		List<EClass> classes = new ArrayList<EClass>();
		for (EClassifier classifier : selectedPackage.getEClassifiers()) {
			if (classifier instanceof EClass) {
				classes.add((EClass) classifier);
			}
		}
		return classes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.obeo.dsl.common.tools.api.interpreter.IInterpreter#evaluate(org.eclipse
	 * .emf.ecore.EObject, java.lang.String)
	 */
	public Object evaluate(EObject target, String expression)
			throws EvaluationException {
		return evaluateCollection(target, expression);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.obeo.dsl.common.tools.api.interpreter.IInterpreter#evaluateBoolean
	 * (org.eclipse.emf.ecore.EObject, java.lang.String)
	 */
	@Override
	public boolean evaluateBoolean(EObject context, String expression)
			throws EvaluationException {
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.obeo.dsl.common.tools.api.interpreter.IInterpreter#evaluateCollection
	 * (org.eclipse.emf.ecore.EObject, java.lang.String)
	 */
	@Override
	public Collection<EObject> evaluateCollection(EObject context,
			String expression) throws EvaluationException {

		boolean strict = false;
		String types = "";

		if (expression.startsWith(EXPRESSION_PREFIX)) {
			types = expression.substring(EXPRESSION_PREFIX.length());
		} else if (expression.startsWith(STRICT_PREFIX)) {
			strict = true;
			types = expression.substring(STRICT_PREFIX.length());
		} else if (expression.startsWith(EXPRESSION_PREFIX_WITH_ANCESTORS)) {
			types = expression.substring(EXPRESSION_PREFIX_WITH_ANCESTORS
					.length());
		}else if (expression.startsWith(STRICT_PREFIX_WITH_ANCESTORS)) {
			strict = true;
			types = expression.substring(STRICT_PREFIX_WITH_ANCESTORS
					.length());
		}

		final String[] allTypes = types.split(Pattern.quote(","));
		for (int i = 0; i < allTypes.length; i++) {
			allTypes[i] = allTypes[i].trim();
		}
		SELECT select = createQuery(context, strict, allTypes);

		IQueryResult result = select.execute();
		if (result.getException() != null) {
			throw new EvaluationException(result.getException());
		}
		if (expression.startsWith(EXPRESSION_PREFIX_WITH_ANCESTORS)||expression.startsWith(STRICT_PREFIX_WITH_ANCESTORS)) {
			Collection<EObject> resultWithAncestors = new HashSet<>(
					result);
			for (EObject eObject : result) {
				EObject container = eObject.eContainer();
				while (container != null) {
					resultWithAncestors.add(container);
					container = container.eContainer();
				}
			}
			return resultWithAncestors;
		}
		
		

		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.obeo.dsl.common.tools.api.interpreter.IInterpreter#evaluateEObject
	 * (org.eclipse.emf.ecore.EObject, java.lang.String)
	 */
	@Override
	public EObject evaluateEObject(EObject context, String expression)
			throws EvaluationException {
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.obeo.dsl.common.tools.api.interpreter.IInterpreter#evaluateInteger
	 * (org.eclipse.emf.ecore.EObject, java.lang.String)
	 */
	@Override
	public Integer evaluateInteger(EObject context, String expression)
			throws EvaluationException {
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.obeo.dsl.common.tools.api.interpreter.IInterpreter#evaluateString(
	 * org.eclipse.emf.ecore.EObject, java.lang.String)
	 */
	@Override
	public String evaluateString(EObject context, String expression)
			throws EvaluationException {
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.obeo.dsl.common.tools.api.interpreter.IInterpreter#setCrossReferencer
	 * (org.eclipse.emf.ecore.util.ECrossReferenceAdapter)
	 */
	public void setCrossReferencer(ECrossReferenceAdapter crossReferencer) {
		// empty.
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.obeo.dsl.common.tools.api.interpreter.IInterpreter#setModelAccessor
	 * (fr.obeo.mda.ecore.extender.business.api.accessor.ModelAccessor)
	 */
	public void setModelAccessor(ModelAccessor modelAccessor) {
		this.modelAccessor = modelAccessor;
	}

	/**
	 * Creates the query that is able to get all instances of the given types.
	 * 
	 * @param any
	 *            any object of the session.
	 * @param strict
	 *            if <code>true</code> then do not select instances of
	 *            subclasses.
	 * @param types
	 *            the types to get.
	 * @return the query that is able to get all instances of the given types.
	 */
	private SELECT createQuery(final EObject any, final boolean strict,
			final String... types) {
		final Session session = SessionManager.INSTANCE.getSession(any);
		final Collection<Resource> semanticResources = session != null ? session
				.getSemanticResources()
				: any.eResource().getResourceSet().getResources();

		final Collection<EObject> eObjects = new ArrayList<>();
		for (final Resource semanticResource : semanticResources) {
			eObjects.addAll(semanticResource.getContents());
		}

		FROM from = new FROM(eObjects);

		TypeInterpreterCondition typeInterpreterCondition = new TypeInterpreterCondition(
				types, strict, getModelAccessor(any));
		WHERE where = new WHERE(typeInterpreterCondition);

		return new SELECT(from, where);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seefr.obeo.dsl.common.tools.api.interpreter.IInterpreterProvider#
	 * createInterpreter()
	 */
	public IInterpreter createInterpreter() {
		return new TypeInterpreter();
	}

	/**
	 * Returns the model accessor.
	 * 
	 * @return the modelAccessor
	 */
	public ModelAccessor getModelAccessor(EObject element) {
		if (this.modelAccessor == null) {
			this.modelAccessor = ExtenderService.createModelAccessor(element
					.eResource().getResourceSet());
			this.modelAccessor.init(element.eResource().getResourceSet());
		}
		return this.modelAccessor;
	}

	private static class TypeInterpreterCondition extends EObjectCondition {

		private String[] types;
		private boolean strict;
		private ModelAccessor modelAccessor;

		/**
		 * Creates a new condition.
		 * 
		 * @param types
		 *            the types to get.
		 * @param strict
		 *            if <code>true</code> then do not select instances of
		 *            subclasses.
		 * @param modelAccessor
		 *            the viewpoint model accessor.
		 */
		public TypeInterpreterCondition(String[] types, boolean strict,
				ModelAccessor modelAccessor) {
			super();
			this.types = types;
			this.strict = strict;
			this.modelAccessor = modelAccessor;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.emf.query.conditions.eobjects.EObjectCondition#isSatisfied
		 * (org.eclipse.emf.ecore.EObject)
		 */
		@Override
		public boolean isSatisfied(EObject eObject) {
			for (final String typeName : types) {
				if (strict && eObject.eClass().getName() != null
						&& eObject.eClass().getName().equals(typeName)) {
					return true;
				} else if (!strict
						&& modelAccessor.eInstanceOf(eObject, typeName))
					return true;
			}
			return false;
		}

	}

	/**
	 * No validation for the moment;
	 */
	public boolean supportsValidation() {
		return false;
	}

	/**
	 * 
	 */
	public Collection<IInterpreterStatus> validateExpression(
			IInterpreterContext context, String expression) {
		return Collections.<IInterpreterStatus> emptyList();
	}

	/**
	 * Basic content proposal.
	 */
	public ContentProposal getNewEmtpyExpression() {
		return new ContentProposal(EXPRESSION_PREFIX, EXPRESSION_PREFIX,
				StringUtil.EMPTY_STRING);
	}


	public void activateMetamodels(Collection<MetamodelDescriptor> metamodels) {
		// empty.
	}

	@Override
	public IConverter getConverter() {
		throw new UnsupportedOperationException();
	}
}
