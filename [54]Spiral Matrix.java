//Given an m x n matrix, return all elements of the matrix in spiral order. 
//
// 
// Example 1: 
// 
// 
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [1,2,3,6,9,8,7,4,5]
// 
//
// Example 2: 
// 
// 
//Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//Output: [1,2,3,4,8,12,11,10,9,5,6,7]
// 
//
// 
// Constraints: 
//
// 
// m == matrix.length 
// n == matrix[i].length 
// 1 <= m, n <= 10 
// -100 <= matrix[i][j] <= 100 
// 
//
// Related Topics Array Matrix Simulation 👍 10820 👎 1025


import java.util.ArrayList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int rowStart = 0;
        int rowEnd = m - 1;
        int colStart = 0;
        int colEnd = n - 1;

        int numsElement = m * n;
        int count = 0;
        while (count < numsElement) {
            for (int i = colStart; count < numsElement && i <= colEnd; i++) {
                ans.add(matrix[rowStart][i]);
                count++;
            }
            rowStart++;

            for (int i = rowStart; count < numsElement && i <= rowEnd; i++) {
                ans.add(matrix[i][colEnd]);
                count++;
            }
            colEnd--;

            for (int i = colEnd; count < numsElement && i >= colStart; i--) {
                ans.add(matrix[rowEnd][i]);
                count++;
            }
            rowEnd--;

            for (int i = rowEnd; count < numsElement && i >= rowStart; i--) {
                ans.add(matrix[i][colStart]);
                count++;
            }
            colStart++;
        }

        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
