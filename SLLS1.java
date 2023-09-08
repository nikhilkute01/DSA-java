import static java.lang.System.exit;
class SLLS{
	class Linkedliststack{
	private class Node{
	int data;
	Node next;
	}
	Node top;
	Linkedliststack{
	this.top=null;
	}
	public void push(int A){
	Node temp=new Node();
	if(top==null){
	System.out.println("Stack is underflow");
	return;
	}
	temp.data=A;
	temp.next=top;
	top=temp;
	}
 	public boolean isEmpty(){
	return top==null;
	}
	public int peek(){
	if(!isEmpty()){
	return top.data;
	}
	else{
	System.out.println("Stack is empty");
	return -1;
	}
	}
	public void pop(){
	if(top==null){
	     System.out.println("Stack is underflow");
	     return;
	}
           top=top.next;
	}

	public void display(){
	if(top==null){
	  System.out.println("Stack is underflow");
	   exit(1);
	}
   	else{
	Node temp=top;
	while(temp!=null){
	System.out.println(temp.data + "->");
	temp=temp.next;
	}
	}
	}
	}
	
	public static void main(String() args){
	Linkedliststack obj=new Linkedliststack();
	obj.push(34);
	obj.push(84);
	obj.push(94);
	}
}	