/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.ui.internal.tabs;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import org.polarsys.kitalpha.transposer.TransposerCorePlugin;
import org.polarsys.kitalpha.transposer.rules.handler.business.registry.GenericPurposeRegistry;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping;
import org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.ContributedPurpose;
import org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePurpose;
import org.polarsys.kitalpha.transposer.ui.TransposerUiPlugin;
import org.polarsys.kitalpha.transposer.ui.internal.configuration.ITransposerLaunchConfigurationConstants;
import org.polarsys.kitalpha.transposer.ui.internal.providers.ComboContentProvider;
import org.polarsys.kitalpha.transposer.ui.internal.providers.ComboLabelProvider;
import org.polarsys.kitalpha.transposer.ui.internal.providers.MappingTreeContentProvider;
import org.polarsys.kitalpha.transposer.ui.internal.providers.MappingTreeLabelProvider;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

/**
 * 
 * @author Guillaume Gebhart
 *
 */
public class TransposerMainTab extends AbstractLaunchConfigurationTab {

  private static final String TAB_NAME = "Main"; //$NON-NLS-1$
  private static final String PURPOSE_GROUP_NAME = "Purpose"; //$NON-NLS-1$
  private static final String MAPPING_GROUP_NAME = "Mapping"; //$NON-NLS-1$
  private static final String VALIDATION_GROUP_NAME = "Validation"; //$NON-NLS-1$

  private Group _purposeGroup = null;
  private ComboViewer _purposeComboViewer = null;

  private Group _mappingGroup = null;
  private TreeViewer _mappingTreeViewer = null;
  private Text _selectedMappingDesciption = null;

  private Group _validationGroup = null;
  // private Button _validate = null;
  private Label _validationResultViewer = null;
  private boolean _validationResult = false;

  private ContributedPurpose _selectedPurpose = null;
  private Mapping _selectedMapping = null;

  @Override
public String getName() {
    return TAB_NAME;
  }

  @Override
public void createControl(Composite parent) {

    Composite comp = new Composite(parent, SWT.NONE);
    setControl(comp);

    comp.setLayout(new GridLayout());
    comp.setFont(parent.getFont());

    createPurposeSelectionComponent(comp);
    createMappingSelectionComponent(comp);
    createValidationSelectionComponent(comp);

    initialize();
  }

  /**
   * @param comp_p
   */
  protected void createValidationSelectionComponent(Composite comp_p) {
    _validationGroup = createGroup(comp_p, VALIDATION_GROUP_NAME, 1, 1, GridData.FILL_BOTH, false);
    GridData gd = new GridData(GridData.FILL_BOTH);
    gd.grabExcessVerticalSpace = true;
    _validationResultViewer = new Label(_validationGroup, SWT.READ_ONLY);
    _validationResultViewer.setLayoutData(gd);
  }

