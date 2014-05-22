package com.bo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class Bootstrap.
 *
 * @author Boris Pronin (<a href="mailto:bpronin@bttprime.com">bpronin@bttprime.com</a>)
 */
public class Bootstrap {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service service = context.getBean("service", Service.class);

        for (int i = 0; i < 10; i++) {
            System.out.println(service.getReport());
        }

        service.resetCache();

        for (int i = 0; i < 10; i++) {
            System.out.println(service.getReport());
        }
    }
}
