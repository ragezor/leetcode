package daily;

public class IsAnagram {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/109954820
    public boolean isAnagram(String s, String t) {
        if(s==null&&t==null){
            return  true;
        }
        int[] map=new int[26];
        char[] schar=s.toCharArray();
        char[] tchar=t.toCharArray();
        for (char c:schar
             ) {
            map[c-'a']++;
        }
        for (char tem:tchar
        ) {
            map[tem-'a']--;
        }
        for (int f:map
             ) {
            if(f!=0){
                return  false;
            }
        }
        return  true;

    }
}
