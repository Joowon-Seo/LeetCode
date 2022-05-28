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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode cur = head;
        int cnt = 0;

        while (cur != null && cnt != k){
            cur = cur.next;
            cnt++;
        }

        if (cnt == k){
            cur = reverseKGroup(cur, k);
            
            
            // cur : 헤드가 가르켜야 하는 곳
            while (cnt -- > 0){
                ListNode temp = head.next;
                head.next = cur;
                cur = head; // 다음 헤드가 가르켜야 하는 곳
                head = temp;
            }
            
            head = cur;

        }



        return head;
        
    }
}