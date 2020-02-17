package mid.back;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/102893570
import  java.util.*;
public class permute {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        //逐步降低nums的长度直到找到基本解
        List<Integer> middle = new ArrayList<>();
        plus(middle, nums);
        return result;
    }

    List<Integer> mm;
    int[] nu;

    private void plus(List<Integer> middle, int[] nums) {
        if (nums.length == 0 || nums == null)
            result.add(middle);
//        //只是剩下一个元素
//        if (nums.length==1){
//            mm.add(nums[0]);
//            plus(mm, null);
//            return;
//        }
        for (int i = 0; i < nums.length; i++) {
            //克隆
            mm = new ArrayList<>(middle);
            mm.add(nums[i]);
            //去掉已经添加的元素

            nu = new int[nums.length - 1];
            for (int j = 0; j < nu.length; j++) {
                nu[j] = j < i ? nums[j] : nums[j + 1];
            }
            plus(mm, nu);
        }

    }

}

