package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106117701
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int single=0;
        for (int num:nums
             ) {
            single^=num;

        }
        return  single;

    }

    public static  void main(String[]args){
        SingleNumber singleNumber=new SingleNumber();
        int[] nums={4,1,2,1,2};
        System.out.println(singleNumber.singleNumber(nums));
    }
}
