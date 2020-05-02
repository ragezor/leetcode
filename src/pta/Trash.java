package pta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Trash {
    public static  void main(String[] args){
        HashMap<String,String> map=new HashMap<>();
        List<String> list = new ArrayList<>();
        String []res=new String[]{" ","Gan laji","Shi laji","Ke Hui Shou","You Hai laji"};
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        String tem=scanner.nextLine();
        for(int l=0;l<n;l++){

            String[] line=tem.split(" ");

            //map.put(line[0],line[1]);
        }
        while(!tem.equals("#")){
            if (map.containsKey(tem)) {
                list.add(map.get(tem));
            }
            else {
                list.add("?");
            }
            tem=scanner.nextLine();
        }
        scanner.close();
        int len=list.size();
        {
            for (int i=0;i<len;i++){

                if(list.get(i).equals("?")){
                    System.out.println("?");
                }
                else {
                    int index=Integer.parseInt(list.get(i)) ;
                    System.out.println(res[index]);
                }
            }
        }








    }
}
