package TreesAndGraphs;
import java.util.*;
public class RottingOranges {
    private static final int[][] directions =
            new int[][]{{-1, 0}, {0, -1}, {0, 1}, {1, 0}};

    public int orangesRotting(int[][] grid) {
        int count=0;
        boolean flag=false;
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<ArrayList<Integer>> queue = new ArrayDeque<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    arr.add(i);
                    arr.add(j);
                    queue.add(arr);
                }
            }
        }
        while (!queue.isEmpty()) {
            arr = new ArrayList<>();
            ArrayList<Integer> cell = queue.remove();
            for(int i=0;i<cell.size();i+=2){
                int row = cell.get(i);
                int col = cell.get(i+1);
                for (int[] neighbour : getNeighbours(row, col, grid)) {
                    int neighbourRow = neighbour[0];
                    int neighbourCol = neighbour[1];
                    if(grid[neighbourRow][neighbourCol]==1){
                        grid[neighbourRow][neighbourCol]=2;
                        arr.add(neighbourRow);
                        arr.add(neighbourCol);
                        queue.add(arr);
                        flag=true;
                    }

                }}
            if(flag==true){
                count++;
                flag=false;
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                //System.out.print(grid[i][j]);
                if(grid[i][j]==1){
                    return -1;
                }
            }
            //System.out.println();
        }

        return count;
    }

    private List<int[]> getNeighbours(int row, int col, int[][] grid) {
        List<int[]> neighbours = new ArrayList<>();
        for (int i = 0; i < directions.length; i++) {
            int newRow = row + directions[i][0];
            int newCol = col + directions[i][1];
            if (newRow < 0 || newCol < 0 || newRow >= grid.length
                    || newCol >= grid[0].length
                    || grid[newRow][newCol] == 2) {
                continue;
            }
            neighbours.add(new int[]{newRow, newCol});
        }
        return neighbours;
    }
}
