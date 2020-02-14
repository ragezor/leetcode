package InterviewSummary.dynamicProgramming;
/*
题干：找到给定字符串（由小写字符组成）中的最长子串 T ， 要求 T 中的每一字符出现次数都不少于 k 。输出 T 的长度。
总结：https://blog.csdn.net/qq_43491066/article/details/104122863
 */
public class longestSubstring {

        public int re = 0;

        public int longestSubstring(String s, int k) {
            getlongest(s, k);
            return re;
        }

        public void getlongest(String s, int k) { // 分治
            int len = s.length();
            if (len == 0)
                return;

            int[] count = new int[26];
            for (char c : s.toCharArray()) { // 计算每个字母出现的次数
                count[c - 'a']++;
            }

            int l = 0;
            boolean greater = true; // 记录是否所有字符个数都 > k



            for (int i = 0; i < len; i++) {
                if (count[s.charAt(i) - 'a'] != 0 && count[s.charAt(i) - 'a'] < k) { // 分隔处理
                    if (i > l)
                        getlongest(s.substring(l, i), k); //递归处理
                    greater = false; // 不是所有字符个数都 > k
                    l = i + 1;
                }
            }
            if(!greater && len > l) //最后一个分隔符到结尾
                getlongest(s.substring(l, len), k);
            if (greater) {
                re = Math.max(re, len);
            }
        }
    }

