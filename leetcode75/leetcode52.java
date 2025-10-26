// 🧩 Problem: Total Cost to Hire K Workers
// 🔗 Link   : https://leetcode.com/problems/total-cost-to-hire-k-workers/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int i = 0;
        int j = costs.length - 1;
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        long ans = 0;
        while(k-- > 0){
            while(pq1.size() < candidates && i<=j){
                pq1.add(costs[i++]);
            }
            while(pq2.size() < candidates && i<=j){
                pq2.add(costs[j--]);
            }
            int t1 = pq1.size() > 0
                    ? pq1.peek() : Integer.MAX_VALUE;
            int t2 = pq2.size() > 0
                    ? pq2.peek() : Integer.MAX_VALUE;

            if(t1<=t2){
                ans += t1;
                pq1.poll();
            } else {
                ans += t2;
                pq2.poll();
            }
        }
        return ans;
    }
}