class Node
{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
		Node() {}
}
public class LinkedList_SortedMerge {
	
	public Node head = null;
	public Node tail = null;
	
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
	
	public void sort()
	{
		Node current = head;
		Node index= null;
		int temp;
		
		if(head == null)
		{
			current = null;
			index= null;
		}
		else
		{
			while(current != null)
			{
				index= current.next;
				while(index != null)
				{
					if(current.data > index.data)
					{
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}
					index = index.next;
				}
				current = current.next;
			}
		}
	}
	
	/*public static Node sortedMerge(Node list1, Node list2)
	{
				Node dummy = new Node();

				Node tail = dummy;

				while (true)
				{
					if (list1 == null)
					{
						tail.next = list2;
						break;
					}
					else if (list2 == null)
					{
						tail.next = list1;
						break;
					}

					if (list1.data <= list2.data) {
						if (list1 != null) {
							Node newNode = list1;
							list1 = list1.next;

							newNode.next = tail.next;
							tail.next = newNode;
						}
					}
					else {
						if (list2 != null) {
							Node newNode = list2;
							list2 = list2.next;

							newNode.next = tail.next;
							tail.next = newNode;
						}
					}
					tail = tail.next;
				}

				return dummy.next;
	}*/
	
	public void display()
	{
		Node current = head;
		if(current == null)
		{
			System.out.println("Empty List: ");
		}
		
		while(current != null)
		{
			System.out.println(current.data + " ");
			current = current.next;
		}
	}
	
	public static void main(String[] args)
	{
		LinkedList_SortedMerge list1 = new LinkedList_SortedMerge();
		LinkedList_SortedMerge list2 = new LinkedList_SortedMerge();
		
		list1.addNode(1);
		list1.addNode(5);
		list1.addNode(3);
		list1.addNode(4);
		list1.addNode(2);
		
		System.out.println("Original List 1: ");
		list1.display();
		list1.sort();
		
		System.out.println("Sorted List 1: ");
		list1.display();
		
		list2.addNode(6);
		list2.addNode(9);
		list2.addNode(7);
		list2.addNode(10);
		list2.addNode(8);
		
		System.out.println("Original List 2: ");
		list2.display();
		list2.sort();
		
		System.out.println("Sorted List 2: ");
		list2.display();
		
		list1.head = new Gfg().sortedMerge(list1.head, list2.head);
		list1.display();
	}
}

class Gfg{
	Node sortedMerge(Node headA, Node headB)
	{

	    Node dummyNode = new Node(0); 
	      
	    Node tail = dummyNode; 
	    while(true)  
	    { 

	        if(headA == null) 
	        { 
	            tail.next = headB; 
	            break; 
	        } 
	        if(headB == null) 
	        { 
	            tail.next = headA; 
	            break; 
	        } 

	        if(headA.data <= headB.data) 
	        { 
	            tail.next = headA; 
	            headA = headA.next; 
	        }  
	        else
	        { 
	            tail.next = headB; 
	            headB = headB.next; 
	        } 
	        tail = tail.next; 
	    } 
	    return dummyNode.next; 
	}
}
