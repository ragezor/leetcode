package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/107504890
public class MinArray {
    public int minArray(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > min) {
                continue;
            }
            if (numbers[i] < min) {
                min = numbers[i];
                break;
            }
        }
        return min;

    }

    public static void main(String[] args) {
        MinArray minArray = new MinArray();
        int[] nums = {2, 2, 2, 2, 2};
        System.out.println(minArray.minArray(nums));
    }

}
