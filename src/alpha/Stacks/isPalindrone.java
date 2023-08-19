package alpha.Stacks;

import java.util.Stack;

public class isPalindrone {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    public void addMiddle(int index,int data){
        if(index==0 || head==null){
            addfirst(data);
            return;
        }
        Node temp=head;
        size++;
        int cnt=0;
        while(cnt!=index-1){
            temp=temp.next;
            cnt++;
        }
        Node newnode=new Node(data);
        newnode.next=temp.next;
        temp.next=newnode;
    }

    //is palindrone function using stack
        public static boolean isPalin(Node head){
        Node slow=head;
        boolean ispalin=true;
        Stack<Integer> s=new Stack<>();
        while(slow!=null){
            s.push(slow.data);
            slow=slow.next;
        }
        while(head!=null){
            int i=s.pop();
            if(head.data==i){
                ispalin=true;
            }else{
                ispalin=false;
                break;
            }
            head=head.next;
        }
        return ispalin;
        }

    public static void print(){
        Node temp=head;
        if(temp==null){
            System.out.println("linklist is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String []args){
        isPalindrone ll=new isPalindrone();
        ll.addfirst(5);
        ll.addfirst(5);
        ll.addfirst(4);
        ll.addfirst(5);
        ll.addfirst(5);
        //ll.addMiddle(3,25);
        print();
       boolean ans= isPalin(head);
        System.out.println(ans);
    }
}
