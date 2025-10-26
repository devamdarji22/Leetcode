// 🧩 Problem: Nearest Exit from Entrance in Maze
// 🔗 Link   : https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int rows = maze.length;
        int columns = maze[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(entrance);
        maze[entrance[0]][entrance[1]] = '+';

        int dirs[][] = new int[][]{
                {0, 1}, {0, -1}, {1, 0}, {-1, 0}
        };
        int steps = 0;
        int x, y;
        while(!queue.isEmpty()){
            steps++;
            int n = queue.size();
            for(int i = 0;i<n;i++){
                int[] curr = queue.poll();
                for(int[] dir: dirs){
                    x = curr[0] + dir[0];
                    y = curr[1] + dir[1];
                    if(x<0 || x>=rows || y<0 || y>=columns)
                        continue;
                    if(maze[x][y] == '+')
                        continue;
                    if(x==0 || x==rows-1 ||  y==0 || y==columns-1)
                        return steps;
                    maze[x][y] = '+';
                    queue.add(new int[]{x,y});
                }
            }
        }
        return -1;
    }
}