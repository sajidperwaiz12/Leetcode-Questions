//There is an integer array nums sorted in ascending order (with distinct 
//values). 
//
// Prior to being passed to your function, nums is possibly rotated at an 
//unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k]
//, nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For 
//example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0
//,1,2]. 
//
// Given the array nums after the possible rotation and an integer target, 
//return the index of target if it is in nums, or -1 if it is not in nums. 
//
// You must write an algorithm with O(log n) runtime complexity. 
//
// 
// Example 1: 
// Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
// 
// Example 2: 
// Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1
// 
// Example 3: 
// Input: nums = [1], target = 0
//Output: -1
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 5000 
// -10⁴ <= nums[i] <= 10⁴ 
// All values of nums are unique. 
// nums is an ascending array that is possibly rotated. 
// -10⁴ <= target <= 10⁴ 
// 
//
// Related Topics Array Binary Search 👍 20055 👎 1205


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        int pivotIndex = pivotIndex(nums);
        if (pivotIndex == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        if (nums[pivotIndex] == target) {
            return pivotIndex;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivotIndex - 1);
        }

        return binarySearch(nums, target, pivotIndex + 1, nums.length - 1);
    }

    public int pivotIndex(int[] nums) {
        int si = 0;
        int ei = nums.length - 1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (mid < ei && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > si && nums[mid] < nums[mid - 1]) {
                return mid;
            }
            if (nums[mid] <= nums[si]) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }

        return -1;
    }

    public int binarySearch(int[] nums, int target, int si, int ei) {
        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }

        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
