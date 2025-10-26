// 🧩 Problem: Unique Number of Occurrences
// 🔗 Link   : https://leetcode.com/problems/unique-number-of-occurrences/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num: arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        HashSet<Integer> set = new HashSet<>(freq.values());
        return freq.size()==set.size();
    }
}