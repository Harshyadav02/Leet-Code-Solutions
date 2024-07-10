import java.util.ArrayList;

public class Solution {

    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }

        int[] result = new int[]{Integer.MAX_VALUE, -1};
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next = head.next.next;
        int nthNode = 2;
        ArrayList<Integer> nodeIndex = new ArrayList<>();

        while (next != null) {
            if ((prev.val < curr.val && curr.val > next.val) || (prev.val > curr.val && curr.val < next.val)) {
                nodeIndex.add(nthNode);
            }
            prev = curr;
            curr = next;
            next = next.next;
            nthNode += 1;
        }

        if (nodeIndex.size() < 2) {
            return new int[]{-1, -1};
        }

        for (int i = 1; i < nodeIndex.size(); i++) {
            int difference = nodeIndex.get(i) - nodeIndex.get(i - 1);
            result[0] = Math.min(result[0], difference);
        }

        result[1] = nodeIndex.get(nodeIndex.size() - 1) - nodeIndex.get(0);

        return result[0] == Integer.MAX_VALUE ? new int[]{-1, -1} : result;
    }
}
