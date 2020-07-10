package daily;

//总结地址；https://editor.csdn.net/md?articleId=107244201
public class MaxProfit2 {
    public int maxProfit(int[] prices) {
        int days = prices.length;

        int[] buy = new int[days + 1];
        int[] sell = new int[days + 1];

        if (days == 0 || days == 1) {
            return 0;
        }
        buy[1] = -prices[0];
        sell[0] = 0;
        sell[1] = 0;
        for (int i = 2; i <= days; i++) {
//            其中注意prices[i-1]是指的第i天的价格//            对第一个状态方程，
//            首先第i天我们可能买，可能不买，不买就等于buy[i-1]
//            如果买，那么意味着昨天一定没卖，于是是拿前天卖了后的钱，减去今天的价格。。
//            对于i天我们可能卖，卖就是昨天买后的钱再加上今天的价格
//            不卖，那就一直等于
            buy[i] = Math.max(buy[i - 1], sell[i - 2] - prices[i - 1]);
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i - 1]);
        }

        return sell[days];

    }

    public static void main(String[] args) {
        MaxProfit2 maxProfit2 = new MaxProfit2();
        int[] test = {1, 2, 3, 0, 2};
        System.out.println(maxProfit2.maxProfit(test));
    }

}
