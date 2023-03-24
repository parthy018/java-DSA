package com.company;
import java.util.Scanner;

public class percentageCalculator {
    /*Write a program to calculate  percentage of a given student  in CBSE board exam. his marks from 5 subjects
    must be  taken as input from the keyword .(Marks are out of 100)*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
// marks are out of 100
            System.out.println("Enter marks of Maths ");
            byte M = sc.nextByte();
            System.out.println("Enter marks of  Chem");
            byte C = sc.nextByte();
            System.out.println("Enter marks of Phy");
            byte P = sc.nextByte();
            System.out.println("Enter marks of Eng");
            byte E  = sc.nextByte();
            System.out.println("Enter marks of Hindi");
            byte H = sc.nextByte();
//Calculate total marks and percentage

            float total =  (M+C+P+E+H);
            float percentage = (total/500)*100;
            System.out.println("total marks obtained in 5 subject " + total);
            System.out.println("Percentage of a student in CBSE : " + percentage);


        }
    }

