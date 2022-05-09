package com.alexandriasoftware.jsplitbutton;

import com.alexandriasoftware.jsplitbutton.JSplitButtonBeanInfo;
import com.alexandriasoftware.jsplitbutton.JSplitButton;
import static java.beans.BeanInfo.ICON_COLOR_16x16;
import static java.beans.BeanInfo.ICON_COLOR_32x32;
import static java.beans.BeanInfo.ICON_MONO_16x16;
import static java.beans.BeanInfo.ICON_MONO_32x32;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.beans.BeanInfo;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

class JSplitButtonBeanInfoTest {

    protected BeanInfo info;
    protected Class<?> trgt;

    @BeforeEach
    public void setUp() {
        info = new JSplitButtonBeanInfo();
        trgt = JSplitButton.class;
    }

    @Test
    void testGetIcon() {
        assertNotNull(info.getIcon(ICON_COLOR_16x16));
        assertNotNull(info.getIcon(ICON_COLOR_32x32));
        assertNotNull(info.getIcon(ICON_MONO_16x16));
        assertNotNull(info.getIcon(ICON_MONO_32x32));
        assertNull(info.getIcon(Integer.MAX_VALUE));
    }

    @Test
    void TestGetBeanDescriptor() {
        assertNotNull(info.getBeanDescriptor());
        assertEquals(trgt, info.getBeanDescriptor().getBeanClass());
    }

    @EnabledOnJre(JRE.JAVA_8)
    @Test
    void TestGetPropertyDescriptorsOnJava8() {
        assertNotNull(info.getPropertyDescriptors());
        assertEquals(143, info.getPropertyDescriptors().length);
    }

    @DisabledOnJre(JRE.JAVA_8)
    @Test
    void TestGetPropertyDescriptors() {
        assertNotNull(info.getPropertyDescriptors());
        assertEquals(105, info.getPropertyDescriptors().length);
    }

    @Test
    void TestGetEventSetDescriptors() {
        assertNotNull(info.getEventSetDescriptors());
        assertEquals(18, info.getEventSetDescriptors().length);
    }

    @Test
    void TestGetMethodDescriptors() {
        assertNotNull(info.getMethodDescriptors());
        assertEquals(133, info.getMethodDescriptors().length);
    }

    @Test
    void TestGetDefaultPropertyIndex() {
        assertEquals(-1, info.getDefaultPropertyIndex());
    }

    @Test
    void TestGetDefaultEventIndex() {
        assertEquals(-1, info.getDefaultEventIndex());
    }
}
