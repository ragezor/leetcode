package Exam;

import java.util.Scanner;

public class Up {
    public static boolean isUp(int num){
        String s=num+"";
        int tem,next;
        tem=s.charAt(0)-'0';
        for (int i=1;i<s.length();i++){
            next=s.charAt(i)-'0';
            if(next>=tem){
                tem=next;
                continue;
            }
            else {
                return  false;
            }

        }


 return true;
    }
    public static  void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.close();
        int result=0;


        for(int j=1;j<=n;j++){
            if(isUp(j)){
                result++;
            }
        }
        System.out.println(result);

    }
}
