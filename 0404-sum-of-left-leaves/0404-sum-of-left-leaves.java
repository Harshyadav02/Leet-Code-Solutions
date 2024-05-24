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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        if(root==null){
            return 0;
        }
        
        // for leaf and the first condition is for a single node in tree
        if(root.left!=null && root.left.left==null && root.left.right==null){
            sum+=root.left.val;
            // System.out.println(sum);
            
        }
        sum+=sumOfLeftLeaves(root.left);
        // System.out.println("left ke baad "+sum);
        sum+=sumOfLeftLeaves(root.right);
        // System.out.println("right ke baad "+sum);
        return sum;
    }
}