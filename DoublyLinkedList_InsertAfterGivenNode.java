import java.util.Scanner;

public class DoublyLinkedList_InsertAfterGivenNode {
	class Node { 
        int data; 
        Node prev; 
        Node next; 
        Node(int data) 
        { 
        	this.data = data;
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
	
	public void addNodeAfter(Node prevNode, int data)
	{
		Node newNode = new Node(data);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		newNode.prev = prevNode;
		if(newNode.next != null)
		{
			newNode.next.prev = newNode;
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
		DoublyLinkedList_InsertAfterGivenNode list = new DoublyLinkedList_InsertAfterGivenNode();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.display();
		
		Scanner s = new Scanner(System.in);
		System.out.println("New Element to be added: ");
		int n = s.nextInt();
		System.out.println("New Element will be added after node 2: ");
		
		list.addNodeAfter(list.head.next,n);
		list.display();
	}
}
