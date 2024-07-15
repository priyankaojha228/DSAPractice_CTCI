package Greedy;
import java.util.*;
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        res.add(intervals[0][0]);
        res.add(intervals[0][1]);
        for(int[] ar:intervals){
            int start = ar[0];
            int end = ar[1];
            if(res.get(1)>=start){
                res.set(1,Math.max(res.get(1),end));
            }
            else{
                arr.add(res);
                res=new ArrayList<>();
                res.add(start);
                res.add(end);
            }

        }
        arr.add(res);
        int[][] out = new int[arr.size()][2];
        for(int i=0;i<arr.size();i++){
            out[i][0] = arr.get(i).get(0);
            out[i][1] = arr.get(i).get(1);

        }
        return out;

    }
}
