import java.util.Random;

public class RandomList_Reversed {
	
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
	
	public void add(int data)
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
	
	Node reverse() 
    { 
        Node prev = null; 
        Node current = head; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        head = prev; 
        return head; 
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
		
	public static void main(String []args)
	{
		Random r = new Random();
		RandomList_Reversed list = new RandomList_Reversed();
		
		for(int i=0;i<10;i++)
		{
			int value = (r.nextInt((100 - 0) + 1) + 0);
			list.add(value);
		}
		list.display();
		
		list.reverse();
		System.out.print("Reverse Linked ");
		list.display();
	}
}
		
		