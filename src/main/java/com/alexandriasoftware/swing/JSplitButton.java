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
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.Serializable;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JPopupMenu;
import javax.swing.UIManager;

/**
 * An implementation of a "split" button.The left side acts like a normal
 * button, right side has a jPopupMenu attached.
 *
 * This class raises two events:
 * <ol>
 * <li>{@link com.alexandriasoftware.swing.action.SplitButtonActionListener#buttonClicked(java.awt.event.ActionEvent)}
 * when the button is clicked</li>
 * <li>{@link com.alexandriasoftware.swing.action.SplitButtonActionListener#splitButtonClicked(java.awt.event.ActionEvent)}
 * when the split part of the button is clicked</li>
 * </ol>
 * You need to implement
 * {@link com.alexandriasoftware.swing.action.SplitButtonActionListener} to
 * handle these events.
 *
 * @author Naveed Quadri 2012
 * @author Randall Wood 2016
 */
public class JSplitButton extends JButton implements Serializable {

    /**
     * Key used for serialization.
     */
    private static final long serialVersionUID = 1L;

    private int separatorSpacing = 4;
    private int splitWidth = 22;
    private int arrowSize = 8;
    private boolean onSplit = false;
    private Rectangle splitRectangle = new Rectangle();
    private JPopupMenu popupMenu;
    private boolean alwaysPopup;
    private Color arrowColor = Color.BLACK;
    private Color disabledArrowColor = Color.GRAY;
    private Image image;
    private Image disabledImage;
    private final Listener listener;

    /**
     * Creates a button with initial text and an icon.
     *
     * @param text the text of the button
     * @param icon the Icon image to display on the button
     */
    public JSplitButton(final String text, final Icon icon) {
        super(text, icon);
        this.listener = new Listener();
        super.addMouseMotionListener(this.listener);
        super.addMouseListener(this.listener);
        super.addActionListener(this.listener);
    }

    /**
     * Creates a button with text.
     *
     * @param text the text of the button
     */
    public JSplitButton(final String text) {
        this(text, null);
    }

    /**
     * Creates a button with an icon.
     *
     * @param icon the Icon image to display on the button
     */
    public JSplitButton(final Icon icon) {
        this(null, icon);
    }

    /**
     * Creates a button with no set text or icon.
     */
    public JSplitButton() {
        this(null, null);
    }

    /**
     * Returns the JPopupMenu if set, null otherwise.
     *
     * @return JPopupMenu
     */
    public JPopupMenu getPopupMenu() {
        return popupMenu;
    }

    /**
     * Sets the JPopupMenu to be displayed, when the split part of the button is
     * clicked.
     *
     * @param popupMenu the menu to display
     */
    public void setPopupMenu(final JPopupMenu popupMenu) {
        this.popupMenu = popupMenu;
        image = null; //to repaint the arrow image
    }

    /**
     * Returns the separatorSpacing. Separator spacing is the space above and
     * below the separator (the line drawn when you hover your mouse over the
     * split part of the button).
     *
     * @return the spacing
     */
    public int getSeparatorSpacing() {
        return separatorSpacing;
    }

    /**
     * Sets the separatorSpacing. Separator spacing is the space above and below
     * the separator (the line drawn when you hover your mouse over the split
     * part of the button).
     *
     * @param separatorSpacing the spacing
     */
    public void setSeparatorSpacing(final int separatorSpacing) {
        this.separatorSpacing = separatorSpacing;
    }

    /**
     * Show the popup menu, if attached, even if the button part is clicked.
     *
     * @return true if alwaysPopup, false otherwise.
     */
    public boolean isAlwaysPopup() {
        return alwaysPopup;
    }

    /**
     * Show the popup menu, if attached, even if the button part is clicked.
     *
     * @param alwaysPopup true to show the attached JPopupMenu even if the
     *                    button part is clicked, false otherwise
     */
    public void setAlwaysPopup(final boolean alwaysPopup) {
        this.alwaysPopup = alwaysPopup;
    }

    /**
     * Show the dropdown menu, if attached, even if the button part is clicked.
     *
     * @return true if alwaysDropdown, false otherwise.
     * @deprecated use {@link #isAlwaysPopup() } instead.
     */
    @Deprecated
    public boolean isAlwaysDropDown() {
        return alwaysPopup;
    }

