package daily;

import java.util.*;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/109532941

public class SortByBits {
    public int[] sortByBits(int[] arr) {
        int [] map=new int[10001];

        List<Integer> list=new ArrayList<>();
        for (int a:arr
             ) {
            list.add(a);
            map[a]=count(a);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(map[o1]!=map[o2]){
                    return  map[o1]-map[o2];
                }
                else {
                    return  o1-o2;
                }
            }
        });

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=list.get(i);

        }
        return  arr;


    }

    public int count(int num){
        int res=0;
        while(num!=0){
            res+=num%2;
            num=num/2;
        }
        return  res;
    }

}
