/**
 */
package TestModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestModel.Entity#getName <em>Name</em>}</li>
 *   <li>{@link TestModel.Entity#getAge <em>Age</em>}</li>
 *   <li>{@link TestModel.Entity#getSex <em>Sex</em>}</li>
 * </ul>
 *
 * @see TestModel.TestModelPackage#getEntity()
 * @model abstract="true"
 * @generated
 */
public interface Entity extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see TestModel.TestModelPackage#getEntity_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link TestModel.Entity#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Age</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Age</em>' attribute.
     * @see #setAge(int)
     * @see TestModel.TestModelPackage#getEntity_Age()
     * @model
     * @generated
     */
    int getAge();

    /**
     * Sets the value of the '{@link TestModel.Entity#getAge <em>Age</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Age</em>' attribute.
     * @see #getAge()
     * @generated
     */
    void setAge(int value);

    /**
     * Returns the value of the '<em><b>Sex</b></em>' attribute.
     * The default value is <code>"Unknown"</code>.
     * The literals are from the enumeration {@link TestModel.Sex}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sex</em>' attribute.
     * @see TestModel.Sex
     * @see #setSex(Sex)
     * @see TestModel.TestModelPackage#getEntity_Sex()
     * @model default="Unknown"
     * @generated
     */
    Sex getSex();

    /**
     * Sets the value of the '{@link TestModel.Entity#getSex <em>Sex</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sex</em>' attribute.
     * @see TestModel.Sex
     * @see #getSex()
     * @generated
     */
    void setSex(Sex value);

} // Entity
