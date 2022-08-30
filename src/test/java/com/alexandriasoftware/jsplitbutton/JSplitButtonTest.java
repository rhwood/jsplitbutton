/*
 * Copyright (C) 2016, 2018 Randall Wood
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alexandriasoftware.jsplitbutton;

import com.alexandriasoftware.jsplitbutton.JSplitButton.Listener;
import com.alexandriasoftware.jsplitbutton.action.ButtonClickedActionListener;
import com.alexandriasoftware.jsplitbutton.action.SplitButtonClickedActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.stream.*;
import javax.swing.*;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

/**
 *
 * @author Randall Wood
 */
class JSplitButtonTest {

    int buttonClickFired = 0;
    int splitButtonClickFired = 0;

    @BeforeEach
    void setUp() {
        this.buttonClickFired = 0;
        this.splitButtonClickFired = 0;
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testCtorNull() {
        JSplitButton instance = new JSplitButton();
        assertTrue(instance.getText().isEmpty());
        assertNull(instance.getIcon());
    }

    @Test
    void testCtorText() {
        String text = "test1";
        JSplitButton instance = new JSplitButton(text);
        assertEquals(text, instance.getText());
        assertNull(instance.getIcon());
    }

    @Test
    void testGetPreferredWidthNoMenu() {
        String text = "test1";
        JSplitButton instance = new JSplitButton(text);
        instance.setPopupMenu(null);
        assertEquals(new JButton(text).getPreferredSize().width,
                instance.getPreferredSize().width);
    }

    @Test
    void testGetPreferredWidthWithMenu() {
        String text = "test1";
        JSplitButton instance = new JSplitButton(text);
        JPopupMenu menu = new JPopupMenu();
        menu.add(text);
        instance.setPopupMenu(new JPopupMenu());
        assertEquals(new JButton(text).getPreferredSize().width + instance.getSplitWidth(),
                instance.getPreferredSize().width);
    }

    @Test
    void testCtorIcon() {
        Icon icon = new ImageIcon();
        JSplitButton instance = new JSplitButton(icon);
        assertTrue(instance.getText().isEmpty());
        assertEquals(icon, instance.getIcon());
    }

    /**
     * Test of getPopupMenu method, of class JSplitButton.
     */
    @Test
    void testGetPopupMenu() {
        JSplitButton instance = new JSplitButton();
        assertEquals(null, instance.getPopupMenu());
    }

    /**
     * Test of setPopupMenu method, of class JSplitButton.
     */
    @Test
    void testSetPopupMenu() {
        JPopupMenu popupMenu = null;
        JSplitButton instance = new JSplitButton();
        instance.setPopupMenu(popupMenu);
        assertNull(instance.getPopupMenu());
        popupMenu = new JPopupMenu();
        instance.setPopupMenu(popupMenu);
        assertEquals(popupMenu, instance.getPopupMenu());
    }

    /**
     * Test of getSeparatorSpacing method, of class JSplitButton.
     */
    @Test
    void testGetSeparatorSpacing() {
        JSplitButton instance = new JSplitButton();
        assertEquals(4, instance.getSeparatorSpacing());
    }

    /**
     * Test of setSeparatorSpacing method, of class JSplitButton.
     */
    @Test
    void testSetSeparatorSpacing() {
        int separatorSpacing = 0;
        JSplitButton instance = new JSplitButton();
        instance.setSeparatorSpacing(separatorSpacing);
        assertEquals(separatorSpacing, instance.getSeparatorSpacing());
    }

    /**
     * Test of isAlwaysDropDown method, of class JSplitButton.
     */
    @Test
    void testIsAlwaysPopup() {
        JSplitButton instance = new JSplitButton();
        assertEquals(false, instance.isAlwaysPopup());
    }

    /**
     * Test of setAlwaysDropDown method, of class JSplitButton.
     */
    @Test
    void testSetAlwaysPopup() {
        JSplitButton instance = new JSplitButton();
        assertEquals(false, instance.isAlwaysPopup());
        instance.setAlwaysPopup(true);
        assertEquals(true, instance.isAlwaysPopup());
        instance.setAlwaysPopup(false);
        assertEquals(false, instance.isAlwaysPopup());
    }

    /**
     * Test of getArrowColor method, of class JSplitButton.
     */
    @Test
    void testGetArrowColor() {
        JSplitButton instance = new JSplitButton();
        assertEquals(Color.BLACK, instance.getArrowColor());
    }

    /**
     * Test of setArrowColor method, of class JSplitButton.
     */
    @Test
    void testSetArrowColor() {
        Color arrowColor = Color.RED;
        JSplitButton instance = new JSplitButton();
        instance.setArrowColor(arrowColor);
        assertEquals(arrowColor, instance.getArrowColor());
    }

    /**
     * Test of getDisabledArrowColor method, of class JSplitButton.
     */
    @Test
    void testGetDisabledArrowColor() {
        JSplitButton instance = new JSplitButton();
        assertEquals(Color.GRAY, instance.getDisabledArrowColor());
    }

    /**
     * Test of setDisabledArrowColor method, of class JSplitButton.
     */
    @Test
    void testSetDisabledArrowColor() {
        Color disabledArrowColor = Color.RED;
        JSplitButton instance = new JSplitButton();
        instance.setDisabledArrowColor(disabledArrowColor);
        assertEquals(disabledArrowColor, instance.getDisabledArrowColor());
    }

    /**
     * Test of getSplitWidth method, of class JSplitButton.
     */
    @Test
    void testGetSplitWidth() {
        JSplitButton instance = new JSplitButton();
        assertEquals(22, instance.getSplitWidth());
    }

    /**
     * Test of setSplitWidth method, of class JSplitButton.
     */
    @Test
    void testSetSplitWidth() {
        int splitWidth = 0;
        JSplitButton instance = new JSplitButton();
        instance.setSplitWidth(splitWidth);
        assertEquals(splitWidth, instance.getSplitWidth());
    }

    /**
     * Test of getArrowSize method, of class JSplitButton.
     */
    @Test
    void testGetArrowSize() {
        JSplitButton instance = new JSplitButton();
        assertEquals(8, instance.getArrowSize());
    }

    /**
     * Test of setArrowSize method, of class JSplitButton.
     */
    @Test
    void testSetArrowSize() {
        int arrowSize = 0;
        JSplitButton instance = new JSplitButton();
        instance.setArrowSize(arrowSize);
        assertEquals(arrowSize, instance.getArrowSize());
    }

    /**
     * Test of getImage method, of class JSplitButton.
     */
    @Test
    void testGetImage() {
        JSplitButton instance = new JSplitButton();
        assertNotNull(instance.getImage());
        instance.setImage(null);
        instance.setPopupMenu(new JPopupMenu());
        assertNotNull(instance.getImage());
    }

    /**
     * Test of setImage method, of class JSplitButton.
     */
    @Test
    void testSetImage() {
        Image image = (new ImageIcon(getClass().getResource("/com/alexandriasoftware/jsplitbutton/splitbutton_16.png").getFile())).getImage();
        JSplitButton instance = new JSplitButton();
        instance.setImage(null);
        assertNotNull(instance.getImage());
        instance.setImage(image);
        assertEquals(image, instance.getImage());
    }

    /**
     * Test of getDisabledImage method, of class JSplitButton.
     */
    @Test
    void testGetDisabledImage() {
        JSplitButton instance = new JSplitButton();
        assertNotNull(instance.getDisabledImage());
    }

    /**
     * Test of setDisabledImage method, of class JSplitButton.
     */
    @Test
    void testSetDisabledImage() {
        Image image = (new ImageIcon(getClass().getResource("/com/alexandriasoftware/jsplitbutton/splitbutton_16.png").getFile())).getImage();
        JSplitButton instance = new JSplitButton();
        instance.setDisabledImage(null);
        assertNotNull(instance.getDisabledImage());
        instance.setDisabledImage(image);
        assertEquals(image, instance.getDisabledImage());
    }
    
    @ParameterizedTest
    @ArgumentsSource(PaintComponentArgumentsProvider.class)
    void testPaintComponent(boolean alwaysPopup, JPopupMenu menu, boolean enabled, boolean onSplit) {
        JFrame frame = new JFrame();
        JSplitButton instance = new JSplitButton();
        frame.add(instance);
        frame.setVisible(true);
        instance.setAlwaysPopup(alwaysPopup);
        instance.setPopupMenu(menu);
        instance.setEnabled(enabled);
        Graphics g = instance.getGraphics();
        setOnSplit(instance, onSplit);
        instance.paintComponent(g);
        // no exceptions passes
    }

    /**
     * Test of addSplitButtonActionListener method, of class JSplitButton.
     */
    @Test
    void testAddButtonClickedActionListener() {
        ButtonClickedActionListener l = new AbstractButtonClickedActionListener();
        JSplitButton instance = new JSplitButton();
        instance.addButtonClickedActionListener(l);
        // right side, set action command
        fireSplitButtonClicked(instance, new ActionEvent(instance, 0, "testAddButtonClickedActionListener"));
        assertEquals(0, this.buttonClickFired);
        // right side, null action command
        fireSplitButtonClicked(instance, new ActionEvent(instance, 0, null));
        assertEquals(0, this.buttonClickFired);
        // left side, set action command
        fireButtonClicked(instance, new ActionEvent(instance, 0, "testAddButtonClickedActionListener"));
        assertEquals(1, this.buttonClickFired);
        // left side, null action command
        fireButtonClicked(instance, new ActionEvent(instance, 0, null));
        assertEquals(2, this.buttonClickFired);
    }

    /**
     * Test of removeSplitButtonActionListener method, of class JSplitButton.
     */
    @Test
    void testRemoveButtonClickedActionListener() {
        AbstractButtonClickedActionListener l = new AbstractButtonClickedActionListener();
        JSplitButton instance = new JSplitButton();
        instance.addButtonClickedActionListener(l);
        instance.getListener().actionPerformed(new ActionEvent(instance, 0, "testRemoveButtonClickedActionListener"));
        assertEquals(1, this.buttonClickFired);
        instance.removeButtonClickedActionListener(l);
        instance.getListener().actionPerformed(new ActionEvent(instance, 0, "testRemoveButtonClickedActionListener"));
        assertEquals(1, this.buttonClickFired);
    }

    /**
     * Test of addSplitButtonActionListener method, of class JSplitButton.
     */
    @Test
    void testAddSplitButtonClickedActionListener() {
        SplitButtonClickedActionListener l = new AbstractSplitButtonClickedActionListener();
        JSplitButton instance = new JSplitButton();
        instance.setPopupMenu(new JPopupMenu()); // a null or unset popup menu prevents the split action from firing
        instance.addSplitButtonClickedActionListener(l);
        // set action command
        fireSplitButtonClicked(instance, new ActionEvent(instance, 0, "testAddSplitButtonClickedActionListener"));
        assertEquals(1, this.splitButtonClickFired);
        // null action command
        fireSplitButtonClicked(instance, new ActionEvent(instance, 0, null));
        assertEquals(2, this.splitButtonClickFired);
        // set action command
        fireButtonClicked(instance, new ActionEvent(instance, 0, "testAddSplitButtonClickedActionListener"));
        assertEquals(2, this.splitButtonClickFired);
        // null action command
        fireButtonClicked(instance, new ActionEvent(instance, 0, null));
        assertEquals(2, this.splitButtonClickFired);
    }

    /**
     * Test of removeSplitButtonActionListener method, of class JSplitButton.
     */
    @Test
    void testRemoveSplitButtonClickedActionListener() {
        SplitButtonClickedActionListener l = new AbstractSplitButtonClickedActionListener();
        JSplitButton instance = new JSplitButton();
        instance.setPopupMenu(new JPopupMenu()); // a null or unset popup menu prevents the split action from firing
        instance.addSplitButtonClickedActionListener(l);
        fireSplitButtonClicked(instance, new ActionEvent(instance, 0, "testRemoveSplitButtonActionListener"));
        assertEquals(1, this.splitButtonClickFired);
        instance.removeSplitButtonClickedActionListener(l);
        fireSplitButtonClicked(instance, new ActionEvent(instance, 0, "testRemoveSplitButtonActionListener"));
        assertEquals(1, this.splitButtonClickFired);
    }

    /**
     * Test of actionPerformed method, of class JSplitButton.
     */
    @Test
    void testActionPerformed() {
        JFrame frame = new JFrame();
        JSplitButton instance = new JSplitButton();
        frame.add(instance);
        frame.setVisible(true);
        instance.setPopupMenu(null);
        instance.addButtonClickedActionListener(new AbstractButtonClickedActionListener());
        instance.addSplitButtonClickedActionListener(new AbstractSplitButtonClickedActionListener());
        // no menu, always popup false, action command not null
        instance.getListener().actionPerformed(new ActionEvent(instance, 0, "testActionPerformed"));
        assertEquals(1, this.buttonClickFired);
        assertEquals(0, this.splitButtonClickFired);
        // no menu, always popup false, action command null
        instance.getListener().actionPerformed(new ActionEvent(instance, 0, null));
        assertEquals(2, this.buttonClickFired);
        assertEquals(0, this.splitButtonClickFired);
        instance.setAlwaysPopup(true);
        // no menu, always popup true, action command not null
        instance.getListener().actionPerformed(new ActionEvent(instance, 0, "testActionPerformed"));
        assertEquals(3, this.buttonClickFired);
        assertEquals(0, this.splitButtonClickFired);
        // no menu, always popup true, action command null
        instance.getListener().actionPerformed(new ActionEvent(instance, 0, null));
        assertEquals(4, this.buttonClickFired);
        assertEquals(0, this.splitButtonClickFired);
        instance.setPopupMenu(new JPopupMenu());
        // menu, always popup true, action command not null
        instance.getListener().actionPerformed(new ActionEvent(instance, 0, "testActionPerformed"));
        assertEquals(5, this.buttonClickFired);
        assertEquals(0, this.splitButtonClickFired);
        // menu, always popup true, action command null
        instance.getListener().actionPerformed(new ActionEvent(instance, 0, null));
        assertEquals(6, this.buttonClickFired);
        assertEquals(0, this.splitButtonClickFired);
        instance.setAlwaysPopup(false);
        // menu, always popup false, action command not null
        instance.getListener().actionPerformed(new ActionEvent(instance, 0, "testActionPerformed"));
        assertEquals(7, this.buttonClickFired);
        assertEquals(0, this.splitButtonClickFired);
        // menu, always popup false, action command not null
        instance.getListener().actionPerformed(new ActionEvent(instance, 0, null));
        assertEquals(8, this.buttonClickFired);
        assertEquals(0, this.splitButtonClickFired);
        setOnSplit(instance, true);
        // menu, always popup false, on split
        instance.getListener().actionPerformed(new ActionEvent(instance, 0, "testActionPerformed"));
        assertEquals(8, this.buttonClickFired);
        assertEquals(1, this.splitButtonClickFired);
    }

    /**
     * Test of mouseMoved method, of class JSplitButton.
     */
    @Test
    void testMouseMoved() {
        this.testMouseEvent(MouseEvent.MOUSE_MOVED, false);
    }

    /**
     * Test of mouseExited method, of class JSplitButton.
     */
    @Test
    void testMouseExited() {
        this.testMouseEvent(MouseEvent.MOUSE_EXITED, false);
    }

    @Test
    void testMouseDragged() {
        this.testMouseEvent(MouseEvent.MOUSE_DRAGGED, true);
    }

    @Test
    void testMouseClicked() {
        this.testMouseEvent(MouseEvent.MOUSE_CLICKED, true);
    }

    @Test
    void testMousePressed() {
        this.testMouseEvent(MouseEvent.MOUSE_PRESSED, true);
    }

    @Test
    void testMouseReleased() {
        this.testMouseEvent(MouseEvent.MOUSE_RELEASED, true);
    }

    @Test
    void testMouseEntered() {
        this.testMouseEvent(MouseEvent.MOUSE_ENTERED, true);
    }

    private void testMouseEvent(int event, boolean onSplit) {
        JSplitButton instance = new JSplitButton();
        setOnSplit(instance, true);
        MouseEvent e = new MouseEvent(instance, 0, 0, event, 0, 0, 0, false);
        switch (event) {
            case MouseEvent.MOUSE_CLICKED:
                instance.getListener().mouseClicked(e);
                break;
            case MouseEvent.MOUSE_DRAGGED:
                instance.getListener().mouseDragged(e);
                break;
            case MouseEvent.MOUSE_ENTERED:
                instance.getListener().mouseEntered(e);
                break;
            case MouseEvent.MOUSE_EXITED:
                instance.getListener().mouseExited(e);
                break;
            case MouseEvent.MOUSE_MOVED:
                instance.getListener().mouseMoved(e);
                break;
            case MouseEvent.MOUSE_PRESSED:
                instance.getListener().mousePressed(e);
                break;
            case MouseEvent.MOUSE_RELEASED:
                instance.getListener().mouseReleased(e);
                break;
            default:
                fail("Unexpected event id");
        }
        assertEquals(onSplit, getOnSplit(instance));
    }

    private void fireSplitButtonClicked(JSplitButton instance, ActionEvent event) {
        this.fireEvent(instance.getListener(), event, "fireSplitButtonClicked");
    }

    private void fireButtonClicked(JSplitButton instance, ActionEvent event) {
        this.fireEvent(instance.getListener(), event, "fireButtonClicked");
    }

    private void fireEvent(Listener instance, ActionEvent event, String fire) {
        try {
            Method method = instance.getClass().getDeclaredMethod(fire, new Class<?>[]{ActionEvent.class});
            method.setAccessible(true);
            method.invoke(instance, event);
        }
        catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            fail(ex.getMessage());
        }
    }

