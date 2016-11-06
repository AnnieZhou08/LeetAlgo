/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        
        while (current != null){
            if (previous == null){
                previous = current;
            }
            if (previous.val != current.val){
                previous.next = current;
                previous = current;
            }
            current = current.next;
        }
        
        previous.next = null;
        return head;
    }
}