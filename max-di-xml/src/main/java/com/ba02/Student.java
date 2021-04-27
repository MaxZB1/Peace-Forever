package com.ba02;

public class Student {
    private String name;
    private int age;

    //声明一个引用数据类型
    private School school;

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

    public void setSchool(School school) {
        System.out.println("setschool为"+school);
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
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
