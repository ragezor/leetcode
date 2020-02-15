package Mid.treeAndGraph;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103211739
public class buildTree {
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
     }

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            //空处理，preorder.length==0不可缺
            if(preorder==null||inorder==null||preorder.length==0){
                return null;
            }

            return buildCore(preorder,0,preorder.length-1,inorder,0,inorder.length-1);

        }
        //递归函数
        private TreeNode buildCore(int[]preorder,int preStart,int preEnd,int[] inorder,int inStart,int inEnd){
            int rootValue=preorder[preStart];//根节点的值
            TreeNode root=new TreeNode(rootValue);//生成根节点
            if(preStart==preEnd){//如果只有根节点
                return root;
            }
            int rootIndex=inStart;//根节点在中序的位置
            while(inorder[rootIndex]!=rootValue&&rootIndex<=inEnd){
                rootIndex++;//找到位置
            }
            int leftLength=rootIndex-inStart;//中序中左子树的长度
            int PreLeftEnd=preStart+leftLength;//先序中左子树的最后一个节点
            if(leftLength>0){//如果左子树不为空
                //建立左子树 root.left=buildCore(preorder,preStart+1,PreLeftEnd,inorder,inStart,inEnd);
            }
            if(leftLength < preEnd - preStart){
                //重建右子树
                root.right = buildCore(preorder,PreLeftEnd +1,preEnd,inorder,rootIndex+1,inEnd);
            }

            return root;}
    }