    /**
     * Show the dropdown menu, if attached, even if the button part is clicked.
     *
     * @param alwaysDropDown true to show the attached dropdown even if the
     *                       button part is clicked, false otherwise
     * @deprecated use {@link #setAlwaysPopup(boolean) } instead.
     */
    @Deprecated
    public void setAlwaysDropDown(final boolean alwaysDropDown) {
        this.alwaysPopup = alwaysDropDown;
    }

    /**
     * Gets the color of the arrow.
     *
     * @return the color of the arrow
     */
    public Color getArrowColor() {
        return arrowColor;
    }

    /**
     * Set the arrow color.
     *
     * @param arrowColor the color of the arrow
     */
    public void setArrowColor(final Color arrowColor) {
        this.arrowColor = arrowColor;
        image = null; // to repaint the image with the new color
    }

    /**
     * Gets the disabled arrow color.
     *
     * @return color of the arrow if no popup menu is attached.
     */
    public Color getDisabledArrowColor() {
        return disabledArrowColor;
    }

    /**
     * Sets the disabled arrow color.
     *
     * @param disabledArrowColor color of the arrow if no popup menu is
     *                           attached.
     */
    public void setDisabledArrowColor(final Color disabledArrowColor) {
        this.disabledArrowColor = disabledArrowColor;
        image = null; //to repaint the image with the new color
    }

    /**
     * Splitwidth is the width of the split part of the button.
     *
     * @return the width of the split
     */
    public int getSplitWidth() {
        return splitWidth;
    }

    /**
     * Splitwidth is the width of the split part of the button.
     *
     * @param splitWidth the width of the split
     */
    public void setSplitWidth(final int splitWidth) {
        this.splitWidth = splitWidth;
    }

    /**
     * Gets the size of the arrow.
     *
     * @return size of the arrow
     */
    public int getArrowSize() {
        return arrowSize;
    }

    /**
     * Sets the size of the arrow.
     *
     * @param arrowSize the size of the arrow
     */
    public void setArrowSize(final int arrowSize) {
        this.arrowSize = arrowSize;
        image = null; //to repaint the image with the new size
    }

    /**
     * Gets the image to be drawn in the split part. If no is set, a new image
     * is created with the triangle.
     *
     * @return image
     */
    public Image getImage() {
        if (image != null) {
            return image;
        } else if (popupMenu == null) {
            return this.getDisabledImage();
        } else {
            image = this.getImage(this.arrowSize, this.arrowColor);
            return image;
        }
    }

    /**
     * Sets the image to draw instead of the triangle.
     *
     * @param image the image
     */
    public void setImage(final Image image) {
        this.image = image;
    }

    /**
     * Gets the disabled image to be drawn in the split part. If no is set, a
     * new image is created with the triangle.
     *
     * @return image
     */
    public Image getDisabledImage() {
        if (disabledImage != null) {
            return disabledImage;
        } else {
            disabledImage = this.getImage(this.arrowSize, this.disabledArrowColor);
            return disabledImage;
        }
    }

