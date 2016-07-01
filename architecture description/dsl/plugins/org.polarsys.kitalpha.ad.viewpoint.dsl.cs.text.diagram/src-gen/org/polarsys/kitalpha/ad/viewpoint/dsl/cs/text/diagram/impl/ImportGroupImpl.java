/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.DiagramPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.ImportGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.ImportGroupImpl#getImportedGroup <em>Imported Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportGroupImpl extends AbstractImportImpl implements ImportGroup
{
  /**
   * The default value of the '{@link #getImportedGroup() <em>Imported Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedGroup()
   * @generated
   * @ordered
   */
  protected static final String IMPORTED_GROUP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImportedGroup() <em>Imported Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedGroup()
   * @generated
   * @ordered
   */
  protected String importedGroup = IMPORTED_GROUP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportGroupImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DiagramPackage.Literals.IMPORT_GROUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImportedGroup()
  {
    return importedGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportedGroup(String newImportedGroup)
  {
    String oldImportedGroup = importedGroup;
    importedGroup = newImportedGroup;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.IMPORT_GROUP__IMPORTED_GROUP, oldImportedGroup, importedGroup));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DiagramPackage.IMPORT_GROUP__IMPORTED_GROUP:
        return getImportedGroup();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DiagramPackage.IMPORT_GROUP__IMPORTED_GROUP:
        setImportedGroup((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DiagramPackage.IMPORT_GROUP__IMPORTED_GROUP:
        setImportedGroup(IMPORTED_GROUP_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DiagramPackage.IMPORT_GROUP__IMPORTED_GROUP:
        return IMPORTED_GROUP_EDEFAULT == null ? importedGroup != null : !IMPORTED_GROUP_EDEFAULT.equals(importedGroup);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (importedGroup: ");
    result.append(importedGroup);
    result.append(')');
    return result.toString();
  }

} //ImportGroupImpl
