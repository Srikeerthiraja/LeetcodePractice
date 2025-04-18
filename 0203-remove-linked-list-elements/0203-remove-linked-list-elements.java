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
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        if (head.val == val) {
            if (head.next == null) {
                head = null;
                return head;
            } else {
                ListNode temp = head.next;
                head.next = null;
                head = temp;
                head = removeElements(head, val);
            }
        } else {
            ListNode temp = head;
            while (temp.next != null) {
                if (temp.next.val == val) {
                    ListNode temp2 = temp.next.next;
                    temp.next.next = null;
                    temp.next = temp2;
                } else {
                    temp = temp.next;
                }
            }
            return head;
        }
        return head;
    }
}