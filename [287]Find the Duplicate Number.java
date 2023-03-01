//Given an array of integers nums containing n + 1 integers where each integer 
//is in the range [1, n] inclusive. 
//
// There is only one repeated number in nums, return this repeated number. 
//
// You must solve the problem without modifying the array nums and uses only 
//constant extra space. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,3,4,2,2]
//Output: 2
// 
//
// Example 2: 
//
// 
//Input: nums = [3,1,3,4,2]
//Output: 3
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 10⁵ 
// nums.length == n + 1 
// 1 <= nums[i] <= n 
// All the integers in nums appear only once except for precisely one integer 
//which appears two or more times. 
// 
//
// 
// Follow up: 
//
// 
// How can we prove that at least one duplicate number must exist in nums? 
// Can you solve the problem in linear runtime complexity? 
// 
//
// Related Topics Array Two Pointers Binary Search Bit Manipulation 👍 18308 👎 
//2627


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findDuplicate(int[] nums) {
        sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
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
