// 🧩 Problem: Min Cost Climbing Stairs
// 🔗 Link   : https://leetcode.com/problems/min-cost-climbing-stairs/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int first = cost[0];
        int second = cost[1];
        if(n<=2) return Math.min(first, second);
        for(int i = 2;i<n;i++){
            int curr = cost[i]
                    + Math.min(first, second);
            first = second;
            second = curr;
        }
        return Math.min(first, second);
    }
}