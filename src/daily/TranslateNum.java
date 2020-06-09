package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106639808
public class TranslateNum {
    public int translateNum(int num) {
    String str= String.valueOf(num);
    int len=str.length();
    int[] dp=new int[len+1];
    dp[0]=1;
    dp[1]=1;
    for (int i=2;i<len+1;i++){
        String tem=str.substring(i-2,i);
        if(tem.charAt(0)=='0'){
            dp[i]=dp[i-1];
            continue;
        }

        int number=Integer.parseInt(tem);
        if(number>=0&&number<=25){
            dp[i]=dp[i-1]+dp[i-2];
        }
        else {
            dp[i]=dp[i-1];
        }
    }
    return dp[len];
}
public  static  void main(String[] args){
    TranslateNum translateNum=new TranslateNum();
    System.out.println(translateNum.translateNum(25));
}
}
