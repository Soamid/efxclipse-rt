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
package org.eclipse.fx.ui.workbench.renderers.base.widget;

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * Mixin implemented by widget who act as drag target
 */
public interface WDragTargetWidget {
	/**
	 * Callback to invoke when element is dropped
	 * 
	 * @param callback
	 *            the callback
	 */
	public void setDragDroppedCallback(@NonNull WCallback<@NonNull DropData, @Nullable Void> callback);

	/**
	 * The drop type
	 */
	public enum DropType {
		/**
		 * Before the reference element
		 */
		BEFORE,
		/**
		 * After the reference element
		 */
		AFTER,
		/**
		 * Insert the element into the reference
		 */
		INSERT,
		/**
		 * Split on the left
		 */
		SPLIT_VERTICAL,
		/**
		 * split on the bottom
		 */
		SPLIT_HORIZONTAL
	}

	/**
	 * Drop data
	 */
	public static class DropData {
		/**
		 * The reference element
		 */
		@Nullable
		public final MUIElement reference;
		/**
		 * The source element
		 */
		@NonNull
		public final MUIElement sourceElement;
		/**
		 * The drop type
		 */
		@NonNull
		public final DropType dropType;

		/**
		 * Create new drop data
		 * 
		 * @param reference
		 *            the reference
		 * @param sourceElement
		 *            the source element
		 * @param dropType
		 *            the drop type
		 */
		public DropData(@Nullable MUIElement reference, @NonNull MUIElement sourceElement, @NonNull DropType dropType) {
			this.reference = reference;
			this.sourceElement = sourceElement;
			this.dropType = dropType;
		}
	}
}
