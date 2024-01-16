/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    // Function to check if a linked list has a cycle
    public boolean hasCycle(ListNode head) {
        
        // HashMap to store visited nodes in the linked list
        HashMap<ListNode, Integer> hashMap = new HashMap<>();

        // Temporary pointer to traverse the linked list
        ListNode temp = head ;

        // Traverse the linked list
        while(temp  != null){

            // Check if the current node is already present in the HashMap
            if(hashMap.containsKey(temp)){
                // If the node is already visited, a cycle is detected
                return true ;
            }
            else{
                // If the node is not visited, add it to the HashMap
                hashMap.put(temp, 1);
                // Move to the next node in the linked list
                temp = temp.next ;
            }
        }

        // If the end of the linked list is reached and no cycle is detected
        return false ;
    }
}
