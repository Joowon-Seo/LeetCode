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
        ListNode node = new ListNode(0);
        ListNode head = node;

        int carry = 0;

        while (l1 != null || l2 != null || carry !=0){
            ListNode cur = new ListNode(0);
            int sum = ((l1 == null)? 0:l1.val) + ((l2==null)? 0:l2.val) + carry;
            cur.val = sum%10;
            carry = sum/10;
            node.next = cur;
            node = cur;


            l1 = (l1 == null)? l1:l1.next;
            l2 = (l2 == null)? l2:l2.next;
        }

        return head.next;
    }
}