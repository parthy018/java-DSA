package alpha.Recursion;

import java.util.Scanner;

public class introRecursion {

   static  void printNumber(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.print(n+" ");
        printNumber(n-1);
    }

    static void printNumberIncrease(int n){
       if(n==1){
           System.out.println(n+" ");
           return;
       }
       printNumberIncrease(n-1);
        System.out.print(n+" ");
    }

    static int power(int x,int n){
       if(n==1){
           return n;
       }
      /* int xn1=power(x,n-1);
       int xn=x*xn1;
       return xn;*/
        return x*power(x,n-1);
    }

    static int firstOccurance(int arr[],int idx,int key){
        if(idx==arr.length){
            return -1;
        }
       if(arr[idx]==key){
           return idx;
       }
       return firstOccurance(arr,idx+1,key);
    }
    static int LastOccurance(int arr[],int idx,int key){
       if(idx== arr.length){
           return -1;
       }
       int isFound=LastOccurance(arr,idx+1,key);
       if(isFound== -1 && arr[idx]==key){
           return idx;
       }

       return isFound;
    }

    static int fibonacci(int n){
       if(n==1||n==0){
           return n;
       }
       int fnm1=fibonacci(n-1);
       int fnm2=fibonacci(n-2);
       int fn=fnm1+fnm2;
       return fn;

    }
    static  boolean checkSorted(int arr[],int i){
       if(i==arr.length-1){
           return true;
       }
       if(arr[i]>arr[i+1]){
           return false;
       }
       return checkSorted(arr,i+1);
    }

    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
       int x=scan.nextInt();
       printNumber(x);
        System.out.println();
        printNumberIncrease(x);
        System.out.println();
        int arr[]={2,5,1,3};
        System.out.println(checkSorted(arr,0));
        System.out.println(LastOccurance(arr,0,1));

    }
}
