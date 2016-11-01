/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newlist = null;
        ListNode head = null; //to keep track of the head of the merged list
        
        //if one of the list is null, return the other
        if(l1 == null){
            return l2;
        }
        else if(l2 == null){
            return l1;
        }
        
        
        while (l1 != null || l2 != null){
            
            if (l1 == null){
                newlist.next = new ListNode (l2.val);
                l2 = l2.next;
                newlist = newlist.next;
                continue;
            }
            else if (l2 == null){
                newlist.next = new ListNode (l1.val);
                l1 = l1.next;
                newlist = newlist.next;
                continue;
            }
            
           if (l1.val < l2.val){
                
                if (newlist == null){
                    newlist = new ListNode (l1.val);
                    head = newlist;
                }
                else { 
                    newlist.next = new ListNode (l1.val);
                    newlist = newlist.next;
                }
                l1 = l1.next;
            }
            
            else {
                if (newlist == null){
                    newlist = new ListNode (l2.val);
                    head = newlist;
                }
                else {
                    newlist.next = new ListNode (l2.val);
                    newlist = newlist.next;
                }
                l2 = l2.next;
            }
        
        
        }
    return head;
    }
}