/*
 * Copyright 2020, 2024 Randall Wood.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.rhwood.jsplitbutton;

import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author Randall Wood
 */
public final class SplitButtonDemo extends JFrame {

    int horizontalCount = 0;
    int verticalCount = 0;

    public SplitButtonDemo() throws IOException {
        setLayout(new GridLayout(4, 1));
        add(new JLabel("Horizontal Demonstration"));
        add(horizontalDemonstration());
        add(new JLabel("Vertical Demonstration"));
        add(verticalDemonstration());
        pack();
    }

    /**
     * Run a small demonstration program.
     * 
     * @param args command line arguments; ignored
     * @throws IOException if unable to load popup button icon
     */
    public static void main(String[] args) throws IOException {
        JFrame frame = new SplitButtonDemo();
        frame.setVisible(true);
    }

    public JPanel horizontalDemonstration() throws IOException {
        JSplitButton button = new JSplitButton("Split Button Demo");
        button.setIcon(new ImageIcon(ImageIO.read(SplitButtonDemo.class.getResourceAsStream("/com/github/rhwood/jsplitbutton/splitbutton_16.png"))));
        JPopupMenu menu = new JPopupMenu();
        button.setPopupMenu(menu);
        button.setName("horizontalButton");
        menu.add("Item 1");
        menu.add("Item 2");
        menu.add("Item 3");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(button);
        JLabel label = new JLabel("Clicked " + horizontalCount + " times");
        label.setName("horizontalLabel");
        panel.add(label);
        button.addButtonClickedActionListener(evt -> {
            horizontalCount++;
            label.setText("Clicked " + horizontalCount + " times");
        });
        return panel;
    }

    public JPanel verticalDemonstration() throws IOException {
        JSplitButton button = new JSplitButton("D");
        button.setIcon(new ImageIcon(ImageIO.read(SplitButtonDemo.class.getResourceAsStream("/com/github/rhwood/jsplitbutton/splitbutton_32.png"))));
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        JPopupMenu menu = new JPopupMenu();
        button.setPopupMenu(menu);
        button.setName("verticalButton");
        menu.add("Item 1");
        menu.add("Item 2");
        menu.add("Item 3");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(button);
        JLabel label = new JLabel("Clicked " + verticalCount + " times");
        label.setName("verticalLabel");
        panel.add(label);
        button.addButtonClickedActionListener(evt -> {
            verticalCount++;
            label.setText("Clicked " + verticalCount + " times");
        });
        return panel;
    }
}
