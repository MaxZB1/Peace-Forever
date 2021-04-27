package com;

import com.ba04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class MyTest04 {
    @Test
    public void test01(){
        String config="ba04/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        Student student=(Student) ac.getBean("myStudent");
        System.out.println("该学生信息如下"+student);


    }
}
