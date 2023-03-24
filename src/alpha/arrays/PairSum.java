package alpha.arrays;
import java.util.ArrayList;
import java.util.Collections;

public class PairSum {

    public static boolean pairsumbrute(ArrayList<Integer> list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target)return true;
            }
        }
        return false;
    }
    public static boolean optimizedpairSum(ArrayList<Integer> list,int target){
        Collections.sort(list);
        int start=0;
        int last= list.size()-1;
        while(start<last){
            int sum=list.get(start)+list.get(last);
            if(sum==target){
                return true;
            }
            if(sum<target) {
                start++;
            }else{
                last--;
            }
        }
        return false;
    }
    public static boolean rotatedPairSum(ArrayList<Integer> list,int target){
        //find out pivot point
        int len=list.size();
        int pivotIndex=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                pivotIndex=i;
                break;
            }
        }
        int start=pivotIndex+1;
        int last=pivotIndex;
        while(start!=last){
            int sum=list.get(start)+list.get(last);
            if(sum==target){
                return true;
            }else if(sum<target){
                start=(start+1)%len;
            }else{
                last=(len+last-1)%len;
            }
        }
        return false;
    }

    public static void main(String []args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        int target=50;
        System.out.println(pairsumbrute(list,target));
        System.out.println(optimizedpairSum(list,target));
        ArrayList<Integer> li=new ArrayList<>();
        li.add(11);
        li.add(15);
        li.add(6);
        li.add(8);
        li.add(9);
        li.add(10);
        int t=16;
        System.out.println(rotatedPairSum(li,t));
    }
}
