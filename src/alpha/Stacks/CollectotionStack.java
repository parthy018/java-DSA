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
    public static String reverseString(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder sb=new StringBuilder();
        while(!s.empty()) {
            char c = s.pop();
            sb.append(c);
        }
       str=sb.toString();
        return str;
    }


    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
    int top=s.pop();
    reverseStack(s);
    pushAtBottom(s,top);
    }
    public static void printStack(Stack<Integer> s){
        while(!s.empty()){
            System.out.println(s.pop());
        }
        System.out.println();
    }


    public static void main(String []args){
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.add(20);

        s.push(30);
        // question 1 Push at Bottom of the stack
      //  pushAtBottom(s,40);

//        String st="HelloWorld";
//        String result=reverseString(st);
//        System.out.println(result);
        //printStack(s);
        reverseStack(s);
        System.out.println("stack after reverse");
        printStack(s);


    }
}
