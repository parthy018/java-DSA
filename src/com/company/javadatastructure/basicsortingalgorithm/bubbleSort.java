package javadatastructure.basicsortingalgorithm;
import java.util.Scanner;
public class bubbleSort {
    public static void bubblesort(int arr[]){
        int size=arr.length;
        for(int step=0;step<(size-1);step++){
            boolean swapped = false;
            for(int j=0;j<(size-step-1);j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if (!swapped)
                  break;
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
        bubblesort(array);
        print(array);
        scan.close();
    }
}
