/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getShortName <em>Short Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getParents <em>Parents</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getUseViewpoint <em>Use Viewpoint</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getUseAnyEMFResource <em>Use Any EMF Resource</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getUseDiagramResource <em>Use Diagram Resource</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getUseWorkspaceResource <em>Use Workspace Resource</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getUseFSResource <em>Use FS Resource</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getVP_Data <em>VP Data</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getType <em>Type</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getVP_Aspects <em>VP Aspects</em>}</li>
 * </ul>
 *
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecPackage#getViewpoint()
 * @model
 * @generated
 */
public interface Viewpoint extends EObject
{
  /**
   * Returns the value of the '<em><b>Short Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Short Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Short Name</em>' attribute.
   * @see #setShortName(String)
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecPackage#getViewpoint_ShortName()
   * @model
   * @generated
   */
  String getShortName();

  /**
   * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getShortName <em>Short Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Short Name</em>' attribute.
   * @see #getShortName()
   * @generated
   */
  void setShortName(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecPackage#getViewpoint_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecPackage#getViewpoint_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Parents</b></em>' reference list.
   * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parents</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parents</em>' reference list.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecPackage#getViewpoint_Parents()
   * @model
   * @generated
   */
  EList<Viewpoint> getParents();

  /**
   * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
   * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependencies</em>' reference list.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecPackage#getViewpoint_Dependencies()
   * @model
   * @generated
   */
  EList<Viewpoint> getDependencies();

  /**
   * Returns the value of the '<em><b>Use Viewpoint</b></em>' reference list.
   * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Use Viewpoint</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Use Viewpoint</em>' reference list.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecPackage#getViewpoint_UseViewpoint()
   * @model
   * @generated
   */
  EList<Viewpoint> getUseViewpoint();

  /**
   * Returns the value of the '<em><b>Use Any EMF Resource</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Use Any EMF Resource</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Use Any EMF Resource</em>' attribute list.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecPackage#getViewpoint_UseAnyEMFResource()
   * @model unique="false"
   * @generated
   */
  EList<String> getUseAnyEMFResource();

  /**
   * Returns the value of the '<em><b>Use Diagram Resource</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Use Diagram Resource</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Use Diagram Resource</em>' attribute list.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecPackage#getViewpoint_UseDiagramResource()
   * @model unique="false"
   * @generated
   */
  EList<String> getUseDiagramResource();

  /**
   * Returns the value of the '<em><b>Use Workspace Resource</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Use Workspace Resource</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Use Workspace Resource</em>' attribute list.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecPackage#getViewpoint_UseWorkspaceResource()
   * @model unique="false"
   * @generated
   */
  EList<String> getUseWorkspaceResource();

  /**
   * Returns the value of the '<em><b>Use FS Resource</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Use FS Resource</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Use FS Resource</em>' attribute list.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecPackage#getViewpoint_UseFSResource()
   * @model unique="false"
   * @generated
   */
  EList<String> getUseFSResource();

  /**
   * Returns the value of the '<em><b>VP Data</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>VP Data</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>VP Data</em>' reference.
   * @see #setVP_Data(Data)
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecPackage#getViewpoint_VP_Data()
   * @model
   * @generated
   */
  Data getVP_Data();

  /**
   * Sets the value of the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getVP_Data <em>VP Data</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>VP Data</em>' reference.
   * @see #getVP_Data()
   * @generated
   */
  void setVP_Data(Data value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute list.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecPackage#getViewpoint_Type()
   * @model unique="false"
   * @generated
   */
  EList<String> getType();

  /**
   * Returns the value of the '<em><b>VP Aspects</b></em>' reference list.
   * The list contents are of type {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>VP Aspects</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>VP Aspects</em>' reference list.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecPackage#getViewpoint_VP_Aspects()
   * @model
   * @generated
   */
  EList<Aspect> getVP_Aspects();

} // Viewpoint
