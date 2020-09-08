package daily;

import java.util.ArrayList;
import java.util.List;

public class Combine {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/108461006
    List<Integer> tem=new ArrayList<>();
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        dfs(1,n,k);
        return  ans;

    }

    public  void dfs(int cur,int n,int k){
        if(tem.size()+(n-cur+1)<k){
            return;
        }
        if(tem.size()==k){
            ans.add(new ArrayList<Integer>(tem));;
            return;
        }
        if(cur==n+1){
            return;
        }

        tem.add(cur);
        dfs(cur+1,n,k);
        tem.remove(tem.size()-1);
        dfs(cur+1,n,k);

    }
}
