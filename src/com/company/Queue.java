package com.company;

import java.util.Scanner;

class QueueDemo{
    int size=5;
    int []items=new int[size];
    int front,rear;

    public QueueDemo(int size) {
        this.size = size;
    }
    boolean isFull(){
        if(front == 0 && rear == size - 1){
            return true;
        }
        return  false;
    }
    boolean isEmpty(){
        if(front==-1){
            return true;
        }
        return false;
    }
    void enQueue(int number){
        if(isFull()){
            System.out.println("\n Queue is full");
        }else{
            if(front==-1){
                front=0;
            }
            rear++;
            items[rear]=number;
            System.out.println("\n Inserted: "+number);
        }
    }
    void deQueue(){
        if(isEmpty()){
            System.out.println("\nQueue is empty");
        }else{
            System.out.println("deleted element: "+items[front]);
            front++;
            if(front>=rear){
                front=-1;
                rear=-1;
            }
        }
    }

    void display(){
        int i;
        if(isEmpty()){
            System.out.println("\n Queue is empty: ");
        }else{
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + "  ");

            System.out.println("\nRear index-> " + rear);
        }
    }

}


public class Queue {
    public static void main(String []args){
        int number;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter size of Queue");
        number=scan.nextInt();
        QueueDemo q=new QueueDemo(number);
    // inserting element in queue
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        q.enQueue(48);

        q.display();

        q.deQueue();

        q.display();
    }
}
