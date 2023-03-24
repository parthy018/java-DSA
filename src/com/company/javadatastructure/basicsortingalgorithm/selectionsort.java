package javadatastructure.basicsortingalgorithm;

import java.util.Scanner;
public class selectionsort {

    public static void selectionSort(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[minpos];
            arr[minpos]=temp;
        }
    }
    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        //calculating frequency
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
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
       // selectionSort(array);
       countingSort(array);
        print(array);
        scan.close();
    }
    
}
