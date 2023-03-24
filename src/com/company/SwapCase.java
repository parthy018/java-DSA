package com.company;

public class SwapCase {
    public static void main(String []args){
        char c = 0;
        String str = "MedicapsUniversitY";
        System.out.println("String before swapcasee "+str);
        int len = str.length();
        String st="";
        System.out.println("String before swapcasee "+str);
        for(int i=0;i<len;i++){
            c=str.charAt(i);
            if(c>=65 && c<=90){
                c=(char)(c+32);
            }
            if(c>=90 && c<=122){
                c=(char)(c-32);
            }
            st+=c;

        }
        System.out.println("\nstring after swapcase "+st);


    }
}
