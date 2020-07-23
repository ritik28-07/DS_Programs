
public class LinkedList_InsertAtStart {
	class Node{
		int data;
		Node next;
		
		public Node(int data){
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
			Node temp = head;
			head = newNode;
			head.next = temp;
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
		LinkedList_InsertAtStart list = new LinkedList_InsertAtStart();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		
		list.display();
	}
}
