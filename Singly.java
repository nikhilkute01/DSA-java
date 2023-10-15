class Singly{

    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
//Adding Node at First Position

   public void AddFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

//printing Singly Linked List
  public  void Display(){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        Node newNode1=head;
        while(newNode1!=null){
            System.out.print(newNode1.data + "->");
            newNode1=newNode1.next;
        }
        System.out.println("Null");
    }

//Adding Element at last position in Singly linked list
    public void AddLast(int data){
        Node newNode=new Node(data);
        Node newNode1=head;
        while(newNode1.next!=null){
            newNode1=newNode1.next;
        }
        newNode1.next=newNode;
    }

//Adding node at Middle position on Singly Linked list
public void AddMiddel(int data){
    Node newNode=new Node(data);



}
//Deleting Node at first position
        public void deleteFirst(){
            if(head==null){
                System.out.println("Linked list is empty");
            }
            head=head.next;
}

    public static void main(String args[]){
        Singly list=new Singly();
        list.AddFirst(45);
        list.AddFirst(56);
        list.AddFirst(90);
        list.AddLast(78);
        list.Display();
        list.deleteFirst();
        list.Display();
    }
}