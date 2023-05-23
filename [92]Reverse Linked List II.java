//Given the head of a singly linked list and two integers left and right where 
//left <= right, reverse the nodes of the list from position left to position 
//right, and return the reversed list. 
//
// 
// Example 1: 
// 
// 
//Input: head = [1,2,3,4,5], left = 2, right = 4
//Output: [1,4,3,2,5]
// 
//
// Example 2: 
//
// 
//Input: head = [5], left = 1, right = 1
//Output: [5]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is n. 
// 1 <= n <= 500 
// -500 <= Node.val <= 500 
// 1 <= left <= right <= n 
// 
//
// 
//Follow up: Could you do it in one pass?
//
// Related Topics Linked List 👍 8977 👎 408


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.List;

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        ListNode temp = head;
        ListNode startNode = findNode(head, left);
        ListNode endNode = findNode(head, right);

        while (temp.next != startNode && temp != startNode) {
            temp = temp.next;
        }

        ListNode curr = startNode;
        ListNode fwd = null;
        ListNode prev = endNode.next;
        ListNode stop = endNode.next;
        while (curr != null && curr != stop) {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }

        if (temp != startNode) {
            temp.next = endNode;
        }
        if (left == 1) {
            head = endNode;
        }
        return head;
    }

    public ListNode findNode(ListNode head, int pos) {
        int i = 1;
        ListNode temp = head;
        while (i < pos) {
            temp = temp.next;
            i++;
        }
        return temp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
