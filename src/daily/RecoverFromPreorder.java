package daily;

//总结地址：https://blog.csdn.net/qq_43491066/article/details/106825136

public class RecoverFromPreorder {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode(int x) { val = x; }
  }
    int cur=0,curD=0;

    public TreeNode recoverFromPreorder(String S) {
        char[] nodes=S.toCharArray();
        int len=nodes.length;
        return dfs(0,nodes,len);

    }

    public TreeNode dfs(int dept,char[] nodes,int len){
        int val=0;
        for(;cur<len&&nodes[cur]!='-';cur++){
            val=val*10+nodes[cur]-'0';
        }
        curD=0;
        for(;cur<nodes.length&&nodes[cur]=='-';cur++,curD++);
        TreeNode r = new TreeNode(val);
        if(curD>dept)r.left = dfs(curD,nodes,len);
        if(curD>dept)r.right = dfs(curD,nodes,len);
        return r;


    }




}
