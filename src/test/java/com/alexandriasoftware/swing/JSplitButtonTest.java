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
package com.alexandriasoftware.swing;

import com.alexandriasoftware.swing.action.ButtonClickedActionListener;
import com.alexandriasoftware.swing.action.SplitButtonActionListener;
import com.alexandriasoftware.swing.action.SplitButtonClickedActionListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPopupMenu;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Randall Wood
 */
public class JSplitButtonTest {

    int fired = 0;

    public JSplitButtonTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        fired = 0;
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCtorNull() {
        JSplitButton instance = new JSplitButton();
        Assert.assertTrue(instance.getText().isEmpty());
        Assert.assertNull(instance.getIcon());
    }

    @Test
    public void testCtorText() {
        String text = "test1";
        JSplitButton instance = new JSplitButton(text);
        Assert.assertEquals(text, instance.getText());
        Assert.assertNull(instance.getIcon());
    }

    @Test
    public void testCtorIcon() {
        Icon icon = new ImageIcon();
        JSplitButton instance = new JSplitButton(icon);
        Assert.assertTrue(instance.getText().isEmpty());
        Assert.assertEquals(icon, instance.getIcon());
    }

    /**
     * Test of getPopupMenu method, of class JSplitButton.
     */
    @Test
    public void testGetPopupMenu() {
        JSplitButton instance = new JSplitButton();
        Assert.assertEquals(null, instance.getPopupMenu());
    }

    /**
     * Test of setPopupMenu method, of class JSplitButton.
     */
    @Test
    public void testSetPopupMenu() {
        JPopupMenu popupMenu = null;
        JSplitButton instance = new JSplitButton();
        instance.setPopupMenu(popupMenu);
        Assert.assertNull(instance.getPopupMenu());
        popupMenu = new JPopupMenu();
        instance.setPopupMenu(popupMenu);
        Assert.assertEquals(popupMenu, instance.getPopupMenu());
    }

    /**
     * Test of getSeparatorSpacing method, of class JSplitButton.
     */
    @Test
    public void testGetSeparatorSpacing() {
        JSplitButton instance = new JSplitButton();
        Assert.assertEquals(4, instance.getSeparatorSpacing());
    }

    /**
     * Test of setSeparatorSpacing method, of class JSplitButton.
     */
    @Test
    public void testSetSeparatorSpacing() {
        int separatorSpacing = 0;
        JSplitButton instance = new JSplitButton();
        instance.setSeparatorSpacing(separatorSpacing);
        Assert.assertEquals(separatorSpacing, instance.getSeparatorSpacing());
    }

    /**
     * Test of isAlwaysDropDown method, of class JSplitButton.
     */
    @Test
    public void testIsAlwaysPopup() {
        JSplitButton instance = new JSplitButton();
        Assert.assertEquals(false, instance.isAlwaysPopup());
    }

    /**
     * Test of setAlwaysDropDown method, of class JSplitButton.
     */
    @Test
    public void testSetAlwaysPopup() {
        JSplitButton instance = new JSplitButton();
        Assert.assertEquals(false, instance.isAlwaysPopup());
        instance.setAlwaysPopup(true);
        Assert.assertEquals(true, instance.isAlwaysPopup());
        instance.setAlwaysPopup(false);
        Assert.assertEquals(false, instance.isAlwaysPopup());
    }

    /**
     * Test of getArrowColor method, of class JSplitButton.
     */
    @Test
    public void testGetArrowColor() {
        JSplitButton instance = new JSplitButton();
        Assert.assertEquals(Color.BLACK, instance.getArrowColor());
    }

    /**
     * Test of setArrowColor method, of class JSplitButton.
     */
    @Test
    public void testSetArrowColor() {
        Color arrowColor = Color.RED;
        JSplitButton instance = new JSplitButton();
        instance.setArrowColor(arrowColor);
        Assert.assertEquals(arrowColor, instance.getArrowColor());
    }

    /**
     * Test of getDisabledArrowColor method, of class JSplitButton.
     */
    @Test
    public void testGetDisabledArrowColor() {
        JSplitButton instance = new JSplitButton();
        Assert.assertEquals(Color.GRAY, instance.getDisabledArrowColor());
    }

