//Generated on Wed Oct 08 18:19:48 CEST 2014 with EGF 1.2.0.v20140717-0709
package org.polarsys.kitalpha.transposer.analyser.extension;

import org.eclipse.egf.emf.pattern.base.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.emf.codegen.ecore.genmodel.impl.*;
import org.eclipse.emf.codegen.ecore.genmodel.generator.*;
import org.eclipse.emf.codegen.util.*;
import org.eclipse.emf.ecore.util.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;

public class Class extends org.polarsys.kitalpha.emde.egf.model.Class {
	protected static String nl;

	public static synchronized Class create(String lineSeparator) {
		nl = lineSeparator;
		Class result = new Class();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties()
			.getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "";
	protected final String TEXT_2 = NL + "package ";
	protected final String TEXT_3 = ";";
	protected final String TEXT_4 = NL + "package ";
	protected final String TEXT_5 = ";";
	protected final String TEXT_6 = NL;
	protected final String TEXT_7 = NL;
	protected final String TEXT_8 = NL + "/**" + NL
			+ " * <!-- begin-user-doc -->" + NL
			+ " * A representation of the model object '<em><b>";
	protected final String TEXT_9 = "</b></em>'." + NL
			+ " * <!-- end-user-doc -->";
	protected final String TEXT_10 = NL + " *" + NL
			+ " * <!-- begin-model-doc -->" + NL + " * ";
	protected final String TEXT_11 = NL + " * <!-- end-model-doc -->";
	protected final String TEXT_12 = NL + " *";
	protected final String TEXT_13 = NL + " * <p>" + NL
			+ " * The following features are supported:" + NL + " * <ul>";
	protected final String TEXT_14 = NL + " *   <li>{@link ";
	protected final String TEXT_15 = "#";
	protected final String TEXT_16 = " <em>";
	protected final String TEXT_17 = "</em>}</li>";
	protected final String TEXT_18 = NL + " * </ul>" + NL + " * </p>";
	protected final String TEXT_19 = NL + " *";
	protected final String TEXT_20 = NL + " * @see ";
	protected final String TEXT_21 = "#get";
	protected final String TEXT_22 = "()";
	protected final String TEXT_23 = NL + " * @model ";
	protected final String TEXT_24 = NL + " *        ";
	protected final String TEXT_25 = NL + " * @model";
	protected final String TEXT_26 = NL + " * @extends ";
	protected final String TEXT_27 = NL + " * @generated" + NL + " */";
	protected final String TEXT_28 = NL + "/**" + NL
			+ " * <!-- begin-user-doc -->" + NL
			+ " * An implementation of the model object '<em><b>";
	protected final String TEXT_29 = "</b></em>'." + NL
			+ " * <!-- end-user-doc -->" + NL + " * <p>";
	protected final String TEXT_30 = NL
			+ " * The following features are implemented:" + NL + " * <ul>";
	protected final String TEXT_31 = NL + " *   <li>{@link ";
	protected final String TEXT_32 = "#";
	protected final String TEXT_33 = " <em>";
	protected final String TEXT_34 = "</em>}</li>";
	protected final String TEXT_35 = NL + " * </ul>";
	protected final String TEXT_36 = NL + " * </p>" + NL + " *" + NL
			+ " * @generated" + NL + " */";
	protected final String TEXT_37 = NL + "public";
	protected final String TEXT_38 = " abstract";
	protected final String TEXT_39 = " class ";
	protected final String TEXT_40 = NL + "public interface ";
	protected final String TEXT_41 = NL + "{";
	protected final String TEXT_42 = NL + "\t/**" + NL
			+ "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */" + NL + "\t";
	protected final String TEXT_43 = " copyright = ";
	protected final String TEXT_44 = ";";
	protected final String TEXT_45 = NL;
	protected final String TEXT_46 = NL + "\t/**" + NL
			+ "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */" + NL + "\tpublic static final ";
	protected final String TEXT_47 = " mofDriverNumber = \"";
	protected final String TEXT_48 = "\";";
	protected final String TEXT_49 = NL;
	protected final String TEXT_50 = NL + "\t/**" + NL
			+ "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */" + NL
			+ "\tprivate static final long serialVersionUID = 1L;" + NL;
	protected final String TEXT_51 = NL
			+ "\t/**"
			+ NL
			+ "\t * An array of objects representing the values of non-primitive features."
			+ NL + "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */" + NL + "\tprotected Object[] ";
	protected final String TEXT_52 = ";" + NL;
	protected final String TEXT_53 = NL
			+ "\t/**"
			+ NL
			+ "\t * A bit field representing the indices of non-primitive feature values."
			+ NL + "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */" + NL + "\tprotected int ";
	protected final String TEXT_54 = ";" + NL;
	protected final String TEXT_55 = NL
			+ "\t/**"
			+ NL
			+ "\t * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set."
			+ NL + "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
	protected final String TEXT_56 = " = 0;" + NL;
	protected final String TEXT_57 = NL;
	protected final String TEXT_58 = "  ";
	protected final String TEXT_59 = NL + "\t/**" + NL
			+ "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */" + NL + "\tprivate static final int ";
	protected final String TEXT_60 = " = ";
	protected final String TEXT_61 = ".getFeatureID(";
	protected final String TEXT_62 = ") - ";
	protected final String TEXT_63 = ";" + NL;
	protected final String TEXT_64 = NL + "\t/**" + NL
			+ "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */" + NL + "\tprivate static final int ";
	protected final String TEXT_65 = " = ";
	protected final String TEXT_66 = ".getFeatureID(";
	protected final String TEXT_67 = ") - ";
	protected final String TEXT_68 = ";" + NL;
	protected final String TEXT_69 = NL + "\t/**" + NL
			+ "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */" + NL + "\t";
	protected final String TEXT_70 = "public";
	protected final String TEXT_71 = "protected";
	protected final String TEXT_72 = " ";
	protected final String TEXT_73 = "()" + NL + "\t{" + NL + "\t\tsuper();";
	protected final String TEXT_74 = NL + "\t\t";
	protected final String TEXT_75 = " |= ";
	protected final String TEXT_76 = "_EFLAG";
	protected final String TEXT_77 = "_DEFAULT";
	protected final String TEXT_78 = ";";
	protected final String TEXT_79 = NL + "\t}" + NL + "" + NL + "\t/**" + NL
			+ "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */";
	protected final String TEXT_80 = NL + "\t@Override";
	protected final String TEXT_81 = NL + "\tprotected ";
	protected final String TEXT_82 = " eStaticClass()" + NL + "\t{" + NL
			+ "\t\treturn ";
	protected final String TEXT_83 = ";" + NL + "\t}" + NL;
	protected final String TEXT_84 = NL;
	protected final String TEXT_85 = NL;
	protected final String TEXT_86 = NL;
	protected final String TEXT_87 = NL + "\t/**" + NL
			+ "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */";
	protected final String TEXT_88 = NL + "\t@SuppressWarnings(\"unchecked\")";
	protected final String TEXT_89 = NL + "\t@Override";
	protected final String TEXT_90 = NL + "\tpublic ";
	protected final String TEXT_91 = " eInverseAdd(";
	protected final String TEXT_92 = " otherEnd, int featureID, ";
	protected final String TEXT_93 = " msgs)" + NL + "\t{" + NL
			+ "\t\tswitch (featureID";
	protected final String TEXT_94 = ")" + NL + "\t\t{";
	protected final String TEXT_95 = NL + "\t\t\tcase ";
	protected final String TEXT_96 = ":";
	protected final String TEXT_97 = NL + "\t\t\t\treturn ((";
	protected final String TEXT_98 = "(";
	protected final String TEXT_99 = ".InternalMapView";
	protected final String TEXT_100 = ")";
	protected final String TEXT_101 = "()).eMap()).basicAdd(otherEnd, msgs);";
	protected final String TEXT_102 = NL + "\t\t\t\treturn (";
	protected final String TEXT_103 = "()).basicAdd(otherEnd, msgs);";
	protected final String TEXT_104 = NL
			+ "\t\t\t\tif (eInternalContainer() != null)" + NL
			+ "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
	protected final String TEXT_105 = NL + "\t\t\t\treturn basicSet";
	protected final String TEXT_106 = "((";
	protected final String TEXT_107 = ")otherEnd, msgs);";
	protected final String TEXT_108 = NL
			+ "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
	protected final String TEXT_109 = ", msgs);";
	protected final String TEXT_110 = NL + "\t\t\t\t";
	protected final String TEXT_111 = " ";
	protected final String TEXT_112 = " = (";
	protected final String TEXT_113 = ")eVirtualGet(";
	protected final String TEXT_114 = ");";
	protected final String TEXT_115 = NL + "\t\t\t\t";
	protected final String TEXT_116 = " ";
	protected final String TEXT_117 = " = ";
	protected final String TEXT_118 = "basicGet";
	protected final String TEXT_119 = "();";
	protected final String TEXT_120 = NL + "\t\t\t\tif (";
	protected final String TEXT_121 = " != null)";
	protected final String TEXT_122 = NL + "\t\t\t\t\tmsgs = ((";
	protected final String TEXT_123 = ")";
	protected final String TEXT_124 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
	protected final String TEXT_125 = ", null, msgs);";
	protected final String TEXT_126 = NL + "\t\t\t\t\tmsgs = ((";
	protected final String TEXT_127 = ")";
	protected final String TEXT_128 = ").eInverseRemove(this, ";
	protected final String TEXT_129 = ", ";
	protected final String TEXT_130 = ".class, msgs);";
	protected final String TEXT_131 = NL + "\t\t\t\treturn basicSet";
	protected final String TEXT_132 = "((";
	protected final String TEXT_133 = ")otherEnd, msgs);";
	protected final String TEXT_134 = NL + "\t\t}";
	protected final String TEXT_135 = NL
			+ "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
	protected final String TEXT_136 = NL
			+ "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
	protected final String TEXT_137 = NL + "\t}" + NL;
	protected final String TEXT_138 = NL + "\t/**" + NL
			+ "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */";
	protected final String TEXT_139 = NL + "\t@Override";
	protected final String TEXT_140 = NL + "\tpublic ";
	protected final String TEXT_141 = " eInverseRemove(";
	protected final String TEXT_142 = " otherEnd, int featureID, ";
	protected final String TEXT_143 = " msgs)" + NL + "\t{" + NL
			+ "\t\tswitch (featureID";
	protected final String TEXT_144 = ")" + NL + "\t\t{";
	protected final String TEXT_145 = NL + "\t\t\tcase ";
	protected final String TEXT_146 = ":";
	protected final String TEXT_147 = NL + "\t\t\t\treturn ((";
	protected final String TEXT_148 = ")((";
	protected final String TEXT_149 = ".InternalMapView";
	protected final String TEXT_150 = ")";
	protected final String TEXT_151 = "()).eMap()).basicRemove(otherEnd, msgs);";
	protected final String TEXT_152 = NL + "\t\t\t\treturn ((";
	protected final String TEXT_153 = ")((";
	protected final String TEXT_154 = ".Internal.Wrapper)";
	protected final String TEXT_155 = "()).featureMap()).basicRemove(otherEnd, msgs);";
	protected final String TEXT_156 = NL + "\t\t\t\treturn ((";
	protected final String TEXT_157 = ")";
	protected final String TEXT_158 = "()).basicRemove(otherEnd, msgs);";
	protected final String TEXT_159 = NL
			+ "\t\t\t\treturn eBasicSetContainer(null, ";
	protected final String TEXT_160 = ", msgs);";
	protected final String TEXT_161 = NL + "\t\t\t\treturn basicUnset";
	protected final String TEXT_162 = "(msgs);";
	protected final String TEXT_163 = NL + "\t\t\t\treturn basicSet";
	protected final String TEXT_164 = "(null, msgs);";
	protected final String TEXT_165 = NL + "\t\t}";
	protected final String TEXT_166 = NL
			+ "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
	protected final String TEXT_167 = NL
			+ "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
	protected final String TEXT_168 = NL + "\t}" + NL;
	protected final String TEXT_169 = NL + "\t/**" + NL
			+ "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */";
	protected final String TEXT_170 = NL + "\t@Override";
	protected final String TEXT_171 = NL + "\tpublic ";
	protected final String TEXT_172 = " eBasicRemoveFromContainerFeature(";
	protected final String TEXT_173 = " msgs)" + NL + "\t{" + NL
			+ "\t\tswitch (eContainerFeatureID()";
	protected final String TEXT_174 = ")" + NL + "\t\t{";
	protected final String TEXT_175 = NL + "\t\t\tcase ";
	protected final String TEXT_176 = ":" + NL
			+ "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
	protected final String TEXT_177 = ", ";
	protected final String TEXT_178 = ".class, msgs);";
	protected final String TEXT_179 = NL + "\t\t}";
	protected final String TEXT_180 = NL
			+ "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
	protected final String TEXT_181 = NL
			+ "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
	protected final String TEXT_182 = NL + "\t}" + NL;
	protected final String TEXT_183 = NL + "\t/**" + NL
			+ "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */";
	protected final String TEXT_184 = NL + "\t@Override";
	protected final String TEXT_185 = NL
			+ "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)"
			+ NL + "\t{" + NL + "\t\tswitch (featureID";
	protected final String TEXT_186 = ")" + NL + "\t\t{";
	protected final String TEXT_187 = NL + "\t\t\tcase ";
	protected final String TEXT_188 = ":";
	protected final String TEXT_189 = NL + "\t\t\t\treturn ";
	protected final String TEXT_190 = "();";
	protected final String TEXT_191 = NL + "\t\t\t\treturn ";
	protected final String TEXT_192 = "() ? Boolean.TRUE : Boolean.FALSE;";
	protected final String TEXT_193 = NL + "\t\t\t\treturn new ";
	protected final String TEXT_194 = "(";
	protected final String TEXT_195 = "());";
	protected final String TEXT_196 = NL + "\t\t\t\tif (resolve) return ";
	protected final String TEXT_197 = "();" + NL + "\t\t\t\treturn basicGet";
	protected final String TEXT_198 = "();";
	protected final String TEXT_199 = NL + "\t\t\t\tif (coreType) return ((";
	protected final String TEXT_200 = ".InternalMapView";
	protected final String TEXT_201 = ")";
	protected final String TEXT_202 = "()).eMap();" + NL
			+ "\t\t\t\telse return ";
	protected final String TEXT_203 = "();";
	protected final String TEXT_204 = NL + "\t\t\t\tif (coreType) return ";
	protected final String TEXT_205 = "();" + NL + "\t\t\t\telse return ";
	protected final String TEXT_206 = "().map();";
	protected final String TEXT_207 = NL + "\t\t\t\tif (coreType) return ((";
	protected final String TEXT_208 = ".Internal.Wrapper)";
	protected final String TEXT_209 = "()).featureMap();" + NL
			+ "\t\t\t\treturn ";
	protected final String TEXT_210 = "();";
	protected final String TEXT_211 = NL + "\t\t\t\tif (coreType) return ";
	protected final String TEXT_212 = "();" + NL + "\t\t\t\treturn ((";
	protected final String TEXT_213 = ".Internal)";
	protected final String TEXT_214 = "()).getWrapper();";
	protected final String TEXT_215 = NL + "\t\t\t\treturn ";
	protected final String TEXT_216 = "();";
	protected final String TEXT_217 = NL + "\t\t}";
	protected final String TEXT_218 = NL
			+ "\t\treturn super.eGet(featureID, resolve, coreType);";
	protected final String TEXT_219 = NL
			+ "\t\treturn eDynamicGet(featureID, resolve, coreType);";
	protected final String TEXT_220 = NL + "\t}" + NL;
	protected final String TEXT_221 = NL + "\t/**" + NL
			+ "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */";
	protected final String TEXT_222 = NL + "\t@SuppressWarnings(\"unchecked\")";
	protected final String TEXT_223 = NL + "\t@Override";
	protected final String TEXT_224 = NL
			+ "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{"
			+ NL + "\t\tswitch (featureID";
	protected final String TEXT_225 = ")" + NL + "\t\t{";
	protected final String TEXT_226 = NL + "\t\t\tcase ";
	protected final String TEXT_227 = ":";
	protected final String TEXT_228 = NL + "\t\t\t\t((";
	protected final String TEXT_229 = ".Internal)((";
	protected final String TEXT_230 = ".Internal.Wrapper)";
	protected final String TEXT_231 = "()).featureMap()).set(newValue);";
	protected final String TEXT_232 = NL + "\t\t\t\t((";
	protected final String TEXT_233 = ".Internal)";
	protected final String TEXT_234 = "()).set(newValue);";
	protected final String TEXT_235 = NL + "\t\t\t\t((";
	protected final String TEXT_236 = ".Setting)((";
	protected final String TEXT_237 = ".InternalMapView";
	protected final String TEXT_238 = ")";
	protected final String TEXT_239 = "()).eMap()).set(newValue);";
	protected final String TEXT_240 = NL + "\t\t\t\t((";
	protected final String TEXT_241 = ".Setting)";
	protected final String TEXT_242 = "()).set(newValue);";
	protected final String TEXT_243 = NL + "\t\t\t\t";
	protected final String TEXT_244 = "().clear();" + NL + "\t\t\t\t";
	protected final String TEXT_245 = "().addAll((";
	protected final String TEXT_246 = "<? extends ";
	protected final String TEXT_247 = ">";
	protected final String TEXT_248 = ")newValue);";
	protected final String TEXT_249 = NL + "\t\t\t\tset";
	protected final String TEXT_250 = "(((";
	protected final String TEXT_251 = ")newValue).";
	protected final String TEXT_252 = "());";
	protected final String TEXT_253 = NL + "\t\t\t\t// begin-extension-code"
			+ NL + "\t\t\t\tif (newValue == null";
	protected final String TEXT_254 = " || newValue instanceof ";
	protected final String TEXT_255 = ") {" + NL
			+ "\t\t\t\t// end-extension-code" + NL + "\t\t\t\t\tset";
	protected final String TEXT_256 = "((";
	protected final String TEXT_257 = ")newValue);" + NL
			+ "\t\t\t\t// begin-extension-code" + NL + "\t\t\t\t}" + NL
			+ "\t\t\t\t// end-extension-code";
	protected final String TEXT_258 = NL + "          set";
	protected final String TEXT_259 = "(newValue);";
	protected final String TEXT_260 = NL + "\t\t\t\treturn;";
	protected final String TEXT_261 = NL + "\t\t}";
	protected final String TEXT_262 = NL
			+ "\t\tsuper.eSet(featureID, newValue);";
	protected final String TEXT_263 = NL
			+ "\t\teDynamicSet(featureID, newValue);";
	protected final String TEXT_264 = NL + "\t}" + NL;
	protected final String TEXT_265 = NL;
	protected final String TEXT_266 = NL;
	protected final String TEXT_267 = NL + "\t/**" + NL
			+ "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */";
	protected final String TEXT_268 = NL + "\t@Override";
	protected final String TEXT_269 = NL
			+ "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
	protected final String TEXT_270 = " baseClass)" + NL + "\t{";
	protected final String TEXT_271 = NL + "\t\tif (baseClass == ";
	protected final String TEXT_272 = ".class)" + NL + "\t\t{" + NL
			+ "\t\t\tswitch (derivedFeatureID";
	protected final String TEXT_273 = ")" + NL + "\t\t\t{";
	protected final String TEXT_274 = NL + "\t\t\t\tcase ";
	protected final String TEXT_275 = ": return ";
	protected final String TEXT_276 = ";";
	protected final String TEXT_277 = NL + "\t\t\t\tdefault: return -1;" + NL
			+ "\t\t\t}" + NL + "\t\t}";
	protected final String TEXT_278 = NL
			+ "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);"
			+ NL + "\t}";
	protected final String TEXT_279 = NL + NL + "\t/**" + NL
			+ "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */";
	protected final String TEXT_280 = NL + "\t@Override";
	protected final String TEXT_281 = NL
			+ "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
	protected final String TEXT_282 = " baseClass)" + NL + "\t{";
	protected final String TEXT_283 = NL + "\t\tif (baseClass == ";
	protected final String TEXT_284 = ".class)" + NL + "\t\t{" + NL
			+ "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
	protected final String TEXT_285 = NL + "\t\t\t\tcase ";
	protected final String TEXT_286 = ": return ";
	protected final String TEXT_287 = ";";
	protected final String TEXT_288 = NL + "\t\t\t\tdefault: return -1;" + NL
			+ "\t\t\t}" + NL + "\t\t}";
	protected final String TEXT_289 = NL + "\t\tif (baseClass == ";
	protected final String TEXT_290 = ".class)" + NL + "\t\t{" + NL
			+ "\t\t\tswitch (baseFeatureID";
	protected final String TEXT_291 = ")" + NL + "\t\t\t{";
	protected final String TEXT_292 = NL + "\t\t\t\tcase ";
	protected final String TEXT_293 = ": return ";
	protected final String TEXT_294 = ";";
	protected final String TEXT_295 = NL + "\t\t\t\tdefault: return -1;" + NL
			+ "\t\t\t}" + NL + "\t\t}";
	protected final String TEXT_296 = NL
			+ "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);"
			+ NL + "\t}" + NL;
	protected final String TEXT_297 = NL + "\t/**" + NL
			+ "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */";
	protected final String TEXT_298 = NL + "\t@Override";
	protected final String TEXT_299 = NL
			+ "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL
			+ "\t\treturn ";
	protected final String TEXT_300 = ";" + NL + "\t}" + NL + "" + NL + "\t/**"
			+ NL + "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */";
	protected final String TEXT_301 = NL + "\t@Override";
	protected final String TEXT_302 = NL
			+ "\tprotected void eSetVirtualValues(Object[] newValues)" + NL
			+ "\t{" + NL + "\t\t";
	protected final String TEXT_303 = " = newValues;" + NL + "\t}" + NL;
	protected final String TEXT_304 = NL + "\t/**" + NL
			+ "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */";
	protected final String TEXT_305 = NL + "\t@Override";
	protected final String TEXT_306 = NL
			+ "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL
			+ "\t\tswitch (offset)" + NL + "\t\t{";
	protected final String TEXT_307 = NL + "\t\t\tcase ";
	protected final String TEXT_308 = " :" + NL + "\t\t\t\treturn ";
	protected final String TEXT_309 = ";";
	protected final String TEXT_310 = NL + "\t\t\tdefault :" + NL
			+ "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}"
			+ NL + "\t}" + NL + "" + NL + "\t/**" + NL
			+ "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */";
	protected final String TEXT_311 = NL + "\t@Override";
	protected final String TEXT_312 = NL
			+ "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)"
			+ NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
	protected final String TEXT_313 = NL + "\t\t\tcase ";
	protected final String TEXT_314 = " :" + NL + "\t\t\t\t";
	protected final String TEXT_315 = " = newIndexBits;" + NL
			+ "\t\t\t\tbreak;";
	protected final String TEXT_316 = NL + "\t\t\tdefault :" + NL
			+ "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}"
			+ NL + "\t}" + NL;
	protected final String TEXT_317 = NL + "\t/**" + NL
			+ "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */";
	protected final String TEXT_318 = NL + "\t@Override";
	protected final String TEXT_319 = NL + "\tpublic String toString()" + NL
			+ "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL
			+ "" + NL
			+ "\t\tStringBuffer result = new StringBuffer(super.toString());";
	protected final String TEXT_320 = NL + "\t\tresult.append(\" (";
	protected final String TEXT_321 = ": \");";
	protected final String TEXT_322 = NL + "\t\tresult.append(\", ";
	protected final String TEXT_323 = ": \");";
	protected final String TEXT_324 = NL + "\t\tif (eVirtualIsSet(";
	protected final String TEXT_325 = ")) result.append(eVirtualGet(";
	protected final String TEXT_326 = ")); else result.append(\"<unset>\");";
	protected final String TEXT_327 = NL + "\t\tif (";
	protected final String TEXT_328 = "(";
	protected final String TEXT_329 = " & ";
	protected final String TEXT_330 = "_ESETFLAG) != 0";
	protected final String TEXT_331 = "ESet";
	protected final String TEXT_332 = ") result.append((";
	protected final String TEXT_333 = " & ";
	protected final String TEXT_334 = "_EFLAG) != 0); else result.append(\"<unset>\");";
	protected final String TEXT_335 = NL + "\t\tif (";
	protected final String TEXT_336 = "(";
	protected final String TEXT_337 = " & ";
	protected final String TEXT_338 = "_ESETFLAG) != 0";
	protected final String TEXT_339 = "ESet";
	protected final String TEXT_340 = ") result.append(";
	protected final String TEXT_341 = "_EFLAG_VALUES[(";
	protected final String TEXT_342 = " & ";
	protected final String TEXT_343 = "_EFLAG) >>> ";
	protected final String TEXT_344 = "_EFLAG_OFFSET]); else result.append(\"<unset>\");";
	protected final String TEXT_345 = NL + "\t\tif (";
	protected final String TEXT_346 = "(";
	protected final String TEXT_347 = " & ";
	protected final String TEXT_348 = "_ESETFLAG) != 0";
	protected final String TEXT_349 = "ESet";
	protected final String TEXT_350 = ") result.append(";
	protected final String TEXT_351 = "); else result.append(\"<unset>\");";
	protected final String TEXT_352 = NL + "\t\tresult.append(eVirtualGet(";
	protected final String TEXT_353 = ", ";
	protected final String TEXT_354 = "));";
	protected final String TEXT_355 = NL + "\t\tresult.append((";
	protected final String TEXT_356 = " & ";
	protected final String TEXT_357 = "_EFLAG) != 0);";
	protected final String TEXT_358 = NL + "\t\tresult.append(";
	protected final String TEXT_359 = "_EFLAG_VALUES[(";
	protected final String TEXT_360 = " & ";
	protected final String TEXT_361 = "_EFLAG) >>> ";
	protected final String TEXT_362 = "_EFLAG_OFFSET]);";
	protected final String TEXT_363 = NL + "\t\tresult.append(";
	protected final String TEXT_364 = ");";
	protected final String TEXT_365 = NL + "\t\tresult.append(')');" + NL
			+ "\t\treturn result.toString();" + NL + "\t}" + NL;
	protected final String TEXT_366 = NL + "\t/**" + NL
			+ "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL
			+ "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL
			+ "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
	protected final String TEXT_367 = " theKey = getKey();" + NL
			+ "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL
			+ "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL
			+ "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{"
			+ NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL
			+ "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */" + NL + "\tpublic ";
	protected final String TEXT_368 = " getKey()" + NL + "\t{";
	protected final String TEXT_369 = NL + "\t\treturn new ";
	protected final String TEXT_370 = "(getTypedKey());";
	protected final String TEXT_371 = NL + "\t\treturn getTypedKey();";
	protected final String TEXT_372 = NL + "\t}" + NL + "" + NL + "\t/**" + NL
			+ "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */" + NL + "\tpublic void setKey(";
	protected final String TEXT_373 = " key)" + NL + "\t{";
	protected final String TEXT_374 = NL + "\t\tgetTypedKey().addAll(";
	protected final String TEXT_375 = "(";
	protected final String TEXT_376 = ")";
	protected final String TEXT_377 = "key);";
	protected final String TEXT_378 = NL + "\t\tsetTypedKey(key);";
	protected final String TEXT_379 = NL + "\t\tsetTypedKey(((";
	protected final String TEXT_380 = ")key).";
	protected final String TEXT_381 = "());";
	protected final String TEXT_382 = NL + "\t\tsetTypedKey((";
	protected final String TEXT_383 = ")key);";
	protected final String TEXT_384 = NL + "\t}" + NL + "" + NL + "\t/**" + NL
			+ "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */" + NL + "\tpublic ";
	protected final String TEXT_385 = " getValue()" + NL + "\t{";
	protected final String TEXT_386 = NL + "\t\treturn new ";
	protected final String TEXT_387 = "(getTypedValue());";
	protected final String TEXT_388 = NL + "\t\treturn getTypedValue();";
	protected final String TEXT_389 = NL + "\t}" + NL + "" + NL + "\t/**" + NL
			+ "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */" + NL + "\tpublic ";
	protected final String TEXT_390 = " setValue(";
	protected final String TEXT_391 = " value)" + NL + "\t{" + NL + "\t\t";
	protected final String TEXT_392 = " oldValue = getValue();";
	protected final String TEXT_393 = NL + "\t\tgetTypedValue().clear();" + NL
			+ "\t\tgetTypedValue().addAll(";
	protected final String TEXT_394 = "(";
	protected final String TEXT_395 = ")";
	protected final String TEXT_396 = "value);";
	protected final String TEXT_397 = NL + "\t\tsetTypedValue(value);";
	protected final String TEXT_398 = NL + "\t\tsetTypedValue(((";
	protected final String TEXT_399 = ")value).";
	protected final String TEXT_400 = "());";
	protected final String TEXT_401 = NL + "\t\tsetTypedValue((";
	protected final String TEXT_402 = ")value);";
	protected final String TEXT_403 = NL + "\t\treturn oldValue;" + NL + "\t}"
			+ NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL
			+ "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL
			+ "\t */";
	protected final String TEXT_404 = NL + "\t@SuppressWarnings(\"unchecked\")";
	protected final String TEXT_405 = NL + "\tpublic ";
	protected final String TEXT_406 = " getEMap()" + NL + "\t{" + NL + "\t\t";
	protected final String TEXT_407 = " container = eContainer();" + NL
			+ "\t\treturn container == null ? null : (";
	protected final String TEXT_408 = ")container.eGet(eContainmentFeature());"
			+ NL + "\t}" + NL;
	protected final String TEXT_409 = NL;
	protected final String TEXT_410 = NL + "} //";
	protected final String TEXT_411 = NL;
	protected final String TEXT_412 = NL;
	protected final String TEXT_413 = NL;

	public Class() {
		//Here is the constructor
		StringBuffer stringBuffer = new StringBuffer();

		// add initialisation of the pattern variables (declaration has been already done).

	}

	public String generate(Object argument) throws Exception {
		final StringBuffer stringBuffer = new StringBuffer();

		InternalPatternContext ctx = (InternalPatternContext) argument;
		Map<String, String> queryCtx = null;
		IQuery.ParameterDescription paramDesc = null;
		Node.Container currentNode = ctx.getNode();

		List<Object> parameterList = null;
		//this pattern can only be called by another (i.e. it's not an entry point in execution)

		for (Object parameterParameter : parameterList) {

			this.parameter = (org.eclipse.emf.codegen.ecore.genmodel.GenClass) parameterParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(
					OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_412);
		stringBuffer.append(TEXT_413);
		return stringBuffer.toString();
	}

	public String orchestration(PatternContext ctx) throws Exception {
		InternalPatternContext ictx = (InternalPatternContext) ctx;

		super.orchestration(new SuperOrchestrationContext(ictx));

		if (ictx.useReporter()) {
			Map<String, Object> parameterValues = new HashMap<String, Object>();
			parameterValues.put("parameter", this.parameter);
			String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
			String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx,
					parameterValues);
		}
		return null;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

	protected void method_doGenerate(final StringBuffer stringBuffer,
			final PatternContext ctx) throws Exception {

		/**
		 * <copyright>
		 *
		 * Copyright (c) 2002-2007 IBM Corporation and others.
		 * All rights reserved.   This program and the accompanying materials
		 * are made available under the terms of the Eclipse Public License v1.0
		 * which accompanies this distribution, and is available at
		 * http://www.eclipse.org/legal/epl-v10.html
		 *
		 * Contributors:
		 *   IBM - Initial API and implementation
		 *
		 * </copyright>
		 */

		final GenClass genClass = (GenClass) ((Object[]) argument)[0];
		final GenPackage genPackage = genClass.getGenPackage();
		final GenModel genModel = genPackage.getGenModel();
		final boolean isJDK50 = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50;
		final boolean isInterface = Boolean.TRUE
				.equals(((Object[]) argument)[1]);
		final boolean isImplementation = Boolean.TRUE
				.equals(((Object[]) argument)[2]);
		final String publicStaticFinalFlag = isImplementation ? "public static final "
				: "";
		final String singleWildcard = isJDK50 ? "<?>" : "";
		final String negativeOffsetCorrection = genClass.hasOffsetCorrection() ? " - "
				+ genClass.getOffsetCorrectionField(null)
				: "";
		final String positiveOffsetCorrection = genClass.hasOffsetCorrection() ? " + "
				+ genClass.getOffsetCorrectionField(null)
				: "";
		stringBuffer.append(TEXT_1);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.eclipse.egf.emf.pattern.base/egf/EMF_Pattern_Base.fcore#LogicalName=org.eclipse.egf.emf.pattern.base.HeaderJava" args="parameter:argument"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null,
					stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("argument", parameter);
			CallHelper
					.executeWithParameterInjection(
							"platform:/plugin/org.eclipse.egf.emf.pattern.base/egf/EMF_Pattern_Base.fcore#_XHLrsCwtEd-jc5T-XaRJlg",
							new ExecutionContext((InternalPatternContext) ctx),
							callParameters);
			stringBuffer.setLength(0);
		}

		if (isInterface) {
			stringBuffer.append(TEXT_2);
			stringBuffer.append(genPackage.getInterfacePackageName());
			stringBuffer.append(TEXT_3);
		} else {
			stringBuffer.append(TEXT_4);
			stringBuffer.append(genPackage.getClassPackageName());
			stringBuffer.append(TEXT_5);
		}
		stringBuffer.append(TEXT_6);
		genModel.markImportLocation(stringBuffer, genPackage);
		if (isImplementation) {
			genClass.addClassPsuedoImports();
		}
		stringBuffer.append(TEXT_7);
		if (isInterface) {
			stringBuffer.append(TEXT_8);
			stringBuffer.append(genClass.getFormattedName());
			stringBuffer.append(TEXT_9);
			if (genClass.hasDocumentation()) {
				stringBuffer.append(TEXT_10);
				stringBuffer.append(genClass.getDocumentation(genModel
						.getIndentation(stringBuffer)));
				stringBuffer.append(TEXT_11);
			}
			stringBuffer.append(TEXT_12);
			if (!genClass.getGenFeatures().isEmpty()) {
				stringBuffer.append(TEXT_13);
				for (GenFeature genFeature : genClass.getGenFeatures()) {
					if (!genFeature.isSuppressedGetVisibility()) {
						stringBuffer.append(TEXT_14);
						stringBuffer.append(genClass
								.getQualifiedInterfaceName());
						stringBuffer.append(TEXT_15);
						stringBuffer.append(genFeature.getGetAccessor());
						stringBuffer.append(TEXT_16);
						stringBuffer.append(genFeature.getFormattedName());
						stringBuffer.append(TEXT_17);
					}
				}
				stringBuffer.append(TEXT_18);
			}
			stringBuffer.append(TEXT_19);
			if (!genModel.isSuppressEMFMetaData()) {
				stringBuffer.append(TEXT_20);
				stringBuffer.append(genPackage
						.getQualifiedPackageInterfaceName());
				stringBuffer.append(TEXT_21);
				stringBuffer.append(genClass.getClassifierAccessorName());
				stringBuffer.append(TEXT_22);
			}
			if (!genModel.isSuppressEMFModelTags()) {
				boolean first = true;
				for (StringTokenizer stringTokenizer = new StringTokenizer(
						genClass.getModelInfo(), "\n\r"); stringTokenizer
						.hasMoreTokens();) {
					String modelInfo = stringTokenizer.nextToken();
					if (first) {
						first = false;
						stringBuffer.append(TEXT_23);
						stringBuffer.append(modelInfo);
					} else {
						stringBuffer.append(TEXT_24);
						stringBuffer.append(modelInfo);
					}
				}
				if (first) {
					stringBuffer.append(TEXT_25);
				}
			}
			if (genClass.needsRootExtendsInterfaceExtendsTag()) {
				stringBuffer.append(TEXT_26);
				stringBuffer.append(genModel.getImportedName(genModel
						.getRootExtendsInterface()));
			}
			stringBuffer.append(TEXT_27);
		} else {
			stringBuffer.append(TEXT_28);
			stringBuffer.append(genClass.getFormattedName());
			stringBuffer.append(TEXT_29);
			if (!genClass.getImplementedGenFeatures().isEmpty()) {
				stringBuffer.append(TEXT_30);
				for (GenFeature genFeature : genClass
						.getImplementedGenFeatures()) {
					stringBuffer.append(TEXT_31);
					stringBuffer.append(genClass.getQualifiedClassName());
					stringBuffer.append(TEXT_32);
					stringBuffer.append(genFeature.getGetAccessor());
					stringBuffer.append(TEXT_33);
					stringBuffer.append(genFeature.getFormattedName());
					stringBuffer.append(TEXT_34);
				}
				stringBuffer.append(TEXT_35);
			}
			stringBuffer.append(TEXT_36);
		}
		if (isImplementation) {
			stringBuffer.append(TEXT_37);
			if (genClass.isAbstract()) {
				stringBuffer.append(TEXT_38);
			}
			stringBuffer.append(TEXT_39);
			stringBuffer.append(genClass.getClassName());
			stringBuffer.append(genClass.getTypeParameters().trim());
			stringBuffer.append(genClass.getClassExtends());
			stringBuffer.append(genClass.getClassImplements());
		} else {
			stringBuffer.append(TEXT_40);
			stringBuffer.append(genClass.getInterfaceName());
			stringBuffer.append(genClass.getTypeParameters().trim());
			stringBuffer.append(genClass.getInterfaceExtends());
		}
		stringBuffer.append(TEXT_41);
		if (genModel.hasCopyrightField()) {
			stringBuffer.append(TEXT_42);
			stringBuffer.append(publicStaticFinalFlag);
			stringBuffer.append(genModel.getImportedName("java.lang.String"));
			stringBuffer.append(TEXT_43);
			stringBuffer.append(genModel.getCopyrightFieldLiteral());
			stringBuffer.append(TEXT_44);
			stringBuffer.append(genModel.getNonNLS());
			stringBuffer.append(TEXT_45);
		}
		if (isImplementation && genModel.getDriverNumber() != null) {
			stringBuffer.append(TEXT_46);
			stringBuffer.append(genModel.getImportedName("java.lang.String"));
			stringBuffer.append(TEXT_47);
			stringBuffer.append(genModel.getDriverNumber());
			stringBuffer.append(TEXT_48);
			stringBuffer.append(genModel.getNonNLS());
			stringBuffer.append(TEXT_49);
		}
		if (isImplementation && genClass.isJavaIOSerializable()) {
			stringBuffer.append(TEXT_50);
		}
		if (isImplementation && genModel.isVirtualDelegation()) {
			String eVirtualValuesField = genClass.getEVirtualValuesField();
			if (eVirtualValuesField != null) {
				stringBuffer.append(TEXT_51);
				stringBuffer.append(eVirtualValuesField);
				stringBuffer.append(TEXT_52);
			}
			{
				List<String> eVirtualIndexBitFields = genClass
						.getEVirtualIndexBitFields(new ArrayList<String>());
				if (!eVirtualIndexBitFields.isEmpty()) {
					for (String eVirtualIndexBitField : eVirtualIndexBitFields) {
						stringBuffer.append(TEXT_53);
						stringBuffer.append(eVirtualIndexBitField);
						stringBuffer.append(TEXT_54);
					}
				}
			}
		}
		if (isImplementation && genClass.isModelRoot()
				&& genModel.isBooleanFlagsEnabled()
				&& genModel.getBooleanFlagsReservedBits() == -1) {
			stringBuffer.append(TEXT_55);
			stringBuffer.append(genModel.getBooleanFlagsField());
			stringBuffer.append(TEXT_56);
		}
		if (isImplementation && !genModel.isReflectiveDelegation()) {
			for (GenFeature genFeature : genClass.getDeclaredFieldGenFeatures()) {
				stringBuffer.append(TEXT_57);
				{
					//<%@ egf:patternCall patternId="platform:/plugin/org.eclipse.egf.emf.pattern/egf/EMF_Pattern.fcore#LogicalName=org.eclipse.egf.emf.pattern.model.call.Class.Class.declaredFieldGenFeature.override" args="genFeature:genFeature,genClass:genClass,genPackage:genPackage,genModel:genModel,isJDK50:isJDK50,isInterface:isInterface,isImplementation:isImplementation,publicStaticFinalFlag:publicStaticFinalFlag,singleWildcard:singleWildcard,negativeOffsetCorrection:negativeOffsetCorrection,positiveOffsetCorrection:positiveOffsetCorrection"%>

					InternalPatternContext ictx = (InternalPatternContext) ctx;
					new Node.DataLeaf(ictx.getNode(), getClass(), null,
							stringBuffer.toString());
					stringBuffer.setLength(0);

					final Map<String, Object> callParameters = new HashMap<String, Object>();
					callParameters.put("genFeature", genFeature);
					callParameters.put("genClass", genClass);
					callParameters.put("genPackage", genPackage);
					callParameters.put("genModel", genModel);
					callParameters.put("isJDK50", isJDK50);
					callParameters.put("isInterface", isInterface);
					callParameters.put("isImplementation", isImplementation);
					callParameters.put("publicStaticFinalFlag",
							publicStaticFinalFlag);
					callParameters.put("singleWildcard", singleWildcard);
					callParameters.put("negativeOffsetCorrection",
							negativeOffsetCorrection);
					callParameters.put("positiveOffsetCorrection",
							positiveOffsetCorrection);
					CallHelper
							.executeWithParameterInjection(
									"platform:/plugin/org.eclipse.egf.emf.pattern/egf/EMF_Pattern.fcore#_0jpGTmJ-Ed-FqczH3ESmRw",
									new ExecutionContext(
											(InternalPatternContext) ctx),
									callParameters);
					stringBuffer.setLength(0);
				}

				//Class/declaredFieldGenFeature.override.javajetinc
				stringBuffer.append(TEXT_58);
			}
		}
		if (isImplementation && genClass.hasOffsetCorrection()
				&& !genClass.getImplementedGenFeatures().isEmpty()) {
			stringBuffer.append(TEXT_59);
			stringBuffer.append(genClass.getOffsetCorrectionField(null));
			stringBuffer.append(TEXT_60);
			stringBuffer.append(genClass.getQualifiedClassifierAccessor());
			stringBuffer.append(TEXT_61);
			stringBuffer.append(genClass.getImplementedGenFeatures().get(0)
					.getQualifiedFeatureAccessor());
			stringBuffer.append(TEXT_62);
			stringBuffer.append(genClass.getQualifiedFeatureID(genClass
					.getImplementedGenFeatures().get(0)));
			stringBuffer.append(TEXT_63);
		}
		if (isImplementation && genClass.hasOffsetCorrection()
				&& !genModel.isReflectiveDelegation()) {
			for (GenFeature genFeature : genClass.getImplementedGenFeatures()) {
				GenFeature reverseFeature = genFeature.getReverse();
				if (reverseFeature != null
						&& reverseFeature.getGenClass().hasOffsetCorrection()) {
					stringBuffer.append(TEXT_64);
					stringBuffer.append(genClass
							.getOffsetCorrectionField(genFeature));
					stringBuffer.append(TEXT_65);
					stringBuffer.append(reverseFeature.getGenClass()
							.getQualifiedClassifierAccessor());
					stringBuffer.append(TEXT_66);
					stringBuffer.append(reverseFeature
							.getQualifiedFeatureAccessor());
					stringBuffer.append(TEXT_67);
					stringBuffer.append(reverseFeature.getGenClass()
							.getQualifiedFeatureID(reverseFeature));
					stringBuffer.append(TEXT_68);
				}
			}
		}
		if (isImplementation) {
			stringBuffer.append(TEXT_69);
			if (genModel.isPublicConstructors()) {
				stringBuffer.append(TEXT_70);
			} else {
				stringBuffer.append(TEXT_71);
			}
			stringBuffer.append(TEXT_72);
			stringBuffer.append(genClass.getClassName());
			stringBuffer.append(TEXT_73);
			for (GenFeature genFeature : genClass
					.getFlagGenFeaturesWithDefault()) {
				stringBuffer.append(TEXT_74);
				stringBuffer.append(genClass.getFlagsField(genFeature));
				stringBuffer.append(TEXT_75);
				stringBuffer.append(genFeature.getUpperName());
				stringBuffer.append(TEXT_76);
				if (!genFeature.isBooleanType()) {
					stringBuffer.append(TEXT_77);
				}
				stringBuffer.append(TEXT_78);
			}
			stringBuffer.append(TEXT_79);
			if (genModel.useClassOverrideAnnotation()) {
				stringBuffer.append(TEXT_80);
			}
			stringBuffer.append(TEXT_81);
			stringBuffer.append(genModel
					.getImportedName("org.eclipse.emf.ecore.EClass"));
			stringBuffer.append(TEXT_82);
			stringBuffer.append(genClass.getQualifiedClassifierAccessor());
			stringBuffer.append(TEXT_83);
		}
		stringBuffer.append(TEXT_84);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.eclipse.egf.emf.pattern/egf/EMF_Pattern.fcore#LogicalName=org.eclipse.egf.emf.pattern.model.call.Class.Class.reflectiveDelegation.override" args="genClass:genClass,genPackage:genPackage,genModel:genModel,isJDK50:isJDK50,isInterface:isInterface,isImplementation:isImplementation,publicStaticFinalFlag:publicStaticFinalFlag,singleWildcard:singleWildcard,negativeOffsetCorrection:negativeOffsetCorrection,positiveOffsetCorrection:positiveOffsetCorrection"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null,
					stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("genClass", genClass);
			callParameters.put("genPackage", genPackage);
			callParameters.put("genModel", genModel);
			callParameters.put("isJDK50", isJDK50);
			callParameters.put("isInterface", isInterface);
			callParameters.put("isImplementation", isImplementation);
			callParameters.put("publicStaticFinalFlag", publicStaticFinalFlag);
			callParameters.put("singleWildcard", singleWildcard);
			callParameters.put("negativeOffsetCorrection",
					negativeOffsetCorrection);
			callParameters.put("positiveOffsetCorrection",
					positiveOffsetCorrection);
			CallHelper
					.executeWithParameterInjection(
							"platform:/plugin/org.eclipse.egf.emf.pattern/egf/EMF_Pattern.fcore#_0kFyMGJ-Ed-FqczH3ESmRw",
							new ExecutionContext((InternalPatternContext) ctx),
							callParameters);
			stringBuffer.setLength(0);
		}

		//Class/reflectiveDelegation.override.javajetinc
		new Runnable() {
			public void run() {
				for (GenFeature genFeature : (isImplementation ? genClass
						.getImplementedGenFeatures() : genClass
						.getDeclaredGenFeatures())) {
					stringBuffer.append(TEXT_85);
					{
						//<%@ egf:patternCall patternId="platform:/plugin/org.eclipse.egf.emf.pattern/egf/EMF_Pattern.fcore#LogicalName=org.eclipse.egf.emf.pattern.model.call.Class.Class.genFeature.override" args="genFeature:genFeature,genClass:genClass,genPackage:genPackage,genModel:genModel,isJDK50:isJDK50,isInterface:isInterface,isImplementation:isImplementation,publicStaticFinalFlag:publicStaticFinalFlag,singleWildcard:singleWildcard,negativeOffsetCorrection:negativeOffsetCorrection,positiveOffsetCorrection:positiveOffsetCorrection"%>

						InternalPatternContext ictx = (InternalPatternContext) ctx;
						new Node.DataLeaf(ictx.getNode(), getClass(), null,
								stringBuffer.toString());
						stringBuffer.setLength(0);

						final Map<String, Object> callParameters = new HashMap<String, Object>();
						callParameters.put("genFeature", genFeature);
						callParameters.put("genClass", genClass);
						callParameters.put("genPackage", genPackage);
						callParameters.put("genModel", genModel);
						callParameters.put("isJDK50", isJDK50);
						callParameters.put("isInterface", isInterface);
						callParameters
								.put("isImplementation", isImplementation);
						callParameters.put("publicStaticFinalFlag",
								publicStaticFinalFlag);
						callParameters.put("singleWildcard", singleWildcard);
						callParameters.put("negativeOffsetCorrection",
								negativeOffsetCorrection);
						callParameters.put("positiveOffsetCorrection",
								positiveOffsetCorrection);
						CallHelper
								.executeWithParameterInjection(
										"platform:/plugin/org.eclipse.egf.emf.pattern/egf/EMF_Pattern.fcore#_0kO8IGJ-Ed-FqczH3ESmRw",
										new ExecutionContext(
												(InternalPatternContext) ctx),
										callParameters);
						stringBuffer.setLength(0);
					}

					//Class/genFeature.override.javajetinc
				}//for
			}
		}.run();
		for (GenOperation genOperation : (isImplementation ? genClass
				.getImplementedGenOperations() : genClass
				.getDeclaredGenOperations())) {
			stringBuffer.append(TEXT_86);
			{
				//<%@ egf:patternCall patternId="platform:/plugin/org.eclipse.egf.emf.pattern/egf/EMF_Pattern.fcore#LogicalName=org.eclipse.egf.emf.pattern.model.call.Class.Class.genOperation.override" args="genOperation:genOperation,genClass:genClass,genPackage:genPackage,genModel:genModel,isJDK50:isJDK50,isInterface:isInterface,isImplementation:isImplementation,publicStaticFinalFlag:publicStaticFinalFlag,singleWildcard:singleWildcard,negativeOffsetCorrection:negativeOffsetCorrection,positiveOffsetCorrection:positiveOffsetCorrection"%>

				InternalPatternContext ictx = (InternalPatternContext) ctx;
				new Node.DataLeaf(ictx.getNode(), getClass(), null,
						stringBuffer.toString());
				stringBuffer.setLength(0);

				final Map<String, Object> callParameters = new HashMap<String, Object>();
				callParameters.put("genOperation", genOperation);
				callParameters.put("genClass", genClass);
				callParameters.put("genPackage", genPackage);
				callParameters.put("genModel", genModel);
				callParameters.put("isJDK50", isJDK50);
				callParameters.put("isInterface", isInterface);
				callParameters.put("isImplementation", isImplementation);
				callParameters.put("publicStaticFinalFlag",
						publicStaticFinalFlag);
				callParameters.put("singleWildcard", singleWildcard);
				callParameters.put("negativeOffsetCorrection",
						negativeOffsetCorrection);
				callParameters.put("positiveOffsetCorrection",
						positiveOffsetCorrection);
				CallHelper
						.executeWithParameterInjection(
								"platform:/plugin/org.eclipse.egf.emf.pattern/egf/EMF_Pattern.fcore#_0tBrwGJ-Ed-FqczH3ESmRw",
								new ExecutionContext(
										(InternalPatternContext) ctx),
								callParameters);
				stringBuffer.setLength(0);
			}

			//Class/implementedGenOperation.override.javajetinc
		}//for
		if (isImplementation && !genModel.isReflectiveDelegation()
				&& genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
			stringBuffer.append(TEXT_87);
			if (genModel.useGenerics()) {
				for (GenFeature genFeature : genClass
						.getEInverseAddGenFeatures()) {
					if (genFeature.isUncheckedCast(genClass)) {
						stringBuffer.append(TEXT_88);
						break;
					}
				}
			}
			if (genModel.useClassOverrideAnnotation()) {
				stringBuffer.append(TEXT_89);
			}
			stringBuffer.append(TEXT_90);
			stringBuffer
					.append(genModel
							.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
			stringBuffer.append(TEXT_91);
			stringBuffer.append(genModel
					.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
			stringBuffer.append(TEXT_92);
			stringBuffer
					.append(genModel
							.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
			stringBuffer.append(TEXT_93);
			stringBuffer.append(negativeOffsetCorrection);
			stringBuffer.append(TEXT_94);
			for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
				stringBuffer.append(TEXT_95);
				stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
				stringBuffer.append(TEXT_96);
				if (genFeature.isListType()) {
					String cast = "("
							+ genModel
									.getImportedName("org.eclipse.emf.ecore.util.InternalEList")
							+ (!genModel.useGenerics() ? ")"
									: "<"
											+ genModel
													.getImportedName("org.eclipse.emf.ecore.InternalEObject")
											+ ">)("
											+ genModel
													.getImportedName("org.eclipse.emf.ecore.util.InternalEList")
											+ "<?>)");
					if (genFeature.isMapType()
							&& genFeature.isEffectiveSuppressEMFTypes()) {
						stringBuffer.append(TEXT_97);
						stringBuffer.append(cast);
						stringBuffer.append(TEXT_98);
						stringBuffer
								.append(genModel
										.getImportedName("org.eclipse.emf.common.util.EMap"));
						stringBuffer.append(TEXT_99);
						stringBuffer.append(genFeature
								.getImportedMapTemplateArguments(genClass));
						stringBuffer.append(TEXT_100);
						stringBuffer.append(genFeature.getGetAccessor());
						stringBuffer.append(TEXT_101);
					} else {
						stringBuffer.append(TEXT_102);
						stringBuffer.append(cast);
						stringBuffer.append(genFeature.getGetAccessor());
						stringBuffer.append(TEXT_103);
					}
				} else if (genFeature.isContainer()) {
					stringBuffer.append(TEXT_104);
					if (genFeature.isBasicSet()) {
						stringBuffer.append(TEXT_105);
						stringBuffer.append(genFeature.getAccessorName());
						stringBuffer.append(TEXT_106);
						stringBuffer.append(genFeature
								.getImportedType(genClass));
						stringBuffer.append(TEXT_107);
					} else {
						stringBuffer.append(TEXT_108);
						stringBuffer.append(genClass
								.getQualifiedFeatureID(genFeature));
						stringBuffer.append(positiveOffsetCorrection);
						stringBuffer.append(TEXT_109);
					}
				} else {
					if (genClass.getImplementingGenModel(genFeature)
							.isVirtualDelegation()) {
						stringBuffer.append(TEXT_110);
						stringBuffer.append(genFeature
								.getImportedType(genClass));
						stringBuffer.append(TEXT_111);
						stringBuffer.append(genFeature.getSafeName());
						stringBuffer.append(TEXT_112);
						stringBuffer.append(genFeature
								.getImportedType(genClass));
						stringBuffer.append(TEXT_113);
						stringBuffer.append(genClass
								.getQualifiedFeatureID(genFeature));
						stringBuffer.append(positiveOffsetCorrection);
						stringBuffer.append(TEXT_114);
					} else if (genFeature.isVolatile()
							|| genClass.getImplementingGenModel(genFeature)
									.isDynamicDelegation()) {
						stringBuffer.append(TEXT_115);
						stringBuffer.append(genFeature
								.getImportedType(genClass));
						stringBuffer.append(TEXT_116);
						stringBuffer.append(genFeature.getSafeName());
						stringBuffer.append(TEXT_117);
						if (genFeature.isResolveProxies()) {
							stringBuffer.append(TEXT_118);
							stringBuffer.append(genFeature.getAccessorName());
						} else {
							stringBuffer.append(genFeature.getGetAccessor());
						}
						stringBuffer.append(TEXT_119);
					}
					stringBuffer.append(TEXT_120);
					stringBuffer.append(genFeature.getSafeName());
					stringBuffer.append(TEXT_121);
					if (genFeature.isEffectiveContains()) {
						stringBuffer.append(TEXT_122);
						stringBuffer
								.append(genModel
										.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
						stringBuffer.append(TEXT_123);
						stringBuffer.append(genFeature.getSafeName());
						stringBuffer.append(TEXT_124);
						stringBuffer.append(genClass
								.getQualifiedFeatureID(genFeature));
						stringBuffer.append(negativeOffsetCorrection);
						stringBuffer.append(TEXT_125);
					} else {
						GenFeature reverseFeature = genFeature.getReverse();
						GenClass targetClass = reverseFeature.getGenClass();
						String reverseOffsetCorrection = targetClass
								.hasOffsetCorrection() ? " + "
								+ genClass
										.getOffsetCorrectionField(reverseFeature)
								: "";
						stringBuffer.append(TEXT_126);
						stringBuffer
								.append(genModel
										.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
						stringBuffer.append(TEXT_127);
						stringBuffer.append(genFeature.getSafeName());
						stringBuffer.append(TEXT_128);
						stringBuffer.append(targetClass
								.getQualifiedFeatureID(reverseFeature));
						stringBuffer.append(reverseOffsetCorrection);
						stringBuffer.append(TEXT_129);
						stringBuffer.append(targetClass
								.getRawImportedInterfaceName());
						stringBuffer.append(TEXT_130);
					}
					stringBuffer.append(TEXT_131);
					stringBuffer.append(genFeature.getAccessorName());
					stringBuffer.append(TEXT_132);
					stringBuffer.append(genFeature.getImportedType(genClass));
					stringBuffer.append(TEXT_133);
				}
			}
			stringBuffer.append(TEXT_134);
			if (genModel.isMinimalReflectiveMethods()) {
				stringBuffer.append(TEXT_135);
			} else {
				stringBuffer.append(TEXT_136);
			}
			stringBuffer.append(TEXT_137);
		}
		if (isImplementation
				&& !genModel.isReflectiveDelegation()
				&& genClass.implementsAny(genClass
						.getEInverseRemoveGenFeatures())) {
			stringBuffer.append(TEXT_138);
			if (genModel.useClassOverrideAnnotation()) {
				stringBuffer.append(TEXT_139);
			}
			stringBuffer.append(TEXT_140);
			stringBuffer
					.append(genModel
							.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
			stringBuffer.append(TEXT_141);
			stringBuffer.append(genModel
					.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
			stringBuffer.append(TEXT_142);
			stringBuffer
					.append(genModel
							.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
			stringBuffer.append(TEXT_143);
			stringBuffer.append(negativeOffsetCorrection);
			stringBuffer.append(TEXT_144);
			for (GenFeature genFeature : genClass
					.getEInverseRemoveGenFeatures()) {
				stringBuffer.append(TEXT_145);
				stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
				stringBuffer.append(TEXT_146);
				if (genFeature.isListType()) {
					if (genFeature.isMapType()
							&& genFeature.isEffectiveSuppressEMFTypes()) {
						stringBuffer.append(TEXT_147);
						stringBuffer
								.append(genModel
										.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
						stringBuffer.append(singleWildcard);
						stringBuffer.append(TEXT_148);
						stringBuffer
								.append(genModel
										.getImportedName("org.eclipse.emf.common.util.EMap"));
						stringBuffer.append(TEXT_149);
						stringBuffer.append(genFeature
								.getImportedMapTemplateArguments(genClass));
						stringBuffer.append(TEXT_150);
						stringBuffer.append(genFeature.getGetAccessor());
						stringBuffer.append(TEXT_151);
					} else if (genFeature.isWrappedFeatureMapType()) {
						stringBuffer.append(TEXT_152);
						stringBuffer
								.append(genModel
										.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
						stringBuffer.append(singleWildcard);
						stringBuffer.append(TEXT_153);
						stringBuffer
								.append(genModel
										.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
						stringBuffer.append(TEXT_154);
						stringBuffer.append(genFeature.getGetAccessor());
						stringBuffer.append(TEXT_155);
					} else {
						stringBuffer.append(TEXT_156);
						stringBuffer
								.append(genModel
										.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
						stringBuffer.append(singleWildcard);
						stringBuffer.append(TEXT_157);
						stringBuffer.append(genFeature.getGetAccessor());
						stringBuffer.append(TEXT_158);
					}
				} else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
					stringBuffer.append(TEXT_159);
					stringBuffer.append(genClass
							.getQualifiedFeatureID(genFeature));
					stringBuffer.append(positiveOffsetCorrection);
					stringBuffer.append(TEXT_160);
				} else if (genFeature.isUnsettable()) {
					stringBuffer.append(TEXT_161);
					stringBuffer.append(genFeature.getAccessorName());
					stringBuffer.append(TEXT_162);
				} else {
					stringBuffer.append(TEXT_163);
					stringBuffer.append(genFeature.getAccessorName());
					stringBuffer.append(TEXT_164);
				}
			}
			stringBuffer.append(TEXT_165);
			if (genModel.isMinimalReflectiveMethods()) {
				stringBuffer.append(TEXT_166);
			} else {
				stringBuffer.append(TEXT_167);
			}
			stringBuffer.append(TEXT_168);
		}
		if (isImplementation
				&& !genModel.isReflectiveDelegation()
				&& genClass.implementsAny(genClass
						.getEBasicRemoveFromContainerGenFeatures())) {
			stringBuffer.append(TEXT_169);
			if (genModel.useClassOverrideAnnotation()) {
				stringBuffer.append(TEXT_170);
			}
			stringBuffer.append(TEXT_171);
			stringBuffer
					.append(genModel
							.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
			stringBuffer.append(TEXT_172);
			stringBuffer
					.append(genModel
							.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
			stringBuffer.append(TEXT_173);
			stringBuffer.append(negativeOffsetCorrection);
			stringBuffer.append(TEXT_174);
			for (GenFeature genFeature : genClass
					.getEBasicRemoveFromContainerGenFeatures()) {
				GenFeature reverseFeature = genFeature.getReverse();
				GenClass targetClass = reverseFeature.getGenClass();
				String reverseOffsetCorrection = targetClass
						.hasOffsetCorrection() ? " + "
						+ genClass.getOffsetCorrectionField(reverseFeature)
						: "";
				stringBuffer.append(TEXT_175);
				stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
				stringBuffer.append(TEXT_176);
				stringBuffer.append(targetClass
						.getQualifiedFeatureID(reverseFeature));
				stringBuffer.append(reverseOffsetCorrection);
				stringBuffer.append(TEXT_177);
				stringBuffer.append(targetClass.getRawImportedInterfaceName());
				stringBuffer.append(TEXT_178);
			}
			stringBuffer.append(TEXT_179);
			if (genModel.isMinimalReflectiveMethods()) {
				stringBuffer.append(TEXT_180);
			} else {
				stringBuffer.append(TEXT_181);
			}
			stringBuffer.append(TEXT_182);
		}
		if (isImplementation && !genModel.isReflectiveDelegation()
				&& genClass.implementsAny(genClass.getEGetGenFeatures())) {
			stringBuffer.append(TEXT_183);
			if (genModel.useClassOverrideAnnotation()) {
				stringBuffer.append(TEXT_184);
			}
			stringBuffer.append(TEXT_185);
			stringBuffer.append(negativeOffsetCorrection);
			stringBuffer.append(TEXT_186);
			for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
				stringBuffer.append(TEXT_187);
				stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
				stringBuffer.append(TEXT_188);
				if (genFeature.isPrimitiveType()) {
					if (isJDK50) {
						stringBuffer.append(TEXT_189);
						stringBuffer.append(genFeature.getGetAccessor());
						stringBuffer.append(TEXT_190);
					} else if (genFeature.isBooleanType()) {
						stringBuffer.append(TEXT_191);
						stringBuffer.append(genFeature.getGetAccessor());
						stringBuffer.append(TEXT_192);
					} else {
						stringBuffer.append(TEXT_193);
						stringBuffer.append(genFeature.getObjectType(genClass));
						stringBuffer.append(TEXT_194);
						stringBuffer.append(genFeature.getGetAccessor());
						stringBuffer.append(TEXT_195);
					}
				} else if (genFeature.isResolveProxies()
						&& !genFeature.isListType()) {
					stringBuffer.append(TEXT_196);
					stringBuffer.append(genFeature.getGetAccessor());
					stringBuffer.append(TEXT_197);
					stringBuffer.append(genFeature.getAccessorName());
					stringBuffer.append(TEXT_198);
				} else if (genFeature.isMapType()) {
					if (genFeature.isEffectiveSuppressEMFTypes()) {
						stringBuffer.append(TEXT_199);
						stringBuffer
								.append(genModel
										.getImportedName("org.eclipse.emf.common.util.EMap"));
						stringBuffer.append(TEXT_200);
						stringBuffer.append(genFeature
								.getImportedMapTemplateArguments(genClass));
						stringBuffer.append(TEXT_201);
						stringBuffer.append(genFeature.getGetAccessor());
						stringBuffer.append(TEXT_202);
						stringBuffer.append(genFeature.getGetAccessor());
						stringBuffer.append(TEXT_203);
					} else {
						stringBuffer.append(TEXT_204);
						stringBuffer.append(genFeature.getGetAccessor());
						stringBuffer.append(TEXT_205);
						stringBuffer.append(genFeature.getGetAccessor());
						stringBuffer.append(TEXT_206);
					}
				} else if (genFeature.isWrappedFeatureMapType()) {
					stringBuffer.append(TEXT_207);
					stringBuffer
							.append(genModel
									.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
					stringBuffer.append(TEXT_208);
					stringBuffer.append(genFeature.getGetAccessor());
					stringBuffer.append(TEXT_209);
					stringBuffer.append(genFeature.getGetAccessor());
					stringBuffer.append(TEXT_210);
				} else if (genFeature.isFeatureMapType()) {
					stringBuffer.append(TEXT_211);
					stringBuffer.append(genFeature.getGetAccessor());
					stringBuffer.append(TEXT_212);
					stringBuffer
							.append(genModel
									.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
					stringBuffer.append(TEXT_213);
					stringBuffer.append(genFeature.getGetAccessor());
					stringBuffer.append(TEXT_214);
				} else {
					stringBuffer.append(TEXT_215);
					stringBuffer.append(genFeature.getGetAccessor());
					stringBuffer.append(TEXT_216);
				}
			}
			stringBuffer.append(TEXT_217);
			if (genModel.isMinimalReflectiveMethods()) {
				stringBuffer.append(TEXT_218);
			} else {
				stringBuffer.append(TEXT_219);
			}
			stringBuffer.append(TEXT_220);
		}
		if (isImplementation && !genModel.isReflectiveDelegation()
				&& genClass.implementsAny(genClass.getESetGenFeatures())) {
			stringBuffer.append(TEXT_221);
			if (genModel.useGenerics()) {
				for (GenFeature genFeature : genClass.getESetGenFeatures()) {
					if (genFeature.isUncheckedCast(genClass)
							&& !genFeature.isFeatureMapType()
							&& !genFeature.isMapType()) {
						stringBuffer.append(TEXT_222);
						break;
					}
				}
			}
			if (genModel.useClassOverrideAnnotation()) {
				stringBuffer.append(TEXT_223);
			}
			stringBuffer.append(TEXT_224);
			stringBuffer.append(negativeOffsetCorrection);
			stringBuffer.append(TEXT_225);
			for (GenFeature genFeature : genClass.getESetGenFeatures()) {
				stringBuffer.append(TEXT_226);
				stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
				stringBuffer.append(TEXT_227);
				if (genFeature.isListType()) {
					if (genFeature.isWrappedFeatureMapType()) {
						stringBuffer.append(TEXT_228);
						stringBuffer
								.append(genModel
										.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
						stringBuffer.append(TEXT_229);
						stringBuffer
								.append(genModel
										.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
						stringBuffer.append(TEXT_230);
						stringBuffer.append(genFeature.getGetAccessor());
						stringBuffer.append(TEXT_231);
					} else if (genFeature.isFeatureMapType()) {
						stringBuffer.append(TEXT_232);
						stringBuffer
								.append(genModel
										.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
						stringBuffer.append(TEXT_233);
						stringBuffer.append(genFeature.getGetAccessor());
						stringBuffer.append(TEXT_234);
					} else if (genFeature.isMapType()) {
						if (genFeature.isEffectiveSuppressEMFTypes()) {
							stringBuffer.append(TEXT_235);
							stringBuffer
									.append(genModel
											.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
							stringBuffer.append(TEXT_236);
							stringBuffer
									.append(genModel
											.getImportedName("org.eclipse.emf.common.util.EMap"));
							stringBuffer.append(TEXT_237);
							stringBuffer.append(genFeature
									.getImportedMapTemplateArguments(genClass));
							stringBuffer.append(TEXT_238);
							stringBuffer.append(genFeature.getGetAccessor());
							stringBuffer.append(TEXT_239);
						} else {
							stringBuffer.append(TEXT_240);
							stringBuffer
									.append(genModel
											.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
							stringBuffer.append(TEXT_241);
							stringBuffer.append(genFeature.getGetAccessor());
							stringBuffer.append(TEXT_242);
						}
					} else {
						stringBuffer.append(TEXT_243);
						stringBuffer.append(genFeature.getGetAccessor());
						stringBuffer.append(TEXT_244);
						stringBuffer.append(genFeature.getGetAccessor());
						stringBuffer.append(TEXT_245);
						stringBuffer.append(genModel
								.getImportedName("java.util.Collection"));
						if (isJDK50) {
							stringBuffer.append(TEXT_246);
							stringBuffer.append(genFeature
									.getListItemType(genClass));
							stringBuffer.append(TEXT_247);
						}
						stringBuffer.append(TEXT_248);
					}
				} else if (!isJDK50 && genFeature.isPrimitiveType()) {
					stringBuffer.append(TEXT_249);
					stringBuffer.append(genFeature.getAccessorName());
					stringBuffer.append(TEXT_250);
					stringBuffer.append(genFeature.getObjectType(genClass));
					stringBuffer.append(TEXT_251);
					stringBuffer.append(genFeature.getPrimitiveValueFunction());
					stringBuffer.append(TEXT_252);
				} else {
					if (genFeature.getTypeGenDataType() == null
							|| !genFeature.getTypeGenDataType().isObjectType()
							|| !genFeature.getRawType().equals(
									genFeature.getType(genClass))) {
						stringBuffer.append(TEXT_253);
						if (!genFeature.hasGenericType()) {
							stringBuffer.append(TEXT_254);
							stringBuffer.append(genFeature
									.getObjectType(genClass));
						}
						stringBuffer.append(TEXT_255);
						stringBuffer.append(genFeature.getAccessorName());
						stringBuffer.append(TEXT_256);
						stringBuffer.append(genFeature.getObjectType(genClass));
						stringBuffer.append(TEXT_257);
					} else {
						stringBuffer.append(TEXT_258);
						stringBuffer.append(genFeature.getAccessorName());
						stringBuffer.append(TEXT_259);
					}
				}
				stringBuffer.append(TEXT_260);
			}
			stringBuffer.append(TEXT_261);
			if (genModel.isMinimalReflectiveMethods()) {
				stringBuffer.append(TEXT_262);
			} else {
				stringBuffer.append(TEXT_263);
			}
			stringBuffer.append(TEXT_264);
		}
		if (isImplementation && !genModel.isReflectiveDelegation()
				&& genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
			stringBuffer.append(TEXT_265);
			{
				//<%@ egf:patternCall patternId="platform:/plugin/org.eclipse.egf.emf.pattern/egf/EMF_Pattern.fcore#LogicalName=org.eclipse.egf.emf.pattern.model.call.Class.Class.eUnset.override" args="genClass:genClass,genPackage:genPackage,genModel:genModel,isJDK50:isJDK50,isInterface:isInterface,isImplementation:isImplementation,publicStaticFinalFlag:publicStaticFinalFlag,singleWildcard:singleWildcard,negativeOffsetCorrection:negativeOffsetCorrection,positiveOffsetCorrection:positiveOffsetCorrection"%>

				InternalPatternContext ictx = (InternalPatternContext) ctx;
				new Node.DataLeaf(ictx.getNode(), getClass(), null,
						stringBuffer.toString());
				stringBuffer.setLength(0);

				final Map<String, Object> callParameters = new HashMap<String, Object>();
				callParameters.put("genClass", genClass);
				callParameters.put("genPackage", genPackage);
				callParameters.put("genModel", genModel);
				callParameters.put("isJDK50", isJDK50);
				callParameters.put("isInterface", isInterface);
				callParameters.put("isImplementation", isImplementation);
				callParameters.put("publicStaticFinalFlag",
						publicStaticFinalFlag);
				callParameters.put("singleWildcard", singleWildcard);
				callParameters.put("negativeOffsetCorrection",
						negativeOffsetCorrection);
				callParameters.put("positiveOffsetCorrection",
						positiveOffsetCorrection);
				CallHelper
						.executeWithParameterInjection(
								"platform:/plugin/org.eclipse.egf.emf.pattern/egf/EMF_Pattern.fcore#_0uN-kGJ-Ed-FqczH3ESmRw",
								new ExecutionContext(
										(InternalPatternContext) ctx),
								callParameters);
				stringBuffer.setLength(0);
			}

			//Class/eUnset.override.javajetinc
		}
		if (isImplementation && !genModel.isReflectiveDelegation()
				&& genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
			stringBuffer.append(TEXT_266);
			{
				//<%@ egf:patternCall patternId="platform:/plugin/org.eclipse.egf.emf.pattern/egf/EMF_Pattern.fcore#LogicalName=org.eclipse.egf.emf.pattern.model.call.Class.Class.eIsSet.override" args="genClass:genClass,genPackage:genPackage,genModel:genModel,isJDK50:isJDK50,isInterface:isInterface,isImplementation:isImplementation,publicStaticFinalFlag:publicStaticFinalFlag,singleWildcard:singleWildcard,negativeOffsetCorrection:negativeOffsetCorrection,positiveOffsetCorrection:positiveOffsetCorrection"%>

				InternalPatternContext ictx = (InternalPatternContext) ctx;
				new Node.DataLeaf(ictx.getNode(), getClass(), null,
						stringBuffer.toString());
				stringBuffer.setLength(0);

				final Map<String, Object> callParameters = new HashMap<String, Object>();
				callParameters.put("genClass", genClass);
				callParameters.put("genPackage", genPackage);
				callParameters.put("genModel", genModel);
				callParameters.put("isJDK50", isJDK50);
				callParameters.put("isInterface", isInterface);
				callParameters.put("isImplementation", isImplementation);
				callParameters.put("publicStaticFinalFlag",
						publicStaticFinalFlag);
				callParameters.put("singleWildcard", singleWildcard);
				callParameters.put("negativeOffsetCorrection",
						negativeOffsetCorrection);
				callParameters.put("positiveOffsetCorrection",
						positiveOffsetCorrection);
				CallHelper
						.executeWithParameterInjection(
								"platform:/plugin/org.eclipse.egf.emf.pattern/egf/EMF_Pattern.fcore#_0uXvkGJ-Ed-FqczH3ESmRw",
								new ExecutionContext(
										(InternalPatternContext) ctx),
								callParameters);
				stringBuffer.setLength(0);
			}

			//Class/eIsSet.override.javajetinc
		}
		if (isImplementation
				&& (!genClass.getMixinGenFeatures().isEmpty() || genClass
						.hasOffsetCorrection()
						&& !genClass.getGenFeatures().isEmpty())) {
			if (!genClass.getMixinGenFeatures().isEmpty()) {
				stringBuffer.append(TEXT_267);
				if (genModel.useClassOverrideAnnotation()) {
					stringBuffer.append(TEXT_268);
				}
				stringBuffer.append(TEXT_269);
				stringBuffer.append(singleWildcard);
				stringBuffer.append(TEXT_270);
				for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
					stringBuffer.append(TEXT_271);
					stringBuffer.append(mixinGenClass
							.getRawImportedInterfaceName());
					stringBuffer.append(TEXT_272);
					stringBuffer.append(negativeOffsetCorrection);
					stringBuffer.append(TEXT_273);
					for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
						stringBuffer.append(TEXT_274);
						stringBuffer.append(genClass
								.getQualifiedFeatureID(genFeature));
						stringBuffer.append(TEXT_275);
						stringBuffer.append(mixinGenClass
								.getQualifiedFeatureID(genFeature));
						stringBuffer.append(TEXT_276);
					}
					stringBuffer.append(TEXT_277);
				}
				stringBuffer.append(TEXT_278);
			}
			stringBuffer.append(TEXT_279);
			if (genModel.useClassOverrideAnnotation()) {
				stringBuffer.append(TEXT_280);
			}
			stringBuffer.append(TEXT_281);
			stringBuffer.append(singleWildcard);
			stringBuffer.append(TEXT_282);
			for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
				stringBuffer.append(TEXT_283);
				stringBuffer
						.append(mixinGenClass.getRawImportedInterfaceName());
				stringBuffer.append(TEXT_284);
				for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
					stringBuffer.append(TEXT_285);
					stringBuffer.append(mixinGenClass
							.getQualifiedFeatureID(genFeature));
					stringBuffer.append(TEXT_286);
					stringBuffer.append(genClass
							.getQualifiedFeatureID(genFeature));
					stringBuffer.append(positiveOffsetCorrection);
					stringBuffer.append(TEXT_287);
				}
				stringBuffer.append(TEXT_288);
			}
			if (genClass.hasOffsetCorrection()
					&& !genClass.getGenFeatures().isEmpty()) {
				stringBuffer.append(TEXT_289);
				stringBuffer.append(genClass.getRawImportedInterfaceName());
				stringBuffer.append(TEXT_290);
				stringBuffer.append(negativeOffsetCorrection);
				stringBuffer.append(TEXT_291);
				for (GenFeature genFeature : genClass.getGenFeatures()) {
					stringBuffer.append(TEXT_292);
					stringBuffer.append(genClass
							.getQualifiedFeatureID(genFeature));
					stringBuffer.append(TEXT_293);
					stringBuffer.append(genClass
							.getQualifiedFeatureID(genFeature));
					stringBuffer.append(positiveOffsetCorrection);
					stringBuffer.append(TEXT_294);
				}
				stringBuffer.append(TEXT_295);
			}
			stringBuffer.append(TEXT_296);
		}
		if (isImplementation && genModel.isVirtualDelegation()) {
			String eVirtualValuesField = genClass.getEVirtualValuesField();
			if (eVirtualValuesField != null) {
				stringBuffer.append(TEXT_297);
				if (genModel.useClassOverrideAnnotation()) {
					stringBuffer.append(TEXT_298);
				}
				stringBuffer.append(TEXT_299);
				stringBuffer.append(eVirtualValuesField);
				stringBuffer.append(TEXT_300);
				if (genModel.useClassOverrideAnnotation()) {
					stringBuffer.append(TEXT_301);
				}
				stringBuffer.append(TEXT_302);
				stringBuffer.append(eVirtualValuesField);
				stringBuffer.append(TEXT_303);
			}
			{
				List<String> eVirtualIndexBitFields = genClass
						.getEVirtualIndexBitFields(new ArrayList<String>());
				if (!eVirtualIndexBitFields.isEmpty()) {
					List<String> allEVirtualIndexBitFields = genClass
							.getAllEVirtualIndexBitFields(new ArrayList<String>());
					stringBuffer.append(TEXT_304);
					if (genModel.useClassOverrideAnnotation()) {
						stringBuffer.append(TEXT_305);
					}
					stringBuffer.append(TEXT_306);
					for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
						stringBuffer.append(TEXT_307);
						stringBuffer.append(i);
						stringBuffer.append(TEXT_308);
						stringBuffer.append(allEVirtualIndexBitFields.get(i));
						stringBuffer.append(TEXT_309);
					}
					stringBuffer.append(TEXT_310);
					if (genModel.useClassOverrideAnnotation()) {
						stringBuffer.append(TEXT_311);
					}
					stringBuffer.append(TEXT_312);
					for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
						stringBuffer.append(TEXT_313);
						stringBuffer.append(i);
						stringBuffer.append(TEXT_314);
						stringBuffer.append(allEVirtualIndexBitFields.get(i));
						stringBuffer.append(TEXT_315);
					}
					stringBuffer.append(TEXT_316);
				}
			}
		}
		if (!genClass.hasImplementedToStringGenOperation() && isImplementation
				&& !genModel.isReflectiveDelegation()
				&& !genModel.isDynamicDelegation()
				&& !genClass.getToStringGenFeatures().isEmpty()) {
			stringBuffer.append(TEXT_317);
			if (genModel.useClassOverrideAnnotation()) {
				stringBuffer.append(TEXT_318);
			}
			stringBuffer.append(TEXT_319);
			{
				boolean first = true;
				for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
					if (first) {
						first = false;
						stringBuffer.append(TEXT_320);
						stringBuffer.append(genFeature.getName());
						stringBuffer.append(TEXT_321);
						stringBuffer.append(genModel.getNonNLS());
					} else {
						stringBuffer.append(TEXT_322);
						stringBuffer.append(genFeature.getName());
						stringBuffer.append(TEXT_323);
						stringBuffer.append(genModel.getNonNLS());
					}
					if (genFeature.isUnsettable() && !genFeature.isListType()) {
						if (genModel.isVirtualDelegation()
								&& !genFeature.isPrimitiveType()) {
							stringBuffer.append(TEXT_324);
							stringBuffer.append(genClass
									.getQualifiedFeatureID(genFeature));
							stringBuffer.append(positiveOffsetCorrection);
							stringBuffer.append(TEXT_325);
							stringBuffer.append(genClass
									.getQualifiedFeatureID(genFeature));
							stringBuffer.append(positiveOffsetCorrection);
							stringBuffer.append(TEXT_326);
							stringBuffer.append(genModel.getNonNLS());
						} else {
							if (genClass.isFlag(genFeature)) {
								if (genFeature.isBooleanType()) {
									stringBuffer.append(TEXT_327);
									if (genClass.isESetFlag(genFeature)) {
										stringBuffer.append(TEXT_328);
										stringBuffer.append(genClass
												.getESetFlagsField(genFeature));
										stringBuffer.append(TEXT_329);
										stringBuffer.append(genFeature
												.getUpperName());
										stringBuffer.append(TEXT_330);
									} else {
										stringBuffer.append(genFeature
												.getUncapName());
										stringBuffer.append(TEXT_331);
									}
									stringBuffer.append(TEXT_332);
									stringBuffer.append(genClass
											.getFlagsField(genFeature));
									stringBuffer.append(TEXT_333);
									stringBuffer.append(genFeature
											.getUpperName());
									stringBuffer.append(TEXT_334);
									stringBuffer.append(genModel.getNonNLS());
								} else {
									stringBuffer.append(TEXT_335);
									if (genClass.isESetFlag(genFeature)) {
										stringBuffer.append(TEXT_336);
										stringBuffer.append(genClass
												.getESetFlagsField(genFeature));
										stringBuffer.append(TEXT_337);
										stringBuffer.append(genFeature
												.getUpperName());
										stringBuffer.append(TEXT_338);
									} else {
										stringBuffer.append(genFeature
												.getUncapName());
										stringBuffer.append(TEXT_339);
									}
									stringBuffer.append(TEXT_340);
									stringBuffer.append(genFeature
											.getUpperName());
									stringBuffer.append(TEXT_341);
									stringBuffer.append(genClass
											.getFlagsField(genFeature));
									stringBuffer.append(TEXT_342);
									stringBuffer.append(genFeature
											.getUpperName());
									stringBuffer.append(TEXT_343);
									stringBuffer.append(genFeature
											.getUpperName());
									stringBuffer.append(TEXT_344);
									stringBuffer.append(genModel.getNonNLS());
								}
							} else {
								stringBuffer.append(TEXT_345);
								if (genClass.isESetFlag(genFeature)) {
									stringBuffer.append(TEXT_346);
									stringBuffer.append(genClass
											.getESetFlagsField(genFeature));
									stringBuffer.append(TEXT_347);
									stringBuffer.append(genFeature
											.getUpperName());
									stringBuffer.append(TEXT_348);
								} else {
									stringBuffer.append(genFeature
											.getUncapName());
									stringBuffer.append(TEXT_349);
								}
								stringBuffer.append(TEXT_350);
								stringBuffer.append(genFeature.getSafeName());
								stringBuffer.append(TEXT_351);
								stringBuffer.append(genModel.getNonNLS());
							}
						}
					} else {
						if (genModel.isVirtualDelegation()
								&& !genFeature.isPrimitiveType()) {
							stringBuffer.append(TEXT_352);
							stringBuffer.append(genClass
									.getQualifiedFeatureID(genFeature));
							stringBuffer.append(positiveOffsetCorrection);
							if (!genFeature.isListType()
									&& !genFeature.isReferenceType()) {
								stringBuffer.append(TEXT_353);
								stringBuffer.append(genFeature.getEDefault());
							}
							stringBuffer.append(TEXT_354);
						} else {
							if (genClass.isFlag(genFeature)) {
								if (genFeature.isBooleanType()) {
									stringBuffer.append(TEXT_355);
									stringBuffer.append(genClass
											.getFlagsField(genFeature));
									stringBuffer.append(TEXT_356);
									stringBuffer.append(genFeature
											.getUpperName());
									stringBuffer.append(TEXT_357);
								} else {
									stringBuffer.append(TEXT_358);
									stringBuffer.append(genFeature
											.getUpperName());
									stringBuffer.append(TEXT_359);
									stringBuffer.append(genClass
											.getFlagsField(genFeature));
									stringBuffer.append(TEXT_360);
									stringBuffer.append(genFeature
											.getUpperName());
									stringBuffer.append(TEXT_361);
									stringBuffer.append(genFeature
											.getUpperName());
									stringBuffer.append(TEXT_362);
								}
							} else {
								stringBuffer.append(TEXT_363);
								stringBuffer.append(genFeature.getSafeName());
								stringBuffer.append(TEXT_364);
							}
						}
					}
				}
			}
			stringBuffer.append(TEXT_365);
		}
		if (isImplementation && genClass.isMapEntry()) {
			GenFeature keyFeature = genClass.getMapEntryKeyFeature();
			GenFeature valueFeature = genClass.getMapEntryValueFeature();
			String objectType = genModel.getImportedName("java.lang.Object");
			String keyType = isJDK50 ? keyFeature.getObjectType(genClass)
					: objectType;
			String valueType = isJDK50 ? valueFeature.getObjectType(genClass)
					: objectType;
			String eMapType = genModel
					.getImportedName("org.eclipse.emf.common.util.EMap")
					+ (isJDK50 ? "<" + keyType + ", " + valueType + ">" : "");
			stringBuffer.append(TEXT_366);
			stringBuffer.append(objectType);
			stringBuffer.append(TEXT_367);
			stringBuffer.append(keyType);
			stringBuffer.append(TEXT_368);
			if (!isJDK50 && keyFeature.isPrimitiveType()) {
				stringBuffer.append(TEXT_369);
				stringBuffer.append(keyFeature.getObjectType(genClass));
				stringBuffer.append(TEXT_370);
			} else {
				stringBuffer.append(TEXT_371);
			}
			stringBuffer.append(TEXT_372);
			stringBuffer.append(keyType);
			stringBuffer.append(TEXT_373);
			if (keyFeature.isListType()) {
				stringBuffer.append(TEXT_374);
				if (!genModel.useGenerics()) {
					stringBuffer.append(TEXT_375);
					stringBuffer.append(genModel
							.getImportedName("java.util.Collection"));
					stringBuffer.append(TEXT_376);
				}
				stringBuffer.append(TEXT_377);
			} else if (isJDK50) {
				stringBuffer.append(TEXT_378);
			} else if (keyFeature.isPrimitiveType()) {
				stringBuffer.append(TEXT_379);
				stringBuffer.append(keyFeature.getObjectType(genClass));
				stringBuffer.append(TEXT_380);
				stringBuffer.append(keyFeature.getPrimitiveValueFunction());
				stringBuffer.append(TEXT_381);
			} else {
				stringBuffer.append(TEXT_382);
				stringBuffer.append(keyFeature.getImportedType(genClass));
				stringBuffer.append(TEXT_383);
			}
			stringBuffer.append(TEXT_384);
			stringBuffer.append(valueType);
			stringBuffer.append(TEXT_385);
			if (!isJDK50 && valueFeature.isPrimitiveType()) {
				stringBuffer.append(TEXT_386);
				stringBuffer.append(valueFeature.getObjectType(genClass));
				stringBuffer.append(TEXT_387);
			} else {
				stringBuffer.append(TEXT_388);
			}
			stringBuffer.append(TEXT_389);
			stringBuffer.append(valueType);
			stringBuffer.append(TEXT_390);
			stringBuffer.append(valueType);
			stringBuffer.append(TEXT_391);
			stringBuffer.append(valueType);
			stringBuffer.append(TEXT_392);
			if (valueFeature.isListType()) {
				stringBuffer.append(TEXT_393);
				if (!genModel.useGenerics()) {
					stringBuffer.append(TEXT_394);
					stringBuffer.append(genModel
							.getImportedName("java.util.Collection"));
					stringBuffer.append(TEXT_395);
				}
				stringBuffer.append(TEXT_396);
			} else if (isJDK50) {
				stringBuffer.append(TEXT_397);
			} else if (valueFeature.isPrimitiveType()) {
				stringBuffer.append(TEXT_398);
				stringBuffer.append(valueFeature.getObjectType(genClass));
				stringBuffer.append(TEXT_399);
				stringBuffer.append(valueFeature.getPrimitiveValueFunction());
				stringBuffer.append(TEXT_400);
			} else {
				stringBuffer.append(TEXT_401);
				stringBuffer.append(valueFeature.getImportedType(genClass));
				stringBuffer.append(TEXT_402);
			}
			stringBuffer.append(TEXT_403);
			if (genModel.useGenerics()) {
				stringBuffer.append(TEXT_404);
			}
			stringBuffer.append(TEXT_405);
			stringBuffer.append(eMapType);
			stringBuffer.append(TEXT_406);
			stringBuffer.append(genModel
					.getImportedName("org.eclipse.emf.ecore.EObject"));
			stringBuffer.append(TEXT_407);
			stringBuffer.append(eMapType);
			stringBuffer.append(TEXT_408);
		}
		stringBuffer.append(TEXT_409);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.eclipse.egf.emf.pattern/egf/EMF_Pattern.fcore#LogicalName=org.eclipse.egf.emf.pattern.model.call.Class.Class.insert" args="genClass:genClass,genPackage:genPackage,genModel:genModel,isJDK50:isJDK50,isInterface:isInterface,isImplementation:isImplementation,publicStaticFinalFlag:publicStaticFinalFlag,singleWildcard:singleWildcard,negativeOffsetCorrection:negativeOffsetCorrection,positiveOffsetCorrection:positiveOffsetCorrection"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null,
					stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("genClass", genClass);
			callParameters.put("genPackage", genPackage);
			callParameters.put("genModel", genModel);
			callParameters.put("isJDK50", isJDK50);
			callParameters.put("isInterface", isInterface);
			callParameters.put("isImplementation", isImplementation);
			callParameters.put("publicStaticFinalFlag", publicStaticFinalFlag);
			callParameters.put("singleWildcard", singleWildcard);
			callParameters.put("negativeOffsetCorrection",
					negativeOffsetCorrection);
			callParameters.put("positiveOffsetCorrection",
					positiveOffsetCorrection);
			CallHelper
					.executeWithParameterInjection(
							"platform:/plugin/org.eclipse.egf.emf.pattern/egf/EMF_Pattern.fcore#_0ug5gGJ-Ed-FqczH3ESmRw",
							new ExecutionContext((InternalPatternContext) ctx),
							callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_410);
		stringBuffer.append(isInterface ? " " + genClass.getInterfaceName()
				: genClass.getClassName());
		// TODO fix the space above
		genModel.emitSortedImports();
		stringBuffer.append(TEXT_411);
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "doGenerate",
				stringBuffer.toString());
	}
}