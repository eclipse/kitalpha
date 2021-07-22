/**
 */
package TestModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see TestModel.TestModelPackage
 * @generated
 */
public interface TestModelFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TestModelFactory eINSTANCE = TestModel.impl.TestModelFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Man</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Man</em>'.
     * @generated
     */
    Man createMan();

    /**
     * Returns a new object of class '<em>Woman</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Woman</em>'.
     * @generated
     */
    Woman createWoman();

    /**
     * Returns a new object of class '<em>Elf</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Elf</em>'.
     * @generated
     */
    Elf createElf();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    TestModelPackage getTestModelPackage();

} //TestModelFactory
