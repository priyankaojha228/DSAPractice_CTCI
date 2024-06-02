package TreesAndGraphs;
import java.util.*;
public class TopologicalSorting {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] order = new int[numCourses];
        int[] indegree = new int[numCourses];
        Queue<Integer> q = new LinkedList<>();
        int index=0;
        for(int i=0;i<prerequisites.length;i++){
            indegree[prerequisites[i][0]]++;
        }
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
                order[index]=i;
                index++;
            }
        }
        while(!q.isEmpty()){
            int val = q.poll();
            for (int i = 0; i < prerequisites.length; i++)  {
                if (prerequisites[i][1] == val) {
                    indegree[prerequisites[i][0]]--;
                    if (indegree[prerequisites[i][0]] == 0) {
                        order[index++] = prerequisites[i][0];
                        q.add(prerequisites[i][0]);
                    }
                }
            }
        }
        return (index==numCourses)?order:new int[0];

    }
}
