package com.codegym.injection.setter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {//tiêm Setter

    public static void main(String[] args) {
        BeanFactory context = new ClassPathXmlApplicationContext("setter-injection.xml");
        //có 02 hạt đậu đã được tiêm vào file xml ở trên
        //01 hạt là class Clazz và class Student (hiện nay đang rỗng nên chưa tiêm được)
        Clazz clazz = (Clazz) context.getBean("clazz");
        System.out.println(clazz);

        ((ClassPathXmlApplicationContext) context).close();
    }
}
/*
OUTPUT:
> Task :Application3.main()
Clazz [id=1, name=Ty, student=com.codegym.injection.setter.Student@1f3f4916]
 */