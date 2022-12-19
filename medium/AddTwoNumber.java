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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode tempNode = result;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int addResult = 0;
            addResult += l1 != null ? l1.val : 0;
            addResult += l2 != null ? l2.val : 0;
            addResult += carry;
            
            carry = addResult/10;
            tempNode.next = new ListNode(addResult % 10);
            tempNode = tempNode.next;
            
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        if (carry != 0) {
            tempNode.next = new ListNode(1);
        }
        return result.next;
    }
}
// Runtime 2 ms Beats 98.63%
// Memory 42.6 MB Beats 80.16%