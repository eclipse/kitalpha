/**
 */
package TestModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestModel.Person#isMarried <em>Married</em>}</li>
 *   <li>{@link TestModel.Person#getSalary <em>Salary</em>}</li>
 *   <li>{@link TestModel.Person#getChildren <em>Children</em>}</li>
 *   <li>{@link TestModel.Person#getFriends <em>Friends</em>}</li>
 * </ul>
 *
 * @see TestModel.TestModelPackage#getPerson()
 * @model abstract="true"
 * @generated
 */
public interface Person extends Entity {
    /**
     * Returns the value of the '<em><b>Married</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Married</em>' attribute.
     * @see #setMarried(boolean)
     * @see TestModel.TestModelPackage#getPerson_Married()
     * @model
     * @generated
     */
    boolean isMarried();

    /**
     * Sets the value of the '{@link TestModel.Person#isMarried <em>Married</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Married</em>' attribute.
     * @see #isMarried()
     * @generated
     */
    void setMarried(boolean value);

    /**
     * Returns the value of the '<em><b>Salary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Salary</em>' attribute.
     * @see #setSalary(double)
     * @see TestModel.TestModelPackage#getPerson_Salary()
     * @model
     * @generated
     */
    double getSalary();

    /**
     * Sets the value of the '{@link TestModel.Person#getSalary <em>Salary</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Salary</em>' attribute.
     * @see #getSalary()
     * @generated
     */
    void setSalary(double value);

    /**
     * Returns the value of the '<em><b>Children</b></em>' reference list.
     * The list contents are of type {@link TestModel.Person}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Children</em>' reference list.
     * @see TestModel.TestModelPackage#getPerson_Children()
     * @model
     * @generated
     */
    EList<Person> getChildren();

    /**
     * Returns the value of the '<em><b>Friends</b></em>' reference list.
     * The list contents are of type {@link TestModel.Person}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Friends</em>' reference list.
     * @see TestModel.TestModelPackage#getPerson_Friends()
     * @model
     * @generated
     */
    EList<Person> getFriends();

} // Person
