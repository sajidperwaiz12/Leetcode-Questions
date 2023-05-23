//Given a square matrix mat, return the sum of the matrix diagonals. 
//
// Only include the sum of all the elements on the primary diagonal and all the 
//elements on the secondary diagonal that are not part of the primary diagonal. 
//
// 
// Example 1: 
// 
// 
//Input: mat = [[1,2,3],
//              [4,5,6],
//              [7,8,9]]
//Output: 25
//Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
//Notice that element mat[1][1] = 5 is counted only once.
// 
//
// Example 2: 
//
// 
//Input: mat = [[1,1,1,1],
//              [1,1,1,1],
//              [1,1,1,1],
//              [1,1,1,1]]
//Output: 8
// 
//
// Example 3: 
//
// 
//Input: mat = [[5]]
//Output: 5
// 
//
// 
// Constraints: 
//
// 
// n == mat.length == mat[i].length 
// 1 <= n <= 100 
// 1 <= mat[i][j] <= 100 
// 
//
// Related Topics Array Matrix 👍 1954 👎 27


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        sum += firstDiagonal(mat);
        sum += secondDiagonal(mat);
        if (mat.length % 2 != 0) {
            sum -= mat[mat.length / 2][mat.length / 2];
        }
        return sum;
    }

    public int firstDiagonal(int[][] mat) {
        int i = 0;
        int j = 0;
        int sum = 0;
        while (i < mat.length && j < mat[0].length) {
            sum += mat[i][j];
            i++;
            j++;
        }
        return sum;
    }

    public int secondDiagonal(int[][] mat) {
        int i = 0;
        int j = mat[0].length - 1;
        int sum = 0;
        while (i < mat.length && j >= 0) {
            sum += mat[i][j];
            i++;
            j--;
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
