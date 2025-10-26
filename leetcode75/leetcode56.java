// 🧩 Problem: Koko Eating Bananas
// 🔗 Link   : https://leetcode.com/problems/koko-eating-bananas/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int pile:piles){
            high = Math.max(high, pile);
        }
        int ans = high;
        while(low<=high){
            int mid = low + (high - low)/2;
            long time = 0;
            for(int pile:piles){
                time += (long)(pile - 1)/mid + 1;
            }
            if(time<=h){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}