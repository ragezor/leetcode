package daily;
import java.util.ArrayList;
import java.util.List;
public class MinimumTotal {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/107331575
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + triangle.get(i).get(0);
            for (int j = 1; j < i; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + triangle.get(i).get(j);
            }
            dp[i][i] = dp[i - 1][i - 1] + triangle.get(i).get(i);


        }
        int res = dp[n - 1][0];
        for (int i = 0; i < n; i++) {
            res = Math.min(dp[n - 1][i], res);
        }
        return res;

    }

    public static void main(String[] args) {
        MinimumTotal minimumTotal = new MinimumTotal();

        int[][] tem = {
                {2},
                {3, 4},
                {6, 5, 7},
                {4, 1, 8, 3}
        };
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        list1.add(2);
        list2.add(3);
        list2.add(4);
        list3.add(6);
        list3.add(5);
        list3.add(7);
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);

        res.add(list1);
        res.add(list2);
        res.add(list3);
        res.add(list4);

        System.out.println(minimumTotal.minimumTotal(res));

    }
}
