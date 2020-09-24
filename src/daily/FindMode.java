package daily;

import java.util.HashMap;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108766430
public class FindMode {
    int count=0,max=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    public int[] findMode(TreeNode root) {
        if(root==null){
            return  new int[0];
        }

        mid(root);
        int [] res=new int[count];
        for (int  key:map.keySet()
             ) {
            if(map.get(key)==max){
                res[--count]=key;
            }

        }
        return  res;

    }


    public void mid(TreeNode root){
        if(root==null){
            return;
        }
        mid(root.left);

        int tem = map.getOrDefault(root.val, 0) + 1;
        map.put(root.val, tem);
        if(tem>max){
            max=tem;
            count=1;
        }
        if(tem==max){
            count++;
        }
        mid(root.right);

    }
}
