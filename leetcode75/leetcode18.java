// 🧩 Problem: Find the Highest Altitude
// 🔗 Link   : https://leetcode.com/problems/find-the-highest-altitude/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int largestAltitude(int[] gain) {
        int currAltitude = 0,
                maxAltitude = 0;
        for(int g: gain){
            currAltitude+=g;
            maxAltitude = Math.max(currAltitude,
                    maxAltitude);
        }
        return maxAltitude;
    }
}