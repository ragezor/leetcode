package Senior.Back;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103629935

public class isMatch2 {
        public boolean isMatch(String s, String p) {
            if (p.isEmpty()) return s.isEmpty();
            //第一个是否匹配上
            boolean first_match = (!s.isEmpty() &&
                    (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));

            if (p.length() >= 2 && p.charAt(1) == '*') {
                //看有没有可能,剩下的p匹配上全部的s
                //看有没有可能,整个p匹配剩下的s
                return (isMatch(s, p.substring(2)) ||
                        (first_match && isMatch(s.substring(1), p)));

            } else {
                //没有星星的情况:第一个字符相等,而且剩下的s,匹配上剩下的p
                return first_match && isMatch(s.substring(1), p.substring(1));
            }
        }
    }



