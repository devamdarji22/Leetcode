// 🧩 Problem: N-th Tribonacci Number
// 🔗 Link   : https://leetcode.com/problems/n-th-tribonacci-number/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int tribonacci(int n) {
        if(n == 0 || n == 1) return n;
        if(n == 2) return 1;
        int first = 0;
        int second = 1;
        int third = 1;
        int i = 3;
        while(i++<=n){
            int temp = third;
            third += first + second;
            first = second;
            second = temp;
        }
        return third;
    }
}