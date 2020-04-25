package daily;
import java.util.*;
//总结地址；https://blog.csdn.net/qq_43491066/article/details/105746693
public class Permute {
    //回溯法
    private  void backTrace(int n,ArrayList<Integer>output,List<List<Integer>> res,int index){
        //index表示index及之前的已经排列好
        if(index==n){
            res.add(new ArrayList<>(output));
        }
        //对每一个元素，交换位置使得index+1，然后还原
        for (int i=index;i<n;i++){
            Collections.swap(output,index,i);
            backTrace(n,output,res,index+1);
            Collections.swap(output,index,i);
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new LinkedList<>();
        ArrayList<Integer> out=new ArrayList<>();
        //放到list里
        for (int n:nums
             ) {
            out.add(n);
        }
        int n= nums.length;
        backTrace(n,out,res,0);
        return  res;


    }

    public  static  void main(String[] args){
        Permute permute=new Permute();
        int [] nums={1,2,3};
        List<List<Integer>> r=permute.permute(nums);
        System.out.println(r);


    }
}
