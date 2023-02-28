//(This problem is an interactive problem.) 
//
// You may recall that an array arr is a mountain array if and only if: 
//
// 
// arr.length >= 3 
// There exists some i with 0 < i < arr.length - 1 such that: 
// 
// arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
// arr[i] > arr[i + 1] > ... > arr[arr.length - 1] 
// 
// 
//
// Given a mountain array mountainArr, return the minimum index such that 
//mountainArr.get(index) == target. If such an index does not exist, return -1. 
//
// You cannot access the mountain array directly. You may only access the array 
//using a MountainArray interface: 
//
// 
// MountainArray.get(k) returns the element of the array at index k (0-indexed).
// 
// MountainArray.length() returns the length of the array. 
// 
//
// Submissions making more than 100 calls to MountainArray.get will be judged 
//Wrong Answer. Also, any solutions that attempt to circumvent the judge will 
//result in disqualification. 
//
// 
// Example 1: 
//
// 
//Input: array = [1,2,3,4,5,3,1], target = 3
//Output: 2
//Explanation: 3 exists in the array, at index=2 and index=5. Return the 
//minimum index, which is 2. 
//
// Example 2: 
//
// 
//Input: array = [0,1,2,4,2,1], target = 3
//Output: -1
//Explanation: 3 does not exist in the array, so we return -1.
// 
//
// 
// Constraints: 
//
// 
// 3 <= mountain_arr.length() <= 10⁴ 
// 0 <= target <= 10⁹ 
// 0 <= mountain_arr.get(index) <= 10⁹ 
// 
//
// Related Topics Array Binary Search Interactive 👍 1826 👎 72


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakIndex = peakElement(mountainArr);
        if (search(target, mountainArr, true, 0, peakIndex) != -1) {
            return search(target, mountainArr, true, 0, peakIndex);
        } else {
            return search(target, mountainArr, false,  peakIndex + 1, mountainArr.length() - 1);
        }
    }

    public int peakElement(MountainArray moutainArray) {
        int si = 0;
        int ei = moutainArray.length() - 1;

        while (si < ei) {
            int mid = si + (ei - si) / 2;

            if (moutainArray.get(mid) > moutainArray.get(mid + 1)) {
                ei = mid;
            } else {
                si = mid + 1;
            }
        }

        return si;
    }

    public int search(int target, MountainArray mountainArray, Boolean isAsc, int si, int ei) {
        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (mountainArray.get(mid) == target) {
                return mid;
            }

            if (isAsc) {
                if (target > mountainArray.get(mid)) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }
            } else {
                if (target < mountainArray.get(mid)) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }
            }
        }

        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
