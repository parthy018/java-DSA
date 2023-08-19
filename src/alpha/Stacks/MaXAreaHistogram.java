package alpha.Stacks;


import javax.crypto.spec.PSource;
import java.util.Stack;

public class MaXAreaHistogram {
    public static void maxArear(int arr[]){
        // creating two array left smaller and right smaller
        int []nsl=new int[arr.length];
        int []nsr=new int[arr.length];
        int maxArea=0;
        Stack<Integer> s=new Stack<>();
        // finding next smaller right
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&& arr[i]<=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        //next smaller left
        s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[i]<=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            maxArea=Math.max(currArea,maxArea);
        }
        System.out.println("maximum area of histogram is "+maxArea);
    }


    public static  void main(String []args){
        int []heights={2,1,5,6,2,3};
        maxArear(heights);
    }
}
