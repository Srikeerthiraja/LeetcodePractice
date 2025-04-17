/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> tp = new ArrayList<>();
        helper(root,tp);
        return tp;}
        static void helper(TreeNode root,List<Integer> tp){
            if(root!=null){
                helper(root.left,tp);
                helper(root.right,tp);
                tp.add(root.val);
            }
        }
}