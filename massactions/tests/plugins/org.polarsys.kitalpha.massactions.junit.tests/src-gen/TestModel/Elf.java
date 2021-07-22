/**
 */
package TestModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestModel.Elf#getMana <em>Mana</em>}</li>
 * </ul>
 *
 * @see TestModel.TestModelPackage#getElf()
 * @model
 * @generated
 */
public interface Elf extends Entity {
    /**
     * Returns the value of the '<em><b>Mana</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mana</em>' attribute.
     * @see #setMana(float)
     * @see TestModel.TestModelPackage#getElf_Mana()
     * @model
     * @generated
     */
    float getMana();

    /**
     * Sets the value of the '{@link TestModel.Elf#getMana <em>Mana</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mana</em>' attribute.
     * @see #getMana()
     * @generated
     */
    void setMana(float value);

} // Elf
