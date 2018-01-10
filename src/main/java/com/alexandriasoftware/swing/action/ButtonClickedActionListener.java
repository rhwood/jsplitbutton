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

import java.awt.event.ActionListener;

/**
 * The listener interface for receiving the button clicked
 * {@link java.awt.event.ActionEvent}. The class that is interested in
 * processing an action event implements this interface, and the object created
 * with that class is registered with a component, using the component's
 * {@link com.alexandriasoftware.swing.JSplitButton#addButtonClickedActionListener(com.alexandriasoftware.swing.action.ButtonClickedActionListener)}
 * method. When the action event occurs, that object's
 * {@link java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)}
 * method is invoked.
 *
 * @author Randall Wood
 */
public interface ButtonClickedActionListener extends ActionListener {

}