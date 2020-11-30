package daily;

import java.util.Comparator;
import java.util.PriorityQueue;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/110367541
public class ReorganizeString {
    public String reorganizeString(String S) {
        int []count=new int[26];
        int maxamount=Integer.MIN_VALUE;
        int len=S.length();
        for (int i = 0; i < len; i++) {
            count[S.charAt(i)-'a']++;
            maxamount=Math.max(maxamount,count[S.charAt(i)-'a']);
        }
        if(maxamount>(len+1)/2){
            return  "";
        }

        PriorityQueue <Character>heap=new PriorityQueue(new Comparator<Character>() {
            @Override
            public int compare(Character c1, Character c2) {
                return count[c2-'a']-count[c1-'a'];
            }
        });
        for (char c='a';c<='z';c++){
            if(count[c-'a']>0){
                    heap.offer(c);
            }
        }
        StringBuffer sb=new StringBuffer();
        while (heap.size()>1){
            char char1=heap.poll();
            char char2=heap.poll();
            sb.append(char1);
            sb.append(char2);
            int index1=char1-'a',index2=char2-'a';
            count[index1]--;
            count[index2]--;
            if(count[index1]>0){
                heap.offer(char1);
            }
            if(count[index2]>0){
                heap.offer(char2);
            }

        }
        if(heap.size()>0){
            sb.append(heap.poll());
        }
        return  sb.toString();

    }
}
