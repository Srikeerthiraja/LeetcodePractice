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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> wrap=new LinkedList<>();
        levelMaker(wrap,root,0);
        return wrap;

        
    }
    public void levelMaker(List<List<Integer>> list, TreeNode root, int level){
        if(root==null) return;
        if(level>= list.size()){
            list.add(0,new LinkedList<Integer>());
        }
        levelMaker(list,root.left,level+1);
        levelMaker(list,root.right,level+1);
        list.get(list.size()-level-1).add(root.val);
    }
}