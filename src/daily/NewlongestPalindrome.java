package daily;

public class NewlongestPalindrome {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/106250462
    public String longestPalindrome(String s) {
        int len = s.length();
        //特殊情况
        if (len < 2) {
            return s;
        }
//分别指向最长回文字串的开头结尾
        int begin = 0, end = 0;
        char[] chars = s.toCharArray();
        //动态规划矩阵
        boolean[][] dp = new boolean[len][len];
        //初始化
        dp[0][0] = true;
        for (int r = 1; r < len; r++) {
            //初始化
            dp[r][r] = true;
            for (int l = 0; l < r; l++) {
                //状态转换 需要对应两个相等且后边中一个才为真
                dp[l][r] = chars[l] == chars[r] && (r - l < 3 || dp[l + 1][r - 1]);
         //得到最大值
                if (dp[l][r] && r - l > end - begin) {
                    begin = l;
                    end = r;

                }
            }
        }
        return s.substring(begin, end + 1);

    }

    public static void main(String[] args) {
        NewlongestPalindrome newlongestPalindrome = new NewlongestPalindrome();
        String s = "cbbd";
        System.out.println(newlongestPalindrome.longestPalindrome(s));
    }
}
