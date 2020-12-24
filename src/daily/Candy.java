package daily;

class Solution {
    public int candy(int[] ratings) {
        //首先糖果的数量至少为孩子的个数。
        //然后遍历数组，如果两侧的比他的评分高，那么糖果数量就要比他多一个。
        //最后算出所有小朋友的糖果数量即可。
        int length = ratings.length;
        int[] left = new int[length];
        for(int i = 0; i < length;i++){
            if(i > 0 && ratings[i] > ratings[i-1]){
                left[i] = left[i-1]+1;
            }else{
                left[i] = 1;
            }
        }
        // 以[1,0,2]为例子，第一遍从左到右遍历之后得到的结果为：1 1 2；
        // 发现很明显不符合要求，所以还要从右到左遍历一遍，但这个时候不需要用到存糖果的数组了。
        // 从倒数第二个开始，0<2所以不用++。
        // 但是1>0所以临时变量需要++。
        int right = 0, ret = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (i < length - 1 && ratings[i] > ratings[i + 1]) {
                right++;
            } else {
                right = 1;
            }
            ret += Math.max(left[i], right);
        }
        return ret;
    }
}
