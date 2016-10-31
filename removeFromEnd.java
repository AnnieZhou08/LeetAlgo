/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode newHead = new ListNode (0);
       newHead.next = head;
       ListNode p = newHead, runner = newHead;
       
       if (head.next == null){
           return null;
       }
       
       //runner pointer runs n+1 steps ahead of p, to maintain this gap 
       for (int i = 0; i < n+1; i++){
           runner = runner.next;
       }
       
       while (runner != null){
           runner = runner.next;
           p = p.next;
       }
       //when runner reaches the end, we know that we need to rewire the pointers
       p.next = p.next.next;
       
       return newHead.next;
    }
}