package ru.clevertec.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    @Test
    void isPositiveNumber() {
        assertTrue(Utils.isAllPositiveNumbers("123456", "0"));
        assertFalse(Utils.isAllPositiveNumbers("-1", "-18295792835"));
    }
}
