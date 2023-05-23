//Given two n x n binary matrices mat and target, return true if it is possible 
//to make mat equal to target by rotating mat in 90-degree increments, or false 
//otherwise. 
//
// 
// Example 1: 
// 
// 
//Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
//Output: true
//Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
// 
//
// Example 2: 
// 
// 
//Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
//Output: false
//Explanation: It is impossible to make mat equal to target by rotating mat.
// 
//
// Example 3: 
// 
// 
//Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
//Output: true
//Explanation: We can rotate mat 90 degrees clockwise two times to make mat 
//equal target.
// 
//
// 
// Constraints: 
//
// 
// n == mat.length == target.length 
// n == mat[i].length == target[i].length 
// 1 <= n <= 10 
// mat[i][j] and target[i][j] are either 0 or 1. 
// 
//
// Related Topics Array Matrix 👍 1145 👎 92


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int c0 = 0, c90 = 0, c180 = 0, c270 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (target[i][j] == mat[n - j - 1][i]) {
                    c90++;
                }
                if (target[i][j] == mat[n - i - 1][n - j - 1]) {
                    c180++;
                }
                if (target[i][j] == mat[j][n - i - 1]) {
                    c270++;
                }
                if (target[i][j] == mat[i][j]) {
                    c0++;
                }
            }
        }

        if (c0 == n * n || c90 == n * n || c180 == n * n || c270 == n * n) {
            return true;
        }

        return false;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
