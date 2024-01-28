package TreesAndGraphs.DFSLeetcode;
import java.util.*;

/*Given a directed acyclic graph (DAG) of n nodes labeled from 0 to n - 1, find all possible paths from node 0 to node n - 1 and return them in any order.

The graph is given as follows: graph[i] is a list of all nodes you can visit from node i (i.e., there is a directed edge from node i to node graph[i][j])

Input: graph = [[1,2],[3],[3],[]]
Output: [[0,1,3],[0,2,3]]
Explanation: There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.*/
public class AllPathsFromSourcetoDestination {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        if(graph==null || graph.length==0){
            return result;
        }
        List<Integer> curr = new ArrayList<>();
        dfs(graph,0,result,curr);
        return result;

    }
    public void dfs(int[][] graph, int node, List<List<Integer>> result, List<Integer> curr ){
        curr.add(node);
        if(node==graph.length-1){
            result.add(new ArrayList<>(curr));
            return;
        }
        int[] n= graph[node];
        for(int i:n){

            dfs(graph,i,result,curr);
            curr.remove(curr.size()-1);

        }
    }
}