    /**
     * Test of setDisabledArrowColor method, of class JSplitButton.
     */
    @Test
    public void testSetDisabledArrowColor() {
        Color disabledArrowColor = Color.RED;
        JSplitButton instance = new JSplitButton();
        instance.setDisabledArrowColor(disabledArrowColor);
        Assert.assertEquals(disabledArrowColor, instance.getDisabledArrowColor());
    }

    /**
     * Test of getSplitWidth method, of class JSplitButton.
     */
    @Test
    public void testGetSplitWidth() {
        JSplitButton instance = new JSplitButton();
        Assert.assertEquals(22, instance.getSplitWidth());
    }

    /**
     * Test of setSplitWidth method, of class JSplitButton.
     */
    @Test
    public void testSetSplitWidth() {
        int splitWidth = 0;
        JSplitButton instance = new JSplitButton();
        instance.setSplitWidth(splitWidth);
        Assert.assertEquals(splitWidth, instance.getSplitWidth());
    }

    /**
     * Test of getArrowSize method, of class JSplitButton.
     */
    @Test
    public void testGetArrowSize() {
        JSplitButton instance = new JSplitButton();
        Assert.assertEquals(8, instance.getArrowSize());
    }

    /**
     * Test of setArrowSize method, of class JSplitButton.
     */
    @Test
    public void testSetArrowSize() {
        int arrowSize = 0;
        JSplitButton instance = new JSplitButton();
        instance.setArrowSize(arrowSize);
        Assert.assertEquals(arrowSize, instance.getArrowSize());
    }

    /**
     * Test of getImage method, of class JSplitButton.
     */
    @Test
    public void testGetImage() {
        JSplitButton instance = new JSplitButton();
        Assert.assertNotNull(instance.getImage());
        instance.setImage(null);
        instance.setPopupMenu(new JPopupMenu());
        Assert.assertNotNull(instance.getImage());
    }

    /**
     * Test of setImage method, of class JSplitButton.
     */
    @Test
    public void testSetImage() {
        Image image = (new ImageIcon(getClass().getResource("/com/alexandriasoftware/swing/splitbutton_16.png").getFile())).getImage();
        JSplitButton instance = new JSplitButton();
        instance.setImage(null);
        Assert.assertNotNull(instance.getImage());
        instance.setImage(image);
        Assert.assertEquals(image, instance.getImage());
    }

    /**
     * Test of getDisabledImage method, of class JSplitButton.
     */
    @Test
    public void testGetDisabledImage() {
        JSplitButton instance = new JSplitButton();
        Assert.assertNotNull(instance.getDisabledImage());
    }

    /**
     * Test of setDisabledImage method, of class JSplitButton.
     */
    @Test
    public void testSetDisabledImage() {
        Image image = (new ImageIcon(getClass().getResource("/com/alexandriasoftware/swing/splitbutton_16.png").getFile())).getImage();
        JSplitButton instance = new JSplitButton();
        instance.setDisabledImage(null);
        Assert.assertNotNull(instance.getDisabledImage());
        instance.setDisabledImage(image);
        Assert.assertEquals(image, instance.getDisabledImage());
    }

    /**
     * Test of paintComponent method, of class JSplitButton.
     */
    @Test
    @Ignore
    public void testPaintComponent() {
        System.out.println("paintComponent");
        JSplitButton instance = new JSplitButton();
        Graphics g = instance.getGraphics();
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        Assert.fail("The test case is a prototype.");
    }

    /**
     * Test of addSplitButtonActionListener method, of class JSplitButton.
     */
    @Test
    public void testAddSplitButtonActionListener() {
        SplitButtonActionListener l = new AbstractSplitButtonActionListener();
        JSplitButton instance = new JSplitButton();
        instance.addSplitButtonActionListener(l);
        instance.getListener().actionPerformed(new ActionEvent(instance, 0, "testRemoveSplitButtonActionListener"));
        Assert.assertEquals(1, fired);
    }

    /**
     * Test of removeSplitButtonActionListener method, of class JSplitButton.
     */
    @Test
    public void testRemoveSplitButtonActionListener() {
        AbstractSplitButtonActionListener l = new AbstractSplitButtonActionListener();
        JSplitButton instance = new JSplitButton();
        instance.addSplitButtonActionListener(l);
        instance.getListener().actionPerformed(new ActionEvent(instance, 0, "testRemoveSplitButtonActionListener"));
        instance.removeSplitButtonActionListener(l);
        instance.getListener().actionPerformed(new ActionEvent(instance, 0, "testRemoveSplitButtonActionListener"));
        Assert.assertEquals(1, fired);
        instance.setAction(l);
        instance.removeSplitButtonActionListener(l);
        Assert.assertNull(instance.getAction());
    }

