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
package com.alexandriasoftware.swing;

import com.alexandriasoftware.swing.action.ButtonClickedActionListener;
import com.alexandriasoftware.swing.action.SplitButtonClickedActionListener;
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

    // Property identifiers                      
    private static final int PROPERTY_ACCESSIBLE_CONTEXT = 0;
    private static final int PROPERTY_ACTION = 1;
    private static final int PROPERTY_ACTION_COMMAND = 2;
    private static final int PROPERTY_ACTION_LISTENERS = 3;
    private static final int PROPERTY_ACTION_MAP = 4;
    private static final int PROPERTY_ALIGNMENT_X = 5;
    private static final int PROPERTY_ALIGNMENT_Y = 6;
    private static final int PROPERTY_ALWAYS_POPUP = 7;
    private static final int PROPERTY_ANCESTOR_LISTENERS = 8;
    private static final int PROPERTY_ARROW_COLOR = 9;
    private static final int PROPERTY_ARROW_SIZE = 10;
    private static final int PROPERTY_AUTOSCROLLS = 11;
    private static final int PROPERTY_BACKGROUND = 12;
    private static final int PROPERTY_BACKGROUND_SET = 13;
    private static final int PROPERTY_BASELINE_RESIZE_BEHAVIOR = 14;
    private static final int PROPERTY_BORDER = 15;
    private static final int PROPERTY_BORDER_PAINTED = 16;
    private static final int PROPERTY_BOUNDS = 17;
    private static final int PROPERTY_CHANGE_LISTENERS = 18;
    private static final int PROPERTY_COLOR_MODEL = 19;
    private static final int PROPERTY_COMPONENT = 20;
    private static final int PROPERTY_COMPONENT_COUNT = 21;
    private static final int PROPERTY_COMPONENT_LISTENERS = 22;
    private static final int PROPERTY_COMPONENT_ORIENTATION = 23;
    private static final int PROPERTY_COMPONENT_POPUP_MENU = 24;
    private static final int PROPERTY_COMPONENTS = 25;
    private static final int PROPERTY_CONTAINER_LISTENERS = 26;
    private static final int PROPERTY_CONTENT_AREA_FILLED = 27;
    private static final int PROPERTY_CURSOR = 28;
    private static final int PROPERTY_CURSOR_SET = 29;
    private static final int PROPERTY_DEBUG_GRAPHICS_OPTIONS = 30;
    private static final int PROPERTY_DEFAULT_BUTTON = 31;
    private static final int PROPERTY_DEFAULT_CAPABLE = 32;
    private static final int PROPERTY_DISABLED_ARROW_COLOR = 33;
    private static final int PROPERTY_DISABLED_ICON = 34;
    private static final int PROPERTY_DISABLED_IMAGE = 35;
    private static final int PROPERTY_DISABLED_SELECTED_ICON = 36;
    private static final int PROPERTY_DISPLAYABLE = 37;
    private static final int PROPERTY_DISPLAYED_MNEMONIC_INDEX = 38;
    private static final int PROPERTY_DOUBLE_BUFFERED = 39;
    private static final int PROPERTY_DROP_TARGET = 40;
    private static final int PROPERTY_ENABLED = 41;
    private static final int PROPERTY_FOCUSABLE = 42;
    private static final int PROPERTY_FOCUS_CYCLE_ROOT = 43;
    private static final int PROPERTY_FOCUS_CYCLE_ROOT_ANCESTOR = 44;
    private static final int PROPERTY_FOCUS_LISTENERS = 45;
    private static final int PROPERTY_FOCUS_OWNER = 46;
    private static final int PROPERTY_FOCUS_PAINTED = 47;
    private static final int PROPERTY_FOCUS_TRAVERSABLE = 48;
    private static final int PROPERTY_FOCUS_TRAVERSAL_KEYS = 49;
    private static final int PROPERTY_FOCUS_TRAVERSAL_KEYS_ENABLED = 50;
    private static final int PROPERTY_FOCUS_TRAVERSAL_POLICY = 51;
    private static final int PROPERTY_FOCUS_TRAVERSAL_POLICY_PROVIDER = 52;
    private static final int PROPERTY_FOCUS_TRAVERSAL_POLICY_SET = 53;
    private static final int PROPERTY_FONT = 54;
    private static final int PROPERTY_FONT_SET = 55;
    private static final int PROPERTY_FOREGROUND = 56;
    private static final int PROPERTY_FOREGROUND_SET = 57;
    private static final int PROPERTY_GRAPHICS = 58;
    private static final int PROPERTY_GRAPHICS_CONFIGURATION = 59;
    private static final int PROPERTY_HEIGHT = 60;
    private static final int PROPERTY_HIDE_ACTION_TEXT = 61;
    private static final int PROPERTY_HIERARCHY_BOUNDS_LISTENERS = 62;
    private static final int PROPERTY_HIERARCHY_LISTENERS = 63;
    private static final int PROPERTY_HORIZONTAL_ALIGNMENT = 64;
    private static final int PROPERTY_HORIZONTAL_TEXT_POSITION = 65;
    private static final int PROPERTY_ICON = 66;
    private static final int PROPERTY_ICON_TEXT_GAP = 67;
    private static final int PROPERTY_IGNORE_REPAINT = 68;
    private static final int PROPERTY_IMAGE = 69;
    private static final int PROPERTY_INHERITS_POPUP_MENU = 70;
    private static final int PROPERTY_INPUT_CONTEXT = 71;
    private static final int PROPERTY_INPUT_MAP = 72;
    private static final int PROPERTY_INPUT_METHOD_LISTENERS = 73;
    private static final int PROPERTY_INPUT_METHOD_REQUESTS = 74;
    private static final int PROPERTY_INPUT_VERIFIER = 75;
    private static final int PROPERTY_INSETS = 76;
    private static final int PROPERTY_ITEM_LISTENERS = 77;
    private static final int PROPERTY_KEY_LISTENERS = 78;
    private static final int PROPERTY_LABEL = 79;
    private static final int PROPERTY_LAYOUT = 80;
    private static final int PROPERTY_LIGHTWEIGHT = 81;
    private static final int PROPERTY_LOCALE = 82;
    private static final int PROPERTY_LOCATION = 83;
    private static final int PROPERTY_LOCATION_ON_SCREEN = 84;
    private static final int PROPERTY_MANAGING_FOCUS = 85;
    private static final int PROPERTY_MARGIN = 86;
    private static final int PROPERTY_MAXIMUM_SIZE = 87;
    private static final int PROPERTY_MAXIMUM_SIZE_SET = 88;
    private static final int PROPERTY_MINIMUM_SIZE = 89;
    private static final int PROPERTY_MINIMUM_SIZE_SET = 90;
    private static final int PROPERTY_MNEMONIC = 91;
    private static final int PROPERTY_MODEL = 92;
    private static final int PROPERTY_MOUSE_LISTENERS = 93;
    private static final int PROPERTY_MOUSE_MOTION_LISTENERS = 94;
    private static final int PROPERTY_MOUSE_POSITION = 95;
    private static final int PROPERTY_MOUSE_WHEEL_LISTENERS = 96;
    private static final int PROPERTY_MULTI_CLICK_THRESHHOLD = 97;
    private static final int PROPERTY_NAME = 98;
    private static final int PROPERTY_NEXT_FOCUSABLE_COMPONENT = 99;
    private static final int PROPERTY_OPAQUE = 100;
    private static final int PROPERTY_OPTIMIZED_DRAWING_ENABLED = 101;
    private static final int PROPERTY_PAINTING_FOR_PRINT = 102;
    private static final int PROPERTY_PAINTING_TILE = 103;
    private static final int PROPERTY_PARENT = 104;
    private static final int PROPERTY_PEER = 105;
    private static final int PROPERTY_POPUP_MENU = 106;
    private static final int PROPERTY_PREFERRED_SIZE = 107;
    private static final int PROPERTY_PREFERRED_SIZE_SET = 108;
    private static final int PROPERTY_PRESSED_ICON = 109;
    private static final int PROPERTY_PROPERTY_CHANGE_LISTENERS = 110;
    private static final int PROPERTY_REGISTERED_KEY_STROKES = 111;
    private static final int PROPERTY_REQUEST_FOCUS_ENABLED = 112;
    private static final int PROPERTY_ROLLOVER_ENABLED = 113;
    private static final int PROPERTY_ROLLOVER_ICON = 114;
    private static final int PROPERTY_ROLLOVER_SELECTED_ICON = 115;
    private static final int PROPERTY_ROOT_PANE = 116;
    private static final int PROPERTY_SELECTED = 117;
    private static final int PROPERTY_SELECTED_ICON = 118;
    private static final int PROPERTY_SELECTED_OBJECTS = 119;
    private static final int PROPERTY_SEPARATOR_SPACING = 120;
    private static final int PROPERTY_SHOWING = 121;
    private static final int PROPERTY_SIZE = 122;
    private static final int PROPERTY_SPLIT_WIDTH = 123;
    private static final int PROPERTY_TEXT = 124;
    private static final int PROPERTY_TOOLKIT = 125;
    private static final int PROPERTY_TOOL_TIP_TEXT = 126;
    private static final int PROPERTY_TOP_LEVEL_ANCESTOR = 127;
    private static final int PROPERTY_TRANSFER_HANDLER = 128;
    private static final int PROPERTY_TREE_LOCK = 129;
    private static final int PROPERTY_UI = 130;
    private static final int PROPERTY_UI_CLASS_ID = 131;
    private static final int PROPERTY_VALID = 132;
    private static final int PROPERTY_VALIDATE_ROOT = 133;
    private static final int PROPERTY_VERIFY_INPUT_WHEN_FOCUS_TARGET = 134;
    private static final int PROPERTY_VERTICAL_ALIGNMENT = 135;
    private static final int PROPERTY_VERTICAL_TEXT_POSITION = 136;
    private static final int PROPERTY_VETOABLE_CHANGE_LISTENERS = 137;
    private static final int PROPERTY_VISIBLE = 138;
    private static final int PROPERTY_VISIBLE_RECT = 139;
    private static final int PROPERTY_WIDTH = 140;
    private static final int PROPERTY_X = 141;
    private static final int PROPERTY_Y = 142;

    // Property array
    /*
     * lazy PropertyDescriptor
     */
    private static PropertyDescriptor[] getPdescriptor() {
        PropertyDescriptor[] properties = new PropertyDescriptor[143];

        try {
            properties[PROPERTY_ACCESSIBLE_CONTEXT] = new PropertyDescriptor("accessibleContext", JSplitButton.class, "getAccessibleContext", null); // NOI18N
            properties[PROPERTY_ACTION] = new PropertyDescriptor("action", JSplitButton.class, "getAction", "setAction"); // NOI18N
            properties[PROPERTY_ACTION_COMMAND] = new PropertyDescriptor("actionCommand", JSplitButton.class, "getActionCommand", "setActionCommand"); // NOI18N
            properties[PROPERTY_ACTION_LISTENERS] = new PropertyDescriptor("actionListeners", JSplitButton.class, "getActionListeners", null); // NOI18N
            properties[PROPERTY_ACTION_MAP] = new PropertyDescriptor("actionMap", JSplitButton.class, "getActionMap", "setActionMap"); // NOI18N
            properties[PROPERTY_ALIGNMENT_X] = new PropertyDescriptor("alignmentX", JSplitButton.class, "getAlignmentX", "setAlignmentX"); // NOI18N
            properties[PROPERTY_ALIGNMENT_Y] = new PropertyDescriptor("alignmentY", JSplitButton.class, "getAlignmentY", "setAlignmentY"); // NOI18N
            properties[PROPERTY_ALWAYS_POPUP] = new PropertyDescriptor("alwaysPopup", JSplitButton.class, "isAlwaysPopup", "setAlwaysPopup"); // NOI18N
            properties[PROPERTY_ANCESTOR_LISTENERS] = new PropertyDescriptor("ancestorListeners", JSplitButton.class, "getAncestorListeners", null); // NOI18N
            properties[PROPERTY_ARROW_COLOR] = new PropertyDescriptor("arrowColor", JSplitButton.class, "getArrowColor", "setArrowColor"); // NOI18N
            properties[PROPERTY_ARROW_SIZE] = new PropertyDescriptor("arrowSize", JSplitButton.class, "getArrowSize", "setArrowSize"); // NOI18N
            properties[PROPERTY_AUTOSCROLLS] = new PropertyDescriptor("autoscrolls", JSplitButton.class, "getAutoscrolls", "setAutoscrolls"); // NOI18N
            properties[PROPERTY_BACKGROUND] = new PropertyDescriptor("background", JSplitButton.class, "getBackground", "setBackground"); // NOI18N
            properties[PROPERTY_BACKGROUND_SET] = new PropertyDescriptor("backgroundSet", JSplitButton.class, "isBackgroundSet", null); // NOI18N
            properties[PROPERTY_BASELINE_RESIZE_BEHAVIOR] = new PropertyDescriptor("baselineResizeBehavior", JSplitButton.class, "getBaselineResizeBehavior", null); // NOI18N
            properties[PROPERTY_BORDER] = new PropertyDescriptor("border", JSplitButton.class, "getBorder", "setBorder"); // NOI18N
            properties[PROPERTY_BORDER_PAINTED] = new PropertyDescriptor("borderPainted", JSplitButton.class, "isBorderPainted", "setBorderPainted"); // NOI18N
            properties[PROPERTY_BOUNDS] = new PropertyDescriptor("bounds", JSplitButton.class, "getBounds", "setBounds"); // NOI18N
            properties[PROPERTY_CHANGE_LISTENERS] = new PropertyDescriptor("changeListeners", JSplitButton.class, "getChangeListeners", null); // NOI18N
            properties[PROPERTY_COLOR_MODEL] = new PropertyDescriptor("colorModel", JSplitButton.class, "getColorModel", null); // NOI18N
            properties[PROPERTY_COMPONENT] = new IndexedPropertyDescriptor("component", JSplitButton.class, null, null, "getComponent", null); // NOI18N
            properties[PROPERTY_COMPONENT_COUNT] = new PropertyDescriptor("componentCount", JSplitButton.class, "getComponentCount", null); // NOI18N
            properties[PROPERTY_COMPONENT_LISTENERS] = new PropertyDescriptor("componentListeners", JSplitButton.class, "getComponentListeners", null); // NOI18N
            properties[PROPERTY_COMPONENT_ORIENTATION] = new PropertyDescriptor("componentOrientation", JSplitButton.class, "getComponentOrientation", "setComponentOrientation"); // NOI18N
            properties[PROPERTY_COMPONENT_POPUP_MENU] = new PropertyDescriptor("componentPopupMenu", JSplitButton.class, "getComponentPopupMenu", "setComponentPopupMenu"); // NOI18N
            properties[PROPERTY_COMPONENTS] = new PropertyDescriptor("components", JSplitButton.class, "getComponents", null); // NOI18N
            properties[PROPERTY_CONTAINER_LISTENERS] = new PropertyDescriptor("containerListeners", JSplitButton.class, "getContainerListeners", null); // NOI18N
            properties[PROPERTY_CONTENT_AREA_FILLED] = new PropertyDescriptor("contentAreaFilled", JSplitButton.class, "isContentAreaFilled", "setContentAreaFilled"); // NOI18N
            properties[PROPERTY_CURSOR] = new PropertyDescriptor("cursor", JSplitButton.class, "getCursor", "setCursor"); // NOI18N
            properties[PROPERTY_CURSOR_SET] = new PropertyDescriptor("cursorSet", JSplitButton.class, "isCursorSet", null); // NOI18N
            properties[PROPERTY_DEBUG_GRAPHICS_OPTIONS] = new PropertyDescriptor("debugGraphicsOptions", JSplitButton.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions"); // NOI18N
            properties[PROPERTY_DEFAULT_BUTTON] = new PropertyDescriptor("defaultButton", JSplitButton.class, "isDefaultButton", null); // NOI18N
            properties[PROPERTY_DEFAULT_CAPABLE] = new PropertyDescriptor("defaultCapable", JSplitButton.class, "isDefaultCapable", "setDefaultCapable"); // NOI18N
            properties[PROPERTY_DISABLED_ARROW_COLOR] = new PropertyDescriptor("disabledArrowColor", JSplitButton.class, "getDisabledArrowColor", "setDisabledArrowColor"); // NOI18N
            properties[PROPERTY_DISABLED_ICON] = new PropertyDescriptor("disabledIcon", JSplitButton.class, "getDisabledIcon", "setDisabledIcon"); // NOI18N
            properties[PROPERTY_DISABLED_IMAGE] = new PropertyDescriptor("disabledImage", JSplitButton.class, "getDisabledImage", "setDisabledImage"); // NOI18N
            properties[PROPERTY_DISABLED_SELECTED_ICON] = new PropertyDescriptor("disabledSelectedIcon", JSplitButton.class, "getDisabledSelectedIcon", "setDisabledSelectedIcon"); // NOI18N
            properties[PROPERTY_DISPLAYABLE] = new PropertyDescriptor("displayable", JSplitButton.class, "isDisplayable", null); // NOI18N
            properties[PROPERTY_DISPLAYED_MNEMONIC_INDEX] = new PropertyDescriptor("displayedMnemonicIndex", JSplitButton.class, "getDisplayedMnemonicIndex", "setDisplayedMnemonicIndex"); // NOI18N
            properties[PROPERTY_DOUBLE_BUFFERED] = new PropertyDescriptor("doubleBuffered", JSplitButton.class, "isDoubleBuffered", "setDoubleBuffered"); // NOI18N
            properties[PROPERTY_DROP_TARGET] = new PropertyDescriptor("dropTarget", JSplitButton.class, "getDropTarget", "setDropTarget"); // NOI18N
            properties[PROPERTY_ENABLED] = new PropertyDescriptor("enabled", JSplitButton.class, "isEnabled", "setEnabled"); // NOI18N
            properties[PROPERTY_FOCUSABLE] = new PropertyDescriptor("focusable", JSplitButton.class, "isFocusable", "setFocusable"); // NOI18N
            properties[PROPERTY_FOCUS_CYCLE_ROOT] = new PropertyDescriptor("focusCycleRoot", JSplitButton.class, "isFocusCycleRoot", "setFocusCycleRoot"); // NOI18N
            properties[PROPERTY_FOCUS_CYCLE_ROOT_ANCESTOR] = new PropertyDescriptor("focusCycleRootAncestor", JSplitButton.class, "getFocusCycleRootAncestor", null); // NOI18N
            properties[PROPERTY_FOCUS_LISTENERS] = new PropertyDescriptor("focusListeners", JSplitButton.class, "getFocusListeners", null); // NOI18N
            properties[PROPERTY_FOCUS_OWNER] = new PropertyDescriptor("focusOwner", JSplitButton.class, "isFocusOwner", null); // NOI18N
            properties[PROPERTY_FOCUS_PAINTED] = new PropertyDescriptor("focusPainted", JSplitButton.class, "isFocusPainted", "setFocusPainted"); // NOI18N
            properties[PROPERTY_FOCUS_TRAVERSABLE] = new PropertyDescriptor("focusTraversable", JSplitButton.class, "isFocusTraversable", null); // NOI18N
            properties[PROPERTY_FOCUS_TRAVERSAL_KEYS] = new IndexedPropertyDescriptor("focusTraversalKeys", JSplitButton.class, null, null, null, "setFocusTraversalKeys"); // NOI18N
            properties[PROPERTY_FOCUS_TRAVERSAL_KEYS_ENABLED] = new PropertyDescriptor("focusTraversalKeysEnabled", JSplitButton.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled"); // NOI18N
            properties[PROPERTY_FOCUS_TRAVERSAL_POLICY] = new PropertyDescriptor("focusTraversalPolicy", JSplitButton.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy"); // NOI18N
            properties[PROPERTY_FOCUS_TRAVERSAL_POLICY_PROVIDER] = new PropertyDescriptor("focusTraversalPolicyProvider", JSplitButton.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider"); // NOI18N
            properties[PROPERTY_FOCUS_TRAVERSAL_POLICY_SET] = new PropertyDescriptor("focusTraversalPolicySet", JSplitButton.class, "isFocusTraversalPolicySet", null); // NOI18N
            properties[PROPERTY_FONT] = new PropertyDescriptor("font", JSplitButton.class, "getFont", "setFont"); // NOI18N
            properties[PROPERTY_FONT_SET] = new PropertyDescriptor("fontSet", JSplitButton.class, "isFontSet", null); // NOI18N
            properties[PROPERTY_FOREGROUND] = new PropertyDescriptor("foreground", JSplitButton.class, "getForeground", "setForeground"); // NOI18N
            properties[PROPERTY_FOREGROUND_SET] = new PropertyDescriptor("foregroundSet", JSplitButton.class, "isForegroundSet", null); // NOI18N
            properties[PROPERTY_GRAPHICS] = new PropertyDescriptor("graphics", JSplitButton.class, "getGraphics", null); // NOI18N
            properties[PROPERTY_GRAPHICS_CONFIGURATION] = new PropertyDescriptor("graphicsConfiguration", JSplitButton.class, "getGraphicsConfiguration", null); // NOI18N
            properties[PROPERTY_HEIGHT] = new PropertyDescriptor("height", JSplitButton.class, "getHeight", null); // NOI18N
            properties[PROPERTY_HIDE_ACTION_TEXT] = new PropertyDescriptor("hideActionText", JSplitButton.class, "getHideActionText", "setHideActionText"); // NOI18N
            properties[PROPERTY_HIERARCHY_BOUNDS_LISTENERS] = new PropertyDescriptor("hierarchyBoundsListeners", JSplitButton.class, "getHierarchyBoundsListeners", null); // NOI18N
            properties[PROPERTY_HIERARCHY_LISTENERS] = new PropertyDescriptor("hierarchyListeners", JSplitButton.class, "getHierarchyListeners", null); // NOI18N
            properties[PROPERTY_HORIZONTAL_ALIGNMENT] = new PropertyDescriptor("horizontalAlignment", JSplitButton.class, "getHorizontalAlignment", "setHorizontalAlignment"); // NOI18N
            properties[PROPERTY_HORIZONTAL_TEXT_POSITION] = new PropertyDescriptor("horizontalTextPosition", JSplitButton.class, "getHorizontalTextPosition", "setHorizontalTextPosition"); // NOI18N
            properties[PROPERTY_ICON] = new PropertyDescriptor("icon", JSplitButton.class, "getIcon", "setIcon"); // NOI18N
            properties[PROPERTY_ICON_TEXT_GAP] = new PropertyDescriptor("iconTextGap", JSplitButton.class, "getIconTextGap", "setIconTextGap"); // NOI18N
            properties[PROPERTY_IGNORE_REPAINT] = new PropertyDescriptor("ignoreRepaint", JSplitButton.class, "getIgnoreRepaint", "setIgnoreRepaint"); // NOI18N
            properties[PROPERTY_IMAGE] = new PropertyDescriptor("image", JSplitButton.class, "getImage", "setImage"); // NOI18N
            properties[PROPERTY_INHERITS_POPUP_MENU] = new PropertyDescriptor("inheritsPopupMenu", JSplitButton.class, "getInheritsPopupMenu", "setInheritsPopupMenu"); // NOI18N
            properties[PROPERTY_INPUT_CONTEXT] = new PropertyDescriptor("inputContext", JSplitButton.class, "getInputContext", null); // NOI18N
            properties[PROPERTY_INPUT_MAP] = new PropertyDescriptor("inputMap", JSplitButton.class, "getInputMap", null); // NOI18N
            properties[PROPERTY_INPUT_METHOD_LISTENERS] = new PropertyDescriptor("inputMethodListeners", JSplitButton.class, "getInputMethodListeners", null); // NOI18N
            properties[PROPERTY_INPUT_METHOD_REQUESTS] = new PropertyDescriptor("inputMethodRequests", JSplitButton.class, "getInputMethodRequests", null); // NOI18N
            properties[PROPERTY_INPUT_VERIFIER] = new PropertyDescriptor("inputVerifier", JSplitButton.class, "getInputVerifier", "setInputVerifier"); // NOI18N
            properties[PROPERTY_INSETS] = new PropertyDescriptor("insets", JSplitButton.class, "getInsets", null); // NOI18N
            properties[PROPERTY_ITEM_LISTENERS] = new PropertyDescriptor("itemListeners", JSplitButton.class, "getItemListeners", null); // NOI18N
            properties[PROPERTY_KEY_LISTENERS] = new PropertyDescriptor("keyListeners", JSplitButton.class, "getKeyListeners", null); // NOI18N
            properties[PROPERTY_LABEL] = new PropertyDescriptor("label", JSplitButton.class, "getLabel", "setLabel"); // NOI18N
            properties[PROPERTY_LAYOUT] = new PropertyDescriptor("layout", JSplitButton.class, "getLayout", "setLayout"); // NOI18N
            properties[PROPERTY_LIGHTWEIGHT] = new PropertyDescriptor("lightweight", JSplitButton.class, "isLightweight", null); // NOI18N
            properties[PROPERTY_LOCALE] = new PropertyDescriptor("locale", JSplitButton.class, "getLocale", "setLocale"); // NOI18N
            properties[PROPERTY_LOCATION] = new PropertyDescriptor("location", JSplitButton.class, "getLocation", "setLocation"); // NOI18N
            properties[PROPERTY_LOCATION_ON_SCREEN] = new PropertyDescriptor("locationOnScreen", JSplitButton.class, "getLocationOnScreen", null); // NOI18N
            properties[PROPERTY_MANAGING_FOCUS] = new PropertyDescriptor("managingFocus", JSplitButton.class, "isManagingFocus", null); // NOI18N
            properties[PROPERTY_MARGIN] = new PropertyDescriptor("margin", JSplitButton.class, "getMargin", "setMargin"); // NOI18N
            properties[PROPERTY_MAXIMUM_SIZE] = new PropertyDescriptor("maximumSize", JSplitButton.class, "getMaximumSize", "setMaximumSize"); // NOI18N
            properties[PROPERTY_MAXIMUM_SIZE_SET] = new PropertyDescriptor("maximumSizeSet", JSplitButton.class, "isMaximumSizeSet", null); // NOI18N
            properties[PROPERTY_MINIMUM_SIZE] = new PropertyDescriptor("minimumSize", JSplitButton.class, "getMinimumSize", "setMinimumSize"); // NOI18N
            properties[PROPERTY_MINIMUM_SIZE_SET] = new PropertyDescriptor("minimumSizeSet", JSplitButton.class, "isMinimumSizeSet", null); // NOI18N
            properties[PROPERTY_MNEMONIC] = new PropertyDescriptor("mnemonic", JSplitButton.class, null, "setMnemonic"); // NOI18N
            properties[PROPERTY_MODEL] = new PropertyDescriptor("model", JSplitButton.class, "getModel", "setModel"); // NOI18N
            properties[PROPERTY_MOUSE_LISTENERS] = new PropertyDescriptor("mouseListeners", JSplitButton.class, "getMouseListeners", null); // NOI18N
            properties[PROPERTY_MOUSE_MOTION_LISTENERS] = new PropertyDescriptor("mouseMotionListeners", JSplitButton.class, "getMouseMotionListeners", null); // NOI18N
            properties[PROPERTY_MOUSE_POSITION] = new PropertyDescriptor("mousePosition", JSplitButton.class, "getMousePosition", null); // NOI18N
            properties[PROPERTY_MOUSE_WHEEL_LISTENERS] = new PropertyDescriptor("mouseWheelListeners", JSplitButton.class, "getMouseWheelListeners", null); // NOI18N
            properties[PROPERTY_MULTI_CLICK_THRESHHOLD] = new PropertyDescriptor("multiClickThreshhold", JSplitButton.class, "getMultiClickThreshhold", "setMultiClickThreshhold"); // NOI18N
            properties[PROPERTY_NAME] = new PropertyDescriptor("name", JSplitButton.class, "getName", "setName"); // NOI18N
            properties[PROPERTY_NEXT_FOCUSABLE_COMPONENT] = new PropertyDescriptor("nextFocusableComponent", JSplitButton.class, "getNextFocusableComponent", "setNextFocusableComponent"); // NOI18N
            properties[PROPERTY_OPAQUE] = new PropertyDescriptor("opaque", JSplitButton.class, "isOpaque", "setOpaque"); // NOI18N
            properties[PROPERTY_OPTIMIZED_DRAWING_ENABLED] = new PropertyDescriptor("optimizedDrawingEnabled", JSplitButton.class, "isOptimizedDrawingEnabled", null); // NOI18N
            properties[PROPERTY_PAINTING_FOR_PRINT] = new PropertyDescriptor("paintingForPrint", JSplitButton.class, "isPaintingForPrint", null); // NOI18N
            properties[PROPERTY_PAINTING_TILE] = new PropertyDescriptor("paintingTile", JSplitButton.class, "isPaintingTile", null); // NOI18N
            properties[PROPERTY_PARENT] = new PropertyDescriptor("parent", JSplitButton.class, "getParent", null); // NOI18N
            properties[PROPERTY_PEER] = new PropertyDescriptor("peer", JSplitButton.class, "getPeer", null); // NOI18N
            properties[PROPERTY_POPUP_MENU] = new PropertyDescriptor("popupMenu", JSplitButton.class, "getPopupMenu", "setPopupMenu"); // NOI18N
            properties[PROPERTY_PREFERRED_SIZE] = new PropertyDescriptor("preferredSize", JSplitButton.class, "getPreferredSize", "setPreferredSize"); // NOI18N
            properties[PROPERTY_PREFERRED_SIZE_SET] = new PropertyDescriptor("preferredSizeSet", JSplitButton.class, "isPreferredSizeSet", null); // NOI18N
            properties[PROPERTY_PRESSED_ICON] = new PropertyDescriptor("pressedIcon", JSplitButton.class, "getPressedIcon", "setPressedIcon"); // NOI18N
            properties[PROPERTY_PROPERTY_CHANGE_LISTENERS] = new PropertyDescriptor("propertyChangeListeners", JSplitButton.class, "getPropertyChangeListeners", null); // NOI18N
            properties[PROPERTY_REGISTERED_KEY_STROKES] = new PropertyDescriptor("registeredKeyStrokes", JSplitButton.class, "getRegisteredKeyStrokes", null); // NOI18N
            properties[PROPERTY_REQUEST_FOCUS_ENABLED] = new PropertyDescriptor("requestFocusEnabled", JSplitButton.class, "isRequestFocusEnabled", "setRequestFocusEnabled"); // NOI18N
            properties[PROPERTY_ROLLOVER_ENABLED] = new PropertyDescriptor("rolloverEnabled", JSplitButton.class, "isRolloverEnabled", "setRolloverEnabled"); // NOI18N
            properties[PROPERTY_ROLLOVER_ICON] = new PropertyDescriptor("rolloverIcon", JSplitButton.class, "getRolloverIcon", "setRolloverIcon"); // NOI18N
            properties[PROPERTY_ROLLOVER_SELECTED_ICON] = new PropertyDescriptor("rolloverSelectedIcon", JSplitButton.class, "getRolloverSelectedIcon", "setRolloverSelectedIcon"); // NOI18N
            properties[PROPERTY_ROOT_PANE] = new PropertyDescriptor("rootPane", JSplitButton.class, "getRootPane", null); // NOI18N
            properties[PROPERTY_SELECTED] = new PropertyDescriptor("selected", JSplitButton.class, "isSelected", "setSelected"); // NOI18N
            properties[PROPERTY_SELECTED_ICON] = new PropertyDescriptor("selectedIcon", JSplitButton.class, "getSelectedIcon", "setSelectedIcon"); // NOI18N
            properties[PROPERTY_SELECTED_OBJECTS] = new PropertyDescriptor("selectedObjects", JSplitButton.class, "getSelectedObjects", null); // NOI18N
            properties[PROPERTY_SEPARATOR_SPACING] = new PropertyDescriptor("separatorSpacing", JSplitButton.class, "getSeparatorSpacing", "setSeparatorSpacing"); // NOI18N
            properties[PROPERTY_SHOWING] = new PropertyDescriptor("showing", JSplitButton.class, "isShowing", null); // NOI18N
            properties[PROPERTY_SIZE] = new PropertyDescriptor("size", JSplitButton.class, "getSize", "setSize"); // NOI18N
            properties[PROPERTY_SPLIT_WIDTH] = new PropertyDescriptor("splitWidth", JSplitButton.class, "getSplitWidth", "setSplitWidth"); // NOI18N
            properties[PROPERTY_TEXT] = new PropertyDescriptor("text", JSplitButton.class, "getText", "setText"); // NOI18N
            properties[PROPERTY_TOOLKIT] = new PropertyDescriptor("toolkit", JSplitButton.class, "getToolkit", null); // NOI18N
            properties[PROPERTY_TOOL_TIP_TEXT] = new PropertyDescriptor("toolTipText", JSplitButton.class, "getToolTipText", "setToolTipText"); // NOI18N
            properties[PROPERTY_TOP_LEVEL_ANCESTOR] = new PropertyDescriptor("topLevelAncestor", JSplitButton.class, "getTopLevelAncestor", null); // NOI18N
            properties[PROPERTY_TRANSFER_HANDLER] = new PropertyDescriptor("transferHandler", JSplitButton.class, "getTransferHandler", "setTransferHandler"); // NOI18N
            properties[PROPERTY_TREE_LOCK] = new PropertyDescriptor("treeLock", JSplitButton.class, "getTreeLock", null); // NOI18N
            properties[PROPERTY_UI] = new PropertyDescriptor("UI", JSplitButton.class, "getUI", "setUI"); // NOI18N
            properties[PROPERTY_UI_CLASS_ID] = new PropertyDescriptor("UIClassID", JSplitButton.class, "getUIClassID", null); // NOI18N
            properties[PROPERTY_VALID] = new PropertyDescriptor("valid", JSplitButton.class, "isValid", null); // NOI18N
            properties[PROPERTY_VALIDATE_ROOT] = new PropertyDescriptor("validateRoot", JSplitButton.class, "isValidateRoot", null); // NOI18N
            properties[PROPERTY_VERIFY_INPUT_WHEN_FOCUS_TARGET] = new PropertyDescriptor("verifyInputWhenFocusTarget", JSplitButton.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget"); // NOI18N
            properties[PROPERTY_VERTICAL_ALIGNMENT] = new PropertyDescriptor("verticalAlignment", JSplitButton.class, "getVerticalAlignment", "setVerticalAlignment"); // NOI18N
            properties[PROPERTY_VERTICAL_TEXT_POSITION] = new PropertyDescriptor("verticalTextPosition", JSplitButton.class, "getVerticalTextPosition", "setVerticalTextPosition"); // NOI18N
            properties[PROPERTY_VETOABLE_CHANGE_LISTENERS] = new PropertyDescriptor("vetoableChangeListeners", JSplitButton.class, "getVetoableChangeListeners", null); // NOI18N
            properties[PROPERTY_VISIBLE] = new PropertyDescriptor("visible", JSplitButton.class, "isVisible", "setVisible"); // NOI18N
            properties[PROPERTY_VISIBLE_RECT] = new PropertyDescriptor("visibleRect", JSplitButton.class, "getVisibleRect", null); // NOI18N
            properties[PROPERTY_WIDTH] = new PropertyDescriptor("width", JSplitButton.class, "getWidth", null); // NOI18N
            properties[PROPERTY_X] = new PropertyDescriptor("x", JSplitButton.class, "getX", null); // NOI18N
            properties[PROPERTY_Y] = new PropertyDescriptor("y", JSplitButton.class, "getY", null); // NOI18N
        } catch (IntrospectionException e) {
        }

        // Here you can add code for customizing the properties array.
        return properties;
    }

    // EventSet identifiers                  
    private static final int EVENT_ACTION_LISTENER = 0;
    private static final int EVENT_ANCESTOR_LISTENER = 1;
    private static final int EVENT_BUTTON_CLICKED_ACTION_LISTENER = 2;
    private static final int EVENT_CHANGE_LISTENER = 3;
    private static final int EVENT_COMPONENT_LISTENER = 4;
    private static final int EVENT_CONTAINER_LISTENER = 5;
    private static final int EVENT_FOCUS_LISTENER = 6;
    private static final int EVENT_HIERARCHY_BOUNDS_LISTENER = 7;
    private static final int EVENT_HIERARCHY_LISTENER = 8;
    private static final int EVENT_INPUT_METHOD_LISTENER = 9;
    private static final int EVENT_ITEM_LISTENER = 10;
    private static final int EVENT_KEY_LISTENER = 11;
    private static final int EVENT_MOUSE_LISTENER = 12;
    private static final int EVENT_MOUSE_MOTION_LISTENER = 13;
    private static final int EVENT_MOUSE_WHEEL_LISTENER = 14;
    private static final int EVENT_PROPERTY_CHANGE_LISTENER = 15;
    private static final int EVENT_SPLIT_BUTTON_CLICKED_ACTION_LISTENER = 17;
    private static final int EVENT_VETOABLE_CHANGE_LISTENER = 18;

    // EventSet array
    /*
     * lazy EventSetDescriptor
     */
    private static EventSetDescriptor[] getEdescriptor() {
        EventSetDescriptor[] eventSets = new EventSetDescriptor[19];

        try {
            eventSets[EVENT_ACTION_LISTENER] = new EventSetDescriptor(JSplitButton.class, "actionListener", ActionListener.class, new String[]{"actionPerformed"}, "addActionListener", "removeActionListener"); // NOI18N
            eventSets[EVENT_ANCESTOR_LISTENER] = new EventSetDescriptor(JSplitButton.class, "ancestorListener", AncestorListener.class, new String[]{"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener"); // NOI18N
            eventSets[EVENT_BUTTON_CLICKED_ACTION_LISTENER] = new EventSetDescriptor(JSplitButton.class, "buttonClickedActionListener", ButtonClickedActionListener.class, new String[]{}, "addButtonClickedActionListener", "removeButtonClickedActionListener"); // NOI18N
            eventSets[EVENT_CHANGE_LISTENER] = new EventSetDescriptor(JSplitButton.class, "changeListener", ChangeListener.class, new String[]{"stateChanged"}, "addChangeListener", "removeChangeListener"); // NOI18N
            eventSets[EVENT_COMPONENT_LISTENER] = new EventSetDescriptor(JSplitButton.class, "componentListener", ComponentListener.class, new String[]{"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener"); // NOI18N
            eventSets[EVENT_CONTAINER_LISTENER] = new EventSetDescriptor(JSplitButton.class, "containerListener", ContainerListener.class, new String[]{"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener"); // NOI18N
            eventSets[EVENT_FOCUS_LISTENER] = new EventSetDescriptor(JSplitButton.class, "focusListener", FocusListener.class, new String[]{"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener"); // NOI18N
            eventSets[EVENT_HIERARCHY_BOUNDS_LISTENER] = new EventSetDescriptor(JSplitButton.class, "hierarchyBoundsListener", HierarchyBoundsListener.class, new String[]{"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener"); // NOI18N
            eventSets[EVENT_HIERARCHY_LISTENER] = new EventSetDescriptor(JSplitButton.class, "hierarchyListener", HierarchyListener.class, new String[]{"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener"); // NOI18N
            eventSets[EVENT_INPUT_METHOD_LISTENER] = new EventSetDescriptor(JSplitButton.class, "inputMethodListener", InputMethodListener.class, new String[]{"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener"); // NOI18N
            eventSets[EVENT_ITEM_LISTENER] = new EventSetDescriptor(JSplitButton.class, "itemListener", ItemListener.class, new String[]{"itemStateChanged"}, "addItemListener", "removeItemListener"); // NOI18N
            eventSets[EVENT_KEY_LISTENER] = new EventSetDescriptor(JSplitButton.class, "keyListener", KeyListener.class, new String[]{"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener"); // NOI18N
            eventSets[EVENT_MOUSE_LISTENER] = new EventSetDescriptor(JSplitButton.class, "mouseListener", MouseListener.class, new String[]{"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener"); // NOI18N
            eventSets[EVENT_MOUSE_MOTION_LISTENER] = new EventSetDescriptor(JSplitButton.class, "mouseMotionListener", MouseMotionListener.class, new String[]{"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener"); // NOI18N
            eventSets[EVENT_MOUSE_WHEEL_LISTENER] = new EventSetDescriptor(JSplitButton.class, "mouseWheelListener", MouseWheelListener.class, new String[]{"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener"); // NOI18N
            eventSets[EVENT_PROPERTY_CHANGE_LISTENER] = new EventSetDescriptor(JSplitButton.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[]{"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener"); // NOI18N
            eventSets[EVENT_SPLIT_BUTTON_CLICKED_ACTION_LISTENER] = new EventSetDescriptor(JSplitButton.class, "splitButtonClickedActionListener", SplitButtonClickedActionListener.class, new String[]{}, "addSplitButtonClickedActionListener", "removeSplitButtonClickedActionListener"); // NOI18N
            eventSets[EVENT_VETOABLE_CHANGE_LISTENER] = new EventSetDescriptor(JSplitButton.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[]{"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener"); // NOI18N
        } catch (IntrospectionException e) {
        }

        // Here you can add code for customizing the event sets array.
        return eventSets;
    }

    // Method identifiers
    private static final int METHOD_ADD_1 = 1;
    private static final int METHOD_ADD_2 = 2;
    private static final int METHOD_ADD_3 = 3;
    private static final int METHOD_ADD_4 = 4;
    private static final int METHOD_ADD_5 = 5;
    private static final int METHOD_ADD_6 = 6;
    private static final int METHOD_ADD_NOTIFY_7 = 7;
    private static final int METHOD_ADD_PROPERTY_CHANGE_LISTENER_8 = 8;
    private static final int METHOD_APPLY_COMPONENT_ORIENTATION_9 = 9;
    private static final int METHOD_ARE_FOCUS_TRAVERSAL_KEYS_SET_10 = 10;
    private static final int METHOD_BOUNDS_11 = 11;
    private static final int METHOD_CHECK_IMAGE_12 = 12;
    private static final int METHOD_CHECK_IMAGE_13 = 13;
    private static final int METHOD_COMPUTE_VISIBLE_RECT_14 = 14;
    private static final int METHOD_CONTAINS_15 = 15;
    private static final int METHOD_CONTAINS_16 = 16;
    private static final int METHOD_COUNT_COMPONENTS_17 = 17;
    private static final int METHOD_CREATE_IMAGE_18 = 18;
    private static final int METHOD_CREATE_IMAGE_19 = 19;
    private static final int METHOD_CREATE_TOOL_TIP_20 = 20;
    private static final int METHOD_CREATE_VOLATILE_IMAGE_21 = 21;
    private static final int METHOD_CREATE_VOLATILE_IMAGE_22 = 22;
    private static final int METHOD_DISABLE_24 = 24;
    private static final int METHOD_DISPATCH_EVENT_25 = 25;
    private static final int METHOD_DO_CLICK_26 = 26;
    private static final int METHOD_DO_CLICK_27 = 27;
    private static final int METHOD_DO_LAYOUT_28 = 28;
    private static final int METHOD_ENABLE_29 = 29;
    private static final int METHOD_ENABLE_30 = 30;
    private static final int METHOD_ENABLE_INPUT_METHODS_31 = 31;
    private static final int METHOD_FIND_COMPONENT_AT_32 = 32;
    private static final int METHOD_FIND_COMPONENT_AT_33 = 33;
    private static final int METHOD_FIRE_PROPERTY_CHANGE_34 = 34;
    private static final int METHOD_FIRE_PROPERTY_CHANGE_35 = 35;
    private static final int METHOD_FIRE_PROPERTY_CHANGE_36 = 36;
    private static final int METHOD_FIRE_PROPERTY_CHANGE_37 = 37;
    private static final int METHOD_FIRE_PROPERTY_CHANGE_38 = 38;
    private static final int METHOD_FIRE_PROPERTY_CHANGE_39 = 39;
    private static final int METHOD_FIRE_PROPERTY_CHANGE_40 = 40;
    private static final int METHOD_FIRE_PROPERTY_CHANGE_41 = 41;
    private static final int METHOD_GET_ACTION_FOR_KEY_STROKE_42 = 42;
    private static final int METHOD_GET_BASELINE_43 = 43;
    private static final int METHOD_GET_BOUNDS_44 = 44;
    private static final int METHOD_GET_CLIENT_PROPERTY_45 = 45;
    private static final int METHOD_GET_COMPONENT_AT_46 = 46;
    private static final int METHOD_GET_COMPONENT_AT_47 = 47;
    private static final int METHOD_GET_COMPONENT_Z_ORDER_48 = 48;
    private static final int METHOD_GET_CONDITION_FOR_KEY_STROKE_49 = 49;
    private static final int METHOD_GET_DEFAULT_LOCALE_50 = 50;
    private static final int METHOD_GET_FOCUS_TRAVERSAL_KEYS_51 = 51;
    private static final int METHOD_GET_FONT_METRICS_52 = 52;
    private static final int METHOD_GET_INSETS_53 = 53;
    private static final int METHOD_GET_LISTENERS_54 = 54;
    private static final int METHOD_GET_LOCATION_55 = 55;
    private static final int METHOD_GET_MNEMONIC_56 = 56;
    private static final int METHOD_GET_MOUSE_POSITION_57 = 57;
    private static final int METHOD_GET_POPUP_LOCATION_58 = 58;
    private static final int METHOD_GET_PROPERTY_CHANGE_LISTENERS_59 = 59;
    private static final int METHOD_GET_SIZE_60 = 60;
    private static final int METHOD_GET_TOOL_TIP_LOCATION_61 = 61;
    private static final int METHOD_GET_TOOL_TIP_TEXT_62 = 62;
    private static final int METHOD_GRAB_FOCUS_64 = 64;
    private static final int METHOD_HAS_FOCUS_66 = 66;
    private static final int METHOD_HIDE_67 = 67;
    private static final int METHOD_IMAGE_UPDATE_68 = 68;
    private static final int METHOD_INSETS_69 = 69;
    private static final int METHOD_INSIDE_70 = 70;
    private static final int METHOD_INVALIDATE_71 = 71;
    private static final int METHOD_IS_ANCESTOR_OF_72 = 72;
    private static final int METHOD_IS_FOCUS_CYCLE_ROOT_73 = 73;
    private static final int METHOD_IS_LIGHTWEIGHT_COMPONENT_74 = 74;
    private static final int METHOD_LAYOUT_77 = 77;
    private static final int METHOD_LIST_78 = 78;
    private static final int METHOD_LIST_79 = 79;
    private static final int METHOD_LIST_80 = 80;
    private static final int METHOD_LIST_81 = 81;
    private static final int METHOD_LIST_82 = 82;
    private static final int METHOD_LOCATE_83 = 83;
    private static final int METHOD_LOCATION_84 = 84;
    private static final int METHOD_MINIMUM_SIZE_86 = 86;
    private static final int METHOD_MOVE_93 = 93;
    private static final int METHOD_NEXT_FOCUS_94 = 94;
    private static final int METHOD_PAINT_95 = 95;
    private static final int METHOD_PAINT_ALL_96 = 96;
    private static final int METHOD_PAINT_COMPONENTS_97 = 97;
    private static final int METHOD_PAINT_IMMEDIATELY_98 = 98;
    private static final int METHOD_PAINT_IMMEDIATELY_99 = 99;
    private static final int METHOD_PREFERRED_SIZE_101 = 101;
    private static final int METHOD_PREPARE_IMAGE_102 = 102;
    private static final int METHOD_PREPARE_IMAGE_103 = 103;
    private static final int METHOD_PRINT_104 = 104;
    private static final int METHOD_PRINT_ALL_105 = 105;
    private static final int METHOD_PRINT_COMPONENTS_106 = 106;
    private static final int METHOD_PUT_CLIENT_PROPERTY_107 = 107;
    private static final int METHOD_REGISTER_KEYBOARD_ACTION_108 = 108;
    private static final int METHOD_REGISTER_KEYBOARD_ACTION_109 = 109;
    private static final int METHOD_REMOVE_110 = 110;
    private static final int METHOD_REMOVE_111 = 111;
    private static final int METHOD_REMOVE_112 = 112;
    private static final int METHOD_REMOVE_ALL_113 = 113;
    private static final int METHOD_REMOVE_NOTIFY_114 = 114;
    private static final int METHOD_REMOVE_PROPERTY_CHANGE_LISTENER_115 = 115;
    private static final int METHOD_REPAINT_116 = 116;
    private static final int METHOD_REPAINT_117 = 117;
    private static final int METHOD_REPAINT_118 = 118;
    private static final int METHOD_REPAINT_119 = 119;
    private static final int METHOD_REPAINT_120 = 120;
    private static final int METHOD_REQUEST_DEFAULT_FOCUS_121 = 121;
    private static final int METHOD_REQUEST_FOCUS_122 = 122;
    private static final int METHOD_REQUEST_FOCUS_123 = 123;
    private static final int METHOD_REQUEST_FOCUS_IN_WINDOW_124 = 124;
    private static final int METHOD_RESET_KEYBOARD_ACTIONS_125 = 125;
    private static final int METHOD_RESHAPE_126 = 126;
    private static final int METHOD_RESIZE_127 = 127;
    private static final int METHOD_RESIZE_128 = 128;
    private static final int METHOD_REVALIDATE_129 = 129;
    private static final int METHOD_SCROLL_RECT_TO_VISIBLE_130 = 130;
    private static final int METHOD_SET_BOUNDS_131 = 131;
    private static final int METHOD_SET_COMPONENT_Z_ORDER_132 = 132;
    private static final int METHOD_SET_DEFAULT_LOCALE_133 = 133;
    private static final int METHOD_SET_MNEMONIC_134 = 134;
    private static final int METHOD_SHOW_135 = 135;
    private static final int METHOD_SHOW_136 = 136;
    private static final int METHOD_SIZE_137 = 137;
    private static final int METHOD_TO_STRING_138 = 138;
    private static final int METHOD_TRANSFER_FOCUS_139 = 139;
    private static final int METHOD_TRANSFER_FOCUS_BACKWARD_140 = 140;
    private static final int METHOD_TRANSFER_FOCUS_DOWN_CYCLE_141 = 141;
    private static final int METHOD_TRANSFER_FOCUS_UP_CYCLE_142 = 142;
    private static final int METHOD_UNREGISTER_KEYBOARD_ACTION_143 = 143;
    private static final int METHOD_UPDATE_144 = 144;
    private static final int METHOD_UPDATE_UI_145 = 145;
    private static final int METHOD_VALIDATE_146 = 146;

    // Method array
    /*
     * lazy MethodDescriptor
     */
    private static MethodDescriptor[] getMdescriptor() {
        MethodDescriptor[] methods = new MethodDescriptor[147];
        final String firePropertyChange = "firePropertyChange";
        final String remove = "remove";
        final String repaint = "repaint";
        try {
            methods[METHOD_ADD_1] = new MethodDescriptor(Component.class.getMethod("add", new Class[]{PopupMenu.class})); // NOI18N
            methods[METHOD_ADD_1].setDisplayName("");
            methods[METHOD_ADD_2] = new MethodDescriptor(Container.class.getMethod("add", new Class[]{Component.class})); // NOI18N
            methods[METHOD_ADD_2].setDisplayName("");
            methods[METHOD_ADD_3] = new MethodDescriptor(Container.class.getMethod("add", new Class[]{java.lang.String.class, Component.class})); // NOI18N
            methods[METHOD_ADD_3].setDisplayName("");
            methods[METHOD_ADD_4] = new MethodDescriptor(Container.class.getMethod("add", new Class[]{Component.class, int.class})); // NOI18N
            methods[METHOD_ADD_4].setDisplayName("");
            methods[METHOD_ADD_5] = new MethodDescriptor(Container.class.getMethod("add", new Class[]{Component.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_ADD_5].setDisplayName("");
            methods[METHOD_ADD_6] = new MethodDescriptor(Container.class.getMethod("add", new Class[]{Component.class, java.lang.Object.class, int.class})); // NOI18N
            methods[METHOD_ADD_6].setDisplayName("");
            methods[METHOD_ADD_NOTIFY_7] = new MethodDescriptor(JComponent.class.getMethod("addNotify", new Class[]{})); // NOI18N
            methods[METHOD_ADD_NOTIFY_7].setDisplayName("");
            methods[METHOD_ADD_PROPERTY_CHANGE_LISTENER_8] = new MethodDescriptor(Container.class.getMethod("addPropertyChangeListener", new Class[]{java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_ADD_PROPERTY_CHANGE_LISTENER_8].setDisplayName("");
            methods[METHOD_APPLY_COMPONENT_ORIENTATION_9] = new MethodDescriptor(Container.class.getMethod("applyComponentOrientation", new Class[]{ComponentOrientation.class})); // NOI18N
            methods[METHOD_APPLY_COMPONENT_ORIENTATION_9].setDisplayName("");
            methods[METHOD_ARE_FOCUS_TRAVERSAL_KEYS_SET_10] = new MethodDescriptor(Container.class.getMethod("areFocusTraversalKeysSet", new Class[]{int.class})); // NOI18N
            methods[METHOD_ARE_FOCUS_TRAVERSAL_KEYS_SET_10].setDisplayName("");
            methods[METHOD_BOUNDS_11] = new MethodDescriptor(Component.class.getMethod("bounds", new Class[]{})); // NOI18N
            methods[METHOD_BOUNDS_11].setDisplayName("");
            methods[METHOD_CHECK_IMAGE_12] = new MethodDescriptor(Component.class.getMethod("checkImage", new Class[]{Image.class, ImageObserver.class})); // NOI18N
            methods[METHOD_CHECK_IMAGE_12].setDisplayName("");
            methods[METHOD_CHECK_IMAGE_13] = new MethodDescriptor(Component.class.getMethod("checkImage", new Class[]{Image.class, int.class, int.class, ImageObserver.class})); // NOI18N
            methods[METHOD_CHECK_IMAGE_13].setDisplayName("");
            methods[METHOD_COMPUTE_VISIBLE_RECT_14] = new MethodDescriptor(JComponent.class.getMethod("computeVisibleRect", new Class[]{Rectangle.class})); // NOI18N
            methods[METHOD_COMPUTE_VISIBLE_RECT_14].setDisplayName("");
            methods[METHOD_CONTAINS_15] = new MethodDescriptor(Component.class.getMethod("contains", new Class[]{Point.class})); // NOI18N
            methods[METHOD_CONTAINS_15].setDisplayName("");
            methods[METHOD_CONTAINS_16] = new MethodDescriptor(JComponent.class.getMethod("contains", new Class[]{int.class, int.class})); // NOI18N
            methods[METHOD_CONTAINS_16].setDisplayName("");
            methods[METHOD_COUNT_COMPONENTS_17] = new MethodDescriptor(Container.class.getMethod("countComponents", new Class[]{})); // NOI18N
            methods[METHOD_COUNT_COMPONENTS_17].setDisplayName("");
            methods[METHOD_CREATE_IMAGE_18] = new MethodDescriptor(Component.class.getMethod("createImage", new Class[]{ImageProducer.class})); // NOI18N
            methods[METHOD_CREATE_IMAGE_18].setDisplayName("");
            methods[METHOD_CREATE_IMAGE_19] = new MethodDescriptor(Component.class.getMethod("createImage", new Class[]{int.class, int.class})); // NOI18N
            methods[METHOD_CREATE_IMAGE_19].setDisplayName("");
            methods[METHOD_CREATE_TOOL_TIP_20] = new MethodDescriptor(JComponent.class.getMethod("createToolTip", new Class[]{})); // NOI18N
            methods[METHOD_CREATE_TOOL_TIP_20].setDisplayName("");
            methods[METHOD_CREATE_VOLATILE_IMAGE_21] = new MethodDescriptor(Component.class.getMethod("createVolatileImage", new Class[]{int.class, int.class})); // NOI18N
            methods[METHOD_CREATE_VOLATILE_IMAGE_21].setDisplayName("");
            methods[METHOD_CREATE_VOLATILE_IMAGE_22] = new MethodDescriptor(Component.class.getMethod("createVolatileImage", new Class[]{int.class, int.class, ImageCapabilities.class})); // NOI18N
            methods[METHOD_CREATE_VOLATILE_IMAGE_22].setDisplayName("");
            methods[METHOD_DISABLE_24] = new MethodDescriptor(JComponent.class.getMethod("disable", new Class[]{})); // NOI18N
            methods[METHOD_DISABLE_24].setDisplayName("");
            methods[METHOD_DISPATCH_EVENT_25] = new MethodDescriptor(Component.class.getMethod("dispatchEvent", new Class[]{AWTEvent.class})); // NOI18N
            methods[METHOD_DISPATCH_EVENT_25].setDisplayName("");
            methods[METHOD_DO_CLICK_26] = new MethodDescriptor(AbstractButton.class.getMethod("doClick", new Class[]{})); // NOI18N
            methods[METHOD_DO_CLICK_26].setDisplayName("");
            methods[METHOD_DO_CLICK_27] = new MethodDescriptor(AbstractButton.class.getMethod("doClick", new Class[]{int.class})); // NOI18N
            methods[METHOD_DO_CLICK_27].setDisplayName("");
            methods[METHOD_DO_LAYOUT_28] = new MethodDescriptor(Container.class.getMethod("doLayout", new Class[]{})); // NOI18N
            methods[METHOD_DO_LAYOUT_28].setDisplayName("");
            methods[METHOD_ENABLE_29] = new MethodDescriptor(Component.class.getMethod("enable", new Class[]{boolean.class})); // NOI18N
            methods[METHOD_ENABLE_29].setDisplayName("");
            methods[METHOD_ENABLE_30] = new MethodDescriptor(JComponent.class.getMethod("enable", new Class[]{})); // NOI18N
            methods[METHOD_ENABLE_30].setDisplayName("");
            methods[METHOD_ENABLE_INPUT_METHODS_31] = new MethodDescriptor(Component.class.getMethod("enableInputMethods", new Class[]{boolean.class})); // NOI18N
            methods[METHOD_ENABLE_INPUT_METHODS_31].setDisplayName("");
            methods[METHOD_FIND_COMPONENT_AT_32] = new MethodDescriptor(Container.class.getMethod("findComponentAt", new Class[]{int.class, int.class})); // NOI18N
            methods[METHOD_FIND_COMPONENT_AT_32].setDisplayName("");
            methods[METHOD_FIND_COMPONENT_AT_33] = new MethodDescriptor(Container.class.getMethod("findComponentAt", new Class[]{Point.class})); // NOI18N
            methods[METHOD_FIND_COMPONENT_AT_33].setDisplayName("");
            methods[METHOD_FIRE_PROPERTY_CHANGE_34] = new MethodDescriptor(Component.class.getMethod(firePropertyChange, new Class[]{java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_FIRE_PROPERTY_CHANGE_34].setDisplayName("");
            methods[METHOD_FIRE_PROPERTY_CHANGE_35] = new MethodDescriptor(Component.class.getMethod(firePropertyChange, new Class[]{java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_FIRE_PROPERTY_CHANGE_35].setDisplayName("");
            methods[METHOD_FIRE_PROPERTY_CHANGE_36] = new MethodDescriptor(Component.class.getMethod(firePropertyChange, new Class[]{java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_FIRE_PROPERTY_CHANGE_36].setDisplayName("");
            methods[METHOD_FIRE_PROPERTY_CHANGE_37] = new MethodDescriptor(Component.class.getMethod(firePropertyChange, new Class[]{java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_FIRE_PROPERTY_CHANGE_37].setDisplayName("");
            methods[METHOD_FIRE_PROPERTY_CHANGE_38] = new MethodDescriptor(Component.class.getMethod(firePropertyChange, new Class[]{java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_FIRE_PROPERTY_CHANGE_38].setDisplayName("");
            methods[METHOD_FIRE_PROPERTY_CHANGE_39] = new MethodDescriptor(JComponent.class.getMethod(firePropertyChange, new Class[]{java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_FIRE_PROPERTY_CHANGE_39].setDisplayName("");
            methods[METHOD_FIRE_PROPERTY_CHANGE_40] = new MethodDescriptor(JComponent.class.getMethod(firePropertyChange, new Class[]{java.lang.String.class, int.class, int.class})); // NOI18N
            methods[METHOD_FIRE_PROPERTY_CHANGE_40].setDisplayName("");
            methods[METHOD_FIRE_PROPERTY_CHANGE_41] = new MethodDescriptor(JComponent.class.getMethod(firePropertyChange, new Class[]{java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_FIRE_PROPERTY_CHANGE_41].setDisplayName("");
            methods[METHOD_GET_ACTION_FOR_KEY_STROKE_42] = new MethodDescriptor(JComponent.class.getMethod("getActionForKeyStroke", new Class[]{KeyStroke.class})); // NOI18N
            methods[METHOD_GET_ACTION_FOR_KEY_STROKE_42].setDisplayName("");
            methods[METHOD_GET_BASELINE_43] = new MethodDescriptor(JComponent.class.getMethod("getBaseline", new Class[]{int.class, int.class})); // NOI18N
            methods[METHOD_GET_BASELINE_43].setDisplayName("");
            methods[METHOD_GET_BOUNDS_44] = new MethodDescriptor(JComponent.class.getMethod("getBounds", new Class[]{Rectangle.class})); // NOI18N
            methods[METHOD_GET_BOUNDS_44].setDisplayName("");
            methods[METHOD_GET_CLIENT_PROPERTY_45] = new MethodDescriptor(JComponent.class.getMethod("getClientProperty", new Class[]{java.lang.Object.class})); // NOI18N
            methods[METHOD_GET_CLIENT_PROPERTY_45].setDisplayName("");
            methods[METHOD_GET_COMPONENT_AT_46] = new MethodDescriptor(Container.class.getMethod("getComponentAt", new Class[]{int.class, int.class})); // NOI18N
            methods[METHOD_GET_COMPONENT_AT_46].setDisplayName("");
            methods[METHOD_GET_COMPONENT_AT_47] = new MethodDescriptor(Container.class.getMethod("getComponentAt", new Class[]{Point.class})); // NOI18N
            methods[METHOD_GET_COMPONENT_AT_47].setDisplayName("");
            methods[METHOD_GET_COMPONENT_Z_ORDER_48] = new MethodDescriptor(Container.class.getMethod("getComponentZOrder", new Class[]{Component.class})); // NOI18N
            methods[METHOD_GET_COMPONENT_Z_ORDER_48].setDisplayName("");
            methods[METHOD_GET_CONDITION_FOR_KEY_STROKE_49] = new MethodDescriptor(JComponent.class.getMethod("getConditionForKeyStroke", new Class[]{KeyStroke.class})); // NOI18N
            methods[METHOD_GET_CONDITION_FOR_KEY_STROKE_49].setDisplayName("");
            methods[METHOD_GET_DEFAULT_LOCALE_50] = new MethodDescriptor(JComponent.class.getMethod("getDefaultLocale", new Class[]{})); // NOI18N
            methods[METHOD_GET_DEFAULT_LOCALE_50].setDisplayName("");
            methods[METHOD_GET_FOCUS_TRAVERSAL_KEYS_51] = new MethodDescriptor(Container.class.getMethod("getFocusTraversalKeys", new Class[]{int.class})); // NOI18N
            methods[METHOD_GET_FOCUS_TRAVERSAL_KEYS_51].setDisplayName("");
            methods[METHOD_GET_FONT_METRICS_52] = new MethodDescriptor(JComponent.class.getMethod("getFontMetrics", new Class[]{Font.class})); // NOI18N
            methods[METHOD_GET_FONT_METRICS_52].setDisplayName("");
            methods[METHOD_GET_INSETS_53] = new MethodDescriptor(JComponent.class.getMethod("getInsets", new Class[]{Insets.class})); // NOI18N
            methods[METHOD_GET_INSETS_53].setDisplayName("");
            methods[METHOD_GET_LISTENERS_54] = new MethodDescriptor(JComponent.class.getMethod("getListeners", new Class[]{java.lang.Class.class})); // NOI18N
            methods[METHOD_GET_LISTENERS_54].setDisplayName("");
            methods[METHOD_GET_LOCATION_55] = new MethodDescriptor(JComponent.class.getMethod("getLocation", new Class[]{Point.class})); // NOI18N
            methods[METHOD_GET_LOCATION_55].setDisplayName("");
            methods[METHOD_GET_MNEMONIC_56] = new MethodDescriptor(AbstractButton.class.getMethod("getMnemonic", new Class[]{})); // NOI18N
            methods[METHOD_GET_MNEMONIC_56].setDisplayName("");
            methods[METHOD_GET_MOUSE_POSITION_57] = new MethodDescriptor(Container.class.getMethod("getMousePosition", new Class[]{boolean.class})); // NOI18N
            methods[METHOD_GET_MOUSE_POSITION_57].setDisplayName("");
            methods[METHOD_GET_POPUP_LOCATION_58] = new MethodDescriptor(JComponent.class.getMethod("getPopupLocation", new Class[]{MouseEvent.class})); // NOI18N
            methods[METHOD_GET_POPUP_LOCATION_58].setDisplayName("");
            methods[METHOD_GET_PROPERTY_CHANGE_LISTENERS_59] = new MethodDescriptor(Component.class.getMethod("getPropertyChangeListeners", new Class[]{java.lang.String.class})); // NOI18N
            methods[METHOD_GET_PROPERTY_CHANGE_LISTENERS_59].setDisplayName("");
            methods[METHOD_GET_SIZE_60] = new MethodDescriptor(JComponent.class.getMethod("getSize", new Class[]{Dimension.class})); // NOI18N
            methods[METHOD_GET_SIZE_60].setDisplayName("");
            methods[METHOD_GET_TOOL_TIP_LOCATION_61] = new MethodDescriptor(JComponent.class.getMethod("getToolTipLocation", new Class[]{MouseEvent.class})); // NOI18N
            methods[METHOD_GET_TOOL_TIP_LOCATION_61].setDisplayName("");
            methods[METHOD_GET_TOOL_TIP_TEXT_62] = new MethodDescriptor(JComponent.class.getMethod("getToolTipText", new Class[]{MouseEvent.class})); // NOI18N
            methods[METHOD_GET_TOOL_TIP_TEXT_62].setDisplayName("");
            methods[METHOD_GRAB_FOCUS_64] = new MethodDescriptor(JComponent.class.getMethod("grabFocus", new Class[]{})); // NOI18N
            methods[METHOD_GRAB_FOCUS_64].setDisplayName("");
            methods[METHOD_HAS_FOCUS_66] = new MethodDescriptor(Component.class.getMethod("hasFocus", new Class[]{})); // NOI18N
            methods[METHOD_HAS_FOCUS_66].setDisplayName("");
            methods[METHOD_HIDE_67] = new MethodDescriptor(JComponent.class.getMethod("hide", new Class[]{})); // NOI18N
            methods[METHOD_HIDE_67].setDisplayName("");
            methods[METHOD_IMAGE_UPDATE_68] = new MethodDescriptor(AbstractButton.class.getMethod("imageUpdate", new Class[]{Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_IMAGE_UPDATE_68].setDisplayName("");
            methods[METHOD_INSETS_69] = new MethodDescriptor(Container.class.getMethod("insets", new Class[]{})); // NOI18N
            methods[METHOD_INSETS_69].setDisplayName("");
            methods[METHOD_INSIDE_70] = new MethodDescriptor(Component.class.getMethod("inside", new Class[]{int.class, int.class})); // NOI18N
            methods[METHOD_INSIDE_70].setDisplayName("");
            methods[METHOD_INVALIDATE_71] = new MethodDescriptor(Container.class.getMethod("invalidate", new Class[]{})); // NOI18N
            methods[METHOD_INVALIDATE_71].setDisplayName("");
            methods[METHOD_IS_ANCESTOR_OF_72] = new MethodDescriptor(Container.class.getMethod("isAncestorOf", new Class[]{Component.class})); // NOI18N
            methods[METHOD_IS_ANCESTOR_OF_72].setDisplayName("");
            methods[METHOD_IS_FOCUS_CYCLE_ROOT_73] = new MethodDescriptor(Container.class.getMethod("isFocusCycleRoot", new Class[]{Container.class})); // NOI18N
            methods[METHOD_IS_FOCUS_CYCLE_ROOT_73].setDisplayName("");
            methods[METHOD_IS_LIGHTWEIGHT_COMPONENT_74] = new MethodDescriptor(JComponent.class.getMethod("isLightweightComponent", new Class[]{Component.class})); // NOI18N
            methods[METHOD_IS_LIGHTWEIGHT_COMPONENT_74].setDisplayName("");
            methods[METHOD_LAYOUT_77] = new MethodDescriptor(Container.class.getMethod("layout", new Class[]{})); // NOI18N
            methods[METHOD_LAYOUT_77].setDisplayName("");
            methods[METHOD_LIST_78] = new MethodDescriptor(Component.class.getMethod("list", new Class[]{})); // NOI18N
            methods[METHOD_LIST_78].setDisplayName("");
            methods[METHOD_LIST_79] = new MethodDescriptor(Component.class.getMethod("list", new Class[]{java.io.PrintStream.class})); // NOI18N
            methods[METHOD_LIST_79].setDisplayName("");
            methods[METHOD_LIST_80] = new MethodDescriptor(Component.class.getMethod("list", new Class[]{java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_LIST_80].setDisplayName("");
            methods[METHOD_LIST_81] = new MethodDescriptor(Container.class.getMethod("list", new Class[]{java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_LIST_81].setDisplayName("");
            methods[METHOD_LIST_82] = new MethodDescriptor(Container.class.getMethod("list", new Class[]{java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_LIST_82].setDisplayName("");
            methods[METHOD_LOCATE_83] = new MethodDescriptor(Container.class.getMethod("locate", new Class[]{int.class, int.class})); // NOI18N
            methods[METHOD_LOCATE_83].setDisplayName("");
            methods[METHOD_LOCATION_84] = new MethodDescriptor(Component.class.getMethod("location", new Class[]{})); // NOI18N
            methods[METHOD_LOCATION_84].setDisplayName("");
            methods[METHOD_MINIMUM_SIZE_86] = new MethodDescriptor(Container.class.getMethod("minimumSize", new Class[]{})); // NOI18N
            methods[METHOD_MINIMUM_SIZE_86].setDisplayName("");
            methods[METHOD_MOVE_93] = new MethodDescriptor(Component.class.getMethod("move", new Class[]{int.class, int.class})); // NOI18N
            methods[METHOD_MOVE_93].setDisplayName("");
            methods[METHOD_NEXT_FOCUS_94] = new MethodDescriptor(Component.class.getMethod("nextFocus", new Class[]{})); // NOI18N
            methods[METHOD_NEXT_FOCUS_94].setDisplayName("");
            methods[METHOD_PAINT_95] = new MethodDescriptor(JComponent.class.getMethod("paint", new Class[]{Graphics.class})); // NOI18N
            methods[METHOD_PAINT_95].setDisplayName("");
            methods[METHOD_PAINT_ALL_96] = new MethodDescriptor(Component.class.getMethod("paintAll", new Class[]{Graphics.class})); // NOI18N
            methods[METHOD_PAINT_ALL_96].setDisplayName("");
            methods[METHOD_PAINT_COMPONENTS_97] = new MethodDescriptor(Container.class.getMethod("paintComponents", new Class[]{Graphics.class})); // NOI18N
            methods[METHOD_PAINT_COMPONENTS_97].setDisplayName("");
            methods[METHOD_PAINT_IMMEDIATELY_98] = new MethodDescriptor(JComponent.class.getMethod("paintImmediately", new Class[]{int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_PAINT_IMMEDIATELY_98].setDisplayName("");
            methods[METHOD_PAINT_IMMEDIATELY_99] = new MethodDescriptor(JComponent.class.getMethod("paintImmediately", new Class[]{Rectangle.class})); // NOI18N
            methods[METHOD_PAINT_IMMEDIATELY_99].setDisplayName("");
            methods[METHOD_PREFERRED_SIZE_101] = new MethodDescriptor(Container.class.getMethod("preferredSize", new Class[]{})); // NOI18N
            methods[METHOD_PREFERRED_SIZE_101].setDisplayName("");
            methods[METHOD_PREPARE_IMAGE_102] = new MethodDescriptor(Component.class.getMethod("prepareImage", new Class[]{Image.class, ImageObserver.class})); // NOI18N
            methods[METHOD_PREPARE_IMAGE_102].setDisplayName("");
            methods[METHOD_PREPARE_IMAGE_103] = new MethodDescriptor(Component.class.getMethod("prepareImage", new Class[]{Image.class, int.class, int.class, ImageObserver.class})); // NOI18N
            methods[METHOD_PREPARE_IMAGE_103].setDisplayName("");
            methods[METHOD_PRINT_104] = new MethodDescriptor(JComponent.class.getMethod("print", new Class[]{Graphics.class})); // NOI18N
            methods[METHOD_PRINT_104].setDisplayName("");
            methods[METHOD_PRINT_ALL_105] = new MethodDescriptor(JComponent.class.getMethod("printAll", new Class[]{Graphics.class})); // NOI18N
            methods[METHOD_PRINT_ALL_105].setDisplayName("");
            methods[METHOD_PRINT_COMPONENTS_106] = new MethodDescriptor(Container.class.getMethod("printComponents", new Class[]{Graphics.class})); // NOI18N
            methods[METHOD_PRINT_COMPONENTS_106].setDisplayName("");
            methods[METHOD_PUT_CLIENT_PROPERTY_107] = new MethodDescriptor(JComponent.class.getMethod("putClientProperty", new Class[]{java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_PUT_CLIENT_PROPERTY_107].setDisplayName("");
            methods[METHOD_REGISTER_KEYBOARD_ACTION_108] = new MethodDescriptor(JComponent.class.getMethod("registerKeyboardAction", new Class[]{ActionListener.class, java.lang.String.class, KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_REGISTER_KEYBOARD_ACTION_108].setDisplayName("");
            methods[METHOD_REGISTER_KEYBOARD_ACTION_109] = new MethodDescriptor(JComponent.class.getMethod("registerKeyboardAction", new Class[]{ActionListener.class, KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_REGISTER_KEYBOARD_ACTION_109].setDisplayName("");
            methods[METHOD_REMOVE_110] = new MethodDescriptor(Component.class.getMethod(remove, new Class[]{MenuComponent.class})); // NOI18N
            methods[METHOD_REMOVE_110].setDisplayName("");
            methods[METHOD_REMOVE_111] = new MethodDescriptor(Container.class.getMethod(remove, new Class[]{int.class})); // NOI18N
            methods[METHOD_REMOVE_111].setDisplayName("");
            methods[METHOD_REMOVE_112] = new MethodDescriptor(Container.class.getMethod(remove, new Class[]{Component.class})); // NOI18N
            methods[METHOD_REMOVE_112].setDisplayName("");
            methods[METHOD_REMOVE_ALL_113] = new MethodDescriptor(Container.class.getMethod("removeAll", new Class[]{})); // NOI18N
            methods[METHOD_REMOVE_ALL_113].setDisplayName("");
            methods[METHOD_REMOVE_NOTIFY_114] = new MethodDescriptor(JButton.class.getMethod("removeNotify", new Class[]{})); // NOI18N
            methods[METHOD_REMOVE_NOTIFY_114].setDisplayName("");
            methods[METHOD_REMOVE_PROPERTY_CHANGE_LISTENER_115] = new MethodDescriptor(Component.class.getMethod("removePropertyChangeListener", new Class[]{java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_REMOVE_PROPERTY_CHANGE_LISTENER_115].setDisplayName("");
            methods[METHOD_REPAINT_116] = new MethodDescriptor(Component.class.getMethod(repaint, new Class[]{})); // NOI18N
            methods[METHOD_REPAINT_116].setDisplayName("");
            methods[METHOD_REPAINT_117] = new MethodDescriptor(Component.class.getMethod(repaint, new Class[]{long.class})); // NOI18N
            methods[METHOD_REPAINT_117].setDisplayName("");
            methods[METHOD_REPAINT_118] = new MethodDescriptor(Component.class.getMethod(repaint, new Class[]{int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_REPAINT_118].setDisplayName("");
            methods[METHOD_REPAINT_119] = new MethodDescriptor(JComponent.class.getMethod(repaint, new Class[]{long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_REPAINT_119].setDisplayName("");
            methods[METHOD_REPAINT_120] = new MethodDescriptor(JComponent.class.getMethod(repaint, new Class[]{Rectangle.class})); // NOI18N
            methods[METHOD_REPAINT_120].setDisplayName("");
            methods[METHOD_REQUEST_DEFAULT_FOCUS_121] = new MethodDescriptor(JComponent.class.getMethod("requestDefaultFocus", new Class[]{})); // NOI18N
            methods[METHOD_REQUEST_DEFAULT_FOCUS_121].setDisplayName("");
            methods[METHOD_REQUEST_FOCUS_122] = new MethodDescriptor(JComponent.class.getMethod("requestFocus", new Class[]{})); // NOI18N
            methods[METHOD_REQUEST_FOCUS_122].setDisplayName("");
            methods[METHOD_REQUEST_FOCUS_123] = new MethodDescriptor(JComponent.class.getMethod("requestFocus", new Class[]{boolean.class})); // NOI18N
            methods[METHOD_REQUEST_FOCUS_123].setDisplayName("");
            methods[METHOD_REQUEST_FOCUS_IN_WINDOW_124] = new MethodDescriptor(JComponent.class.getMethod("requestFocusInWindow", new Class[]{})); // NOI18N
            methods[METHOD_REQUEST_FOCUS_IN_WINDOW_124].setDisplayName("");
            methods[METHOD_RESET_KEYBOARD_ACTIONS_125] = new MethodDescriptor(JComponent.class.getMethod("resetKeyboardActions", new Class[]{})); // NOI18N
            methods[METHOD_RESET_KEYBOARD_ACTIONS_125].setDisplayName("");
            methods[METHOD_RESHAPE_126] = new MethodDescriptor(JComponent.class.getMethod("reshape", new Class[]{int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_RESHAPE_126].setDisplayName("");
            methods[METHOD_RESIZE_127] = new MethodDescriptor(Component.class.getMethod("resize", new Class[]{int.class, int.class})); // NOI18N
            methods[METHOD_RESIZE_127].setDisplayName("");
            methods[METHOD_RESIZE_128] = new MethodDescriptor(Component.class.getMethod("resize", new Class[]{Dimension.class})); // NOI18N
            methods[METHOD_RESIZE_128].setDisplayName("");
            methods[METHOD_REVALIDATE_129] = new MethodDescriptor(JComponent.class.getMethod("revalidate", new Class[]{})); // NOI18N
            methods[METHOD_REVALIDATE_129].setDisplayName("");
            methods[METHOD_SCROLL_RECT_TO_VISIBLE_130] = new MethodDescriptor(JComponent.class.getMethod("scrollRectToVisible", new Class[]{Rectangle.class})); // NOI18N
            methods[METHOD_SCROLL_RECT_TO_VISIBLE_130].setDisplayName("");
            methods[METHOD_SET_BOUNDS_131] = new MethodDescriptor(Component.class.getMethod("setBounds", new Class[]{int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_SET_BOUNDS_131].setDisplayName("");
            methods[METHOD_SET_COMPONENT_Z_ORDER_132] = new MethodDescriptor(Container.class.getMethod("setComponentZOrder", new Class[]{Component.class, int.class})); // NOI18N
            methods[METHOD_SET_COMPONENT_Z_ORDER_132].setDisplayName("");
            methods[METHOD_SET_DEFAULT_LOCALE_133] = new MethodDescriptor(JComponent.class.getMethod("setDefaultLocale", new Class[]{java.util.Locale.class})); // NOI18N
            methods[METHOD_SET_DEFAULT_LOCALE_133].setDisplayName("");
            methods[METHOD_SET_MNEMONIC_134] = new MethodDescriptor(AbstractButton.class.getMethod("setMnemonic", new Class[]{int.class})); // NOI18N
            methods[METHOD_SET_MNEMONIC_134].setDisplayName("");
            methods[METHOD_SHOW_135] = new MethodDescriptor(Component.class.getMethod("show", new Class[]{})); // NOI18N
            methods[METHOD_SHOW_135].setDisplayName("");
            methods[METHOD_SHOW_136] = new MethodDescriptor(Component.class.getMethod("show", new Class[]{boolean.class})); // NOI18N
            methods[METHOD_SHOW_136].setDisplayName("");
            methods[METHOD_SIZE_137] = new MethodDescriptor(Component.class.getMethod("size", new Class[]{})); // NOI18N
            methods[METHOD_SIZE_137].setDisplayName("");
            methods[METHOD_TO_STRING_138] = new MethodDescriptor(Component.class.getMethod("toString", new Class[]{})); // NOI18N
            methods[METHOD_TO_STRING_138].setDisplayName("");
            methods[METHOD_TRANSFER_FOCUS_139] = new MethodDescriptor(Component.class.getMethod("transferFocus", new Class[]{})); // NOI18N
            methods[METHOD_TRANSFER_FOCUS_139].setDisplayName("");
            methods[METHOD_TRANSFER_FOCUS_BACKWARD_140] = new MethodDescriptor(Component.class.getMethod("transferFocusBackward", new Class[]{})); // NOI18N
            methods[METHOD_TRANSFER_FOCUS_BACKWARD_140].setDisplayName("");
            methods[METHOD_TRANSFER_FOCUS_DOWN_CYCLE_141] = new MethodDescriptor(Container.class.getMethod("transferFocusDownCycle", new Class[]{})); // NOI18N
            methods[METHOD_TRANSFER_FOCUS_DOWN_CYCLE_141].setDisplayName("");
            methods[METHOD_TRANSFER_FOCUS_UP_CYCLE_142] = new MethodDescriptor(Component.class.getMethod("transferFocusUpCycle", new Class[]{})); // NOI18N
            methods[METHOD_TRANSFER_FOCUS_UP_CYCLE_142].setDisplayName("");
            methods[METHOD_UNREGISTER_KEYBOARD_ACTION_143] = new MethodDescriptor(JComponent.class.getMethod("unregisterKeyboardAction", new Class[]{KeyStroke.class})); // NOI18N
            methods[METHOD_UNREGISTER_KEYBOARD_ACTION_143].setDisplayName("");
            methods[METHOD_UPDATE_144] = new MethodDescriptor(JComponent.class.getMethod("update", new Class[]{Graphics.class})); // NOI18N
            methods[METHOD_UPDATE_144].setDisplayName("");
            methods[METHOD_UPDATE_UI_145] = new MethodDescriptor(JButton.class.getMethod("updateUI", new Class[]{})); // NOI18N
            methods[METHOD_UPDATE_UI_145].setDisplayName("");
            methods[METHOD_VALIDATE_146] = new MethodDescriptor(Container.class.getMethod("validate", new Class[]{})); // NOI18N
            methods[METHOD_VALIDATE_146].setDisplayName("");
        }
        catch (NoSuchMethodException | SecurityException e) {
        }

        // Here you can add code for customizing the methods array.
        return methods;
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
