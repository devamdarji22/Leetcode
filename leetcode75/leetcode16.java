// 🧩 Problem: Max Consecutive Ones III
// 🔗 Link   : https://leetcode.com/problems/max-consecutive-ones-iii/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0;
        int zeroCount = 0;
        int ans= 0;
        while(right<nums.length){
            if(nums[right]==0) zeroCount++;
            while(zeroCount>k){
                if(nums[left] == 0) zeroCount--;
                left++;
            }
            ans = Math.max(ans, right-left+1);
            right++;
        }
        return ans;
    }
}