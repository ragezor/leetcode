package daily;

import java.util.ArrayList;
import java.util.List;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108410658
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths=new ArrayList<>();
        dfs("",root,paths);
        return  paths;


    }

    public void dfs(String path,TreeNode node,List<String> paths){
        if(node!=null){
            StringBuffer sb= new StringBuffer(path);
            sb.append(Integer.toString(node.val));
            if (node.left == null && node.right == null) {

                paths.add(sb.toString());
            }
            else {
                sb.append("->");
                dfs(sb.toString(),node.left,paths);
                dfs(sb.toString(),node.right,paths);

            }
        }
    }
}
