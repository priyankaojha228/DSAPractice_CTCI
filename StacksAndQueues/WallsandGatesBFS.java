package StacksAndQueues;
import java.util.*;

/**/
public class WallsandGatesBFS {
    private static final int empty = Integer.MAX_VALUE;
    private static final int wall = -1;
    private static final int gate = 0;
    private static final List<int[]> directions = Arrays.asList(
            new int[]{1,0}, new int[]{-1,0}, new int[]{0,1}, new int[]{0,-1});
    public void wallsAndGates(int[][] rooms) {

        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<rooms.length;i++){
            for(int j=0;j<rooms[0].length;j++){
                if(rooms[i][j]==0){
                    q.add(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty()){
            int[] point = q.poll();
            int row = point[0];
            int col = point[1];
            for(int[] direction:directions){
                int r = row+direction[0];
                int c = col+direction[1];
                if(r<0 || c<0 || r>=rooms.length || c>=rooms[0].length || rooms[r][c]!=empty){
                    continue;
                }
                rooms[r][c] = rooms[row][col]+1;
                q.add(new int[]{r,c});
            }

        }




    }
}
