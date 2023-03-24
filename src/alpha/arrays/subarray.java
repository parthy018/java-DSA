package alpha.arrays;

import java.util.Scanner;

public class subarray {
    public static void allSubArray(int numbers[]){
        for(int i=0;i<numbers.length;i++){

            for (int j=i;j< numbers.length;j++){

                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void maxSubarraySumBrute(int num[]){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=num[k];
                }
                System.out.println(sum);
                if(maxSum<sum){
                    maxSum=sum;
                }
            }
        }
        System.out.println("max sum is: "+maxSum);
    }
    public static void prefixSum(int number[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        int prefix[]=new int[number.length];
        prefix[0]=number[0];
        for(int i=1;i< prefix.length;i++){
            prefix[i]=prefix[i-1]+ number[i];
        }
        for(int i=0;i< number.length;i++){
            for(int j=i;j< number.length;j++){
                currSum= i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("maximum subarray sum is : "+maxSum);

    }
    public static void kedanes(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum= currSum>maxSum?currSum:maxSum;
        }
        System.out.println("maximum subarray sum is: "+maxSum);
    }

    public static  void print(int A[]){
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number of element in array ");
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        //allSubArray(arr);
        print(arr);
       // allSubArray(arr);
       //  maxSubarraySumBrute(arr);
       // prefixSum(arr);
        kedanes(arr);
    }
}
