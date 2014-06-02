/**
 * My Spring.
 */
package com.blizzardtec.springtest;

/**
 * @author bob
 *
 */
public final class MySpring {

    /**
     * Test component.
     */
    private MyComponent myComponent;

    /**
     * Do some stuff with components.
     *
     * @return high or low
     */
    public String doStuff() {
        return myComponent.myComponentHighLow();
    }

    /**
     * Set my component.
     *
     * @param myComponent
     *            val
     */
    public void setMyComponent(final MyComponent myComponent) {
        this.myComponent = myComponent;
    }

    /**
     * return my component.
     *
     * @return result
     */
    public MyComponent getMyComponent() {
        return this.myComponent;
    }
}
