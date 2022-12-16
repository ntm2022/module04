package com.codegym.beans.xml;

import com.codegym.beans.ConfigBeans;
import com.codegym.beans.Developer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application2 {//tiêm file bean JAVA
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigBeans.class);

        Developer fs = (Developer) context.getBean("developer");
        System.out.println(fs);

        context.close();
    }
}
/*
> Task :Application2.main()
[id= 3, name= tin@gmail.com, major= FullStack]
 */