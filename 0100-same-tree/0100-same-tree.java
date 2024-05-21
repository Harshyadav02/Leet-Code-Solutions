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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        StringBuilder pTree = new StringBuilder();
        checkTree(p, pTree);
        
        StringBuilder qTree = new StringBuilder();
        checkTree(q, qTree);
       
        return pTree.toString().equals(qTree.toString());
    }

    private void checkTree(TreeNode root,StringBuilder sb){

        if(root==null){
            sb.append(" ");
            return ;
        }
        sb.append(root.val);
        checkTree(root.left,sb);
        checkTree(root.right,sb);
    }
}