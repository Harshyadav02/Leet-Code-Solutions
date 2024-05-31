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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer>list = new ArrayList<>();
        inorder(root,list);
        return createBST(list,0,list.size()-1);
    }
    
    private TreeNode createBST(ArrayList<Integer>list,int low, int high){

        if(low>high){
            return null;
        }
        int mid = (low+high)/2;

        TreeNode root = new TreeNode(list.get(mid));
        root.left = createBST(list,low,mid-1);
        root.right = createBST(list,mid+1,high);

        return root;
    }

    private void inorder(TreeNode root,ArrayList<Integer>list){

        if(root ==null){
            return;
        }

        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}