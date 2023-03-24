package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan=new Scanner(System.in);
        System.out.println("Parth yadav \n en20cs302029 \n CTIS");
        System.out.println("Enter numbers: ");
        int number1,number2,number3;
        number1=scan.nextInt();
        number2=scan.nextInt();
        number3=scan.nextInt();
        if(number1>number2){
            if(number1>number3){
                System.out.print("greatest number is: "+number1);
            }else{

                    System.out.println("greatest number is: "+number3);
            }
        }else{
            if(number2>number3){
                System.out.println("greatest number is: "+number2);
            }else{
                System.out.println("greatest number is : "+number3);
            }
        }

    }   }