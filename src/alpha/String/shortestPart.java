package alpha.String;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class shortestPart {

    public static  float getshortesPath(String s){
        int x=0,y=0;

        for(int i=0;i<s.length();i++){
            char dir=s.charAt(i);
            if(dir=='N'){
                y+=1;
            }else if(dir=='S'){
                y--;
            }else if(dir=='W'){
                x++;
            }else{
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);

    }
    public static String compress(String str){
        String st="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            st+=str.charAt(i);
            if(count>1){
                st+=count.toString();
            }
        }
        return st;
    }

    public static void main(String []args){
     //   Scanner scan=new Scanner(System.in);
        String str1= "WNEENESENNN";
        String s=compress(str1);
        System.out.println(s);
        System.out.println(getshortesPath(str1));


     /*   String fruits[]={"apple","mango","cherry","bannna"};
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);

      */
    }
}
