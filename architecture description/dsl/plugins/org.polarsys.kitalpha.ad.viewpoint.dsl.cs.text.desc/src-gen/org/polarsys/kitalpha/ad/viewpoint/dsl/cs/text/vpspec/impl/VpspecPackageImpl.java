/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VpspecPackageImpl extends EPackageImpl implements VpspecPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewpointEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private VpspecPackageImpl()
  {
    super(eNS_URI, VpspecFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link VpspecPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static VpspecPackage init()
  {
    if (isInited) return (VpspecPackage)EPackage.Registry.INSTANCE.getEPackage(VpspecPackage.eNS_URI);

    // Obtain or create and register package
    VpspecPackageImpl theVpspecPackage = (VpspecPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VpspecPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VpspecPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    VpdescPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theVpspecPackage.createPackageContents();

    // Initialize created meta-data
    theVpspecPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theVpspecPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(VpspecPackage.eNS_URI, theVpspecPackage);
    return theVpspecPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewpoint()
  {
    return viewpointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewpoint_ShortName()
  {
    return (EAttribute)viewpointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewpoint_Name()
  {
    return (EAttribute)viewpointEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewpoint_Description()
  {
    return (EAttribute)viewpointEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewpoint_Parents()
  {
    return (EReference)viewpointEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewpoint_Dependencies()
  {
    return (EReference)viewpointEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewpoint_UseViewpoint()
  {
    return (EReference)viewpointEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewpoint_UseAnyEMFResource()
  {
    return (EAttribute)viewpointEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewpoint_UseDiagramResource()
  {
    return (EAttribute)viewpointEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewpoint_UseWorkspaceResource()
  {
    return (EAttribute)viewpointEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewpoint_UseFSResource()
  {
    return (EAttribute)viewpointEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewpoint_VP_Data()
  {
    return (EReference)viewpointEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewpoint_Type()
  {
    return (EAttribute)viewpointEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewpoint_VP_Aspects()
  {
    return (EReference)viewpointEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VpspecFactory getVpspecFactory()
  {
    return (VpspecFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    viewpointEClass = createEClass(VIEWPOINT);
    createEAttribute(viewpointEClass, VIEWPOINT__SHORT_NAME);
    createEAttribute(viewpointEClass, VIEWPOINT__NAME);
    createEAttribute(viewpointEClass, VIEWPOINT__DESCRIPTION);
    createEReference(viewpointEClass, VIEWPOINT__PARENTS);
    createEReference(viewpointEClass, VIEWPOINT__DEPENDENCIES);
    createEReference(viewpointEClass, VIEWPOINT__USE_VIEWPOINT);
    createEAttribute(viewpointEClass, VIEWPOINT__USE_ANY_EMF_RESOURCE);
    createEAttribute(viewpointEClass, VIEWPOINT__USE_DIAGRAM_RESOURCE);
    createEAttribute(viewpointEClass, VIEWPOINT__USE_WORKSPACE_RESOURCE);
    createEAttribute(viewpointEClass, VIEWPOINT__USE_FS_RESOURCE);
    createEReference(viewpointEClass, VIEWPOINT__VP_DATA);
    createEAttribute(viewpointEClass, VIEWPOINT__TYPE);
    createEReference(viewpointEClass, VIEWPOINT__VP_ASPECTS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
    VpdescPackage theVpdescPackage = (VpdescPackage)EPackage.Registry.INSTANCE.getEPackage(VpdescPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(viewpointEClass, Viewpoint.class, "Viewpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getViewpoint_ShortName(), theEcorePackage.getEString(), "shortName", null, 0, 1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getViewpoint_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getViewpoint_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getViewpoint_Parents(), this.getViewpoint(), null, "parents", null, 0, -1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getViewpoint_Dependencies(), this.getViewpoint(), null, "dependencies", null, 0, -1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getViewpoint_UseViewpoint(), this.getViewpoint(), null, "useViewpoint", null, 0, -1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getViewpoint_UseAnyEMFResource(), theEcorePackage.getEString(), "useAnyEMFResource", null, 0, -1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getViewpoint_UseDiagramResource(), theEcorePackage.getEString(), "useDiagramResource", null, 0, -1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getViewpoint_UseWorkspaceResource(), theEcorePackage.getEString(), "useWorkspaceResource", null, 0, -1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getViewpoint_UseFSResource(), theEcorePackage.getEString(), "useFSResource", null, 0, -1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getViewpoint_VP_Data(), theVpdescPackage.getData(), null, "VP_Data", null, 0, 1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getViewpoint_Type(), theEcorePackage.getEString(), "type", null, 0, -1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getViewpoint_VP_Aspects(), theVpdescPackage.getAspect(), null, "VP_Aspects", null, 0, -1, Viewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //VpspecPackageImpl
