package pta;

import java.util.Scanner;
import  java.util.*;

public class Knuth {
    public  static  void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int [] res=new int[n];
        for(int j=0;j<n;j++){
            int tem=scanner.nextInt();
            res[j]=tem;
        }
        scanner.close();
        List<Integer>  list=new ArrayList<>();
        for (int i=1;i<=n;i++){
            list.add(i);
        }
        for(int index=0;index<n;index++){
            Collections.swap(list,index,res[index]-1);
        }

        for (int k=0;k<n-1;k++){
            System.out.print(list.get(k)+" ");
        }
        System.out.print(list.get(n-1));



    }
}
