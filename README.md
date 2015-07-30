# jsplitbutton
Automatically exported from code.google.com/p/jsplitbutton

A simple implementation of the split button control in Java. This control raises two events.

    buttonClicked(e)
    splitButtonClicked(e) 

The buttonClicked event is raised when the button is clicked, the left part, which will not trigger the dropdown menu. Whereas the splitButtonClicked event is raised when the split part of the button is clicked and displays a popup menu.

To handle these events you need to subscribe to SplitButtonActionListener.

See also http://naveedmurtuza.blogspot.ch/2010/11/jsplitbutton.html

Checkout Swing Components for more swing controls 

##Screenshots 

![alt tag](https://raw.github.com/akuhtz/jsplitbutton/master/wiki/images/JSplitButton-GTK.png)

![alt tag](https://raw.github.com/akuhtz/jsplitbutton/master/wiki/images/JSplitButton-Nimbus.png)

![alt tag](https://raw.github.com/akuhtz/jsplitbutton/master/wiki/images/JSplitButton-Metal.png)

##Using the Control:

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
