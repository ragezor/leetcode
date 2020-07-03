package daily;
//总结地址；https://blog.csdn.net/qq_43491066/article/details/107101052
public class SortedArrayToBST {
    public class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public TreeNode sortedArrayToBST(int[] nums) {
      return  dfs(nums,0,nums.length-1);
    }

    public TreeNode dfs(int [] nums,int low,int high){
        if(low>high){
            return  null;
        }
        int mid=low+(high-low)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left= dfs(nums,low,mid-1);
        root.right=dfs(nums,mid+1,high);
        return root;
    }
}
