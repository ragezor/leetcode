package InterviewSummary.stringTest;
/*
*题干：给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
说明：本题中，我们将空字符串定义为有效的回文串。
* 想法：
* 首先将s全部小写 再双指针遍历 如果非字符数字就忽略
* 总结地址：https://blog.csdn.net/qq_43491066/article/details/104113642
 */
public class isPalindrome {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        s = s.toLowerCase();
        while(i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }
            if (s.charAt(j) != s.charAt(i)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
