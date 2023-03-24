package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCalculator {
    public static void main(String []args)
    {
        final byte MONTHS_IN_YEAR=12;
        final byte PERCENT=100;
        int principal;
        float annualInterset,monthlyInterset;
        byte years;
        int numberOfPayments;
        Scanner scan=new Scanner(System.in);
        while(true) {
            System.out.print("Principal: ");
             principal = scan.nextInt();
            if(principal>=1000 && principal<=1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 1000000");
        }

        while(true) {
            System.out.print("Annual Interset Rate: ");
             annualInterset = scan.nextFloat();
             if(annualInterset>=1 && annualInterset<=30){
                 monthlyInterset = annualInterset / PERCENT / MONTHS_IN_YEAR;
                 break;}
             System.out.println("Enter interset rate between 1 and 30");
        }
        while(true) {
            System.out.print("Period (Years): ");
             years = scan.nextByte();
             if(years>=1 && years<=30) {
                 numberOfPayments = years * MONTHS_IN_YEAR;
                 break;
             }
             System.out.println("Enter year between 1 to 30");
        }

        double mortage=principal*(monthlyInterset*Math.pow(1+monthlyInterset,numberOfPayments))/(Math.pow(1+monthlyInterset,numberOfPayments)-1);

        String mortageFormatted=NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortage "+mortageFormatted);
        scan.close();
    }
}
