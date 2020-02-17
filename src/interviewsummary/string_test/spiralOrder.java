package interviewsummary.string_test;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103443743
import  java.util.*;
public class spiralOrder {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> list=new ArrayList<>();
            if(matrix==null||matrix.length==0){
                return list;
            }
            int m=matrix.length;
            int n=matrix[0].length;
            int x=0;
            int y=0;
            int direct=0;
            boolean[][] flag=new boolean[m][n];
            while(x>=0&&y>=0&&x<m&&y<n){
                if(flag[x][y]){
                    break;
                }
                list.add(matrix[x][y]);
                flag[x][y]=true;

                switch(direct)
                {
                    case 0:
                        if(y==n-1||flag[x][y+1]){//走到右边界，注意有新的右边界
                            x++;//就向下走一步，并且改变方向
                            direct=1;
                        }
                        else{
                            y++;}
                        break;



                    case 1:
                        if(x==m-1||flag[x+1][y]){//走到下边界注意有新的下边界
                            y--;
                            direct=2;
                        }else{
                            x++;}
                        break;


                    case 2:
                        if(y==0||flag[x][y-1]){//走到左边界注意有新的左边界
                            x--;//向上走
                            direct=3;
                        }else{
                            y--;}
                        break;

                    case 3 :
                        if(x==0||flag[x-1][y])
                        {
                            y++ ; //如果向上走到头就右走
                            direct=0 ;
                        }
                        else{
                            x--; } //向上走
                        break ;


                }
            }

            return list;}
    }




