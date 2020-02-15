package InterviewSummary.stringTest;
/*
总结地址：https://blog.csdn.net/qq_43491066/article/details/103944202
 */
public class findDuplicate {

        public int findDuplicate(int[] nums) {
            if(nums==null||nums.length==0){
                return 0;
            }
            int tortoise=nums[0];
            int hare=nums[0];
            //找到相遇
            do{
                tortoise=nums[tortoise];
                hare=nums[nums[hare]];
            }while(tortoise!=hare);

            // Find the "entrance" to the cycle.
            int ptr1=nums[0];
            int ptr2=tortoise;
            while(ptr1!=ptr2){
                ptr1=nums[ptr1];
                ptr2=nums[ptr2];
            }
            return ptr1;
        }
    }



