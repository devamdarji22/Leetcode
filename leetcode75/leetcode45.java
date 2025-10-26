// 🧩 Problem: Reorder Routes to Make All Paths Lead to the City Zero
// 🔗 Link   : http://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    int ans = 0;
    boolean[] visited;
    public int minReorder(int n, int[][] connections) {
        visited = new boolean[n];
        List<List<int[]>> adj = new ArrayList<>();
        for(int i = 0;i<n;i++){
            adj.add(new ArrayList<int[]>());
        }
        for(int i = 0;i<connections.length;i++){
            int from = connections[i][0];
            int to = connections[i][1];
            adj.get(from).add(new int[]{to, 1});
            adj.get(to).add(new int[]{from, 0});
        }
        dfs(adj, 0);
        return ans;
    }
    void dfs(List<List<int[]>> adj, int src){
        visited[src] = true;
        for(int[] next: adj.get(src)){
            int num = next[0];
            if(!visited[num]){
                ans += next[1];
                dfs(adj, num);
            }
        }
    }
}