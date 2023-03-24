package com.company;

 class Student{
    String name;
    int age;
    Student(String n,int a){
        this.name=n;
        this.age=a;
    }
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    public void getInfo(){
        System.out.println("your name is : "+name);
        System.out.println("yout age is: "+age);
    }
}


public class CopyConstructor {
    public static  void main(String []args){
    Student s=new Student("Parth yadav",22);
    Student s2=new Student(s);
    s2.getInfo();
    }
}