    private boolean getOnSplit(JSplitButton instance) {
        try {
            Field field = instance.getClass().getDeclaredField("onSplit");
            field.setAccessible(true);
            return (Boolean) field.get(instance);
        }
        catch (NoSuchFieldException | SecurityException | IllegalAccessException | IllegalArgumentException ex) {
            fail(ex.getMessage());
        }
        fail("Unable to get onSplit value");
        return false;
    }

    private void setOnSplit(JSplitButton instance, boolean onSplit) {
        try {
            Field field = instance.getClass().getDeclaredField("onSplit");
            field.setAccessible(true);
            field.set(instance, onSplit);
        }
        catch (NoSuchFieldException | SecurityException | IllegalAccessException | IllegalArgumentException ex) {
            fail(ex.getMessage());
        }
    }

    private class AbstractSplitButtonClickedActionListener implements SplitButtonClickedActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            splitButtonClickFired += 1;
        }
    }

    private class AbstractButtonClickedActionListener implements ButtonClickedActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            buttonClickFired += 1;
        }
    }

    private static class PaintComponentArgumentsProvider implements ArgumentsProvider {

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext ec) {
            return Stream.of(
                    new Object[]{false, null, false, false},
                    new Object[]{false, null, false, true},
                    new Object[]{false, null, true, false},
                    new Object[]{false, null, true, true},
                    new Object[]{false, new JPopupMenu(), false, false},
                    new Object[]{false, new JPopupMenu(), false, true},
                    new Object[]{false, new JPopupMenu(), true, false},
                    new Object[]{false, new JPopupMenu(), true, true},
                    new Object[]{true, null, false, false},
                    new Object[]{true, null, false, true},
                    new Object[]{true, null, true, false},
                    new Object[]{true, null, true, true},
                    new Object[]{true, new JPopupMenu(), false, false},
                    new Object[]{true, new JPopupMenu(), false, true},
                    new Object[]{true, new JPopupMenu(), true, false},
                    new Object[]{true, new JPopupMenu(), true, true}).map(Arguments::of);
        }
        
    }
}
