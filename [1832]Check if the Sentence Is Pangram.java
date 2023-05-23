//A pangram is a sentence where every letter of the English alphabet appears at 
//least once. 
//
// Given a string sentence containing only lowercase English letters, return 
//true if sentence is a pangram, or false otherwise. 
//
// 
// Example 1: 
//
// 
//Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//Output: true
//Explanation: sentence contains at least one of every letter of the English 
//alphabet.
// 
//
// Example 2: 
//
// 
//Input: sentence = "leetcode"
//Output: false
// 
//
// 
// Constraints: 
//
// 
// 1 <= sentence.length <= 1000 
// sentence consists of lowercase English letters. 
// 
//
// Related Topics Hash Table String 👍 2227 👎 48


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] count = new int[27];
        for (int i = 0; i < sentence.length(); i++) {
            count[sentence.charAt(i) - 96]++;
        }
        for (int i = 1; i < count.length; i++) {
            if (count[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
