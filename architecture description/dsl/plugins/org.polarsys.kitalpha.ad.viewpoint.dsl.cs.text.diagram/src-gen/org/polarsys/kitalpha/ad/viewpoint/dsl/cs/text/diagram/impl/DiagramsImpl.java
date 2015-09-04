/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl;

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

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.AbstractImport;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.DiagramPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.Diagrams;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagrams</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.DiagramsImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl.DiagramsImpl#getDiagrams <em>Diagrams</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramsImpl extends MinimalEObjectImpl.Container implements Diagrams
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<AbstractImport> imports;

  /**
   * The cached value of the '{@link #getDiagrams() <em>Diagrams</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiagrams()
   * @generated
   * @ordered
   */
  protected Aspect diagrams;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DiagramsImpl()
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
    return DiagramPackage.Literals.DIAGRAMS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractImport> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<AbstractImport>(AbstractImport.class, this, DiagramPackage.DIAGRAMS__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aspect getDiagrams()
  {
    return diagrams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDiagrams(Aspect newDiagrams, NotificationChain msgs)
  {
    Aspect oldDiagrams = diagrams;
    diagrams = newDiagrams;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramPackage.DIAGRAMS__DIAGRAMS, oldDiagrams, newDiagrams);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiagrams(Aspect newDiagrams)
  {
    if (newDiagrams != diagrams)
    {
      NotificationChain msgs = null;
      if (diagrams != null)
        msgs = ((InternalEObject)diagrams).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.DIAGRAMS__DIAGRAMS, null, msgs);
      if (newDiagrams != null)
        msgs = ((InternalEObject)newDiagrams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.DIAGRAMS__DIAGRAMS, null, msgs);
      msgs = basicSetDiagrams(newDiagrams, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.DIAGRAMS__DIAGRAMS, newDiagrams, newDiagrams));
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
      case DiagramPackage.DIAGRAMS__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case DiagramPackage.DIAGRAMS__DIAGRAMS:
        return basicSetDiagrams(null, msgs);
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
      case DiagramPackage.DIAGRAMS__IMPORTS:
        return getImports();
      case DiagramPackage.DIAGRAMS__DIAGRAMS:
        return getDiagrams();
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
      case DiagramPackage.DIAGRAMS__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends AbstractImport>)newValue);
        return;
      case DiagramPackage.DIAGRAMS__DIAGRAMS:
        setDiagrams((Aspect)newValue);
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
      case DiagramPackage.DIAGRAMS__IMPORTS:
        getImports().clear();
        return;
      case DiagramPackage.DIAGRAMS__DIAGRAMS:
        setDiagrams((Aspect)null);
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
      case DiagramPackage.DIAGRAMS__IMPORTS:
        return imports != null && !imports.isEmpty();
      case DiagramPackage.DIAGRAMS__DIAGRAMS:
        return diagrams != null;
    }
    return super.eIsSet(featureID);
  }

} //DiagramsImpl
