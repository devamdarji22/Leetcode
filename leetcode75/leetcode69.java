// 🧩 Problem: Minimum Flips to Make a OR b Equal to c
// 🔗 Link   : https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int minFlips(int a, int b, int c) {
        int flip = 0;
        for(int i = 0;i < 32;i++){
            int bitA = (a>>i) & 1;
            int bitB = (b>>i) & 1;
            int bitC = (c>>i) & 1;
            if(bitC == 0){
                if(bitA == 1) flip++;
                if(bitB == 1) flip++;
            }
            else {
                if(bitA == 0 && bitB == 0) flip++;
            }
        }
        return flip;
    }
}