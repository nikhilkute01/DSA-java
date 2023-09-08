// Implementation of Stack using Single Linked List 

class Stack
{

// A Linked List Node
	class Node
	{
    		int data;       // integer data
    		Node next;      // pointer to the next node

    		public Node(int x) {
			this.data = x;
			next = null;
   		}
	}

    private Node top;
    private int nodesCount;
    
    public Stack() {
        this.top = null;
        this.nodesCount = 0;
    }

// Utility function to add an element `x` to the stack

public void push(int x)        // insert at the beginning
{
	Node node = new Node(x);		// allocate a new node in a heap
        
        if (node == null)	// check if stack (heap) is full. Then inserting an element would lead to stack overflow
        {
            System.out.println("Heap Overflow");
            return;
        }

        System.out.println("Inserting " + x);
        node.data = x;
        node.next = top;
        top = node;
        this.nodesCount += 1;
}

public boolean isEmpty() 	 // Utility function to check if the stack is empty or not
{
	return top == null;
}


// Utility function to return the top element of the stack

public int peek()
{
       	if (isEmpty())  // check for an empty stack
	{
            System.out.println("The stack is empty");
            System.exit(-1);
        }
        return top.data;
}

// Utility function to pop a top element from the stack
    
public int pop()        // remove at the beginning
{
        if (isEmpty())		// check for stack underflow
        {
            System.out.println("Stack Underflow");
            System.exit(-1);
        }

        int top = peek();			// take note of the top node's data
        System.out.println("Removing " + top);
        this.nodesCount -= 1;				 // decrease stack's size by 1
        this.top = (this.top).next;		 // update the top pointer to point to the next node
        return top;
}

// Utility function to return the size of the stack
    
public int size() {
	return this.nodesCount;
}
 
public void display()
{
        if (isEmpty()) // check for an empty stack
	{
            System.out.println("The stack is empty");
        }
        else 
	{
		Node current = top;
		System.out.print("Stack elements: ");
		while (current != null)
		{
			System.out.print(current.data + " ");
        		current = current.next;
     		}
      		System.out.println();
   	}
		

}   

}

class Main
{
public static void main(String[] args)
    {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

	stack.display();
        System.out.println("The top element is " + stack.peek());
        stack.pop();
        stack.pop();
	stack.display();
        stack.pop();
        
        
    }

}