//The array-form of an integer num is an array representing its digits in left 
//to right order. 
//
// 
// For example, for num = 1321, the array form is [1,3,2,1]. 
// 
//
// Given num, the array-form of an integer, and an integer k, return the array-
//form of the integer num + k. 
//
// 
// Example 1: 
//
// 
//Input: num = [1,2,0,0], k = 34
//Output: [1,2,3,4]
//Explanation: 1200 + 34 = 1234
// 
//
// Example 2: 
//
// 
//Input: num = [2,7,4], k = 181
//Output: [4,5,5]
//Explanation: 274 + 181 = 455
// 
//
// Example 3: 
//
// 
//Input: num = [2,1,5], k = 806
//Output: [1,0,2,1]
//Explanation: 215 + 806 = 1021
// 
//
// 
// Constraints: 
//
// 
// 1 <= num.length <= 10⁴ 
// 0 <= num[i] <= 9 
// num does not contain any leading zeros except for the zero itself. 
// 1 <= k <= 10⁴ 
// 
//
// Related Topics Array Math 👍 3004 👎 248


import java.util.ArrayList;
import java.util.Collections;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
//        int carry = 0;
//
//        for (int i = num.length - 1; i >= 0; i--) {
//            ans.add(0, (num[i] + (k % 10) + carry) % 10);
//            carry = (num[i] + (k % 10) + carry) / 10;
//            k /= 10;
//        }
//        k = k + carry;
//        while (k > 0) {
//            ans.add(0, k % 10);
//            k /= 10;
//        }
//
//        return ans;

        int carry = k;
        int i = num.length - 1;
        while (i >= 0 || carry > 0) {
            if (i >= 0) {
                carry += num[i];
                i--;
            }
            ans.add(carry % 10);
            carry /= 10;
        }
        Collections.reverse(ans);
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
