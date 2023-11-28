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

    public ListNode reverse (ListNode middle){
        ListNode previous = null;
        ListNode current = middle;
        ListNode next = null;

        while(current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode current = head;

        if(head.next==null){
            return true;
        }

        ListNode slow= head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode middle = slow;
        ListNode tail = reverse(middle);

        while(tail!=current && tail!=null){
            if(tail.val!=current.val){
                return false;
            }
            tail = tail.next;
            current = current.next;
        }

        return true;

    }
}