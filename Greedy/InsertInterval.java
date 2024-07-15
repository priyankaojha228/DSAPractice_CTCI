package Greedy;
import java.util.*;
public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        int i=0;
        while(i<intervals.length && intervals[i][1]<newInterval[0]){
            res.add(intervals[i][0]);
            res.add(intervals[i][1]);
            arr.add(res);
            res=new ArrayList<>();
            i=i+1;
        }
        while(i<intervals.length && intervals[i][0]<newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
            i=i+1;
        }
        res.add(newInterval[0]);
        res.add(newInterval[1]);
        arr.add(res);
        res=new ArrayList<>();
        while(i<intervals.length){
            if(arr.get(arr.size()-1).get(1)==intervals[i][0]){
                res.add(arr.get(arr.size()-1).get(0));
                res.add(intervals[i][1]);
                arr.remove(arr.size()-1);
                arr.add(res);
                res=new ArrayList<>();
                i=i+1;
            }else{
                res.add(intervals[i][0]);
                res.add(intervals[i][1]);
                arr.add(res);
                res=new ArrayList<>();
                i=i+1;
            }

        }
        int[][] out = new int[arr.size()][2];
        for(int j=0;j<arr.size();j++){
            out[j][0] = arr.get(j).get(0);
            out[j][1] = arr.get(j).get(1);

        }
        return out;
    }
}
