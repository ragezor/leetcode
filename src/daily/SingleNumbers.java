package daily;

import java.util.Arrays;
//总结地址；https://blog.csdn.net/qq_43491066/article/details/105810864
public class SingleNumbers {
    public int[] singleNumbers(int[] nums) {
        //k是所有抑或的和
        int k=0;
        for (int n:nums
             ) {
            k^=n;
        }
        //mask找到最低位的不同那个1
        int mask=1;
        while((k&mask)==0){
            mask<<=1;
        }

        int a=0,b=0;
        //ab分组抑或
        for (int num:nums
             ) {
            if((num&mask)==0){
                a^=num;
            }
            else {
                b^=num;
            }

        }
        return  new int[]{a,b};
    }

    public  static  void main(String [] args){
        SingleNumbers singleNumbers=new SingleNumbers();
        int [] nums=new int[]{4,1,4,6};
        System.out.println(Arrays.toString(singleNumbers.singleNumbers(nums)));

    }
}
