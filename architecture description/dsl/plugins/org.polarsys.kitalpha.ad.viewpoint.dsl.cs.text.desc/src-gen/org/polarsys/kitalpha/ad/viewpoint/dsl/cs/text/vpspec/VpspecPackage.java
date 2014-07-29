/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecFactory
 * @model kind="package"
 * @generated
 */
public interface VpspecPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "vpspec";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/cs/text/vpspec/1.0.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "vpspec";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VpspecPackage eINSTANCE = org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.impl.VpspecPackageImpl.init();

  /**
   * The meta object id for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.impl.ViewpointImpl <em>Viewpoint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.impl.ViewpointImpl
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.impl.VpspecPackageImpl#getViewpoint()
   * @generated
   */
  int VIEWPOINT = 0;

  /**
   * The feature id for the '<em><b>Short Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__SHORT_NAME = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__NAME = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Parents</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__PARENTS = 3;

  /**
   * The feature id for the '<em><b>Dependencies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__DEPENDENCIES = 4;

  /**
   * The feature id for the '<em><b>Use Viewpoint</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__USE_VIEWPOINT = 5;

  /**
   * The feature id for the '<em><b>Use Ecore Resource</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__USE_ECORE_RESOURCE = 6;

  /**
   * The feature id for the '<em><b>Use Resource</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__USE_RESOURCE = 7;

  /**
   * The feature id for the '<em><b>Use Diagram Resource</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__USE_DIAGRAM_RESOURCE = 8;

  /**
   * The feature id for the '<em><b>Use EMF Resource</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__USE_EMF_RESOURCE = 9;

  /**
   * The feature id for the '<em><b>VP Data</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__VP_DATA = 10;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__TYPE = 11;

  /**
   * The feature id for the '<em><b>VP Aspects</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT__VP_ASPECTS = 12;

  /**
   * The number of structural features of the '<em>Viewpoint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWPOINT_FEATURE_COUNT = 13;


  /**
   * Returns the meta object for class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint <em>Viewpoint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Viewpoint</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint
   * @generated
   */
  EClass getViewpoint();

  /**
   * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getShortName <em>Short Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Short Name</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getShortName()
   * @see #getViewpoint()
   * @generated
   */
  EAttribute getViewpoint_ShortName();

  /**
   * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getName()
   * @see #getViewpoint()
   * @generated
   */
  EAttribute getViewpoint_Name();

  /**
   * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getDescription()
   * @see #getViewpoint()
   * @generated
   */
  EAttribute getViewpoint_Description();

  /**
   * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getParents <em>Parents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Parents</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getParents()
   * @see #getViewpoint()
   * @generated
   */
  EReference getViewpoint_Parents();

  /**
   * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getDependencies <em>Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Dependencies</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getDependencies()
   * @see #getViewpoint()
   * @generated
   */
  EReference getViewpoint_Dependencies();

  /**
   * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getUseViewpoint <em>Use Viewpoint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Use Viewpoint</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getUseViewpoint()
   * @see #getViewpoint()
   * @generated
   */
  EReference getViewpoint_UseViewpoint();

  /**
   * Returns the meta object for the attribute list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getUseEcoreResource <em>Use Ecore Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Use Ecore Resource</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getUseEcoreResource()
   * @see #getViewpoint()
   * @generated
   */
  EAttribute getViewpoint_UseEcoreResource();

  /**
   * Returns the meta object for the attribute list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getUseResource <em>Use Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Use Resource</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getUseResource()
   * @see #getViewpoint()
   * @generated
   */
  EAttribute getViewpoint_UseResource();

  /**
   * Returns the meta object for the attribute list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getUseDiagramResource <em>Use Diagram Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Use Diagram Resource</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getUseDiagramResource()
   * @see #getViewpoint()
   * @generated
   */
  EAttribute getViewpoint_UseDiagramResource();

  /**
   * Returns the meta object for the attribute list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getUseEMFResource <em>Use EMF Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Use EMF Resource</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getUseEMFResource()
   * @see #getViewpoint()
   * @generated
   */
  EAttribute getViewpoint_UseEMFResource();

  /**
   * Returns the meta object for the reference '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getVP_Data <em>VP Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>VP Data</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getVP_Data()
   * @see #getViewpoint()
   * @generated
   */
  EReference getViewpoint_VP_Data();

  /**
   * Returns the meta object for the attribute list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getType()
   * @see #getViewpoint()
   * @generated
   */
  EAttribute getViewpoint_Type();

  /**
   * Returns the meta object for the reference list '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getVP_Aspects <em>VP Aspects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>VP Aspects</em>'.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint#getVP_Aspects()
   * @see #getViewpoint()
   * @generated
   */
  EReference getViewpoint_VP_Aspects();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  VpspecFactory getVpspecFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.impl.ViewpointImpl <em>Viewpoint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.impl.ViewpointImpl
     * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.impl.VpspecPackageImpl#getViewpoint()
     * @generated
     */
    EClass VIEWPOINT = eINSTANCE.getViewpoint();

    /**
     * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEWPOINT__SHORT_NAME = eINSTANCE.getViewpoint_ShortName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEWPOINT__NAME = eINSTANCE.getViewpoint_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEWPOINT__DESCRIPTION = eINSTANCE.getViewpoint_Description();

    /**
     * The meta object literal for the '<em><b>Parents</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEWPOINT__PARENTS = eINSTANCE.getViewpoint_Parents();

    /**
     * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEWPOINT__DEPENDENCIES = eINSTANCE.getViewpoint_Dependencies();

    /**
     * The meta object literal for the '<em><b>Use Viewpoint</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEWPOINT__USE_VIEWPOINT = eINSTANCE.getViewpoint_UseViewpoint();

    /**
     * The meta object literal for the '<em><b>Use Ecore Resource</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEWPOINT__USE_ECORE_RESOURCE = eINSTANCE.getViewpoint_UseEcoreResource();

    /**
     * The meta object literal for the '<em><b>Use Resource</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEWPOINT__USE_RESOURCE = eINSTANCE.getViewpoint_UseResource();

    /**
     * The meta object literal for the '<em><b>Use Diagram Resource</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEWPOINT__USE_DIAGRAM_RESOURCE = eINSTANCE.getViewpoint_UseDiagramResource();

    /**
     * The meta object literal for the '<em><b>Use EMF Resource</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEWPOINT__USE_EMF_RESOURCE = eINSTANCE.getViewpoint_UseEMFResource();

    /**
     * The meta object literal for the '<em><b>VP Data</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEWPOINT__VP_DATA = eINSTANCE.getViewpoint_VP_Data();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEWPOINT__TYPE = eINSTANCE.getViewpoint_Type();

    /**
     * The meta object literal for the '<em><b>VP Aspects</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEWPOINT__VP_ASPECTS = eINSTANCE.getViewpoint_VP_Aspects();

  }

} //VpspecPackage
