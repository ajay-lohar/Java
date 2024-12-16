package com.ajay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLWay {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.cfg.xml");
 //     Employee employee = (Employee) context.getBean("employee");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
