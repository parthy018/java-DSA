package alpha.arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArraylistQ {
    static boolean monotonic(ArrayList<Integer> list){
         boolean flag1=true,flag2=true;
         //checking for monotonic increasing
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                flag1=false;
                break;
            }
        }

        //checking for monotonic decreasing
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)<list.get(i+1)){
                flag2=false;
                break;
            }
        }
        if(flag1==true ||flag2==true){
            return true;
        }else{
            return false;
        }
    }
    static boolean isLonely(ArrayList<Integer> list,int x){
        int count=0;
        boolean numberMinus=false;
        boolean numberPlus=false;
        for(int i=0;i<list.size();i++){
            if(x==list.get(i)){
                count++;
                if(count>1){
                    break;
                }
            }
            if(x-1==list.get(i)){
                numberMinus=true;
                break;
            }
            if(x+1==list.get(i)){
                numberPlus=true;
            }
        }
        boolean flag=false;
        if(count>1){
            flag=true;
        }
        return flag|| numberMinus ||numberPlus  ;


    }

    static ArrayList<Integer> lonelyNumber(ArrayList<Integer> list,ArrayList<Integer> ans){
       for(int i=0;i<list.size();i++){
           boolean flag=isLonely(list,list.get(i));
            if(flag){
                ans.add(list.get(i));
            }
       }
        return ans;
    }

    public static void main(String []args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(10);
        list.add(7);
        System.out.println(monotonic(list));
        ArrayList<Integer> li=new ArrayList<>();
        li=lonelyNumber(list,li);
        for(int i=0;i<li.size();i++){
            System.out.print(li.get(i)+" ");
        }
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addFirst(50);
        ll.addFirst(40);
        System.out.println(ll);
        System.out.println(ll.get(1));
    }
}
