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
    public long kthLargestLevelSum(TreeNode root, int k) {
        ArrayList<Long> list = new ArrayList<>();
        calculateLevelSum(root,0,list);
        Collections.sort(list,Collections.reverseOrder());
        if (k > list.size()) return -1;
        return list.get(k - 1);
    }

    private void calculateLevelSum(TreeNode root,int level,ArrayList<Long> list){
        long sum=0;
        if(root==null){
            return ;
        }
        if(level==list.size()){
            list.add(root.val+sum);
        }else {
            list.set(level, list.get(level) + root.val);
        }
        calculateLevelSum(root.left,level+1,list);
        calculateLevelSum(root.right,level+1,list);

    }
}