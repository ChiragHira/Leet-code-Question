/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode current = node;
        ListNode next = node.next;

        int temp = current.val;
        current.val = next.val;
        next.val = temp;

        current.next = next.next;
        next.next = null;
        
    }
}
