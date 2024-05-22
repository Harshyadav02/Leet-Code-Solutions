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
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root==null){
            return 0;
        }
        int leftDia = diameterOfBinaryTree(root.left);
        int leftHeight=height(root.left);
        int rightDia = diameterOfBinaryTree(root.right);
        int rightHeight = height(root.right);
        int selfDia = leftHeight+rightHeight;
        return Math.max(selfDia , Math.max(leftDia,rightDia));

    }

    private int height(TreeNode root){

        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        return Math.max(leftHeight,rightHeight)+1;
    }
}