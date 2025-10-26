// 🧩 Problem: Successful Pairs of Spells and Potions
// 🔗 Link   : https://leetcode.com/problems/successful-pairs-of-spells-and-potions/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];
        Arrays.sort(potions);
        for(int i = 0;i<n;i++){
            int spell = spells[i];
            int left = 0;
            int right = m - 1;
            while(left<=right){
                int mid = (left + right)/2;
                long product = (long) spell * potions[mid];
                if(product>=success){
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            pairs[i] = m - left;
        }
        return pairs;
    }
}