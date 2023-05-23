//Given a positive integer n, generate an n x n matrix filled with elements 
//from 1 to n² in spiral order. 
//
// 
// Example 1: 
// 
// 
//Input: n = 3
//Output: [[1,2,3],[8,9,4],[7,6,5]]
// 
//
// Example 2: 
//
// 
//Input: n = 1
//Output: [[1]]
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 20 
// 
//
// Related Topics Array Matrix Simulation 👍 4719 👎 205


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];

        int rs = 0, re = n - 1;
        int cs = 0, ce = n - 1;
        int numsElement = n * n;

        int count = 1;
        while (count <= numsElement) {
            for (int i = cs; count <= numsElement && i <= ce; i++) {
                ans[rs][i] = count++;
            }
            rs++;

            for (int i = rs; count <= numsElement && i <= re; i++) {
                ans[i][ce] = count++;
            }
            ce--;

            for (int i = ce; count <= numsElement && i >= cs; i--) {
                ans[re][i] = count++;
            }
            re--;

            for (int i = re; count <= numsElement && i >= rs; i--) {
                ans[i][cs] = count++;
            }
            cs++;
        }

        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
