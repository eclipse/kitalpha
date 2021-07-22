/**
 */
package TestModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see TestModel.TestModelFactory
 * @model kind="package"
 * @generated
 */
public interface TestModelPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "TestModel";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.example.org/TestModel";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "TestModel";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TestModelPackage eINSTANCE = TestModel.impl.TestModelPackageImpl.init();

    /**
     * The meta object id for the '{@link TestModel.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see TestModel.impl.EntityImpl
     * @see TestModel.impl.TestModelPackageImpl#getEntity()
     * @generated
     */
    int ENTITY = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__NAME = 0;

    /**
     * The feature id for the '<em><b>Age</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__AGE = 1;

    /**
     * The feature id for the '<em><b>Sex</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__SEX = 2;

    /**
     * The number of structural features of the '<em>Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link TestModel.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see TestModel.impl.PersonImpl
     * @see TestModel.impl.TestModelPackageImpl#getPerson()
     * @generated
     */
    int PERSON = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__NAME = ENTITY__NAME;

    /**
     * The feature id for the '<em><b>Age</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__AGE = ENTITY__AGE;

    /**
     * The feature id for the '<em><b>Sex</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__SEX = ENTITY__SEX;

    /**
     * The feature id for the '<em><b>Married</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__MARRIED = ENTITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Salary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__SALARY = ENTITY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Children</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__CHILDREN = ENTITY_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Friends</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__FRIENDS = ENTITY_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Person</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Person</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link TestModel.impl.ManImpl <em>Man</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see TestModel.impl.ManImpl
     * @see TestModel.impl.TestModelPackageImpl#getMan()
     * @generated
     */
    int MAN = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAN__NAME = PERSON__NAME;

    /**
     * The feature id for the '<em><b>Age</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAN__AGE = PERSON__AGE;

    /**
     * The feature id for the '<em><b>Sex</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAN__SEX = PERSON__SEX;

    /**
     * The feature id for the '<em><b>Married</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAN__MARRIED = PERSON__MARRIED;

    /**
     * The feature id for the '<em><b>Salary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAN__SALARY = PERSON__SALARY;

    /**
     * The feature id for the '<em><b>Children</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAN__CHILDREN = PERSON__CHILDREN;

    /**
     * The feature id for the '<em><b>Friends</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAN__FRIENDS = PERSON__FRIENDS;

    /**
     * The number of structural features of the '<em>Man</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAN_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Man</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAN_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link TestModel.impl.WomanImpl <em>Woman</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see TestModel.impl.WomanImpl
     * @see TestModel.impl.TestModelPackageImpl#getWoman()
     * @generated
     */
    int WOMAN = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WOMAN__NAME = PERSON__NAME;

    /**
     * The feature id for the '<em><b>Age</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WOMAN__AGE = PERSON__AGE;

    /**
     * The feature id for the '<em><b>Sex</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WOMAN__SEX = PERSON__SEX;

    /**
     * The feature id for the '<em><b>Married</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WOMAN__MARRIED = PERSON__MARRIED;

    /**
     * The feature id for the '<em><b>Salary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WOMAN__SALARY = PERSON__SALARY;

    /**
     * The feature id for the '<em><b>Children</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WOMAN__CHILDREN = PERSON__CHILDREN;

    /**
     * The feature id for the '<em><b>Friends</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WOMAN__FRIENDS = PERSON__FRIENDS;

    /**
     * The number of structural features of the '<em>Woman</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WOMAN_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Woman</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WOMAN_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link TestModel.impl.ElfImpl <em>Elf</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see TestModel.impl.ElfImpl
     * @see TestModel.impl.TestModelPackageImpl#getElf()
     * @generated
     */
    int ELF = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELF__NAME = ENTITY__NAME;

    /**
     * The feature id for the '<em><b>Age</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELF__AGE = ENTITY__AGE;

    /**
     * The feature id for the '<em><b>Sex</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELF__SEX = ENTITY__SEX;

    /**
     * The feature id for the '<em><b>Mana</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELF__MANA = ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Elf</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELF_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Elf</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELF_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link TestModel.Sex <em>Sex</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see TestModel.Sex
     * @see TestModel.impl.TestModelPackageImpl#getSex()
     * @generated
     */
    int SEX = 5;


    /**
     * Returns the meta object for class '{@link TestModel.Person <em>Person</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Person</em>'.
     * @see TestModel.Person
     * @generated
     */
    EClass getPerson();

    /**
     * Returns the meta object for the attribute '{@link TestModel.Person#isMarried <em>Married</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Married</em>'.
     * @see TestModel.Person#isMarried()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_Married();

    /**
     * Returns the meta object for the attribute '{@link TestModel.Person#getSalary <em>Salary</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Salary</em>'.
     * @see TestModel.Person#getSalary()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_Salary();

    /**
     * Returns the meta object for the reference list '{@link TestModel.Person#getChildren <em>Children</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Children</em>'.
     * @see TestModel.Person#getChildren()
     * @see #getPerson()
     * @generated
     */
    EReference getPerson_Children();

    /**
     * Returns the meta object for the reference list '{@link TestModel.Person#getFriends <em>Friends</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Friends</em>'.
     * @see TestModel.Person#getFriends()
     * @see #getPerson()
     * @generated
     */
    EReference getPerson_Friends();

    /**
     * Returns the meta object for class '{@link TestModel.Man <em>Man</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Man</em>'.
     * @see TestModel.Man
     * @generated
     */
    EClass getMan();

    /**
     * Returns the meta object for class '{@link TestModel.Woman <em>Woman</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Woman</em>'.
     * @see TestModel.Woman
     * @generated
     */
    EClass getWoman();

    /**
     * Returns the meta object for class '{@link TestModel.Entity <em>Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity</em>'.
     * @see TestModel.Entity
     * @generated
     */
    EClass getEntity();

    /**
     * Returns the meta object for the attribute '{@link TestModel.Entity#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see TestModel.Entity#getName()
     * @see #getEntity()
     * @generated
     */
    EAttribute getEntity_Name();

    /**
     * Returns the meta object for the attribute '{@link TestModel.Entity#getAge <em>Age</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Age</em>'.
     * @see TestModel.Entity#getAge()
     * @see #getEntity()
     * @generated
     */
    EAttribute getEntity_Age();

    /**
     * Returns the meta object for the attribute '{@link TestModel.Entity#getSex <em>Sex</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sex</em>'.
     * @see TestModel.Entity#getSex()
     * @see #getEntity()
     * @generated
     */
    EAttribute getEntity_Sex();

    /**
     * Returns the meta object for class '{@link TestModel.Elf <em>Elf</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Elf</em>'.
     * @see TestModel.Elf
     * @generated
     */
    EClass getElf();

    /**
     * Returns the meta object for the attribute '{@link TestModel.Elf#getMana <em>Mana</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mana</em>'.
     * @see TestModel.Elf#getMana()
     * @see #getElf()
     * @generated
     */
    EAttribute getElf_Mana();

    /**
     * Returns the meta object for enum '{@link TestModel.Sex <em>Sex</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Sex</em>'.
     * @see TestModel.Sex
     * @generated
     */
    EEnum getSex();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TestModelFactory getTestModelFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link TestModel.impl.PersonImpl <em>Person</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see TestModel.impl.PersonImpl
         * @see TestModel.impl.TestModelPackageImpl#getPerson()
         * @generated
         */
        EClass PERSON = eINSTANCE.getPerson();

        /**
         * The meta object literal for the '<em><b>Married</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSON__MARRIED = eINSTANCE.getPerson_Married();

        /**
         * The meta object literal for the '<em><b>Salary</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSON__SALARY = eINSTANCE.getPerson_Salary();

        /**
         * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PERSON__CHILDREN = eINSTANCE.getPerson_Children();

        /**
         * The meta object literal for the '<em><b>Friends</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PERSON__FRIENDS = eINSTANCE.getPerson_Friends();

        /**
         * The meta object literal for the '{@link TestModel.impl.ManImpl <em>Man</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see TestModel.impl.ManImpl
         * @see TestModel.impl.TestModelPackageImpl#getMan()
         * @generated
         */
        EClass MAN = eINSTANCE.getMan();

        /**
         * The meta object literal for the '{@link TestModel.impl.WomanImpl <em>Woman</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see TestModel.impl.WomanImpl
         * @see TestModel.impl.TestModelPackageImpl#getWoman()
         * @generated
         */
        EClass WOMAN = eINSTANCE.getWoman();

        /**
         * The meta object literal for the '{@link TestModel.impl.EntityImpl <em>Entity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see TestModel.impl.EntityImpl
         * @see TestModel.impl.TestModelPackageImpl#getEntity()
         * @generated
         */
        EClass ENTITY = eINSTANCE.getEntity();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

        /**
         * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENTITY__AGE = eINSTANCE.getEntity_Age();

        /**
         * The meta object literal for the '<em><b>Sex</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENTITY__SEX = eINSTANCE.getEntity_Sex();

        /**
         * The meta object literal for the '{@link TestModel.impl.ElfImpl <em>Elf</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see TestModel.impl.ElfImpl
         * @see TestModel.impl.TestModelPackageImpl#getElf()
         * @generated
         */
        EClass ELF = eINSTANCE.getElf();

        /**
         * The meta object literal for the '<em><b>Mana</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELF__MANA = eINSTANCE.getElf_Mana();

        /**
         * The meta object literal for the '{@link TestModel.Sex <em>Sex</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see TestModel.Sex
         * @see TestModel.impl.TestModelPackageImpl#getSex()
         * @generated
         */
        EEnum SEX = eINSTANCE.getSex();

    }

} //TestModelPackage
