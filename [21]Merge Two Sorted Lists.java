//You are given the heads of two sorted linked lists list1 and list2. 
//
// Merge the two lists in a one sorted list. The list should be made by 
//splicing together the nodes of the first two lists. 
//
// Return the head of the merged linked list. 
//
// 
// Example 1: 
// 
// 
//Input: list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]
// 
//
// Example 2: 
//
// 
//Input: list1 = [], list2 = []
//Output: []
// 
//
// Example 3: 
//
// 
//Input: list1 = [], list2 = [0]
//Output: [0]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in both lists is in the range [0, 50]. 
// -100 <= Node.val <= 100 
// Both list1 and list2 are sorted in non-decreasing order. 
// 
//
// Related Topics Linked List Recursion 👍 18040 👎 1673


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
    // Aproach1 - Extra space
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode ans = new ListNode(0);
//        ListNode temp = ans;
//
//        while (list1 != null && list2 != null) {
//            if (list1.val <= list2.val) {
//                temp.next = new ListNode(list1.val);
//                temp = temp.next;
//                list1 = list1.next;
//            } else {
//                temp.next = new ListNode(list2.val);
//                temp = temp.next;
//                list2 = list2.next;
//            }
//        }
//
//        if (list1 != null) {
//            temp.next = list1;
//        } else {
//            temp.next = list2;
//        }
//
//        return ans.next;
//    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode t1 = list1, t2 = list2;
        ListNode head = null, tail = null;

        if (t1.val <= t2.val) {
            head = t1;
            tail = t1;
            t1 = t1.next;
        } else {
            head = t2;
            tail = t2;
            t2 = t2.next;
        }

        while (t1 != null && t2 != null) {
            if (t1.val <= t2.val) {
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            } else {
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }

        if (t1 != null) {
            tail.next = t1;
        } else {
            tail.next = t2;
        }

        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
