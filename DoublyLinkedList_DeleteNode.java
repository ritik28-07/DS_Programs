class DoublyLinkedList_DeleteNode {

	class Node { 
        int data; 
        Node prev; 
        Node next; 
        Node(int data) 
        { 
        	this.data = data;
        } 
    } 

	public Node head=null;
	
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
	
	public void deleteNode(Node del)
	{
        if (head == null || del == null) { 
            return; 
        } 
  
        if (head == del) { 
            head = del.next; 
        } 

        if (del.next != null) { 
            del.next.prev = del.prev; 
        } 
 
        if (del.prev != null) { 
            del.prev.next = del.next; 
        } 
        return;
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
		DoublyLinkedList_DeleteNode list = new DoublyLinkedList_DeleteNode();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.display();
		
		System.out.println("List after deletion of head.next node i.e; 4: ");
		list.deleteNode(list.head.next);
		list.display();
	}
}
