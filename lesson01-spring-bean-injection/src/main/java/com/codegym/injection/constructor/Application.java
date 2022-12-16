package com.codegym.injection.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {//tiêm Constructor - cốt lõi là trong hàm khởi tạo của TexrEditor nhét SpellChecker váo
    public static void main(String[] args) {
        //có cần cái này k?
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor-injection.xml");

        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();

        ((ClassPathXmlApplicationContext) context).close();
    }
}
/*
OUTPUT:
> Task :Application.main()
Check Spelling...
 */