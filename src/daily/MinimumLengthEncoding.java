package daily;

import java.util.Arrays;
//总结地址；https://blog.csdn.net/qq_43491066/article/details/105158666
public class MinimumLengthEncoding {
    public int minimumLengthEncoding(String[] words) {
        int len=0;
        Tire tire=new  Tire();
        // 先对单词列表根据单词长度由长到短排序
        Arrays.sort(words,(s1,s2) ->s2.length() -s1.length());
        // 单词插入tire，返回该单词增加的编码长度
        for (String word:words
             ) {
            len+=tire.insert(word);

        }
        return  len;

    }

    public  static  void  main(String[] args){
        MinimumLengthEncoding minimumLengthEncoding=new MinimumLengthEncoding();
        String[] test={"time", "me", "bell"};
        System.out.println(Arrays.toString(test));
        System.out.println(minimumLengthEncoding.minimumLengthEncoding(test));

    }
}

    class  TireNode{
        char val;
        TireNode[] children=new TireNode[26];
        public  TireNode(){
        }
    }

    class Tire{
        TireNode root;
        public Tire() {
            root = new TireNode();
        }
        //倒着插入，如果已经有了就不管
        public int insert(String word){
            TireNode tem= root;
            boolean isNew=false;
            for(int i=word.length()-1;i>=0;i--){
                int c=word.charAt(i)-'a';
                if(tem.children[c]==null){
                    isNew=true;
                    tem.children[c]=new TireNode();
                }
                tem=tem.children[c];

            }
            if(isNew){
                return word.length()+1;
            }
            return  0;
        }
    }


