package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
    @Test
    public void flyweightDemo() {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "He" + "llo";
        assertTrue(s1 == s2); //Don't do this!
        assertSame(s1, s2);
        assertSame(s1, s3);

        String s4 = new String("Hello");
        String s5 = new String("Hello");
        String s6 = new String(new char[]{'H','e','l','l','o'});
        assertNotSame(s1, s4);
        assertNotSame(s4, s5);
        assertNotSame(s5, s6);

        assertSame(s4.intern(), s1);
        assertSame(s5.intern(), s1);
        assertSame(s6.intern(), s1);
    }

    @Test
    public void flyweightDemo2() {
        Integer i1 = 10;
        Integer i2 = Integer.valueOf(10);
        Integer i3 = Integer.valueOf(5) * 2;
        assertSame(i1, i2);
        assertSame(i1, i3);

        Integer i4 = 128;
        Integer i5 = 128;
        assertNotSame(i4, i5);
    }
}
