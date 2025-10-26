// 🧩 Problem: Can Place Flowers
// 🔗 Link   : http://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0;i<flowerbed.length;i++){
            if(flowerbed[i] == 0){
                boolean emptyLeft = (i == 0) || (flowerbed[i-1] == 0);
                boolean emptyRight = (i == flowerbed.length-1) || flowerbed[i+1] == 0;

                if(emptyRight && emptyLeft){
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count>=n;
    }
}