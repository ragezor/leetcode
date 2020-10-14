package daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/109064972
public class CommonChars {
    public List<String> commonChars(String[] A) {
        int[] minfreq = new int[26];
        Arrays.fill(minfreq, Integer.MAX_VALUE);
        for (String str : A
        ) {
            int[] tem = new int[26];
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                ++tem[c - 'a'];
            }
            for (int i = 0; i < 26; i++) {
                minfreq[i] = Math.min(minfreq[i], tem[i]);
            }
        }

        List<String> ans = new ArrayList();
        for (int i = 0; i < 26; ++i) {
            for (int j = 0; j < minfreq[i]; ++j) {
                ans.add(String.valueOf((char) (i + 'a')));
            }
        }
        return ans;
    }
}
