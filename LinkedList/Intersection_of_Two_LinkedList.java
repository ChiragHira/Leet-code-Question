/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public static int length(ListNode head){
        int len = 0;
        while(head!=null){
            head = head.next;
            len++;
        }

        return len;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lA = length(headA);
        int lB = length(headB);
        int diff = 0;

        ListNode CA = null;
        ListNode CB = null;


        if(lA>lB){
            CA = headA;
            CB = headB;
            diff = lA-lB;
        }

        else{
            CA = headB;
            CB = headA;
            diff = lB-lA;
        }

        while(diff!=0){
            CA = CA.next;
            diff--;
        }

        while(CA!=null && CB!=null){
            if(CA==CB){
                return CA;
            }
            else{
                CA = CA.next;
                CB = CB.next;
            }
        }

        return null;
    }
}
