package daily;

import java.util.Arrays;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/113714099
public class MaxScore {
    public int maxScore(int[] cardPoints, int k) {
        int len=cardPoints.length;
        int window=len-k;
        int sum=0;
        for (int i=0;i<window;i++){
            sum+=cardPoints[i];
        }
        int minSum=sum;
        for (int i = window; i < len; ++i) {
            // 滑动窗口每向右移动一格，增加从右侧进入窗口的元素值，并减少从左侧离开窗口的元素值
            sum += cardPoints[i] - cardPoints[i - window];
            minSum = Math.min(minSum, sum);
        }
        return Arrays.stream(cardPoints).sum() - minSum;


    }
}
