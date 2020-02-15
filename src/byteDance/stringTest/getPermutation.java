package byteDance.stringTest;
import java.util.*;
/*
*题干和分析有点长 建议参考csdn总结：https://blog.csdn.net/qq_43491066/article/details/104325487
 */
public class getPermutation {
        public String getPermutation(int n, int k) {
            k--;
            List<Integer> list = new ArrayList<Integer>();//注意存储1-n
            StringBuilder s = new StringBuilder();
            int times = n-1;
            for(int i=1;i<=n;i++){
                list.add(i);
            }
            int factorail = 1;//阶乘
            for(int i=2;i<n;i++){//不要×n
                factorail*=i;
            }
            while(times>=0){
                int index=k/factorail;
                s.append(list.get(index));
                list.remove(index);
                k=k%factorail;
                if(times!=0){
                    factorail/=times;
                }
                times--;
            }
            return s.toString();
        }
    }

