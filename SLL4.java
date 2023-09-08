class SLL4{
	Node head;
	class Node{
	int data;
	Node next;

	Node(int data){
	this.data=data;
	this.next=null;
	}
    }

	//adding element in the last position
	public void addFirst(int data){
	Node newNode=new Node(data);
		if(head==null)
		{
		System.out.print("List is Empty");
		
		}
		newNode.next=head;
		head=newNode.next;				
		}

		//add Last element in the Linkedlist
		/**
		 * @param data
		 * @param object TODO
		 */
		public void addLast(int data, Object object){
		Node newNode=new Node(data);
		if(head==null)
		{
		System.out.print("List is Empty");
		
		}
			Node cuurent=head;
			Object current;
			while(current!=null){
			object=current.next;
			}
				current=newNode;
		}

		//display the element in the linked list
			public void Display(){
			if(head==null){
			System.out.print("List is empty");
			
			}
			Node current=head;
			while(current!=null){
				System.out.print(current.data + "->");
				current=current.next;
		}
			System.out.print("null");
			System.out.println();
		}
		public static void main(String[] args){
		SLL4 list=new SLL4();
		list.addFirst(56);
		list.addLast(78, current);
		list.Display();
		list.addLast(78, current);

		}
}
