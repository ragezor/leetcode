package daily;

import java.util.Arrays;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/104677392

public class DistributeCandies {
    public int[] distributeCandies(int candies, int num_people) {
        // 获得完整糖果的人数
        int p = (int) (Math.sqrt(2 * candies + 0.25) - 0.5);
        //剩下的糖果数
        int remaining = (int) (candies - (p + 1) * p * 0.5);
        //发了几行几列
        int rows = p / num_people, cols = p % num_people;

        int[] res = new int[num_people];
        for (int i = 0; i < num_people; ++i) {
            // complete rows
            res[i] = (i + 1) * rows + (int) (rows * (rows - 1) * 0.5) * num_people;
            // cols in the last row
            if (i < cols) res[i] += i + 1 + rows * num_people;
        }
        // remaining candies
        res[cols] += remaining;
        return res;
    }


    public static void main(String[] args) {
        DistributeCandies distributeCandies = new DistributeCandies();
        System.out.println(Arrays.toString(distributeCandies.distributeCandies(7, 4)));

        System.out.println(Arrays.toString(distributeCandies.distributeCandies(10, 3)));

    }
}
