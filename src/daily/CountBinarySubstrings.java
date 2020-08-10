package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/107906447
public class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        int len = s.length(), pre = 0, res = 0, last = 0;
        while (pre < len) {
            char c = s.charAt(pre);
            int count = 0;
            while (pre < len && s.charAt(pre) == c) {
                pre++;
                count++;
            }
            res += Math.min(count, last);
            last = count;
        }
        return res;
    }

    public static void main(String[] args){
        CountBinarySubstrings countBinarySubstrings=new CountBinarySubstrings();
        String str="00110011";
        System.out.println(countBinarySubstrings.countBinarySubstrings(str));
    }


}
