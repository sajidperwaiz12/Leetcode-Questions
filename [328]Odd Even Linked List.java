//Given the head of a singly linked list, group all the nodes with odd indices 
//together followed by the nodes with even indices, and return the reordered list. 
//
//
// The first node is considered odd, and the second node is even, and so on. 
//
// Note that the relative order inside both the even and odd groups should 
//remain as it was in the input. 
//
// You must solve the problem in O(1) extra space complexity and O(n) time 
//complexity. 
//
// 
// Example 1: 
// 
// 
//Input: head = [1,2,3,4,5]
//Output: [1,3,5,2,4]
// 
//
// Example 2: 
// 
// 
//Input: head = [2,1,3,5,6,4,7]
//Output: [2,3,6,7,1,5,4]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the linked list is in the range [0, 10⁴]. 
// -10⁶ <= Node.val <= 10⁶ 
// 
//
// Related Topics Linked List 👍 8308 👎 451


//leetcode submit region begin(Prohibit modification and deletion)
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

    // Approach1 - Extra space
//    public ListNode oddEvenList(ListNode head) {
//        ListNode odd = new ListNode(-1);
//        ListNode even = new ListNode(-1);
//
//        int i = 0;
//        ListNode newHead = odd, t = even;
//        while (head != null) {
//            if (i % 2 == 0) {
//                odd.next = head;
//                odd = head;
//                i++;
//            } else {
//                even.next = head;
//                even = head;
//                i++;
//            }
//            head = head.next;
//        }
//        if (even.next != null) {
//            even.next = null;
//        }
//        if (odd.next != null) {
//            odd.next = null;
//        }
//        odd.next = t.next;
//        return newHead.next;
//    }

    // Approach2 - Without extra space
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        ListNode oddHead = head, evenHead = head.next;
        ListNode odd = oddHead, even = evenHead;
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return oddHead;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
