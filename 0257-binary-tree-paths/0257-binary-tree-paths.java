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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ls=new ArrayList<>();
        if(root==null) return ls;
        backtrack(root,ls,"");
        return ls;

    }
    public void backtrack(TreeNode root,List<String> ls, String s){
        if (root==null) return ;
        s=s+Integer.toString(root.val);
        if(root.left==null &&root.right==null){
            ls.add(s);

        }
        s=s+"->";
        backtrack(root.left,ls,s);
        backtrack(root.right,ls,s);
        

    }
    

}