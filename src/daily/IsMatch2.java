package daily;

public class IsMatch2 {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/107134920
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = true;
            } else {
                break;
            }

        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } else if (p.charAt(j - 1) == '?' || s.charAt(i - 1) == p.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];


                }
            }


        }


  return dp[m][n];
    }
    public static void main (String[]args){
    IsMatch2 isMatch2=new IsMatch2();
        String s = "adceb",
        p = "*a*b";
        System.out.println(isMatch2.isMatch(s,p));
    }
}
