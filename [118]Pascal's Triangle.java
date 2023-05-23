//Given an integer numRows, return the first numRows of Pascal's triangle. 
//
// In Pascal's triangle, each number is the sum of the two numbers directly 
//above it as shown: 
// 
// 
// Example 1: 
// Input: numRows = 5
//Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// 
// Example 2: 
// Input: numRows = 1
//Output: [[1]]
// 
// 
// Constraints: 
//
// 
// 1 <= numRows <= 30 
// 
//
// Related Topics Array Dynamic Programming 👍 9390 👎 305


import java.util.ArrayList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> a = new ArrayList<>(i + 1);
            for (int j = 0; j <= i; j++) {
                int val = combination(i, j);
                a.add(val);
            }
            arr.add(a);
        }
        return ArrayList.;
    }

    public int factorial(int n) {
        int fact = 1;
        while (n > 0) {
            fact *= n--;
        }
        return fact;
    }

    public int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
}
//leetcode submit region end(Prohibit modification and deletion)
