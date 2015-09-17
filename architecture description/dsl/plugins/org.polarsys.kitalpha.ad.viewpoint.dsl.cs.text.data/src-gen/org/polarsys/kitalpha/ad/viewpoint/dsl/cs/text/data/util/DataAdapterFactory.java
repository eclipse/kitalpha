/**
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.AbstractImport;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataSpec;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.Import;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.ImportNamespace;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.ImportURI;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataPackage
 * @generated
 */
public class DataAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DataPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DataPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataSwitch<Adapter> modelSwitch =
    new DataSwitch<Adapter>()
    {
      @Override
      public Adapter caseDataSpec(DataSpec object)
      {
        return createDataSpecAdapter();
      }
      @Override
      public Adapter caseAbstractImport(AbstractImport object)
      {
        return createAbstractImportAdapter();
      }
      @Override
      public Adapter caseImportNamespace(ImportNamespace object)
      {
        return createImportNamespaceAdapter();
      }
      @Override
      public Adapter caseImportURI(ImportURI object)
      {
        return createImportURIAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataSpec <em>Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataSpec
   * @generated
   */
  public Adapter createDataSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.AbstractImport <em>Abstract Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.AbstractImport
   * @generated
   */
  public Adapter createAbstractImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.ImportNamespace <em>Import Namespace</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.ImportNamespace
   * @generated
   */
  public Adapter createImportNamespaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.ImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.ImportURI
   * @generated
   */
  public Adapter createImportURIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DataAdapterFactory
