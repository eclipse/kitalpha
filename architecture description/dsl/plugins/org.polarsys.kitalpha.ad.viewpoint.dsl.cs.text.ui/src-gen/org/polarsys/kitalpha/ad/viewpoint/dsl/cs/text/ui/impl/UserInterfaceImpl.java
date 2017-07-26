/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.impl;

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

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.Import;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.UiPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.UserInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.impl.UserInterfaceImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.impl.UserInterfaceImpl#getUiDescription <em>Ui Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserInterfaceImpl extends MinimalEObjectImpl.Container implements UserInterface
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
   * The cached value of the '{@link #getUiDescription() <em>Ui Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUiDescription()
   * @generated
   * @ordered
   */
  protected Aspect uiDescription;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UserInterfaceImpl()
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
    return UiPackage.Literals.USER_INTERFACE;
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
      imports = new EObjectContainmentEList<Import>(Import.class, this, UiPackage.USER_INTERFACE__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aspect getUiDescription()
  {
    return uiDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUiDescription(Aspect newUiDescription, NotificationChain msgs)
  {
    Aspect oldUiDescription = uiDescription;
    uiDescription = newUiDescription;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiPackage.USER_INTERFACE__UI_DESCRIPTION, oldUiDescription, newUiDescription);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUiDescription(Aspect newUiDescription)
  {
    if (newUiDescription != uiDescription)
    {
      NotificationChain msgs = null;
      if (uiDescription != null)
        msgs = ((InternalEObject)uiDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiPackage.USER_INTERFACE__UI_DESCRIPTION, null, msgs);
      if (newUiDescription != null)
        msgs = ((InternalEObject)newUiDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiPackage.USER_INTERFACE__UI_DESCRIPTION, null, msgs);
      msgs = basicSetUiDescription(newUiDescription, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.USER_INTERFACE__UI_DESCRIPTION, newUiDescription, newUiDescription));
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
      case UiPackage.USER_INTERFACE__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case UiPackage.USER_INTERFACE__UI_DESCRIPTION:
        return basicSetUiDescription(null, msgs);
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
      case UiPackage.USER_INTERFACE__IMPORTS:
        return getImports();
      case UiPackage.USER_INTERFACE__UI_DESCRIPTION:
        return getUiDescription();
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
      case UiPackage.USER_INTERFACE__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case UiPackage.USER_INTERFACE__UI_DESCRIPTION:
        setUiDescription((Aspect)newValue);
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
      case UiPackage.USER_INTERFACE__IMPORTS:
        getImports().clear();
        return;
      case UiPackage.USER_INTERFACE__UI_DESCRIPTION:
        setUiDescription((Aspect)null);
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
      case UiPackage.USER_INTERFACE__IMPORTS:
        return imports != null && !imports.isEmpty();
      case UiPackage.USER_INTERFACE__UI_DESCRIPTION:
        return uiDescription != null;
    }
    return super.eIsSet(featureID);
  }

} //UserInterfaceImpl
