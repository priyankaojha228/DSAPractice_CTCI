package Recursion;
import java.util.*;
public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] val = new int[10];
        for(int i=1;i<=9;i++){
            val[i]=i;
        }
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList();
        backtrack(val, n, ans, cur, 0,k);
        return ans;

    }
    public void backtrack(
            int[] candidates,
            int target,
            List<List<Integer>> ans,
            List<Integer> cur,
            int index, int k
    ) {
        if (target == 0 && cur.size()==k) {
            ans.add(new ArrayList(cur));
        } else if (target < 0) {
            return;
        } else {
            for (int i = index;i < candidates.length; i++) {
                //if (i > index && candidates[i] == candidates[i - 1]) continue;
                if(candidates[i]!=0){
                    cur.add(candidates[i]);
                    backtrack(candidates, target - candidates[i], ans, cur, i + 1,k);
                    cur.remove(cur.size() - 1);}
            }
        }
    }
}
