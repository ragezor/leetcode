package Exam;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int n = scanner.nextInt();
        int[] res = new int[n];
        int[] max = new int[n];
        int[] min = new int[n];
        for (int i = 0; i < n; i++) {
            int tem = scanner.nextInt();
            res[i] = tem;
        }
        scanner.close();
        min[0]=res[0];
        max[n-1]=res[n-1];
        for (int i = 1; i < n; i++) {
            min[i] = Math.min(res[i], min[i - 1]);
        }
        for (int i = n - 2; i >= 0; i--) {
            max[i] = Math.max(res[i], max[i + 1]);
        }
        for (int i = 1; i < n - 1; i++) {
            if (res[i] > min[i - 1] && res[i] < max[i + 1]) {
             count++;
            }
        }
        System.out.println(count);

    }
}
