//Given an array of integers nums sorted in non-decreasing order, find the 
//starting and ending position of a given target value. 
//
// If target is not found in the array, return [-1, -1]. 
//
// You must write an algorithm with O(log n) runtime complexity. 
//
// 
// Example 1: 
// Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
// 
// Example 2: 
// Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]
// 
// Example 3: 
// Input: nums = [], target = 0
//Output: [-1,-1]
// 
// 
// Constraints: 
//
// 
// 0 <= nums.length <= 10⁵ 
// -10⁹ <= nums[i] <= 10⁹ 
// nums is a non-decreasing array. 
// -10⁹ <= target <= 10⁹ 
// 
//
// Related Topics Array Binary Search 👍 15992 👎 378


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{firstPosition(nums, target), lastPosition(nums, target)};
    }

    public int firstPosition(int[] nums, int target) {
        int si = 0;
        int ei = nums.length - 1;
        int ans = -1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (target == nums[mid]) {
                ans = mid;
                ei = mid - 1;
            } else if (target > nums[mid]) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }

        return ans;
    }

    public int lastPosition(int[] nums, int target) {
        int si = 0;
        int ei = nums.length - 1;
        int ans = -1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (target == nums[mid]) {
                ans = mid;
                si = mid + 1;
            } else if (target > nums[mid]) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }

        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
