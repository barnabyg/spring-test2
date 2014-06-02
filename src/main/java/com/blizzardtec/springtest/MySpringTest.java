/**
 *
 */
package com.blizzardtec.springtest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author bob
 *
 */
public final class MySpringTest {

    /**
     * Test my spring.
     */
    @Test
    public void testMySpring() {
        final MySpring mySpring = new MySpring();
        final String str = mySpring.doStuff();
        assertEquals("Component produced wrong value", str, "HIGH");
    }
}