    /**
     * Test of addSplitButtonActionListener method, of class JSplitButton.
     */
    @Test
    public void testAddButtonClickedActionListener() {
        ButtonClickedActionListener l = new AbstractButtonClickedActionListener();
        JSplitButton instance = new JSplitButton();
        instance.addButtonClickedActionListener(l);
        instance.getListener().actionPerformed(new ActionEvent(instance, 0, "testRemoveSplitButtonActionListener"));
        Assert.assertEquals(1, fired);
    }

    /**
     * Test of removeSplitButtonActionListener method, of class JSplitButton.
     */
    @Test
    public void testRemoveButtonClickedActionListener() {
        AbstractButtonClickedActionListener l = new AbstractButtonClickedActionListener();
        JSplitButton instance = new JSplitButton();
        instance.addButtonClickedActionListener(l);
        instance.getListener().actionPerformed(new ActionEvent(instance, 0, "testRemoveSplitButtonActionListener"));
        instance.removeButtonClickedActionListener(l);
        instance.getListener().actionPerformed(new ActionEvent(instance, 0, "testRemoveSplitButtonActionListener"));
        Assert.assertEquals(1, fired);
    }

    /**
     * Test of addSplitButtonActionListener method, of class JSplitButton.
     */
    @Test
    public void testAddSplitButtonClickedActionListener() {
        SplitButtonClickedActionListener l = new AbstractSplitButtonClickedActionListener();
        JSplitButton instance = new JSplitButton();
        instance.setPopupMenu(new JPopupMenu()); // a null or unset popup menu prevents the split action from firing
        instance.addSplitButtonClickedActionListener(l);
        instance.fireSplitButtonClicked(new ActionEvent(instance, 0, "testRemoveSplitButtonActionListener"));
        Assert.assertEquals(1, fired);
    }

    /**
     * Test of removeSplitButtonActionListener method, of class JSplitButton.
     */
    @Test
    public void testRemoveSplitButtonClickedActionListener() {
        SplitButtonClickedActionListener l = new AbstractSplitButtonClickedActionListener();
        JSplitButton instance = new JSplitButton();
        instance.setPopupMenu(new JPopupMenu()); // a null or unset popup menu prevents the split action from firing
        instance.addSplitButtonClickedActionListener(l);
        instance.fireSplitButtonClicked(new ActionEvent(instance, 0, "testRemoveSplitButtonActionListener"));
        instance.removeSplitButtonClickedActionListener(l);
        instance.fireSplitButtonClicked(new ActionEvent(instance, 0, "testRemoveSplitButtonActionListener"));
        Assert.assertEquals(1, fired);
    }

    /**
     * Test of actionPerformed method, of class JSplitButton.
     */
    @Test
    public void testActionPerformed() {
        JSplitButton instance = new JSplitButton();
        instance.setPopupMenu(null);
        instance.addButtonClickedActionListener(new AbstractButtonClickedActionListener());
        // no menu, always popup false, action command not null
        instance.getListener().actionPerformed(new ActionEvent(instance, 0, "testActionPerformed"));
        Assert.assertEquals(1, fired);
        // no menu, always popup false, action command null
        instance.getListener().actionPerformed(new ActionEvent(instance, 0, null));
        Assert.assertEquals(2, fired);
        instance.setAlwaysPopup(true);
        // no menu, always popup true, action command not null
        instance.getListener().actionPerformed(new ActionEvent(instance, 0, "testActionPerformed"));
        Assert.assertEquals(3, fired);
        // no menu, always popup true, action command null
        instance.getListener().actionPerformed(new ActionEvent(instance, 0, null));
        Assert.assertEquals(4, fired);
        // TODO: place following in JFrame and display the frame
        /*
        instance.setPopupMenu(new JPopupMenu());
        // menu, always popup true
        instance.getListener().actionPerformed(new ActionEvent(instance, 0, "testActionPerformed"));
        Assert.assertEquals(3, fired);
        instance.setAlwaysPopup(false);
        // menu, always popup false
        instance.getListener().actionPerformed(new ActionEvent(instance, 0, "testActionPerformed"));
        Assert.assertEquals(4, fired);
        */
    }

