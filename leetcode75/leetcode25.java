// 🧩 Problem: Asteroid Collision
// 🔗 Link   : https://leetcode.com/problems/asteroid-collision/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int a: asteroids){
            if(a>0) stack.push(a);
            else {
                while(!stack.isEmpty() && stack.peek() >0 &&
                        stack.peek()<-a){
                    stack.pop();
                }
                if(stack.isEmpty() || stack.peek()<0){
                    stack.push(a);
                }
                if(stack.peek()==-a){
                    stack.pop();
                }
            }
        }
        int ans[] = new int[stack.size()];
        int i = 0;
        for(int num: stack){
            ans[i++] = num;
        }
        return ans;
    }
}