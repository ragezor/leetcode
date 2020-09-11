package daily;

import java.util.ArrayList;
import java.util.List;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108526676
public class CombinationSum3 {

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> tem = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(1, 9, k, n);
        return ans;
  }

    public void dfs(int cur, int n, int k, int sum) {
        //剪枝 因为n - cur + 1 + tem.size() < k时，再往下也不可能构建等于sum了
        if (tem.size() > k || n - cur + 1 + tem.size() < k) {
            return;
        }
        //求和
        if (tem.size() == k) {
            int temsum = 0;
            for (int i : tem
            ) {
                temsum += i;
            }
            if (temsum == sum) {
                ans.add(new ArrayList<>(tem));
                return;
            }
        }
        //回溯 第一种访问后回溯
        tem.add(cur);
        dfs(cur + 1, n, k, sum);
        tem.remove(tem.size() - 1);
        //第二种直接跳过
        dfs(cur + 1, n, k, sum);

    }
}
