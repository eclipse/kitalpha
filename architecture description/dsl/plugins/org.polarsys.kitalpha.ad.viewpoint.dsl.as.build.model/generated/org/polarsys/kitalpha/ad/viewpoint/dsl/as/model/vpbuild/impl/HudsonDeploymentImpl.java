/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.GenerationLocation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Trigger;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.User;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hudson Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.HudsonDeploymentImpl#getAntName <em>Ant Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.HudsonDeploymentImpl#getAssignedNode <em>Assigned Node</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.HudsonDeploymentImpl#getBuild_id <em>Build id</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.HudsonDeploymentImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.HudsonDeploymentImpl#getJdkName <em>Jdk Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.HudsonDeploymentImpl#getUserDeployJobName <em>User Deploy Job Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.HudsonDeploymentImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.HudsonDeploymentImpl#getUserDeployServerUrl <em>User Deploy Server Url</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.HudsonDeploymentImpl#getGenerationLocation <em>Generation Location</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.impl.HudsonDeploymentImpl#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HudsonDeploymentImpl extends EObjectImpl implements HudsonDeployment {

	/**
	 * The default value of the '{@link #getAntName() <em>Ant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntName()
	 * @generated
	 * @ordered
	 */
	protected static final String ANT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAntName() <em>Ant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntName()
	 * @generated
	 * @ordered
	 */
	protected String antName = ANT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssignedNode() <em>Assigned Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedNode()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNED_NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssignedNode() <em>Assigned Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedNode()
	 * @generated
	 * @ordered
	 */
	protected String assignedNode = ASSIGNED_NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuild_id() <em>Build id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuild_id()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuild_id() <em>Build id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuild_id()
	 * @generated
	 * @ordered
	 */
	protected String build_id = BUILD_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getJdkName() <em>Jdk Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdkName()
	 * @generated
	 * @ordered
	 */
	protected static final String JDK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJdkName() <em>Jdk Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdkName()
	 * @generated
	 * @ordered
	 */
	protected String jdkName = JDK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserDeployJobName() <em>User Deploy Job Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDeployJobName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DEPLOY_JOB_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDeployJobName() <em>User Deploy Job Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDeployJobName()
	 * @generated
	 * @ordered
	 */
	protected String userDeployJobName = USER_DEPLOY_JOB_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * The default value of the '{@link #getUserDeployServerUrl() <em>User Deploy Server Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDeployServerUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DEPLOY_SERVER_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDeployServerUrl() <em>User Deploy Server Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDeployServerUrl()
	 * @generated
	 * @ordered
	 */
	protected String userDeployServerUrl = USER_DEPLOY_SERVER_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGenerationLocation() <em>Generation Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationLocation()
	 * @generated
	 * @ordered
	 */
	protected GenerationLocation generationLocation;

	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> triggers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HudsonDeploymentImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpbuildPackage.Literals.HUDSON_DEPLOYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getAntName() {

		return antName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setAntName(String newAntName) {

		String oldAntName = antName;
		antName = newAntName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpbuildPackage.HUDSON_DEPLOYMENT__ANT_NAME,
					oldAntName, antName));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getAssignedNode() {

		return assignedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setAssignedNode(String newAssignedNode) {

		String oldAssignedNode = assignedNode;
		assignedNode = newAssignedNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpbuildPackage.HUDSON_DEPLOYMENT__ASSIGNED_NODE,
					oldAssignedNode, assignedNode));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getBuild_id() {

		return build_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setBuild_id(String newBuild_id) {

		String oldBuild_id = build_id;
		build_id = newBuild_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpbuildPackage.HUDSON_DEPLOYMENT__BUILD_ID,
					oldBuild_id, build_id));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isEnabled() {

		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setEnabled(boolean newEnabled) {

		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpbuildPackage.HUDSON_DEPLOYMENT__ENABLED, oldEnabled,
					enabled));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getJdkName() {

		return jdkName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setJdkName(String newJdkName) {

		String oldJdkName = jdkName;
		jdkName = newJdkName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpbuildPackage.HUDSON_DEPLOYMENT__JDK_NAME,
					oldJdkName, jdkName));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getUserDeployJobName() {

		return userDeployJobName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setUserDeployJobName(String newUserDeployJobName) {

		String oldUserDeployJobName = userDeployJobName;
		userDeployJobName = newUserDeployJobName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VpbuildPackage.HUDSON_DEPLOYMENT__USER_DEPLOY_JOB_NAME, oldUserDeployJobName, userDeployJobName));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<User> getUsers() {

		if (users == null) {
			users = new EObjectContainmentEList<User>(User.class, this, VpbuildPackage.HUDSON_DEPLOYMENT__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getUserDeployServerUrl() {

		return userDeployServerUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setUserDeployServerUrl(String newUserDeployServerUrl) {

		String oldUserDeployServerUrl = userDeployServerUrl;
		userDeployServerUrl = newUserDeployServerUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VpbuildPackage.HUDSON_DEPLOYMENT__USER_DEPLOY_SERVER_URL, oldUserDeployServerUrl,
					userDeployServerUrl));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public GenerationLocation getGenerationLocation() {

		return generationLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetGenerationLocation(GenerationLocation newGenerationLocation,
			NotificationChain msgs) {

		GenerationLocation oldGenerationLocation = generationLocation;
		generationLocation = newGenerationLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					VpbuildPackage.HUDSON_DEPLOYMENT__GENERATION_LOCATION, oldGenerationLocation,
					newGenerationLocation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setGenerationLocation(GenerationLocation newGenerationLocation) {

		if (newGenerationLocation != generationLocation) {
			NotificationChain msgs = null;
			if (generationLocation != null)
				msgs = ((InternalEObject) generationLocation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - VpbuildPackage.HUDSON_DEPLOYMENT__GENERATION_LOCATION, null, msgs);
			if (newGenerationLocation != null)
				msgs = ((InternalEObject) newGenerationLocation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - VpbuildPackage.HUDSON_DEPLOYMENT__GENERATION_LOCATION, null, msgs);
			msgs = basicSetGenerationLocation(newGenerationLocation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpbuildPackage.HUDSON_DEPLOYMENT__GENERATION_LOCATION,
					newGenerationLocation, newGenerationLocation));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Trigger> getTriggers() {

		if (triggers == null) {
			triggers = new EObjectContainmentEList<Trigger>(Trigger.class, this,
					VpbuildPackage.HUDSON_DEPLOYMENT__TRIGGERS);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case VpbuildPackage.HUDSON_DEPLOYMENT__USERS:
			return ((InternalEList<?>) getUsers()).basicRemove(otherEnd, msgs);
		case VpbuildPackage.HUDSON_DEPLOYMENT__GENERATION_LOCATION:
			return basicSetGenerationLocation(null, msgs);
		case VpbuildPackage.HUDSON_DEPLOYMENT__TRIGGERS:
			return ((InternalEList<?>) getTriggers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case VpbuildPackage.HUDSON_DEPLOYMENT__ANT_NAME:
			return getAntName();
		case VpbuildPackage.HUDSON_DEPLOYMENT__ASSIGNED_NODE:
			return getAssignedNode();
		case VpbuildPackage.HUDSON_DEPLOYMENT__BUILD_ID:
			return getBuild_id();
		case VpbuildPackage.HUDSON_DEPLOYMENT__ENABLED:
			return isEnabled();
		case VpbuildPackage.HUDSON_DEPLOYMENT__JDK_NAME:
			return getJdkName();
		case VpbuildPackage.HUDSON_DEPLOYMENT__USER_DEPLOY_JOB_NAME:
			return getUserDeployJobName();
		case VpbuildPackage.HUDSON_DEPLOYMENT__USERS:
			return getUsers();
		case VpbuildPackage.HUDSON_DEPLOYMENT__USER_DEPLOY_SERVER_URL:
			return getUserDeployServerUrl();
		case VpbuildPackage.HUDSON_DEPLOYMENT__GENERATION_LOCATION:
			return getGenerationLocation();
		case VpbuildPackage.HUDSON_DEPLOYMENT__TRIGGERS:
			return getTriggers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case VpbuildPackage.HUDSON_DEPLOYMENT__ANT_NAME:
			setAntName((String) newValue);
			return;
		case VpbuildPackage.HUDSON_DEPLOYMENT__ASSIGNED_NODE:
			setAssignedNode((String) newValue);
			return;
		case VpbuildPackage.HUDSON_DEPLOYMENT__BUILD_ID:
			setBuild_id((String) newValue);
			return;
		case VpbuildPackage.HUDSON_DEPLOYMENT__ENABLED:
			setEnabled((Boolean) newValue);
			return;
		case VpbuildPackage.HUDSON_DEPLOYMENT__JDK_NAME:
			setJdkName((String) newValue);
			return;
		case VpbuildPackage.HUDSON_DEPLOYMENT__USER_DEPLOY_JOB_NAME:
			setUserDeployJobName((String) newValue);
			return;
		case VpbuildPackage.HUDSON_DEPLOYMENT__USERS:
			getUsers().clear();
			getUsers().addAll((Collection<? extends User>) newValue);
			return;
		case VpbuildPackage.HUDSON_DEPLOYMENT__USER_DEPLOY_SERVER_URL:
			setUserDeployServerUrl((String) newValue);
			return;
		case VpbuildPackage.HUDSON_DEPLOYMENT__GENERATION_LOCATION:
			setGenerationLocation((GenerationLocation) newValue);
			return;
		case VpbuildPackage.HUDSON_DEPLOYMENT__TRIGGERS:
			getTriggers().clear();
			getTriggers().addAll((Collection<? extends Trigger>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case VpbuildPackage.HUDSON_DEPLOYMENT__ANT_NAME:
			setAntName(ANT_NAME_EDEFAULT);
			return;
		case VpbuildPackage.HUDSON_DEPLOYMENT__ASSIGNED_NODE:
			setAssignedNode(ASSIGNED_NODE_EDEFAULT);
			return;
		case VpbuildPackage.HUDSON_DEPLOYMENT__BUILD_ID:
			setBuild_id(BUILD_ID_EDEFAULT);
			return;
		case VpbuildPackage.HUDSON_DEPLOYMENT__ENABLED:
			setEnabled(ENABLED_EDEFAULT);
			return;
		case VpbuildPackage.HUDSON_DEPLOYMENT__JDK_NAME:
			setJdkName(JDK_NAME_EDEFAULT);
			return;
		case VpbuildPackage.HUDSON_DEPLOYMENT__USER_DEPLOY_JOB_NAME:
			setUserDeployJobName(USER_DEPLOY_JOB_NAME_EDEFAULT);
			return;
		case VpbuildPackage.HUDSON_DEPLOYMENT__USERS:
			getUsers().clear();
			return;
		case VpbuildPackage.HUDSON_DEPLOYMENT__USER_DEPLOY_SERVER_URL:
			setUserDeployServerUrl(USER_DEPLOY_SERVER_URL_EDEFAULT);
			return;
		case VpbuildPackage.HUDSON_DEPLOYMENT__GENERATION_LOCATION:
			setGenerationLocation((GenerationLocation) null);
			return;
		case VpbuildPackage.HUDSON_DEPLOYMENT__TRIGGERS:
			getTriggers().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case VpbuildPackage.HUDSON_DEPLOYMENT__ANT_NAME:
			return ANT_NAME_EDEFAULT == null ? antName != null : !ANT_NAME_EDEFAULT.equals(antName);
		case VpbuildPackage.HUDSON_DEPLOYMENT__ASSIGNED_NODE:
			return ASSIGNED_NODE_EDEFAULT == null ? assignedNode != null : !ASSIGNED_NODE_EDEFAULT.equals(assignedNode);
		case VpbuildPackage.HUDSON_DEPLOYMENT__BUILD_ID:
			return BUILD_ID_EDEFAULT == null ? build_id != null : !BUILD_ID_EDEFAULT.equals(build_id);
		case VpbuildPackage.HUDSON_DEPLOYMENT__ENABLED:
			return enabled != ENABLED_EDEFAULT;
		case VpbuildPackage.HUDSON_DEPLOYMENT__JDK_NAME:
			return JDK_NAME_EDEFAULT == null ? jdkName != null : !JDK_NAME_EDEFAULT.equals(jdkName);
		case VpbuildPackage.HUDSON_DEPLOYMENT__USER_DEPLOY_JOB_NAME:
			return USER_DEPLOY_JOB_NAME_EDEFAULT == null ? userDeployJobName != null
					: !USER_DEPLOY_JOB_NAME_EDEFAULT.equals(userDeployJobName);
		case VpbuildPackage.HUDSON_DEPLOYMENT__USERS:
			return users != null && !users.isEmpty();
		case VpbuildPackage.HUDSON_DEPLOYMENT__USER_DEPLOY_SERVER_URL:
			return USER_DEPLOY_SERVER_URL_EDEFAULT == null ? userDeployServerUrl != null
					: !USER_DEPLOY_SERVER_URL_EDEFAULT.equals(userDeployServerUrl);
		case VpbuildPackage.HUDSON_DEPLOYMENT__GENERATION_LOCATION:
			return generationLocation != null;
		case VpbuildPackage.HUDSON_DEPLOYMENT__TRIGGERS:
			return triggers != null && !triggers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (antName: "); //$NON-NLS-1$
		result.append(antName);
		result.append(", assignedNode: "); //$NON-NLS-1$
		result.append(assignedNode);
		result.append(", build_id: "); //$NON-NLS-1$
		result.append(build_id);
		result.append(", enabled: "); //$NON-NLS-1$
		result.append(enabled);
		result.append(", jdkName: "); //$NON-NLS-1$
		result.append(jdkName);
		result.append(", userDeployJobName: "); //$NON-NLS-1$
		result.append(userDeployJobName);
		result.append(", userDeployServerUrl: "); //$NON-NLS-1$
		result.append(userDeployServerUrl);
		result.append(')');
		return result.toString();
	}

} //HudsonDeploymentImpl
