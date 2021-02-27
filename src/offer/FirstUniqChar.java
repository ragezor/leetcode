package offer;

import java.util.HashMap;


public class FirstUniqChar {
    public char firstUniqChar(String s) {
        char[] chars=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for (char c: chars
             ) {
          map.put(c,map.getOrDefault(c,0)+1);

        }
        for (char c: chars
        ) {
            if(map.get(c)==1){
                return c;
            }
            else  {
                continue;
            }
        }
        return  ' ';


    }
}
