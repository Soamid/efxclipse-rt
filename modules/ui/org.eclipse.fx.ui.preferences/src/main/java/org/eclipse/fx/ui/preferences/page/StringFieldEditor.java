/*******************************************************************************
 * Copyright (c) 2018 BestSolution.at, EclipseSource and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API
 *     Camille Letavernier <cletavernier@eclipsesource.com> - initial implementation
 *******************************************************************************/
package org.eclipse.fx.ui.preferences.page;

import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

/**
 * <p>
 * A Field editor for string preferences.
 * </p>
 */
public class StringFieldEditor extends FieldEditor {

	private HBox textFieldContainer;
	private TextField textField;

	public StringFieldEditor(String name, String label) {
		super(name, label);
		this.textFieldContainer = new HBox();
		this.textField = new TextField();
		this.textField.setMaxWidth(Double.MAX_VALUE);
		this.textFieldContainer.getChildren().add(textField);
		HBox.setHgrow(textField, Priority.ALWAYS);
		getChildren().add(this.textFieldContainer);
	}

	protected HBox getTextContainer() {
		return this.textFieldContainer;
	}
	
	protected TextField getTextField() {
		return this.textField;
	}

	public StringFieldEditor(String name) {
		this(name, null);
	}

	@Override
	protected void doLoad() {
		this.textField.setText(getMemento().get(getName(), ""));
	}

	@Override
	protected void doRestoreDefaults() {
		this.textField.setText(getMemento().getDefaultString(getName()));
	}

	@Override
	protected void doPersist() {
		getMemento().put(getName(), this.textField.getText());
	}

	@Override
	protected ObservableValue<?> getValue() {
		return this.textField.textProperty();
	}

}
