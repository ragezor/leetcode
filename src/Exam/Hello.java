package Exam;

import java.util.HashSet;
import java.util.Scanner;

public class Hello {

    public  static  void main(String [] args){
        HashSet yuanSet=new HashSet();
        HashSet fuSet=new HashSet();
        for(int i=0;i<26;i++){
            char a= (char) ('a'+i);
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                yuanSet.add(a);
            }
            else {
                fuSet.add(a);
            }
        }

        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        scanner.close();
        int p=0,aa=0,bb=0,cc=0,dd=0;
        while(p<str.length()&&fuSet.contains(str.charAt(p))){
            aa=1;
            p++;
        }
        while(p<str.length()&&yuanSet.contains(str.charAt(p))){
            bb=1;
            p++;
        }
        while(p<str.length()&&fuSet.contains(str.charAt(p))){
           cc=1;
            p++;
        }
        while(p<str.length()&&yuanSet.contains(str.charAt(p))){
           dd=1;
            p++;
        }
        if(p==str.length()&&aa==1&&bb==1&&cc==1&&dd==1){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }



    }
}
