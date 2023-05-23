//Given the head of a linked list and an integer val, remove all the nodes of 
//the linked list that has Node.val == val, and return the new head. 
//
// 
// Example 1: 
// 
// 
//Input: head = [1,2,6,3,4,5,6], val = 6
//Output: [1,2,3,4,5]
// 
//
// Example 2: 
//
// 
//Input: head = [], val = 1
//Output: []
// 
//
// Example 3: 
//
// 
//Input: head = [7,7,7,7], val = 7
//Output: []
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range [0, 10⁴]. 
// 1 <= Node.val <= 50 
// 0 <= val <= 50 
// 
//
// Related Topics Linked List Recursion 👍 7228 👎 209


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

    // Approach1 - Iterative
//    public ListNode removeElements(ListNode head, int val) {
//        ListNode dummy = new ListNode(-1);
//        ListNode temp = dummy;
//        while (head != null) {
//            if (head.val != val) {
//                temp.next = head;
//                temp = head;
//            }
//            head= head.next;
//        }
//        if (temp.next != null) {
//            temp.next = null;
//        }
//
//        return dummy.next;
//    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        head.next = removeElements(head.next, val);
        if (head.val != val) {
            return head;
        } else {
            return head.next;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
