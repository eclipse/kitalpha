/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.cadence.ui.internal.widgets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.polarsys.kitalpha.cadence.core.api.CadenceRegistry;
import org.polarsys.kitalpha.cadence.core.api.IActivity;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.GenericParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.WorkflowActivityParameter;
import org.polarsys.kitalpha.cadence.ui.api.CadenceTab;
import org.polarsys.kitalpha.cadence.ui.api.dialog.ITableEditingListener;
import org.polarsys.kitalpha.cadence.ui.api.dialog.ParametersDialog;
import org.polarsys.kitalpha.cadence.ui.internal.CadenceListSelectionDialog;
import org.polarsys.kitalpha.cadence.ui.internal.widgets.parameters.ParameterManager;
import org.polarsys.kitalpha.cadence.ui.providers.CadenceContentProvider;
import org.polarsys.kitalpha.cadence.ui.providers.CadenceLabelProvider;
import org.polarsys.kitalpha.cadence.ui.providers.ColumnParametersLabelProvider;
import org.polarsys.kitalpha.cadence.ui.providers.ColumnValuesLabelProvider;
import org.polarsys.kitalpha.cadence.ui.providers.TableContentProvider;
import org.polarsys.kitalpha.cadence.ui.providers.TableEditingSupport;

/**
 * This class give a specific Item for Expand Bar
 * 
 * @author Guillaume Gebhart
 * 
 */
public class CadenceItem {

  // contains
	private ParametersDialog dialog;
  private final CadenceTab tab;

  private ListViewer viewer = null;
  private WorkflowActivityParameter _params = new WorkflowActivityParameter();
  private IConfigurationElement workflowElement = null;
  private List<IConfigurationElement> _temporyList = new LinkedList<IConfigurationElement>();
  private String _activityId = ""; //$NON-NLS-1$
  private CTabItem delegate;

  private final int CONFIGURABLE_ELEMENT = 0;
  private final int IDENTIFIER = 1;
  private final int IACTIVITY = 2;
  public static final String PARAMETER_SEPARATOR = ":"; //$NON-NLS-1$

	public CadenceItem(final CTabFolder tabFolder,
			final IConfigurationElement workflowElement,
			final String workflow_id, final String workflowElt_id,
      final String workflowElt_name, final String workflow_description , final CadenceTab tab) {
	
		this.delegate = new CTabItem(tabFolder, SWT.VERTICAL,0);
		
		this.delegate.setData(this);
		
		String order = CadenceRegistry.getOrderNumber(workflowElement);
		String name = order !=  null ? workflowElt_name + "(" + order + ")" : workflowElt_name;

		delegate.setText(name);

    this.tab = tab;
    this.workflowElement = workflowElement;


    Composite composite = new Composite(tabFolder, SWT.NONE);
    GridLayout layout = new GridLayout();
    layout.numColumns = 2;
    layout.marginLeft = layout.marginTop = layout.marginRight = layout.marginBottom = 10;
    layout.verticalSpacing = 10;
    composite.setLayout(layout);
    Label description = new Label(composite, SWT.NONE);
    GridData gd = new GridData();
	gd.horizontalAlignment = GridData.FILL;
	gd.grabExcessHorizontalSpace = true;
	gd.horizontalSpan = 2;
    description.setData(gd);
    description.setText(workflow_description);
    new Label(composite, SWT.NONE);
    ActivitiesWidget widget1 = new ActivitiesWidget(composite);
    ParameterWidget widget2 = new ParameterWidget(composite);
    initTable(widget2, workflow_id, workflowElt_id);
		final IConfigurationElement[] activities = CadenceRegistry
				.getActivitiesConfigList(workflow_id, workflowElt_id);
    attachListeners(widget1,widget2, activities);
		delegate.setControl(composite);

	}



	public CTabItem getDelegate() {
		return delegate;
  }

