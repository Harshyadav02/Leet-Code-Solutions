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
    public boolean isUnivalTree(TreeNode root) {
        if(root==null){
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        checkVal(root,set);
        if(set.size() == 1){
            return true;
        }
        return false;
    }
    private void checkVal(TreeNode root, HashSet<Integer> set){

        if(root==null){
            return;
        }
       
        set.add(root.val);
        checkVal(root.left,set);
        checkVal(root.right,set);
    }
}