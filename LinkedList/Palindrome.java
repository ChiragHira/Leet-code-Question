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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;

        //Converting linklist to ArrayList
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }

        //Two Pointer
        int low = 0;
        int high = list.size()-1;

        while(low<high){
            if(list.get(low)!=(list.get(high))){
                return false;
            }
            low++;
            high--;
        }

        return true;
    }
}
