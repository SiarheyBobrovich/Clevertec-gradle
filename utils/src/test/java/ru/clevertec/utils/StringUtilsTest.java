package ru.clevertec.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("123456"));
        assertTrue(StringUtils.isPositiveNumber("0"));
        assertFalse(StringUtils.isPositiveNumber("-1"));
        assertFalse(StringUtils.isPositiveNumber("-12352341424635141"));
    }
}
