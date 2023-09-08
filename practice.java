class Practice{

    Node head;
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
        }
        public Node(int data, Node next, Node prev){
            this.data=data;
            this.next=next;
            this.prev=prev;
        }
    }
    //adding Node at First position
    public void addFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        newNode.prev=null;
        if(head!=null){
            head.prev=newNode;
        }
        head=newNode;
    }
    //Display the Linkedlist
    public void Display(){
        
        Node current=head;
        while(current.next!=null){
            System.out.print(current.data + "->");
            current=current.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        Practice list=new Practice();
        
        list.addFirst(78);
        list.addFirst(90);
        list.addFirst(90);
        list.addFirst(457);
        list.Display();
        
    }
}