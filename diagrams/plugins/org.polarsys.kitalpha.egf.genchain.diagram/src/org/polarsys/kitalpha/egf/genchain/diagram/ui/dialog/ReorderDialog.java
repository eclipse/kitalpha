/**
 * 
 */
package org.polarsys.kitalpha.egf.genchain.diagram.ui.dialog;

import java.util.List;

import org.eclipse.egf.pattern.ui.Activator;
import org.eclipse.egf.pattern.ui.ImageShop;
import org.eclipse.egf.portfolio.genchain.tools.ui.wizards.Node;
import org.eclipse.egf.portfolio.genchain.tools.ui.wizards.NodeContentProvider;
import org.eclipse.egf.portfolio.genchain.tools.ui.wizards.NodeLabelProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.polarsys.kitalpha.egf.genchain.diagram.message.Messages;

/**
 * @author Thomas Guiu
 * 
 */
public class ReorderDialog extends TitleAreaDialog {

	private ListViewer viewer;
	private Button upButton, downButton;
	private final List<Node> model;

	public ReorderDialog(Shell parentShell, List<Node> model) {
		super(parentShell);
		this.model = model;

	}

	@Override
	protected Control createDialogArea(Composite parent) {
		initializeDialogUnits(parent);
		Composite mainArea = (Composite) super.createDialogArea(parent);
		Composite control = new Composite(mainArea, SWT.NONE);
		control.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		control.setLayout(new GridLayout(2, false));

		setTitle(Messages.ReorderDialog_title);
		setMessage(Messages.ReorderDialog_description);

		createViewerControl(control);
		createButtonControl(control);
		viewer.setInput(getModels());
		refreshButtons();
		return mainArea;
	}

	private void createViewerControl(Composite control) {
		viewer = new ListViewer(control, SWT.BORDER);
		viewer.getList().setLayoutData(new GridData(GridData.FILL_BOTH));
		viewer.setLabelProvider(new NodeLabelProvider());
		viewer.setContentProvider(new NodeContentProvider());
		viewer.getList().addSelectionListener(new MySelectionListener() {
			protected void buttonSelected() {
			}
		});
	}

	private void createButtonControl(Composite parent) {
		parent = new Composite(parent, SWT.NONE);
		GridData gd = new GridData(GridData.FILL_VERTICAL);
		parent.setLayoutData(gd);
		GridLayout layout = new GridLayout();
		layout.marginWidth = 0;
		parent.setFont(parent.getFont());
		parent.setLayout(layout);

		upButton = new Button(parent, SWT.PUSH);
		upButton.setToolTipText(org.eclipse.egf.portfolio.genchain.tools.ui.Messages.genchain_wizard_upButton_label);
		upButton.setImage(Activator.getDefault().getImage(ImageShop.IMG_UPWARD_OBJ));
		upButton.addSelectionListener(new MySelectionListener() {

			@Override
			protected void buttonSelected() {
				IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
				if (selection.size() == 1) {
					Node node = (Node) selection.getFirstElement();
					final int index = getModels().indexOf(node);
					if (index > 0) {
						getModels().remove(node);
						getModels().add(index - 1, node);
					}
				}
				viewer.refresh();
			}

		});

		downButton = new Button(parent, SWT.PUSH);
		downButton.setToolTipText(org.eclipse.egf.portfolio.genchain.tools.ui.Messages.genchain_wizard_downButton_label);
		downButton.setImage(Activator.getDefault().getImage(ImageShop.IMG_DOWNWARD_OBJ));
		downButton.addSelectionListener(new MySelectionListener() {

			@Override
			protected void buttonSelected() {
				IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
				if (selection.size() == 1) {
					Node node = (Node) selection.getFirstElement();
					final int index = getModels().indexOf(node);
					if (index < getModels().size() - 1) {
						getModels().remove(node);
						getModels().add(index + 1, node);
					}
				}
				viewer.refresh();
			}
		});
	}

	protected void refreshButtons() {
		upButton.setEnabled(false);
		downButton.setEnabled(false);
		IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
		if (selection.size() == 1) {
			Node node = (Node) selection.getFirstElement();
			final int index = getModels().indexOf(node);
			upButton.setEnabled(index > 0);
			downButton.setEnabled(index < getModels().size() - 1);
		}
	}

	public List<Node> getModels() {
		return model;
	}

	private abstract class MySelectionListener implements SelectionListener {
		protected abstract void buttonSelected();

		public void widgetSelected(SelectionEvent e) {
			buttonSelected();
			refreshButtons();
		}

		public void widgetDefaultSelected(SelectionEvent e) {
		}

	}

}
