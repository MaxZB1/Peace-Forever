package com.ba01;

import java.util.Locale;

public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("spring调用的无参构造方法！！");
    }
    /*
      使用property时必须要有set方法，没有报错。
     */

    public void setName(String name) {
        System.out.println("setname为"+name);
        this.name = name.toUpperCase();//toUpperCase()字母大写
    }

    public void setAge(int age) {
        System.out.println("setage为"+age);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
