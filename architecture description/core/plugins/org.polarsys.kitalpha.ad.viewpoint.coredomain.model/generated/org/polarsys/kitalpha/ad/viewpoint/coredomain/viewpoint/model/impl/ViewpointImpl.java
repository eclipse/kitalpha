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

package org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Metamodel;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.NameElement;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Property;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.PropertySet;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Representation;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Rule;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RuleSet;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ServiceSet;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Viewpoint</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointImpl#getRuleSet <em>Rule Set</em>}</li>
 * <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointImpl#getServiceSet <em>Service Set</em>}</li>
 * <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointImpl#getPropertySet <em>Property Set</em>}</li>
 * <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointImpl#getParents <em>Parents</em>}</li>
 * <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointImpl#getDependencies <em>Dependencies</em>}</li>
 * <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointImpl#isAbstract <em>Abstract</em>}</li>
 * <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointImpl#getMetamodel <em>Metamodel</em>}</li>
 * <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointImpl#getRepresentation <em>Representation</em>}</li>
 * <li>{@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.impl.ViewpointImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ViewpointImpl extends NameElementImpl implements Viewpoint {

	/**
	 * The cached value of the '{@link #getRuleSet() <em>Rule Set</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRuleSet()
	 * @generated
	 * @ordered
	 */
	protected RuleSet ruleSet;

	/**
	 * The cached value of the '{@link #getServiceSet() <em>Service Set</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getServiceSet()
	 * @generated
	 * @ordered
	 */
	protected ServiceSet serviceSet;

	/**
	 * The cached value of the '{@link #getPropertySet() <em>Property Set</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPropertySet()
	 * @generated
	 * @ordered
	 */
	protected PropertySet propertySet;

	/**
	 * The cached value of the '{@link #getParents() <em>Parents</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected EList<Viewpoint> parents;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Viewpoint> dependencies;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMetamodel()
	 * @generated
	 * @ordered
	 */
	protected Metamodel metamodel;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected Representation representation;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Version VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected Version version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ViewpointImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointPackage.Literals.VIEWPOINT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public RuleSet getRuleSet() {

		return ruleSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public NotificationChain basicSetRuleSet(RuleSet newRuleSet, NotificationChain msgs) {

		RuleSet oldRuleSet = ruleSet;
		ruleSet = newRuleSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewpointPackage.VIEWPOINT__RULE_SET, oldRuleSet, newRuleSet);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public void setRuleSet(RuleSet newRuleSet) {

		if (newRuleSet != ruleSet) {
			NotificationChain msgs = null;
			if (ruleSet != null)
				msgs = ((InternalEObject) ruleSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewpointPackage.VIEWPOINT__RULE_SET, null, msgs);
			if (newRuleSet != null)
				msgs = ((InternalEObject) newRuleSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewpointPackage.VIEWPOINT__RULE_SET, null, msgs);
			msgs = basicSetRuleSet(newRuleSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointPackage.VIEWPOINT__RULE_SET, newRuleSet, newRuleSet));

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public ServiceSet getServiceSet() {

		return serviceSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public NotificationChain basicSetServiceSet(ServiceSet newServiceSet, NotificationChain msgs) {

		ServiceSet oldServiceSet = serviceSet;
		serviceSet = newServiceSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewpointPackage.VIEWPOINT__SERVICE_SET, oldServiceSet, newServiceSet);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public void setServiceSet(ServiceSet newServiceSet) {

		if (newServiceSet != serviceSet) {
			NotificationChain msgs = null;
			if (serviceSet != null)
				msgs = ((InternalEObject) serviceSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewpointPackage.VIEWPOINT__SERVICE_SET, null, msgs);
			if (newServiceSet != null)
				msgs = ((InternalEObject) newServiceSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewpointPackage.VIEWPOINT__SERVICE_SET, null, msgs);
			msgs = basicSetServiceSet(newServiceSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointPackage.VIEWPOINT__SERVICE_SET, newServiceSet, newServiceSet));

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public PropertySet getPropertySet() {

		return propertySet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public NotificationChain basicSetPropertySet(PropertySet newPropertySet, NotificationChain msgs) {

		PropertySet oldPropertySet = propertySet;
		propertySet = newPropertySet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewpointPackage.VIEWPOINT__PROPERTY_SET, oldPropertySet, newPropertySet);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public void setPropertySet(PropertySet newPropertySet) {

		if (newPropertySet != propertySet) {
			NotificationChain msgs = null;
			if (propertySet != null)
				msgs = ((InternalEObject) propertySet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewpointPackage.VIEWPOINT__PROPERTY_SET, null, msgs);
			if (newPropertySet != null)
				msgs = ((InternalEObject) newPropertySet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewpointPackage.VIEWPOINT__PROPERTY_SET, null, msgs);
			msgs = basicSetPropertySet(newPropertySet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointPackage.VIEWPOINT__PROPERTY_SET, newPropertySet, newPropertySet));

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public EList<Viewpoint> getParents() {

		if (parents == null) {
			parents = new EObjectResolvingEList<Viewpoint>(Viewpoint.class, this, ViewpointPackage.VIEWPOINT__PARENTS);
		}
		return parents;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public EList<Viewpoint> getDependencies() {

		if (dependencies == null) {
			dependencies = new EObjectResolvingEList<Viewpoint>(Viewpoint.class, this, ViewpointPackage.VIEWPOINT__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public boolean isAbstract() {

		return abstract_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public void setAbstract(boolean newAbstract) {

		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointPackage.VIEWPOINT__ABSTRACT, oldAbstract, abstract_));

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public Metamodel getMetamodel() {

		return metamodel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public NotificationChain basicSetMetamodel(Metamodel newMetamodel, NotificationChain msgs) {

		Metamodel oldMetamodel = metamodel;
		metamodel = newMetamodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewpointPackage.VIEWPOINT__METAMODEL, oldMetamodel, newMetamodel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public void setMetamodel(Metamodel newMetamodel) {

		if (newMetamodel != metamodel) {
			NotificationChain msgs = null;
			if (metamodel != null)
				msgs = ((InternalEObject) metamodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewpointPackage.VIEWPOINT__METAMODEL, null, msgs);
			if (newMetamodel != null)
				msgs = ((InternalEObject) newMetamodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewpointPackage.VIEWPOINT__METAMODEL, null, msgs);
			msgs = basicSetMetamodel(newMetamodel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointPackage.VIEWPOINT__METAMODEL, newMetamodel, newMetamodel));

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public Representation getRepresentation() {

		return representation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public NotificationChain basicSetRepresentation(Representation newRepresentation, NotificationChain msgs) {

		Representation oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewpointPackage.VIEWPOINT__REPRESENTATION, oldRepresentation, newRepresentation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public void setRepresentation(Representation newRepresentation) {

		if (newRepresentation != representation) {
			NotificationChain msgs = null;
			if (representation != null)
				msgs = ((InternalEObject) representation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewpointPackage.VIEWPOINT__REPRESENTATION, null, msgs);
			if (newRepresentation != null)
				msgs = ((InternalEObject) newRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewpointPackage.VIEWPOINT__REPRESENTATION, null, msgs);
			msgs = basicSetRepresentation(newRepresentation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointPackage.VIEWPOINT__REPRESENTATION, newRepresentation, newRepresentation));

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public Version getVersion() {

		return version;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public void setVersion(Version newVersion) {

		Version oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointPackage.VIEWPOINT__VERSION, oldVersion, version));

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public Property getProperty(String id) {
		if (getPropertySet() != null) {
			// find Property inside the set
			for (Property prop : getPropertySet().getNewProperties()) {
				if (id.equals(prop.getId()))
					return prop;
			}
			// if the Property is hidden return null
			for (Property prop : getPropertySet().getHiddenProperties()) {
				if (id.equals(prop.getId()))
					return null;
			}
		}
		// delegate to parents
		for (Viewpoint vp : getParents()) {
			Property prop = vp.getProperty(id);
			if (prop != null)
				return prop;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public EList<Property> getProperties() {
		BasicEList<Property> props = new BasicEList<Property>();
		Map<String, Property> name2prop = new HashMap<String, Property>();
		collectProperties(name2prop);
		props.addAll(name2prop.values());
		return props;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public Service getService(String id) {
		if (getServiceSet() != null) {
			for (Service service : getServiceSet().getNewServices()) {
				if (id.equals(service.getId()))
					return service;
			}
			for (Service service : getServiceSet().getHiddenServices()) {
				if (id.equals(service.getId()))
					return null;
			}
		}
		for (Viewpoint vp : getParents()) {
			Service service = vp.getService(id);
			if (service != null)
				return service;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public EList<Service> getServices() {
		BasicEList<Service> services = new BasicEList<Service>();
		Map<String, Service> collector = new HashMap<String, Service>();
		collectServices(collector);
		services.addAll(collector.values());
		return services;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public Rule getRule(String id) {
		if (getRuleSet() != null) {
			// find rule inside the set
			for (Rule rule : getRuleSet().getNewRules()) {
				if (id.equals(rule.getId()))
					return rule;
			}
			// if the rule is hidden return null
			for (Rule rule : getRuleSet().getHiddenRules()) {
				if (id.equals(rule.getId()))
					return null;
			}
		}
		// delegate to parents
		for (Viewpoint vp : getParents()) {
			Rule rule = vp.getRule(id);
			if (rule != null)
				return rule;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public EList<Rule> getRules() {

		BasicEList<Rule> rules = new BasicEList<Rule>();
		Map<String, Rule> collector = new HashMap<String, Rule>();
		collectRules(collector);
		rules.addAll(collector.values());
		return rules;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public Property getPropertyByName(String name) {
		if (getPropertySet() != null) {
			// find Property inside the set
			for (Property prop : getPropertySet().getNewProperties()) {
				if (name.equals(prop.getName()))
					return prop;
			}
			// if the Property is hidden return null
			for (Property prop : getPropertySet().getHiddenProperties()) {
				if (name.equals(prop.getName()))
					return null;
			}
		}
		// delegate to parents
		for (Viewpoint vp : getParents()) {
			Property prop = vp.getPropertyByName(name);
			if (prop != null)
				return prop;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public EList<Viewpoint> getAllParents() {
		EList<Viewpoint> result = new BasicEList<Viewpoint>();
		collectParents(this, result);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ViewpointPackage.VIEWPOINT__RULE_SET:
			return basicSetRuleSet(null, msgs);
		case ViewpointPackage.VIEWPOINT__SERVICE_SET:
			return basicSetServiceSet(null, msgs);
		case ViewpointPackage.VIEWPOINT__PROPERTY_SET:
			return basicSetPropertySet(null, msgs);
		case ViewpointPackage.VIEWPOINT__METAMODEL:
			return basicSetMetamodel(null, msgs);
		case ViewpointPackage.VIEWPOINT__REPRESENTATION:
			return basicSetRepresentation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ViewpointPackage.VIEWPOINT__RULE_SET:
			return getRuleSet();
		case ViewpointPackage.VIEWPOINT__SERVICE_SET:
			return getServiceSet();
		case ViewpointPackage.VIEWPOINT__PROPERTY_SET:
			return getPropertySet();
		case ViewpointPackage.VIEWPOINT__PARENTS:
			return getParents();
		case ViewpointPackage.VIEWPOINT__DEPENDENCIES:
			return getDependencies();
		case ViewpointPackage.VIEWPOINT__ABSTRACT:
			return isAbstract();
		case ViewpointPackage.VIEWPOINT__METAMODEL:
			return getMetamodel();
		case ViewpointPackage.VIEWPOINT__REPRESENTATION:
			return getRepresentation();
		case ViewpointPackage.VIEWPOINT__VERSION:
			return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ViewpointPackage.VIEWPOINT__RULE_SET:
			setRuleSet((RuleSet) newValue);
			return;
		case ViewpointPackage.VIEWPOINT__SERVICE_SET:
			setServiceSet((ServiceSet) newValue);
			return;
		case ViewpointPackage.VIEWPOINT__PROPERTY_SET:
			setPropertySet((PropertySet) newValue);
			return;
		case ViewpointPackage.VIEWPOINT__PARENTS:
			getParents().clear();
			getParents().addAll((Collection<? extends Viewpoint>) newValue);
			return;
		case ViewpointPackage.VIEWPOINT__DEPENDENCIES:
			getDependencies().clear();
			getDependencies().addAll((Collection<? extends Viewpoint>) newValue);
			return;
		case ViewpointPackage.VIEWPOINT__ABSTRACT:
			setAbstract((Boolean) newValue);
			return;
		case ViewpointPackage.VIEWPOINT__METAMODEL:
			setMetamodel((Metamodel) newValue);
			return;
		case ViewpointPackage.VIEWPOINT__REPRESENTATION:
			setRepresentation((Representation) newValue);
			return;
		case ViewpointPackage.VIEWPOINT__VERSION:
			setVersion((Version) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ViewpointPackage.VIEWPOINT__RULE_SET:
			setRuleSet((RuleSet) null);
			return;
		case ViewpointPackage.VIEWPOINT__SERVICE_SET:
			setServiceSet((ServiceSet) null);
			return;
		case ViewpointPackage.VIEWPOINT__PROPERTY_SET:
			setPropertySet((PropertySet) null);
			return;
		case ViewpointPackage.VIEWPOINT__PARENTS:
			getParents().clear();
			return;
		case ViewpointPackage.VIEWPOINT__DEPENDENCIES:
			getDependencies().clear();
			return;
		case ViewpointPackage.VIEWPOINT__ABSTRACT:
			setAbstract(ABSTRACT_EDEFAULT);
			return;
		case ViewpointPackage.VIEWPOINT__METAMODEL:
			setMetamodel((Metamodel) null);
			return;
		case ViewpointPackage.VIEWPOINT__REPRESENTATION:
			setRepresentation((Representation) null);
			return;
		case ViewpointPackage.VIEWPOINT__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ViewpointPackage.VIEWPOINT__RULE_SET:
			return ruleSet != null;
		case ViewpointPackage.VIEWPOINT__SERVICE_SET:
			return serviceSet != null;
		case ViewpointPackage.VIEWPOINT__PROPERTY_SET:
			return propertySet != null;
		case ViewpointPackage.VIEWPOINT__PARENTS:
			return parents != null && !parents.isEmpty();
		case ViewpointPackage.VIEWPOINT__DEPENDENCIES:
			return dependencies != null && !dependencies.isEmpty();
		case ViewpointPackage.VIEWPOINT__ABSTRACT:
			return abstract_ != ABSTRACT_EDEFAULT;
		case ViewpointPackage.VIEWPOINT__METAMODEL:
			return metamodel != null;
		case ViewpointPackage.VIEWPOINT__REPRESENTATION:
			return representation != null;
		case ViewpointPackage.VIEWPOINT__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

	protected void collectProperties(Map<String, Property> name2prop) {
		for (Viewpoint vp : getParents())
			((ViewpointImpl) vp).collectProperties(name2prop);
		if (getPropertySet() != null) {
			for (Property prop : getPropertySet().getNewProperties())
				name2prop.put(prop.getName(), prop);
			for (Property prop : getPropertySet().getHiddenProperties())
				name2prop.remove(prop.getName());
		}
	}

	protected void collectRules(Map<String, Rule> rules) {
		for (Viewpoint vp : getParents())
			((ViewpointImpl) vp).collectRules(rules);
		if (getRuleSet() != null) {
			addElements(rules, getRuleSet().getNewRules());
			removeElements(rules, (getRuleSet().getHiddenRules()));
		}
	}

	protected void collectServices(Map<String, Service> services) {
		for (Viewpoint vp : getParents())
			((ViewpointImpl) vp).collectServices(services);
		if (getServiceSet() != null) {
			addElements(services, getServiceSet().getNewServices());
			removeElements(services, getServiceSet().getHiddenServices());
		}
	}

	private static void collectParents(Viewpoint vp, EList<Viewpoint> collecteur) {
		for (Viewpoint parent : vp.getParents()) {
			collectParents(parent, collecteur);
			collecteur.add(parent);
		}
	}

	protected <T extends NameElement> void addElements(Map<String, T> collector, EList<T> elts) {
		for (T elt : elts) {
			// if (!collector.containsKey(elt.getId()))
			collector.put(elt.getId(), elt);
		}
	}

	protected <T extends NameElement> void removeElements(Map<String, T> collector, EList<T> elts) {
		for (T elt : elts) {
			collector.remove(elt.getId());
		}
	}

} // ViewpointImpl
