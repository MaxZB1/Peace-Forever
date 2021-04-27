package com;

import com.ba02.School;
import com.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
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
        Student student=new Student();
        student.setName("刘鑫鸿");
        student.setAge(250);

        School school=new School();
        school.setName("智障儿童残疾人学校");
        school.setAddress("二仙桥消防总队的隔壁~");

        student.setSchool(school);
        System.out.println("student的信息:"+student);
    }
    @Test
    public  void test03(){
        System.out.println("******---这是测试3方法---******");
        String config="ba01/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        Student mystudent=(Student) ac.getBean("myStudent");//从容器中获取Student对象.
        System.out.println("student信息:"+mystudent);


    }

}

