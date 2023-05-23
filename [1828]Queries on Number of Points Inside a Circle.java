//You are given an array points where points[i] = [xi, yi] is the coordinates 
//of the iᵗʰ point on a 2D plane. Multiple points can have the same coordinates. 
//
// You are also given an array queries where queries[j] = [xj, yj, rj] 
//describes a circle centered at (xj, yj) with a radius of rj. 
//
// For each query queries[j], compute the number of points inside the jᵗʰ 
//circle. Points on the border of the circle are considered inside. 
//
// Return an array answer, where answer[j] is the answer to the jᵗʰ query. 
//
// 
// Example 1: 
// 
// 
//Input: points = [[1,3],[3,3],[5,3],[2,2]], queries = [[2,3,1],[4,3,1],[1,1,2]]
//
//Output: [3,2,2]
//Explanation: The points and circles are shown above.
//queries[0] is the green circle, queries[1] is the red circle, and queries[2] 
//is the blue circle.
// 
//
// Example 2: 
// 
// 
//Input: points = [[1,1],[2,2],[3,3],[4,4],[5,5]], queries = [[1,2,2],[2,2,2],[4
//,3,2],[4,3,3]]
//Output: [2,3,2,4]
//Explanation: The points and circles are shown above.
//queries[0] is green, queries[1] is red, queries[2] is blue, and queries[3] is 
//purple.
// 
//
// 
// Constraints: 
//
// 
// 1 <= points.length <= 500 
// points[i].length == 2 
// 0 <= xi, yi <= 500 
// 1 <= queries.length <= 500 
// queries[j].length == 3 
// 0 <= xj, yj <= 500 
// 1 <= rj <= 500 
// All coordinates are integers. 
// 
//
// 
// Follow up: Could you find the answer for each query in better complexity 
//than O(n)? 
//
// Related Topics Array Math Geometry 👍 914 👎 72


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] arr = new int[queries.length];
        for (int circles = 0; circles < queries.length; circles++) {
            int p = 0;
            for (int pnts = 0; pnts < points.length; pnts++) {
                if ((int)Math.pow(points[pnts][0] - queries[circles][0], 2) + (int)Math.pow(points[pnts][1] - queries[circles][1], 2) <= (int)Math.pow(queries[circles][2], 2)) {
                    p++;
                }
            }
            arr[circles] = p;
        }
        return arr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
