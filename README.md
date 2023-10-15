JSplitButton
============

A split button control for Java Swing.

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.alexandriasoftware.swing/jsplitbutton/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.alexandriasoftware.swing/jsplitbutton)
[![Javadocs](https://www.javadoc.io/badge/com.alexandriasoftware.swing/jsplitbutton.svg)](https://www.javadoc.io/doc/com.alexandriasoftware.swing/jsplitbutton)
[![Build](https://github.com/rhwood/jsplitbutton/actions/workflows/build.yml/badge.svg)](https://github.com/rhwood/jsplitbutton/actions/workflows/build.yml)
[![CodeQL](https://github.com/rhwood/jsplitbutton/actions/workflows/codeql-analysis.yml/badge.svg)](https://github.com/rhwood/jsplitbutton/actions/workflows/codeql-analysis.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=rhwood_jsplitbutton&metric=alert_status)](https://sonarcloud.io/dashboard?id=rhwood_jsplitbutton)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=rhwood_jsplitbutton&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=rhwood_jsplitbutton)
[![codecov](https://codecov.io/gh/rhwood/jsplitbutton/graph/badge.svg?token=gbIMA3aimP)](https://codecov.io/gh/rhwood/jsplitbutton)
A simple implementation of the split button control for Java Swing. This control raises two events:

* ```buttonClicked(ActionEvent e)```
* ```splitButtonClicked(ActionEvent e)```

The buttonClicked event is raised when the main, or left, part of the button is clicked, which will not trigger the popup menu.
The splitButtonClicked event is raised when the split, or right, part of the button is clicked and displays a popup menu.

To handle these events you need a listener that implements:

* ```SplitButtonActionListener``` to handle both events in a single listener
* ```ButtonClickedActionListener``` to handle just buttonClicked
* ```SplitButtonClickedActionListener``` to handle just splitButtonClicked

See also http://naveedmurtuza.blogspot.ch/2010/11/jsplitbutton.html

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
        System.out.println("Split Part Clicked");
    }
});
//add popup menu
splitButton.add(popupMenu);
//add this control to panel
panel.add(splitButton);
```

or (using Java 8 lambda expressions):

```java
//first instantiate the control
JSplitButton splitButton = new JSplitButton();
//register for button listener
splitButton.addButtonClickedActionListener((ActionEvent e) -> {
    System.out.println("Button Clicked");
});
//register for split button listener
splitButton.addSplitButtonClickedActionListener((ActionEvent e) -> {
    System.out.println("Split Part Clicked");
});
//add popup menu
splitButton.add(popupMenu);
//add this control to panel
panel.add(splitButton);
```

## Prior History

* [Original development](http://code.google.com/p/jsplitbutton) by Naveed Quadri in 2012
* [Updated](https://github.com/akuhtz/jsplitbutton) by [Andreas Kuhtz](https://github.com/akuhtz) in 2015
