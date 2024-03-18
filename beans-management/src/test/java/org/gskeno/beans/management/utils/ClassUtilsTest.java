package org.gskeno.beans.management.utils;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.util.ClassUtils;

public class ClassUtilsTest {
    @Test
    public void test(){
        // 179自动装箱为Integer类型
        Object value = 179;
        Assert.assertEquals(value.getClass(), Integer.class);
        boolean assignableValue = ClassUtils.isAssignableValue(Integer.class, value);
        Assert.assertTrue(assignableValue);

        // 179自动装箱为Long类型
        value = 179L;
        Assert.assertEquals(value.getClass(), Long.class);
        assignableValue = ClassUtils.isAssignableValue(Long.class, value);
        Assert.assertTrue(assignableValue);

        // null适配任何类
        value = null;
        assignableValue = ClassUtils.isAssignableValue(Long.class, value);
        Assert.assertTrue(assignableValue);
        assignableValue = ClassUtils.isAssignableValue(Integer.class, value);
        Assert.assertTrue(assignableValue);

        // null instanceof 任意类 都为false
        value = null;
        Assert.assertFalse(value instanceof Object);
        Assert.assertFalse(value instanceof Long);
    }
}
