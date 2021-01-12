package offer;

import java.util.Arrays;

public class PrintNumbers {
    public int[] printNumbers(int n) {
        int len= (int) Math.pow(10,n);
        int [] res=new int[len-1];
        for (int i = 0; i <len-1 ; i++) {
            res[i]=i+1;
        }
        return  res;

    }

    public  static  void main(String[] args){
        PrintNumbers printNumbers=new PrintNumbers();
        System.out.println(Arrays.toString(printNumbers.printNumbers(2)));
    }

}
