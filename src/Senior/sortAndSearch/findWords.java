package Senior.sortAndSearch;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103595110
import  java.util.*;
public class findWords {

        public int[] dx={1,-1,0,0};
        public int[] dy={0,0,1,-1};

        private static class Trie{  //字典树
            String word;  //单词结束标志，到这里说明已经可以组成一个单词了。
            Trie[] next=new Trie[26]; //每个节点都有26个节点
            Trie append(char ch){  //拼接字符
                if(next[ch-'a']!=null){
                    return next[ch-'a']; //有则直接返回节点
                }
                next[ch-'a']=new Trie(); //没有就新建节点
                return next[ch-'a'];
            }
        }
        public boolean[][] vis;  //判断是否参观过
        public List<String> res;

        public List<String> findWords(char[][] board, String[] words) {
            int m=board.length;
            int n=board[0].length;
            Trie root=new Trie();
            for(String word:words){  //先把单词存入字典树当中
                Trie cur=root;
                char[] wd=word.toCharArray();
                for(char c:wd){
                    cur=cur.append(c);
                }
                cur.word=word;  //结束标志，说明到这里已经可以组成一个单词
            }
            res=new ArrayList<String>();
            vis=new boolean[m][n];
            for(int i=0;i<m;++i){  //对board每一个点都进行检索
                for(int j=0;j<n;++j){
                    dfs(root,i,j,board,m,n);
                }
            }
            Collections.sort(res);  //需要对结果进行排序
            return new ArrayList<String>(res);
        }

        public void dfs(Trie cur,int x,int y,char[][] board,int m,int n){
            if(x<0||y<0||x>=m||y>=n||vis[x][y]){
                return;
            } //边界返回
            cur=cur.next[board[x][y]-'a'];  //延伸下一个节点
            vis[x][y]=true; //把当前设置为走过 不可重复走
            if(cur!=null){ //如果当前不为null的话 可以继续检索
                if(cur.word!=null){ //说明到这里已经可以组成一个单词了
                    res.add(cur.word);
                    cur.word=null; //变成null是为了防止重复加入单词
                }
                for(int i=0;i<4;++i){
                    dfs(cur,x+dx[i],y+dy[i],board,m,n); //四个方向检索
                }
            }
            vis[x][y]=false;
        }
    }



