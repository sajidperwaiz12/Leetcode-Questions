//You are given an m x n integer matrix matrix with the following two 
//properties: 
//
// 
// Each row is sorted in non-decreasing order. 
// The first integer of each row is greater than the last integer of the 
//previous row. 
// 
//
// Given an integer target, return true if target is in matrix or false 
//otherwise. 
//
// You must write a solution in O(log(m * n)) time complexity. 
//
// 
// Example 1: 
// 
// 
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
//Output: true
// 
//
// Example 2: 
// 
// 
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
//Output: false
// 
//
// 
// Constraints: 
//
// 
// m == matrix.length 
// n == matrix[i].length 
// 1 <= m, n <= 100 
// -10⁴ <= matrix[i][j], target <= 10⁴ 
// 
//
// Related Topics Array Binary Search Matrix 👍 11507 👎 337


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // finding possible row where my answer could be
        int r = findRow(matrix, target);

        if (r == -1) {
            return false;
        }

        // since r != -1, there might be possible element
        return search(matrix[r], target);
    }

    public boolean search(int[] matrix, int target) {
        int si = 0;
        int ei = matrix.length - 1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (target == matrix[mid]) {
                return true;
            } else if (target > matrix[mid]) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }

        return false;
    }

    public static int findRow(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;

        while (r < matrix.length) {
            if (matrix[r][c] < target) {
                r++;
            } else {
                return r;
            }
        }

        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
