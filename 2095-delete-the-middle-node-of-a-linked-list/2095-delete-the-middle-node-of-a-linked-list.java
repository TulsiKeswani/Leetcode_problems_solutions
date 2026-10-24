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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int i = 1;
        while(temp.next != null){
            temp = temp.next;
            i++;
        }

        int mid = i / 2;

        if(mid == 0){
            head = null;
            return head;
        }
        temp = head;
        i = 0;
        while(i < mid-1){
            temp = temp.next;
            i++;
        }

        temp.next = temp.next.next;

        return head;
    }
}