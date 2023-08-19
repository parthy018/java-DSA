package com.codewithmosh;

public class Main {
    public static void main(String []args){

//        TextBox textBox=new TextBox();  it found little noisy so we can use var variable
//        var textBox=new TextBox();
//        textBox.setText("coce with mosh");
//        System.out.println(textBox.text);

//        var textBox1=new TextBox();
//        var textBox2=textBox1;
//        textBox2.setText("hey buddy ");  // will appear in textBox1 also beacause both are referencing to same memeory
//        // created by new TextBox()
//        System.out.println(textBox1.text);

        var employee=new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage=employee.calculateWage(10);
        System.out.println(wage);

    }
}
