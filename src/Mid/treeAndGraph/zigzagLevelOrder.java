package Mid.treeAndGraph;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103206173
import  java.util.*;
public class zigzagLevelOrder {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            if(root==null){//空处理
                return new ArrayList<>();
            }
            List<List<Integer>> list=new ArrayList<>();//用来存最后结果
            Queue<TreeNode> queue=new LinkedList<>();//queue用来存每一层左到右顺序的节点
            queue.add(root);//把根节点加进来
            int index=1;//层数
            while(!queue.isEmpty()){
                List<Integer> layer=new ArrayList<>();//暂存一层的结果
                int len=queue.size();//这一层的节点个数
                for(int i=0;i<len;i++){
                    TreeNode tem=queue.poll();//出队列
                    layer.add(tem.val);//加到layer
                    if(tem.left!=null){
                        queue.add(tem.left);
                    }
                    if(tem.right!=null){
                        queue.add(tem.right);
                    }

                }
                if(index%2==0){
                    //偶数行反转
                    Collections.reverse(layer);

                }
                list.add(layer);
                index++;

            }

            return list;}
    }



