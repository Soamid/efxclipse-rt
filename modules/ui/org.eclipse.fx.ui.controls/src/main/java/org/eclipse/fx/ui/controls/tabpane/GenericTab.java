/*******************************************************************************
 * Copyright (c) 2015 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ui.controls.tabpane;

/**
 * Interface the tabs need implement
 */
public interface GenericTab {
	/**
	 * @return the owner
	 */
	public GenericTabPane getOwner();

	/**
	 * @param <T>
	 *            the type
	 * @return the native instance
	 */
	public <T> T getNativeInstance();

	/**
	 * @return the user data
	 */
	public Object getUserData();
}
