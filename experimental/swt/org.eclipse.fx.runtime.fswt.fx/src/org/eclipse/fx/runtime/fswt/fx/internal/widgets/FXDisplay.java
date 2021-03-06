/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.runtime.fswt.fx.internal.widgets;

import org.eclipse.fx.runtime.fswt.FBlockCondition;
import org.eclipse.fx.runtime.fswt.FSWT;
import org.eclipse.fx.runtime.fswt.fx.FXSWT.DefaultBlockCondition;
import org.eclipse.fx.runtime.fswt.fx.internal.FXSWTObject;
import org.eclipse.fx.runtime.fswt.widgets.FDisplay;
import org.eclipse.swt.widgets.Display;

public class FXDisplay<T extends Display> extends FXSWTObject<T> implements
		FDisplay<T> {

	public FXDisplay(T nativeInstance, FSWT fswt) {
		super(nativeInstance, fswt);
	}

	public void block(FBlockCondition condition) {
		DefaultBlockCondition fCondition = (DefaultBlockCondition) condition;
		Display d = getNativeInstance();
		while (fCondition.isBlocked()) {
			if (!d.readAndDispatch()) {
				d.sleep();
			}
		}
	}
}
