package interviewsummary.string_test;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103432625
public class productExceptSelf {
        public int[] productExceptSelf(int[] nums) {
        /*[1, a1, a1*a2, a1*a2*a3]
          [a2*a3*a4, a3*a4, a4, 1]*/

            int len=nums.length;//长度
            int p=1;
            int [] output=new int[len];

            output[0]=1;
            for(int i=1;i<len;i++){//生成第一个数组
                p=p*nums[i-1];//累乘
                output[i]=p;
            }
            p=1;
            for(int j=len-2;j>=0;j--){
                p=p*nums[j+1];
                output[j]=output[j]*p;
            }
            return output;

        }
    }



