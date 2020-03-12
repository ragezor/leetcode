package daily;

public class GcdOfStrings {
//总结地址；https://blog.csdn.net/qq_43491066/article/details/104827674
        public String gcdOfStrings(String str1, String str2) {
            // 假设str1是N个x，str2是M个x，那么str1+str2肯定是等于str2+str1的。
            if (!(str1 + str2).equals(str2 + str1)) {
                return "";
            }
            // 辗转相除法求gcd。
            return str1.substring(0, gcd(str1.length(), str2.length()));
        }

        private int gcd(int a, int b){
            while(b != 0){
                int tmp = b;
                b = a%b;
                a = tmp;
            }
            return a;
        }
        public static  void main (String [] args){
           String str1 = "ABCABC", str2 = "ABC";
           GcdOfStrings gcdOfStrings=new GcdOfStrings();
            System.out.println(gcdOfStrings.gcdOfStrings(str1,str2));


        }

    }



