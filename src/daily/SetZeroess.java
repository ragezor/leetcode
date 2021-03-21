package daily;

import java.util.ArrayList;
import java.util.List;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/115043679
public class SetZeroess {
    public void setZeroes(int[][] matrix) {
        //长
        int chang=matrix.length;
        //宽
        int kuan=matrix[0].length;
        List<List<Integer>> list=new ArrayList<>();//用来存坐标
        for(int i=0;i<chang;i++){
            for(int j=0;j<kuan;j++){
                if(matrix[i][j]==0){
                    List<Integer> tem=new ArrayList<>();//暂存给定的坐标
                    tem.add(i);
                    tem.add(j);
                    list.add(tem);
                }
            }
        }

        for(int k=0;k<list.size();k++){
            for(int i=0;i<chang;i++){
                matrix[i][list.get(k).get(1)]=0;
            }
            for(int i = 0; i < kuan; i++) {
                matrix[list.get(k).get(0)][i] = 0;
            }


        }

    }


    public  static  void main(String[] args){
        SetZeroess setZeroess=new SetZeroess();
        int [][] matrix={
                {1,1,1},
                {1,0,1},
                {1,1,1},};
        setZeroess.setZeroes(matrix);
        for (int i = 0; i <matrix.length ; i++) {
            System.out.println(" ");
            for (int j = 0; j <matrix[0].length ; j++) {
                System.out.print(matrix[i][j]+" ");

            }

        }
    }
}
