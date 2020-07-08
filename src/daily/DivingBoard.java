package daily;

//总结地址：https://blog.csdn.net/qq_43491066/article/details/107200499
public class DivingBoard {
    public int[] divingBoard(int shorter, int longer, int k) {

        if (k == 0) {
            return new int[0];
        }

        if (shorter == longer) {
            return new int[]{shorter * k};
        }
        int[] res = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            res[i] = shorter * (k - i) + longer * i;
        }

        return res;
    }


    public static void main(String[] args) {
        DivingBoard divingBoard = new DivingBoard();
        int shorter = 1,
                longer = 2,
                k = 3;
        int[] res = divingBoard.divingBoard(shorter, longer, k);
        for (int i : res
        ) {
            System.out.print(i);
            System.out.print(',');

        }
    }

}
