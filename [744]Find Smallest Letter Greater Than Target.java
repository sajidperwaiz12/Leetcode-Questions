//You are given an array of characters letters that is sorted in non-decreasing 
//order, and a character target. There are at least two different characters in 
//letters. 
//
// Return the smallest character in letters that is lexicographically greater 
//than target. If such a character does not exist, return the first character in 
//letters. 
//
// 
// Example 1: 
//
// 
//Input: letters = ["c","f","j"], target = "a"
//Output: "c"
//Explanation: The smallest character that is lexicographically greater than 
//'a' in letters is 'c'.
// 
//
// Example 2: 
//
// 
//Input: letters = ["c","f","j"], target = "c"
//Output: "f"
//Explanation: The smallest character that is lexicographically greater than 
//'c' in letters is 'f'.
// 
//
// Example 3: 
//
// 
//Input: letters = ["x","x","y","y"], target = "z"
//Output: "x"
//Explanation: There are no characters in letters that is lexicographically 
//greater than 'z' so we return letters[0].
// 
//
// 
// Constraints: 
//
// 
// 2 <= letters.length <= 10⁴ 
// letters[i] is a lowercase English letter. 
// letters is sorted in non-decreasing order. 
// letters contains at least two different characters. 
// target is a lowercase English letter. 
// 
//
// Related Topics Array Binary Search 👍 2660 👎 1965


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int si = 0;
        int ei = letters.length - 1;
        char ans = letters[0];

        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (target >= letters[mid]) {
                si = mid + 1;
            } else {
                ans = letters[mid];
                ei = mid - 1;
            }
        }

        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
