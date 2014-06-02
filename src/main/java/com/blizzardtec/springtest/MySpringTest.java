/**
 * 
 */
package com.blizzardtec.springtest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

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
