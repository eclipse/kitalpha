/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataSpec;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.Import;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.DataSpecImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl.DataSpecImpl#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataSpecImpl extends MinimalEObjectImpl.Container implements DataSpec
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getData()
   * @generated
   * @ordered
   */
  protected Data data;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataSpecImpl()
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
    return DataPackage.Literals.DATA_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, DataPackage.DATA_SPEC__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Data getData()
  {
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetData(Data newData, NotificationChain msgs)
  {
    Data oldData = data;
    data = newData;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataPackage.DATA_SPEC__DATA, oldData, newData);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setData(Data newData)
  {
    if (newData != data)
    {
      NotificationChain msgs = null;
      if (data != null)
        msgs = ((InternalEObject)data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataPackage.DATA_SPEC__DATA, null, msgs);
      if (newData != null)
        msgs = ((InternalEObject)newData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataPackage.DATA_SPEC__DATA, null, msgs);
      msgs = basicSetData(newData, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_SPEC__DATA, newData, newData));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DataPackage.DATA_SPEC__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case DataPackage.DATA_SPEC__DATA:
        return basicSetData(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DataPackage.DATA_SPEC__IMPORTS:
        return getImports();
      case DataPackage.DATA_SPEC__DATA:
        return getData();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DataPackage.DATA_SPEC__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case DataPackage.DATA_SPEC__DATA:
        setData((Data)newValue);
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
      case DataPackage.DATA_SPEC__IMPORTS:
        getImports().clear();
        return;
      case DataPackage.DATA_SPEC__DATA:
        setData((Data)null);
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
      case DataPackage.DATA_SPEC__IMPORTS:
        return imports != null && !imports.isEmpty();
      case DataPackage.DATA_SPEC__DATA:
        return data != null;
    }
    return super.eIsSet(featureID);
  }

} //DataSpecImpl
