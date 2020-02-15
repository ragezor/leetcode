package InterviewSummary.arrayTest;
/*
总结地址：https://blog.csdn.net/qq_43491066/article/details/103934872
 */
import java.util.*;
public class longestConsecutive {

        public int longestConsecutive(int[] nums) {
            Set<Integer> num_set=new HashSet<>();
            int longStreak=0;
            for( int num:nums){
                num_set.add(num);        }

            for(int num: num_set){
                if(!num_set.contains(num-1)){
                    int currentNum=num;
                    int currentStreak=1;

                    while(num_set.contains(currentNum+1)){
                        currentNum++;
                        currentStreak++;
                    }
                    longStreak=Math.max(currentStreak,longStreak);
                }
            }
            return longStreak;
        }
    }



