
public class LinekdList_InsertAtCertainIndex {
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
	
	public void addNode(int index, int data)
	{
		Node temp = head;
		int count=0;
		
		while(temp != null && ++count != index)
		{
			temp = temp.next;
		}
		Node newNode = new Node(data);
		
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	public void display(){
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
		LinekdList_InsertAtCertainIndex list = new LinekdList_InsertAtCertainIndex();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		
		list.addNode(2, 100);
		list.addNode(4, 50);
		
		list.display();

		
	}
}
