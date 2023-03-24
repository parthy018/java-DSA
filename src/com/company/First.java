package com.company;



public class First {
public static  void main(String [] args)
{
   String message=new String("hey there");
   message="    parth yadav"+"is a good programmer";
   /* all String is reference type data type in java .All the string method new string object
   after method call  because string in java are immutable.
    */
    System.out.println("hello \"parth\"");
   System.out.println(message.endsWith("er"));
   System.out.println(message.length());
   System.out.println(message.toLowerCase());
   System.out.println(message.replace("good","very good"));
   System.out.println(message.trim());

   System.out.print(message);


}
}
