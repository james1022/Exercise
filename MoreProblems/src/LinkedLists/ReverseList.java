package LinkedLists;

public class ReverseList {

	public static Node reverseList(Node curr) {
		if (curr == null || curr.next == null) {
			return curr;
		} else {
			Node second = curr.next;
			curr.next = null;
			Node nextNode = reverseList(second);
			second.next = curr;
			return nextNode;
		}
	}
	
	public static void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Node head = null;
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		head = a;
		printList(head);
		head = reverseList(a);
		printList(head);
	}
	
	
}
