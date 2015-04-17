//Generated with EGF 1.2.0.v20150211-1405
package org.polarsys.kitalpha.emde.egf.model;

import org.polarsys.kitalpha.emde.egf.helper.*;
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

public class ResourceClass extends org.eclipse.egf.emf.pattern.model.ResourceClass {
	protected static String nl;

	public static synchronized ResourceClass create(String lineSeparator) {
		nl = lineSeparator;
		ResourceClass result = new ResourceClass();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "";
	protected final String TEXT_2 = NL + "package ";
	protected final String TEXT_3 = ";" + NL;
	protected final String TEXT_4 = NL + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * The <b>Resource </b> associated with the package." + NL + " * <!-- end-user-doc -->" + NL + " * @see ";
	protected final String TEXT_5 = NL + " * @generated" + NL + " */" + NL + "public class ";
	protected final String TEXT_6 = " extends ";
	protected final String TEXT_7 = NL + "{";
	protected final String TEXT_8 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
	protected final String TEXT_9 = " copyright = ";
	protected final String TEXT_10 = ";";
	protected final String TEXT_11 = NL;
	protected final String TEXT_12 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */  " + NL + "\tprivate ";
	protected final String TEXT_13 = "<Object> lookupTable = new ";
	protected final String TEXT_14 = "<Object>();" + NL + "  " + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */  " + NL + "\tprivate ";
	protected final String TEXT_15 = " parserPool = new ";
	protected final String TEXT_16 = "();  " + NL + "  " + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */  " + NL + "\tprivate ";
	protected final String TEXT_17 = "<Object, Object> nameToFeatureMap = new ";
	protected final String TEXT_18 = "<Object, Object>();" + NL + "\t";
	protected final String TEXT_19 = NL + "\t/**" + NL + "\t * Creates an instance of the resource." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param uri the URI of the new resource." + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
	protected final String TEXT_20 = "(URI uri)" + NL + "\t{" + NL + "\t\tsuper(uri);" + NL + "\t}\t";
	protected final String TEXT_21 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
	protected final String TEXT_22 = NL + "\t@Override";
	protected final String TEXT_23 = NL + "\tprotected ";
	protected final String TEXT_24 = " createXMLSave() {";
	protected final String TEXT_25 = NL + "\t\treturn new ";
	protected final String TEXT_26 = "(createXMLHelper());";
	protected final String TEXT_27 = NL + "\t\treturn new ";
	protected final String TEXT_28 = "(createXMLHelper());";
	protected final String TEXT_29 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
	protected final String TEXT_30 = NL + "\t@Override";
	protected final String TEXT_31 = NL + "\tprotected ";
	protected final String TEXT_32 = " createXMLHelper() {";
	protected final String TEXT_33 = NL + "\t\treturn new ";
	protected final String TEXT_34 = "(this);";
	protected final String TEXT_35 = NL + "\t\treturn new ";
	protected final String TEXT_36 = "(this);";
	protected final String TEXT_37 = "\t" + NL + "\t}" + NL + "\t" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
	protected final String TEXT_38 = NL + "\t@Override";
	protected final String TEXT_39 = NL + "\tprotected ";
	protected final String TEXT_40 = " createXMLLoad() {";
	protected final String TEXT_41 = NL + "\t\treturn new ";
	protected final String TEXT_42 = "((";
	protected final String TEXT_43 = ") createXMLHelper());";
	protected final String TEXT_44 = NL + "\t\treturn new ";
	protected final String TEXT_45 = "((";
	protected final String TEXT_46 = ") createXMLHelper());";
	protected final String TEXT_47 = "\t" + NL + "\t}\t";
	protected final String TEXT_48 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
	protected final String TEXT_49 = NL + "\t@Override";
	protected final String TEXT_50 = NL + "\tprotected boolean useIDAttributes() {" + NL + "\t\treturn false;" + NL + "\t}";
	protected final String TEXT_51 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
	protected final String TEXT_52 = NL + "\t@Override";
	protected final String TEXT_53 = NL + "\tprotected boolean useUUIDs() {" + NL + "\t\treturn true;" + NL + "\t}";
	protected final String TEXT_54 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
	protected final String TEXT_55 = NL + "\t@Override";
	protected final String TEXT_56 = NL + "\tprotected void init() {" + NL + "\t\tsuper.init();";
	protected final String TEXT_57 = NL + "\t\tsetTrackingModification(true);";
	protected final String TEXT_58 = NL + "\t\tsetEncoding(\"UTF-8\"); ";
	protected final String TEXT_59 = NL + "\t\tsetXMIVersion(\"2.1\"); ";
	protected final String TEXT_60 = NL + "\t\t// Save Options" + NL + "\t\tgetDefaultSaveOptions().put(";
	protected final String TEXT_61 = ".OPTION_CONFIGURATION_CACHE, Boolean.TRUE);" + NL + "\t\tgetDefaultSaveOptions().put(";
	protected final String TEXT_62 = ".OPTION_USE_CACHED_LOOKUP_TABLE, lookupTable);    " + NL + "\t\tgetDefaultSaveOptions().put(";
	protected final String TEXT_63 = ".OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);" + NL + "\t\tgetDefaultSaveOptions().put(";
	protected final String TEXT_64 = ".OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);" + NL + "\t\tgetDefaultSaveOptions().put(";
	protected final String TEXT_65 = ".OPTION_SAVE_TYPE_INFORMATION, new ";
	protected final String TEXT_66 = "() {" + NL + "\t\t\tpublic boolean shouldSaveType(";
	protected final String TEXT_67 = " objectType, ";
	protected final String TEXT_68 = " featureType, ";
	protected final String TEXT_69 = " feature) {" + NL + "\t\t\t\treturn objectType != featureType && objectType != ";
	protected final String TEXT_70 = ".Literals.ANY_TYPE;" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\tpublic boolean shouldSaveType(";
	protected final String TEXT_71 = " objectType, EClass featureType, ";
	protected final String TEXT_72 = " feature) {" + NL + "\t\t\t\treturn objectType != featureType && objectType != ";
	protected final String TEXT_73 = ".Literals.ANY_TYPE;" + NL + "\t\t\t}" + NL + "\t\t});" + NL + "\t\tgetDefaultSaveOptions().put(";
	protected final String TEXT_74 = ".OPTION_LINE_WIDTH, new Integer(80));" + NL + "\t\tgetDefaultSaveOptions().put(";
	protected final String TEXT_75 = ".OPTION_URI_HANDLER, new ";
	protected final String TEXT_76 = ".PlatformSchemeAware());" + NL + "\t\tgetDefaultSaveOptions().put(";
	protected final String TEXT_77 = ".OPTION_EXTENDED_META_DATA, Boolean.TRUE);";
	protected final String TEXT_78 = NL + "\t\tgetDefaultSaveOptions().put(";
	protected final String TEXT_79 = ".OPTION_USE_XMI_TYPE, Boolean.TRUE);";
	protected final String TEXT_80 = "\t\t\t\t\t\t        " + NL + "\t\t// Load Options" + NL + "\t\tgetDefaultLoadOptions().put(";
	protected final String TEXT_81 = ".OPTION_DEFER_ATTACHMENT, Boolean.FALSE);" + NL + "\t\tgetDefaultLoadOptions().put(";
	protected final String TEXT_82 = ".OPTION_DEFER_IDREF_RESOLUTION, Boolean.FALSE);" + NL + "\t\tgetDefaultLoadOptions().put(";
	protected final String TEXT_83 = ".OPTION_USE_DEPRECATED_METHODS, Boolean.TRUE);" + NL + "\t\tgetDefaultLoadOptions().put(";
	protected final String TEXT_84 = ".OPTION_USE_PARSER_POOL, parserPool);" + NL + "\t\tgetDefaultLoadOptions().put(";
	protected final String TEXT_85 = ".OPTION_USE_XML_NAME_TO_FEATURE_MAP, nameToFeatureMap);" + NL + "\t\tgetDefaultLoadOptions().put(";
	protected final String TEXT_86 = ".OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);" + NL + "\t\tgetDefaultLoadOptions().put(";
	protected final String TEXT_87 = ".OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);" + NL + "\t\tgetDefaultLoadOptions().put(";
	protected final String TEXT_88 = ".OPTION_EXTENDED_META_DATA, Boolean.TRUE);\t\t" + NL + "\t}" + NL + "\t// override to integrate the bug fix" + NL + "\t// https://bugs.eclipse.org/bugs/show_bug.cgi?id=412753. The bug has been" + NL + "\t// resolved in EMF 2.9.1 and 2.10" + NL + "\t";
	protected final String TEXT_89 = NL + "\t@Override" + NL + "\t";
	protected final String TEXT_90 = NL + "\tprotected void detachedHelper(";
	protected final String TEXT_91 = " eObject) {" + NL + "\t\tif (useIDs() && unloadingContents == null) {" + NL + "\t\t\tif (useUUIDs()) {" + NL + "\t\t\t\tDETACHED_EOBJECT_TO_ID_MAP.put(eObject, getID(eObject));" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\tif (idToEObjectMap != null && eObjectToIDMap != null) {" + NL + "\t\t\t\tsetID(eObject, null);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tresourceImplDetachedHelper(eObject);" + NL + "\t}" + NL + "\t" + NL + "\t// Duplicated from" + NL + "\t// org.eclipse.emf.ecore.resource.impl.ResourceImpl.detachedHelper(EObject)" + NL + "\tprivate void resourceImplDetachedHelper(";
	protected final String TEXT_92 = " eObject) {" + NL + "\t\tMap<String, EObject> map = getIntrinsicIDToEObjectMap();" + NL + "\t\tif (map != null) {" + NL + "\t\t\tString id = ";
	protected final String TEXT_93 = ".getID(eObject);" + NL + "\t\t\tif (id != null) {" + NL + "\t\t\t\tmap.remove(id);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "" + NL + "\t\tif (isTrackingModification()) {" + NL + "\t\t\teObject.eAdapters().remove(modificationTrackingAdapter);" + NL + "\t\t}" + NL + "\t}" + NL + "\t" + NL + "\t";
	protected final String TEXT_94 = NL + "\t/**" + NL + "\t * A load option that turns of the use of the generate data converters." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final String OPTION_USE_DATA_CONVERTER = \"USE_DATA_CONVERTER\"; ";
	protected final String TEXT_95 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
	protected final String TEXT_96 = NL + "\t@Override";
	protected final String TEXT_97 = NL + "\tpublic void doLoad(InputStream inputStream, ";
	protected final String TEXT_98 = " options) throws IOException" + NL + "\t{" + NL + "\t\tif (options != null && Boolean.TRUE.equals(options.get(OPTION_USE_DATA_CONVERTER)))" + NL + "\t\t{" + NL + "\t\t  getContents().add" + NL + "\t\t\t (load" + NL + "\t\t\t\t (new InputSource(inputStream), " + NL + "\t\t\t\t  (";
	protected final String TEXT_99 = ")options.get(XMLResource.OPTION_PARSER_FEATURES), " + NL + "\t\t\t\t  (";
	protected final String TEXT_100 = ")options.get(XMLResource.OPTION_PARSER_PROPERTIES), " + NL + "\t\t\t\t  Boolean.TRUE.equals(options.get(XMLResource.OPTION_USE_LEXICAL_HANDLER))).eContainer());" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{  " + NL + "\t\t\tsuper.doLoad(inputStream, options);" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
	protected final String TEXT_101 = NL + "\t@Override";
	protected final String TEXT_102 = NL + "\tpublic void doLoad(InputSource inputSource, ";
	protected final String TEXT_103 = " options) throws IOException" + NL + "\t{" + NL + "\t\tif (options != null && Boolean.TRUE.equals(options.get(OPTION_USE_DATA_CONVERTER)))" + NL + "\t\t{" + NL + "\t\t  getContents().add" + NL + "\t\t\t (load" + NL + "\t\t\t\t (inputSource," + NL + "\t\t\t\t  (";
	protected final String TEXT_104 = ")options.get(XMLResource.OPTION_PARSER_FEATURES), " + NL + "\t\t\t\t  (";
	protected final String TEXT_105 = ")options.get(XMLResource.OPTION_PARSER_PROPERTIES), " + NL + "\t\t\t\t  Boolean.TRUE.equals(options.get(XMLResource.OPTION_USE_LEXICAL_HANDLER))).eContainer());" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{  " + NL + "\t\t\tsuper.doLoad(inputSource, options);" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected static final XMLParserPool parserPool = new XMLParserPoolImpl();" + NL + "" + NL + "\t/**" + NL + "\t * Loads an instance from the input." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param inputSource the input from which to load." + NL
			+ "\t * @param features a map of the parser features and their values." + NL + "\t * @param properties a map of a parser properties and their values." + NL + "\t * @param useLexicalHandler whether a lexical handler should be used during loading." + NL + "\t * @return the root object; for the case of a document root, the child of that document root is return." + NL + "\t * @throws ParserConfigurationException" + NL + "\t * @throws SAXException" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static EObject load(InputSource inputSource, ";
	protected final String TEXT_106 = " features, ";
	protected final String TEXT_107 = " properties, boolean useLexicalHandler) throws IOException" + NL + "\t{" + NL + "\t\t";
	protected final String TEXT_108 = " requiredFeatures = new ";
	protected final String TEXT_109 = "();" + NL + "\t\trequiredFeatures.put(\"http://xml.org/sax/features/namespaces\", Boolean.TRUE); ";
	protected final String TEXT_110 = " " + NL + "\t\tif (features != null)" + NL + "\t\t{" + NL + "\t\t\trequiredFeatures.putAll(features);" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tif (properties == null)" + NL + "\t\t{" + NL + "\t\t\tproperties = Collections.";
	protected final String TEXT_111 = "emptyMap()";
	protected final String TEXT_112 = "EMPTY_MAP";
	protected final String TEXT_113 = ";" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tSAXParser saxParser = null;" + NL + "\t\ttry" + NL + "\t\t{" + NL + "\t\t\tsaxParser = parserPool.get(requiredFeatures, properties, useLexicalHandler);" + NL + "\t\t\tfinal FrameFactory.DocumentRootStackFrame documentRoot = FrameFactory.INSTANCE.pushDocumentRoot(null, null);" + NL + "\t\t\tXMLTypeResourceImpl.Handler handler = new XMLTypeResourceImpl.Handler(documentRoot);" + NL + "\t\t\tsaxParser.parse(inputSource, handler);";
	protected final String TEXT_114 = NL + "\t\t\treturn (EObject)((EObject)FrameFactory.INSTANCE.popDocumentRoot(documentRoot)).eContents().get(0);";
	protected final String TEXT_115 = NL + "\t\t\treturn FrameFactory.INSTANCE.popDocumentRoot(documentRoot).eContents().get(0);";
	protected final String TEXT_116 = NL + "\t\t}" + NL + "\t\tcatch (Exception exception)" + NL + "\t\t{" + NL + "\t\t\tthrow new IOWrappedException(exception);" + NL + "\t\t}" + NL + "\t\tfinally" + NL + "\t\t{" + NL + "\t\t\tparserPool.release(saxParser, requiredFeatures, properties, useLexicalHandler);" + NL + "\t\t}" + NL + "\t}" + NL;
	protected final String TEXT_117 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic final static class FrameFactory" + NL + "\t{" + NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic static final FrameFactory INSTANCE = new FrameFactory();" + NL + "\t";
	protected final String TEXT_118 = NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprotected ";
	protected final String TEXT_119 = "StackFrame ";
	protected final String TEXT_120 = ";" + NL;
	protected final String TEXT_121 = NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprotected ";
	protected final String TEXT_122 = " ";
	protected final String TEXT_123 = ";" + NL;
	protected final String TEXT_124 = NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic ";
	protected final String TEXT_125 = "StackFrame push";
	protected final String TEXT_126 = "(";
	protected final String TEXT_127 = " previous, Attributes attributes)" + NL + "\t\t{" + NL + "\t\t\t ";
	protected final String TEXT_128 = "StackFrame result";
	protected final String TEXT_129 = " = ";
	protected final String TEXT_130 = " == null ? new ";
	protected final String TEXT_131 = "StackFrame() : ";
	protected final String TEXT_132 = ";" + NL + "\t\t\t ";
	protected final String TEXT_133 = " = null;" + NL + "\t\t\t result";
	protected final String TEXT_134 = ".pushOnto(previous);" + NL + "\t\t\t result";
	protected final String TEXT_135 = ".handleAttributes(attributes);" + NL + "\t\t\t return result";
	protected final String TEXT_136 = ";" + NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic ";
	protected final String TEXT_137 = " pop";
	protected final String TEXT_138 = "(";
	protected final String TEXT_139 = "StackFrame ";
	protected final String TEXT_140 = ")" + NL + "\t\t{" + NL + "\t\t\t";
	protected final String TEXT_141 = " result";
	protected final String TEXT_142 = "Value = ";
	protected final String TEXT_143 = ".pop";
	protected final String TEXT_144 = "();" + NL + "\t\t\tthis.";
	protected final String TEXT_145 = " = ";
	protected final String TEXT_146 = ";" + NL + "\t\t\treturn result";
	protected final String TEXT_147 = "Value;" + NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic static class ";
	protected final String TEXT_148 = "StackFrame extends ";
	protected final String TEXT_149 = NL + "\t\t{" + NL + "\t\t\t/**" + NL + "\t\t\t * <!-- begin-user-doc -->" + NL + "\t\t\t * <!-- end-user-doc -->" + NL + "\t\t\t * @generated" + NL + "\t\t\t */" + NL + "\t\t\tprotected ";
	protected final String TEXT_150 = " the";
	protected final String TEXT_151 = ";" + NL + "\t\t";
	protected final String TEXT_152 = NL + "\t\t\t/**" + NL + "\t\t\t * <!-- begin-user-doc -->" + NL + "\t\t\t * <!-- end-user-doc -->" + NL + "\t\t\t * @generated" + NL + "\t\t\t */" + NL + "\t\t\tprotected ";
	protected final String TEXT_153 = ".FrameFactory.";
	protected final String TEXT_154 = "StackFrame ";
	protected final String TEXT_155 = ";" + NL;
	protected final String TEXT_156 = NL + "\t\t\t/**" + NL + "\t\t\t * <!-- begin-user-doc -->" + NL + "\t\t\t * <!-- end-user-doc -->" + NL + "\t\t\t * @generated" + NL + "\t\t\t */" + NL + "\t\t\tprotected ";
	protected final String TEXT_157 = " ";
	protected final String TEXT_158 = ";" + NL + "\t\t";
	protected final String TEXT_159 = NL + "\t\t\t/**" + NL + "\t\t\t * <!-- begin-user-doc -->" + NL + "\t\t\t * <!-- end-user-doc -->" + NL + "\t\t\t * @generated" + NL + "\t\t\t */";
	protected final String TEXT_160 = NL + "\t\t\t@Override";
	protected final String TEXT_161 = NL + "\t\t\tpublic void handleAttributes(Attributes attributes)" + NL + "\t\t\t{";
	protected final String TEXT_162 = NL + "\t\t\t\tString theValue = attributes.getValue(";
	protected final String TEXT_163 = ", \"";
	protected final String TEXT_164 = "\");";
	protected final String TEXT_165 = NL + "\t\t\t\ttheValue = attributes.getValue(";
	protected final String TEXT_166 = ", \"";
	protected final String TEXT_167 = "\");";
	protected final String TEXT_168 = NL + "\t\t\t\tif (theValue != null)" + NL + "\t\t\t\t{";
	protected final String TEXT_169 = NL + "\t\t\t\t\tthe";
	protected final String TEXT_170 = ".set";
	protected final String TEXT_171 = "(";
	protected final String TEXT_172 = ".create";
	protected final String TEXT_173 = "(theValue));";
	protected final String TEXT_174 = NL + "\t\t\t\t\tthe";
	protected final String TEXT_175 = ".set";
	protected final String TEXT_176 = "((";
	protected final String TEXT_177 = ")";
	protected final String TEXT_178 = ".createFromString(";
	protected final String TEXT_179 = ", theValue));";
	protected final String TEXT_180 = NL + "\t\t\t\t}";
	protected final String TEXT_181 = NL + "\t\t\t\t// There are attributes to handle.";
	protected final String TEXT_182 = NL + "\t\t\t}" + NL + "\t\t" + NL + "\t\t\t/**" + NL + "\t\t\t * <!-- begin-user-doc -->" + NL + "\t\t\t * <!-- end-user-doc -->" + NL + "\t\t\t * @generated" + NL + "\t\t\t */";
	protected final String TEXT_183 = NL + "\t\t\t@Override";
	protected final String TEXT_184 = NL + "\t\t\tpublic ";
	protected final String TEXT_185 = " startElement(String namespace, String localName, String qName, Attributes attributes) throws SAXException" + NL + "\t\t\t{";
	protected final String TEXT_186 = NL + "\t\t\t\t";
	protected final String TEXT_187 = "else ";
	protected final String TEXT_188 = "if (\"";
	protected final String TEXT_189 = "\".equals(localName) && ";
	protected final String TEXT_190 = ".equals(namespace))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\treturn ";
	protected final String TEXT_191 = " = ";
	protected final String TEXT_192 = ".FrameFactory.INSTANCE.push";
	protected final String TEXT_193 = "(this, attributes);" + NL + "\t\t\t\t}";
	protected final String TEXT_194 = NL + "\t\t\t\treturn super.startElement(namespace, localName, qName, attributes);";
	protected final String TEXT_195 = NL + "\t\t\t\telse" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\treturn super.startElement(namespace, localName, qName, attributes);" + NL + "\t\t\t\t}";
	protected final String TEXT_196 = NL + "\t\t\t}" + NL + "" + NL + "\t\t\t/**" + NL + "\t\t\t * <!-- begin-user-doc -->" + NL + "\t\t\t * <!-- end-user-doc -->" + NL + "\t\t\t * @generated" + NL + "\t\t\t */";
	protected final String TEXT_197 = NL + "\t\t\t@Override";
	protected final String TEXT_198 = NL + "\t\t\tpublic void endElement(";
	protected final String TEXT_199 = " child) throws SAXException" + NL + "\t\t\t{";
	protected final String TEXT_200 = NL + "\t\t\t\t";
	protected final String TEXT_201 = "else ";
	protected final String TEXT_202 = "if (child == ";
	protected final String TEXT_203 = ")" + NL + "\t\t\t\t{";
	protected final String TEXT_204 = NL + "\t\t\t\t\tthe";
	protected final String TEXT_205 = ".";
	protected final String TEXT_206 = "().add(";
	protected final String TEXT_207 = ".FrameFactory.INSTANCE.pop";
	protected final String TEXT_208 = "(";
	protected final String TEXT_209 = "));";
	protected final String TEXT_210 = NL + "\t\t\t\t\tthe";
	protected final String TEXT_211 = ".set";
	protected final String TEXT_212 = "(";
	protected final String TEXT_213 = ".FrameFactory.INSTANCE.pop";
	protected final String TEXT_214 = "(";
	protected final String TEXT_215 = "));";
	protected final String TEXT_216 = NL + "\t\t\t\t\t";
	protected final String TEXT_217 = " = null;" + NL + "\t\t\t\t}";
	protected final String TEXT_218 = NL + "\t\t\t\tsuper.endElement(child);";
	protected final String TEXT_219 = NL + "\t\t\t\telse" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tsuper.endElement(child);" + NL + "\t\t\t\t}";
	protected final String TEXT_220 = NL + "\t\t\t}" + NL + "" + NL + "\t\t\t/**" + NL + "\t\t\t * <!-- begin-user-doc -->" + NL + "\t\t\t * <!-- end-user-doc -->" + NL + "\t\t\t * @generated" + NL + "\t\t\t */";
	protected final String TEXT_221 = NL + "\t\t\t@Override";
	protected final String TEXT_222 = NL + "\t\t\tpublic void create()" + NL + "\t\t\t{" + NL + "\t\t\t\tthe";
	protected final String TEXT_223 = " = ";
	protected final String TEXT_224 = ".create";
	protected final String TEXT_225 = "();" + NL + "\t\t\t}" + NL + "\t\t" + NL + "\t\t\t/**" + NL + "\t\t\t * <!-- begin-user-doc -->" + NL + "\t\t\t * <!-- end-user-doc -->" + NL + "\t\t\t * @generated" + NL + "\t\t\t */" + NL + "\t\t\tprotected ";
	protected final String TEXT_226 = " pop";
	protected final String TEXT_227 = "()" + NL + "\t\t\t{" + NL + "\t\t\t\tpop();" + NL + "\t\t\t\t";
	protected final String TEXT_228 = " result";
	protected final String TEXT_229 = "Value = the";
	protected final String TEXT_230 = ";" + NL + "\t\t\t\tthe";
	protected final String TEXT_231 = " = null;" + NL + "\t\t\t\treturn result";
	protected final String TEXT_232 = "Value;" + NL + "\t\t\t}" + NL + "\t\t" + NL + "\t\t}" + NL;
	protected final String TEXT_233 = NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic ";
	protected final String TEXT_234 = " push";
	protected final String TEXT_235 = "(";
	protected final String TEXT_236 = " previous, Attributes attributes)" + NL + "\t\t{" + NL + "\t\t\t ";
	protected final String TEXT_237 = " result";
	protected final String TEXT_238 = " = ";
	protected final String TEXT_239 = " == null ? new ";
	protected final String TEXT_240 = "() : ";
	protected final String TEXT_241 = ";" + NL + "\t\t\t ";
	protected final String TEXT_242 = " = null;" + NL + "\t\t\t result";
	protected final String TEXT_243 = ".pushOnto(previous);" + NL + "\t\t\t result";
	protected final String TEXT_244 = ".handleAttributes(attributes);" + NL + "\t\t\t return result";
	protected final String TEXT_245 = ";" + NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic ";
	protected final String TEXT_246 = " pop";
	protected final String TEXT_247 = "(";
	protected final String TEXT_248 = " ";
	protected final String TEXT_249 = ")" + NL + "\t\t{";
	protected final String TEXT_250 = NL + "\t\t\t";
	protected final String TEXT_251 = " result";
	protected final String TEXT_252 = "Value = ";
	protected final String TEXT_253 = ".create";
	protected final String TEXT_254 = "(";
	protected final String TEXT_255 = ".popValue());";
	protected final String TEXT_256 = NL + "\t\t\t";
	protected final String TEXT_257 = " result";
	protected final String TEXT_258 = "Value = ((";
	protected final String TEXT_259 = ")";
	protected final String TEXT_260 = ".createFromString(";
	protected final String TEXT_261 = ", ";
	protected final String TEXT_262 = ".popValue())).";
	protected final String TEXT_263 = "();";
	protected final String TEXT_264 = NL + "\t\t\t";
	protected final String TEXT_265 = " result";
	protected final String TEXT_266 = "Value = (";
	protected final String TEXT_267 = ")";
	protected final String TEXT_268 = ".createFromString(";
	protected final String TEXT_269 = ", ";
	protected final String TEXT_270 = ".popValue());";
	protected final String TEXT_271 = NL + "\t\t\tthis.";
	protected final String TEXT_272 = " = ";
	protected final String TEXT_273 = ";" + NL + "\t\t\treturn result";
	protected final String TEXT_274 = "Value;" + NL + "\t\t}" + NL;
	protected final String TEXT_275 = NL + "\t}" + NL;
	protected final String TEXT_276 = NL + "} //";
	protected final String TEXT_277 = NL;
	protected final String TEXT_278 = NL;

	public ResourceClass() {
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

			this.parameter = (org.eclipse.emf.codegen.ecore.genmodel.GenPackage) parameterParameter;

			if (preCondition(ctx)) {
				ctx.setNode(new Node.Container(currentNode, getClass()));
				orchestration(ctx);
			}

		}
		ctx.setNode(currentNode);
		if (ctx.useReporter()) {
			ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
		}

		stringBuffer.append(TEXT_277);
		stringBuffer.append(TEXT_278);
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
			ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
		}
		return null;
	}

	public Map<String, Object> getParameters() {
		final Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter", this.parameter);
		return parameters;
	}

	protected void method_doGenerate(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

		/**
		 * <copyright>
		 *
		 * Copyright (c) 2002-2006 IBM Corporation and others.
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

		GenPackage genPackage = (GenPackage) argument;
		GenModel genModel = genPackage.getGenModel();
		ExtendedMetaData extendedMetaData = genModel.getExtendedMetaData();
		stringBuffer.append(TEXT_1);
		{
			//<%@ egf:patternCall patternId="platform:/plugin/org.eclipse.egf.emf.pattern.base/egf/EMF_Pattern_Base.fcore#LogicalName=org.eclipse.egf.emf.pattern.base.HeaderJava" args="parameter:argument"%>

			InternalPatternContext ictx = (InternalPatternContext) ctx;
			new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
			stringBuffer.setLength(0);

			final Map<String, Object> callParameters = new HashMap<String, Object>();
			callParameters.put("argument", parameter);
			CallHelper.executeWithParameterInjection("platform:/plugin/org.eclipse.egf.emf.pattern.base/egf/EMF_Pattern_Base.fcore#_XHLrsCwtEd-jc5T-XaRJlg", new ExecutionContext((InternalPatternContext) ctx), callParameters);
			stringBuffer.setLength(0);
		}

		stringBuffer.append(TEXT_2);
		stringBuffer.append(genPackage.getUtilitiesPackageName());
		stringBuffer.append(TEXT_3);
		genModel.getImportedName("org.eclipse.emf.common.util.URI");
		genModel.markImportLocation(stringBuffer);
		stringBuffer.append(TEXT_4);
		stringBuffer.append(genPackage.getQualifiedResourceFactoryClassName());
		stringBuffer.append(TEXT_5);
		stringBuffer.append(genPackage.getResourceClassName());
		stringBuffer.append(TEXT_6);
		stringBuffer.append(genPackage.getImportedResourceBaseClassName());
		stringBuffer.append(TEXT_7);
		if (genModel.hasCopyrightField()) {
			stringBuffer.append(TEXT_8);
			stringBuffer.append(genModel.getImportedName("java.lang.String"));
			stringBuffer.append(TEXT_9);
			stringBuffer.append(genModel.getCopyrightFieldLiteral());
			stringBuffer.append(TEXT_10);
			stringBuffer.append(genModel.getNonNLS());
			stringBuffer.append(TEXT_11);
		}
		if (genPackage.getResource() == GenResourceKind.XML_LITERAL || genPackage.getResource() == GenResourceKind.XMI_LITERAL) {
			stringBuffer.append(TEXT_12);
			stringBuffer.append(genModel.getImportedName("java.util.List"));
			stringBuffer.append(TEXT_13);
			stringBuffer.append(genModel.getImportedName("java.util.ArrayList"));
			stringBuffer.append(TEXT_14);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLParserPool"));
			stringBuffer.append(TEXT_15);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl"));
			stringBuffer.append(TEXT_16);
			stringBuffer.append(genModel.getImportedName("java.util.Map"));
			stringBuffer.append(TEXT_17);
			stringBuffer.append(genModel.getImportedName("java.util.HashMap"));
			stringBuffer.append(TEXT_18);
		}
		stringBuffer.append(TEXT_19);
		stringBuffer.append(genPackage.getResourceClassName());
		stringBuffer.append(TEXT_20);
		if (genPackage.getResource() == GenResourceKind.XML_LITERAL || genPackage.getResource() == GenResourceKind.XMI_LITERAL) {
			if (genPackage.isExtensibleProviderFactory() || genPackage.isChildCreationExtenders()) {
				stringBuffer.append(TEXT_21);
				if (genModel.useClassOverrideAnnotation()) {
					stringBuffer.append(TEXT_22);
				}
				stringBuffer.append(TEXT_23);
				stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLSave"));
				stringBuffer.append(TEXT_24);
				if (genPackage.getResource() == GenResourceKind.XML_LITERAL) {
					stringBuffer.append(TEXT_25);
					stringBuffer.append(genModel.getImportedName("org.polarsys.kitalpha.emde.xmi.XMLExtensionSaveImpl"));
					stringBuffer.append(TEXT_26);
				} else {
					stringBuffer.append(TEXT_27);
					stringBuffer.append(genModel.getImportedName("org.polarsys.kitalpha.emde.xmi.XMIExtensionSaveImpl"));
					stringBuffer.append(TEXT_28);
				}
				stringBuffer.append(TEXT_29);
				if (genModel.useClassOverrideAnnotation()) {
					stringBuffer.append(TEXT_30);
				}
				stringBuffer.append(TEXT_31);
				stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLHelper"));
				stringBuffer.append(TEXT_32);
				if (genPackage.getResource() == GenResourceKind.XML_LITERAL) {
					stringBuffer.append(TEXT_33);
					stringBuffer.append(genModel.getImportedName("org.polarsys.kitalpha.emde.xmi.XMLExtensionHelperImpl"));
					stringBuffer.append(TEXT_34);
				} else {
					stringBuffer.append(TEXT_35);
					stringBuffer.append(genModel.getImportedName("org.polarsys.kitalpha.emde.xmi.XMIExtensionHelperImpl"));
					stringBuffer.append(TEXT_36);
				}
				stringBuffer.append(TEXT_37);
				if (genModel.useClassOverrideAnnotation()) {
					stringBuffer.append(TEXT_38);
				}
				stringBuffer.append(TEXT_39);
				stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLLoad"));
				stringBuffer.append(TEXT_40);
				if (genPackage.getResource() == GenResourceKind.XML_LITERAL) {
					stringBuffer.append(TEXT_41);
					stringBuffer.append(genModel.getImportedName("org.polarsys.kitalpha.emde.xmi.XMLExtensionLoadImpl"));
					stringBuffer.append(TEXT_42);
					stringBuffer.append(genModel.getImportedName("org.polarsys.kitalpha.emde.xmi.XMLExtensionHelperImpl"));
					stringBuffer.append(TEXT_43);
				} else {
					stringBuffer.append(TEXT_44);
					stringBuffer.append(genModel.getImportedName("org.polarsys.kitalpha.emde.xmi.XMIExtensionLoadImpl"));
					stringBuffer.append(TEXT_45);
					stringBuffer.append(genModel.getImportedName("org.polarsys.kitalpha.emde.xmi.XMIExtensionHelperImpl"));
					stringBuffer.append(TEXT_46);
				}
				stringBuffer.append(TEXT_47);
			}
			if (ExtensionHelper.isUseIDAttributes(genPackage) == false) {
				stringBuffer.append(TEXT_48);
				if (genModel.useClassOverrideAnnotation()) {
					stringBuffer.append(TEXT_49);
				}
				stringBuffer.append(TEXT_50);
			}
			if (ExtensionHelper.isUseUUIDS(genPackage)) {
				stringBuffer.append(TEXT_51);
				if (genModel.useClassOverrideAnnotation()) {
					stringBuffer.append(TEXT_52);
				}
				stringBuffer.append(TEXT_53);
			}
			stringBuffer.append(TEXT_54);
			if (genModel.useClassOverrideAnnotation()) {
				stringBuffer.append(TEXT_55);
			}
			stringBuffer.append(TEXT_56);
			if (ExtensionHelper.isTrackResourceModification(genPackage)) {
				stringBuffer.append(TEXT_57);
			}
			stringBuffer.append(TEXT_58);
			stringBuffer.append(genModel.getNonNLS());
			stringBuffer.append(TEXT_59);
			stringBuffer.append(genModel.getNonNLS());
			stringBuffer.append(TEXT_60);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource"));
			stringBuffer.append(TEXT_61);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource"));
			stringBuffer.append(TEXT_62);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource"));
			stringBuffer.append(TEXT_63);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
			stringBuffer.append(TEXT_64);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource"));
			stringBuffer.append(TEXT_65);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLSave.XMLTypeInfo"));
			stringBuffer.append(TEXT_66);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
			stringBuffer.append(TEXT_67);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClassifier"));
			stringBuffer.append(TEXT_68);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
			stringBuffer.append(TEXT_69);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xml.type.XMLTypePackage"));
			stringBuffer.append(TEXT_70);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
			stringBuffer.append(TEXT_71);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
			stringBuffer.append(TEXT_72);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xml.type.XMLTypePackage"));
			stringBuffer.append(TEXT_73);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource"));
			stringBuffer.append(TEXT_74);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource"));
			stringBuffer.append(TEXT_75);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl"));
			stringBuffer.append(TEXT_76);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource"));
			stringBuffer.append(TEXT_77);
			if (genPackage.getResource() == GenResourceKind.XMI_LITERAL) {
				stringBuffer.append(TEXT_78);
				stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMIResource"));
				stringBuffer.append(TEXT_79);
			}
			stringBuffer.append(TEXT_80);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource"));
			stringBuffer.append(TEXT_81);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource"));
			stringBuffer.append(TEXT_82);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource"));
			stringBuffer.append(TEXT_83);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource"));
			stringBuffer.append(TEXT_84);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource"));
			stringBuffer.append(TEXT_85);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource"));
			stringBuffer.append(TEXT_86);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource"));
			stringBuffer.append(TEXT_87);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource"));
			stringBuffer.append(TEXT_88);
			if (genModel.useClassOverrideAnnotation()) {
				stringBuffer.append(TEXT_89);
			}
			stringBuffer.append(TEXT_90);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
			stringBuffer.append(TEXT_91);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
			stringBuffer.append(TEXT_92);
			stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
			stringBuffer.append(TEXT_93);
		}
		if (genPackage.isDataTypeConverters() && (genPackage.hasDocumentRoot() || org.eclipse.emf.ecore.xml.type.XMLTypePackage.eNS_URI.equals(genPackage.getNSURI()))) {
			boolean isXMLTypePackage = org.eclipse.emf.ecore.xml.type.XMLTypePackage.eNS_URI.equals(genPackage.getNSURI());
			final String _Map = genModel.useGenerics() ? "Map<?, ?>" : "Map";
			final String _MapStringBoolean = genModel.useGenerics() ? "Map<String, Boolean>" : "Map";
			final String _MapStringWildcard = genModel.useGenerics() ? "Map<String, ?>" : "Map";
			if (!isXMLTypePackage) {
				genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource");
				genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLParserPool");
				genModel.getImportedName("org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl");
				genModel.getImportedName("java.io.InputStream");
				genModel.getImportedName("java.io.IOException");
				genModel.getImportedName("org.eclipse.emf.ecore.EObject");
				genModel.getImportedName("java.util.Collections");
				genModel.getImportedName("java.util.HashMap");
				genModel.getImportedName("java.util.Map");
				genModel.getImportedName("org.xml.sax.InputSource");
				genModel.getImportedName("javax.xml.parsers.SAXParser");
			}
			genModel.getImportedName("org.xml.sax.Attributes");
			genModel.getImportedName("org.xml.sax.SAXException");
			String _StackFrame = genModel.getImportedName("org.eclipse.emf.ecore.xml.type.util.XMLTypeResourceImpl") + ".StackFrame";
			String _DataFrame = genModel.getImportedName("org.eclipse.emf.ecore.xml.type.util.XMLTypeResourceImpl") + ".DataFrame";
			if (!isXMLTypePackage) {
				stringBuffer.append(TEXT_94);
				stringBuffer.append(genModel.getNonNLS());
				stringBuffer.append(TEXT_95);
				if (genModel.useClassOverrideAnnotation()) {
					stringBuffer.append(TEXT_96);
				}
				stringBuffer.append(TEXT_97);
				stringBuffer.append(_Map);
				stringBuffer.append(TEXT_98);
				stringBuffer.append(_MapStringBoolean);
				stringBuffer.append(TEXT_99);
				stringBuffer.append(_MapStringWildcard);
				stringBuffer.append(TEXT_100);
				if (genModel.useClassOverrideAnnotation()) {
					stringBuffer.append(TEXT_101);
				}
				stringBuffer.append(TEXT_102);
				stringBuffer.append(_Map);
				stringBuffer.append(TEXT_103);
				stringBuffer.append(_MapStringBoolean);
				stringBuffer.append(TEXT_104);
				stringBuffer.append(_MapStringWildcard);
				stringBuffer.append(TEXT_105);
				stringBuffer.append(_MapStringBoolean);
				stringBuffer.append(TEXT_106);
				stringBuffer.append(_MapStringWildcard);
				stringBuffer.append(TEXT_107);
				stringBuffer.append(_MapStringBoolean);
				stringBuffer.append(TEXT_108);
				stringBuffer.append(_MapStringBoolean.replaceAll("Map", "HashMap"));
				stringBuffer.append(TEXT_109);
				stringBuffer.append(genModel.getNonNLS());
				stringBuffer.append(TEXT_110);
				if (genModel.useGenerics()) {
					stringBuffer.append(TEXT_111);
				} else {
					stringBuffer.append(TEXT_112);
				}
				stringBuffer.append(TEXT_113);
				if (genModel.isSuppressEMFTypes()) {
					stringBuffer.append(TEXT_114);
				} else {
					stringBuffer.append(TEXT_115);
				}
				stringBuffer.append(TEXT_116);
			}
			stringBuffer.append(TEXT_117);
			for (GenClass genClass : genPackage.getGenClasses()) {
				stringBuffer.append(TEXT_118);
				stringBuffer.append(genClass.getName());
				stringBuffer.append(TEXT_119);
				stringBuffer.append(genClass.getSafeUncapName());
				stringBuffer.append(TEXT_120);
			}
			for (GenDataType genDataType : genPackage.getAllGenDataTypes()) {
				stringBuffer.append(TEXT_121);
				stringBuffer.append(_DataFrame);
				stringBuffer.append(TEXT_122);
				stringBuffer.append(genDataType.getSafeUncapName());
				stringBuffer.append(TEXT_123);
			}
			for (GenClass genClass : genPackage.getGenClasses()) {
				List<EStructuralFeature> attributes = extendedMetaData.getAllAttributes(genClass.getEcoreClass());
				List<EStructuralFeature> elements = extendedMetaData.getAllElements(genClass.getEcoreClass());
				stringBuffer.append(TEXT_124);
				stringBuffer.append(genClass.getName());
				stringBuffer.append(TEXT_125);
				stringBuffer.append(genClass.getName());
				stringBuffer.append(TEXT_126);
				stringBuffer.append(_StackFrame);
				stringBuffer.append(TEXT_127);
				stringBuffer.append(genClass.getName());
				stringBuffer.append(TEXT_128);
				stringBuffer.append(genClass.getName());
				stringBuffer.append(TEXT_129);
				stringBuffer.append(genClass.getSafeUncapName());
				stringBuffer.append(TEXT_130);
				stringBuffer.append(genClass.getName());
				stringBuffer.append(TEXT_131);
				stringBuffer.append(genClass.getSafeUncapName());
				stringBuffer.append(TEXT_132);
				stringBuffer.append(genClass.getSafeUncapName());
				stringBuffer.append(TEXT_133);
				stringBuffer.append(genClass.getName());
				stringBuffer.append(TEXT_134);
				stringBuffer.append(genClass.getName());
				stringBuffer.append(TEXT_135);
				stringBuffer.append(genClass.getName());
				stringBuffer.append(TEXT_136);
				stringBuffer.append(genClass.getImportedInterfaceName());
				stringBuffer.append(TEXT_137);
				stringBuffer.append(genClass.getName());
				stringBuffer.append(TEXT_138);
				stringBuffer.append(genClass.getName());
				stringBuffer.append(TEXT_139);
				stringBuffer.append(genClass.getSafeUncapName());
				stringBuffer.append(TEXT_140);
				stringBuffer.append(genClass.getImportedInterfaceName());
				stringBuffer.append(TEXT_141);
				stringBuffer.append(genClass.getName());
				stringBuffer.append(TEXT_142);
				stringBuffer.append(genClass.getSafeUncapName());
				stringBuffer.append(TEXT_143);
				stringBuffer.append(genClass.getName());
				stringBuffer.append(TEXT_144);
				stringBuffer.append(genClass.getSafeUncapName());
				stringBuffer.append(TEXT_145);
				stringBuffer.append(genClass.getSafeUncapName());
				stringBuffer.append(TEXT_146);
				stringBuffer.append(genClass.getName());
				stringBuffer.append(TEXT_147);
				stringBuffer.append(genClass.getName());
				stringBuffer.append(TEXT_148);
				stringBuffer.append(_StackFrame);
				stringBuffer.append(TEXT_149);
				stringBuffer.append(genClass.getImportedInterfaceName());
				stringBuffer.append(TEXT_150);
				stringBuffer.append(genClass.getName());
				stringBuffer.append(TEXT_151);
				for (GenFeature genFeature : genClass.getAllGenFeatures()) {
					String name = extendedMetaData.getName(genFeature.getEcoreFeature());
					if ((elements.contains(genFeature.getEcoreFeature()) || attributes.contains(genFeature.getEcoreFeature())) && name.indexOf(":") == -1) {
						if (genFeature.isReferenceType()) {
							stringBuffer.append(TEXT_152);
							stringBuffer.append(genFeature.getTypeGenClass().getGenPackage().getImportedResourceClassName());
							stringBuffer.append(TEXT_153);
							stringBuffer.append(genFeature.getTypeGenClass().getName());
							stringBuffer.append(TEXT_154);
							stringBuffer.append(genFeature.getSafeName());
							stringBuffer.append(TEXT_155);
						} else {
							stringBuffer.append(TEXT_156);
							stringBuffer.append(_DataFrame);
							stringBuffer.append(TEXT_157);
							stringBuffer.append(genFeature.getSafeName());
							stringBuffer.append(TEXT_158);
						}
					}
				}
				stringBuffer.append(TEXT_159);
				if (genModel.useClassOverrideAnnotation()) {
					stringBuffer.append(TEXT_160);
				}
				stringBuffer.append(TEXT_161);
				int count = 0;
				for (GenFeature genFeature : genClass.getAllGenFeatures()) {
					String name = extendedMetaData.getName(genFeature.getEcoreFeature());
					if (attributes.contains(genFeature.getEcoreFeature()) && !genFeature.isDerived() && name.indexOf(":") == -1) {
						String namespace = Literals.toStringLiteral(extendedMetaData.getNamespace(genFeature.getEcoreFeature()), genModel);
						if ("null".equals(namespace))
							namespace = "\"\"";
						if (!genFeature.isReferenceType()) {
							GenClassifier genClassifier = genFeature.getTypeGenClassifier();
							if (count++ == 0) {
								stringBuffer.append(TEXT_162);
								stringBuffer.append(namespace);
								stringBuffer.append(TEXT_163);
								stringBuffer.append(name);
								stringBuffer.append(TEXT_164);
							} else {
								stringBuffer.append(TEXT_165);
								stringBuffer.append(namespace);
								stringBuffer.append(TEXT_166);
								stringBuffer.append(name);
								stringBuffer.append(TEXT_167);
							}
							stringBuffer.append(TEXT_168);
							if (genClassifier.getGenPackage().isDataTypeConverters()) {
								stringBuffer.append(TEXT_169);
								stringBuffer.append(genClass.getName());
								stringBuffer.append(TEXT_170);
								stringBuffer.append(genFeature.getAccessorName());
								stringBuffer.append(TEXT_171);
								stringBuffer.append(genClassifier.getGenPackage().getQualifiedFactoryInstanceAccessor());
								stringBuffer.append(TEXT_172);
								stringBuffer.append(genClassifier.getName());
								stringBuffer.append(TEXT_173);
							} else {
								stringBuffer.append(TEXT_174);
								stringBuffer.append(genClass.getName());
								stringBuffer.append(TEXT_175);
								stringBuffer.append(genFeature.getAccessorName());
								stringBuffer.append(TEXT_176);
								stringBuffer.append(genFeature.getImportedType(null));
								stringBuffer.append(TEXT_177);
								stringBuffer.append(genClassifier.getGenPackage().getQualifiedEFactoryInstanceAccessor());
								stringBuffer.append(TEXT_178);
								stringBuffer.append(genClassifier.getQualifiedClassifierAccessor());
								stringBuffer.append(TEXT_179);
							}
							stringBuffer.append(TEXT_180);
						}
					}
				}
				if (count == 0) {
					stringBuffer.append(TEXT_181);
				}
				stringBuffer.append(TEXT_182);
				if (genModel.useClassOverrideAnnotation()) {
					stringBuffer.append(TEXT_183);
				}
				stringBuffer.append(TEXT_184);
				stringBuffer.append(_StackFrame);
				stringBuffer.append(TEXT_185);
				count = 0;
				for (GenFeature genFeature : genClass.getAllGenFeatures()) {
					String name = extendedMetaData.getName(genFeature.getEcoreFeature());
					if (elements.contains(genFeature.getEcoreFeature()) && name.indexOf(":") == -1) {
						String namespace = Literals.toStringLiteral(extendedMetaData.getNamespace(genFeature.getEcoreFeature()), genModel);
						if ("null".equals(namespace))
							namespace = "\"\"";
						stringBuffer.append(TEXT_186);
						if (count++ != 0) {
							stringBuffer.append(TEXT_187);
						}
						stringBuffer.append(TEXT_188);
						stringBuffer.append(name);
						stringBuffer.append(TEXT_189);
						stringBuffer.append(namespace);
						stringBuffer.append(TEXT_190);
						stringBuffer.append(genFeature.getSafeName());
						stringBuffer.append(TEXT_191);
						stringBuffer.append(genFeature.getTypeGenClassifier().getGenPackage().getImportedResourceClassName());
						stringBuffer.append(TEXT_192);
						stringBuffer.append(genFeature.getTypeGenClassifier().getName());
						stringBuffer.append(TEXT_193);
					}
				}
				if (count == 0) {
					stringBuffer.append(TEXT_194);
				} else {
					stringBuffer.append(TEXT_195);
				}
				stringBuffer.append(TEXT_196);
				if (genModel.useClassOverrideAnnotation()) {
					stringBuffer.append(TEXT_197);
				}
				stringBuffer.append(TEXT_198);
				stringBuffer.append(_StackFrame);
				stringBuffer.append(TEXT_199);
				count = 0;
				for (GenFeature genFeature : genClass.getAllGenFeatures()) {
					String name = extendedMetaData.getName(genFeature.getEcoreFeature());
					if (elements.contains(genFeature.getEcoreFeature()) && name.indexOf(":") == -1) {
						stringBuffer.append(TEXT_200);
						if (count++ != 0) {
							stringBuffer.append(TEXT_201);
						}
						stringBuffer.append(TEXT_202);
						stringBuffer.append(genFeature.getSafeName());
						stringBuffer.append(TEXT_203);
						if (genFeature.isListType()) {
							stringBuffer.append(TEXT_204);
							stringBuffer.append(genClass.getName());
							stringBuffer.append(TEXT_205);
							stringBuffer.append(genFeature.getGetAccessor());
							stringBuffer.append(TEXT_206);
							stringBuffer.append(genFeature.getTypeGenClassifier().getGenPackage().getImportedResourceClassName());
							stringBuffer.append(TEXT_207);
							stringBuffer.append(genFeature.getTypeGenClassifier().getName());
							stringBuffer.append(TEXT_208);
							stringBuffer.append(genFeature.getSafeName());
							stringBuffer.append(TEXT_209);
						} else {
							stringBuffer.append(TEXT_210);
							stringBuffer.append(genClass.getName());
							stringBuffer.append(TEXT_211);
							stringBuffer.append(genFeature.getAccessorName());
							stringBuffer.append(TEXT_212);
							stringBuffer.append(genFeature.getTypeGenClassifier().getGenPackage().getImportedResourceClassName());
							stringBuffer.append(TEXT_213);
							stringBuffer.append(genFeature.getTypeGenClassifier().getName());
							stringBuffer.append(TEXT_214);
							stringBuffer.append(genFeature.getSafeName());
							stringBuffer.append(TEXT_215);
						}
						stringBuffer.append(TEXT_216);
						stringBuffer.append(genFeature.getSafeName());
						stringBuffer.append(TEXT_217);
					}
				}
				if (count == 0) {
					stringBuffer.append(TEXT_218);
				} else {
					stringBuffer.append(TEXT_219);
				}
				stringBuffer.append(TEXT_220);
				if (genModel.useClassOverrideAnnotation()) {
					stringBuffer.append(TEXT_221);
				}
				stringBuffer.append(TEXT_222);
				stringBuffer.append(genClass.getName());
				stringBuffer.append(TEXT_223);
				stringBuffer.append(genPackage.getQualifiedFactoryInstanceAccessor());
				stringBuffer.append(TEXT_224);
				stringBuffer.append(genClass.getName());
				stringBuffer.append(TEXT_225);
				stringBuffer.append(genClass.getImportedInterfaceName());
				stringBuffer.append(TEXT_226);
				stringBuffer.append(genClass.getName());
				stringBuffer.append(TEXT_227);
				stringBuffer.append(genClass.getImportedInterfaceName());
				stringBuffer.append(TEXT_228);
				stringBuffer.append(genClass.getName());
				stringBuffer.append(TEXT_229);
				stringBuffer.append(genClass.getName());
				stringBuffer.append(TEXT_230);
				stringBuffer.append(genClass.getName());
				stringBuffer.append(TEXT_231);
				stringBuffer.append(genClass.getName());
				stringBuffer.append(TEXT_232);
			}
			for (GenDataType genDataType : genPackage.getAllGenDataTypes()) {
				stringBuffer.append(TEXT_233);
				stringBuffer.append(_DataFrame);
				stringBuffer.append(TEXT_234);
				stringBuffer.append(genDataType.getName());
				stringBuffer.append(TEXT_235);
				stringBuffer.append(_StackFrame);
				stringBuffer.append(TEXT_236);
				stringBuffer.append(_DataFrame);
				stringBuffer.append(TEXT_237);
				stringBuffer.append(genDataType.getName());
				stringBuffer.append(TEXT_238);
				stringBuffer.append(genDataType.getSafeUncapName());
				stringBuffer.append(TEXT_239);
				stringBuffer.append(_DataFrame);
				stringBuffer.append(TEXT_240);
				stringBuffer.append(genDataType.getSafeUncapName());
				stringBuffer.append(TEXT_241);
				stringBuffer.append(genDataType.getSafeUncapName());
				stringBuffer.append(TEXT_242);
				stringBuffer.append(genDataType.getName());
				stringBuffer.append(TEXT_243);
				stringBuffer.append(genDataType.getName());
				stringBuffer.append(TEXT_244);
				stringBuffer.append(genDataType.getName());
				stringBuffer.append(TEXT_245);
				stringBuffer.append(genDataType.getImportedParameterizedInstanceClassName());
				stringBuffer.append(TEXT_246);
				stringBuffer.append(genDataType.getName());
				stringBuffer.append(TEXT_247);
				stringBuffer.append(_DataFrame);
				stringBuffer.append(TEXT_248);
				stringBuffer.append(genDataType.getSafeUncapName());
				stringBuffer.append(TEXT_249);
				if (genDataType.getGenPackage().isDataTypeConverters()) {
					stringBuffer.append(TEXT_250);
					stringBuffer.append(genDataType.getImportedParameterizedInstanceClassName());
					stringBuffer.append(TEXT_251);
					stringBuffer.append(genDataType.getName());
					stringBuffer.append(TEXT_252);
					stringBuffer.append(genDataType.getGenPackage().getQualifiedFactoryInstanceAccessor());
					stringBuffer.append(TEXT_253);
					stringBuffer.append(genDataType.getName());
					stringBuffer.append(TEXT_254);
					stringBuffer.append(genDataType.getSafeUncapName());
					stringBuffer.append(TEXT_255);
				} else if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
					stringBuffer.append(TEXT_256);
					stringBuffer.append(genDataType.getImportedInstanceClassName());
					stringBuffer.append(TEXT_257);
					stringBuffer.append(genDataType.getName());
					stringBuffer.append(TEXT_258);
					stringBuffer.append(genDataType.getObjectInstanceClassName());
					stringBuffer.append(TEXT_259);
					stringBuffer.append(genDataType.getGenPackage().getQualifiedEFactoryInstanceAccessor());
					stringBuffer.append(TEXT_260);
					stringBuffer.append(genDataType.getQualifiedClassifierAccessor());
					stringBuffer.append(TEXT_261);
					stringBuffer.append(genDataType.getSafeUncapName());
					stringBuffer.append(TEXT_262);
					stringBuffer.append(genDataType.getPrimitiveValueFunction());
					stringBuffer.append(TEXT_263);
				} else {
					stringBuffer.append(TEXT_264);
					stringBuffer.append(genDataType.getImportedInstanceClassName());
					stringBuffer.append(TEXT_265);
					stringBuffer.append(genDataType.getName());
					stringBuffer.append(TEXT_266);
					stringBuffer.append(genDataType.getObjectInstanceClassName());
					stringBuffer.append(TEXT_267);
					stringBuffer.append(genDataType.getGenPackage().getQualifiedEFactoryInstanceAccessor());
					stringBuffer.append(TEXT_268);
					stringBuffer.append(genDataType.getQualifiedClassifierAccessor());
					stringBuffer.append(TEXT_269);
					stringBuffer.append(genDataType.getSafeUncapName());
					stringBuffer.append(TEXT_270);
				}
				stringBuffer.append(TEXT_271);
				stringBuffer.append(genDataType.getSafeUncapName());
				stringBuffer.append(TEXT_272);
				stringBuffer.append(genDataType.getSafeUncapName());
				stringBuffer.append(TEXT_273);
				stringBuffer.append(genDataType.getName());
				stringBuffer.append(TEXT_274);
			}
			stringBuffer.append(TEXT_275);
		}
		stringBuffer.append(TEXT_276);
		stringBuffer.append(genPackage.getResourceClassName());
		genModel.emitSortedImports();
		InternalPatternContext ictx = (InternalPatternContext) ctx;
		new Node.DataLeaf(ictx.getNode(), getClass(), "doGenerate", stringBuffer.toString());
	}
}