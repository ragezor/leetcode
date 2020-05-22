package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106274928
public class BuildTree {
    public static class TreeNode {
      int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //序列长度，两个一样所以只用求一个
        int prelen=preorder.length;
    return  rebuild(preorder,0,prelen-1,inorder,0,prelen-1);
    }
    /*
     * @Description:
     * @Author: ragezor
     * @Date: 2020/5/22 10:52 上午
     * @Param [preorder, prestart在前序的开始, preend在前序的结束, inorder, instart中序的开始, inend中序的结束]
     * @return daily.BuildTree.TreeNode
     **/
    public TreeNode rebuild(int []preorder,int prestart,int preend,int[] inorder,int instart,int inend){
        //空判断
        if(prestart>preend||instart>inend){
            return  null;
        }
        //现在的节点
        TreeNode root=new TreeNode(preorder[prestart]);
        for (int i=inend;i>=instart;i--){
            if(inorder[i]==preorder[prestart]){
                //左子树长度
                int len=i-instart;
                //看图对应的两个序列的区间很好懂
                root.left=rebuild(preorder, prestart+1, prestart+len, inorder, instart,i-1);
                root.right=rebuild(preorder, prestart+len+1, preend, inorder, i+1,inend);
                break;


            }
        }
        return  root;
    }


}
