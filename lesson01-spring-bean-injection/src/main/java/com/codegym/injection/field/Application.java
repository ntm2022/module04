package com.codegym.injection.field;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("field-injection.xml");

        CustomerService customerService = (CustomerService) context.getBean("customerService");
        System.out.println(customerService.eat());

        context.close();
    }
}
/*
OUTPUT:
10:44:23 AM: Executing ':Application.main()'...

> Task :compileJava
> Task :processResources
> Task :classes

> Task :Application.main()
Food ordering...
 */