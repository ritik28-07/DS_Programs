
public class LinkedList_SortList {
	class Node
	{
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
			LinkedList_SortedMerge list = new LinkedList_SortedMerge();
			
			list.addNode(1);
			list.addNode(5);
			list.addNode(3);
			list.addNode(4);
			list.addNode(2);
			
			System.out.println("Original List: ");
			list.display();
			list.sort();
			
			System.out.println("Sorted List: ");
			list.display();
			
			
		}
}
