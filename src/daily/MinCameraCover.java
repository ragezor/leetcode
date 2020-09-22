package daily;

public class MinCameraCover {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/108723410
    int res=0;
    public int minCameraCover(TreeNode root) {
       if( lrd(root)==0){
           res++;
       }
       return res;

    }
    public int lrd(TreeNode node){
        //0待覆盖 1已经覆盖 2安装摄像头
        if(node==null){
            return  1;
        }
        int left=lrd(node.left);
        int right=lrd(node.right);
        //子节点都待覆盖，父亲装摄像头
        if(left==0||right==0){
            res++;
            return 2;
        }
        //子都被覆盖而无摄像头，父亲待覆盖
        if(left==1&&right==1){
            return 0;
        }
        //子有摄像头，父亲被覆盖
        if(left+right>=3){
            return 1;
        }
        return  -1;

    }
}
