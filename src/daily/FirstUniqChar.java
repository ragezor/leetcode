package daily;

public class FirstUniqChar {
    public int firstUniqChar(String s) {
        int[] map=new int[26];
        char [] chars=s.toCharArray();
        for (char c:chars
             ) {
            map[c-'a']++;
            
        }
        for (int i = 0; i <s.length() ; i++) {
            if(map[chars[i]-'a']==1){
                return  i;
            }
        }
        return  -1;

    }
}
