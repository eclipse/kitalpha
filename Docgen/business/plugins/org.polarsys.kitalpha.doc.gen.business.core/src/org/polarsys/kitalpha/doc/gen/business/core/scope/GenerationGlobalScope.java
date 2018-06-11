/*******************************************************************************
 * Copyright (c) 2015, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.doc.gen.business.core.scope;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.polarsys.kitalpha.doc.gen.business.core.messages.Messages;

/**
 * @author Boubekeur Zendagui
 */
public class GenerationGlobalScope {
	/** Singleton property **/
	private static GenerationGlobalScope instance;
	
	/** A copy of the original {@link Resource}. This resource is doesn't contains out of scope 
	 *  model element if {@link #referencesStrategy} is equals to {@link ScopeReferencesStrategy#DONT_EXPORT} **/
	private Resource scopedResource = null;
	
	private boolean doComputeScopedResource = true;
	
	/** A list of all object in generation scope. */
	private List<EObject> generationScope = new ArrayList<EObject>();
	
	/** Defining the status of the scope. see {@link ScopeStatus} for more information. **/
	private ScopeStatus scopeStatus = ScopeStatus.NOT_LIMITED;
	
	/** Defines the strategy used to compute the element in the scope. **/
	private ScopeElementStrategy elementStrategy = ScopeElementStrategy.ALL;
	
	/** Defines the strategy to use when handle references to out of scope model elements. **/
	private ScopeReferencesStrategy referencesStrategy = ScopeReferencesStrategy.EXPORT;
	
	/** The used instance of the EcoreUtil Copier **/
	private EcoreUtil.Copier copier = null;
	
	/** The editing domain used to clean the resource when Reference Strategy is set to Don't Export**/
	private TransactionalEditingDomain domain = null;
	
	/**
	 * Singleton getter.
	 */
	public static GenerationGlobalScope getInstance(){
		if (instance == null) {
			instance = new GenerationGlobalScope();
		}
		
		return instance;
	}
	
