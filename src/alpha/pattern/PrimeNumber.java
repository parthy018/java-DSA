package alpha.pattern;
import  java.util.Scanner;
public class PrimeNumber {
     public static void main(String []args){
         int number;
         System.out.println("enter a number for checking prime ");
         Scanner scan=new Scanner(System.in);
         int div=2;
         number=scan.nextInt();
        boolean flag=false;
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("prime number");
        }else{
            System.out.println("not a prime number");
        }

     }
}
