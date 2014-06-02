/**
 * class.
 */
package com.blizzardtec.springtest;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author bob
 *
 */
public final class MyApp {

    /**
     * Private cons.
     */
    private MyApp() {
        // empty
    }

    /**
     * Main.
     *
     * @param args
     *            vals
     */
    public static void main(final String[] args) {

        final XmlBeanFactory beanFactory =
            new XmlBeanFactory(new ClassPathResource("beans.xml"));

        final MySpring myBean = (MySpring) beanFactory.getBean("mySpring");
        myBean.hashCode();
    }
}
