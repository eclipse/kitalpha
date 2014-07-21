/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.impl.ViewpointImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.impl.ViewpointImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.impl.ViewpointImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.impl.ViewpointImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.impl.ViewpointImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.impl.ViewpointImpl#getVP_Data <em>VP Data</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.impl.ViewpointImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.impl.ViewpointImpl#getVP_Aspects <em>VP Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewpointImpl extends MinimalEObjectImpl.Container implements Viewpoint
{
  /**
   * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortName()
   * @generated
   * @ordered
   */
  protected static final String SHORT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortName()
   * @generated
   * @ordered
   */
  protected String shortName = SHORT_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getParents() <em>Parents</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParents()
   * @generated
   * @ordered
   */
  protected EList<Viewpoint> parents;

  /**
   * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependencies()
   * @generated
   * @ordered
   */
  protected EList<Viewpoint> dependencies;

  /**
   * The cached value of the '{@link #getVP_Data() <em>VP Data</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVP_Data()
   * @generated
   * @ordered
   */
  protected Data vP_Data;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EList<String> type;

  /**
   * The cached value of the '{@link #getVP_Aspects() <em>VP Aspects</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVP_Aspects()
   * @generated
   * @ordered
   */
  protected EList<Aspect> vP_Aspects;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewpointImpl()
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
    return VpspecPackage.Literals.VIEWPOINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getShortName()
  {
    return shortName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShortName(String newShortName)
  {
    String oldShortName = shortName;
    shortName = newShortName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VpspecPackage.VIEWPOINT__SHORT_NAME, oldShortName, shortName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VpspecPackage.VIEWPOINT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VpspecPackage.VIEWPOINT__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Viewpoint> getParents()
  {
    if (parents == null)
    {
      parents = new EObjectResolvingEList<Viewpoint>(Viewpoint.class, this, VpspecPackage.VIEWPOINT__PARENTS);
    }
    return parents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Viewpoint> getDependencies()
  {
    if (dependencies == null)
    {
      dependencies = new EObjectResolvingEList<Viewpoint>(Viewpoint.class, this, VpspecPackage.VIEWPOINT__DEPENDENCIES);
    }
    return dependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Data getVP_Data()
  {
    if (vP_Data != null && vP_Data.eIsProxy())
    {
      InternalEObject oldVP_Data = (InternalEObject)vP_Data;
      vP_Data = (Data)eResolveProxy(oldVP_Data);
      if (vP_Data != oldVP_Data)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VpspecPackage.VIEWPOINT__VP_DATA, oldVP_Data, vP_Data));
      }
    }
    return vP_Data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Data basicGetVP_Data()
  {
    return vP_Data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVP_Data(Data newVP_Data)
  {
    Data oldVP_Data = vP_Data;
    vP_Data = newVP_Data;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VpspecPackage.VIEWPOINT__VP_DATA, oldVP_Data, vP_Data));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getType()
  {
    if (type == null)
    {
      type = new EDataTypeEList<String>(String.class, this, VpspecPackage.VIEWPOINT__TYPE);
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Aspect> getVP_Aspects()
  {
    if (vP_Aspects == null)
    {
      vP_Aspects = new EObjectResolvingEList<Aspect>(Aspect.class, this, VpspecPackage.VIEWPOINT__VP_ASPECTS);
    }
    return vP_Aspects;
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
      case VpspecPackage.VIEWPOINT__SHORT_NAME:
        return getShortName();
      case VpspecPackage.VIEWPOINT__NAME:
        return getName();
      case VpspecPackage.VIEWPOINT__DESCRIPTION:
        return getDescription();
      case VpspecPackage.VIEWPOINT__PARENTS:
        return getParents();
      case VpspecPackage.VIEWPOINT__DEPENDENCIES:
        return getDependencies();
      case VpspecPackage.VIEWPOINT__VP_DATA:
        if (resolve) return getVP_Data();
        return basicGetVP_Data();
      case VpspecPackage.VIEWPOINT__TYPE:
        return getType();
      case VpspecPackage.VIEWPOINT__VP_ASPECTS:
        return getVP_Aspects();
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
      case VpspecPackage.VIEWPOINT__SHORT_NAME:
        setShortName((String)newValue);
        return;
      case VpspecPackage.VIEWPOINT__NAME:
        setName((String)newValue);
        return;
      case VpspecPackage.VIEWPOINT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case VpspecPackage.VIEWPOINT__PARENTS:
        getParents().clear();
        getParents().addAll((Collection<? extends Viewpoint>)newValue);
        return;
      case VpspecPackage.VIEWPOINT__DEPENDENCIES:
        getDependencies().clear();
        getDependencies().addAll((Collection<? extends Viewpoint>)newValue);
        return;
      case VpspecPackage.VIEWPOINT__VP_DATA:
        setVP_Data((Data)newValue);
        return;
      case VpspecPackage.VIEWPOINT__TYPE:
        getType().clear();
        getType().addAll((Collection<? extends String>)newValue);
        return;
      case VpspecPackage.VIEWPOINT__VP_ASPECTS:
        getVP_Aspects().clear();
        getVP_Aspects().addAll((Collection<? extends Aspect>)newValue);
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
      case VpspecPackage.VIEWPOINT__SHORT_NAME:
        setShortName(SHORT_NAME_EDEFAULT);
        return;
      case VpspecPackage.VIEWPOINT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case VpspecPackage.VIEWPOINT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case VpspecPackage.VIEWPOINT__PARENTS:
        getParents().clear();
        return;
      case VpspecPackage.VIEWPOINT__DEPENDENCIES:
        getDependencies().clear();
        return;
      case VpspecPackage.VIEWPOINT__VP_DATA:
        setVP_Data((Data)null);
        return;
      case VpspecPackage.VIEWPOINT__TYPE:
        getType().clear();
        return;
      case VpspecPackage.VIEWPOINT__VP_ASPECTS:
        getVP_Aspects().clear();
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
      case VpspecPackage.VIEWPOINT__SHORT_NAME:
        return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
      case VpspecPackage.VIEWPOINT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case VpspecPackage.VIEWPOINT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case VpspecPackage.VIEWPOINT__PARENTS:
        return parents != null && !parents.isEmpty();
      case VpspecPackage.VIEWPOINT__DEPENDENCIES:
        return dependencies != null && !dependencies.isEmpty();
      case VpspecPackage.VIEWPOINT__VP_DATA:
        return vP_Data != null;
      case VpspecPackage.VIEWPOINT__TYPE:
        return type != null && !type.isEmpty();
      case VpspecPackage.VIEWPOINT__VP_ASPECTS:
        return vP_Aspects != null && !vP_Aspects.isEmpty();
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
    result.append(" (shortName: ");
    result.append(shortName);
    result.append(", name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //ViewpointImpl
