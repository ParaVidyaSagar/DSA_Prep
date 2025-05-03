package SinglyLinkedList;

public class singleLinkedList {
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
  public static void main(String[] args) {
	
	  //creating individual Nodes
	  Node firstNode = new Node(3);
	  Node secondNode = new Node(5);
	  Node thirdNode = new Node(3);
	  Node fourthNode = new Node(2);
	  
	  // Linking Nodes together
	  firstNode.next = secondNode;
	  secondNode.next = thirdNode;
	  thirdNode.next = fourthNode;
	  
	  //Printing linked list
	  
	 Node currentNode = firstNode;
	 
	 while( currentNode != null) {

		 System.out.print(currentNode.data +"->");
		 currentNode = currentNode.next;
	 }
	 
	 System.out.print("null");
}

}
