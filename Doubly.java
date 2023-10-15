class Node{

    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class Doubly {
        Node head=null;
        Node tail=null;

    //Inserting node at fFirst Position in Singly Linked List
    public void AddFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }

    //Displaying Doubly Linked List

    public void Display(){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        Node current=head;
        while(current!=null){
            System.out.print(current.data + "->");
            current=current.next;
        }
        System.out.println("Null");

    }

    //inserting Node at last position in Doubliy Linked list

    public void AddLast(int data){
        Node newNode=new Node(data);
        if(tail==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }

    //Deleting the Node
    public void Delete(){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        if(head==tail){
            head=null;
            tail=null;
        }
        Node new1=head;
        head=head.next;
        head.prev=null;
        new1.next=null;
    }


    public static void main(String[] args) {
        Doubly list=new Doubly();
        list.AddFirst(35);
        list.AddFirst(23);
        list.Display();
        list.AddLast(78);
        list.Display();
        list.AddFirst(87);
        list.Display();
        list.Delete();
        list.Display();
        
    }
}
