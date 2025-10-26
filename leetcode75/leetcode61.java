// 🧩 Problem: House Robber
// 🔗 Link   : https://leetcode.com/problems/house-robber/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        int first = 0;
        int second = 0;
        for(int num: nums){
            int temp = second;
            second = Math.max(second, first+num);
            first = temp;
        }
        return second;
    }
}