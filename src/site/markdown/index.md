# About JSplitButton

A Split Button control for Java Swing.

[![JitPack](https://jitpack.io/v/rhwood/jsplitbutton.svg)](https://jitpack.io/#rhwood/jsplitbutton)
[![Javadocs](https://img.shields.io/badge/Javadocs-green)](https://jitpack.io/com/github/rhwood/jsplitbutton/latest/javadoc/)
[![Build](https://github.com/rhwood/jinputvalidator/actions/workflows/build.yml/badge.svg)](https://github.com/rhwood/jinputvalidator/actions/workflows/build.yml)
[![CodeQL](https://github.com/rhwood/jinputvalidator/actions/workflows/codeql-analysis.yml/badge.svg)](https://github.com/rhwood/jinputvalidator/actions/workflows/codeql-analysis.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=rhwood_jinputvalidator&metric=alert_status)](https://sonarcloud.io/dashboard?id=rhwood_jinputvalidator)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=rhwood_jinputvalidator&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=rhwood_jinputvalidator)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=rhwood_jinputvalidator&metric=coverage)](https://sonarcloud.io/dashboard?id=rhwood_jinputvalidator)

A simple implementation of the split button control for Java Swing. This control raises two events:

* __buttonClicked__
* __splitButtonClicked__

The buttonClicked event is raised when the main, or left, part of the button is clicked, which will not trigger the popup menu.
The splitButtonClicked event is raised when the split, or right, part of the button is clicked and displays a popup menu.

To handle these events you need a listener that implements:

* ```ButtonClickedActionListener``` to handle the buttonClicked event
* ```SplitButtonClickedActionListener``` to handle the splitButtonClicked event

See also http://naveedmurtuza.blogspot.ch/2010/11/jsplitbutton.html

## Screenshots

![alt tag](https://raw.github.com/rhwood/jsplitbutton/master/wiki/images/JSplitButton-GTK.png)

![alt tag](https://raw.github.com/rhwood/jsplitbutton/master/wiki/images/JSplitButton-Nimbus.png)

![alt tag](https://raw.github.com/rhwood/jsplitbutton/master/wiki/images/JSplitButton-Metal.png)

## Using the Control

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

## Including in your project

### Gradle

1. Add the Jitpack repository to `build.gradle`
```
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```

2. Add the dependency
```
dependencies {
    implementation 'com.github.rhwood:jsplitbutton:Tag'
}
```

### Maven

1. Add the Jitpack repository to `pom.xml`
```
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

2. Add the dependency
```
<dependency>
    <groupId>com.github.rhwood</groupId>
    <artifactId>jsplitbutton</artifactId>
    <version>Tag</version>
</dependency>
```

## Migrating from Version 1.x to 2.0 or Newer

1. Add the Jitpack.io repositoras shown above
2. Change the Group ID in `pom.xml` or `build.gradle` from `com.alexandriasoftware.swing` to `com.github.rhwood.jsplitbutton`
3. Change the package name in imports from `com.alexandriasoftware.swing` to `com.github.rhwood.jsplitbutton`

## License

- Versions 1.3.1 and newer are released under the [Apache 2.0 License](http://www.apache.org/licenses/LICENSE-2.0)
- Version 1.3.0 is released under the [GNU Public License 2.0](https://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html)

## Prior History

* [Original development](http://code.google.com/p/jsplitbutton) by Naveed Quadri in 2012
* [Updated](https://github.com/akuhtz/jsplitbutton) by [Andreas Kuhtz](https://github.com/akuhtz) in 2015