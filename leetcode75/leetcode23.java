// 🧩 Problem: Equal Row and Column Pairs
// 🔗 Link   : https://leetcode.com/problems/equal-row-and-column-pairs/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> rows = new HashMap<>();
        HashMap<String, Integer> cols = new HashMap<>();
        int ans = 0, n = grid.length;
        for(int i = 0;i<n;i++){
            StringBuilder row = new StringBuilder();
            StringBuilder col = new StringBuilder();
            for(int j = 0;j<n;j++){
                row.append(grid[i][j]);
                col.append(grid[j][i]);
                row.append("*");
                col.append("*");
            }
            String curr1 = row.toString(),
                    curr2 = col.toString();
            rows.put(curr1, rows.getOrDefault(curr1, 0)+1);
            cols.put(curr2, cols.getOrDefault(curr2, 0)+1);
        }
        for(String s: rows.keySet()){
            if(cols.containsKey(s)){
                ans += rows.get(s)*cols.get(s);
            }
        }
        return ans;
    }
}