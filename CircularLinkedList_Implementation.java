class CircularLinkedList_Implementation {  
    public class Node{  
        int data;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
      
    public Node head = null;  
    public Node tail = null;  
      
    public void add(int data){  
        Node newNode = new Node(data);  
        if(head == null) {  
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
            tail.next = newNode;  
            tail = newNode;  
            tail.next = head;  
        }  
    }  
      
    public void deleteNode(int valueToDelete) {
        Node currentNode = head;
     
        if (head != null) {
            if (currentNode.data == valueToDelete) {
                head = head.next;
                tail.next = head;
            } else {
                do {
                    Node nextNode = currentNode.next;
                    if (nextNode.data == valueToDelete) {
                        currentNode.next = nextNode.next;
                        break;
                    }
                    currentNode = currentNode.next;
                } while (currentNode != head);
            }
        }
    }
    
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            System.out.println("Nodes of the circular linked list: ");  
             do{  
                System.out.print(" "+ current.data);  
                current = current.next;  
            }
             while(current != head);  
            System.out.println();  
        }  
    }  
      
    public static void main(String[] args) {  
    	CircularLinkedList_Implementation list = new CircularLinkedList_Implementation();  
        list.add(1);  
        list.add(2);  
        list.add(3);  
        list.add(4);  
        list.display(); 
        
        list.deleteNode(3);
        list.display();
    }  
}  