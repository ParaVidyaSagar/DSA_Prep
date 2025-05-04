package SinglyLinkedList;

public class DeletingANode {

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void traveseAndPrint(Node node1) {
		// TODO Auto-generated method stub

		Node currentNode = node1;
		while (currentNode != null) {
			// System.out.print(currentNode+"->"); // prints hashcode
			System.out.print(currentNode.data + "->");
			currentNode = currentNode.next;
		}
		System.out.println("null");
	}

	public static Node deleteSpecificNode(Node head, Node nodeToDelete) {
		if (head == nodeToDelete) {
			return head.next;
		}
		Node currentNode = head;
		while (currentNode.next != null && currentNode.next != nodeToDelete) {
			currentNode = currentNode.next;
		}

		if (currentNode.next == null) {
			return head;
		}

		currentNode.next = currentNode.next.next;

		return head;

	}

	public static void main(String[] args) {
		Node node1 = new Node(6);
		Node node2 = new Node(12);
		Node node3 = new Node(18);
		Node node4 = new Node(24);
		Node node5 = new Node(32);
		Node node6 = new Node(40);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = null;
		node5.next = node6;
		System.out.println("Printing Lis Before deletion");
		traveseAndPrint(node1);

		// deleting node 3
		deleteSpecificNode(node1, node4);
		
		System.out.println("\nAfter deletion:");
		traveseAndPrint(node1);
	}

}


/*

Start
|
v
Is head == nodeToDelete?
| Yes
v
Return head.next (delete head)
|
v
End
|
No
|
v
Set current = head
|
v
Loop: While current.next != null AND current.next != nodeToDelete
   current = current.next
|
v
Is current.next == null?
| Yes
v
Node not found -> return head
|
v
End
|
No
|
v
current.next = current.next.next
|
v
Return head
|
v
End
*/