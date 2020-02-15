package Mid.sortAndSearch;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/102944100
public class sortColors {

        public void sortColors(int[] nums) {
            int zero=0;
            int two=nums.length-1;
            int cur=0;

            while (cur<=two) {
                if (nums[cur]==0) {
                    if (cur!=zero) swap(cur,zero,nums);
                    zero++;
                    cur++;

                } else {
                    if (nums[cur]==2) {
                        swap(cur,two,nums);
                        two--;
                    } else cur++;
                }
            }
        }
        private void swap(int a,int b,int[] nums) {
            int tmp=nums[a];
            nums[a]=nums[b];
            nums[b]=tmp;
        }
    }





