/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head;

        while (curr != null && curr.next != null) {
            ListNode next = curr.next;
            
            int gcd = findGCD(curr.val, next.val);

            curr = insertNode(curr, gcd);
        }

        return head;
    }

    private int findGCD(int val1, int val2) {
        while (val2 != 0) {
            int remainder = val1 % val2;
            val1 = val2;
            val2 = remainder;
        }
        return val1;
    }

    private ListNode insertNode(ListNode curr, int val) {
        ListNode gcdNode = new ListNode(val);  
        gcdNode.next = curr.next; 
        curr.next = gcdNode;  
        return gcdNode.next; 
    }
}