	private void initTable(ParameterWidget widget, final String workflow_id,
			final String workflowElt_id) {

    

    Button detail = widget.getDetails();

    detail.addSelectionListener(new SelectionAdapter() {

      public void widgetSelected(SelectionEvent e) {
        IActivity activitySelected = (IActivity) elementSelected(IACTIVITY);
        if (activitySelected != null) {

        	ITableEditingListener listener = new ITableEditingListener() {
				public void parameterValueChanged() {
					tab.update();
				}
			};
			
			dialog  = new ParametersDialog(tab.getShell(), new TableContentProvider(CadenceRegistry
					.getWorkflowElementParameters(workflow_id, workflowElt_id)),
					new ColumnParametersLabelProvider(),
					new ColumnValuesLabelProvider(),
					new ParameterManager());
			
			dialog.create();
			
			TableEditingSupport edit = new TableEditingSupport(dialog.getViewer(), listener);
			dialog.setEditingSupport(edit);
			
			if(_params.getActivityParameters(_activityId)!= null){
			dialog.setContainer((IActivity)elementSelected(IACTIVITY));
			dialog.setInput(_params.getActivityParameters(_activityId));
			}
			dialog.open();
      }
        	
      }	
    });
  }

	private void attachListeners(ActivitiesWidget widget,ParameterWidget param_widget,
			IConfigurationElement[] activities) {

    viewer = widget.getViewer();
    attachViewerListener(param_widget);
    Button b = widget.getAddButton();
    attachAddListener(b, activities);
    b = widget.getRemoveButton();
    attachRemoveListener(b);
    b = widget.getUpButton();
    attachUpListener(b);
    b = widget.getDownButton();
    attachDownListener(b);

  }
	
  private void attachViewerListener(final ParameterWidget widget) {

    viewer.addSelectionChangedListener(new ISelectionChangedListener() {
      public void selectionChanged(SelectionChangedEvent event) {

				StructuredSelection selection = (StructuredSelection) event
						.getSelection();

	if (selection.isEmpty())		
		widget.setDescription("");
				
	Object object = selection.getFirstElement();
        if (object != null) {
					final String description = CadenceRegistry
							.getDescription(((IConfigurationElement) object));
          if (description != null) {
            widget.setDescription(description);

          }
        }
      }

    });

    viewer.addSelectionChangedListener(new ISelectionChangedListener() {
      public void selectionChanged(SelectionChangedEvent event) {
        _activityId = (String) elementSelected(IDENTIFIER);
       
      }
    });

  }

