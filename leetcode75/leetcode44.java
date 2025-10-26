// 🧩 Problem: Number of Provinces
// 🔗 Link   : https://leetcode.com/problems/number-of-provinces/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    boolean[] visited;
    int n;
    public int findCircleNum(int[][] isConnected) {
        int ans = 0;
        n = isConnected.length;
        visited = new boolean[n];
        for(int i = 0;i<n;i++){
            if(!visited[i]){
                ans++;
                dfs(isConnected, i);
            }
        }
        return ans;
    }
    void dfs(int[][] isConnected, int curr){
        visited[curr] = true;
        for(int i = 0;i<n;i++){
            if(isConnected[curr][i] == 1 &&
                    !visited[i]) {
                dfs(isConnected, i);
            }
        }
    }
}