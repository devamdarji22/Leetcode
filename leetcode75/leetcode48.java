// 🧩 Problem: Rotting Oranges
// 🔗 Link   : https://leetcode.com/problems/rotting-oranges/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0)
            return 0;
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int countFresh = 0;
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(grid[i][j] ==2){
                    queue.add(new int[]{i,j});
                }
                else if(grid[i][j] == 1){
                    countFresh++;
                }
            }
        }
        if(countFresh == 0) return 0;
        int minCount = 0;
        int dirs[][] = new int[][]{
                {0,1},{1,0},{0,-1},{-1,0}
        };
        while(!queue.isEmpty()){
            minCount++;
            int size = queue.size();
            for(int i = 0;i<size;i++){
                int curr[] = queue.poll();
                for(int dir[]: dirs){
                    int x = curr[0] + dir[0];
                    int y = curr[1] + dir[1];
                    if(x < 0 || y < 0 ||
                            x >= rows || y >= cols)
                        continue;
                    if(grid[x][y] == 1){
                        grid[x][y] = 2;
                        queue.add(new int[]{x,y});
                        countFresh--;
                    }
                }
            }
        }
        return countFresh == 0 ? minCount-1 : -1;
    }
}