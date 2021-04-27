package com.ba03;

public class Student {
    private String name;
    private int age;

    //声明一个引用数据类型
    private School school;

    public Student() {
        System.out.println("spring调用的无参构造方法！！");
    }
    //创建有参构造方法
    public Student(String myname,int myage,School myschool){
        System.out.println("这是有参构造方法");
        //属性赋值
        this.name=myname;
        this.age=myage;
        this.school=myschool;
    }
    /*
      使用property时必须要有set方法，没有报错。
     */

    public void setName(String name) {
        this.name = name.toUpperCase();//toUpperCase()字母大写
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
