package daily;

import java.util.HashMap;
import java.util.Map;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108788918
public class BuildTree2 {
    int[] inorder;
    int[]postorder;
    int post_index;
    Map<Integer, Integer> idx_map = new HashMap<Integer, Integer>();
    public TreeNode helper(int in_left, int in_right) {
        if(in_left>in_right){
            return null;
        }
        int root_val=postorder[post_index];
        TreeNode root=new TreeNode(root_val);
        int inorder_index=idx_map.get(root_val);
        post_index--;
        root.right=helper(inorder_index+1,in_right);
        root.left=helper(in_left,inorder_index-1);
        return  root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postorder = postorder;
        this.inorder = inorder;
        post_index=postorder.length-1;
        int idx=0;
        for (Integer val:inorder){
            idx_map.put(val,idx++);
        }
        return  helper(0,inorder.length-1);

    }


}
