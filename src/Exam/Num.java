package Exam;

public class Num {
    public static  void main(String [] args){
        int ans=0;int a,b,c,d;
        for(int i=1;i<=2019;i++) {
            a=i/1000;
            b=i%1000/100;
            c=i%100/10;
            d=i%10;
            if(a==9||b==9||c==9||d==9) {       //题目要求了一个数值里面如果有多个9还是只算一个，所以用||
                ans++;
            }
        }
        System.out.println(ans);

    }
    }

