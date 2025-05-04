package KunalLinkeList;

public class LL {

	private Node head;
	private Node tail;
	private int size;

	public LL() {
		this.size = 0;
	}

	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}

	// to insert at the beginning
	// insert at the Last
	/*
	 1. insertFirst(int val)
	 Purpose: Insert a new node at the beginning of the list.
	 Explanation:
	 Creates a new node with the given value.
	 Sets the new node's next to the current head (so it points to the old first node).
	 Updates head to point to this new node.
	 If the list was previously empty (tail == null), set tail as well.
	 Increments the size.
	 */
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		if (tail == null) {
			tail = head;
		}
		size += 1;
	}

	  /*
	  Display()
	  Purpose: Print all elements in the list.
	  Explanation:
	  Start from head.
	  Print each node’s value followed by an arrow.
	  Stops when next is null.*/
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + "->");
			temp = temp.next; // incrementing to next
		}
		System.out.println("END");
	}

   /*
    2. insertLast(int val)
    Purpose: Insert a new node at the end of the list.
    Explanation:
    If list is empty, it calls insertFirst().
    Otherwise, creates a new node.
    Sets current tail's next to the new node.
    Updates tail to point to the new node.
    Increments size.	
    */
	public void insertLast(int i) {
		// TODO Auto-generated method stub
		if (tail == null) {
			insertFirst(i);
			return;
		}
		Node node = new Node(i);
		tail.next = node;
		tail = node;
		size++;

	}

	// to insert in between nodes
	/*
	3. insert(int val, int index)
	Purpose: Insert a node at a specific index.
	Explanation:
	If index == 0, inserts at the head.
	If index == size, inserts at the end.
	Otherwise, traverses to the node before the target index.
	Inserts a new node between prev and prev.next.
	Updates links accordingly and increments size.
	*/
	public void insertInBetweenIndexes(int valueToInsert, int index) {

		// TODO Auto-generated method stub
		if (index == 0) {
			insertFirst(valueToInsert);
			return;
		}
		if (index == size) {
			insertLast(valueToInsert);
			return;
		}
		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		Node node = new Node(valueToInsert, temp.next);
		temp.next = node;
		size++;
	}
	
	// insert using recursion
	/*4. insertRec(int val, int index)
      Purpose: Recursively insert a node at an index.
      Explanation:
      Calls a helper method with the head node.
      Base case: if index is 0, create and return a new node pointing to current.
      Recursive case: reduce index and move to node.next.
      After recursion, adjust next pointers back up the call stack.
      */
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }
    
    /*5. deleteFirst()
     Purpose: Delete the first node.
     Explanation:
     Stores the value to return.
     Moves head to the next node.
     If list becomes empty, set tail = null.
      Decrements size and returns removed value.
    */


    public int deleteFirst() {
    	int val = head.value;
    	head = head.next;
    	if(head == null) {
    		tail=null;
    	}
    	size--;
    	return val;
    }
     
    /*6. deleteLast()
    Purpose: Delete the last node.
    Explanation:
    If list size <= 1, uses deleteFirst().
    Traverses to the second last node.
    Sets tail to this node and disconnects last node.
    Decrements size and returns deleted value.
    */
    
    public int deleteLast() {
    	if(size <=1) {
    		return deleteFirst();
    	}
    	Node secondLast = get(size-2);
    	int val = tail.value;
    	tail = secondLast;
    	tail.next = null;
    	size--;
    	return val;
    }
    
    
    /*
     7. delete(int index)
     Purpose: Delete node at a specific index.
     Explanation:
     If index == 0, delete the first node.
     If index == last, call deleteLast().
     Else, find node before the target and update its next pointer.
     Decrements size and returns deleted value.
     */
    
    public int delete(int index) {
    	if(index == 0) {
    		return deleteFirst();
    	}
    	if(index == size-1) {
    		return deleteLast();
    	}
    	Node prev = get(index -1);
    	int val = prev.next.value;
    	
    	prev.next = prev.next.next;
    	size--;
    	return val;
    }
   
    
    /*
    Purpose: Return node at a specific index.
    Explanation:
     Starts at head and moves forward index times.
     Returns the node at that position.
     */
    //Utility method to get the index
	private Node get(int index) {
		// TODO Auto-generated method stub
		
		Node node = head;
		for(int i =0; i<index; i++) {
			node = node.next;
		}
		return node;
	}
	
	/*
	 9. find(int value)
	 Purpose: Find a node by its value.
	 Explanation:
	 Traverses through each node.
	 Returns node if value matches.
	 If not found, returns null
	 */
	//Uitility method tho find node
	public Node find(int value) {
		Node node = head;
		while( node != null) {
			if (node.value == value) {
				return node;
			}
			node = node.next;
		}
		return null;
	}
    
	// https://leetcode.com/problems/remove-duplicates-from-sorted-list
	/*
	 11. duplicates()
	 Purpose: Remove duplicates from a sorted list.
	 Explanation:
	 Starts at head.
	 Compares each node with its next.
	 If values match, skips next node.
	 Adjusts tail when done.
	 */
     public void duplicates() {
    	 Node node = head;
    	 while(head.next != null) {
    		 if(node.value == )
    			 
    	 }
     }

}