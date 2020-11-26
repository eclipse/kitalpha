/*******************************************************************************
 * Copyright (c) 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.massactions.tests.ju.model.factory;

import java.util.Random;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import TestModel.Elf;
import TestModel.Man;
import TestModel.Sex;
import TestModel.TestModelFactory;
import TestModel.Woman;

/**
 * A helper class enabling the creation of random entities.
 * 
 * @author Sandu Postaru
 *
 */
public class RandomEntityFactory {

  private Random random;
  private ResourceSet resourceSet;
  private Resource resource;

  private static RandomEntityFactory instance;

  private RandomEntityFactory() {

    random = new Random();
    resourceSet = new ResourceSetImpl();
    resource = new ResourceImpl();

    resourceSet.getResources().add(resource);
  }

  public Man createRandomMan() {
    Man man = TestModelFactory.eINSTANCE.createMan();
    man.setAge(random.nextInt(100));
    man.setMarried(random.nextBoolean());
    man.setName("Man " + random.nextDouble());
    man.setSex(random.nextBoolean() ? Sex.MALE : Sex.FEMALE);
    man.setSalary(random.nextFloat() * 1000);

    // add to resource set, needed in order to obtain a IPermissionAuthority later
    resourceSet.getResources().get(0).getContents().add(man);

    return man;
  }

  public Woman createRandomWoman() {
    Woman woman = TestModelFactory.eINSTANCE.createWoman();
    woman.setAge(random.nextInt(100));
    woman.setMarried(random.nextBoolean());
    woman.setName("Woman " + random.nextDouble());
    woman.setSex(random.nextBoolean() ? Sex.MALE : Sex.FEMALE);
    woman.setSalary(random.nextFloat() * 1000);

    // add to resource set, needed in order to obtain a IPermissionAuthority later
    resourceSet.getResources().get(0).getContents().add(woman);

    return woman;
  }

  public Elf createRandomElf() {
    Elf elf = TestModelFactory.eINSTANCE.createElf();
    elf.setAge(random.nextInt(100));
    elf.setMana(random.nextFloat() * 1000);
    elf.setName("Elf " + random.nextDouble());
    elf.setSex(Sex.UNKNOWN);

    // add to resource set, needed in order to obtain a IPermissionAuthority later
    resourceSet.getResources().get(0).getContents().add(elf);

    return elf;
  }

  public static RandomEntityFactory getInstance() {
    if (instance == null) {
      instance = new RandomEntityFactory();
    }

    return instance;
  }

}
