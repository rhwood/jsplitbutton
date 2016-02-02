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

import com.alexandriasoftware.swing.action.SplitButtonActionListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
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
        boolean alwaysDropDown = true;
        JSplitButton instance = new JSplitButton();
        instance.setAlwaysPopup(alwaysDropDown);
        Assert.assertEquals(alwaysDropDown, instance.isAlwaysPopup());
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
        instance.listener.actionPerformed(new ActionEvent(instance, 0, "testRemoveSplitButtonActionListener"));
        Assert.assertEquals(1, fired);
    }

    /**
     * Test of removeSplitButtonActionListener method, of class JSplitButton.
     */
    @Test
    public void testRemoveSplitButtonActionListener() {
        SplitButtonActionListener l = new AbstractSplitButtonActionListener();
        JSplitButton instance = new JSplitButton();
        instance.addSplitButtonActionListener(l);
        instance.listener.actionPerformed(new ActionEvent(instance, 0, "testRemoveSplitButtonActionListener"));
        instance.removeSplitButtonActionListener(l);
        instance.listener.actionPerformed(new ActionEvent(instance, 0, "testRemoveSplitButtonActionListener"));
        Assert.assertEquals(1, fired);
    }

    /**
     * Test of mouseMoved method, of class JSplitButton.
     */
    @Test
    @Ignore
    public void testMouseMoved() {
        System.out.println("mouseMoved");
        JSplitButton instance = new JSplitButton();
        MouseEvent e = new MouseEvent(instance, 0, 0, MouseEvent.MOUSE_MOVED, 0, 0, 0, false);
        instance.listener.mouseMoved(e);
        // TODO review the generated test code and remove the default call to fail.
        Assert.fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class JSplitButton.
     */
    @Test
    public void testActionPerformed() {
        ActionEvent e = null;
        JSplitButton instance = new JSplitButton();
        instance.addSplitButtonActionListener(new AbstractSplitButtonActionListener());
        instance.listener.actionPerformed(new ActionEvent(instance, 0, "testActionPerformed"));
        Assert.assertEquals(1, fired);
    }

    /**
     * Test of mouseExited method, of class JSplitButton.
     */
    @Test
    public void testMouseExited() {
        JSplitButton instance = new JSplitButton();
        instance.onSplit = true;
        MouseEvent e = new MouseEvent(instance, 0, 0, MouseEvent.MOUSE_EXITED, 0, 0, 0, false);
        instance.listener.mouseExited(e);
        Assert.assertFalse(instance.onSplit);
    }

    class AbstractSplitButtonActionListener implements SplitButtonActionListener {

        public void buttonClicked(ActionEvent e) {
            fired += 1;
        }

        public void splitButtonClicked(ActionEvent e) {
            // do nothing
        }
    };

}
