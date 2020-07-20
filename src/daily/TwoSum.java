package daily;

import java.util.Arrays;
import java.util.HashMap;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/107456467
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int[] res=new int[2];
        HashMap <Integer,Integer> map =new HashMap<>();
        for (int i=0;i<numbers.length;i++){
            map.put(numbers[i],i);
        }
        for (int i=0;i<numbers.length;i++){
            if(map.containsKey(target-numbers[i])){
                res[0]=i+1;
                res[1]=map.get(target-numbers[i])+1;
                break;
            }
            else {
                continue;
            }
        }

        return  res;

    }

    public  static  void main(String[]args){
        TwoSum twoSum=new TwoSum();
        int[]numbers = {2, 7, 11, 15};
        int target = 9;
        int[] res=twoSum.twoSum(numbers,target);
        System.out.println(Arrays.toString(res));

    }

}
