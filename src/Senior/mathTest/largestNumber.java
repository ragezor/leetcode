package Senior.mathTest;
import  java.util.*;
/*
*给定一组非负整数，重新排列它们的顺序使之组成一个最大的整数。
示例 1:
输入: [10,2]
输出: 210
* 说明: 输出结果可能非常大，所以你需要返回一个字符串而不是整数
* 想法：这本质是一个排序题，自定义比较器  判断a+b和b+a哪个大  最后再遍历输出即可 注意如果比较以后大的为0
那么就直接输出0 不用管后边的了
* 总结地址：https://blog.csdn.net/qq_43491066/article/details/104098434
 */
public class largestNumber {
    public String largestNumber(int[] nums) {
        /*
         *strnum 存储字符串类型的nums
         *res用来存储最终结果
         *自定义comparator
         *如果比较以后开头是0那么就直接返回0
         */

        String[] strnum=new String [nums.length];
        String res="";

        for(int i=0;i<nums.length;i++){
            strnum[i]=String.valueOf(nums[i]);
        }

        Arrays.sort(strnum, new Comparator<String>() {
            public int compare(String sa, String sb){
                return (sb + sa).compareTo(sa + sb);
            }
        });

        for(String str:strnum){
            res+=str;
        }
        return res.charAt(0)=='0'? "0": res;
    }
}
