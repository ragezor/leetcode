package daily;

//总结地址：https://blog.csdn.net/qq_43491066/article/details/104748613
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int  minprice= Integer.MAX_VALUE;
        int maxProfit=0;
        for (int price: prices) {
            if(price<minprice){
                minprice=price;
            }
            else if((price -minprice)>maxProfit){
                maxProfit=price-minprice;
            }

        }

        return  maxProfit;  }

        public  static  void main (String[] args){
        int [] test={7,1,5,3,6,4};
        MaxProfit maxProfit=new MaxProfit();
            System.out.println(maxProfit.maxProfit(test));
        }


}
