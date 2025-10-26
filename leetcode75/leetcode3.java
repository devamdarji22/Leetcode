// 🧩 Problem: Kids With the Greatest Number of Candies
// 🔗 Link   : https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandy = 0;
        for(int candy: candies){
            maxCandy = Math.max(candy, maxCandy);
        }
        for(int i = 0;i<candies.length;i++){
            if(candies[i]+extraCandies>=maxCandy){
                result.add(true);
            }
            else result.add(false);
        }
        return result;
    }
}