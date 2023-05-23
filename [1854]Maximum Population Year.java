//You are given a 2D integer array logs where each logs[i] = [birthi, deathi] 
//indicates the birth and death years of the iᵗʰ person. 
//
// The population of some year x is the number of people alive during that year.
// The iᵗʰ person is counted in year x's population if x is in the inclusive 
//range [birthi, deathi - 1]. Note that the person is not counted in the year that 
//they die. 
//
// Return the earliest year with the maximum population. 
//
// 
// Example 1: 
//
// 
//Input: logs = [[1993,1999],[2000,2010]]
//Output: 1993
//Explanation: The maximum population is 1, and 1993 is the earliest year with 
//this population.
// 
//
// Example 2: 
//
// 
//Input: logs = [[1950,1961],[1960,1971],[1970,1981]]
//Output: 1960
//Explanation: 
//The maximum population is 2, and it had happened in years 1960 and 1970.
//The earlier year between them is 1960. 
//
// 
// Constraints: 
//
// 
// 1 <= logs.length <= 100 
// 1950 <= birthi < deathi <= 2050 
// 
//
// Related Topics Array Counting 👍 938 👎 155


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] ans = new int[101];
        for (int i = 0; i < logs.length; i++) {
            ans[logs[i][0] - 1950]++;
            ans[logs[i][1] - 1950]--;
        }
        int count = 0;
        int max = -1;
        int index = 1;
        for (int i = 0; i < ans.length; i++) {
            count += ans[i];
            if (count > max) {
                max = count;
                index = i;
            }
        }

        return index + 1950;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
