package daily;

//总结地址：https://blog.csdn.net/qq_43491066/article/details/104792570

public class CanThreePartsEqualSum {

    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;      //数组总和
        int tem = 0;         //区间和
        int count = 0;        //和为sum/3的区间数
        for (int num : A
        ) {
            sum += num;
        }
        if (sum % 3 != 0) {
            return false;
        }
        for (int num : A
        ) {
            tem += num;
            if (tem == sum / 3) {
                count++;
                tem = 0;
            }

        }
        return  count>=3;
    }


    public  static  void main (String [] args){
        CanThreePartsEqualSum canThreePartsEqualSum=new CanThreePartsEqualSum();
        int []A ={0,2,1,-6,6,-7,9,1,2,0,1};
        int []B={0,2,1,-6,6,7,9,-1,2,0,1};
        int []C={3,3,6,5,-2,2,5,1,-9,4};
        int[] test={18,12,-18,18,-19,-1,10,10};
        System.out.println( canThreePartsEqualSum.canThreePartsEqualSum(A));
        System.out.println( canThreePartsEqualSum.canThreePartsEqualSum(B));
        System.out.println( canThreePartsEqualSum.canThreePartsEqualSum(C));
        System.out.println(canThreePartsEqualSum.canThreePartsEqualSum(test));
    }
}
