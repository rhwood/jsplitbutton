/*
 * Copyright 2022, 2024 rhwood.
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
package com.alexandriasoftware.jsplitbutton;

import org.assertj.swing.edt.FailOnThreadViolationRepaintManager;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rhwood
 */
class SplitButtonDemoTest {

    private FrameFixture window;

    @BeforeAll
    public static void setUpOnce() {
        FailOnThreadViolationRepaintManager.install();
    }

    @BeforeEach
    public void setUp() {
        SplitButtonDemo frame = GuiActionRunner.execute(() -> new SplitButtonDemo());
        window = new FrameFixture(frame);
        window.show();
    }

    @AfterEach
    public void tearDown() {
        window.cleanUp();
    }

    @Test
    void testHorizontalCount() {
        window.label("horizontalLabel").requireText("Clicked 0 times");
        window.label("verticalLabel").requireText("Clicked 0 times");
        window.button("horizontalButton").click();
        window.label("horizontalLabel").requireText("Clicked 1 times");
        window.label("verticalLabel").requireText("Clicked 0 times");
    }

    @Test
    void testVerticalCount() {
        window.label("verticalLabel").requireText("Clicked 0 times");
        window.label("horizontalLabel").requireText("Clicked 0 times");
        window.button("verticalButton").click();
        window.label("verticalLabel").requireText("Clicked 1 times");
        window.label("horizontalLabel").requireText("Clicked 0 times");
    }
}
