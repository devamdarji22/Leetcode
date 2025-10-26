// 🧩 Problem: Keys and Rooms
// 🔗 Link   : https://leetcode.com/problems/keys-and-rooms/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    boolean[] visited;
    int count = 0;
    int n;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        n = rooms.size();
        visited = new boolean[n];
        dfs(rooms, 0);
        return count==n;
    }
    void dfs(List<List<Integer>> rooms, int room){
        if(visited[room]) return;
        visited[room] = true;
        count++;
        if(count == n) return;
        for(int key: rooms.get(room)){
            dfs(rooms, key);
        }
    }
}