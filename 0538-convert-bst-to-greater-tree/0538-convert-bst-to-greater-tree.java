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
    private int currentSum = 0;
    public TreeNode convertBST(TreeNode root) {
        
        reverseInOrder(root);
        return root;
    }
    private void reverseInOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        
        reverseInOrder(node.right);

        // System.out.println(node.val);
        
        currentSum += node.val;
        node.val = currentSum;
        // System.out.println(node.val);
        
        reverseInOrder(node.left);
    }
}