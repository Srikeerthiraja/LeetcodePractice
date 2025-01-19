/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next;
  
  
  }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode currNode = head;
        ListNode previousNode = null;
        while (currNode != null) {
            ListNode nextNodeAdress = currNode.next;
            currNode.next = previousNode;
            previousNode = currNode;
            currNode = nextNodeAdress;
        }
        return previousNode;
    }
}