  /**
   * 
   */
  protected void createPurposeSelectionComponent(Composite parent) {
    _purposeGroup = createGroup(parent, PURPOSE_GROUP_NAME, 1, 2, GridData.FILL_HORIZONTAL, false);

    _purposeComboViewer = new ComboViewer(_purposeGroup, SWT.RIGHT | SWT.DROP_DOWN | SWT.READ_ONLY);
    _purposeComboViewer.setUseHashlookup(true);
    _purposeComboViewer.setContentProvider(new ComboContentProvider());
    _purposeComboViewer.setLabelProvider(new ComboLabelProvider());
    _purposeComboViewer.setSorter(new ViewerSorter());

    Combo combo = _purposeComboViewer.getCombo();
    combo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    combo.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        updateSelectedPurpose();
        updateLaunchConfigurationDialog();
      }
    });
  }

  /**
   * 
   */
  protected void createMappingSelectionComponent(Composite parent) {
    _mappingGroup = createGroup(parent, MAPPING_GROUP_NAME, 1, 2, GridData.FILL_BOTH, true);

    _mappingTreeViewer = new TreeViewer(_mappingGroup, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
    GridData gdtv = new GridData(GridData.FILL_BOTH);
    gdtv.minimumHeight = 80;
    gdtv.grabExcessVerticalSpace = true;

    _mappingTreeViewer.getControl().setLayoutData(gdtv);
    _mappingTreeViewer.setContentProvider(new MappingTreeContentProvider());
    _mappingTreeViewer.setLabelProvider(new MappingTreeLabelProvider());

    _mappingTreeViewer.getTree().setHeaderVisible(false);
    _mappingTreeViewer.getTree().setLinesVisible(false);

    _mappingTreeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
      @Override
	public void selectionChanged(SelectionChangedEvent event_p) {
        updateSelectedMapping();
        updateLaunchConfigurationDialog();
      }

    });

    GridData gd = new GridData(GridData.FILL_BOTH);
    gd.grabExcessVerticalSpace = true;
    _selectedMappingDesciption = new Text(_mappingGroup, SWT.BORDER | SWT.READ_ONLY | SWT.V_SCROLL);
    _selectedMappingDesciption.setLayoutData(gd);
  }

  private void updateSelectedPurpose() {
    ContributedPurpose selectedPurpose = (ContributedPurpose) ((IStructuredSelection) _purposeComboViewer.getSelection()).getFirstElement(); // Purpose
    // check selection
    if (selectedPurpose != null && !selectedPurpose.equals(_selectedPurpose)) {
      _selectedPurpose = selectedPurpose;
      updateMappingHierarchy();
    }
  }

  private boolean isValidSelection() {
    return _validationResult && _selectedPurpose != null && _selectedMapping != null;
  }

  /**
   * 
   */
  private void updateMappingHierarchy() {
    if (_selectedPurpose != null && _mappingTreeViewer != null) {
      _mappingTreeViewer.setInput(_selectedPurpose);
      _mappingTreeViewer.expandAll();
      _selectedMapping = _selectedPurpose.getMostGenericMapping();
      if (_selectedMapping != null) {
        _mappingTreeViewer.setSelection(new StructuredSelection(_selectedMapping));
        _selectedMappingDesciption.setText(_selectedMapping.getCompleteDescription());
        validateSelection();
      }
    }
  }

  private void updateSelectedMapping() {
    Mapping selectedMapping = (Mapping) ((IStructuredSelection) _mappingTreeViewer.getSelection()).getFirstElement(); // Purpose

    if (selectedMapping != null && !selectedMapping.equals(_selectedMapping)) {
      _selectedMapping = selectedMapping;
      _selectedMappingDesciption.setText(_selectedMapping.getCompleteDescription());

      validateSelection();
    }
  }

  /**
   * 
   */
  private void validateSelection() {
    IStatus status = null;
    RuntimePurpose runtimePurpose = null;

    if (_selectedMapping != null) {
      runtimePurpose = GenericPurposeRegistry.getInstance().getRegisteredPurpose(_selectedMapping.getPurpose().getName(), _selectedMapping.getId());
    }
    if (runtimePurpose != null) {
      status = runtimePurpose.validate();
    }

    if (status == null) {
      _validationResultViewer.setText("  No validation result"); //$NON-NLS-1$
      _validationResult = false;
    } else {
      _validationResultViewer.setText("  " + status.getMessage()); //$NON-NLS-1$
      _validationResult = true;

      if (status.getSeverity() == IStatus.ERROR) {
        _validationResult = false;
        _selectedPurpose.validate();
      }
    }
  }

  /**
   * 
   */
  private void initialize() {
    List<ContributedPurpose> purposes = GenericPurposeRegistry.getInstance().getContributedPurposes();
    Iterable<ContributedPurpose> filteredPurposes = Iterables.filter(purposes, new Predicate<ContributedPurpose>() {

		@Override
		public boolean apply(ContributedPurpose purpose) {
		
			return !purpose.isPrivate();
		}
	});
    if (filteredPurposes != null && !Iterables.isEmpty(filteredPurposes)) {
		_purposeComboViewer.setInput(Iterables.toArray(filteredPurposes, ContributedPurpose.class));
	}
  }

  /**
   * @see org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse.debug.core.ILaunchConfiguration)
   */
  @Override
