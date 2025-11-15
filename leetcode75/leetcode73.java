// 🧩 Problem: Minimum Number of Arrows to Burst Balloons
// 🔗 Link   : https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(
                points,
                (a, b) -> Integer.compare(a[1], b[1])
        );
        int arrows = 1;
        int prevEnd = points[0][1];
        for(int i = 1;i<points.length;i++){
            if(points[i][0] > prevEnd){
                arrows++;
                prevEnd = points[i][1];
            }
        }
        return arrows;
    }
}