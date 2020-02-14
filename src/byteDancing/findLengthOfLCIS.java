package byteDancing;
/*题干
给定一个未经排序的整数数组，找到最长且连续的的递增序列。
示例 1:
输入: [1,3,5,4,7]
输出: 3
解释: 最长连续递增序列是 [1,3,5], 长度为3。
尽管 [1,3,5,7] 也是升序的子序列, 但它不是连续的，因为5和7在原数组里被4隔开。
示例 2:
输入: [2,2,2,2,2]
输出: 1
解释: 最长连续递增序列是 [2], 长度为1。
注意：数组长度不会超过10000。

想法：
*最简单的当然是两层暴力循环
*但是这种一般都意味着一次即可
*于是使用两个变量
*来存储最大的 和从这个元素开始的最大的
*
* 总结地址：https://blog.csdn.net/qq_43491066/article/details/104307831
 */
public class findLengthOfLCIS {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int max=0;
        int num=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                num++;
            }
            else{
                if(max<num){
                    max=num;
                }
                num=1;
            }
        }

        return Math.max(max,num);
    }

    public static  void main(String[]args){
        findLengthOfLCIS f1=new findLengthOfLCIS();
        int[] nums={1,3,5,4,7};
        System.out.println("这个数组为：");
        for(int i:nums){
            System.out.print(i);
        }
        System.out.println("它的最长连续递增序列长度为"+f1.findLengthOfLCIS(nums));
    }
}



