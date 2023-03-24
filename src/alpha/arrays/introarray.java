package alpha.arrays;

public class introarray {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+5;
        }
    }
    public static void reverse(int arr[]){
        int i=0;
        int j=arr.length -1;
        while(i<j){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
    }
    public static  void print(int A[]){
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static int binarySearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static  void main(String []args){

     /*   int marks[]=new int[10];
        marks[0]=98;
        marks[1]=97;
        marks[2]=99;
        marks[4]=95;
        update(marks);
        for (int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        */
       /*
       binary search
       int array[]={12,15,16,18,20};
        int ans=binarySearch(array,15);
        if(ans==-1){
            System.out.println("key not found");
        }else{
            System.out.println("key  found at index "+ans);
        }
        */
        // this section for reverse  array
        int arr[]={12,15,16,18,20};
        reverse(arr);
        print(arr);



    }
}
