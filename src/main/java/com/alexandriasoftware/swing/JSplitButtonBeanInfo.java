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

import java.awt.Toolkit;
import java.beans.*;

/**
 * @author Naveed Quadri 2012
 * @author Randall Wood 2016
 */
public class JSplitButtonBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( com.alexandriasoftware.swing.JSplitButton.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor

        // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_action = 1;
    private static final int PROPERTY_actionCommand = 2;
    private static final int PROPERTY_actionListeners = 3;
    private static final int PROPERTY_actionMap = 4;
    private static final int PROPERTY_alignmentX = 5;
    private static final int PROPERTY_alignmentY = 6;
    private static final int PROPERTY_alwaysDropDown = 7;
    private static final int PROPERTY_ancestorListeners = 8;
    private static final int PROPERTY_arrowColor = 9;
    private static final int PROPERTY_arrowSize = 10;
    private static final int PROPERTY_autoscrolls = 11;
    private static final int PROPERTY_background = 12;
    private static final int PROPERTY_backgroundSet = 13;
    private static final int PROPERTY_baselineResizeBehavior = 14;
    private static final int PROPERTY_border = 15;
    private static final int PROPERTY_borderPainted = 16;
    private static final int PROPERTY_bounds = 17;
    private static final int PROPERTY_changeListeners = 18;
    private static final int PROPERTY_colorModel = 19;
    private static final int PROPERTY_component = 20;
    private static final int PROPERTY_componentCount = 21;
    private static final int PROPERTY_componentListeners = 22;
    private static final int PROPERTY_componentOrientation = 23;
    private static final int PROPERTY_componentPopupMenu = 24;
    private static final int PROPERTY_components = 25;
    private static final int PROPERTY_containerListeners = 26;
    private static final int PROPERTY_contentAreaFilled = 27;
    private static final int PROPERTY_cursor = 28;
    private static final int PROPERTY_cursorSet = 29;
    private static final int PROPERTY_debugGraphicsOptions = 30;
    private static final int PROPERTY_defaultButton = 31;
    private static final int PROPERTY_defaultCapable = 32;
    private static final int PROPERTY_disabledArrowColor = 33;
    private static final int PROPERTY_disabledIcon = 34;
    private static final int PROPERTY_disabledImage = 35;
    private static final int PROPERTY_disabledSelectedIcon = 36;
    private static final int PROPERTY_displayable = 37;
    private static final int PROPERTY_displayedMnemonicIndex = 38;
    private static final int PROPERTY_doubleBuffered = 39;
    private static final int PROPERTY_dropTarget = 40;
    private static final int PROPERTY_enabled = 41;
    private static final int PROPERTY_focusable = 42;
    private static final int PROPERTY_focusCycleRoot = 43;
    private static final int PROPERTY_focusCycleRootAncestor = 44;
    private static final int PROPERTY_focusListeners = 45;
    private static final int PROPERTY_focusOwner = 46;
    private static final int PROPERTY_focusPainted = 47;
    private static final int PROPERTY_focusTraversable = 48;
    private static final int PROPERTY_focusTraversalKeys = 49;
    private static final int PROPERTY_focusTraversalKeysEnabled = 50;
    private static final int PROPERTY_focusTraversalPolicy = 51;
    private static final int PROPERTY_focusTraversalPolicyProvider = 52;
    private static final int PROPERTY_focusTraversalPolicySet = 53;
    private static final int PROPERTY_font = 54;
    private static final int PROPERTY_fontSet = 55;
    private static final int PROPERTY_foreground = 56;
    private static final int PROPERTY_foregroundSet = 57;
    private static final int PROPERTY_graphics = 58;
    private static final int PROPERTY_graphicsConfiguration = 59;
    private static final int PROPERTY_height = 60;
    private static final int PROPERTY_hideActionText = 61;
    private static final int PROPERTY_hierarchyBoundsListeners = 62;
    private static final int PROPERTY_hierarchyListeners = 63;
    private static final int PROPERTY_horizontalAlignment = 64;
    private static final int PROPERTY_horizontalTextPosition = 65;
    private static final int PROPERTY_icon = 66;
    private static final int PROPERTY_iconTextGap = 67;
    private static final int PROPERTY_ignoreRepaint = 68;
    private static final int PROPERTY_image = 69;
    private static final int PROPERTY_inheritsPopupMenu = 70;
    private static final int PROPERTY_inputContext = 71;
    private static final int PROPERTY_inputMap = 72;
    private static final int PROPERTY_inputMethodListeners = 73;
    private static final int PROPERTY_inputMethodRequests = 74;
    private static final int PROPERTY_inputVerifier = 75;
    private static final int PROPERTY_insets = 76;
    private static final int PROPERTY_itemListeners = 77;
    private static final int PROPERTY_keyListeners = 78;
    private static final int PROPERTY_label = 79;
    private static final int PROPERTY_layout = 80;
    private static final int PROPERTY_lightweight = 81;
    private static final int PROPERTY_locale = 82;
    private static final int PROPERTY_location = 83;
    private static final int PROPERTY_locationOnScreen = 84;
    private static final int PROPERTY_managingFocus = 85;
    private static final int PROPERTY_margin = 86;
    private static final int PROPERTY_maximumSize = 87;
    private static final int PROPERTY_maximumSizeSet = 88;
    private static final int PROPERTY_minimumSize = 89;
    private static final int PROPERTY_minimumSizeSet = 90;
    private static final int PROPERTY_mnemonic = 91;
    private static final int PROPERTY_model = 92;
    private static final int PROPERTY_mouseListeners = 93;
    private static final int PROPERTY_mouseMotionListeners = 94;
    private static final int PROPERTY_mousePosition = 95;
    private static final int PROPERTY_mouseWheelListeners = 96;
    private static final int PROPERTY_multiClickThreshhold = 97;
    private static final int PROPERTY_name = 98;
    private static final int PROPERTY_nextFocusableComponent = 99;
    private static final int PROPERTY_opaque = 100;
    private static final int PROPERTY_optimizedDrawingEnabled = 101;
    private static final int PROPERTY_paintingForPrint = 102;
    private static final int PROPERTY_paintingTile = 103;
    private static final int PROPERTY_parent = 104;
    private static final int PROPERTY_peer = 105;
    private static final int PROPERTY_popupMenu = 106;
    private static final int PROPERTY_preferredSize = 107;
    private static final int PROPERTY_preferredSizeSet = 108;
    private static final int PROPERTY_pressedIcon = 109;
    private static final int PROPERTY_propertyChangeListeners = 110;
    private static final int PROPERTY_registeredKeyStrokes = 111;
    private static final int PROPERTY_requestFocusEnabled = 112;
    private static final int PROPERTY_rolloverEnabled = 113;
    private static final int PROPERTY_rolloverIcon = 114;
    private static final int PROPERTY_rolloverSelectedIcon = 115;
    private static final int PROPERTY_rootPane = 116;
    private static final int PROPERTY_selected = 117;
    private static final int PROPERTY_selectedIcon = 118;
    private static final int PROPERTY_selectedObjects = 119;
    private static final int PROPERTY_separatorSpacing = 120;
    private static final int PROPERTY_showing = 121;
    private static final int PROPERTY_size = 122;
    private static final int PROPERTY_splitWidth = 123;
    private static final int PROPERTY_text = 124;
    private static final int PROPERTY_toolkit = 125;
    private static final int PROPERTY_toolTipText = 126;
    private static final int PROPERTY_topLevelAncestor = 127;
    private static final int PROPERTY_transferHandler = 128;
    private static final int PROPERTY_treeLock = 129;
    private static final int PROPERTY_UI = 130;
    private static final int PROPERTY_UIClassID = 131;
    private static final int PROPERTY_valid = 132;
    private static final int PROPERTY_validateRoot = 133;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 134;
    private static final int PROPERTY_verticalAlignment = 135;
    private static final int PROPERTY_verticalTextPosition = 136;
    private static final int PROPERTY_vetoableChangeListeners = 137;
    private static final int PROPERTY_visible = 138;
    private static final int PROPERTY_visibleRect = 139;
    private static final int PROPERTY_width = 140;
    private static final int PROPERTY_x = 141;
    private static final int PROPERTY_y = 142;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[143];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", com.alexandriasoftware.swing.JSplitButton.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_action] = new PropertyDescriptor ( "action", com.alexandriasoftware.swing.JSplitButton.class, "getAction", "setAction" ); // NOI18N
            properties[PROPERTY_actionCommand] = new PropertyDescriptor ( "actionCommand", com.alexandriasoftware.swing.JSplitButton.class, "getActionCommand", "setActionCommand" ); // NOI18N
            properties[PROPERTY_actionListeners] = new PropertyDescriptor ( "actionListeners", com.alexandriasoftware.swing.JSplitButton.class, "getActionListeners", null ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", com.alexandriasoftware.swing.JSplitButton.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", com.alexandriasoftware.swing.JSplitButton.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", com.alexandriasoftware.swing.JSplitButton.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_alwaysDropDown] = new PropertyDescriptor ( "alwaysDropDown", com.alexandriasoftware.swing.JSplitButton.class, "isAlwaysDropDown", "setAlwaysDropDown" ); // NOI18N
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", com.alexandriasoftware.swing.JSplitButton.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_arrowColor] = new PropertyDescriptor ( "arrowColor", com.alexandriasoftware.swing.JSplitButton.class, "getArrowColor", "setArrowColor" ); // NOI18N
            properties[PROPERTY_arrowSize] = new PropertyDescriptor ( "arrowSize", com.alexandriasoftware.swing.JSplitButton.class, "getArrowSize", "setArrowSize" ); // NOI18N
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", com.alexandriasoftware.swing.JSplitButton.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", com.alexandriasoftware.swing.JSplitButton.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", com.alexandriasoftware.swing.JSplitButton.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", com.alexandriasoftware.swing.JSplitButton.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", com.alexandriasoftware.swing.JSplitButton.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_borderPainted] = new PropertyDescriptor ( "borderPainted", com.alexandriasoftware.swing.JSplitButton.class, "isBorderPainted", "setBorderPainted" ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", com.alexandriasoftware.swing.JSplitButton.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_changeListeners] = new PropertyDescriptor ( "changeListeners", com.alexandriasoftware.swing.JSplitButton.class, "getChangeListeners", null ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", com.alexandriasoftware.swing.JSplitButton.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", com.alexandriasoftware.swing.JSplitButton.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", com.alexandriasoftware.swing.JSplitButton.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", com.alexandriasoftware.swing.JSplitButton.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", com.alexandriasoftware.swing.JSplitButton.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", com.alexandriasoftware.swing.JSplitButton.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", com.alexandriasoftware.swing.JSplitButton.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", com.alexandriasoftware.swing.JSplitButton.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_contentAreaFilled] = new PropertyDescriptor ( "contentAreaFilled", com.alexandriasoftware.swing.JSplitButton.class, "isContentAreaFilled", "setContentAreaFilled" ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", com.alexandriasoftware.swing.JSplitButton.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", com.alexandriasoftware.swing.JSplitButton.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", com.alexandriasoftware.swing.JSplitButton.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_defaultButton] = new PropertyDescriptor ( "defaultButton", com.alexandriasoftware.swing.JSplitButton.class, "isDefaultButton", null ); // NOI18N
            properties[PROPERTY_defaultCapable] = new PropertyDescriptor ( "defaultCapable", com.alexandriasoftware.swing.JSplitButton.class, "isDefaultCapable", "setDefaultCapable" ); // NOI18N
            properties[PROPERTY_disabledArrowColor] = new PropertyDescriptor ( "disabledArrowColor", com.alexandriasoftware.swing.JSplitButton.class, "getDisabledArrowColor", "setDisabledArrowColor" ); // NOI18N
            properties[PROPERTY_disabledIcon] = new PropertyDescriptor ( "disabledIcon", com.alexandriasoftware.swing.JSplitButton.class, "getDisabledIcon", "setDisabledIcon" ); // NOI18N
            properties[PROPERTY_disabledImage] = new PropertyDescriptor ( "disabledImage", com.alexandriasoftware.swing.JSplitButton.class, "getDisabledImage", "setDisabledImage" ); // NOI18N
            properties[PROPERTY_disabledSelectedIcon] = new PropertyDescriptor ( "disabledSelectedIcon", com.alexandriasoftware.swing.JSplitButton.class, "getDisabledSelectedIcon", "setDisabledSelectedIcon" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", com.alexandriasoftware.swing.JSplitButton.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_displayedMnemonicIndex] = new PropertyDescriptor ( "displayedMnemonicIndex", com.alexandriasoftware.swing.JSplitButton.class, "getDisplayedMnemonicIndex", "setDisplayedMnemonicIndex" ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", com.alexandriasoftware.swing.JSplitButton.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", com.alexandriasoftware.swing.JSplitButton.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", com.alexandriasoftware.swing.JSplitButton.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", com.alexandriasoftware.swing.JSplitButton.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", com.alexandriasoftware.swing.JSplitButton.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", com.alexandriasoftware.swing.JSplitButton.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", com.alexandriasoftware.swing.JSplitButton.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", com.alexandriasoftware.swing.JSplitButton.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusPainted] = new PropertyDescriptor ( "focusPainted", com.alexandriasoftware.swing.JSplitButton.class, "isFocusPainted", "setFocusPainted" ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", com.alexandriasoftware.swing.JSplitButton.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", com.alexandriasoftware.swing.JSplitButton.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", com.alexandriasoftware.swing.JSplitButton.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", com.alexandriasoftware.swing.JSplitButton.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", com.alexandriasoftware.swing.JSplitButton.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", com.alexandriasoftware.swing.JSplitButton.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", com.alexandriasoftware.swing.JSplitButton.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", com.alexandriasoftware.swing.JSplitButton.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", com.alexandriasoftware.swing.JSplitButton.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", com.alexandriasoftware.swing.JSplitButton.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", com.alexandriasoftware.swing.JSplitButton.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", com.alexandriasoftware.swing.JSplitButton.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", com.alexandriasoftware.swing.JSplitButton.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hideActionText] = new PropertyDescriptor ( "hideActionText", com.alexandriasoftware.swing.JSplitButton.class, "getHideActionText", "setHideActionText" ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", com.alexandriasoftware.swing.JSplitButton.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", com.alexandriasoftware.swing.JSplitButton.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_horizontalAlignment] = new PropertyDescriptor ( "horizontalAlignment", com.alexandriasoftware.swing.JSplitButton.class, "getHorizontalAlignment", "setHorizontalAlignment" ); // NOI18N
            properties[PROPERTY_horizontalTextPosition] = new PropertyDescriptor ( "horizontalTextPosition", com.alexandriasoftware.swing.JSplitButton.class, "getHorizontalTextPosition", "setHorizontalTextPosition" ); // NOI18N
            properties[PROPERTY_icon] = new PropertyDescriptor ( "icon", com.alexandriasoftware.swing.JSplitButton.class, "getIcon", "setIcon" ); // NOI18N
            properties[PROPERTY_iconTextGap] = new PropertyDescriptor ( "iconTextGap", com.alexandriasoftware.swing.JSplitButton.class, "getIconTextGap", "setIconTextGap" ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", com.alexandriasoftware.swing.JSplitButton.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_image] = new PropertyDescriptor ( "image", com.alexandriasoftware.swing.JSplitButton.class, "getImage", "setImage" ); // NOI18N
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", com.alexandriasoftware.swing.JSplitButton.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", com.alexandriasoftware.swing.JSplitButton.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", com.alexandriasoftware.swing.JSplitButton.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", com.alexandriasoftware.swing.JSplitButton.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", com.alexandriasoftware.swing.JSplitButton.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", com.alexandriasoftware.swing.JSplitButton.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", com.alexandriasoftware.swing.JSplitButton.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_itemListeners] = new PropertyDescriptor ( "itemListeners", com.alexandriasoftware.swing.JSplitButton.class, "getItemListeners", null ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", com.alexandriasoftware.swing.JSplitButton.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_label] = new PropertyDescriptor ( "label", com.alexandriasoftware.swing.JSplitButton.class, "getLabel", "setLabel" ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", com.alexandriasoftware.swing.JSplitButton.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", com.alexandriasoftware.swing.JSplitButton.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", com.alexandriasoftware.swing.JSplitButton.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", com.alexandriasoftware.swing.JSplitButton.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", com.alexandriasoftware.swing.JSplitButton.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", com.alexandriasoftware.swing.JSplitButton.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_margin] = new PropertyDescriptor ( "margin", com.alexandriasoftware.swing.JSplitButton.class, "getMargin", "setMargin" ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", com.alexandriasoftware.swing.JSplitButton.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", com.alexandriasoftware.swing.JSplitButton.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", com.alexandriasoftware.swing.JSplitButton.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", com.alexandriasoftware.swing.JSplitButton.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_mnemonic] = new PropertyDescriptor ( "mnemonic", com.alexandriasoftware.swing.JSplitButton.class, null, "setMnemonic" ); // NOI18N
            properties[PROPERTY_model] = new PropertyDescriptor ( "model", com.alexandriasoftware.swing.JSplitButton.class, "getModel", "setModel" ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", com.alexandriasoftware.swing.JSplitButton.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", com.alexandriasoftware.swing.JSplitButton.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", com.alexandriasoftware.swing.JSplitButton.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", com.alexandriasoftware.swing.JSplitButton.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_multiClickThreshhold] = new PropertyDescriptor ( "multiClickThreshhold", com.alexandriasoftware.swing.JSplitButton.class, "getMultiClickThreshhold", "setMultiClickThreshhold" ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", com.alexandriasoftware.swing.JSplitButton.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", com.alexandriasoftware.swing.JSplitButton.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", com.alexandriasoftware.swing.JSplitButton.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", com.alexandriasoftware.swing.JSplitButton.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", com.alexandriasoftware.swing.JSplitButton.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", com.alexandriasoftware.swing.JSplitButton.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", com.alexandriasoftware.swing.JSplitButton.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", com.alexandriasoftware.swing.JSplitButton.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_popupMenu] = new PropertyDescriptor ( "popupMenu", com.alexandriasoftware.swing.JSplitButton.class, "getPopupMenu", "setPopupMenu" ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", com.alexandriasoftware.swing.JSplitButton.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", com.alexandriasoftware.swing.JSplitButton.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_pressedIcon] = new PropertyDescriptor ( "pressedIcon", com.alexandriasoftware.swing.JSplitButton.class, "getPressedIcon", "setPressedIcon" ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", com.alexandriasoftware.swing.JSplitButton.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", com.alexandriasoftware.swing.JSplitButton.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", com.alexandriasoftware.swing.JSplitButton.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_rolloverEnabled] = new PropertyDescriptor ( "rolloverEnabled", com.alexandriasoftware.swing.JSplitButton.class, "isRolloverEnabled", "setRolloverEnabled" ); // NOI18N
            properties[PROPERTY_rolloverIcon] = new PropertyDescriptor ( "rolloverIcon", com.alexandriasoftware.swing.JSplitButton.class, "getRolloverIcon", "setRolloverIcon" ); // NOI18N
            properties[PROPERTY_rolloverSelectedIcon] = new PropertyDescriptor ( "rolloverSelectedIcon", com.alexandriasoftware.swing.JSplitButton.class, "getRolloverSelectedIcon", "setRolloverSelectedIcon" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", com.alexandriasoftware.swing.JSplitButton.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_selected] = new PropertyDescriptor ( "selected", com.alexandriasoftware.swing.JSplitButton.class, "isSelected", "setSelected" ); // NOI18N
            properties[PROPERTY_selectedIcon] = new PropertyDescriptor ( "selectedIcon", com.alexandriasoftware.swing.JSplitButton.class, "getSelectedIcon", "setSelectedIcon" ); // NOI18N
            properties[PROPERTY_selectedObjects] = new PropertyDescriptor ( "selectedObjects", com.alexandriasoftware.swing.JSplitButton.class, "getSelectedObjects", null ); // NOI18N
            properties[PROPERTY_separatorSpacing] = new PropertyDescriptor ( "separatorSpacing", com.alexandriasoftware.swing.JSplitButton.class, "getSeparatorSpacing", "setSeparatorSpacing" ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", com.alexandriasoftware.swing.JSplitButton.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", com.alexandriasoftware.swing.JSplitButton.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_splitWidth] = new PropertyDescriptor ( "splitWidth", com.alexandriasoftware.swing.JSplitButton.class, "getSplitWidth", "setSplitWidth" ); // NOI18N
            properties[PROPERTY_text] = new PropertyDescriptor ( "text", com.alexandriasoftware.swing.JSplitButton.class, "getText", "setText" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", com.alexandriasoftware.swing.JSplitButton.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", com.alexandriasoftware.swing.JSplitButton.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", com.alexandriasoftware.swing.JSplitButton.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", com.alexandriasoftware.swing.JSplitButton.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", com.alexandriasoftware.swing.JSplitButton.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_UI] = new PropertyDescriptor ( "UI", com.alexandriasoftware.swing.JSplitButton.class, "getUI", "setUI" ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", com.alexandriasoftware.swing.JSplitButton.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", com.alexandriasoftware.swing.JSplitButton.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", com.alexandriasoftware.swing.JSplitButton.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", com.alexandriasoftware.swing.JSplitButton.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_verticalAlignment] = new PropertyDescriptor ( "verticalAlignment", com.alexandriasoftware.swing.JSplitButton.class, "getVerticalAlignment", "setVerticalAlignment" ); // NOI18N
            properties[PROPERTY_verticalTextPosition] = new PropertyDescriptor ( "verticalTextPosition", com.alexandriasoftware.swing.JSplitButton.class, "getVerticalTextPosition", "setVerticalTextPosition" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", com.alexandriasoftware.swing.JSplitButton.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", com.alexandriasoftware.swing.JSplitButton.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", com.alexandriasoftware.swing.JSplitButton.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", com.alexandriasoftware.swing.JSplitButton.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", com.alexandriasoftware.swing.JSplitButton.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", com.alexandriasoftware.swing.JSplitButton.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties

        // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_actionListener = 0;
    private static final int EVENT_ancestorListener = 1;
    private static final int EVENT_changeListener = 2;
    private static final int EVENT_componentListener = 3;
    private static final int EVENT_containerListener = 4;
    private static final int EVENT_focusListener = 5;
    private static final int EVENT_hierarchyBoundsListener = 6;
    private static final int EVENT_hierarchyListener = 7;
    private static final int EVENT_inputMethodListener = 8;
    private static final int EVENT_itemListener = 9;
    private static final int EVENT_keyListener = 10;
    private static final int EVENT_mouseListener = 11;
    private static final int EVENT_mouseMotionListener = 12;
    private static final int EVENT_mouseWheelListener = 13;
    private static final int EVENT_propertyChangeListener = 14;
    private static final int EVENT_splitButtonActionListener = 15;
    private static final int EVENT_vetoableChangeListener = 16;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[17];
    
        try {
            eventSets[EVENT_actionListener] = new EventSetDescriptor ( com.alexandriasoftware.swing.JSplitButton.class, "actionListener", java.awt.event.ActionListener.class, new String[] {"actionPerformed"}, "addActionListener", "removeActionListener" ); // NOI18N
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( com.alexandriasoftware.swing.JSplitButton.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_changeListener] = new EventSetDescriptor ( com.alexandriasoftware.swing.JSplitButton.class, "changeListener", javax.swing.event.ChangeListener.class, new String[] {"stateChanged"}, "addChangeListener", "removeChangeListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( com.alexandriasoftware.swing.JSplitButton.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( com.alexandriasoftware.swing.JSplitButton.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( com.alexandriasoftware.swing.JSplitButton.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( com.alexandriasoftware.swing.JSplitButton.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( com.alexandriasoftware.swing.JSplitButton.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( com.alexandriasoftware.swing.JSplitButton.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_itemListener] = new EventSetDescriptor ( com.alexandriasoftware.swing.JSplitButton.class, "itemListener", java.awt.event.ItemListener.class, new String[] {"itemStateChanged"}, "addItemListener", "removeItemListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( com.alexandriasoftware.swing.JSplitButton.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( com.alexandriasoftware.swing.JSplitButton.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( com.alexandriasoftware.swing.JSplitButton.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( com.alexandriasoftware.swing.JSplitButton.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( com.alexandriasoftware.swing.JSplitButton.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_splitButtonActionListener] = new EventSetDescriptor ( com.alexandriasoftware.swing.JSplitButton.class, "splitButtonActionListener", com.alexandriasoftware.swing.action.SplitButtonActionListener.class, new String[] {"buttonClicked", "splitButtonClicked"}, "addSplitButtonActionListener", "removeSplitButtonActionListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( com.alexandriasoftware.swing.JSplitButton.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Events

        // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_action0 = 0;
    private static final int METHOD_actionPerformed1 = 1;
    private static final int METHOD_add2 = 2;
    private static final int METHOD_add3 = 3;
    private static final int METHOD_add4 = 4;
    private static final int METHOD_add5 = 5;
    private static final int METHOD_add6 = 6;
    private static final int METHOD_add7 = 7;
    private static final int METHOD_addNotify8 = 8;
    private static final int METHOD_addPropertyChangeListener9 = 9;
    private static final int METHOD_applyComponentOrientation10 = 10;
    private static final int METHOD_areFocusTraversalKeysSet11 = 11;
    private static final int METHOD_bounds12 = 12;
    private static final int METHOD_checkImage13 = 13;
    private static final int METHOD_checkImage14 = 14;
    private static final int METHOD_computeVisibleRect15 = 15;
    private static final int METHOD_contains16 = 16;
    private static final int METHOD_contains17 = 17;
    private static final int METHOD_countComponents18 = 18;
    private static final int METHOD_createImage19 = 19;
    private static final int METHOD_createImage20 = 20;
    private static final int METHOD_createToolTip21 = 21;
    private static final int METHOD_createVolatileImage22 = 22;
    private static final int METHOD_createVolatileImage23 = 23;
    private static final int METHOD_deliverEvent24 = 24;
    private static final int METHOD_disable25 = 25;
    private static final int METHOD_dispatchEvent26 = 26;
    private static final int METHOD_doClick27 = 27;
    private static final int METHOD_doClick28 = 28;
    private static final int METHOD_doLayout29 = 29;
    private static final int METHOD_enable30 = 30;
    private static final int METHOD_enable31 = 31;
    private static final int METHOD_enableInputMethods32 = 32;
    private static final int METHOD_findComponentAt33 = 33;
    private static final int METHOD_findComponentAt34 = 34;
    private static final int METHOD_firePropertyChange35 = 35;
    private static final int METHOD_firePropertyChange36 = 36;
    private static final int METHOD_firePropertyChange37 = 37;
    private static final int METHOD_firePropertyChange38 = 38;
    private static final int METHOD_firePropertyChange39 = 39;
    private static final int METHOD_firePropertyChange40 = 40;
    private static final int METHOD_firePropertyChange41 = 41;
    private static final int METHOD_firePropertyChange42 = 42;
    private static final int METHOD_getActionForKeyStroke43 = 43;
    private static final int METHOD_getBaseline44 = 44;
    private static final int METHOD_getBounds45 = 45;
    private static final int METHOD_getClientProperty46 = 46;
    private static final int METHOD_getComponentAt47 = 47;
    private static final int METHOD_getComponentAt48 = 48;
    private static final int METHOD_getComponentZOrder49 = 49;
    private static final int METHOD_getConditionForKeyStroke50 = 50;
    private static final int METHOD_getDefaultLocale51 = 51;
    private static final int METHOD_getFocusTraversalKeys52 = 52;
    private static final int METHOD_getFontMetrics53 = 53;
    private static final int METHOD_getInsets54 = 54;
    private static final int METHOD_getListeners55 = 55;
    private static final int METHOD_getLocation56 = 56;
    private static final int METHOD_getMnemonic57 = 57;
    private static final int METHOD_getMousePosition58 = 58;
    private static final int METHOD_getPopupLocation59 = 59;
    private static final int METHOD_getPropertyChangeListeners60 = 60;
    private static final int METHOD_getSize61 = 61;
    private static final int METHOD_getToolTipLocation62 = 62;
    private static final int METHOD_getToolTipText63 = 63;
    private static final int METHOD_gotFocus64 = 64;
    private static final int METHOD_grabFocus65 = 65;
    private static final int METHOD_handleEvent66 = 66;
    private static final int METHOD_hasFocus67 = 67;
    private static final int METHOD_hide68 = 68;
    private static final int METHOD_imageUpdate69 = 69;
    private static final int METHOD_insets70 = 70;
    private static final int METHOD_inside71 = 71;
    private static final int METHOD_invalidate72 = 72;
    private static final int METHOD_isAncestorOf73 = 73;
    private static final int METHOD_isFocusCycleRoot74 = 74;
    private static final int METHOD_isLightweightComponent75 = 75;
    private static final int METHOD_keyDown76 = 76;
    private static final int METHOD_keyUp77 = 77;
    private static final int METHOD_layout78 = 78;
    private static final int METHOD_list79 = 79;
    private static final int METHOD_list80 = 80;
    private static final int METHOD_list81 = 81;
    private static final int METHOD_list82 = 82;
    private static final int METHOD_list83 = 83;
    private static final int METHOD_locate84 = 84;
    private static final int METHOD_location85 = 85;
    private static final int METHOD_lostFocus86 = 86;
    private static final int METHOD_minimumSize87 = 87;
    private static final int METHOD_mouseClicked88 = 88;
    private static final int METHOD_mouseDown89 = 89;
    private static final int METHOD_mouseDrag90 = 90;
    private static final int METHOD_mouseDragged91 = 91;
    private static final int METHOD_mouseEnter92 = 92;
    private static final int METHOD_mouseEntered93 = 93;
    private static final int METHOD_mouseExit94 = 94;
    private static final int METHOD_mouseExited95 = 95;
    private static final int METHOD_mouseMove96 = 96;
    private static final int METHOD_mouseMoved97 = 97;
    private static final int METHOD_mousePressed98 = 98;
    private static final int METHOD_mouseReleased99 = 99;
    private static final int METHOD_mouseUp100 = 100;
    private static final int METHOD_move101 = 101;
    private static final int METHOD_nextFocus102 = 102;
    private static final int METHOD_paint103 = 103;
    private static final int METHOD_paintAll104 = 104;
    private static final int METHOD_paintComponents105 = 105;
    private static final int METHOD_paintImmediately106 = 106;
    private static final int METHOD_paintImmediately107 = 107;
    private static final int METHOD_postEvent108 = 108;
    private static final int METHOD_preferredSize109 = 109;
    private static final int METHOD_prepareImage110 = 110;
    private static final int METHOD_prepareImage111 = 111;
    private static final int METHOD_print112 = 112;
    private static final int METHOD_printAll113 = 113;
    private static final int METHOD_printComponents114 = 114;
    private static final int METHOD_putClientProperty115 = 115;
    private static final int METHOD_registerKeyboardAction116 = 116;
    private static final int METHOD_registerKeyboardAction117 = 117;
    private static final int METHOD_remove118 = 118;
    private static final int METHOD_remove119 = 119;
    private static final int METHOD_remove120 = 120;
    private static final int METHOD_removeAll121 = 121;
    private static final int METHOD_removeNotify122 = 122;
    private static final int METHOD_removePropertyChangeListener123 = 123;
    private static final int METHOD_repaint124 = 124;
    private static final int METHOD_repaint125 = 125;
    private static final int METHOD_repaint126 = 126;
    private static final int METHOD_repaint127 = 127;
    private static final int METHOD_repaint128 = 128;
    private static final int METHOD_requestDefaultFocus129 = 129;
    private static final int METHOD_requestFocus130 = 130;
    private static final int METHOD_requestFocus131 = 131;
    private static final int METHOD_requestFocusInWindow132 = 132;
    private static final int METHOD_resetKeyboardActions133 = 133;
    private static final int METHOD_reshape134 = 134;
    private static final int METHOD_resize135 = 135;
    private static final int METHOD_resize136 = 136;
    private static final int METHOD_revalidate137 = 137;
    private static final int METHOD_scrollRectToVisible138 = 138;
    private static final int METHOD_setBounds139 = 139;
    private static final int METHOD_setComponentZOrder140 = 140;
    private static final int METHOD_setDefaultLocale141 = 141;
    private static final int METHOD_setMnemonic142 = 142;
    private static final int METHOD_show143 = 143;
    private static final int METHOD_show144 = 144;
    private static final int METHOD_size145 = 145;
    private static final int METHOD_toString146 = 146;
    private static final int METHOD_transferFocus147 = 147;
    private static final int METHOD_transferFocusBackward148 = 148;
    private static final int METHOD_transferFocusDownCycle149 = 149;
    private static final int METHOD_transferFocusUpCycle150 = 150;
    private static final int METHOD_unregisterKeyboardAction151 = 151;
    private static final int METHOD_update152 = 152;
    private static final int METHOD_updateUI153 = 153;
    private static final int METHOD_validate154 = 154;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[155];
    
        try {
            methods[METHOD_action0] = new MethodDescriptor(java.awt.Component.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_action0].setDisplayName ( "" );
            methods[METHOD_actionPerformed1] = new MethodDescriptor(com.alexandriasoftware.swing.JSplitButton.class.getMethod("actionPerformed", new Class[] {java.awt.event.ActionEvent.class})); // NOI18N
            methods[METHOD_actionPerformed1].setDisplayName ( "" );
            methods[METHOD_add2] = new MethodDescriptor(java.awt.Component.class.getMethod("add", new Class[] {java.awt.PopupMenu.class})); // NOI18N
            methods[METHOD_add2].setDisplayName ( "" );
            methods[METHOD_add3] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_add3].setDisplayName ( "" );
            methods[METHOD_add4] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.lang.String.class, java.awt.Component.class})); // NOI18N
            methods[METHOD_add4].setDisplayName ( "" );
            methods[METHOD_add5] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_add5].setDisplayName ( "" );
            methods[METHOD_add6] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_add6].setDisplayName ( "" );
            methods[METHOD_add7] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class, int.class})); // NOI18N
            methods[METHOD_add7].setDisplayName ( "" );
            methods[METHOD_addNotify8] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify8].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener9] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener9].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation10] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation10].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet11] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet11].setDisplayName ( "" );
            methods[METHOD_bounds12] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds12].setDisplayName ( "" );
            methods[METHOD_checkImage13] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage13].setDisplayName ( "" );
            methods[METHOD_checkImage14] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage14].setDisplayName ( "" );
            methods[METHOD_computeVisibleRect15] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_computeVisibleRect15].setDisplayName ( "" );
            methods[METHOD_contains16] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains16].setDisplayName ( "" );
            methods[METHOD_contains17] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains17].setDisplayName ( "" );
            methods[METHOD_countComponents18] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents18].setDisplayName ( "" );
            methods[METHOD_createImage19] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage19].setDisplayName ( "" );
            methods[METHOD_createImage20] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage20].setDisplayName ( "" );
            methods[METHOD_createToolTip21] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {})); // NOI18N
            methods[METHOD_createToolTip21].setDisplayName ( "" );
            methods[METHOD_createVolatileImage22] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage22].setDisplayName ( "" );
            methods[METHOD_createVolatileImage23] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage23].setDisplayName ( "" );
            methods[METHOD_deliverEvent24] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent24].setDisplayName ( "" );
            methods[METHOD_disable25] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable25].setDisplayName ( "" );
            methods[METHOD_dispatchEvent26] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent26].setDisplayName ( "" );
            methods[METHOD_doClick27] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("doClick", new Class[] {})); // NOI18N
            methods[METHOD_doClick27].setDisplayName ( "" );
            methods[METHOD_doClick28] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("doClick", new Class[] {int.class})); // NOI18N
            methods[METHOD_doClick28].setDisplayName ( "" );
            methods[METHOD_doLayout29] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout29].setDisplayName ( "" );
            methods[METHOD_enable30] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable30].setDisplayName ( "" );
            methods[METHOD_enable31] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable31].setDisplayName ( "" );
            methods[METHOD_enableInputMethods32] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods32].setDisplayName ( "" );
            methods[METHOD_findComponentAt33] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt33].setDisplayName ( "" );
            methods[METHOD_findComponentAt34] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt34].setDisplayName ( "" );
            methods[METHOD_firePropertyChange35] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange35].setDisplayName ( "" );
            methods[METHOD_firePropertyChange36] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange36].setDisplayName ( "" );
            methods[METHOD_firePropertyChange37] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange37].setDisplayName ( "" );
            methods[METHOD_firePropertyChange38] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange38].setDisplayName ( "" );
            methods[METHOD_firePropertyChange39] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange39].setDisplayName ( "" );
            methods[METHOD_firePropertyChange40] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_firePropertyChange40].setDisplayName ( "" );
            methods[METHOD_firePropertyChange41] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, int.class, int.class})); // NOI18N
            methods[METHOD_firePropertyChange41].setDisplayName ( "" );
            methods[METHOD_firePropertyChange42] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange42].setDisplayName ( "" );
            methods[METHOD_getActionForKeyStroke43] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getActionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getActionForKeyStroke43].setDisplayName ( "" );
            methods[METHOD_getBaseline44] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline44].setDisplayName ( "" );
            methods[METHOD_getBounds45] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds45].setDisplayName ( "" );
            methods[METHOD_getClientProperty46] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getClientProperty46].setDisplayName ( "" );
            methods[METHOD_getComponentAt47] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt47].setDisplayName ( "" );
            methods[METHOD_getComponentAt48] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt48].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder49] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder49].setDisplayName ( "" );
            methods[METHOD_getConditionForKeyStroke50] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getConditionForKeyStroke50].setDisplayName ( "" );
            methods[METHOD_getDefaultLocale51] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getDefaultLocale", new Class[] {})); // NOI18N
            methods[METHOD_getDefaultLocale51].setDisplayName ( "" );
            methods[METHOD_getFocusTraversalKeys52] = new MethodDescriptor(java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] {int.class})); // NOI18N
            methods[METHOD_getFocusTraversalKeys52].setDisplayName ( "" );
            methods[METHOD_getFontMetrics53] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics53].setDisplayName ( "" );
            methods[METHOD_getInsets54] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets54].setDisplayName ( "" );
            methods[METHOD_getListeners55] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners55].setDisplayName ( "" );
            methods[METHOD_getLocation56] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation56].setDisplayName ( "" );
            methods[METHOD_getMnemonic57] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("getMnemonic", new Class[] {})); // NOI18N
            methods[METHOD_getMnemonic57].setDisplayName ( "" );
            methods[METHOD_getMousePosition58] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition58].setDisplayName ( "" );
            methods[METHOD_getPopupLocation59] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation59].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners60] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners60].setDisplayName ( "" );
            methods[METHOD_getSize61] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize61].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation62] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation62].setDisplayName ( "" );
            methods[METHOD_getToolTipText63] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText63].setDisplayName ( "" );
            methods[METHOD_gotFocus64] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus64].setDisplayName ( "" );
            methods[METHOD_grabFocus65] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus65].setDisplayName ( "" );
            methods[METHOD_handleEvent66] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent66].setDisplayName ( "" );
            methods[METHOD_hasFocus67] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus67].setDisplayName ( "" );
            methods[METHOD_hide68] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide68].setDisplayName ( "" );
            methods[METHOD_imageUpdate69] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate69].setDisplayName ( "" );
            methods[METHOD_insets70] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets70].setDisplayName ( "" );
            methods[METHOD_inside71] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside71].setDisplayName ( "" );
            methods[METHOD_invalidate72] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate72].setDisplayName ( "" );
            methods[METHOD_isAncestorOf73] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf73].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot74] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot74].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent75] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent75].setDisplayName ( "" );
            methods[METHOD_keyDown76] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown76].setDisplayName ( "" );
            methods[METHOD_keyUp77] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp77].setDisplayName ( "" );
            methods[METHOD_layout78] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout78].setDisplayName ( "" );
            methods[METHOD_list79] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list79].setDisplayName ( "" );
            methods[METHOD_list80] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list80].setDisplayName ( "" );
            methods[METHOD_list81] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list81].setDisplayName ( "" );
            methods[METHOD_list82] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list82].setDisplayName ( "" );
            methods[METHOD_list83] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list83].setDisplayName ( "" );
            methods[METHOD_locate84] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate84].setDisplayName ( "" );
            methods[METHOD_location85] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location85].setDisplayName ( "" );
            methods[METHOD_lostFocus86] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus86].setDisplayName ( "" );
            methods[METHOD_minimumSize87] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize87].setDisplayName ( "" );
            methods[METHOD_mouseClicked88] = new MethodDescriptor(com.alexandriasoftware.swing.JSplitButton.class.getMethod("mouseClicked", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_mouseClicked88].setDisplayName ( "" );
            methods[METHOD_mouseDown89] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown89].setDisplayName ( "" );
            methods[METHOD_mouseDrag90] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag90].setDisplayName ( "" );
            methods[METHOD_mouseDragged91] = new MethodDescriptor(com.alexandriasoftware.swing.JSplitButton.class.getMethod("mouseDragged", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_mouseDragged91].setDisplayName ( "" );
            methods[METHOD_mouseEnter92] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter92].setDisplayName ( "" );
            methods[METHOD_mouseEntered93] = new MethodDescriptor(com.alexandriasoftware.swing.JSplitButton.class.getMethod("mouseEntered", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_mouseEntered93].setDisplayName ( "" );
            methods[METHOD_mouseExit94] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit94].setDisplayName ( "" );
            methods[METHOD_mouseExited95] = new MethodDescriptor(com.alexandriasoftware.swing.JSplitButton.class.getMethod("mouseExited", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_mouseExited95].setDisplayName ( "" );
            methods[METHOD_mouseMove96] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove96].setDisplayName ( "" );
            methods[METHOD_mouseMoved97] = new MethodDescriptor(com.alexandriasoftware.swing.JSplitButton.class.getMethod("mouseMoved", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_mouseMoved97].setDisplayName ( "" );
            methods[METHOD_mousePressed98] = new MethodDescriptor(com.alexandriasoftware.swing.JSplitButton.class.getMethod("mousePressed", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_mousePressed98].setDisplayName ( "" );
            methods[METHOD_mouseReleased99] = new MethodDescriptor(com.alexandriasoftware.swing.JSplitButton.class.getMethod("mouseReleased", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_mouseReleased99].setDisplayName ( "" );
            methods[METHOD_mouseUp100] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp100].setDisplayName ( "" );
            methods[METHOD_move101] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move101].setDisplayName ( "" );
            methods[METHOD_nextFocus102] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus102].setDisplayName ( "" );
            methods[METHOD_paint103] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint103].setDisplayName ( "" );
            methods[METHOD_paintAll104] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll104].setDisplayName ( "" );
            methods[METHOD_paintComponents105] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents105].setDisplayName ( "" );
            methods[METHOD_paintImmediately106] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately106].setDisplayName ( "" );
            methods[METHOD_paintImmediately107] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately107].setDisplayName ( "" );
            methods[METHOD_postEvent108] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent108].setDisplayName ( "" );
            methods[METHOD_preferredSize109] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize109].setDisplayName ( "" );
            methods[METHOD_prepareImage110] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage110].setDisplayName ( "" );
            methods[METHOD_prepareImage111] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage111].setDisplayName ( "" );
            methods[METHOD_print112] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print112].setDisplayName ( "" );
            methods[METHOD_printAll113] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll113].setDisplayName ( "" );
            methods[METHOD_printComponents114] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents114].setDisplayName ( "" );
            methods[METHOD_putClientProperty115] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty115].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction116] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction116].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction117] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction117].setDisplayName ( "" );
            methods[METHOD_remove118] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove118].setDisplayName ( "" );
            methods[METHOD_remove119] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove119].setDisplayName ( "" );
            methods[METHOD_remove120] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove120].setDisplayName ( "" );
            methods[METHOD_removeAll121] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll121].setDisplayName ( "" );
            methods[METHOD_removeNotify122] = new MethodDescriptor(javax.swing.JButton.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify122].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener123] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener123].setDisplayName ( "" );
            methods[METHOD_repaint124] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint124].setDisplayName ( "" );
            methods[METHOD_repaint125] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint125].setDisplayName ( "" );
            methods[METHOD_repaint126] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint126].setDisplayName ( "" );
            methods[METHOD_repaint127] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint127].setDisplayName ( "" );
            methods[METHOD_repaint128] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint128].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus129] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus129].setDisplayName ( "" );
            methods[METHOD_requestFocus130] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus130].setDisplayName ( "" );
            methods[METHOD_requestFocus131] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus131].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow132] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow132].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions133] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions133].setDisplayName ( "" );
            methods[METHOD_reshape134] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape134].setDisplayName ( "" );
            methods[METHOD_resize135] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize135].setDisplayName ( "" );
            methods[METHOD_resize136] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize136].setDisplayName ( "" );
            methods[METHOD_revalidate137] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate137].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible138] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible138].setDisplayName ( "" );
            methods[METHOD_setBounds139] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds139].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder140] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder140].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale141] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale141].setDisplayName ( "" );
            methods[METHOD_setMnemonic142] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("setMnemonic", new Class[] {int.class})); // NOI18N
            methods[METHOD_setMnemonic142].setDisplayName ( "" );
            methods[METHOD_show143] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show143].setDisplayName ( "" );
            methods[METHOD_show144] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show144].setDisplayName ( "" );
            methods[METHOD_size145] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size145].setDisplayName ( "" );
            methods[METHOD_toString146] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString146].setDisplayName ( "" );
            methods[METHOD_transferFocus147] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus147].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward148] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward148].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle149] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle149].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle150] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle150].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction151] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction151].setDisplayName ( "" );
            methods[METHOD_update152] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update152].setDisplayName ( "" );
            methods[METHOD_updateUI153] = new MethodDescriptor(javax.swing.JButton.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI153].setDisplayName ( "" );
            methods[METHOD_validate154] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate154].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods

        // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = "/com/alexandriasoftware/swing/splitbutton_16.png";//GEN-BEGIN:Icons
    private static String iconNameC32 = "/com/alexandriasoftware/swing/splitbutton_32.png";
    private static String iconNameM16 = null;
    private static String iconNameM32 = null;//GEN-END:Icons

    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx


