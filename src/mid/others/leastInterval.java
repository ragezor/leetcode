package mid.others;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103112383
import java.util.*;
public class leastInterval {

        public int leastInterval(char[] tasks, int n) {
            int[] map = new int[26];
            //map记录频次
            for (char c: tasks)
                map[c - 'A']++;
            //排序，注意频次最高的在最后
            Arrays.sort(map);
            int time = 0;
            while (map[25] > 0) {//最大数还没安排完
                int i = 0;//一轮有n+1个位置
                while (i < n+1) {
                    if (map[25] == 0)
                        break;
                    if (i < 26 && map[25 - i] > 0)//次大的
                        map[25 - i]--;
                    time++;
                    i++;
                }
                Arrays.sort(map);//重新排序
            }
            return time;
        }
    }



