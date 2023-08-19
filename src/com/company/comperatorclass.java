package com.company;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentInformation {

        int age;
        String name;

    public StudentInformation(int age,String name) {
        this.age = age;
        this.name=name;
    }

    public String toString(){
            return "Student [age "+age+ ", name= "+ name+"]";
        }


}

public class comperatorclass {


    public static void main(String []args){

        Comparator<StudentInformation> com=new Comparator<StudentInformation>() {

            @Override
            public int compare(StudentInformation o1, StudentInformation o2) {
                if(o1.age>o2.age)
                    return 1;
                else
                    return 0;
            }


        };

        List<StudentInformation> num=new ArrayList<>();
        num.add(new StudentInformation(23,"parth"));
        num.add(new StudentInformation(20,"mahi"));
        num.add(new StudentInformation(21,"virat"));
        num.add(new StudentInformation(25,"rohit"));
        Collections.sort(num,com);
        System.out.println(num);
    }
}

