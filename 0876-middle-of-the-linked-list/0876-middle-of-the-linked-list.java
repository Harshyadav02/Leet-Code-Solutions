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
    public ListNode middleNode(ListNode head) {
        
        int length = size(head);
        ListNode curr = head;
        
        
            
            int index = 0;

            while (index < length / 2) {
                curr = curr.next;
                index++;
            }

            return curr;
        
        
        
    }
    private static int size(ListNode head){
        
        
        ListNode curr = head ;
        int length = 0 ;
        
        while(curr != null){
            
            length ++ ;
            curr = curr.next ;
        }
        
        return length ;
    }
}