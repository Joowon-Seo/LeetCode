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
// 현재 노드에서 N번 만큼 다음 노드로 갔을 때의 값이 null 이라면 현재 노드가 삭제되어야 할 노드 입니다.
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