public void initializeFrom(ILaunchConfiguration configuration_p) {
    updatePurposeFromConfig(configuration_p);
    updateMappingFromConfig(configuration_p);
  }

  /**
   * @param configuration_p
   */
  private void updatePurposeFromConfig(ILaunchConfiguration configuration_p) {
    String purposeName = ""; //$NON-NLS-1$
    try {
      purposeName = configuration_p.getAttribute(ITransposerLaunchConfigurationConstants.PURPOSE_NAME, ""); //$NON-NLS-1$
    } catch (CoreException e) {
      TransposerCorePlugin.getDefault().logError(TransposerUiPlugin.PLUGIN_ID, e.getMessage(), e);
    }

    if (purposeName != null && !"".equals(purposeName)) {
		_selectedPurpose = GenericPurposeRegistry.getInstance().getContributedPurpose(purposeName);
	}

    if (_selectedPurpose != null) {
      _purposeComboViewer.setSelection(new StructuredSelection(_selectedPurpose));
      _mappingTreeViewer.setInput(_selectedPurpose);
      _mappingTreeViewer.expandAll();
    }
  }

  /**
   * @param configuration_p
   */
  private void updateMappingFromConfig(ILaunchConfiguration configuration_p) {
    String mappingId = ""; //$NON-NLS-1$
    try {
      mappingId = configuration_p.getAttribute(ITransposerLaunchConfigurationConstants.MAPPING_ID, ""); //$NON-NLS-1$
    } catch (CoreException e) {
      TransposerCorePlugin.getDefault().logError(TransposerUiPlugin.PLUGIN_ID, e.getMessage(), e);
    }

    if (_selectedPurpose != null && mappingId != null && !"".equals(mappingId)) {//$NON-NLS-1$
      _selectedMapping = _selectedPurpose.getMapping(mappingId);
      validateSelection();
    }
    if (_selectedMapping != null) {
      _mappingTreeViewer.setSelection(new StructuredSelection(_selectedMapping));
      _selectedMappingDesciption.setText(_selectedMapping.getCompleteDescription());
    }
  }

  /**
   * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#isValid(org.eclipse.debug.core.ILaunchConfiguration)
   */
  @Override
  public boolean isValid(ILaunchConfiguration launchConfig_p) {

    return isValidSelection() && super.isValid(launchConfig_p);
  }

  /**
   * @see org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
   */
  @Override
public void performApply(ILaunchConfigurationWorkingCopy configuration_p) {
    if (_selectedPurpose != null) {
      configuration_p.setAttribute(ITransposerLaunchConfigurationConstants.PURPOSE_NAME, _selectedPurpose.getName());
      if (_selectedMapping != null) {
		configuration_p.setAttribute(ITransposerLaunchConfigurationConstants.MAPPING_ID, _selectedMapping.getId());
	}
    }
  }

  /**
   * @see org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
   */
  @Override
public void setDefaults(ILaunchConfigurationWorkingCopy configuration_p) {
    // TODO Auto-generated method stub

  }

  /**
   * Creates a Group widget
   * @param parent the parent composite to add this group to
   * @param text the text for the heading of the group
   * @param columns the number of columns within the group
   * @param hspan the horizontal span the group should take up on the parent
   * @param fill the style for how this composite should fill into its parent
   * @return the new group
   * @since 3.2
   * 
   */
  public Group createGroup(Composite parent, String text, int columns, int hspan, int fill, boolean verticalGrab) {
    Group g = new Group(parent, SWT.NONE);
    g.setLayout(new GridLayout(columns, false));
    g.setText(text);
    g.setFont(parent.getFont());
    GridData gd = new GridData(fill);
    gd.horizontalSpan = hspan;
    gd.grabExcessVerticalSpace = verticalGrab;
    g.setLayoutData(gd);
    return g;
  }

  /**
   * Creates a Composite widget
   * @param parent the parent composite to add this composite to
   * @param columns the number of columns within the composite
   * @param hspan the horizontal span the composite should take up on the parent
   * @param fill the style for how this composite should fill into its parent
   * @param marginwidth the width of the margin to place around the composite (default is 5, specified by GridLayout)
   * @return the new group
   * @since 3.3
   */
  public Composite createComposite(Composite parent, Font font, int columns, int hspan, int fill, int marginwidth, int marginheight) {
    Composite g = new Composite(parent, SWT.NONE);
    GridLayout layout = new GridLayout(columns, false);
    layout.marginWidth = marginwidth;
    layout.marginHeight = marginheight;
    g.setLayout(layout);
    g.setFont(font);
    GridData gd = new GridData(fill);
    gd.horizontalSpan = hspan;
    g.setLayoutData(gd);
    return g;
  }
}
