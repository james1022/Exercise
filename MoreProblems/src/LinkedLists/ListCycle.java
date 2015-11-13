package LinkedLists;

public class ListCycle {

	public static boolean cycleExists(Node head) {
		if (head == null || head.next == null || head.next.next == null) {
			return false;
		}
		Node slow = head.next;
		Node fast = head.next.next;
		
		
		while (slow != fast && fast != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if (fast == null || fast.next == null) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = null;
		System.out.print(cycleExists(a));
	}
	
}
