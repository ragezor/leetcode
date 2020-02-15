package Senior.Others;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103751872
public class trap {

        public int trap(int[] height) {
            int result=0;//最终结果
            int len=height.length;
            int[]left=new int[len];//左数组维护前一个柱子的高度与之前左木板的最大值的最大值
            int[]right=new int[len];
            if(len<=2){
                return 0;
            }

            for(int i=1;i<len;i++){
                left[i]=Math.max(left[i-1],height[i-1]);//遍历一遍得到left，下痛
                right[len-i-1]=Math.max(right[len-i],height[len-i]);
            }
            for(int j=0;j<len;j++){
                if(left[j]>height[j]&&right[j]>height[j]){//result等于小的那个减height
                    result+=Math.min(left[j],right[j])-height[j];
                }
            }
            return result;
        }
    }



