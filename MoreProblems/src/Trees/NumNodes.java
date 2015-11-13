package Trees;

public class NumNodes {

	public static int getNumNodes(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			int numNodes = 1;
			numNodes += getNumNodes(root.left);
			numNodes += getNumNodes(root.right);
			return numNodes;
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
		System.out.println(getNumNodes(b));
		
	}
	
}
