package LinkedLists;

public class RevereseEveryOther {

	//Not right!
	public static Node reverseEveryOther(Node curr, int index) {
		if (curr == null || curr.next == null) {
			return curr;
		} else {
			if (index % 2 == 0) {
				Node second = curr.next;
				curr.next = null;
				Node nextNode = reverseEveryOther(second, index + 1);
				second.next = curr;
				return nextNode;
			}
			return curr;
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
		head = reverseEveryOther(a, 0);
		printList(head);
	}
	
}
