package daily;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//总结地址https://blog.csdn.net/qq_43491066/article/details/105945868
public class MincostTickets {
    int[] costs;
    //set存储要出行的天
    Set<Integer> set = new HashSet<>();
    //dp存储最终结果
    int[] dp = new int[366];

    public int mincostTickets(int[] days, int[] costs) {
        this.costs = costs;
        for (int d : days
        ) {
            set.add(d);
        }
        return dp(1);

    }

    //dp(i)表示从到365的花费最小值
    private int dp(int i) {
        if (i > 365) {
            return 0;
        }
        if (dp[i] != 0) {
            return dp[i];
        }
        if (set.contains(i)) {
            dp[i] = Math.min(Math.min(dp(i + 1) + costs[0], dp(i + 7) + costs[1]), dp(i + 30) + costs[2]);
        } else {
            dp[i] = dp(i + 1);
        }
        return dp[i];
    }


    public static void main(String[] args) {
        MincostTickets mincostTickets = new MincostTickets();
        int[] days = {1, 4, 6, 7, 8, 20}, costs = {2, 7, 15};
        int res1 = mincostTickets.mincostTickets(days, costs);
        System.out.println("days:" + Arrays.toString(days) + " costs:" + Arrays.toString(costs) + " result:" + res1);


    }

}
