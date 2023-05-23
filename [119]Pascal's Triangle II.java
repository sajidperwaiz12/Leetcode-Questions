//Given an integer rowIndex, return the rowIndexᵗʰ (0-indexed) row of the 
//Pascal's triangle. 
//
// In Pascal's triangle, each number is the sum of the two numbers directly 
//above it as shown: 
// 
// 
// Example 1: 
// Input: rowIndex = 3
//Output: [1,3,3,1]
// 
// Example 2: 
// Input: rowIndex = 0
//Output: [1]
// 
// Example 3: 
// Input: rowIndex = 1
//Output: [1,1]
// 
// 
// Constraints: 
//
// 
// 0 <= rowIndex <= 33 
// 
//
// 
// Follow up: Could you optimize your algorithm to use only O(rowIndex) extra 
//space? 
//
// Related Topics Array Dynamic Programming 👍 3684 👎 297


import java.util.ArrayList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 1) {
            ArrayList<Integer> ans = {1};
            return ans;
        }
        if (rowIndex == 2) {
            ArrayList<Integer> ans = {1, 1};
            return ans;
        }
        ArrayList<Integer> smallAns = getRow(rowIndex - 1);
        ArrayList<Integer> ans;
        ans.add(smallAns.get(0) + smallAns.get(0) + smallAns.get(smallAns.size() - 1) + smallAns.get(smallAns.size() - 1));
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
