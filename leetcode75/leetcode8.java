// 🧩 Problem: Increasing Triplet Subsequence
// 🔗 Link   : https://leetcode.com/problems/increasing-triplet-subsequence/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int num: nums){
            if(num<=min1) min1 = num;
            else if(num<=min2) min2 = num;
            else return true;
        }
        return false;
    }
}