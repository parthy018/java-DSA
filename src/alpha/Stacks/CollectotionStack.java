package alpha.Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class CollectotionStack {
    static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return ;
        }
        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void main(String []args){
        Stack<Integer> s=new Stack<>();
        s.push(12);
        s.add(45);
        System.out.println(s.size());
        s.push(78);
        // question 1 Push at Bottom of the stack
        pushAtBottom(s,40);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