//GEN-FIRST:Superclass
    // Here you can add code for customizing the Superclass BeanInfo.

//GEN-LAST:Superclass
    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable properties of this bean.
     *         May return null if the information should be obtained by
     *         automatic analysis.
     */
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
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
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
    public int getDefaultEventIndex() {
        return defaultEventIndex;
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
    public java.awt.Image getIcon(int iconKind) {
        switch (iconKind) {
            case ICON_COLOR_16x16:
                return Toolkit.getDefaultToolkit().createImage(JSplitButtonBeanInfo.class.getResource("resources/splitbutton_16.png"));
            /*
             * if ( iconNameC16 == null ) return null; else { if( iconColor16 ==
             * null ) iconColor16 = loadImage( iconNameC16 ); return
             * iconColor16;
            }
             */
            case ICON_COLOR_32x32:
                return Toolkit.getDefaultToolkit().createImage(JSplitButtonBeanInfo.class.getResource("resources/splitbutton_32.png"));
//            if ( iconNameC32 == null )
//                return null;
//            else {
//                if( iconColor32 == null )
//                    iconColor32 = loadImage( iconNameC32 );
//                return iconColor32;
//            }
            case ICON_MONO_16x16:
                if (iconNameM16 == null) {
                    return null;
                } else {
                    if (iconMono16 == null) {
                        iconMono16 = loadImage(iconNameM16);
                    }
                    return iconMono16;
                }
            case ICON_MONO_32x32:
                if (iconNameM32 == null) {
                    return null;
                } else {
                    if (iconMono32 == null) {
                        iconMono32 = loadImage(iconNameM32);
                    }
                    return iconMono32;
                }
            default:
                return null;
        }
    }

}
