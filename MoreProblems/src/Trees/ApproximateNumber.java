package Trees;

import java.util.ArrayList;

public class ApproximateNumber {

	//This won't actually work.
	public static int findNumber(TreeNode curr, int target) {
		if (curr == null) {
				return -1; //actually need to throw an exception
		}
		if (curr.data == target) {
			return target;
		} else if (curr.data > target) {
			if (curr.left != null) {
				int currDiff = curr.data - target;
				int leftDiff = Math.abs(curr.left.data - target);
				if (leftDiff < currDiff) {
					return findNumber(curr.left, target);
				} else {
					return curr.data;
				}
			} else {
				return curr.data;
			}
		} else {
			if (curr.right != null) {
				int currDiff = Math.abs(curr.data - target);
				int rightDiff = Math.abs(curr.right.data - target);
				if (rightDiff < currDiff) {
					return findNumber(curr.right, target);
				} else {
					return curr.data;
				}
			} else {
				return curr.data;
			}
		}
	}
	
	public static int findNumber2(TreeNode root, int target) {
		if (root == null) {
			return -1;
		}
		ArrayList<Integer> treeList = new ArrayList<>();
		flattenTree(root, treeList);
		
		int[] differences = new int[treeList.size()];
		int min = 0;
		for (int i = 0; i < treeList.size(); i++) {
			differences[i] = Math.abs(treeList.get(i) - target);
			if (differences[i] < differences[min]) {
				min = i;
			}
		}
		
		return treeList.get(min);
	}
	
	public static int findNumber3(TreeNode root, int target) {
		if (root == null) {
			return -1;
		}
		ArrayList<Integer> treeList = new ArrayList<>();
		TreeNode temp = root;
		while (temp != null && temp.data != target) {
			treeList.add(temp.data);
			if (temp.data == target) {
				return temp.data;
			}
			if (temp.data > target) {
				temp = temp.left;
			} else {
				temp = temp.right;
			}
		}
		
		int[] differences = new int[treeList.size()];
		int min = 0;
		for (int i = 0; i < treeList.size(); i++) {
			differences[i] = Math.abs(treeList.get(i) - target);
			if (differences[i] < differences[min]) {
				min = i;
			}
		}
		
		return treeList.get(min);
		
	}
	
	private static void flattenTree(TreeNode root, ArrayList<Integer> treeList) {
		if (root == null) {
			return;
		}
		flattenTree(root.left, treeList);
		treeList.add(root.data);
		flattenTree(root.right, treeList);
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
		//System.out.println(findNumber(a, 38));
		//System.out.println(findNumber2(a, 53));
		System.out.println(findNumber2(a, 52));
	}
	
}
