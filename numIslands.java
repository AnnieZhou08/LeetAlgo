public class Solution {
    /**
     * @param grid a boolean 2D matrix
     * @return an integer
     */
    private class Point{
        public int x, y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public int numIslands(boolean[][] grid) {
        // Write your code here
        int result = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j]){
                    Point p = new Point(i,j);
                    markByBFS(grid, p);
                    result++;
                }
            }
        }
        return result;
    }
    
    public void markByBFS(boolean[][] grid, Point p){
        int[] deltaX = {1, -1, 0, 0};
        int[] deltaY = {0, 0, 1, -1};
        
        Queue<Point> q = new LinkedList<>();
        q.offer(p);
        while(!q.isEmpty()){
            Point curr = q.poll();
            for(int i = 0; i < 4; i++){
                int newX = curr.x + deltaX[i];
                int newY = curr.y + deltaY[i];
                if(inBound(grid, newX, newY) && grid[newX][newY]){
                    grid[newX][newY] = false;
                    Point p1 = new Point(newX, newY);
                    q.offer(p1);
                }
            }
        }
    }
    
    public boolean inBound(boolean[][] grid, int x, int y){
        int numRows = grid.length;
        int numCols = grid[0].length;
        
        return x >= 0 && x < numRows && y >= 0 && y < numCols;
    }
}