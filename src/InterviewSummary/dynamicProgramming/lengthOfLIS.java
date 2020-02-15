package InterviewSummary.dynamicProgramming;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103016800
public class lengthOfLIS {

        public int lengthOfLIS(int[] nums) {

            int chang=nums.length;
            if(chang==0){
                return 0;
            }
            if(chang==1){
                return 1;
            }

            int[] len=new int[chang];
            for(int i=0;i<chang;i++){
                len[i]=1;
            }
            for(int j=0;j<chang;j++){
                for(int k=0;k<j;k++){
                    if(nums[j]>nums[k]&&len[j]<len[k]+1){
                        len[j]=len[j]+1;

                    }
                }
            }
            int maxLen = 0;
            for (int i = 0; i < nums.length ; i++) {
                if (maxLen < len[i]) {
                    maxLen = len[i];
                }
            }
            return maxLen;
        }
    }



