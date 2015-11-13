package Trees;

public class Height {

	public static int getHeight(TreeNode root) {
		if (root == null) {
			return -1;
		} else {
			return 1+ Math.max(getHeight(root.left), getHeight(root.right));
		}
	}
	
	public static void main(String[] args) {
		TreeNode a = new TreeNode(5);
		TreeNode b = new TreeNode(5);
		TreeNode c = new TreeNode(5);
		TreeNode d = new TreeNode(5);
		TreeNode e = new TreeNode(5);
		TreeNode f = new TreeNode(5);
		TreeNode g = new TreeNode(5);
		TreeNode h = new TreeNode(5);
		TreeNode i = new TreeNode(5);
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		d.left = g;
		e.right = h;
		h.left = i;
		c.right = f;
		System.out.println(getHeight(a));
		
	}
	
}
