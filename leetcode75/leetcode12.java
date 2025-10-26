// 🧩 Problem: Container With Most Water
// 🔗 Link   : https://leetcode.com/problems/container-with-most-water/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int max = 0;
        while(left<right){
            int currArea=Math.min(height[left],
                    height[right]) * (right-left);
            max = Math.max(max, currArea);
            if(height[left]<=height[right])
                left++;
            else right--;
        }
        return max;
    }
}