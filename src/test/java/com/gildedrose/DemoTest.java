package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
    @Test
    public void flyweightDemo() {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "He" + "llo";
        String s4 = new String("Hello");
        String s5 = new String("Hello");
        String s6 = new String(new char[]{'H','e','l','l','o'});
        assertTrue(s1 == s2); //Don't do this!
        
        assertSame(s1, s2);
        assertSame(s1, s3);

        assertNotSame(s1, s4);
        assertNotSame(s4, s5);
        assertNotSame(s5, s6);

        String s4intern = s4.intern();
        String s5intern = s5.intern();
        String s6intern = s6.intern();
        assertSame(s4intern, s1);
        assertSame(s5intern, s1);
        assertSame(s6intern, s1);
    }
}
