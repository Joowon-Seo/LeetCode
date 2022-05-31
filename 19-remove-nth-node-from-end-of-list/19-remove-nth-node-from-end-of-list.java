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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null){
            return null;
        }

        ListNode result = new ListNode(0, head);
        ListNode cur = result;
        ListNode pre = null;
        while (true){

            ListNode cur2 = cur;
            for (int i = 0; i < n; i++) {
                cur2 = cur2.next;
            }
            if (cur2 == null){
                pre.next = cur.next;
                break;
            }

            pre = cur;
            cur = cur.next;

        }

        return result.next;
        
    }
}