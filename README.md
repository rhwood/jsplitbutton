# JSplitButton
A split button control for Java Swing.

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.alexandriasoftware.swing/jsplitbutton/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.alexandriasoftware.swing/jsplitbutton)
[![Javadocs](https://www.javadoc.io/badge/com.alexandriasoftware.swing/jsplitbutton.svg)](https://www.javadoc.io/doc/com.alexandriasoftware.swing/jsplitbutton)
[![Build Status](https://travis-ci.org/rhwood/jsplitbutton.svg?branch=master)](https://travis-ci.org/rhwood/jsplitbutton)

A simple implementation of the split button control for Java Swing. This control raises two events:

    buttonClicked(ActionEvent e)
    splitButtonClicked(ActionEvent e)

The buttonClicked event is raised when the main, or left, part of the button is clicked, which will not trigger the popup menu.
The splitButtonClicked event is raised when the split, or right, part of the button is clicked and displays a popup menu.

To handle these events you need to implement SplitButtonActionListener in your listener.

See also http://naveedmurtuza.blogspot.ch/2010/11/jsplitbutton.html

Checkout Swing Components for more swing controls

## Screenshots

![alt tag](https://raw.github.com/rhwood/jsplitbutton/master/wiki/images/JSplitButton-GTK.png)

![alt tag](https://raw.github.com/rhwood/jsplitbutton/master/wiki/images/JSplitButton-Nimbus.png)

![alt tag](https://raw.github.com/rhwood/jsplitbutton/master/wiki/images/JSplitButton-Metal.png)

## Using the Control

```java
//first instantiate the control
JSplitButton splitButton = new JSplitButton();
//register for listener
splitButton.addSplitButtonActionListener(new SplitButtonActionListener() {

            public void buttonClicked(ActionEvent e) {
System.out.println("Button Clicked");
            }

            public void splitButtonClicked(ActionEvent e) {
System.out.println("Split Part licked");
            }
        });
//add popup menu
splitButton.add(popupMenu);
//add this control to panel
panel.add(splitButton);
```

## Prior History

* [Original development](http://code.google.com/p/jsplitbutton) by Naveed Quadri in 2012
* [Updated](https://github.com/akuhtz/jsplitbutton) by [Andreas Kuhtz](https://github.com/akuhtz) in 2015
