package com.company;
import java.nio.file.StandardWatchEventKinds;
import java.util.Scanner;
class Stack{
    private int arr[];
    private  int top;
    private  int capacity;

    Stack(int size){
        arr=new int[size];
        capacity=size;
        top=-1;
    }

    public  void push(int x){
        if(isFull()){
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }
        System.out.println("Inserting "+x);
        arr[++top]=x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        return arr[top--];
    }

    public int size(){
        return top+1;
    }

    public Boolean isEmpty(){
        return top==-1;
    }
    public Boolean isFull(){
        return top==capacity-1;
    }
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

}

public class StackDemo{

    public static void main(String []args){
        Stack s=new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        s.pop();
        System.out.println("\nAfter popping out");

        s.printStack();
    }
}