/**
 */
package TestModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sex</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see TestModel.TestModelPackage#getSex()
 * @model
 * @generated
 */
public enum Sex implements Enumerator {
    /**
     * The '<em><b>Male</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MALE_VALUE
     * @generated
     * @ordered
     */
    MALE(0, "Male", "Male"),

    /**
     * The '<em><b>Female</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FEMALE_VALUE
     * @generated
     * @ordered
     */
    FEMALE(1, "Female", "Female"),

    /**
     * The '<em><b>Unknown</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNKNOWN_VALUE
     * @generated
     * @ordered
     */
    UNKNOWN(2, "Unknown", "Unknown");

    /**
     * The '<em><b>Male</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MALE
     * @model name="Male"
     * @generated
     * @ordered
     */
    public static final int MALE_VALUE = 0;

    /**
     * The '<em><b>Female</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FEMALE
     * @model name="Female"
     * @generated
     * @ordered
     */
    public static final int FEMALE_VALUE = 1;

    /**
     * The '<em><b>Unknown</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNKNOWN
     * @model name="Unknown"
     * @generated
     * @ordered
     */
    public static final int UNKNOWN_VALUE = 2;

    /**
     * An array of all the '<em><b>Sex</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final Sex[] VALUES_ARRAY =
        new Sex[] {
            MALE,
            FEMALE,
            UNKNOWN,
        };

    /**
     * A public read-only list of all the '<em><b>Sex</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<Sex> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Sex</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static Sex get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            Sex result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Sex</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static Sex getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            Sex result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Sex</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static Sex get(int value) {
        switch (value) {
            case MALE_VALUE: return MALE;
            case FEMALE_VALUE: return FEMALE;
            case UNKNOWN_VALUE: return UNKNOWN;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private Sex(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }
    
} //Sex
