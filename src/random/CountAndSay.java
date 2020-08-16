package random;

public class CountAndSay {

    public String countAndSay(int n) {
        int left = 0, right = 1;

        if (n == 1) {
            return "1";
        }
        String str = countAndSay(n - 1);
        int len = str.length();
        StringBuffer sb = new StringBuffer();
        while (right < len) {
            if (str.charAt(right) != str.charAt(left)) {
                int count = right - left;
                sb.append(count).append(str.charAt(left));
                left = right;

            }
            right++;

        }
        if (left != right) {// 防止最后一段数相等，如果不等说明p1到cur-1这段字符串是相等的
            int count = right - left;
            sb.append(count).append(str.charAt(left));
        }


        return sb.toString();


    }


    public static void main(String[] args) {
        CountAndSay countAndSay = new CountAndSay();
        System.out.println(countAndSay.countAndSay(4));
    }
}
