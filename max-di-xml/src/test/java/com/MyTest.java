package com;

import com.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        System.out.println("******---这是测试1方法---******");
        String config="ba01/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        Student mystudent=(Student) ac.getBean("myStudent");//从容器中获取Student对象.
        System.out.println("student对象="+mystudent);

    }
    @Test
    public void test02(){
        System.out.println("******---这是测试2方法---******");

    }
}
