package pta;

import java.util.HashSet;
import java.util.Scanner;

public class Happy {
   static HashSet<Integer>  set=new HashSet<>();
    private  static  int getNext(int num){
        int sum=0;
        while(num>0){
            int d=num%10;
            sum+=d*d*d;
            num=num/10;
        }
        return  sum;
    }

    public static  int count(int n){
        int degree=0;
        while(n!=1&&!set.contains(n)){
            set.add(n);
            degree++;
            n=getNext(n);
        }
        set.clear();
        if(n==1){
            return degree;
        }
        return  n;

    }

    public static  void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int [] res=new int[n];
        for (int i=0;i<n;i++){
            int tem=scanner.nextInt();
            res[i]=tem;
        }
        for (int num:res
             ) {
            int result=count(num);
            System.out.println(result);


        }
    }
}
