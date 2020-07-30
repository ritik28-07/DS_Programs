
public class DoublyLinkedList_InsertAtFront {
	class Node{
		int data;
		Node next,prev;
		public Node(int data)
		{
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	public Node head = null;
	
	public void addNode(int data)
	{
		Node newNode = new Node(data);
		
		newNode.next = head;
		newNode.prev = null;
		
		if(head != null)
		{
			head.prev = newNode;
		}
		
		head = newNode;
	}
	
	public void display()
	{
		Node current = head;
		while(current != null)
		{
			System.out.println(current.data + " ");
			current = current.next;
		}
	}
	
	public static void main(String[] args)
	{
		DoublyLinkedList_InsertAtFront list = new DoublyLinkedList_InsertAtFront();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.display();
	}
}
