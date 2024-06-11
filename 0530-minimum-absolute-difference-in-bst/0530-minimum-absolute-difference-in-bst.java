import java.util.*;

class Solution {
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            int diff = list.get(i) - list.get(i - 1);
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }
    
    private void inorder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
