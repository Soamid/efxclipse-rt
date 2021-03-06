/*******************************************************************************
 * Copyright (c) Carl Zeiss Meditec AG
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Thomas Fahrmeyer (lauritziu_ii@yahoo.de) - initial API and implementation
*/ 
package org.eclipse.fx.tool.context.spy;

import org.eclipse.fx.tool.context.spy.internal.model.ContextSpyModel;
import org.eclipse.fx.tool.context.spy.internal.view.ContextSpyView;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import org.eclipse.e4.core.contexts.IEclipseContext;

import javax.annotation.PostConstruct;

/**
 * Part implementation of Context Spy
 * 
 */
public class ContextSpyPart {

	/**
	 * Creation of ContextSpyModel and view.
	 * Insertion of UI Elements to border pane.
	 * 
	 * @param parentPane
	 * @param cont
	 */
    @PostConstruct
    public void createControl( BorderPane parentPane, final IEclipseContext cont ) {
    	IEclipseContext context = getRootContext(cont);
    	
		ContextSpyModel contextSpyModel = new ContextSpyModel();

		contextSpyModel.setContext( context );
		ContextSpyView contextSpyView = new ContextSpyView(contextSpyModel);
		
		Node control = contextSpyView.getGui();
		parentPane.setCenter( control );
    }
    
    /**
     * returns root context of given context.
     * 
     * @param context
     * @return
     */
    private IEclipseContext getRootContext( IEclipseContext context ) {
    	
    	IEclipseContext parent = context;
    	do {
    		context = parent;
    		parent = context.getParent();
    	} while ( parent != null );
    	
    	return context;
    }
	
}
