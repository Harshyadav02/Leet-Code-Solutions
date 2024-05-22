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
 * }*/

class Solution {
    public int sumNumbers(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        calSum(root, sb, list);
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
    
    private void calSum(TreeNode root, StringBuilder sb, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        sb.append(root.val);
        if (root.left == null && root.right == null) {
            list.add(Integer.valueOf(sb.toString()));
            sb.deleteCharAt(sb.length() - 1);
            return;
        }
        calSum(root.left, new StringBuilder(sb), list);
        calSum(root.right, new StringBuilder(sb), list);
        sb.deleteCharAt(sb.length() - 1);
    }
}
