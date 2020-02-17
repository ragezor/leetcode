package bytedance.dynamicplanning_greed;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/104354207
public class MaxProfit {

        public int maxProfit(int[] prices) {
            if(prices.length==0){
                return 0;
            }
            //总收益
            int maxpro=0;
            for(int i=0;i<prices.length-1;i++){
                if(prices[i]<prices[i+1]){
                    maxpro+=prices[i+1]-prices[i];
                }
            }
            return maxpro;
        }
public  static  void main(String[] args){
            MaxProfit p1=new MaxProfit();
            int [] testNum={1,2,3,5,2,4,1,8,1,2,3,5,10};
           System.out.println("最高利润是："+p1.maxProfit(testNum));

}
}
