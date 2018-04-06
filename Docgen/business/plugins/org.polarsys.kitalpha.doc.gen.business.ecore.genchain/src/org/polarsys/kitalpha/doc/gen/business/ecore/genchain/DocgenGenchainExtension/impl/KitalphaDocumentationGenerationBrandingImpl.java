/**
 */
package org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.DocgenGenchainExtensionPackage;
import org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.KitalphaDocumentationGenerationBranding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kitalpha Documentation Generation Branding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.impl.KitalphaDocumentationGenerationBrandingImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.impl.KitalphaDocumentationGenerationBrandingImpl#getLogoPath <em>Logo Path</em>}</li>
 *   <li>{@link org.polarsys.kitalpha.doc.gen.business.ecore.genchain.DocgenGenchainExtension.impl.KitalphaDocumentationGenerationBrandingImpl#getLogoAlt <em>Logo Alt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KitalphaDocumentationGenerationBrandingImpl extends EObjectImpl implements KitalphaDocumentationGenerationBranding {
	/**
	 * The default value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected static final String COPYRIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected String copyright = COPYRIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogoPath() <em>Logo Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoPath()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGO_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogoPath() <em>Logo Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoPath()
	 * @generated
	 * @ordered
	 */
	protected String logoPath = LOGO_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogoAlt() <em>Logo Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoAlt()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGO_ALT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogoAlt() <em>Logo Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoAlt()
	 * @generated
	 * @ordered
	 */
	protected String logoAlt = LOGO_ALT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KitalphaDocumentationGenerationBrandingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocgenGenchainExtensionPackage.Literals.KITALPHA_DOCUMENTATION_GENERATION_BRANDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(String newCopyright) {
		String oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION_BRANDING__COPYRIGHT, oldCopyright, copyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogoPath() {
		return logoPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogoPath(String newLogoPath) {
		String oldLogoPath = logoPath;
		logoPath = newLogoPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION_BRANDING__LOGO_PATH, oldLogoPath, logoPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogoAlt() {
		return logoAlt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogoAlt(String newLogoAlt) {
		String oldLogoAlt = logoAlt;
		logoAlt = newLogoAlt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION_BRANDING__LOGO_ALT, oldLogoAlt, logoAlt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION_BRANDING__COPYRIGHT:
				return getCopyright();
			case DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION_BRANDING__LOGO_PATH:
				return getLogoPath();
			case DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION_BRANDING__LOGO_ALT:
				return getLogoAlt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION_BRANDING__COPYRIGHT:
				setCopyright((String)newValue);
				return;
			case DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION_BRANDING__LOGO_PATH:
				setLogoPath((String)newValue);
				return;
			case DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION_BRANDING__LOGO_ALT:
				setLogoAlt((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION_BRANDING__COPYRIGHT:
				setCopyright(COPYRIGHT_EDEFAULT);
				return;
			case DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION_BRANDING__LOGO_PATH:
				setLogoPath(LOGO_PATH_EDEFAULT);
				return;
			case DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION_BRANDING__LOGO_ALT:
				setLogoAlt(LOGO_ALT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION_BRANDING__COPYRIGHT:
				return COPYRIGHT_EDEFAULT == null ? copyright != null : !COPYRIGHT_EDEFAULT.equals(copyright);
			case DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION_BRANDING__LOGO_PATH:
				return LOGO_PATH_EDEFAULT == null ? logoPath != null : !LOGO_PATH_EDEFAULT.equals(logoPath);
			case DocgenGenchainExtensionPackage.KITALPHA_DOCUMENTATION_GENERATION_BRANDING__LOGO_ALT:
				return LOGO_ALT_EDEFAULT == null ? logoAlt != null : !LOGO_ALT_EDEFAULT.equals(logoAlt);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (copyright: ");
		result.append(copyright);
		result.append(", logoPath: ");
		result.append(logoPath);
		result.append(", logoAlt: ");
		result.append(logoAlt);
		result.append(')');
		return result.toString();
	}

} //KitalphaDocumentationGenerationBrandingImpl
