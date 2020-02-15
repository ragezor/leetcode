package InterviewSummary.dynamicProgramming;
//总结地址
public class maxProfit {

        public int maxProfit(int[] prices) {
        /*
        在第i天买一支股票还能剩下的利润＝第(i-2)天销售能够剩余的利润－第i天股票的价钱．
在第i天卖一支股票总的利润＝第(i-1)天买股票剩下的最大利润＋当前股票的价格．
也就是说需要维护两个状态的信息，一个是买股票所得到的剩余最大利润，一个是卖出股票之后得到的最大利润，他们互相依赖对方的信息．
对于买来说，当天是否买取决于买了之后是否比之前买所剩余的利润大，即状态转移方程为：
buy[i] = max(buy[i-1], sell[i-2] - prices[i-1]);

对于卖来说，同样当天是否将这只股票卖掉取决于卖掉能否获得更大的利润，状态转移方程为：
sell[i] = max(sell[i-1], buy[i-1] + prices[i-1]);
*/
            int len=prices.length;//天数
            if(len==0){//空
                return 0;
            }
            int [] buy=new int[len+1];//维护买了以后的利润
            int [] sell=new int[len+1];//维护卖了以后的利润

            buy[1]=-prices[0];//维护边界条件，第一天买了以后
            sell[1]=0;
            sell[0]=0;

            for(int i=2;i<len+1;i++){
                buy[i]=Math.max(buy[i-1],sell[i-2]-prices[i-1]);//状态转换方程，下同
                sell[i]=Math.max(sell[i-1],buy[i-1]+prices[i-1]);


            }
            return sell[len];


        }
    }



