package com.codegym.beans.xml;

import com.codegym.beans.Developer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application1 {//tiêm XML

    public static void main(String[] args) {//chạy mỗi file này để thấy kết quả
        //quét file cấu hình XML
        ApplicationContext context = new ClassPathXmlApplicationContext("developer.xml");

        Developer fe = (Developer) context.getBean("frontend");
        System.out.println(fe);
        Developer be = (Developer) context.getBean("backend");
        System.out.println(be);

        ((ClassPathXmlApplicationContext) context).close();
    }
}
/*OUTPUT:
> Task :Application.main()
        [id= 1, name= Ty, major= Frontend]
        [id= 2, name= Teo, major= Backend]
*/