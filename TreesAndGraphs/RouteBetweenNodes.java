package TreesAndGraphs;
import java.util.*;
class RouteBetweenNodes {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(source);
        visited.add(source);
        while(!queue.isEmpty()){
            int current = queue.poll();
            if(current==destination){
                return true;
            }
            for(int neighbor:adj.get(current)){
                if(!visited.contains(neighbor)){
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        return false;

    }
}
