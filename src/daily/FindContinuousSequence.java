package daily;
import  java.util.*;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/104689961
public class FindContinuousSequence {

        public int[][] findContinuousSequence(int target) {
            int l=1;
            int r=1;
            int sum=0;
            List<int[]> res = new ArrayList<>();
            while(l<=target/2){
                if(sum<target){
                    sum+=r;
                    r++;

                }
                else if( sum> target){
                    sum-=l;
                    l++;
                }

                else{
                    int [] tem=new int[r-l];
                    for(int i=l;i<r;i++){
                        tem[i-l]=i;
                    }
                    res.add(tem);
                    sum-=l;
                    l++;

                }
            }
            return res.toArray(new int[res.size()][]);
        }


        public static  void main(String[] args){
            FindContinuousSequence findContinuousSequence=new FindContinuousSequence();
            int [][]res=findContinuousSequence.findContinuousSequence(9);
            for (int[] nums:res
                 ) {
                System.out.println(Arrays.toString(nums));

            }
        }
    }



