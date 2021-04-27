package com;

import com.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class MyTest03 {
    @Test
    public void test01(){
        String config="ba01/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        Student student=(Student) ac.getBean("myStudent");
        Student student2=(Student) ac.getBean("myStudent2");
        Student student3=(Student) ac.getBean("myStudent3");
        System.out.println("该学生信息如下"+student);
        System.out.println("该学生信息如下"+student2);
        System.out.println("该学生信息如下"+student3);
        File myFile=(File) ac.getBean("myfile");
        System.out.println("文件位置:"+myFile);
        System.out.println("文件信息:"+myFile.getName());

    }
}
