package daily;

import java.util.*;

import java.util.ArrayList;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108665089
public class PermuteUnique {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> perm = new ArrayList<Integer>();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        backTrace(nums, 0, ans, perm, visited);
        return ans;


    }

    public void backTrace(int[] nums, int index, List<List<Integer>> ans, List<Integer> perm, boolean[] visited) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(perm));
            return;
        }

        for (int i = 0; i < nums.length; ++i) {
            if (visited[i] || (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])) {
                continue;
            }
            perm.add(nums[i]);
            visited[i] = true;
            backTrace(nums, index + 1, ans, perm, visited);
            visited[i] = false;
            perm.remove(index);


        }
    }


}

