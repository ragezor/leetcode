package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108272924
public class JudgeCircle {
    public boolean judgeCircle(String moves) {
        if(moves.length()%2==1){
            return false;
        }
     char[] move=moves.toCharArray();
     int [] count=new int[4];
        for (char c: move
             ) {
            if(c=='R'){
                count[0]++;
            }
            else  if(c=='L'){
                count[1]++;
            }
            else if(c=='U'){
                count[2]++;
            }
            else {
                count[3]++;
            }

        }
        return count[0]==count[1]&&count[2]==count[3];
    }

    public static  void main(String [] args){
        JudgeCircle judgeCircle=new JudgeCircle();
        String s="UU";
        System.out.println(judgeCircle.judgeCircle(s));
    }

}
