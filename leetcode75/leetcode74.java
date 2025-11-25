// 🧩 Problem: Daily Temperatures
// 🔗 Link   : https://leetcode.com/problems/daily-temperatures/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty()
                    && temperatures[i]
                    > temperatures[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }

        return result;
    }
}