package Exam;

import java.util.*;

public class Night {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] item = new int[n],
                temp = new int[n],
                price = new int[m];
        for (int i = 0; i < n; i++)
            item[i] = temp[i] = sc.nextInt();
        Arrays.sort(temp);
        System.arraycopy(temp, n - m, price, 0, m);
        for (int i = 0; i < n; i++)
            for (int j = price.length - 1; j >= 0; j--)
                if (item[i] == price[j]) {
                    System.out.print(item[i] + " ");
                    price[j] = 131072;
                    break;
                }
    }

}
