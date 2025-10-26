// 🧩 Problem: Counting Bits
// 🔗 Link   : https://leetcode.com/problems/counting-bits/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        int offset = 1;
        for(int i = 1;i<=n;i++){
            if(offset * 2 == i) {
                offset = i;
            }
            ans[i] = ans[i-offset] +1;
        }
        return ans;
    }
}