/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.transposer.rules.handler.internal.util;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author Guillaume GEBHART
 *
 */

public class GenericReflectionUtils {
  @SuppressWarnings("unchecked")
  public static List<Class<?>> getGenericInterfaceTypeArguments(Class<?> baseInterface, Class<?> concreteClass) {
    if (!baseInterface.isAssignableFrom(concreteClass)) {
      throw new IllegalArgumentException("Illegal base interface argument"); //$NON-NLS-1$
    }
    if (concreteClass.getTypeParameters().length > 0) {
      throw new IllegalArgumentException("Can't determine the type arguments of a generic interface of a generic class"); //$NON-NLS-1$
    }
    for (Type genericInterface : concreteClass.getGenericInterfaces()) {
      List<Class<?>> result = null;
      if (genericInterface instanceof Class<?>) {
        result = getGenericInterfaceTypeArguments(baseInterface, (Class<?>) genericInterface);
      } else {
        result = getGenericInterfaceTypeArguments(baseInterface, (ParameterizedType) genericInterface);
      }
      if (result != null) {
        return result;
      }
    }

    Type genericSuperClass = concreteClass.getGenericSuperclass();

    if (genericSuperClass != null) {
      List<Class<?>> result = null;
      if (genericSuperClass instanceof Class<?>) {
        result = getGenericInterfaceTypeArguments(baseInterface, (Class<?>) genericSuperClass);
      } else {
        result = getGenericInterfaceTypeArguments(baseInterface, (ParameterizedType) genericSuperClass);
      }
      if (result != null) {
        return result;
      }
    }

    return null;
  }

  public static Class<?> getClass(Type type) {
    if (type instanceof Class<?>) {
      return (Class<?>) type;
    }
    if (type instanceof ParameterizedType) {
      return getClass(((ParameterizedType) type).getRawType());
    }
    if (type instanceof GenericArrayType) {
      Type componentType = ((GenericArrayType) type).getGenericComponentType();
      Class<?> componentClass = getClass(componentType);
      if (componentClass != null) {
        return Array.newInstance(componentClass, 0).getClass();
      }
      return null;
    }
    return null;
  }

  @SuppressWarnings("unchecked")
  private static List<Class<?>> getGenericInterfaceTypeArguments(Class<?> baseInterface, ParameterizedType currentType) {
    Class<?> currentClass = getClass(currentType);
    if (!baseInterface.isAssignableFrom(currentClass)) {
      // Early out - current type is not an interface that extends baseInterface
      return null;
    }

    Type[] actualTypeArguments = currentType.getActualTypeArguments();

    if (currentClass == baseInterface) {
      // currentType is a type instance of the base generic interface. Read out the type arguments and return
      ArrayList<Class<?>> typeArgs = new ArrayList<Class<?>>(actualTypeArguments.length);
      for (Type typeArg : actualTypeArguments) {
        typeArgs.add(getClass(typeArg));
      }

      return typeArgs;
    }

    // currentType is derived
    Map<String, Class<?>> typeVarMap = createTypeParameterMap(currentType, null);

    for (Type genericInterfaceType : currentClass.getGenericInterfaces()) {
      List<Class<?>> result = getGenericInterfaceTypeArguments(baseInterface, (ParameterizedType) genericInterfaceType, typeVarMap);
      if (result != null) {
        return result;
      }
    }
    return null;
  }

  private static Map<String, Class<?>> createTypeParameterMap(ParameterizedType type, Map<String, Class<?>> extendedTypeMap) {
    Map<String, Class<?>> typeVarMap = new HashMap<String, Class<?>>();
    Type[] typeArgs = type.getActualTypeArguments();
    TypeVariable[] typeVars = getClass(type).getTypeParameters();
    for (int typeArgIndex = 0; typeArgIndex < typeArgs.length; ++typeArgIndex) {
      // Does not deal with nested generic arguments...
      Type typeArg = typeArgs[typeArgIndex];
      if (typeArg instanceof TypeVariable) {
        assert extendedTypeMap != null;
        TypeVariable typeVar = (TypeVariable) typeArg;
        typeVarMap.put(typeVars[typeArgIndex].getName(), extendedTypeMap.get(typeVar.getName()));
        continue;
      }
      typeVarMap.put(typeVars[typeArgIndex].getName(), getClass(typeArgs[typeArgIndex]));
    }

    return typeVarMap;
  }

  private static List<Class<?>> createTypeParameterList(Map<String, Class<?>> typeParameterMap, ParameterizedType type) {
    List<Class<?>> typeParameters = new ArrayList<Class<?>>(typeParameterMap.size());
    for (Type actualType : type.getActualTypeArguments()) {
      if (actualType instanceof TypeVariable) {
        // Handles the case when an interface is created with a specific type, rather than a parameter
        typeParameters.add(typeParameterMap.get(((TypeVariable) actualType).getName()));
        continue;
      }
      typeParameters.add(getClass(actualType));
    }
    return typeParameters;
  }

  @SuppressWarnings("unchecked")
  private static List<Class<?>> getGenericInterfaceTypeArguments(Class<?> baseInterface, ParameterizedType currentType, Map<String, Class<?>> currentTypeParameters) {
    Class<?> currentClass = getClass(currentType);
    if (!baseInterface.isAssignableFrom(currentClass)) {
      // Early out - current type is not an interface that extends baseInterface
      return null;
    }

    if (currentClass == baseInterface) {
      return createTypeParameterList(currentTypeParameters, currentType);
    }

    currentTypeParameters = createTypeParameterMap(currentType, currentTypeParameters);
    for (Type genericInterface : currentClass.getGenericInterfaces()) {
      List<Class<?>> result = getGenericInterfaceTypeArguments(baseInterface, (ParameterizedType) genericInterface, currentTypeParameters);
      if (result != null) {
        return result;
      }
    }

    return null;
  }

}
