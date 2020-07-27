import java.util.Scanner;
public class LinkedList_SearchElement {
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
			head= newNode;
			tail = newNode;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void searchElement(int n) 
	{
		boolean flag = false;
		int i = 1;
		Node current = head;
		
		while(current != null)
		{
			if(current.data == n)
			{
				flag = true;
				break;
			}
			i++;
			current = current.next;
		}
		
		if(flag == false)
		{
			System.out.println("Element is not in the list");
		}
		else
		{
			System.out.println("Element found at " + i);
		}
	}
	
	public void display()
	{
		Node current = head;
		if(head == null)
		{
			System.out.println("Empty List");
		}
		else
		{
			while(current != null)
			{
				System.out.println(current.data + " ");
				current = current.next;
			}
		}
	}
	
	public static void main(String[] args)
	{
		LinkedList_SearchElement list = new LinkedList_SearchElement();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		
		System.out.println("List is: ");
		list.display();
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Element to be Searched");
		int e = s.nextInt();
		
		list.searchElement(e);
		
		s.close();
	}
}
