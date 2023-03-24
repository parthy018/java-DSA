package alpha.arrays;

import java.util.Scanner;

public class quickSortimp {

    public static int partition(int arr[],int low,int high){
        int pivot=arr[low]; //first element as pivot element
        int count=0;
        //finding right position for pivot element
        for(int i=low+1;i<arr.length;i++){
            if(arr[i]<=pivot)count++;
        }
        int pivotindex=low+count; //right index of pivot element
        //swapping pivot to low
        int temp=pivot;
        arr[low]=arr[pivotindex];
        arr[pivotindex]=temp;
        int i = low, j =high;
        while(i<pivotindex && j>pivotindex){
            while(arr[i]<arr[pivotindex]){
                i++;
            }
            while (arr[j]>arr[pivotindex]){
                j--;
            }
            if(i<pivotindex&& j>pivotindex){
                int swap=arr[i];
                arr[i]=arr[j];
                arr[j]=swap;
                i++;
                j--;
            }
        }

        return pivotindex;

    }
    public static void quicksort(int arr[],int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,low);
        }
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= scan.nextInt();
        }
        quicksort(arr,0,arr.length-1);
        print(arr);

    }

}