    /**
     * Draws the default arrow image in the specified color.
     *
     * @param color
     * @return image
     */
    private Image getImage(final int size, final Color color) {
        Graphics2D g;
        BufferedImage img = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
        g = img.createGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, img.getWidth(), img.getHeight());
        g.setColor(color);
        // this creates a triangle facing right >
        g.fillPolygon(new int[]{0, 0, size / 2}, new int[]{0, size, size / 2}, 3);
        g.dispose();
        // rotate it to face downwards
        img = rotate(img, 90);
        BufferedImage dimg = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);
        g = dimg.createGraphics();
        g.setComposite(AlphaComposite.Src);
        g.drawImage(img, null, 0, 0);
        g.dispose();
        for (int i = 0; i < dimg.getHeight(); i++) {
            for (int j = 0; j < dimg.getWidth(); j++) {
                if (dimg.getRGB(j, i) == Color.WHITE.getRGB()) {
                    dimg.setRGB(j, i, 0x8F1C1C);
                }
            }
        }

        return Toolkit.getDefaultToolkit().createImage(dimg.getSource());
    }

    /**
     * Sets the disabled image to draw instead of the triangle.
     *
     * @param image the new image to use
     */
    public void setDisabledImage(final Image image) {
        this.disabledImage = image;
    }

    @Override
    protected void paintComponent(final Graphics g) {
        super.paintComponent(g);
        Color oldColor = g.getColor();
        splitRectangle = new Rectangle(getWidth() - splitWidth, 0, splitWidth, getHeight());
        g.translate(splitRectangle.x, splitRectangle.y);
        int mh = getHeight() / 2;
        int mw = splitWidth / 2;
        g.drawImage((isEnabled() ? getImage() : getDisabledImage()), mw - arrowSize / 2, mh + 2 - arrowSize / 2, null);
        if (onSplit && !alwaysPopup && popupMenu != null) {
            g.setColor(UIManager.getLookAndFeelDefaults().getColor("Button.background"));
            g.drawLine(1, separatorSpacing + 2, 1, getHeight() - separatorSpacing - 2);
            g.setColor(UIManager.getLookAndFeelDefaults().getColor("Button.shadow"));
            g.drawLine(2, separatorSpacing + 2, 2, getHeight() - separatorSpacing - 2);
        }
        g.setColor(oldColor);
        g.translate(-splitRectangle.x, -splitRectangle.y);
    }

    /**
     * Rotates the given image with the specified angle.
     *
     * @param img   image to rotate
     * @param angle angle of rotation
     * @return rotated image
     */
    private BufferedImage rotate(final BufferedImage img, final int angle) {
        int w = img.getWidth();
        int h = img.getHeight();
        BufferedImage dimg = new BufferedImage(w, h, img.getType());
        Graphics2D g = dimg.createGraphics();
        g.rotate(Math.toRadians(angle), w / 2, h / 2);
        g.drawImage(img, null, 0, 0);
        return dimg;
    }

    /**
     * Adds an <code>SplitButtonActionListener</code> to the button.
     *
     * @param l the <code>ActionListener</code> to be added
     * @deprecated Use
     * {@link #addButtonClickedActionListener(com.alexandriasoftware.swing.action.ButtonClickedActionListener)}
     * or
     * {@link #addSplitButtonClickedActionListener(com.alexandriasoftware.swing.action.SplitButtonClickedActionListener)}
     * instead.
     */
    @Deprecated
    public void addSplitButtonActionListener(final SplitButtonActionListener l) {
        listenerList.add(SplitButtonActionListener.class, l);
    }

    /**
     * Removes an <code>SplitButtonActionListener</code> from the button. If the
     * listener is the currently set <code>Action</code> for the button, then
     * the <code>Action</code> is set to <code>null</code>.
     *
     * @param l the listener to be removed
     * @deprecated Use
     * {@link #removeButtonClickedActionListener(com.alexandriasoftware.swing.action.ButtonClickedActionListener)}
     * or
     * {@link #removeSplitButtonClickedActionListener(com.alexandriasoftware.swing.action.SplitButtonClickedActionListener)}
     * instead.
     */
    @Deprecated
    public void removeSplitButtonActionListener(final SplitButtonActionListener l) {
        if ((l != null) && (getAction() == l)) {
            setAction(null);
        } else {
            listenerList.remove(SplitButtonActionListener.class, l);
        }
    }

    /**
     * Add a
     * {@link com.alexandriasoftware.swing.action.ButtonClickedActionListener}
     * to the button. This listener will be notified whenever the button part is
     * clicked.
     *
     * @param l the listener to add.
     */
    public void addButtonClickedActionListener(final ButtonClickedActionListener l) {
        listenerList.add(ButtonClickedActionListener.class, l);
    }

    /**
     * Remove a
     * {@link com.alexandriasoftware.swing.action.ButtonClickedActionListener}
     * from the button.
     *
     * @param l the listener to remove.
     */
    public void removeButtonClickedActionListener(final ButtonClickedActionListener l) {
        listenerList.remove(ButtonClickedActionListener.class, l);
    }

    /**
     * Add a
     * {@link com.alexandriasoftware.swing.action.SplitButtonClickedActionListener}
     * to the button. This listener will be notified whenever the split part is
     * clicked.
     *
     * @param l the listener to add.
     */
    public void addSplitButtonClickedActionListener(final SplitButtonClickedActionListener l) {
        listenerList.add(SplitButtonClickedActionListener.class, l);
    }

    /**
     * Remove a
     * {@link com.alexandriasoftware.swing.action.SplitButtonClickedActionListener}
     * from the button.
     *
     * @param l the listener to remove.
     */
    public void removeSplitButtonClickedActionListener(final SplitButtonClickedActionListener l) {
        listenerList.remove(SplitButtonClickedActionListener.class, l);
    }

    /**
     * Notifies all listeners that have registered interest for notification on
     * this event type. The event instance is lazily created using the
     * <code>event</code> parameter.
     *
     * @param event the <code>ActionEvent</code> object
     * @see EventListenerList
     */
    private void fireButtonClicked(final ActionEvent event) {
        // Guaranteed to return a non-null array
        SplitButtonActionListener[] splitButtonListeners = listenerList.getListeners(SplitButtonActionListener.class);
        ButtonClickedActionListener[] buttonClickedListeners = listenerList.getListeners(ButtonClickedActionListener.class);
        if (splitButtonListeners.length != 0 || buttonClickedListeners.length != 0) {
            String actionCommand = event.getActionCommand();
            if (actionCommand == null) {
                actionCommand = getActionCommand();
            }
            ActionEvent e = new ActionEvent(JSplitButton.this,
                    ActionEvent.ACTION_PERFORMED,
                    actionCommand,
                    event.getWhen(),
                    event.getModifiers());
            // Process the listeners last to first
            if (splitButtonListeners.length != 0) {
                for (int i = splitButtonListeners.length - 1; i >= 0; i--) {
                    splitButtonListeners[i].buttonClicked(e);
                }
            }
            if (buttonClickedListeners.length != 0) {
                for (int i = buttonClickedListeners.length - 1; i >= 0; i--) {
                    buttonClickedListeners[i].actionPerformed(e);
                }
            }
        }
    }

    /**
     * Notifies all listeners that have registered interest for notification on
     * this event type. The event instance is lazily created using the
     * <code>event</code> parameter.
     *
     * @param event the <code>ActionEvent</code> object
     * @see EventListenerList
     */
    private void fireSplitButtonClicked(final ActionEvent event) {
        // Guaranteed to return a non-null array
        SplitButtonActionListener[] splitButtonListeners = listenerList.getListeners(SplitButtonActionListener.class);
        SplitButtonClickedActionListener[] buttonClickedListeners = listenerList.getListeners(SplitButtonClickedActionListener.class);
        if (splitButtonListeners.length != 0 || buttonClickedListeners.length != 0) {
            String actionCommand = event.getActionCommand();
            if (actionCommand == null) {
                actionCommand = getActionCommand();
            }
            ActionEvent e = new ActionEvent(JSplitButton.this,
                    ActionEvent.ACTION_PERFORMED,
                    actionCommand,
                    event.getWhen(),
                    event.getModifiers());
            // Process the listeners last to first
            if (splitButtonListeners.length != 0) {
                for (int i = splitButtonListeners.length - 1; i >= 0; i--) {
                    splitButtonListeners[i].splitButtonClicked(e);
                }
            }
            if (buttonClickedListeners.length != 0) {
                for (int i = buttonClickedListeners.length - 1; i >= 0; i--) {
                    buttonClickedListeners[i].actionPerformed(e);
                }
            }
        }
    }

    /**
     * @return the listener
     */
    Listener getListener() {
        return listener;
    }

    /**
     * Listener for internal changes within the JSplitButton itself.
     *
     * Package private so its available to tests.
     */
    class Listener implements MouseMotionListener, MouseListener, ActionListener {

        @Override
        public void actionPerformed(final ActionEvent e) {
            if (popupMenu == null) {
                fireButtonClicked(e);
            } else if (alwaysPopup) {
                popupMenu.show(JSplitButton.this, getWidth() - (int) popupMenu.getPreferredSize().getWidth(), getHeight());
                fireButtonClicked(e);
            } else if (onSplit) {
                popupMenu.show(JSplitButton.this, getWidth() - (int) popupMenu.getPreferredSize().getWidth(), getHeight());
                fireSplitButtonClicked(e);
            } else {
                fireButtonClicked(e);
            }
        }

        @Override
        public void mouseExited(final MouseEvent e) {
            onSplit = false;
            repaint(splitRectangle);
        }

        @Override
        public void mouseMoved(final MouseEvent e) {
            onSplit = splitRectangle.contains(e.getPoint());
            repaint(splitRectangle);
        }

        // <editor-fold defaultstate="collapsed" desc="Unused Listeners">
        @Override
        public void mouseDragged(final MouseEvent e) {
        }

        @Override
        public void mouseClicked(final MouseEvent e) {
        }

        @Override
        public void mousePressed(final MouseEvent e) {
        }

        @Override
        public void mouseReleased(final MouseEvent e) {
        }

        @Override
        public void mouseEntered(final MouseEvent e) {
        }
        // </editor-fold>
    }
}