	/**
	 * Initialize values all Global Scope properties
	 */
	public void cleanScope(){
		this.generationScope.clear();
		this.scopeStatus = ScopeStatus.NOT_LIMITED;
		this.elementStrategy = ScopeElementStrategy.ALL;
		if (this.copier != null)
		{
			this.copier.clear();
			this.copier = null;
		}

		if (this.referencesStrategy.equals(ScopeReferencesStrategy.DONT_EXPORT))
		{
			if (this.domain != null && this.scopedResource != null)
			{
				this.domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					protected void doExecute() {
						scopedResource.unload();
					}
				});

				cleanCopiedData();

				this.domain = null;
				this.scopedResource = null;
				this.doComputeScopedResource = true;
			}
			this.referencesStrategy = ScopeReferencesStrategy.EXPORT;
		}
	}
	
	/**
	 * Remove the copy resource from the Editing Domain.
	 */
	public final void cleanCopiedData(){
		if (this.domain != null)
		{
			final ResourceSet resourceSet = this.domain.getResourceSet();
			if (resourceSet != null && this.scopedResource != null) {
				resourceSet.getResources().remove(this.scopedResource);
			}
		}
	}
	
	/**
	 * Get the status of the generation scope. It value is either {@link ScopeStatus#LIMITED} of {@link ScopeStatus#NOT_LIMITED}
	 * @return {@link ScopeStatus#LIMITED} if there is a limited scope, {@link ScopeStatus#NOT_LIMITED} otherwise.
	 */
	public ScopeStatus getScopeStatus() {
		return scopeStatus;
	}

	/**
	 * Get the used strategy used to manage Reference who's target is an out of scope 
	 * model element.
	 * @return a {@link ScopeReferencesStrategy}
	 */
	public ScopeReferencesStrategy getReferencesStrategy(){
		return this.referencesStrategy;
	}
	
	/**
	 * Set the Strategy to use when generation deals with a Reference who's target is
	 * an out of scope model element.
	 * @param referencesStrategy a {@link ScopeReferencesStrategy}
	 */
	public void setReferencesStrategy(ScopeReferencesStrategy referencesStrategy){
		this.referencesStrategy = referencesStrategy;
	}
	
	/**
	 * Return the model element of the original resource. It is got from the Copier map.
	 * If the copier is null or it not contains a key that value is equals to modelElement, 
	 * so this means that probably the parameter modelElement is it self the source model element.
	 * 
	 * @param modelElement an {@link EObject}
	 * @return an {@link EObject} who is from the original resource
	 */
	public final EObject getOriginalModelElement(EObject modelElement){
		if (this.copier != null && this.referencesStrategy.equals(ScopeReferencesStrategy.DONT_EXPORT))
		{// This means that the copier was used to initialize the scoped resource.
			if (this.copier.containsKey(modelElement))
			{// This means that the modelElement is the original one.
				return modelElement;
			}
			else
			{// May be the modelElement parameter is the copy.So try to find the original model element.
				if (this.copier.containsValue(modelElement))
				{// This means that the current model element is the copy one
					for (Entry<EObject, EObject> entry : this.copier.entrySet()) 
					{
						final EObject value = entry.getValue();
						if (value != null && value.equals(modelElement)) {
							return entry.getKey();
						}
					}
				}
			}
		}
		return modelElement;
	}
	
	/**
	 * Check if the copy of the original model element is in the scope.
	 * 
	 * @param modelElement an {@link EObject} from the original resource
	 * @return True if the copy of the original model element is in scope. False otherwise.
	 */
	public final boolean isCopyInScope(EObject modelElement){
		if (scopeStatus.equals(ScopeStatus.NOT_LIMITED)) {
			return true;
		}
		
		if (this.copier != null)
		{
			final EObject copyElement = this.copier.get(modelElement);
			return inScope(copyElement, true);
		}
		else
		{
			return inScope(modelElement, true);
		}
	}
	
	/**
	 * Getter of {@link #scopedResource}. This method can be used only with  {@link ScopeReferencesStrategy#DONT_EXPORT} strategy.
	 * @param modelRootElement
	 * @return
	 * @throws ScopeException
	 */
	public final Resource getScopedResource() throws ScopeException{
		if (this.referencesStrategy.equals(ScopeReferencesStrategy.EXPORT)) {
			throw new ScopeException(Messages.Scope_No_Resource_For_Export_References_Strategy);
		}
		
		if (this.scopedResource == null || this.doComputeScopedResource) {
			this.scopedResource = computeScopedResource();
		}
		
		return this.scopedResource;
	}
	
	/**
	 * This create a {@link Resource} containing only model elements of the generation scope.
	 * 
	 * @return a cleaned {@link Resource}. This resource contains only element in scope.
	 * @throws ScopeException this exception is thrown if an out of scope model element can't be 
	 * deleted from the resource
	 */
	protected final Resource computeScopedResource() {
		if (this.referencesStrategy.equals(ScopeReferencesStrategy.DONT_EXPORT))
		{
			final EObject copyModelRootElement = this.scopedResource.getContents().get(0);
			final EList<EObject> objectOutOfScope = getObjectOutOfScope(copyModelRootElement);
			for (final EObject eObject : objectOutOfScope) 
			{
				this.domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					protected void doExecute() {
						EcoreUtil.delete(eObject, true);
					}
				});
			}
			this.doComputeScopedResource = false;
		}
		
		return scopedResource;
	}
	
	/**
	 * Create a local copy of the original resource. This copy is used only when References 
	 * export strategy is Dont_Export.
	 * @param anySourceModelElement
	 * @return The copied resource
	 */
	protected final Resource copyResource(final EObject anySourceModelElement){
		this.domain = TransactionUtil.getEditingDomain(anySourceModelElement);
		if (this.domain != null)
		{
			final Resource resource = domain.createResource(anySourceModelElement.eResource().getURI().toString());
			this.domain.getResourceSet().getResources().add(resource);
			this.copier = new EcoreUtil.Copier();
			this.domain.getCommandStack().execute(new RecordingCommand(domain) {
				@Override
				protected void doExecute() {
					resource.getContents().clear();
					final EObject rootContainer = EcoreUtil.getRootContainer(anySourceModelElement);
					final EObject copyModelRootElement = copier.copy(rootContainer);
					copier.copyReferences();
					resource.getContents().add(copyModelRootElement);
				}
			});
			return resource;
		}
		else
		{
			final Resource resource = new ResourceImpl();
			final EObject rootContainer = EcoreUtil.getRootContainer(anySourceModelElement);
			final EObject copyModelRootElement = copier.copy(rootContainer);
			copier.copyReferences();
			resource.getContents().add(copyModelRootElement);
			return resource;
		}
	}
	
	/**
	 * Compute all out of scope {@link EObject} 
	 * @param modelRootElement The root element of the original resource
	 * @return An {@link EList} containing all {@link EObject} out of scope to remove from the resource.
	 */
	protected final EList<EObject> getObjectOutOfScope(EObject modelRootElement){
		EList<EObject> result = new BasicEList<EObject>();
		final TreeIterator<EObject> eAllContents = modelRootElement.eAllContents();
		while (eAllContents.hasNext()) 
		{
			final EObject eObject = eAllContents.next();
			if (! GenerationGlobalScope.getInstance().inScope(eObject, true)) {
				result.add(eObject);
			}
		}
		
		return result;
	}

	/**
	 * Compute a scope starting from the <code> modelElement </code> parameter.
	 * @param modelElement the element from the source resource
	 * @throws ScopeException
	 */
	public final void addToScope(EObject modelElement) throws ScopeException{
		if (this.referencesStrategy.equals(ScopeReferencesStrategy.DONT_EXPORT))
		{
			// Create a copy of the original resource if it not exists yet. 
			if (this.scopedResource == null) {
				this.scopedResource = copyResource(modelElement);
			}
			
			// Replace the model element from the original resource by the created copy.
			modelElement = this.copier.get(modelElement);
		}
		
		// Compute Scope for the current element and add it to the global scope
		List<EObject> scope = ScopeCompute.computeScope(modelElement, this.elementStrategy);
		if (! scope.isEmpty()) {
			addToGenerationScope(scope);
		}

		scopeStatus = ScopeStatus.LIMITED;
	}
	
	/**
	 * Scope Setter.
	 * @param scope the scope
	 *  *Check if an element is already in scope or not.*
	 */
	private void addToGenerationScope(List<EObject> scope){
		if (scope != null )
		{
			if (generationScope.isEmpty())
			{
				generationScope = scope;
			}
			else
			{
				for (EObject eObject : scope) 
				{
					if (!inScope(eObject, true))
					{
						generationScope.add(eObject);
					}
				}
			}
		}
	}
	
	/**
	 * Check if the current object in the generation scope 
	 * @param eObject the {@link EObject} to check existence in scope
	 * @param forceEqualCheck if <code>true</code> and if {@link List#contains(Object)} doesn't found the object. 
	 * The scope elements are verified one by one.
	 * @return 
	 * <ul>
	 * <li> If <code> {@link #scopeStatus} = {@link ScopeStatus.NOT_LIMITED} </code> : return True</li>
	 * <li> If <code> {@link #scopeStatus} = {@link ScopeStatus.LIMITED} </code> : return <code>true</code> if eObject is in scope, <code>false</code> otherwise.</li>
	 * </ul>
	 */
	public boolean inScope(EObject eObject, boolean forceEqualCheck){
		if (scopeStatus.equals(ScopeStatus.NOT_LIMITED)) {
			return true;
		}
		
		if (! generationScope.isEmpty())
		{
			final boolean exists = generationScope.contains(eObject);
			if (exists) {
				return true;
			} else
			{
				if (forceEqualCheck)
				{
					// Try to use EcoreUtil.equals(...) method
					for (EObject iEObject : generationScope) 
					{
						final boolean equals = EcoreUtil.equals(eObject, iEObject);
						if (equals) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
