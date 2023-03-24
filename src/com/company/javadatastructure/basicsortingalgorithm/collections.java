package javadatastructure.basicsortingalgorithm;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
public class collections {
    public static void print(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String []args){
        Integer arr[]={8,5,45,2,-4};
        Arrays.sort(arr,Collections.reverseOrder());
        print(arr);
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(20);
        System.out.println();
    
    }
}
