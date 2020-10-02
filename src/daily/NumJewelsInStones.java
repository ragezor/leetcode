package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108899549
import java.util.HashSet;

public class NumJewelsInStones {
    public int numJewelsInStones(String J, String S) {
        int ans = 0;
        HashSet set = new HashSet();
        char[] charsj = J.toCharArray();
        char[] charss = S.toCharArray();
        for (char c : charsj) {
            set.add(c);
        }
        for (char j : charss) {
            if (set.contains(j)) {
                ans++;
            }
        }
        return ans;
    }
}
