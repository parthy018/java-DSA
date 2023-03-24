package alpha.Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class StackUsingArrayList {
    static class stack{
        static ArrayList<Integer>  list= new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){

            list.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int val=list.get(list.size()-1);
            list.remove(list.size()-1);
            return val;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }

    }

    public static void main(String []args){
        Stack s =new Stack();
        s.push(12);
        s.push(20);
        s.push(30);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
