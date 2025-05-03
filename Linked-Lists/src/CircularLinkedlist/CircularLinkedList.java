package CircularLinkedlist;

public class CircularLinkedList {
	
	static class Node{
		int data;
		Node next;
		Node (int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public static void main(String[] args) {
		Node node1 =new Node(3);
		Node node2 =new Node(4);
		Node node3 =new Node(7);
		Node node4 = new Node(8); // circular Link
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node1;
		
		
		Node currentNode = node1;// intialvalue 3
		Node startNode = node1;// intialvalue 3
		System.out.print(currentNode.data + "->"); // 3 ->
		currentNode = currentNode.next;// node1.next = node2
		while( currentNode != startNode) // node2 != node1 -- 4 != 3 = true
		{
			System.out.print(currentNode.data + "->");
			currentNode = currentNode.next;
		}
		System.out.print("......");// indicate the loops back
		
		
		
	}

}
