package mid.arrays_string;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/102764088
import java.util.*;
public class groupAnagrams {

        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> map = new HashMap<>();
            // HashMap<String, List<String>> hashMap = new HashMap<>();
            for(String str : strs) {
                char[] chars = str.toCharArray();
                Arrays.sort(chars);

                String key = new String(chars);

                if(!map.containsKey(key)) {
                    map.put(key, new ArrayList<>());
                }

                map.get(key).add(str);
            }
            return new ArrayList<>(map.values());
        }
    }



