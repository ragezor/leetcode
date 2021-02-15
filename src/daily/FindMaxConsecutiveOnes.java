package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/113814229
public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxcount = 0;
        for (int num : nums
        ) {
            if (num == 1) {
                count++;
            } else {
                maxcount = Math.max(count, maxcount);
                count = 0;
            }

        }
        maxcount = Math.max(count, maxcount);
        return maxcount;

    }
    public  static  void main(String[] args){
        FindMaxConsecutiveOnes findMaxConsecutiveOnes=new FindMaxConsecutiveOnes();
        int [] nums={1,1,0,1,1,1};
        int res=findMaxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        System.out.println("最大连续的1的个数为"+res);
    }


}
