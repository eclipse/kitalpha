/*******************************************************************************
 * Copyright (c) 2018, 2021 Thales Global Services S.A.S.
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

import java.security.SecureRandom;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import TestModel.Elf;
import TestModel.Entity;
import TestModel.Man;
import TestModel.Person;
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

  private SecureRandom random;
  private ResourceSet resourceSet;
  private Resource resource;
  private TransactionalEditingDomain domain;

  private static RandomEntityFactory instance;

  private RandomEntityFactory() {

    random = new SecureRandom();
    resourceSet = new ResourceSetImpl();
    resource = new ResourceImpl();

    resourceSet.getResources().add(resource);
    domain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resourceSet);
  }

  public Man createRandomMan() {
    Man man = TestModelFactory.eINSTANCE.createMan();
    man.setAge(random.nextInt(100));
    man.setMarried(random.nextBoolean());
    man.setName("Man " + random.nextDouble());
    man.setSex(random.nextBoolean() ? Sex.MALE : Sex.FEMALE);
    man.setSalary(random.nextFloat() * 1000);

    // add to resource set, needed in order to obtain a IPermissionAuthority later
    addToModel(man);

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
    addToModel(woman);

    return woman;
  }

  public Elf createRandomElf() {
    Elf elf = TestModelFactory.eINSTANCE.createElf();
    elf.setAge(random.nextInt(100));
    elf.setMana(random.nextFloat() * 1000);
    elf.setName("Elf " + random.nextDouble());
    elf.setSex(Sex.UNKNOWN);

    // add to resource set, needed in order to obtain a IPermissionAuthority later
    addToModel(elf);

    return elf;
  }

  public static RandomEntityFactory getInstance() {
    if (instance == null) {
      instance = new RandomEntityFactory();
    }

    return instance;
  }
  
  private void addToModel(Entity entity) {
      domain.getCommandStack().execute(new RecordingCommand(domain) {
          @Override
          protected void doExecute() {
              resourceSet.getResources().get(0).getContents().add(entity);
          }
      });
  }
  
  public void addAllChildren(Person person, List<Person> child) {
      domain.getCommandStack().execute(new RecordingCommand(domain) {
          @Override
          protected void doExecute() {
              person.getChildren().addAll(child);
          }
      });
  }
  
  public void addAllFriends(Person person, List<Person> child) {
      domain.getCommandStack().execute(new RecordingCommand(domain) {
          @Override
          protected void doExecute() {
              person.getFriends().addAll(child);
          }
      });
  }

}