  private void attachDownListener(Button b) {
    // TODO Auto-generated method stub
    b.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        IConfigurationElement insert = (IConfigurationElement) elementSelected(CONFIGURABLE_ELEMENT); // get
        // selection
        int index = _temporyList.indexOf(insert); // remove the
        // selection
        index++;
        _temporyList.remove(insert);
        _temporyList.add(index, insert);
        viewer.setInput(_temporyList);
        tab.update();
        viewer.refresh();
      }
    });

  }

  private void attachUpListener(Button b) {
    // TODO Auto-generated method stub
    b.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        IConfigurationElement insert = (IConfigurationElement) elementSelected(CONFIGURABLE_ELEMENT); // get
        // selection
        int index = _temporyList.indexOf(insert); // remove the
        // selection
        if (index > 0)
          index--;
        _temporyList.remove(insert);
        _temporyList.add(index, insert);
        viewer.setInput(_temporyList);
        tab.update();
        viewer.refresh();
      }
    });
  }

  private void attachRemoveListener(Button b) {
    // TODO Auto-generated method stub
    b.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        Object remove = elementSelected(CONFIGURABLE_ELEMENT); // get
        // selection
        _temporyList.remove(remove); // remove the selection
				_params
						.removeActivityParameters((String) elementSelected(IDENTIFIER));
        viewer.setInput(_temporyList);
        tab.update();
        viewer.refresh();

      }
    });
  }

	private void attachAddListener(Button b,
			final IConfigurationElement[] activities) {
    b.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        Object[] result = handleActivitiesSelect(activities);

        for (Object o : result) {
          String actId = ""; //$NON-NLS-1$
          if (o instanceof IConfigurationElement) {
            IConfigurationElement conf = (IConfigurationElement) o;
            actId = CadenceRegistry.getIdentifier(conf);
            if (!"".equals(actId) || actId != null) { //$NON-NLS-1$
							IActivity act = CadenceRegistry
									.getIActivityClassFromId(actId);
              if (act != null) {
                _temporyList.add(conf);
								_params
										.addParameter(actId, act
												.getParameters());
              }
            }

          }
        }

        viewer.setInput(_temporyList);
        viewer.refresh();
      }
    });
  }

  public String getParameters() {
    String value = ""; //$NON-NLS-1$
    String result = ""; //$NON-NLS-1$

    for (IConfigurationElement act : _temporyList) {
      String actId = CadenceRegistry.getIdentifier(act);
      ActivityParameters actParam = _params.getActivityParameters(actId);
      value = actId + PARAMETER_SEPARATOR; //$NON-NLS-1$
      if (actParam != null) {
        for (GenericParameter<?> p : actParam.getParameters()) {
          value += p.getName() + "=" + p.getValue() + ","; //$NON-NLS-1$ //$NON-NLS-2$
        }

        value = value.substring(0, value.length() - PARAMETER_SEPARATOR.length()) + ";"; //$NON-NLS-1$
        result += value;
      }

    }
    return result;
  }

  protected Object elementSelected(int type) {
    Object result = null;
    ISelection selected = viewer.getSelection();
    if (selected instanceof IStructuredSelection) {
      IStructuredSelection selection = (IStructuredSelection) selected;
      Object object = selection.getFirstElement();
      if (object != null) {
        switch (type) {
          case CONFIGURABLE_ELEMENT:
            result = object;
          break;
          case IDENTIFIER:
					result = CadenceRegistry
							.getIdentifier(((IConfigurationElement) object));
          break;
          case IACTIVITY:
					result = CadenceRegistry
							.getIActivityClass((IConfigurationElement) object);
          break;
          default:
          break;
        }
      }
    }
    return result;
  }

  public void setParameters(String params) {
    _temporyList.clear();
    _params = new WorkflowActivityParameter();
    if (!params.equals("")) { //$NON-NLS-1$

      String[] paramTab = params.split(Pattern.quote(";")); //$NON-NLS-1$
      for (String string_p : paramTab) {
        String[] tab = string_p.split(Pattern.quote(PARAMETER_SEPARATOR), 2);

        if (tab.length < 1)
          continue;

        String actId = tab[0];
        ActivityParameters map = new ActivityParameters();

        if (tab.length >= 2) {
          for (String k : (tab[1]).split(Pattern.quote(","))) { //$NON-NLS-1$
            String[] t = k.split(Pattern.quote("=")); //$NON-NLS-1$
            String key = t[0];
            String value = ""; //$NON-NLS-1$
            if (t.length == 2)
              value = t[1];
						map.addParameter(new GenericParameter<String>(key,
								value, "")); //$NON-NLS-1$
          }
        }
				IConfigurationElement conf_ac = CadenceRegistry
						.getActivity(actId);
        this._temporyList.add(conf_ac);

        this._params.addParameter(actId, map);
      }
    }
    viewer.setSelection(new StructuredSelection());
    viewer.setInput(_temporyList);
    
  }

  @SuppressWarnings("unchecked")
  private Object[] handleActivitiesSelect(IConfigurationElement[] activities) {
    List availableActivities = new ArrayList();
    Object[] resultSelection = null;
    Collection<String> selectedActivities = _params.getActivitiesID();

    // init with declared activities
    availableActivities.addAll(Arrays.asList(activities));

    // TODO : Handle activity multiple selection
    // remove already selected activities
    for (IConfigurationElement conf : activities) {
      String actId = CadenceRegistry.getIdentifier(conf);
      boolean isMultiple = CadenceRegistry.isMultiple(conf);
      // TODO : add a test on the allowMultipleSelection parameter
      if (!"".equals(actId) && actId != null && selectedActivities.contains(actId) && !isMultiple) //$NON-NLS-1$
        availableActivities.remove(conf);
    }

		CadenceListSelectionDialog dialog = new CadenceListSelectionDialog(tab
				.getControl().getShell(), availableActivities.toArray(),
				new CadenceContentProvider(), new CadenceLabelProvider(),
				"Select activities"); //$NON-NLS-1$

    if (resultSelection != null) {
      dialog.setInitialSelections(resultSelection);

    }

    if (dialog.open() == ListSelectionDialog.OK) {
      resultSelection = dialog.getResult();
    }
    // tab.update(); // update the tab
    return resultSelection == null ? new Object[0] : resultSelection;
  }

  public String getDescription() {
    return CadenceRegistry.getDescription(workflowElement);
  }

}
