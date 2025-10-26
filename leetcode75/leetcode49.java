// 🧩 Problem: Kth Largest Element in an Array
// 🔗 Link   : https://leetcode.com/problems/kth-largest-element-in-an-array/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap
                = new PriorityQueue<>();
        for(int num: nums){
            minHeap.add(num);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.poll();
    }
}