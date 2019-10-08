/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.AbstractPage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.DynamicIcon;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.Icon;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.Overview;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.Page;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.PredicateElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.Section;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.impl.PageImpl#getImagePathOff <em>Image Path Off</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.impl.PageImpl#getImagePathOn <em>Image Path On</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.impl.PageImpl#isHasPredicate <em>Has Predicate</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.impl.PageImpl#getOwnedSections <em>Owned Sections</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.impl.PageImpl#getOwnedOverview <em>Owned Overview</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.impl.PageImpl#getTabName <em>Tab Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.impl.PageImpl#isShowViewer <em>Show Viewer</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.impl.PageImpl#getFileExtensions <em>File Extensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends ActivityExplorerItemImpl implements Page {

	/**
	 * The default value of the '{@link #getImagePathOff() <em>Image Path Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePathOff()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_PATH_OFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImagePathOff() <em>Image Path Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePathOff()
	 * @generated
	 * @ordered
	 */
	protected String imagePathOff = IMAGE_PATH_OFF_EDEFAULT;




	/**
	 * The default value of the '{@link #getImagePathOn() <em>Image Path On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePathOn()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_PATH_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImagePathOn() <em>Image Path On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePathOn()
	 * @generated
	 * @ordered
	 */
	protected String imagePathOn = IMAGE_PATH_ON_EDEFAULT;




	/**
	 * The default value of the '{@link #isHasPredicate() <em>Has Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasPredicate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_PREDICATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasPredicate() <em>Has Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasPredicate()
	 * @generated
	 * @ordered
	 */
	protected boolean hasPredicate = HAS_PREDICATE_EDEFAULT;




	/**
	 * The cached value of the '{@link #getOwnedSections() <em>Owned Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSections()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> ownedSections;




	/**
	 * The cached value of the '{@link #getOwnedOverview() <em>Owned Overview</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOverview()
	 * @generated
	 * @ordered
	 */
	protected Overview ownedOverview;




	/**
	 * The default value of the '{@link #getTabName() <em>Tab Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabName()
	 * @generated
	 * @ordered
	 */
	protected static final String TAB_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTabName() <em>Tab Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabName()
	 * @generated
	 * @ordered
	 */
	protected String tabName = TAB_NAME_EDEFAULT;




	/**
	 * The default value of the '{@link #isShowViewer() <em>Show Viewer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowViewer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_VIEWER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowViewer() <em>Show Viewer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowViewer()
	 * @generated
	 * @ordered
	 */
	protected boolean showViewer = SHOW_VIEWER_EDEFAULT;




	/**
	 * The default value of the '{@link #getFileExtensions() <em>File Extensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileExtensions()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EXTENSIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileExtensions() <em>File Extensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileExtensions()
	 * @generated
	 * @ordered
	 */
	protected String fileExtensions = FILE_EXTENSIONS_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewpointActivityExplorerPackage.Literals.PAGE;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getImagePathOff() {

		return imagePathOff;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setImagePathOff(String newImagePathOff) {

		String oldImagePathOff = imagePathOff;
		imagePathOff = newImagePathOff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.PAGE__IMAGE_PATH_OFF, oldImagePathOff, imagePathOff));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getImagePathOn() {

		return imagePathOn;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setImagePathOn(String newImagePathOn) {

		String oldImagePathOn = imagePathOn;
		imagePathOn = newImagePathOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.PAGE__IMAGE_PATH_ON, oldImagePathOn, imagePathOn));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isHasPredicate() {

		return hasPredicate;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setHasPredicate(boolean newHasPredicate) {

		boolean oldHasPredicate = hasPredicate;
		hasPredicate = newHasPredicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.PAGE__HAS_PREDICATE, oldHasPredicate, hasPredicate));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Section> getOwnedSections() {

		if (ownedSections == null) {
			ownedSections = new EObjectContainmentEList<Section>(Section.class, this, ViewpointActivityExplorerPackage.PAGE__OWNED_SECTIONS);
		}
		return ownedSections;
	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Overview getOwnedOverview() {

		return ownedOverview;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOwnedOverview(Overview newOwnedOverview, NotificationChain msgs) {

		Overview oldOwnedOverview = ownedOverview;
		ownedOverview = newOwnedOverview;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.PAGE__OWNED_OVERVIEW, oldOwnedOverview, newOwnedOverview);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOwnedOverview(Overview newOwnedOverview) {

		if (newOwnedOverview != ownedOverview) {
			NotificationChain msgs = null;
			if (ownedOverview != null)
				msgs = ((InternalEObject)ownedOverview).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewpointActivityExplorerPackage.PAGE__OWNED_OVERVIEW, null, msgs);
			if (newOwnedOverview != null)
				msgs = ((InternalEObject)newOwnedOverview).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewpointActivityExplorerPackage.PAGE__OWNED_OVERVIEW, null, msgs);
			msgs = basicSetOwnedOverview(newOwnedOverview, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.PAGE__OWNED_OVERVIEW, newOwnedOverview, newOwnedOverview));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getTabName() {

		return tabName;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setTabName(String newTabName) {

		String oldTabName = tabName;
		tabName = newTabName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.PAGE__TAB_NAME, oldTabName, tabName));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isShowViewer() {

		return showViewer;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setShowViewer(boolean newShowViewer) {

		boolean oldShowViewer = showViewer;
		showViewer = newShowViewer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.PAGE__SHOW_VIEWER, oldShowViewer, showViewer));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getFileExtensions() {

		return fileExtensions;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setFileExtensions(String newFileExtensions) {

		String oldFileExtensions = fileExtensions;
		fileExtensions = newFileExtensions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewpointActivityExplorerPackage.PAGE__FILE_EXTENSIONS, oldFileExtensions, fileExtensions));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewpointActivityExplorerPackage.PAGE__OWNED_SECTIONS:
				return ((InternalEList<?>)getOwnedSections()).basicRemove(otherEnd, msgs);
			case ViewpointActivityExplorerPackage.PAGE__OWNED_OVERVIEW:
				return basicSetOwnedOverview(null, msgs);
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
			case ViewpointActivityExplorerPackage.PAGE__IMAGE_PATH_OFF:
				return getImagePathOff();
			case ViewpointActivityExplorerPackage.PAGE__IMAGE_PATH_ON:
				return getImagePathOn();
			case ViewpointActivityExplorerPackage.PAGE__HAS_PREDICATE:
				return isHasPredicate();
			case ViewpointActivityExplorerPackage.PAGE__OWNED_SECTIONS:
				return getOwnedSections();
			case ViewpointActivityExplorerPackage.PAGE__OWNED_OVERVIEW:
				return getOwnedOverview();
			case ViewpointActivityExplorerPackage.PAGE__TAB_NAME:
				return getTabName();
			case ViewpointActivityExplorerPackage.PAGE__SHOW_VIEWER:
				return isShowViewer();
			case ViewpointActivityExplorerPackage.PAGE__FILE_EXTENSIONS:
				return getFileExtensions();
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
			case ViewpointActivityExplorerPackage.PAGE__IMAGE_PATH_OFF:
				setImagePathOff((String)newValue);
				return;
			case ViewpointActivityExplorerPackage.PAGE__IMAGE_PATH_ON:
				setImagePathOn((String)newValue);
				return;
			case ViewpointActivityExplorerPackage.PAGE__HAS_PREDICATE:
				setHasPredicate((Boolean)newValue);
				return;
			case ViewpointActivityExplorerPackage.PAGE__OWNED_SECTIONS:
				getOwnedSections().clear();
				getOwnedSections().addAll((Collection<? extends Section>)newValue);
				return;
			case ViewpointActivityExplorerPackage.PAGE__OWNED_OVERVIEW:
				setOwnedOverview((Overview)newValue);
				return;
			case ViewpointActivityExplorerPackage.PAGE__TAB_NAME:
				setTabName((String)newValue);
				return;
			case ViewpointActivityExplorerPackage.PAGE__SHOW_VIEWER:
				setShowViewer((Boolean)newValue);
				return;
			case ViewpointActivityExplorerPackage.PAGE__FILE_EXTENSIONS:
				setFileExtensions((String)newValue);
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
			case ViewpointActivityExplorerPackage.PAGE__IMAGE_PATH_OFF:
				setImagePathOff(IMAGE_PATH_OFF_EDEFAULT);
				return;
			case ViewpointActivityExplorerPackage.PAGE__IMAGE_PATH_ON:
				setImagePathOn(IMAGE_PATH_ON_EDEFAULT);
				return;
			case ViewpointActivityExplorerPackage.PAGE__HAS_PREDICATE:
				setHasPredicate(HAS_PREDICATE_EDEFAULT);
				return;
			case ViewpointActivityExplorerPackage.PAGE__OWNED_SECTIONS:
				getOwnedSections().clear();
				return;
			case ViewpointActivityExplorerPackage.PAGE__OWNED_OVERVIEW:
				setOwnedOverview((Overview)null);
				return;
			case ViewpointActivityExplorerPackage.PAGE__TAB_NAME:
				setTabName(TAB_NAME_EDEFAULT);
				return;
			case ViewpointActivityExplorerPackage.PAGE__SHOW_VIEWER:
				setShowViewer(SHOW_VIEWER_EDEFAULT);
				return;
			case ViewpointActivityExplorerPackage.PAGE__FILE_EXTENSIONS:
				setFileExtensions(FILE_EXTENSIONS_EDEFAULT);
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
			case ViewpointActivityExplorerPackage.PAGE__IMAGE_PATH_OFF:
				return IMAGE_PATH_OFF_EDEFAULT == null ? imagePathOff != null : !IMAGE_PATH_OFF_EDEFAULT.equals(imagePathOff);
			case ViewpointActivityExplorerPackage.PAGE__IMAGE_PATH_ON:
				return IMAGE_PATH_ON_EDEFAULT == null ? imagePathOn != null : !IMAGE_PATH_ON_EDEFAULT.equals(imagePathOn);
			case ViewpointActivityExplorerPackage.PAGE__HAS_PREDICATE:
				return hasPredicate != HAS_PREDICATE_EDEFAULT;
			case ViewpointActivityExplorerPackage.PAGE__OWNED_SECTIONS:
				return ownedSections != null && !ownedSections.isEmpty();
			case ViewpointActivityExplorerPackage.PAGE__OWNED_OVERVIEW:
				return ownedOverview != null;
			case ViewpointActivityExplorerPackage.PAGE__TAB_NAME:
				return TAB_NAME_EDEFAULT == null ? tabName != null : !TAB_NAME_EDEFAULT.equals(tabName);
			case ViewpointActivityExplorerPackage.PAGE__SHOW_VIEWER:
				return showViewer != SHOW_VIEWER_EDEFAULT;
			case ViewpointActivityExplorerPackage.PAGE__FILE_EXTENSIONS:
				return FILE_EXTENSIONS_EDEFAULT == null ? fileExtensions != null : !FILE_EXTENSIONS_EDEFAULT.equals(fileExtensions);
		}
		return super.eIsSet(featureID);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Icon.class) {
			switch (derivedFeatureID) {
				case ViewpointActivityExplorerPackage.PAGE__IMAGE_PATH_OFF: return ViewpointActivityExplorerPackage.ICON__IMAGE_PATH_OFF;
				default: return -1;
			}
		}
		if (baseClass == DynamicIcon.class) {
			switch (derivedFeatureID) {
				case ViewpointActivityExplorerPackage.PAGE__IMAGE_PATH_ON: return ViewpointActivityExplorerPackage.DYNAMIC_ICON__IMAGE_PATH_ON;
				default: return -1;
			}
		}
		if (baseClass == PredicateElement.class) {
			switch (derivedFeatureID) {
				case ViewpointActivityExplorerPackage.PAGE__HAS_PREDICATE: return ViewpointActivityExplorerPackage.PREDICATE_ELEMENT__HAS_PREDICATE;
				default: return -1;
			}
		}
		if (baseClass == AbstractPage.class) {
			switch (derivedFeatureID) {
				case ViewpointActivityExplorerPackage.PAGE__OWNED_SECTIONS: return ViewpointActivityExplorerPackage.ABSTRACT_PAGE__OWNED_SECTIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Icon.class) {
			switch (baseFeatureID) {
				case ViewpointActivityExplorerPackage.ICON__IMAGE_PATH_OFF: return ViewpointActivityExplorerPackage.PAGE__IMAGE_PATH_OFF;
				default: return -1;
			}
		}
		if (baseClass == DynamicIcon.class) {
			switch (baseFeatureID) {
				case ViewpointActivityExplorerPackage.DYNAMIC_ICON__IMAGE_PATH_ON: return ViewpointActivityExplorerPackage.PAGE__IMAGE_PATH_ON;
				default: return -1;
			}
		}
		if (baseClass == PredicateElement.class) {
			switch (baseFeatureID) {
				case ViewpointActivityExplorerPackage.PREDICATE_ELEMENT__HAS_PREDICATE: return ViewpointActivityExplorerPackage.PAGE__HAS_PREDICATE;
				default: return -1;
			}
		}
		if (baseClass == AbstractPage.class) {
			switch (baseFeatureID) {
				case ViewpointActivityExplorerPackage.ABSTRACT_PAGE__OWNED_SECTIONS: return ViewpointActivityExplorerPackage.PAGE__OWNED_SECTIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (imagePathOff: ");
		result.append(imagePathOff);
		result.append(", imagePathOn: ");
		result.append(imagePathOn);
		result.append(", hasPredicate: ");
		result.append(hasPredicate);
		result.append(", tabName: ");
		result.append(tabName);
		result.append(", showViewer: ");
		result.append(showViewer);
		result.append(", fileExtensions: ");
		result.append(fileExtensions);
		result.append(')');
		return result.toString();
	}


} //PageImpl
