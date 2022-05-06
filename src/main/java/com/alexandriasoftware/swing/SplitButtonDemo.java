/*
 * Copyright 2020 Randall Wood.
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
package com.alexandriasoftware.swing;

import java.awt.FlowLayout;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

/**
 *
 * @author Randall Wood
 */
public class SplitButtonDemo {

    static int count = 0;

    /**
     * Run a small demonstration program.
     * 
     * @param args command line arguments; ignored
     * @throws IOException if unable to load popup button icon
     */
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        JSplitButton button = new JSplitButton("Split Button Demo");
        button.setIcon(new ImageIcon(ImageIO.read(SplitButtonDemo.class.getResourceAsStream("/com/alexandriasoftware/swing/splitbutton_16.png"))));
        JPopupMenu menu = new JPopupMenu();
        button.setPopupMenu(menu);
        menu.add("Item 1");
        menu.add("Item 2");
        menu.add("Item 3");
        JPanel panel = new JPanel();
        panel.add(button);
        frame.add(panel);
        JLabel label = new JLabel("Clicked " + count + " times");
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
        button.addButtonClickedActionListener(evt -> {
            count++;
            label.setText("Clicked " + count + " times");
        });
    }

}
