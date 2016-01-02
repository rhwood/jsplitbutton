/*
 * Copyright (C) 2016 Randall Wood
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package com.alexandriasoftware.swing.action;

import java.awt.event.ActionEvent;
import java.util.EventListener;

/**
 * The listener interface for receiving action events. The class that is
 * interested in processing an action event implements this interface, and the
 * object created with that class is registered with a component, using the
 * component's <code>addSplitButtonActionListener</code> method. When the action
 * event occurs, that object's <code>buttonClicked</code> or
 * <code>splitButtonClicked</code> method is invoked.
 *
 * @see ActionEvent
 *
 * @author Naveed Quadri 2012
 * @author Randall Wood 2016
 */
public interface SplitButtonActionListener extends EventListener {

    /**
     * Invoked when the button part is clicked.
     */
    public void buttonClicked(ActionEvent e);

    /**
     * Invoked when split part is clicked.
     */
    public void splitButtonClicked(ActionEvent e);

}
