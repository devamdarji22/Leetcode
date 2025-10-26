// 🧩 Problem: Find Peak Element
// 🔗 Link   : https://leetcode.com/problems/find-peak-element/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left<right){
            int mid = (left + right)/2;
            if(nums[mid] > nums[mid+1]){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}