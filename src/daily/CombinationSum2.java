package daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108506687
public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tem = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(0, target, tem, ans, candidates);
        return ans;
    }

    public void dfs(int index, int target, List<Integer> tem, List<List<Integer>> ans, int[] candidates) {

        if (target == 0) {
            ans.add(new ArrayList<>(tem));
        }
        for (int i = index; i < candidates.length; i++) {
            if (target < candidates[i]) {
                break;
            }
            if(i>index&&candidates[i-1]==candidates[i]){
                continue;
            }
            tem.add(candidates[i]);
            //i+1是精髓，不可重复
            dfs(i+1, target - candidates[i], tem, ans, candidates);
            tem.remove(tem.size() - 1);
        }


    }

}
