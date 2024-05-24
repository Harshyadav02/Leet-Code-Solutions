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
    public boolean evaluateTree(TreeNode root) {
        
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            if(root.val==0){
                return false;
            }
            return true;
        }
        
        boolean leftAns = evaluateTree(root.left);
        boolean rightAns = evaluateTree(root.right);
        // System.out.println("leftAns "+leftAns);
        // System.out.println("RightAns "+rightAns);
        
        if(root.val==2){
            return leftAns || rightAns ;
        }
        return leftAns && rightAns ;
        
    }

}