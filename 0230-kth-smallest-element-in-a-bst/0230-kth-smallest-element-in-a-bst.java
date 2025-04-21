/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int count = 0; // Counter for visited nodes

    public int kthSmallest(TreeNode root, int k) {
        TreeNode result = helper(root, k);
        return result != null ? result.val : 0; // Return value or 0 if not found
    }

    private TreeNode helper(TreeNode root, int k) {
        if (root == null) return null;

        // Traverse left subtree
        TreeNode left = helper(root.left, k);
        if (left != null) return left; // If found in left subtree

        count++; // Increment count for current node
        if (count == k) return root; // Found k-th smallest

        // Traverse right subtree
        return helper(root.right, k);
    }
}