package mid.arrays_string;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103149554
import  java.util.*;
public class setZeroes {

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
                        tem.add(i);//横坐标
                        tem.add(j);//纵坐标
                        list.add(tem);
                    }
                }
            }

            for(int k=0;k<list.size();k++){
                for(int i=0;i<chang;i++){
                    matrix[i][list.get(k).get(1)]=0;//一列为0
                }
                for(int i = 0; i < kuan; i++) {
                    matrix[list.get(k).get(0)][i] = 0;//一行为0
                }


            }

        }

    }



