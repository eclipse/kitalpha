/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.scoping;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.FilteringScope;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Cardinalities;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Enumeration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalAttributeType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalAttributeType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.DataSource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.FieldMapping;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.LocalClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIField;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UI_Field_Type;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.util.ProjectUtil;

import com.google.common.base.Predicate;

/**
 * 
 * @author Amine Lajmi
 * 		   Faycal ABKA
 * 
 */
public class VpuiScopeProvider extends AbstractDeclarativeScopeProvider {

	IScope scope_LocalClass_UI_For_LocalClass(EObject context,
			EReference reference) {
		
		final EObject context2 = context;
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					@Override
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class
								&& ProjectUtil.areInSameProject(context2, d.getEObjectOrProxy()));
					}
				});
	}

	IScope scope_FieldMapping_UI_Field_Mapped_To(EObject context,
			EReference reference) {
		// Store the last field type, filter later "mapped-to" according to this
		// type
		
		String typeName = null;
		if (context instanceof FieldMapping && context.eContainer() != null) {
			UIField field = (UIField) context.eContainer();
			UI_Field_Type type = field.getType();
			typeName = type.getName();
		}
		// get the parent UI container
		UI parent = getUI(context);
		if (parent == null) { 
			return IScope.NULLSCOPE;
		}
		DataSource uiDataSource = parent.getUI_DataSource();
		org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class mappedClass = null;
		boolean isMapped = false;
		if (uiDataSource != null && uiDataSource instanceof LocalClass) {
			// current UI is mapped to a Class
			LocalClass lcl = (LocalClass) uiDataSource;
			mappedClass = lcl.getUI_For_LocalClass();
			isMapped = true;
		}
		final String lastFieldType = typeName;
		final boolean mapped = isMapped;
		final org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class clazz = mappedClass;
		
		final EObject context2 = context;
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					@Override
					public boolean apply(IEObjectDescription d) {
						if (d.getEObjectOrProxy() instanceof AbstractFeature && ProjectUtil.areInSameProject(context2, d.getEObjectOrProxy())) {
							if (lastFieldType == null){
								return false;
							}
							if (lastFieldType.equals(UI_Field_Type.TEXT.getName())){
								return handleText(d, mapped, clazz);
							}
							if (lastFieldType.equals(UI_Field_Type.TEXTAREA.getName()) || lastFieldType.equals(UI_Field_Type.RICHTEXT.getName())){
								return hanldeTextArea(d, mapped, clazz);
							}
							if (lastFieldType.equals(UI_Field_Type.CHECKBOX.getName())){
								return handleCheckBox(d, mapped, clazz);
							}
							if (lastFieldType.equals(UI_Field_Type.RADIOBOX.getName())){
								return handleRadiobox(d, mapped, clazz);
							}
							if (lastFieldType.equals(UI_Field_Type.SIMPLE_CHOICE_LIST.getName())){
								return handleSimpleChoiceList(d, mapped, clazz);
							}
							if (lastFieldType.equals(UI_Field_Type.MULTIPLE_CHOICE_LIST.getName())){
								return handleMultipleChoiceList(d, mapped, clazz);
							}
							return false;
						}
						return false;
					}
					
				});
	}

	/**
	 * Excludes associations, boolean attributes, and enumerations
	 * 
	 * @param d
	 * @param isMapped
	 * @param clazz
	 * @return
	 */
	private Boolean handleText(IEObjectDescription d, Boolean isMapped,
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class clazz) {
		if (d.getEObjectOrProxy() instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute) {
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute att = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute) d
					.getEObjectOrProxy();

			if (att.getOwned_type() instanceof ExternalAttributeType) {
				EDataType type = ((ExternalAttributeType) att.getOwned_type())
						.getType();
				if (type != null && type.getName() != null) {
					if (type.getName().equals("EBoolean")) {
						return false;
					}
					if (type.getName().equals("EEnumerator")) {
						return false;
					}
					if (isMapped
							&& !((org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class) att
									.eContainer()).getName().equals(
									clazz.getName())) {
						return false;
					}
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Accepts only string attributes
	 * 
	 * @param d
	 * @param isMapped
	 * @param clazz
	 * @return
	 */
	private Boolean hanldeTextArea(IEObjectDescription d, Boolean isMapped,
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class clazz) {
		if (d.getEObjectOrProxy() instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute) {
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute att = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute) d
					.getEObjectOrProxy();

			if (att.getOwned_type() instanceof ExternalAttributeType) {
				EDataType type = ((ExternalAttributeType) att.getOwned_type())
						.getType();
				if (type != null && type.getName() != null) {
					if (type.getName().equals("EString")) {
						return true;
					}
					if (isMapped
							&& !((org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class) att
									.eContainer()).getName().equals(
									clazz.getName())) {
						return false;
					}
				}
			}
		}
		return false;
	}

	/**
	 * Accepts only boolean attributes
	 * 
	 * @param d
	 * @param isMapped
	 * @param clazz
	 * @return
	 */
	private Boolean handleCheckBox(IEObjectDescription d, Boolean isMapped,
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class clazz) {
		if (d.getEObjectOrProxy() instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute) {
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute att = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute) d
					.getEObjectOrProxy();

			if (att.getOwned_type() instanceof ExternalAttributeType) {
				EDataType type = ((ExternalAttributeType) att.getOwned_type())
						.getType();
				if (type != null && type.getName() != null) {
					if (type.getName().equals("EBoolean")) {
						return true;
					}
					if (isMapped
							&& !((org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class) att
									.eContainer()).getName().equals(
									clazz.getName())) {
						return false;
					}
				}
			}
		}
		return false;
	}

	/**
	 * Accepts only enumerations
	 * 
	 * @param d
	 * @param isMapped
	 * @param clazz
	 * @return
	 */
	private Boolean handleRadiobox(IEObjectDescription d, Boolean isMapped,
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class clazz) {
		
		if (d.getEObjectOrProxy() instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute) {
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute att = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute) d
					.getEObjectOrProxy();

			if (att.getOwned_type() instanceof ExternalAttributeType) {
				EDataType type = ((ExternalAttributeType) att.getOwned_type())
						.getType();
				if (type != null && type.getName() != null) {
					if ((type.getName().equals("EEnumerator") || type instanceof EEnum)) {
						return true;
					}
					if (isMapped
							&& !((org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class) att
									.eContainer()).getName().equals(
									clazz.getName())) {
						return false;
					}
				}
			}
			
			//for Enumeration
			if (att.getOwned_type() instanceof LocalAttributeType) {
				return ((LocalAttributeType)att.getOwned_type()).getType() instanceof Enumeration;
			}
		}
		return false;
	}

	/**
	 * Accepts only associations [0,1] and [1,1]
	 * 
	 * @param d
	 * @param isMapped
	 * @param clazz
	 * @return
	 */
	private Boolean handleSimpleChoiceList(IEObjectDescription d,
			Boolean isMapped,
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class clazz) {
		if (d.getEObjectOrProxy() instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation) {
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation ass = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation) d
					.getEObjectOrProxy();
			String cardinality = ass.getCardinality().getName();
			if (cardinality.equals(Cardinalities.NOTHING_OR_ONE.getName())
					|| cardinality.equals(Cardinalities.ONLY_ONE.getName())) {
				return true;
			}
			if (isMapped
					&& !((org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class) ass
							.eContainer()).getName().equals(clazz.getName())) {
				return false;
			}
		}
		return false;
	}

	/**
	 * Accepts only associations [1,*] or [0,*]
	 * 
	 * @param d
	 * @param isMapped
	 * @param clazz
	 * @return
	 */
	private Boolean handleMultipleChoiceList(IEObjectDescription d,
			Boolean isMapped,
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class clazz) {
		if (d.getEObjectOrProxy() instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation) {
			org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation ass = (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation) d
					.getEObjectOrProxy();
			String cardinality = ass.getCardinality().getName();
			if (cardinality.equals(Cardinalities.ONE_OR_MANY.getName())
					|| cardinality.equals(Cardinalities.NOTHING_OR_MANY
							.getName())) {
				return true;
			}
			if (isMapped
					&& !((org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class) ass
							.eContainer()).getName().equals(clazz.getName())) {
				return false;
			}
		}
		return false;
	}

	/**
	 * Returns current UI
	 * 
	 * @param object
	 * @return
	 */
	private UI getUI(EObject object) {
		if (object instanceof UI) {
			return (UI) object;
		}
		while (object.eContainer() != null) {
			if (object.eContainer() instanceof UI) {
				return (UI) object.eContainer();
			}
			object = object.eContainer();
		}
		return null;
	}
}
