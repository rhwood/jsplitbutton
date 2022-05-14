/*
 * Copyright (C) 2016, 2018, 2022 Randall Wood
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

import com.alexandriasoftware.jsplitbutton.action.ButtonClickedActionListener;
import com.alexandriasoftware.jsplitbutton.action.SplitButtonClickedActionListener;
import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.ImageCapabilities;
import java.awt.Insets;
import java.awt.MenuComponent;
import java.awt.Point;
import java.awt.PopupMenu;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerListener;
import java.awt.event.FocusListener;
import java.awt.event.HierarchyBoundsListener;
import java.awt.event.HierarchyListener;
import java.awt.event.InputMethodListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IndexedPropertyDescriptor;
import java.beans.IntrospectionException;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeListener;

/**
 * @author Naveed Quadri 2012
 * @author Randall Wood 2016
 */
public class JSplitButtonBeanInfo extends SimpleBeanInfo {

    /**
     * Lazy BeanDescriptor.
     */
    private static BeanDescriptor getBdescriptor() {
        return new BeanDescriptor(JSplitButton.class, null); // NOI18N                              
    }

    // Property array
    /*
     * lazy PropertyDescriptor
     */
    private static PropertyDescriptor[] getPdescriptor() {
        List<PropertyDescriptor> properties = new ArrayList<>();

        try {
            properties.add(new PropertyDescriptor("accessibleContext", JSplitButton.class, "getAccessibleContext", null)); // NOI18N
            properties.add(new PropertyDescriptor("action", JSplitButton.class, "getAction", "setAction")); // NOI18N
            properties.add(new PropertyDescriptor("actionCommand", JSplitButton.class, "getActionCommand", "setActionCommand")); // NOI18N
            properties.add(new PropertyDescriptor("actionListeners", JSplitButton.class, "getActionListeners", null)); // NOI18N
            properties.add(new PropertyDescriptor("actionMap", JSplitButton.class, "getActionMap", "setActionMap")); // NOI18N
            properties.add(new PropertyDescriptor("alignmentX", JSplitButton.class, "getAlignmentX", "setAlignmentX")); // NOI18N
            properties.add(new PropertyDescriptor("alignmentY", JSplitButton.class, "getAlignmentY", "setAlignmentY")); // NOI18N
            properties.add(new PropertyDescriptor("alwaysPopup", JSplitButton.class, "isAlwaysPopup", "setAlwaysPopup")); // NOI18N
            properties.add(new PropertyDescriptor("ancestorListeners", JSplitButton.class, "getAncestorListeners", null)); // NOI18N
            properties.add(new PropertyDescriptor("arrowColor", JSplitButton.class, "getArrowColor", "setArrowColor")); // NOI18N
            properties.add(new PropertyDescriptor("arrowSize", JSplitButton.class, "getArrowSize", "setArrowSize")); // NOI18N
            properties.add(new PropertyDescriptor("autoscrolls", JSplitButton.class, "getAutoscrolls", "setAutoscrolls")); // NOI18N
            properties.add(new PropertyDescriptor("background", JSplitButton.class, "getBackground", "setBackground")); // NOI18N
            properties.add(new PropertyDescriptor("backgroundSet", JSplitButton.class, "isBackgroundSet", null)); // NOI18N
            properties.add(new PropertyDescriptor("baselineResizeBehavior", JSplitButton.class, "getBaselineResizeBehavior", null)); // NOI18N
            properties.add(new PropertyDescriptor("border", JSplitButton.class, "getBorder", "setBorder")); // NOI18N
            properties.add(new PropertyDescriptor("borderPainted", JSplitButton.class, "isBorderPainted", "setBorderPainted")); // NOI18N
            properties.add(new PropertyDescriptor("bounds", JSplitButton.class, "getBounds", "setBounds")); // NOI18N
            properties.add(new PropertyDescriptor("changeListeners", JSplitButton.class, "getChangeListeners", null)); // NOI18N
            properties.add(new PropertyDescriptor("colorModel", JSplitButton.class, "getColorModel", null)); // NOI18N
            properties.add(new IndexedPropertyDescriptor("component", JSplitButton.class, null, null, "getComponent", null)); // NOI18N
            properties.add(new PropertyDescriptor("componentCount", JSplitButton.class, "getComponentCount", null)); // NOI18N
            properties.add(new PropertyDescriptor("componentListeners", JSplitButton.class, "getComponentListeners", null)); // NOI18N
            properties.add(new PropertyDescriptor("componentOrientation", JSplitButton.class, "getComponentOrientation", "setComponentOrientation")); // NOI18N
            properties.add(new PropertyDescriptor("componentPopupMenu", JSplitButton.class, "getComponentPopupMenu", "setComponentPopupMenu")); // NOI18N
            properties.add(new PropertyDescriptor("components", JSplitButton.class, "getComponents", null)); // NOI18N
            properties.add(new PropertyDescriptor("containerListeners", JSplitButton.class, "getContainerListeners", null)); // NOI18N
            properties.add(new PropertyDescriptor("contentAreaFilled", JSplitButton.class, "isContentAreaFilled", "setContentAreaFilled")); // NOI18N
            properties.add(new PropertyDescriptor("cursor", JSplitButton.class, "getCursor", "setCursor")); // NOI18N
            properties.add(new PropertyDescriptor("cursorSet", JSplitButton.class, "isCursorSet", null)); // NOI18N
            properties.add(new PropertyDescriptor("debugGraphicsOptions", JSplitButton.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions")); // NOI18N
            properties.add(new PropertyDescriptor("defaultButton", JSplitButton.class, "isDefaultButton", null)); // NOI18N
            properties.add(new PropertyDescriptor("defaultCapable", JSplitButton.class, "isDefaultCapable", "setDefaultCapable")); // NOI18N
            properties.add(new PropertyDescriptor("disabledArrowColor", JSplitButton.class, "getDisabledArrowColor", "setDisabledArrowColor")); // NOI18N
            properties.add(new PropertyDescriptor("disabledIcon", JSplitButton.class, "getDisabledIcon", "setDisabledIcon")); // NOI18N
            properties.add(new PropertyDescriptor("disabledImage", JSplitButton.class, "getDisabledImage", "setDisabledImage")); // NOI18N
            properties.add(new PropertyDescriptor("disabledSelectedIcon", JSplitButton.class, "getDisabledSelectedIcon", "setDisabledSelectedIcon")); // NOI18N
            properties.add(new PropertyDescriptor("displayable", JSplitButton.class, "isDisplayable", null)); // NOI18N
            properties.add(new PropertyDescriptor("displayedMnemonicIndex", JSplitButton.class, "getDisplayedMnemonicIndex", "setDisplayedMnemonicIndex")); // NOI18N
            properties.add(new PropertyDescriptor("doubleBuffered", JSplitButton.class, "isDoubleBuffered", "setDoubleBuffered")); // NOI18N
            properties.add(new PropertyDescriptor("dropTarget", JSplitButton.class, "getDropTarget", "setDropTarget")); // NOI18N
            properties.add(new PropertyDescriptor("enabled", JSplitButton.class, "isEnabled", "setEnabled")); // NOI18N
            properties.add(new PropertyDescriptor("focusable", JSplitButton.class, "isFocusable", "setFocusable")); // NOI18N
            properties.add(new PropertyDescriptor("focusCycleRoot", JSplitButton.class, "isFocusCycleRoot", "setFocusCycleRoot")); // NOI18N
            properties.add(new PropertyDescriptor("focusCycleRootAncestor", JSplitButton.class, "getFocusCycleRootAncestor", null)); // NOI18N
            properties.add(new PropertyDescriptor("focusListeners", JSplitButton.class, "getFocusListeners", null)); // NOI18N
            properties.add(new PropertyDescriptor("focusOwner", JSplitButton.class, "isFocusOwner", null)); // NOI18N
            properties.add(new PropertyDescriptor("focusPainted", JSplitButton.class, "isFocusPainted", "setFocusPainted")); // NOI18N
            properties.add(new PropertyDescriptor("focusTraversable", JSplitButton.class, "isFocusTraversable", null)); // NOI18N
            properties.add(new IndexedPropertyDescriptor("focusTraversalKeys", JSplitButton.class, null, null, null, "setFocusTraversalKeys")); // NOI18N
            properties.add(new PropertyDescriptor("focusTraversalKeysEnabled", JSplitButton.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled")); // NOI18N
            properties.add(new PropertyDescriptor("focusTraversalPolicy", JSplitButton.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy")); // NOI18N
            properties.add(new PropertyDescriptor("focusTraversalPolicyProvider", JSplitButton.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider")); // NOI18N
            properties.add(new PropertyDescriptor("focusTraversalPolicySet", JSplitButton.class, "isFocusTraversalPolicySet", null)); // NOI18N
            properties.add(new PropertyDescriptor("font", JSplitButton.class, "getFont", "setFont")); // NOI18N
            properties.add(new PropertyDescriptor("fontSet", JSplitButton.class, "isFontSet", null)); // NOI18N
            properties.add(new PropertyDescriptor("foreground", JSplitButton.class, "getForeground", "setForeground")); // NOI18N
            properties.add(new PropertyDescriptor("foregroundSet", JSplitButton.class, "isForegroundSet", null)); // NOI18N
            properties.add(new PropertyDescriptor("graphics", JSplitButton.class, "getGraphics", null)); // NOI18N
            properties.add(new PropertyDescriptor("graphicsConfiguration", JSplitButton.class, "getGraphicsConfiguration", null)); // NOI18N
            properties.add(new PropertyDescriptor("height", JSplitButton.class, "getHeight", null)); // NOI18N
            properties.add(new PropertyDescriptor("hideActionText", JSplitButton.class, "getHideActionText", "setHideActionText")); // NOI18N
            properties.add(new PropertyDescriptor("hierarchyBoundsListeners", JSplitButton.class, "getHierarchyBoundsListeners", null)); // NOI18N
            properties.add(new PropertyDescriptor("hierarchyListeners", JSplitButton.class, "getHierarchyListeners", null)); // NOI18N
            properties.add(new PropertyDescriptor("horizontalAlignment", JSplitButton.class, "getHorizontalAlignment", "setHorizontalAlignment")); // NOI18N
            properties.add(new PropertyDescriptor("horizontalTextPosition", JSplitButton.class, "getHorizontalTextPosition", "setHorizontalTextPosition")); // NOI18N
            properties.add(new PropertyDescriptor("icon", JSplitButton.class, "getIcon", "setIcon")); // NOI18N
            properties.add(new PropertyDescriptor("iconTextGap", JSplitButton.class, "getIconTextGap", "setIconTextGap")); // NOI18N
            properties.add(new PropertyDescriptor("ignoreRepaint", JSplitButton.class, "getIgnoreRepaint", "setIgnoreRepaint")); // NOI18N
            properties.add(new PropertyDescriptor("image", JSplitButton.class, "getImage", "setImage")); // NOI18N
            properties.add(new PropertyDescriptor("inheritsPopupMenu", JSplitButton.class, "getInheritsPopupMenu", "setInheritsPopupMenu")); // NOI18N
            properties.add(new PropertyDescriptor("inputContext", JSplitButton.class, "getInputContext", null)); // NOI18N
            properties.add(new PropertyDescriptor("inputMap", JSplitButton.class, "getInputMap", null)); // NOI18N
            properties.add(new PropertyDescriptor("inputMethodListeners", JSplitButton.class, "getInputMethodListeners", null)); // NOI18N
            properties.add(new PropertyDescriptor("inputMethodRequests", JSplitButton.class, "getInputMethodRequests", null)); // NOI18N
            properties.add(new PropertyDescriptor("inputVerifier", JSplitButton.class, "getInputVerifier", "setInputVerifier")); // NOI18N
            properties.add(new PropertyDescriptor("insets", JSplitButton.class, "getInsets", null)); // NOI18N
            properties.add(new PropertyDescriptor("itemListeners", JSplitButton.class, "getItemListeners", null)); // NOI18N
            properties.add(new PropertyDescriptor("keyListeners", JSplitButton.class, "getKeyListeners", null)); // NOI18N
            properties.add(new PropertyDescriptor("label", JSplitButton.class, "getLabel", "setLabel")); // NOI18N
            properties.add(new PropertyDescriptor("layout", JSplitButton.class, "getLayout", "setLayout")); // NOI18N
            properties.add(new PropertyDescriptor("lightweight", JSplitButton.class, "isLightweight", null)); // NOI18N
            properties.add(new PropertyDescriptor("locale", JSplitButton.class, "getLocale", "setLocale")); // NOI18N
            properties.add(new PropertyDescriptor("location", JSplitButton.class, "getLocation", "setLocation")); // NOI18N
            properties.add(new PropertyDescriptor("locationOnScreen", JSplitButton.class, "getLocationOnScreen", null)); // NOI18N
            properties.add(new PropertyDescriptor("managingFocus", JSplitButton.class, "isManagingFocus", null)); // NOI18N
            properties.add(new PropertyDescriptor("margin", JSplitButton.class, "getMargin", "setMargin")); // NOI18N
            properties.add(new PropertyDescriptor("maximumSize", JSplitButton.class, "getMaximumSize", "setMaximumSize")); // NOI18N
            properties.add(new PropertyDescriptor("maximumSizeSet", JSplitButton.class, "isMaximumSizeSet", null)); // NOI18N
            properties.add(new PropertyDescriptor("minimumSize", JSplitButton.class, "getMinimumSize", "setMinimumSize")); // NOI18N
            properties.add(new PropertyDescriptor("minimumSizeSet", JSplitButton.class, "isMinimumSizeSet", null)); // NOI18N
            properties.add(new PropertyDescriptor("mnemonic", JSplitButton.class, null, "setMnemonic")); // NOI18N
            properties.add(new PropertyDescriptor("model", JSplitButton.class, "getModel", "setModel")); // NOI18N
            properties.add(new PropertyDescriptor("mouseListeners", JSplitButton.class, "getMouseListeners", null)); // NOI18N
            properties.add(new PropertyDescriptor("mouseMotionListeners", JSplitButton.class, "getMouseMotionListeners", null)); // NOI18N
            properties.add(new PropertyDescriptor("mousePosition", JSplitButton.class, "getMousePosition", null)); // NOI18N
            properties.add(new PropertyDescriptor("mouseWheelListeners", JSplitButton.class, "getMouseWheelListeners", null)); // NOI18N
            properties.add(new PropertyDescriptor("multiClickThreshhold", JSplitButton.class, "getMultiClickThreshhold", "setMultiClickThreshhold")); // NOI18N
            properties.add(new PropertyDescriptor("name", JSplitButton.class, "getName", "setName")); // NOI18N
            properties.add(new PropertyDescriptor("nextFocusableComponent", JSplitButton.class, "getNextFocusableComponent", "setNextFocusableComponent")); // NOI18N
            properties.add(new PropertyDescriptor("opaque", JSplitButton.class, "isOpaque", "setOpaque")); // NOI18N
            properties.add(new PropertyDescriptor("optimizedDrawingEnabled", JSplitButton.class, "isOptimizedDrawingEnabled", null)); // NOI18N
            properties.add(new PropertyDescriptor("paintingForPrint", JSplitButton.class, "isPaintingForPrint", null)); // NOI18N
            properties.add(new PropertyDescriptor("paintingTile", JSplitButton.class, "isPaintingTile", null)); // NOI18N
            properties.add(new PropertyDescriptor("parent", JSplitButton.class, "getParent", null)); // NOI18N
            properties.add(new PropertyDescriptor("peer", JSplitButton.class, "getPeer", null)); // NOI18N
            properties.add(new PropertyDescriptor("popupMenu", JSplitButton.class, "getPopupMenu", "setPopupMenu")); // NOI18N
            properties.add(new PropertyDescriptor("preferredSize", JSplitButton.class, "getPreferredSize", "setPreferredSize")); // NOI18N
            properties.add(new PropertyDescriptor("preferredSizeSet", JSplitButton.class, "isPreferredSizeSet", null)); // NOI18N
            properties.add(new PropertyDescriptor("pressedIcon", JSplitButton.class, "getPressedIcon", "setPressedIcon")); // NOI18N
            properties.add(new PropertyDescriptor("propertyChangeListeners", JSplitButton.class, "getPropertyChangeListeners", null)); // NOI18N
            properties.add(new PropertyDescriptor("registeredKeyStrokes", JSplitButton.class, "getRegisteredKeyStrokes", null)); // NOI18N
            properties.add(new PropertyDescriptor("requestFocusEnabled", JSplitButton.class, "isRequestFocusEnabled", "setRequestFocusEnabled")); // NOI18N
            properties.add(new PropertyDescriptor("rolloverEnabled", JSplitButton.class, "isRolloverEnabled", "setRolloverEnabled")); // NOI18N
            properties.add(new PropertyDescriptor("rolloverIcon", JSplitButton.class, "getRolloverIcon", "setRolloverIcon")); // NOI18N
            properties.add(new PropertyDescriptor("rolloverSelectedIcon", JSplitButton.class, "getRolloverSelectedIcon", "setRolloverSelectedIcon")); // NOI18N
            properties.add(new PropertyDescriptor("rootPane", JSplitButton.class, "getRootPane", null)); // NOI18N
            properties.add(new PropertyDescriptor("selected", JSplitButton.class, "isSelected", "setSelected")); // NOI18N
            properties.add(new PropertyDescriptor("selectedIcon", JSplitButton.class, "getSelectedIcon", "setSelectedIcon")); // NOI18N
            properties.add(new PropertyDescriptor("selectedObjects", JSplitButton.class, "getSelectedObjects", null)); // NOI18N
            properties.add(new PropertyDescriptor("separatorSpacing", JSplitButton.class, "getSeparatorSpacing", "setSeparatorSpacing")); // NOI18N
            properties.add(new PropertyDescriptor("showing", JSplitButton.class, "isShowing", null)); // NOI18N
            properties.add(new PropertyDescriptor("size", JSplitButton.class, "getSize", "setSize")); // NOI18N
            properties.add(new PropertyDescriptor("splitWidth", JSplitButton.class, "getSplitWidth", "setSplitWidth")); // NOI18N
            properties.add(new PropertyDescriptor("text", JSplitButton.class, "getText", "setText")); // NOI18N
            properties.add(new PropertyDescriptor("toolkit", JSplitButton.class, "getToolkit", null)); // NOI18N
            properties.add(new PropertyDescriptor("toolTipText", JSplitButton.class, "getToolTipText", "setToolTipText")); // NOI18N
            properties.add(new PropertyDescriptor("topLevelAncestor", JSplitButton.class, "getTopLevelAncestor", null)); // NOI18N
            properties.add(new PropertyDescriptor("transferHandler", JSplitButton.class, "getTransferHandler", "setTransferHandler")); // NOI18N
            properties.add(new PropertyDescriptor("treeLock", JSplitButton.class, "getTreeLock", null)); // NOI18N
            properties.add(new PropertyDescriptor("UI", JSplitButton.class, "getUI", "setUI")); // NOI18N
            properties.add(new PropertyDescriptor("UIClassID", JSplitButton.class, "getUIClassID", null)); // NOI18N
            properties.add(new PropertyDescriptor("valid", JSplitButton.class, "isValid", null)); // NOI18N
            properties.add(new PropertyDescriptor("validateRoot", JSplitButton.class, "isValidateRoot", null)); // NOI18N
            properties.add(new PropertyDescriptor("verifyInputWhenFocusTarget", JSplitButton.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget")); // NOI18N
            properties.add(new PropertyDescriptor("verticalAlignment", JSplitButton.class, "getVerticalAlignment", "setVerticalAlignment")); // NOI18N
            properties.add(new PropertyDescriptor("verticalTextPosition", JSplitButton.class, "getVerticalTextPosition", "setVerticalTextPosition")); // NOI18N
            properties.add(new PropertyDescriptor("vetoableChangeListeners", JSplitButton.class, "getVetoableChangeListeners", null)); // NOI18N
            properties.add(new PropertyDescriptor("visible", JSplitButton.class, "isVisible", "setVisible")); // NOI18N
            properties.add(new PropertyDescriptor("visibleRect", JSplitButton.class, "getVisibleRect", null)); // NOI18N
            properties.add(new PropertyDescriptor("width", JSplitButton.class, "getWidth", null)); // NOI18N
            properties.add(new PropertyDescriptor("x", JSplitButton.class, "getX", null)); // NOI18N
            properties.add(new PropertyDescriptor("y", JSplitButton.class, "getY", null)); // NOI18N
        } catch (IntrospectionException e) {
            // silently ignore
        }

        // Here you can add code for customizing the properties array.
        return properties.toArray(new PropertyDescriptor[0]);
    }

    // EventSet array
    /*
     * lazy EventSetDescriptor
     */
    private static EventSetDescriptor[] getEdescriptor() {
        List<EventSetDescriptor> eventSets = new ArrayList<>();

        try {
            eventSets.add(new EventSetDescriptor(JSplitButton.class, "actionListener", ActionListener.class, new String[]{"actionPerformed"}, "addActionListener", "removeActionListener")); // NOI18N
            eventSets.add(new EventSetDescriptor(JSplitButton.class, "ancestorListener", AncestorListener.class, new String[]{"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener")); // NOI18N
            eventSets.add(new EventSetDescriptor(JSplitButton.class, "buttonClickedActionListener", ButtonClickedActionListener.class, new String[]{}, "addButtonClickedActionListener", "removeButtonClickedActionListener")); // NOI18N
            eventSets.add(new EventSetDescriptor(JSplitButton.class, "changeListener", ChangeListener.class, new String[]{"stateChanged"}, "addChangeListener", "removeChangeListener")); // NOI18N
            eventSets.add(new EventSetDescriptor(JSplitButton.class, "componentListener", ComponentListener.class, new String[]{"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener")); // NOI18N
            eventSets.add(new EventSetDescriptor(JSplitButton.class, "containerListener", ContainerListener.class, new String[]{"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener")); // NOI18N
            eventSets.add(new EventSetDescriptor(JSplitButton.class, "focusListener", FocusListener.class, new String[]{"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener")); // NOI18N
            eventSets.add(new EventSetDescriptor(JSplitButton.class, "hierarchyBoundsListener", HierarchyBoundsListener.class, new String[]{"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener")); // NOI18N
            eventSets.add(new EventSetDescriptor(JSplitButton.class, "hierarchyListener", HierarchyListener.class, new String[]{"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener")); // NOI18N
            eventSets.add(new EventSetDescriptor(JSplitButton.class, "inputMethodListener", InputMethodListener.class, new String[]{"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener")); // NOI18N
            eventSets.add(new EventSetDescriptor(JSplitButton.class, "itemListener", ItemListener.class, new String[]{"itemStateChanged"}, "addItemListener", "removeItemListener")); // NOI18N
            eventSets.add(new EventSetDescriptor(JSplitButton.class, "keyListener", KeyListener.class, new String[]{"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener")); // NOI18N
            eventSets.add(new EventSetDescriptor(JSplitButton.class, "mouseListener", MouseListener.class, new String[]{"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener")); // NOI18N
            eventSets.add(new EventSetDescriptor(JSplitButton.class, "mouseMotionListener", MouseMotionListener.class, new String[]{"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener")); // NOI18N
            eventSets.add(new EventSetDescriptor(JSplitButton.class, "mouseWheelListener", MouseWheelListener.class, new String[]{"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener")); // NOI18N
            eventSets.add(new EventSetDescriptor(JSplitButton.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[]{"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener")); // NOI18N
            eventSets.add(new EventSetDescriptor(JSplitButton.class, "splitButtonClickedActionListener", SplitButtonClickedActionListener.class, new String[]{}, "addSplitButtonClickedActionListener", "removeSplitButtonClickedActionListener")); // NOI18N
            eventSets.add(new EventSetDescriptor(JSplitButton.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[]{"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener")); // NOI18N
        } catch (IntrospectionException e) {
            // silently ignore
        }

        // Here you can add code for customizing the event sets array.
        return eventSets.toArray(new EventSetDescriptor[0]);
    }

    // Method array
    /*
     * lazy MethodDescriptor
     */
    private static MethodDescriptor[] getMdescriptor() {
        List<MethodDescriptor> methods = new ArrayList<>();
        final String firePropertyChange = "firePropertyChange";
        final String remove = "remove";
        final String repaint = "repaint";
        try {
            methods.add(new MethodDescriptor(Component.class.getMethod("add", PopupMenu.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("add", Component.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("add", java.lang.String.class, Component.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("add", Component.class, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("add", Component.class, java.lang.Object.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("add", Component.class, java.lang.Object.class, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("addNotify"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("addPropertyChangeListener", java.lang.String.class, java.beans.PropertyChangeListener.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("applyComponentOrientation", ComponentOrientation.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("areFocusTraversalKeysSet", int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("bounds"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("checkImage", Image.class, ImageObserver.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("checkImage", Image.class, int.class, int.class, ImageObserver.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("computeVisibleRect", Rectangle.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("contains", Point.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("contains", int.class, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("countComponents"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("createImage", ImageProducer.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("createImage", int.class, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("createToolTip"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("createVolatileImage", int.class, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("createVolatileImage", int.class, int.class, ImageCapabilities.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("disable"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("dispatchEvent", AWTEvent.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(AbstractButton.class.getMethod("doClick"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(AbstractButton.class.getMethod("doClick", int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("doLayout"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("enable", boolean.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("enable"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("enableInputMethods", boolean.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("findComponentAt", int.class, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("findComponentAt", Point.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod(firePropertyChange, java.lang.String.class, byte.class, byte.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod(firePropertyChange, java.lang.String.class, short.class, short.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod(firePropertyChange, java.lang.String.class, long.class, long.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod(firePropertyChange, java.lang.String.class, float.class, float.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod(firePropertyChange, java.lang.String.class, double.class, double.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod(firePropertyChange, java.lang.String.class, boolean.class, boolean.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod(firePropertyChange, java.lang.String.class, int.class, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod(firePropertyChange, java.lang.String.class, char.class, char.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("getActionForKeyStroke", KeyStroke.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("getBaseline", int.class, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("getBounds", Rectangle.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("getClientProperty", java.lang.Object.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("getComponentAt", int.class, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("getComponentAt", Point.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("getComponentZOrder", Component.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("getConditionForKeyStroke", KeyStroke.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("getDefaultLocale"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("getFocusTraversalKeys", int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("getFontMetrics", Font.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("getInsets", Insets.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("getListeners", java.lang.Class.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("getLocation", Point.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(AbstractButton.class.getMethod("getMnemonic"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("getMousePosition", boolean.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("getPopupLocation", MouseEvent.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("getPropertyChangeListeners", java.lang.String.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("getSize", Dimension.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("getToolTipLocation", MouseEvent.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("getToolTipText", MouseEvent.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("grabFocus"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("hasFocus"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("hide"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(AbstractButton.class.getMethod("imageUpdate", Image.class, int.class, int.class, int.class, int.class, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("insets"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("inside", int.class, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("invalidate"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("isAncestorOf", Component.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("isFocusCycleRoot", Container.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("isLightweightComponent", Component.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("layout"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("list"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("list", java.io.PrintStream.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("list", java.io.PrintWriter.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("list", java.io.PrintStream.class, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("list", java.io.PrintWriter.class, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("locate", int.class, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("location"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("minimumSize"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("move", int.class, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("nextFocus"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("paint", Graphics.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("paintAll", Graphics.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("paintComponents", Graphics.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("paintImmediately", int.class, int.class, int.class, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("paintImmediately", Rectangle.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("preferredSize"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("prepareImage", Image.class, ImageObserver.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("prepareImage", Image.class, int.class, int.class, ImageObserver.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("print", Graphics.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("printAll", Graphics.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("printComponents", Graphics.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("putClientProperty", java.lang.Object.class, java.lang.Object.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("registerKeyboardAction", ActionListener.class, java.lang.String.class, KeyStroke.class, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("registerKeyboardAction", ActionListener.class, KeyStroke.class, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod(remove, MenuComponent.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod(remove, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod(remove, Component.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("removeAll"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JButton.class.getMethod("removeNotify"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("removePropertyChangeListener", java.lang.String.class, java.beans.PropertyChangeListener.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod(repaint))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod(repaint, long.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod(repaint, int.class, int.class, int.class, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod(repaint, long.class, int.class, int.class, int.class, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod(repaint, Rectangle.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("requestDefaultFocus"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("requestFocus"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("requestFocus", boolean.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("requestFocusInWindow"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("resetKeyboardActions"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("reshape", int.class, int.class, int.class, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("resize", int.class, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("resize", Dimension.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("revalidate"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("scrollRectToVisible", Rectangle.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("setBounds", int.class, int.class, int.class, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("setComponentZOrder", Component.class, int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("setDefaultLocale", java.util.Locale.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(AbstractButton.class.getMethod("setMnemonic", int.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("show"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("show", boolean.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("size"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("toString"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("transferFocus"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("transferFocusBackward"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("transferFocusDownCycle"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Component.class.getMethod("transferFocusUpCycle"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("unregisterKeyboardAction", KeyStroke.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JComponent.class.getMethod("update", Graphics.class))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(JButton.class.getMethod("updateUI"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
            methods.add(new MethodDescriptor(Container.class.getMethod("validate"))); // NOI18N
            methods.get(methods.size() - 1).setDisplayName("");
        }
        catch (NoSuchMethodException | SecurityException e) {
            // silently ignore
        }

        // Here you can add code for customizing the methods array.
        return methods.toArray(new MethodDescriptor[0]);
    }

    private static final String ICON_NAME_COLOR_16 = "resources/splitbutton_16.png";
    private static final String ICON_NAME_COLOR_32 = "resources/splitbutton_32.png";

    private static final int DEFAULT_PROPERTY_INDEX = -1;
    private static final int DEFAULT_EVENT_INDEX = -1;

    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable properties of this bean.
     *         May return null if the information should be obtained by
     *         automatic analysis.
     */
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }

    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable
     *         properties supported by this bean. May return null if the
     *         information should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will belong
     * to the IndexedPropertyDescriptor subclass of PropertyDescriptor. A client
     * of getPropertyDescriptors can use "instanceof" to check if a given
     * PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }

    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     *
     * @return An array of EventSetDescriptors describing the kinds of events
     *         fired by this bean. May return null if the information should be
     *         obtained by automatic analysis.
     */
    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }

    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     *
     * @return An array of MethodDescriptors describing the methods implemented
     *         by this bean. May return null if the information should be
     *         obtained by automatic analysis.
     */
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     *
     * @return Index of default property in the PropertyDescriptor array
     *         returned by getPropertyDescriptors.
     * <P>
     * Returns -1 if there is no default property.
     */
    @Override
    public int getDefaultPropertyIndex() {
        return DEFAULT_PROPERTY_INDEX;
    }

    /**
     * A bean may have a "default" event that is the event that will mostly
     * commonly be used by human's when using the bean.
     *
     * @return Index of default event in the EventSetDescriptor array returned
     *         by getEventSetDescriptors.
     * <P>
     * Returns -1 if there is no default event.
     */
    @Override
    public int getDefaultEventIndex() {
        return DEFAULT_EVENT_INDEX;
    }

    /**
     * This method returns an image object that can be used to represent the
     * bean in toolboxes, toolbars, etc. Icon images will typically be GIFs, but
     * may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from this
     * method.
     * <p>
     * There are four possible flavors of icons (16x16 color, 32x32 color, 16x16
     * mono, 32x32 mono). If a bean choses to only support a single icon we
     * recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background so they can be
     * rendered onto an existing background.
     *
     * @param iconKind The kind of icon requested. This should be one of the
     *                 constant values ICON_COLOR_16x16, ICON_COLOR_32x32,
     *                 ICON_MONO_16x16, or ICON_MONO_32x32.
     * @return An image object representing the requested icon. May return null
     *         if no suitable icon is available.
     */
    @Override
    public Image getIcon(int iconKind) {
        switch (iconKind) {
            case ICON_COLOR_16x16:
            case ICON_MONO_16x16:
                return Toolkit.getDefaultToolkit().createImage(JSplitButtonBeanInfo.class.getResource(ICON_NAME_COLOR_16));
            case ICON_COLOR_32x32:
            case ICON_MONO_32x32:
                return Toolkit.getDefaultToolkit().createImage(JSplitButtonBeanInfo.class.getResource(ICON_NAME_COLOR_32));
            default:
                return null;
        }
    }
}
