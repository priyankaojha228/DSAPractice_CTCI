package TreesAndGraphs;
import java.util.*;
public class KruskalAlgorithm {
    public int minCostConnectPoints(int[][] points) {

        int mincost=0;
        ArrayList<int []> edges = new ArrayList<>();
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                int w = Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1]);
                int[] arr = new int[]{w,i,j};
                edges.add(arr);
            }
        }
        Collections.sort(edges,(a,b)->Integer.compare(a[0],b[0]));
        UnionFind uf = new UnionFind(points.length);
        int edgeused=0;
        for(int i=0;i<edges.size() && edgeused<points.length-1;i++){
            if(uf.union(edges.get(i)[1],edges.get(i)[2])){
                mincost+=edges.get(i)[0];
                edgeused++;
            }
        }
        return mincost;

    }
}

class UnionFind{
    public int[] root;
    public int[] rank;

    public UnionFind(int size){
        root = new int[size];
        rank = new int[size];
        for(int i=0;i<size;i++){
            root[i]=i;
        }
    }
    public int find(int node){
        if(root[node]!=node){
            root[node] = find(root[node]);
        }
        return root[node];
    }

    public boolean union(int x, int y){
        int root1 = find(x);
        int root2 = find(y);
        if(root1==root2){
            return false;
        }
        if(rank[root1]>rank[root2]){
            root[root2]=root1;
        }
        else if (rank[root2]>rank[root1]){
            root[root1]=root2;
        }
        else{
            root[root1]=root2;
            rank[root2]+=1;
        }
        return true;

    }

}
