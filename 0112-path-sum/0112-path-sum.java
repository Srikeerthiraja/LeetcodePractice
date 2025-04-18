class Solution {
    public boolean hasPathSum(TreeNode node, int tar) {
       if(node == null){
            return false;
        }

        if(node.left == null && node.right == null && tar - node.val == 0){
            return true;
        }

        tar -= node.val;

        return hasPathSum(node.left,tar) || hasPathSum(node.right,tar);
        }
}