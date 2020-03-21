package Exam;

public class YueShu {
    public static void main(String [] args){
        int num=0;
        for(int i=1;i<=1200000;i++){
            if(1200000%i==0){
                num++;
            }
        }
        System.out.println(num);
    }
}
