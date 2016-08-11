
package org.polarsys.kitalpha.example.tags.tags.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.kitalpha.example.tags.tags.AbstractNamedEntity;
import org.polarsys.kitalpha.example.tags.tags.AbstractTagEntity;
import org.polarsys.kitalpha.example.tags.tags.Color;
import org.polarsys.kitalpha.example.tags.tags.History;
import org.polarsys.kitalpha.example.tags.tags.Kind;
import org.polarsys.kitalpha.example.tags.tags.Status;
import org.polarsys.kitalpha.example.tags.tags.Tag;
import org.polarsys.kitalpha.example.tags.tags.TagDefinitionModel;
import org.polarsys.kitalpha.example.tags.tags.TagsFactory;
import org.polarsys.kitalpha.example.tags.tags.TagsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TagsPackageImpl extends EPackageImpl implements TagsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTagEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNamedEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagDefinitionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorEEnum = null;

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
	 * @see org.polarsys.kitalpha.example.tags.tags.TagsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TagsPackageImpl() {
		super(eNS_URI, TagsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TagsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TagsPackage init() {
		if (isInited)
			return (TagsPackage) EPackage.Registry.INSTANCE.getEPackage(TagsPackage.eNS_URI);

		// Obtain or create and register package
		TagsPackageImpl theTagsPackage = (TagsPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof TagsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new TagsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTagsPackage.createPackageContents();

		// Initialize created meta-data
		theTagsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTagsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TagsPackage.eNS_URI, theTagsPackage);
		return theTagsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTagEntity() {
		return abstractTagEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTagEntity_Id() {
		return (EAttribute) abstractTagEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNamedEntity() {
		return abstractNamedEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNamedEntity_Name() {
		return (EAttribute) abstractNamedEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagDefinitionModel() {
		return tagDefinitionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagDefinitionModel_OwnedStatuses() {
		return (EReference) tagDefinitionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagDefinitionModel_OwnedKinds() {
		return (EReference) tagDefinitionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTagDefinitionModel_Description() {
		return (EAttribute) tagDefinitionModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTag_Status() {
		return (EReference) tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTag_StatusHistory() {
		return (EReference) tagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatus() {
		return statusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatus_Kind() {
		return (EReference) statusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatus_Icone() {
		return (EAttribute) statusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatus_Color() {
		return (EAttribute) statusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKind() {
		return kindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistory() {
		return historyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistory_OldStatus() {
		return (EReference) historyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistory_ChangeDate() {
		return (EAttribute) historyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistory_User() {
		return (EAttribute) historyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistory_ChangeComment() {
		return (EAttribute) historyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColor() {
		return colorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagsFactory getTagsFactory() {
		return (TagsFactory) getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		abstractTagEntityEClass = createEClass(ABSTRACT_TAG_ENTITY);
		createEAttribute(abstractTagEntityEClass, ABSTRACT_TAG_ENTITY__ID);

		abstractNamedEntityEClass = createEClass(ABSTRACT_NAMED_ENTITY);
		createEAttribute(abstractNamedEntityEClass, ABSTRACT_NAMED_ENTITY__NAME);

		tagDefinitionModelEClass = createEClass(TAG_DEFINITION_MODEL);
		createEReference(tagDefinitionModelEClass, TAG_DEFINITION_MODEL__OWNED_STATUSES);
		createEReference(tagDefinitionModelEClass, TAG_DEFINITION_MODEL__OWNED_KINDS);
		createEAttribute(tagDefinitionModelEClass, TAG_DEFINITION_MODEL__DESCRIPTION);

		tagEClass = createEClass(TAG);
		createEReference(tagEClass, TAG__STATUS);
		createEReference(tagEClass, TAG__STATUS_HISTORY);

		statusEClass = createEClass(STATUS);
		createEReference(statusEClass, STATUS__KIND);
		createEAttribute(statusEClass, STATUS__ICONE);
		createEAttribute(statusEClass, STATUS__COLOR);

		kindEClass = createEClass(KIND);

		historyEClass = createEClass(HISTORY);
		createEReference(historyEClass, HISTORY__OLD_STATUS);
		createEAttribute(historyEClass, HISTORY__CHANGE_DATE);
		createEAttribute(historyEClass, HISTORY__USER);
		createEAttribute(historyEClass, HISTORY__CHANGE_COMMENT);

		// Create enums
		colorEEnum = createEEnum(COLOR);
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
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractNamedEntityEClass.getESuperTypes().add(this.getAbstractTagEntity());
		tagDefinitionModelEClass.getESuperTypes().add(this.getAbstractNamedEntity());
		tagEClass.getESuperTypes().add(this.getAbstractTagEntity());
		statusEClass.getESuperTypes().add(this.getAbstractNamedEntity());
		kindEClass.getESuperTypes().add(this.getAbstractNamedEntity());
		historyEClass.getESuperTypes().add(this.getAbstractTagEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractTagEntityEClass, AbstractTagEntity.class, "AbstractTagEntity", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractTagEntity_Id(), ecorePackage.getEString(), "id", null, 0, 1, AbstractTagEntity.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractNamedEntityEClass, AbstractNamedEntity.class, "AbstractNamedEntity", IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractNamedEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, //$NON-NLS-1$
				AbstractNamedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagDefinitionModelEClass, TagDefinitionModel.class, "TagDefinitionModel", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTagDefinitionModel_OwnedStatuses(), this.getStatus(), null, "ownedStatuses", null, 0, -1, //$NON-NLS-1$
				TagDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTagDefinitionModel_OwnedKinds(), this.getKind(), null, "ownedKinds", null, 0, -1, //$NON-NLS-1$
				TagDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTagDefinitionModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, //$NON-NLS-1$
				TagDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTag_Status(), this.getStatus(), null, "status", null, 0, 1, Tag.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTag_StatusHistory(), this.getHistory(), null, "statusHistory", null, 0, -1, Tag.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusEClass, Status.class, "Status", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getStatus_Kind(), this.getKind(), null, "kind", null, 0, 1, Status.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getStatus_Icone(), ecorePackage.getEString(), "icone", null, 0, 1, Status.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatus_Color(), this.getColor(), "color", null, 0, 1, Status.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kindEClass, Kind.class, "Kind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(historyEClass, History.class, "History", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getHistory_OldStatus(), this.getStatus(), null, "oldStatus", null, 0, 1, History.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistory_ChangeDate(), ecorePackage.getEDate(), "changeDate", null, 0, 1, History.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistory_User(), ecorePackage.getEString(), "user", null, 0, 1, History.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistory_ChangeComment(), ecorePackage.getEString(), "changeComment", null, 0, 1, //$NON-NLS-1$
				History.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(colorEEnum, Color.class, "Color"); //$NON-NLS-1$
		addEEnumLiteral(colorEEnum, Color.WHITE);
		addEEnumLiteral(colorEEnum, Color.BLACK);
		addEEnumLiteral(colorEEnum, Color.BLUE);
		addEEnumLiteral(colorEEnum, Color.RED);
		addEEnumLiteral(colorEEnum, Color.GREEN);
		addEEnumLiteral(colorEEnum, Color.YELLOW);
		addEEnumLiteral(colorEEnum, Color.OTHER);

		// Create resource
		createResource(eNS_URI);
	}

} //TagsPackageImpl
