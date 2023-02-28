//An array arr a mountain if the following properties hold: 
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
// Given a mountain array arr, return the index i such that arr[0] < arr[1] < ..
//. < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1]. 
//
// You must solve it in O(log(arr.length)) time complexity. 
//
// 
// Example 1: 
//
// 
//Input: arr = [0,1,0]
//Output: 1
// 
//
// Example 2: 
//
// 
//Input: arr = [0,2,1,0]
//Output: 1
// 
//
// Example 3: 
//
// 
//Input: arr = [0,10,5,2]
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// 3 <= arr.length <= 10⁵ 
// 0 <= arr[i] <= 10⁶ 
// arr is guaranteed to be a mountain array. 
// 
//
// Related Topics Array Binary Search 👍 4698 👎 1776


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int si = 0;
        int ei = arr.length - 1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            } else if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1]) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }

        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
