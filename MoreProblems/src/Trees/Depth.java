package Trees;

public class Depth {

	public static int getDepth(TreeNode root, TreeNode curr) {
		if (root == null) {
			return -1;
		} else {
			int depth = 0;
			TreeNode temp = root;
			while (!temp.equals(curr)) {
				if (temp.data < curr.data) {
					temp = temp.right;
				} else {
					temp = temp.left;
				}
				depth++;
			}
			return depth;
		}
	}
	
	public static void main(String[] args) {
		TreeNode a = new TreeNode(40);
		TreeNode b = new TreeNode(25);
		TreeNode c = new TreeNode(50);
		TreeNode d = new TreeNode(20);
		TreeNode e = new TreeNode(35);
		TreeNode f = new TreeNode(55);
		TreeNode g = new TreeNode(22);
		TreeNode h = new TreeNode(38);
		TreeNode i = new TreeNode(36);
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		d.left = g;
		e.right = h;
		h.left = i;
		c.right = f;
		System.out.println(getDepth(a, h));
		
	}
	
	
}
