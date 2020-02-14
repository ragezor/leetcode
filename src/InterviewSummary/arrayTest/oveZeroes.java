package InterviewSummary.arrayTest;
/*
题干
给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
示例:
输入: [0,1,0,3,12]
输出: [1,3,12,0,0]
说明:
必须在原数组上操作，不能拷贝额外的数组。
尽量减少操作次数。
————————————————
想法
遍历一遍数组 将遇到的非0的都填充到数组的最前边并记录已经存储的位置 剩下的位置全部置为0即可
————————————————
总结链接：https://blog.csdn.net/qq_43491066/article/details/104131643
 */
public class oveZeroes {
    public void moveZeroes(int[] nums) {
        int len=nums.length;
        int index=0;
        for(int i=0;i<len;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }

        for(int j=index;j<len;j++){
            nums[j]=0;
        }

    }

}
