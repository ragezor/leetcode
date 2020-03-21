package Exam;

import java.util.Scanner;

public class Grass {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] res = new char[n][m];
        int[][] tem = new int[n][m];
        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            for (int j = 0; j < m; j++) {
                char c = str.charAt(j);
                res[i][j] = c;

            }
        }
        int month = scanner.nextInt();

        for (int x = 0; x < month; x++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (res[i][j] == 'g') {
                        tem[i][j] = 1;
                        if (i - 1 >= 0) tem[i - 1][j] = 1;
                        if (i + 1 < n) tem[i + 1][j] = 1;
                        if (j - 1 >= 0) tem[i][j - 1] = 1;
                        if (j + 1 < m) tem[i][j + 1] = 1;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (tem[i][j]==1){
                        res[i][j]='g';
                    }
                }
            }
        }


        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                    System.out.print(res[i][j]);

            }
            System.out.println();
        }


    }
}
