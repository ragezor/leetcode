package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/108959023
public class ReverseString {
    public void reverseString(char[] s) {
        if(s==null||s.length==0){
            return;
        }
        int left=0;
        int right=s.length-1;
        while(left<right){
            swap(left,right,s);
            left++;
            right--;
        }

    }

    public void swap(int left,int right,char []s){
        char tem=s[left];
        s[left]=s[right];
        s[right]=tem;

    }

}
