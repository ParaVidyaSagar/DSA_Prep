package CircularDoublyLinkedList;

public class CircularDoublyLinkedList {
	
	static class Node{
		int data;
		Node prev;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	public static void main(String[] args) {
		Node node1 = new Node(4);
		Node node2 = new Node(8);
		Node node3 = new Node(12);
		Node node4 = new Node(16);
		
		node1.next = node2;
		node1.prev = node4;
		
		node2.next = node3;
		node2.prev = node1;
		
		node3.next = node4;
		node3.prev = node2;
		
		node4.next = node1;
		node4.prev = node3;
		
		System.out.println("\nTraversing Forward:");
		
		Node currentNode = node1;
		Node startNode = node1;
		System.out.print(currentNode.data+"->");
		currentNode = currentNode.next;
		
		while(currentNode != startNode) {
			System.out.print(currentNode.data+"->");
			currentNode = currentNode.next;
		}
		System.out.print("*****");
		System.out.println("\nTraversing Back:");
		currentNode = node4;
		startNode = node4;
		System.out.print(currentNode.data+"->");
		currentNode = currentNode.prev;
		while(currentNode != startNode) {
			System.out.print(currentNode.data+"->");
			currentNode = currentNode.prev;
		}
		System.out.print("*****");
		
	}

}
