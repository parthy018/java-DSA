package alpha.arrays;

import java.util.Arrays;
import java.util.Scanner;

//Given an integer array nums,
// return true if any value appears at least twice in the array,
// and return false if every element is distinct
public class practiceQ1 {
        public static boolean detectDuplicate(int num[]){
            boolean ans=false;
            for(int i=0;i<num.length;i++){
                int ele=num[i];
                for(int j=i+1;j<num.length;j++){
                    if(ele==num[j]){
                        ans=true;
                        return ans;
                    }
                }
            }
            return ans;
        }
        public static boolean method2(int arr[]){
            //this method use sorting method Arrays.sort()
            int n=arr.length;
            boolean ans=false;
            Arrays.sort(arr);
            for(int i=0;i<n;i++){
                if(arr[i]==arr[i+1]){
                    ans=true;
                    return ans;
                }
            }
            return ans;
        }
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of element in array ");
        int n=scan.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=scan.nextInt();
        }
        System.out.println(detectDuplicate(array));
        System.out.println("ans from method two: "+method2(array));
    }
}
