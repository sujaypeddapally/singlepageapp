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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k ==0 )
        return head;
        int len=1;
        ListNode tail = head;
        while(tail.next!= null){
            tail= tail.next;
            len++;
        }
        k = k%len;
        if(k == len)
        return head;

        int steps = len -k;
        ListNode temp = head;
        while(steps!= 1){
            temp = temp.next;
            steps--;
        }
        tail.next = head;
        head= temp.next;
        temp.next = null;

        return head;
        
    }
}