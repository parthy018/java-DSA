package javadatastructure.basicsortingalgorithm;
import java.util.Scanner;
import java.util.Arrays;
//import java.util.Collections;
public class insertionSort {

    public static void insertionsort(int arr[]){

        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
        while (prev>=0 && arr[prev]>curr) {
            arr[prev+1]=arr[prev];
            prev--;
        }
        arr[prev+1]=curr;
        }
    }
    

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String []args){
    Scanner scan=new Scanner(System.in);
    int size=scan.nextInt();
    int array[]=new int[size];
    for(int i=0;i<size;i++){
        array[i]=scan.nextInt();
    }
   insertionsort(array);
    print(array);
   Arrays.sort(array,2,5);
   print(array);
    scan.close();
}
}
