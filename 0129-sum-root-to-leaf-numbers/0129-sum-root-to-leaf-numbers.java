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
    public int sumNumbers(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        calSum(root,0,list);
        int sum = 0;
        for(int num:list){

            sum += num;
        }
        return sum;
    }
    private void calSum(TreeNode root,int sum, ArrayList<Integer>list){

        if(root==null){
            return;
        }
        
        sum = sum *10 +root.val;
        if(root.left==null && root.right==null){
            list.add(sum);
            return;
        }
        
        calSum(root.left,sum,list);
        calSum(root.right,sum,list);
    }
}