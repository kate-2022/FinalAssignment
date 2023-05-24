package m5s;

public class SortList {
	
	int count;
    int max;
    int min;
	 
    // Represent the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;
 
    // addNode() will add a new node to the list
    public void addNode(int data)
    {
 
        // Create a new node
        Node newNode = new Node(data);
 
        // Checks if the list is empty
        if (head == null) {
 
            // If list is empty, both head and tail will
            // point to new node
            head = newNode;
            tail = newNode;
        }
        else {
 
            // newNode will be added after tail such that
            // tail's next will point to newNode
            tail.next = newNode;
 
            // newNode will become new tail of the list
            tail = newNode;
        }
    }
 
    // sortList() will sort nodes of the list in ascending
    // order
    public void sortList()
    {
 
        // Node current will point to head
        Node current = head, index = null;
 
        int temp;
 
        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                // Node index will point to node next to
                // current
                index = current.next;
 
                while (index != null) {
                    // If current node's data is greater
                    // than index's node data, swap the data
                    // between them
                    if (current.data > index.data) {
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
 
    
    // display() will display all the nodes present in the
    // list
    public void display()
    { 
        // Node current will point to head
        Node current = head;
 
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            // Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;       
        }
    }
    
    // display() will display all the nodes present in the
    // list
    public void display2()
    { 
        // Node current will point to head
        Node current = head;
 
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            // Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            // increments counter
            count ++;
            current = current.next;       
        max = count;
        }
        System.out.println();
        //prints second smallest number when sorted ascending
        current = head.next;
        System.out.println("The second smallest number: " + current.data);
     
        //finds second largest number and prints it 
        while (current != null && min!=max-3) {
            current = current.next;
        min++;
        }
        System.out.println("The second largest number: " + current.data);
  
    }
}