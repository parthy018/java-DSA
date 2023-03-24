package com.company;

import java.util.Scanner;

//import java.util.regex.*;
class Employee{
    String empName;
    String empID;
    String empDept;
    int salary;
    public Employee(){};
    public Employee(String empName,String empID,String empDept,int salary){
        this.empName=empName;
        this.empID=empID;
        this.empDept=empDept;
        this.salary=salary;
    }
}

class EmployeeDetails{

    Employee getEmployeeInfo(String str){
      //Employee emp=new Employee();
      String [] part1=str.split("ID");
      String name=part1[0];
      name=name.replace("."," ");
     // emp.empName=name;
      String part2[]=part1[1].split("DT");
      String id=part2[0];
      //emp.empID=id;
      String part3[]=part2[1].split("CTC");
      String empDepartment=part3[0];
      //emp.empDept=empDepartment;
      String  empSalary=part3[1];
      String []part4=empSalary.split("L");
      int a=Integer.parseInt(part4[0]);
      a=a*100000;
      Employee emp=new Employee(name,id,empDepartment,a);
     // emp.salary=a;
       return emp;
    }


    String getEmployeeTaxSlab(Employee e){
       if(e.salary>1000000){
           return "High";
       }else if(e.salary>=800000 && e.salary<=1000000){
           return "Medium";
           }else if(e.salary>=500000 && e.salary<=800000){
           return "Low";
           }else {
           return "None";
       }

       }
    }

public class Source{

    public static void main(String []args){
        Scanner c=new Scanner(System.in);
        String s=c.nextLine();
        Employee em=new Employee();
       EmployeeDetails emp1=new EmployeeDetails();
       emp1.getEmployeeInfo(s);
       emp1.getEmployeeTaxSlab(em);




    }
}

