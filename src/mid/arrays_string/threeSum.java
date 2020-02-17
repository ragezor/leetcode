package mid.arrays_string;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103127865
import  java.util.*;
public class threeSum {
        public List<List<Integer>> threeSum(int[] nums) {
            if(nums == null){
                return null;
            }
            //如果数组长度小于3，返回一个空集合
            if(nums.length < 3){
                return new ArrayList<>();
            }
            //对数组nums进行排序
            Arrays.sort(nums);
            HashSet<List<Integer>> set = new HashSet<>();
            //让i从数组下标为0开始跑
            for (int i = 0; i < nums.length; i++) {
                //j从i的后一个数开始
                int j = i + 1;
                //k从数组最后一个数（最大的数）往前跑
                int k = nums.length - 1;
                while(j < k){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        set.add(list);
                        //当有重复的数字出现时，j往前跑，防止结果有重复
                        while(j < k && nums[j] == nums[j + 1]){
                            j++;
                        }
                        while(j < k && nums[k] == nums[k - 1]){
                            k--;
                        }
                        j++;
                        k--;
                    }else if(nums[i] + nums[j] + nums[k] < 0){
                        j++;
                    }else{
                        k--;
                    }
                }
            }
            return new ArrayList<>(set);
        }
    }



