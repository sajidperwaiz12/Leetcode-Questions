//Given an integer n, return any array containing n unique integers such that 
//they add up to 0. 
//
// 
// Example 1: 
//
// 
//Input: n = 5
//Output: [-7,-1,1,3,4]
//Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
// 
//
// Example 2: 
//
// 
//Input: n = 3
//Output: [-1,0,1]
// 
//
// Example 3: 
//
// 
//Input: n = 1
//Output: [0]
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 1000 
// 
//
// Related Topics Array Math 👍 1637 👎 547


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sumZero(int n) {
        if (n == 1) {
            return new int[1];
        }
        int[] ans = new int[n];
        int i = 0;
        int a = 1;
        while (i <= n - 2) {
            ans[i++] = a;
            ans[i++] = -1 * a;
            a++;
        }
        if (i == n - 1) {
            ans[i] = 0;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
