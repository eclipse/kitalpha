/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.GData;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.VpconfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GData</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.GDataImpl#isModel <em>Model</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.GDataImpl#isEdit <em>Edit</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.GDataImpl#isEditor <em>Editor</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.GDataImpl#isTest <em>Test</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.GDataImpl#isJavaDoc <em>Java Doc</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.impl.GDataImpl#isOverwriteEcore <em>Overwrite Ecore</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GDataImpl extends EObjectImpl implements GData {

	/**
	 * The default value of the '{@link #isModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MODEL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModel()
	 * @generated
	 * @ordered
	 */
	protected boolean model = MODEL_EDEFAULT;




	/**
	 * The default value of the '{@link #isEdit() <em>Edit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEdit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EDIT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEdit() <em>Edit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEdit()
	 * @generated
	 * @ordered
	 */
	protected boolean edit = EDIT_EDEFAULT;




	/**
	 * The default value of the '{@link #isEditor() <em>Editor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEditor()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EDITOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEditor() <em>Editor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEditor()
	 * @generated
	 * @ordered
	 */
	protected boolean editor = EDITOR_EDEFAULT;




	/**
	 * The default value of the '{@link #isTest() <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTest()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTest() <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTest()
	 * @generated
	 * @ordered
	 */
	protected boolean test = TEST_EDEFAULT;




	/**
	 * The default value of the '{@link #isJavaDoc() <em>Java Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJavaDoc()
	 * @generated
	 * @ordered
	 */
	protected static final boolean JAVA_DOC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isJavaDoc() <em>Java Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJavaDoc()
	 * @generated
	 * @ordered
	 */
	protected boolean javaDoc = JAVA_DOC_EDEFAULT;




	/**
	 * The default value of the '{@link #isOverwriteEcore() <em>Overwrite Ecore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverwriteEcore()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVERWRITE_ECORE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOverwriteEcore() <em>Overwrite Ecore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverwriteEcore()
	 * @generated
	 * @ordered
	 */
	protected boolean overwriteEcore = OVERWRITE_ECORE_EDEFAULT;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GDataImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VpconfPackage.Literals.GDATA;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isModel() {

		return model;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setModel(boolean newModel) {

		boolean oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpconfPackage.GDATA__MODEL, oldModel, model));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isEdit() {

		return edit;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setEdit(boolean newEdit) {

		boolean oldEdit = edit;
		edit = newEdit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpconfPackage.GDATA__EDIT, oldEdit, edit));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isEditor() {

		return editor;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setEditor(boolean newEditor) {

		boolean oldEditor = editor;
		editor = newEditor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpconfPackage.GDATA__EDITOR, oldEditor, editor));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isTest() {

		return test;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setTest(boolean newTest) {

		boolean oldTest = test;
		test = newTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpconfPackage.GDATA__TEST, oldTest, test));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isJavaDoc() {

		return javaDoc;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setJavaDoc(boolean newJavaDoc) {

		boolean oldJavaDoc = javaDoc;
		javaDoc = newJavaDoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpconfPackage.GDATA__JAVA_DOC, oldJavaDoc, javaDoc));

	}






	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isOverwriteEcore() {

		return overwriteEcore;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOverwriteEcore(boolean newOverwriteEcore) {

		boolean oldOverwriteEcore = overwriteEcore;
		overwriteEcore = newOverwriteEcore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VpconfPackage.GDATA__OVERWRITE_ECORE, oldOverwriteEcore, overwriteEcore));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VpconfPackage.GDATA__MODEL:
				return isModel();
			case VpconfPackage.GDATA__EDIT:
				return isEdit();
			case VpconfPackage.GDATA__EDITOR:
				return isEditor();
			case VpconfPackage.GDATA__TEST:
				return isTest();
			case VpconfPackage.GDATA__JAVA_DOC:
				return isJavaDoc();
			case VpconfPackage.GDATA__OVERWRITE_ECORE:
				return isOverwriteEcore();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VpconfPackage.GDATA__MODEL:
				setModel((Boolean)newValue);
				return;
			case VpconfPackage.GDATA__EDIT:
				setEdit((Boolean)newValue);
				return;
			case VpconfPackage.GDATA__EDITOR:
				setEditor((Boolean)newValue);
				return;
			case VpconfPackage.GDATA__TEST:
				setTest((Boolean)newValue);
				return;
			case VpconfPackage.GDATA__JAVA_DOC:
				setJavaDoc((Boolean)newValue);
				return;
			case VpconfPackage.GDATA__OVERWRITE_ECORE:
				setOverwriteEcore((Boolean)newValue);
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
			case VpconfPackage.GDATA__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case VpconfPackage.GDATA__EDIT:
				setEdit(EDIT_EDEFAULT);
				return;
			case VpconfPackage.GDATA__EDITOR:
				setEditor(EDITOR_EDEFAULT);
				return;
			case VpconfPackage.GDATA__TEST:
				setTest(TEST_EDEFAULT);
				return;
			case VpconfPackage.GDATA__JAVA_DOC:
				setJavaDoc(JAVA_DOC_EDEFAULT);
				return;
			case VpconfPackage.GDATA__OVERWRITE_ECORE:
				setOverwriteEcore(OVERWRITE_ECORE_EDEFAULT);
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
			case VpconfPackage.GDATA__MODEL:
				return model != MODEL_EDEFAULT;
			case VpconfPackage.GDATA__EDIT:
				return edit != EDIT_EDEFAULT;
			case VpconfPackage.GDATA__EDITOR:
				return editor != EDITOR_EDEFAULT;
			case VpconfPackage.GDATA__TEST:
				return test != TEST_EDEFAULT;
			case VpconfPackage.GDATA__JAVA_DOC:
				return javaDoc != JAVA_DOC_EDEFAULT;
			case VpconfPackage.GDATA__OVERWRITE_ECORE:
				return overwriteEcore != OVERWRITE_ECORE_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (model: ");
		result.append(model);
		result.append(", edit: ");
		result.append(edit);
		result.append(", editor: ");
		result.append(editor);
		result.append(", test: ");
		result.append(test);
		result.append(", javaDoc: ");
		result.append(javaDoc);
		result.append(", overwriteEcore: ");
		result.append(overwriteEcore);
		result.append(')');
		return result.toString();
	}


} //GDataImpl
