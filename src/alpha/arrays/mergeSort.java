package alpha.arrays;

import java.util.Scanner;

public class mergeSort {

    static void mergeSort(int arr[],int start,int end){
       // int []temp=new int[end-start+1];
        if(start>=end)return;
        int mid=start+(end-start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);


    }

    static void merge(int arr[],int start,int mid,int end){
        int temp[]=new int[end-start+1];
        int i=start;
        int j=end;
        int k=0;

        while(i<=mid && j<=end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;

            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
            while(i<=mid){
                temp[k++]=arr[i++];
            }

            while(j<=end){
                temp[k++]=arr[j++];
            }

            for(k=0,i=start;k<temp.length;k++,i++){
                arr[i]=temp[k];
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
        mergeSort(arr,0,arr.length-1);
        print(arr);

    }
}
