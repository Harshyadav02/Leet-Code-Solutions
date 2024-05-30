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
        
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        preOrder(root,list,sb);
        return list;
    }

    private void preOrder(TreeNode root, List<String> list, StringBuilder sb){

        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            list.add(sb.append(root.val).toString());
            return;
        }
        int sbLength = sb.length();
        
        preOrder(root.left,list,sb.append(root.val).append("->"));
        sb.setLength(sbLength);
        preOrder(root.right,list,sb.append(root.val).append("->"));
        sb.setLength(sbLength);
    }
}