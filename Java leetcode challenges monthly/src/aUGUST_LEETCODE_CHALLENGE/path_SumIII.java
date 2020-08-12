package aUGUST_LEETCODE_CHALLENGE;

import java.util.ArrayList;

public class path_SumIII {

	public class TreeNode {

		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {

			this.val = val;
			this.left = left;
			this.right = right;

		}

	}

	public class solution {

		ArrayList<Integer> ar = new ArrayList<Integer>();
		int counter = 0;

		public void work(TreeNode root, int sum) {

			if (root == null) {
				return;
			}

			ar.add(root.val);

			work(root.left, sum);
			work(root.right, sum);

			int temp = 0;

			for (int i = ar.size() - 1; i >= 0; i++) {

				if (ar.get(i) + temp == sum) {
					counter++;
				}

			}

			ar.remove(ar.size() - 1);
			
			return;

		}

	}
}
