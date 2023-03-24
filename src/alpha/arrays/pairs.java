package alpha.arrays;

import java.util.Scanner;

public class pairs {

    public static void pairsInArray(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")"+" ");
            }
            System.out.println();
        }
    }

    public static boolean isPalindrome(String s){
        for(int i=0;i<s.length()/2;i++){
            int n=s.length();
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args){

        Scanner scan=new Scanner(System.in);
        System.out.println("enter number of element in array ");
        int n=scan.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=scan.nextInt();
        }
        pairsInArray(array);
        String str="noon";
        System.out.println(isPalindrome(str));
    }
}
