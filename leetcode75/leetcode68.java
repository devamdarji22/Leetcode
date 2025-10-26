// 🧩 Problem: Single Number
// 🔗 Link   : https://leetcode.com/problems/single-number/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int num:nums){
            ans = ans ^ num;
        }
        return ans;
    }
}