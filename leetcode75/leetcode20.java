// 🧩 Problem: Find the Difference of Two Arrays
// 🔗 Link   : https://leetcode.com/problems/find-the-difference-of-two-arrays/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> distinctNums1 = new HashSet<>();
        HashSet<Integer> distinctNums2 = new HashSet<>();
        for(int num: nums1){
            distinctNums1.add(num);
        }
        for(int num:nums2){
            distinctNums2.add(num);
        }
        for(int num:nums1){
            if(distinctNums2.contains(num)){
                distinctNums2.remove(num);
                distinctNums1.remove(num);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<Integer>(distinctNums1));
        ans.add(new ArrayList<Integer>(distinctNums2));
        return ans;
    }
}