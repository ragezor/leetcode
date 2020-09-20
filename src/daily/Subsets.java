package daily;

import java.util.ArrayList;
import java.util.List;
//总结地址:https://blog.csdn.net/qq_43491066/article/details/108689149
public class Subsets {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> tem = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums);
        return ans;

    }

    public void dfs(int index, int[] nums) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(tem));
            return;
        }

        tem.add(nums[index]);
        dfs(index + 1, nums);
        tem.remove(tem.size() - 1);
        dfs(index + 1, nums);

    }
}
