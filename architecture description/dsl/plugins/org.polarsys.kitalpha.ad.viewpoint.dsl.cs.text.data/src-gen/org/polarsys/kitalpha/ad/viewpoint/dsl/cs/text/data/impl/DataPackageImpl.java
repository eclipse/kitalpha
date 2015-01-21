/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.AbstractImport;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataSpec;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.Import;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.ImportNamespace;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.ImportURI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataPackageImpl extends EPackageImpl implements DataPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractImportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importNamespaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importURIEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

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
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DataPackageImpl()
  {
    super(eNS_URI, DataFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link DataPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DataPackage init()
  {
    if (isInited) return (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

    // Obtain or create and register package
    DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    VpdescPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theDataPackage.createPackageContents();

    // Initialize created meta-data
    theDataPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDataPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DataPackage.eNS_URI, theDataPackage);
    return theDataPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataSpec()
  {
    return dataSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataSpec_Imports()
  {
    return (EReference)dataSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataSpec_Data()
  {
    return (EReference)dataSpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractImport()
  {
    return abstractImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportNamespace()
  {
    return importNamespaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportNamespace_ImportedNamespace()
  {
    return (EAttribute)importNamespaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportURI()
  {
    return importURIEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportURI_ImportURI()
  {
    return (EAttribute)importURIEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataFactory getDataFactory()
  {
    return (DataFactory)getEFactoryInstance();
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
    dataSpecEClass = createEClass(DATA_SPEC);
    createEReference(dataSpecEClass, DATA_SPEC__IMPORTS);
    createEReference(dataSpecEClass, DATA_SPEC__DATA);

    abstractImportEClass = createEClass(ABSTRACT_IMPORT);

    importNamespaceEClass = createEClass(IMPORT_NAMESPACE);
    createEAttribute(importNamespaceEClass, IMPORT_NAMESPACE__IMPORTED_NAMESPACE);

    importURIEClass = createEClass(IMPORT_URI);
    createEAttribute(importURIEClass, IMPORT_URI__IMPORT_URI);

    importEClass = createEClass(IMPORT);
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
    VpdescPackage theVpdescPackage = (VpdescPackage)EPackage.Registry.INSTANCE.getEPackage(VpdescPackage.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    abstractImportEClass.getESuperTypes().add(this.getImport());
    importNamespaceEClass.getESuperTypes().add(this.getAbstractImport());
    importURIEClass.getESuperTypes().add(this.getAbstractImport());

    // Initialize classes and features; add operations and parameters
    initEClass(dataSpecEClass, DataSpec.class, "DataSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataSpec_Imports(), this.getImport(), null, "imports", null, 0, -1, DataSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataSpec_Data(), theVpdescPackage.getData(), null, "data", null, 0, 1, DataSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractImportEClass, AbstractImport.class, "AbstractImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importNamespaceEClass, ImportNamespace.class, "ImportNamespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportNamespace_ImportedNamespace(), theEcorePackage.getEString(), "importedNamespace", null, 0, 1, ImportNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importURIEClass, ImportURI.class, "ImportURI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportURI_ImportURI(), theEcorePackage.getEString(), "importURI", null, 0, 1, ImportURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //DataPackageImpl
