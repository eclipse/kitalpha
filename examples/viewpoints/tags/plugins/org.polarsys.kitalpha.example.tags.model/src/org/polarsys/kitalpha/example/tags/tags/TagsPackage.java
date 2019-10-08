
package org.polarsys.kitalpha.example.tags.tags;

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
 * @see org.polarsys.kitalpha.example.tags.tags.TagsFactory
 * @model kind="package"
 * @generated
 */
public interface TagsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tags"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/kitalpha/example/tags/1.0.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tags"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TagsPackage eINSTANCE = org.polarsys.kitalpha.example.tags.tags.impl.TagsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.example.tags.tags.impl.AbstractTagEntityImpl <em>Abstract Tag Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.example.tags.tags.impl.AbstractTagEntityImpl
	 * @see org.polarsys.kitalpha.example.tags.tags.impl.TagsPackageImpl#getAbstractTagEntity()
	 * @generated
	 */
	int ABSTRACT_TAG_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TAG_ENTITY__ID = 0;

	/**
	 * The number of structural features of the '<em>Abstract Tag Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TAG_ENTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Tag Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TAG_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.example.tags.tags.impl.AbstractNamedEntityImpl <em>Abstract Named Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.example.tags.tags.impl.AbstractNamedEntityImpl
	 * @see org.polarsys.kitalpha.example.tags.tags.impl.TagsPackageImpl#getAbstractNamedEntity()
	 * @generated
	 */
	int ABSTRACT_NAMED_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_ENTITY__ID = ABSTRACT_TAG_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_ENTITY__NAME = ABSTRACT_TAG_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Named Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_ENTITY_FEATURE_COUNT = ABSTRACT_TAG_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Named Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_ENTITY_OPERATION_COUNT = ABSTRACT_TAG_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.example.tags.tags.impl.TagDefinitionModelImpl <em>Tag Definition Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.example.tags.tags.impl.TagDefinitionModelImpl
	 * @see org.polarsys.kitalpha.example.tags.tags.impl.TagsPackageImpl#getTagDefinitionModel()
	 * @generated
	 */
	int TAG_DEFINITION_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_DEFINITION_MODEL__ID = ABSTRACT_NAMED_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_DEFINITION_MODEL__NAME = ABSTRACT_NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Owned Statuses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_DEFINITION_MODEL__OWNED_STATUSES = ABSTRACT_NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Kinds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_DEFINITION_MODEL__OWNED_KINDS = ABSTRACT_NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_DEFINITION_MODEL__DESCRIPTION = ABSTRACT_NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tag Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_DEFINITION_MODEL_FEATURE_COUNT = ABSTRACT_NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tag Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_DEFINITION_MODEL_OPERATION_COUNT = ABSTRACT_NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.example.tags.tags.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.example.tags.tags.impl.TagImpl
	 * @see org.polarsys.kitalpha.example.tags.tags.impl.TagsPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__ID = ABSTRACT_TAG_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__STATUS = ABSTRACT_TAG_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__STATUS_HISTORY = ABSTRACT_TAG_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = ABSTRACT_TAG_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = ABSTRACT_TAG_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.example.tags.tags.impl.StatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.example.tags.tags.impl.StatusImpl
	 * @see org.polarsys.kitalpha.example.tags.tags.impl.TagsPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__ID = ABSTRACT_NAMED_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__NAME = ABSTRACT_NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__KIND = ABSTRACT_NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__ICONE = ABSTRACT_NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__COLOR = ABSTRACT_NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_FEATURE_COUNT = ABSTRACT_NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OPERATION_COUNT = ABSTRACT_NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.example.tags.tags.impl.KindImpl <em>Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.example.tags.tags.impl.KindImpl
	 * @see org.polarsys.kitalpha.example.tags.tags.impl.TagsPackageImpl#getKind()
	 * @generated
	 */
	int KIND = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__ID = ABSTRACT_NAMED_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__NAME = ABSTRACT_NAMED_ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_FEATURE_COUNT = ABSTRACT_NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_OPERATION_COUNT = ABSTRACT_NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.example.tags.tags.impl.HistoryImpl <em>History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.example.tags.tags.impl.HistoryImpl
	 * @see org.polarsys.kitalpha.example.tags.tags.impl.TagsPackageImpl#getHistory()
	 * @generated
	 */
	int HISTORY = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__ID = ABSTRACT_TAG_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Old Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__OLD_STATUS = ABSTRACT_TAG_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__CHANGE_DATE = ABSTRACT_TAG_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__USER = ABSTRACT_TAG_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Change Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__CHANGE_COMMENT = ABSTRACT_TAG_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_FEATURE_COUNT = ABSTRACT_TAG_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OPERATION_COUNT = ABSTRACT_TAG_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.kitalpha.example.tags.tags.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.kitalpha.example.tags.tags.Color
	 * @see org.polarsys.kitalpha.example.tags.tags.impl.TagsPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 7;

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.example.tags.tags.AbstractTagEntity <em>Abstract Tag Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Tag Entity</em>'.
	 * @see org.polarsys.kitalpha.example.tags.tags.AbstractTagEntity
	 * @generated
	 */
	EClass getAbstractTagEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.example.tags.tags.AbstractTagEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.kitalpha.example.tags.tags.AbstractTagEntity#getId()
	 * @see #getAbstractTagEntity()
	 * @generated
	 */
	EAttribute getAbstractTagEntity_Id();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.example.tags.tags.AbstractNamedEntity <em>Abstract Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Named Entity</em>'.
	 * @see org.polarsys.kitalpha.example.tags.tags.AbstractNamedEntity
	 * @generated
	 */
	EClass getAbstractNamedEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.example.tags.tags.AbstractNamedEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.kitalpha.example.tags.tags.AbstractNamedEntity#getName()
	 * @see #getAbstractNamedEntity()
	 * @generated
	 */
	EAttribute getAbstractNamedEntity_Name();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.example.tags.tags.TagDefinitionModel <em>Tag Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag Definition Model</em>'.
	 * @see org.polarsys.kitalpha.example.tags.tags.TagDefinitionModel
	 * @generated
	 */
	EClass getTagDefinitionModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.example.tags.tags.TagDefinitionModel#getOwnedStatuses <em>Owned Statuses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Statuses</em>'.
	 * @see org.polarsys.kitalpha.example.tags.tags.TagDefinitionModel#getOwnedStatuses()
	 * @see #getTagDefinitionModel()
	 * @generated
	 */
	EReference getTagDefinitionModel_OwnedStatuses();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.example.tags.tags.TagDefinitionModel#getOwnedKinds <em>Owned Kinds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Kinds</em>'.
	 * @see org.polarsys.kitalpha.example.tags.tags.TagDefinitionModel#getOwnedKinds()
	 * @see #getTagDefinitionModel()
	 * @generated
	 */
	EReference getTagDefinitionModel_OwnedKinds();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.example.tags.tags.TagDefinitionModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.polarsys.kitalpha.example.tags.tags.TagDefinitionModel#getDescription()
	 * @see #getTagDefinitionModel()
	 * @generated
	 */
	EAttribute getTagDefinitionModel_Description();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.example.tags.tags.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see org.polarsys.kitalpha.example.tags.tags.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.example.tags.tags.Tag#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.polarsys.kitalpha.example.tags.tags.Tag#getStatus()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.kitalpha.example.tags.tags.Tag#getStatusHistory <em>Status History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Status History</em>'.
	 * @see org.polarsys.kitalpha.example.tags.tags.Tag#getStatusHistory()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_StatusHistory();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.example.tags.tags.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see org.polarsys.kitalpha.example.tags.tags.Status
	 * @generated
	 */
	EClass getStatus();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.example.tags.tags.Status#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Kind</em>'.
	 * @see org.polarsys.kitalpha.example.tags.tags.Status#getKind()
	 * @see #getStatus()
	 * @generated
	 */
	EReference getStatus_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.example.tags.tags.Status#getIcone <em>Icone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icone</em>'.
	 * @see org.polarsys.kitalpha.example.tags.tags.Status#getIcone()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Icone();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.example.tags.tags.Status#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.polarsys.kitalpha.example.tags.tags.Status#getColor()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Color();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.example.tags.tags.Kind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kind</em>'.
	 * @see org.polarsys.kitalpha.example.tags.tags.Kind
	 * @generated
	 */
	EClass getKind();

	/**
	 * Returns the meta object for class '{@link org.polarsys.kitalpha.example.tags.tags.History <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History</em>'.
	 * @see org.polarsys.kitalpha.example.tags.tags.History
	 * @generated
	 */
	EClass getHistory();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.kitalpha.example.tags.tags.History#getOldStatus <em>Old Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Old Status</em>'.
	 * @see org.polarsys.kitalpha.example.tags.tags.History#getOldStatus()
	 * @see #getHistory()
	 * @generated
	 */
	EReference getHistory_OldStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.example.tags.tags.History#getChangeDate <em>Change Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Date</em>'.
	 * @see org.polarsys.kitalpha.example.tags.tags.History#getChangeDate()
	 * @see #getHistory()
	 * @generated
	 */
	EAttribute getHistory_ChangeDate();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.example.tags.tags.History#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.polarsys.kitalpha.example.tags.tags.History#getUser()
	 * @see #getHistory()
	 * @generated
	 */
	EAttribute getHistory_User();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.kitalpha.example.tags.tags.History#getChangeComment <em>Change Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Comment</em>'.
	 * @see org.polarsys.kitalpha.example.tags.tags.History#getChangeComment()
	 * @see #getHistory()
	 * @generated
	 */
	EAttribute getHistory_ChangeComment();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.kitalpha.example.tags.tags.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see org.polarsys.kitalpha.example.tags.tags.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TagsFactory getTagsFactory();

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
		 * The meta object literal for the '{@link org.polarsys.kitalpha.example.tags.tags.impl.AbstractTagEntityImpl <em>Abstract Tag Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.example.tags.tags.impl.AbstractTagEntityImpl
		 * @see org.polarsys.kitalpha.example.tags.tags.impl.TagsPackageImpl#getAbstractTagEntity()
		 * @generated
		 */
		EClass ABSTRACT_TAG_ENTITY = eINSTANCE.getAbstractTagEntity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TAG_ENTITY__ID = eINSTANCE.getAbstractTagEntity_Id();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.example.tags.tags.impl.AbstractNamedEntityImpl <em>Abstract Named Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.example.tags.tags.impl.AbstractNamedEntityImpl
		 * @see org.polarsys.kitalpha.example.tags.tags.impl.TagsPackageImpl#getAbstractNamedEntity()
		 * @generated
		 */
		EClass ABSTRACT_NAMED_ENTITY = eINSTANCE.getAbstractNamedEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NAMED_ENTITY__NAME = eINSTANCE.getAbstractNamedEntity_Name();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.example.tags.tags.impl.TagDefinitionModelImpl <em>Tag Definition Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.example.tags.tags.impl.TagDefinitionModelImpl
		 * @see org.polarsys.kitalpha.example.tags.tags.impl.TagsPackageImpl#getTagDefinitionModel()
		 * @generated
		 */
		EClass TAG_DEFINITION_MODEL = eINSTANCE.getTagDefinitionModel();

		/**
		 * The meta object literal for the '<em><b>Owned Statuses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG_DEFINITION_MODEL__OWNED_STATUSES = eINSTANCE.getTagDefinitionModel_OwnedStatuses();

		/**
		 * The meta object literal for the '<em><b>Owned Kinds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG_DEFINITION_MODEL__OWNED_KINDS = eINSTANCE.getTagDefinitionModel_OwnedKinds();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_DEFINITION_MODEL__DESCRIPTION = eINSTANCE.getTagDefinitionModel_Description();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.example.tags.tags.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.example.tags.tags.impl.TagImpl
		 * @see org.polarsys.kitalpha.example.tags.tags.impl.TagsPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__STATUS = eINSTANCE.getTag_Status();

		/**
		 * The meta object literal for the '<em><b>Status History</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__STATUS_HISTORY = eINSTANCE.getTag_StatusHistory();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.example.tags.tags.impl.StatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.example.tags.tags.impl.StatusImpl
		 * @see org.polarsys.kitalpha.example.tags.tags.impl.TagsPackageImpl#getStatus()
		 * @generated
		 */
		EClass STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATUS__KIND = eINSTANCE.getStatus_Kind();

		/**
		 * The meta object literal for the '<em><b>Icone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__ICONE = eINSTANCE.getStatus_Icone();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__COLOR = eINSTANCE.getStatus_Color();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.example.tags.tags.impl.KindImpl <em>Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.example.tags.tags.impl.KindImpl
		 * @see org.polarsys.kitalpha.example.tags.tags.impl.TagsPackageImpl#getKind()
		 * @generated
		 */
		EClass KIND = eINSTANCE.getKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.example.tags.tags.impl.HistoryImpl <em>History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.example.tags.tags.impl.HistoryImpl
		 * @see org.polarsys.kitalpha.example.tags.tags.impl.TagsPackageImpl#getHistory()
		 * @generated
		 */
		EClass HISTORY = eINSTANCE.getHistory();

		/**
		 * The meta object literal for the '<em><b>Old Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY__OLD_STATUS = eINSTANCE.getHistory_OldStatus();

		/**
		 * The meta object literal for the '<em><b>Change Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORY__CHANGE_DATE = eINSTANCE.getHistory_ChangeDate();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORY__USER = eINSTANCE.getHistory_User();

		/**
		 * The meta object literal for the '<em><b>Change Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORY__CHANGE_COMMENT = eINSTANCE.getHistory_ChangeComment();

		/**
		 * The meta object literal for the '{@link org.polarsys.kitalpha.example.tags.tags.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.kitalpha.example.tags.tags.Color
		 * @see org.polarsys.kitalpha.example.tags.tags.impl.TagsPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

	}

} //TagsPackage
