package daily;

//总结地址：https://blog.csdn.net/qq_43491066/article/details/106612249

public class EquationsPossible {
    public boolean equationsPossible(String[] equations) {
        int len=equations.length;
        int [] parent=new int[26];
        //初始化，每个点的父节点是自己
        for (int i=0;i<26;i++){
            parent[i]=i;
        }
//先变量等式
        for (String str:equations){

            if(str.charAt(1)=='='){
                int index1=str.charAt(0)-'a';
                int index2=str.charAt(3)-'a';
                //放到一起
                union(parent,index1,index2);
            }
        }
//再查不等式
        for (String str:equations){

            if(str.charAt(1)=='!'){
                int index1=str.charAt(0)-'a';
                int index2=str.charAt(3)-'a';
                if (find(parent, index1) == find(parent, index2)) {
                    return false;
                }


            }
        }
        return  true;


    }
    //更新父节点
    public void union(int[] parent, int index1, int index2) {
        parent[find(parent, index1)] = find(parent, index2);
    }
//查找父节点，一直往上
    public int find(int[] parent, int index) {
        while (parent[index] != index) {
            parent[index] = parent[parent[index]];
            index = parent[index];
        }
        return index;
    }

    public static  void main(String[] args){
        EquationsPossible equationsPossible=new EquationsPossible();
        String [] test={"c==c","b==d","x!=z"};
        System.out.println(equationsPossible.equationsPossible(test));
    }


}
