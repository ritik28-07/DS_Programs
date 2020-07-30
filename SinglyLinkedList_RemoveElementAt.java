	import java.util.Scanner;
public class SinglyLinkedList_RemoveElementAt {
	class Node{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data)
	{
		Node newNode = new Node(data);
		
		Node temp = head;
		head = newNode;
		head.next = temp;
	}
	
	public void removeAt(int index)
	{
		Node n = head, n1 = null;
		if(index == 0)
		{
			head = head.next;
		}
		else
		{
			for(int i=0; i<index-1; i++)
			{
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
		}
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
		SinglyLinkedList_RemoveElementAt list = new SinglyLinkedList_RemoveElementAt();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		
		System.out.println("The original list is: ");
		list.display();
		
		Scanner s = new Scanner(System.in);

		System.out.println("Index of the Element to be removed: ");
		int index = s.nextInt();
		list.removeAt(index);
		list.display();
	}
}
