package SinglyLinkedList;

public class FindingLowestValue {
	 
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static int findTheLowestValue(Node head){
		int minValue = head.data;//Node.data
		Node currentNode = head.next;// Node.next
		
		while (currentNode != null) {
			if(currentNode.data < minValue) {
				minValue = currentNode.data;
			}
			currentNode = currentNode.next;
		}
		return minValue;
	}
	
	
	public static void main(String[] args) {
		Node node1 = new Node(5);
		Node node2 = new Node(5);
		Node node3 = new Node(3);
		Node node4 = new Node(2);
		Node node5 = new Node(9);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		System.out.println("The lowest value in the Linked List is"+" "+findTheLowestValue(node1));
		
		
		
	}
	
	

}
