class SLL1{
		Node head;
		class Node{
                          int data;
			  Node next;
   			  
			  Node(int data){
				this.data=data;
   				this.next=null;
			  }
				}

   				//adding element in singly Linkef list
   				public void addFirst(int data){
				Node newNode=new Node(data);
				if(head==null){
        			head=newNode;
				return;
				}
					
 				newNode.next=head;
				head=newNode;
				}

				//additing element in the last of  the Linked list
			public void addLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
      					//display the linked list
						public void print(){
							if(head==null){
								System.out.println("List is Empty");
								return;
								}
								Node current=head;
							while(current!=null){
                            System.out.print(current.data + "->");
                            current=current.next;
							}
							System.out.print("Null");
							System.out.println();
 
						}

				//deleting element in the list
				public void delete(){
         			if(head==null){
            		System.out.print("List is emoty not possible to delete element "); }
			         System.out.print("Delete ->" + head.data);
			         head=head.next;
				}
				public static void main(String[] args){
				SLL1 list=new SLL1();
				list.addFirst(34);
     			list.addFirst(44);
				list.addLast(54);
				list.print();
				list.delete();
				list.print();
	
    }
	}			