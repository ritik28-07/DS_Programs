//SINGLY LINKED LIST
public class LinkedList_InsertAtEnd {
	
	 class Node{    
	        int data;    
	        Node next;    
	            
	        public Node(int data) 
	        {    
	            this.data = data;    
	            this.next = null;    
	        }    
	    } 
	
	Node head = null;
	Node tail = null;
	
	public void addNode(int data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void display()
	{
		Node current = head;
		if(head == null)
		{
			System.out.println("Empty List");
		}
		
		System.out.println("List is: ");
		
		while(current != null)
		{
			System.out.println(current.data + " ");
			current = current.next;
		}
	}
	
	public static void main(String[] args)
	{
		LinkedList_InsertAtEnd list = new LinkedList_InsertAtEnd();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		
		list.display();
		
	}
}
