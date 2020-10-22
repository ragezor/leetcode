package daily;

import java.util.ArrayList;
import java.util.List;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/109221951
public class PartitionLabels {
    public List<Integer> partitionLabels(String S) {
        int [] last=new int[26];
        for (int i=0;i<S.length();i++){
            last[S.charAt(i)-'a']=i;
        }
        List<Integer> ans=new ArrayList<>();
        int start=0;
        int end=0;
        for (int i=0;i<S.length();i++){
            end=Math.max(end,last[S.charAt(i)-'a']);
            if(end==i){
                ans.add(end-start+1);
                start=end+1;
            }
        }
        return  ans;

    }
}
