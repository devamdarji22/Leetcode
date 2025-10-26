// 🧩 Problem: Find Pivot Index
// 🔗 Link   : https://leetcode.com/problems/find-pivot-index/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0, rightSum = 0;
        for(int num: nums){
            rightSum += num;
        }
        for(int i = 0;i<nums.length;i++){
            rightSum-=nums[i];
            if(leftSum == rightSum) return i;
            leftSum+=nums[i];
        }
        return -1;
    }
}