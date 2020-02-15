package InterviewSummary.dynamicProgramming;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/102987710
public class uniquePaths {

        public int uniquePaths(int m, int n) {
            int [][] route=new int[m][n] ;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(i==0||j==0){
                        route[i][j]=1;
                    }
                    else{
                        route[i][j]=route[i-1][j]+route[i][j-1];

                    }
                }
            }

            return route[m-1][n-1];}
    }



