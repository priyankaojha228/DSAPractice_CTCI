package StacksAndQueues;
import java.util.*;
/*Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.*/
public class NumberofIslandsBFS {
    public int numIslands(char[][] grid) {
        int count=0;

        if(grid.length==0 || grid[0].length==0){
            return 0;
        }
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count+=1;
                    q.add(new int[]{i,j});
                    grid[i][j]='0';
                    while(!q.isEmpty()){
                        int[] coordinates = q.poll();
                        int row = coordinates[0];
                        int col = coordinates[1];
                        if(row-1>=0 && grid[row-1][col]=='1'){
                            q.add(new int[]{row-1,col});
                            grid[row-1][col]='0';
                        }
                        if(col-1>=0 && grid[row][col-1]=='1'){
                            q.add(new int[]{row,col-1});
                            grid[row][col-1]='0';
                        }
                        if(row+1<grid.length && grid[row+1][col]=='1'){
                            q.add(new int[]{row+1,col});
                            grid[row+1][col]='0';
                        }
                        if(col+1<grid[0].length && grid[row][col+1]=='1'){
                            q.add(new int[]{row,col+1});
                            grid[row][col+1]='0';
                        }
                    }
                }
            }
        }


        return count;





    }
}
