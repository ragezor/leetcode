package daily;
import java.util.*;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106684762
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        int len = T.length;
        int[] res = new int[len];
        //stack维护还没找到比他大的
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            int temperature = T[i];
            while (!stack.isEmpty() && temperature > T[stack.peek()]) {
                int preindex = stack.pop();
                res[preindex] = i - preindex;
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] res = dailyTemperatures.dailyTemperatures(T);
        System.out.println(Arrays.toString(res));
    }
}
