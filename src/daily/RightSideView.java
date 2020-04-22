package daily;
import java.util.*;
import  util.TreeNode;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105678841
public class RightSideView {
    List<Integer> res=new ArrayList<>();
    int dep=0;
    public List<Integer> rightSideView(TreeNode root) {
        helper(root,0);
        return  res;

    }
    private  void helper(TreeNode root,int now){
        if(root==null){
            return;
        }
        if(now==dep){
            res.add(root.getVal());
            dep++;
        }
        helper(root.getRight(),now+1);
        helper(root.getLeft(),now+1);


    }
    public  static  void main(String [] args){
        RightSideView rightSideView=new RightSideView();
        TreeNode root=new TreeNode(1);
        TreeNode tem=new TreeNode(2);
        TreeNode res=new TreeNode(3);
        root.setLeft(tem);
        root.setRight(res);
        tem.setRight(new TreeNode(5));
        res.setRight(new TreeNode(4));

        List<Integer> result=rightSideView.rightSideView(root);
        System.out.println(result);

    }

}
