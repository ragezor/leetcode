package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105138362

public class HasGroupsSizeX {
    public boolean hasGroupsSizeX(int[] deck) {
        // 计数
        int[] counter = new int[10000];
        for (int num : deck) {
            counter[num]++;
        }
        // 迭代求多个数的最大公约数
        int x = 0;
        for (int cnt : counter) {
            if (cnt > 0) {
                x = gcd(x, cnt);
                if (x == 1) { // 如果某步中gcd是1，直接返回false
                    return false;
                }
            }
        }
        return x >= 2;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }


    public static void main(String[] args) {
        HasGroupsSizeX hasGroupsSizeX = new HasGroupsSizeX();
        int[] test = {1, 2, 3, 4, 4, 3, 2, 1};
        int[] test1 = {1, 1, 1, 2, 2, 2, 3, 3};
        int[] test2 = {1};
        int[] test3 = {1, 1};
        int[] test4 = {1, 1, 2, 2, 2, 2};
        int[] test5 = {0, 0, 0, 0, 0, 1, 1, 2, 3, 4};
        System.out.println(hasGroupsSizeX.hasGroupsSizeX(test));
        System.out.println(hasGroupsSizeX.hasGroupsSizeX(test1));
        System.out.println(hasGroupsSizeX.hasGroupsSizeX(test2));
        System.out.println(hasGroupsSizeX.hasGroupsSizeX(test3));
        System.out.println(hasGroupsSizeX.hasGroupsSizeX(test4));
        System.out.println(hasGroupsSizeX.hasGroupsSizeX(test5));
    }
}
