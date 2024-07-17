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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Set<Integer> set = new HashSet<>();
        Map<Integer,TreeNode> map = new HashMap<>();

        for(int[] arr:descriptions){

            int parent = arr[0];
            int child = arr[1];
            int isLeft = arr[2];

            set.add(child);

            TreeNode parentNode = map.getOrDefault(parent,new TreeNode(parent)) ;
            if(isLeft==1){
                parentNode.left = map.getOrDefault(child,new TreeNode(child));
                map.put(child,parentNode.left);
            }
            else{
                parentNode.right = map.getOrDefault(child,new TreeNode(child));
                map.put(child,parentNode.right);
            }
            map.put(parent,parentNode);
        }
        int root = -1;
        for(int[] arr:descriptions){
            if(!set.contains(arr[0])){
                root = arr[0];
                break;
            }
        }
        return map.getOrDefault(root,null);
        
    }
}