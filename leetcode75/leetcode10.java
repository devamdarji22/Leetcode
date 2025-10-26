// 🧩 Problem: Move Zeroes
// 🔗 Link   : https://leetcode.com/problems/move-zeroes/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        for(;i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}