//Given an integer array nums of length n where all the integers of nums are in 
//the range [1, n] and each integer appears once or twice, return an array of all 
//the integers that appears twice. 
//
// You must write an algorithm that runs in O(n) time and uses only constant 
//extra space. 
//
// 
// Example 1: 
// Input: nums = [4,3,2,7,8,2,3,1]
//Output: [2,3]
// 
// Example 2: 
// Input: nums = [1,1,2]
//Output: [1]
// 
// Example 3: 
// Input: nums = [1]
//Output: []
// 
// 
// Constraints: 
//
// 
// n == nums.length 
// 1 <= n <= 10⁵ 
// 1 <= nums[i] <= n 
// Each element in nums appears once or twice. 
// 
//
// Related Topics Array Hash Table 👍 8161 👎 302


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        sort(nums);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                arr.add(nums[i]);
            }
        }
        Collections.sort(arr);
        return arr;
    }

    public void sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (correctIndex == i || nums[correctIndex] == correctIndex + 1) {
                i++;
            } else {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
