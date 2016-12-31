/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode fakehead = new ListNode(-1);
        fakehead.next = head;
        ListNode curr = head;
        ListNode prev = fakehead;
        
        while(curr != null){
            if (curr.val == val){
                prev.next = curr.next;
            }else{
                prev = prev.next;
            }
            curr = curr.next;
        }
        return fakehead.next;
        
    }
}