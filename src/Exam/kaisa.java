package Exam;

import java.util.Scanner;

public class kaisa {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        scanner.close();
        char[] arr=str.toCharArray();
       for(int i=0;i<arr.length;i++){
           arr[i]= (char) ('a'+(arr[i]-'a'+3)%26);
       }
        for (char c:arr
             ) {
            System.out.print(c);

        }


    }
}
