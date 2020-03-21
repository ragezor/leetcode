package Exam;
import  java.util.Scanner;
public class BigNum {

    public static int n=0,count=0;
        public static int [] []map ;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            n =sc.nextInt();
            sc.close();
            map = new int [n+1][n+1];
            for (int i = 1; i <=n; i++) {
                map[i][i]=1;
                map[i][0]=1;
                map[0][i]=1;
            }
            for (int i = 1; i <=n; i++) {
                count+=f(n,i);
                count%=10000;

            }
            System.out.println(count);


        }
        public static int f(int x,int y){
            if(map[x][y]!=0){
                return map[x][y];
            }
            for (int i = Math.abs(x-y)-1; i>=0; i--) {
                map[x][y]+=f(y,i);
            }
            map[x][y]%=10000;

            return map[x][y];
        }

    }







