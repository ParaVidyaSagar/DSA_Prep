package SinglyLinkedList;

public class TraversalLinkedList {
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public static void traverseAndPrint(Node head) {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data+"->");
			currentNode = currentNode.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		Node node1 = new Node(3);
		Node node2 = new Node(7);
		Node node3 = new Node(14);
		Node node4 = new Node(21);
		Node node5 = new Node(28);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next= node5;
		traverseAndPrint(node1);
	}

}