    /**
     * Test of mouseMoved method, of class JSplitButton.
     */
    @Test
    public void testMouseMoved() {
        JSplitButton instance = new JSplitButton();
        instance.onSplit = true;
        MouseEvent e = new MouseEvent(instance, 0, 0, MouseEvent.MOUSE_MOVED, 0, 0, 0, false);
        instance.getListener().mouseMoved(e);
        Assert.assertFalse(instance.onSplit);
    }

    /**
     * Test of mouseExited method, of class JSplitButton.
     */
    @Test
    public void testMouseExited() {
        JSplitButton instance = new JSplitButton();
        instance.onSplit = true;
        MouseEvent e = new MouseEvent(instance, 0, 0, MouseEvent.MOUSE_EXITED, 0, 0, 0, false);
        instance.getListener().mouseExited(e);
        Assert.assertFalse(instance.onSplit);
    }

    @Test
    public void testMouseDragged() {
        JSplitButton instance = new JSplitButton();
        instance.onSplit = true;
        MouseEvent e = new MouseEvent(instance, 0, 0, MouseEvent.MOUSE_DRAGGED, 0, 0, 0, false);
        instance.getListener().mouseDragged(e);
        Assert.assertTrue(instance.onSplit);
    }

    @Test
    public void testMouseClicked() {
        JSplitButton instance = new JSplitButton();
        instance.onSplit = true;
        MouseEvent e = new MouseEvent(instance, 0, 0, MouseEvent.MOUSE_CLICKED, 0, 0, 0, false);
        instance.getListener().mouseClicked(e);
        Assert.assertTrue(instance.onSplit);
    }

    @Test
    public void testMousePressed() {
        JSplitButton instance = new JSplitButton();
        instance.onSplit = true;
        MouseEvent e = new MouseEvent(instance, 0, 0, MouseEvent.MOUSE_PRESSED, 0, 0, 0, false);
        instance.getListener().mousePressed(e);
        Assert.assertTrue(instance.onSplit);
    }

    @Test
    public void testMouseReleased() {
        JSplitButton instance = new JSplitButton();
        instance.onSplit = true;
        MouseEvent e = new MouseEvent(instance, 0, 0, MouseEvent.MOUSE_RELEASED, 0, 0, 0, false);
        instance.getListener().mouseReleased(e);
        Assert.assertTrue(instance.onSplit);
    }

    @Test
    public void testMouseEntered() {
        JSplitButton instance = new JSplitButton();
        instance.onSplit = true;
        MouseEvent e = new MouseEvent(instance, 0, 0, MouseEvent.MOUSE_ENTERED, 0, 0, 0, false);
        instance.getListener().mouseEntered(e);
        Assert.assertTrue(instance.onSplit);
    }

    @Test
    public void testIsAlwaysDropDown() {
        JSplitButton instance = new JSplitButton();
        Assert.assertEquals(false, instance.isAlwaysDropDown());
        Assert.assertEquals(instance.isAlwaysPopup(), instance.isAlwaysDropDown());
    }

    @Test
    public void testSetAlwaysDropDown() {
        JSplitButton instance = new JSplitButton();
        Assert.assertEquals(false, instance.isAlwaysPopup());
        Assert.assertEquals(instance.isAlwaysPopup(), instance.isAlwaysDropDown());
        instance.setAlwaysDropDown(true);
        Assert.assertEquals(true, instance.isAlwaysPopup());
        Assert.assertEquals(instance.isAlwaysPopup(), instance.isAlwaysDropDown());
        instance.setAlwaysDropDown(false);
        Assert.assertEquals(false, instance.isAlwaysPopup());
        Assert.assertEquals(instance.isAlwaysPopup(), instance.isAlwaysDropDown());
    }

    private class AbstractSplitButtonClickedActionListener implements SplitButtonClickedActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            fired += 1;
        }
    }

    private class AbstractButtonClickedActionListener implements ButtonClickedActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            fired += 1;
        }
    }

    private class AbstractSplitButtonActionListener extends AbstractAction implements SplitButtonActionListener {

        @Override
        public void buttonClicked(ActionEvent e) {
            fired += 1;
        }

        @Override
        public void splitButtonClicked(ActionEvent e) {
            // do nothing
        }

        public void actionPerformed(ActionEvent e) {
            fired += 1;
        }
    };

}
