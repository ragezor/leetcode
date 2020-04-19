package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105612147
public class GetMaxRepetitions {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        /*
         * @Description:index是当前要匹配的自负在s2的位置，count是S1里一共有多少个s2
         * @Author: ragezor
         * @Date: 2020/4/19 11:26 上午
         * @Param [s1, n1, s2, n2]
         * @return int
         **/
    int index=0;
    int count=0;
    char[] array1=s1.toCharArray();
    char[] array2=s2.toCharArray();

    for(int i=0;i<n1;i++){
        for (char c : array1) {
            //找到一个字符就++
            if (c == array2[index]) {
                index++;
            }
            //找到一个s2，index归零，count++
            if (index == array2.length) {
                count++;
                index = 0;
            }
        }
    }
    return  count/n2;
    }
    public static  void main(String [] args){
        GetMaxRepetitions getMaxRepetitions=new GetMaxRepetitions();
        String s1 ="acb", s2 ="ab";
       int n1 = 4,n2 = 2;
        System.out.println(getMaxRepetitions.getMaxRepetitions(s1,n1,s2,n2));

    }
}
