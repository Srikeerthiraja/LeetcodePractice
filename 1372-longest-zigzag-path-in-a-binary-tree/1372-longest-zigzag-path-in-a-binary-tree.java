class Solution {

    private int maxZigZag = 0;

    public int longestZigZag(TreeNode root) {
        if (root == null)
            return 0;

        traverse(root.left, true, 1);
        traverse(root.right, false, 1);

        return maxZigZag;
    }

    private void traverse(TreeNode node, boolean isLeft, int length) {
        if (node == null)
            return;

        maxZigZag = Math.max(maxZigZag, length);

        if (isLeft) {
            traverse(node.right, false, length + 1);
            traverse(node.left, true, 1);
        } else {
            traverse(node.left, true, length + 1);
            traverse(node.right, false, 1);
        }
    }
}