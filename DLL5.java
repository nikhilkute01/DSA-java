class DLL5{
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
	
	//adding elemnt at First position in doubly linked list
	public void addFirst(int data){
	Node newNode=new Node(data);
	newNode.next=head;
	newNode.prev=null;
	if(head!=null){
	head.prev=newNode;
	      }
	head=newNode;
	}

        //Display the Doubly linked list
	public void display(){
	Node newNode=head;
	while(newNode!=null){
	System.out.print(newNode.data + "->");
	newNode=newNode.next;
	}
	System.out.println("null");
	}

	public static void main(String[] args){
	DLL5 list = new DLL5();
	list.addFirst(45);
	list.addFirst(46);
	list.display(); 
	
	}
}