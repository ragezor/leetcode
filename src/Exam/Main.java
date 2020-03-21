package Exam;


import java.util.Scanner;

public class Main {
    static final int mod = 10000;
    static int[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) dp[i][i] = dp[i][0] = dp[0][i] = 1;
        for (int i = 1; i <= n; i++) sum += Echo(n, i);
        System.out.println(sum % mod);
    }
    static int Echo(int x, int y) {
        if (dp[x][y] != 0) return dp[x][y];
        for (int i = Math.abs(x - y) - 1; i >= 0; i--) dp[x][y] += Echo(y, i);
        dp[x][y] %= mod;
        return dp[x][y];
    }
}

