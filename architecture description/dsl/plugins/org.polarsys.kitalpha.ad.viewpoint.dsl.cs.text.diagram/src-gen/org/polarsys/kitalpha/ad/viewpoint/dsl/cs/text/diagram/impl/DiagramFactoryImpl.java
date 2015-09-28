/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.diagram.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramFactoryImpl extends EFactoryImpl implements DiagramFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DiagramFactory init()
  {
    try
    {
      DiagramFactory theDiagramFactory = (DiagramFactory)EPackage.Registry.INSTANCE.getEFactory(DiagramPackage.eNS_URI);
      if (theDiagramFactory != null)
      {
        return theDiagramFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DiagramFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiagramFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DiagramPackage.DIAGRAMS: return createDiagrams();
      case DiagramPackage.ABSTRACT_IMPORT: return createAbstractImport();
      case DiagramPackage.IMPORT_NAME_SPACE: return createImportNameSpace();
      case DiagramPackage.IMPORT_GROUP: return createImportGroup();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Diagrams createDiagrams()
  {
    DiagramsImpl diagrams = new DiagramsImpl();
    return diagrams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractImport createAbstractImport()
  {
    AbstractImportImpl abstractImport = new AbstractImportImpl();
    return abstractImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportNameSpace createImportNameSpace()
  {
    ImportNameSpaceImpl importNameSpace = new ImportNameSpaceImpl();
    return importNameSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportGroup createImportGroup()
  {
    ImportGroupImpl importGroup = new ImportGroupImpl();
    return importGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiagramPackage getDiagramPackage()
  {
    return (DiagramPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DiagramPackage getPackage()
  {
    return DiagramPackage.eINSTANCE;
  }

} //DiagramFactoryImpl
