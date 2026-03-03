package com.smu.mscda;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testCapitalize() {
        String input = "smu";
        String result = StringUtils.capitalize(input);
        assertEquals("Smu", result);
    }

    @Test
    void testMD5() {
        String input = "smu";
        String result = DigestUtils.md5Hex(input);
        assertEquals("3773300c2f413cc7136f8d74b305519c", result);
    }
}