// 🧩 Problem: Non-overlapping Intervals
// 🔗 Link   : https://leetcode.com/problems/non-overlapping-intervals/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int ans = 0;
        Arrays.sort(
                intervals,
                (a, b) -> a[1] -b[1]
        );
        int prevEnd = intervals[0][1];
        for(int i = 1;i<intervals.length;i++){
            if(prevEnd>intervals[i][0]){
                ans++;
            }
            else {
                prevEnd = intervals[i][1];
            }
        }
        return ans;
    }
}