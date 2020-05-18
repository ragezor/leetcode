package goldeninterview;

import daily.IsSubtree;

import java.util.HashSet;

public class IsUnique {
    public boolean isUnique(String astr) {
        int len=astr.length();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<len;i++){
            set.add(astr.charAt(i));
        }
        return  set.size()==len;

    }
    public static  void main(String[] args){
        IsUnique isUnique=new IsUnique();
        System.out.println(isUnique.isUnique("leetcode"));
        System.out.println(isUnique.isUnique("abc"));

    }
}
