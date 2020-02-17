package senior.desin_test;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103709331
import  java.util.*;
public class Trie {

        private class Node{
            public HashMap<Character,Node> childs;//它的子节点
            public boolean isLeaf;

            public Node(){
                this.isLeaf=false;//叶子
                this.childs=new HashMap<>();//它的孩子
            }
        }

        private Node root;

        /** Initialize your data structure here. */
        public Trie() {
            root=new Node();

        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            insert(root,word);
        }

        private void insert(Node root,String word){
            if(word==null||word.length()==0) return;
            char[] chars=word.toCharArray();
            Node cur=root;
            for(int i=0;i<chars.length;i++){
                if(!cur.childs.containsKey(chars[i])){//没有就插入
                    cur.childs.put(chars[i],new Node());
                }
                cur=cur.childs.get(chars[i]);//有没有都要走到下一个
            }
            if(!cur.isLeaf){//遍历完成，更新叶子位置，叶子主要用来search
                cur.isLeaf=true;
            }
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            return search(root,word);

        }

        private boolean search(Node root,String word){
            if(word==null||word.length()==0) return false;
            char[] chars=word.toCharArray();
            Node cur=root;
            for(int i=0;i<chars.length;i++){//其中一个不匹配就不行
                if(!cur.childs.containsKey(chars[i])){
                    return false;
                }
                cur=cur.childs.get(chars[i]);
            }
            return cur.isLeaf;//前边匹配了 ，还要这个还是叶子才行
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            if(prefix==null||prefix.length()==0) return false;
            char[] chars=prefix.toCharArray();
            Node cur=root;
            for(int i=0;i<chars.length;i++){
                if(!cur.childs.containsKey(chars[i]))
                    return false;
                cur=cur.childs.get(chars[i]);//找到就可以
            }
            return true;

        }
    }

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */


