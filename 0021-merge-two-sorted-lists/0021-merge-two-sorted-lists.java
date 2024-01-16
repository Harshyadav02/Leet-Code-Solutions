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
    // Function to merge two sorted linked lists
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        // Create a new ListNode to represent the merged list
        ListNode list = new ListNode();

        // Initialize a current pointer to the merged list
        ListNode curr = list ;

        // Traverse both input lists until one of them is exhausted
        while(list1 != null && list2 != null){

            // Compare values of the current nodes in list1 and list2
            if(list1.val <= list2.val){

                // If value in list1 is smaller, add it to the merged list
                curr.next = list1;
                list1 = list1.next ;
            }
            else{

                // If value in list2 is smaller, add it to the merged list
                curr.next = list2 ;
                list2 = list2.next ;
            }
            
            // Move the current pointer to the last node in the merged list
            curr = curr.next ;
        }

        // If there are remaining nodes in list1, add them to the merged list
        while(list1 != null){

            curr.next = list1 ;
            list1 = list1.next ;
            curr = curr.next ;
        }

        // If there are remaining nodes in list2, add them to the merged list
        while(list2 != null){

            curr.next = list2 ;
            list2 = list2.next ;
            curr = curr.next ;
        }

        // The merged list starts from the next of the initially created empty node
        return list.next ;
    }
}
