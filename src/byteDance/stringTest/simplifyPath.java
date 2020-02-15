package byteDance.stringTest;
/*
题干：
以 Unix 风格给出一个文件的绝对路径，你需要简化它。或者换句话说，将其转换为规范路径。

在 Unix 风格的文件系统中，一个点（.）表示当前目录本身；此外，两个点 （…） 表示将目录切换到上一级（指向父目录）；两者都可以是复杂相对路径的组成部分。更多信息请参阅：Linux / Unix中的绝对路径 vs 相对路径

请注意，返回的规范路径必须始终以斜杠 / 开头，并且两个目录名之间必须只有一个斜杠 /。最后一个目录名（如果存在）不能以 / 结尾。此外，规范路径必须是表示绝对路径的最短字符串。
具体参考反思：https://blog.csdn.net/qq_43491066/article/details/104261045


想法：
从题干我们发现有的文件你虽然在相对路径里出现了但是绝对路径没有
于是肯定需要一个结构来存储，显然这个结构是需要返回离现在最近的，也就是栈的结构
先将字符串依"/"分割出来，然后检查每个分割出来的字符串。

当字符串为空或者为"."，不做任何操作。

当字符串不为"…"，则将字符串入栈。

当字符串为"…", 则弹栈（返回上级目录）。

最后再全部倒着出栈即可

 */

import java.util.*;
public class simplifyPath {
    public String simplifyPath(String path) {
    if(path==null||path.length()==0){
        return path;
    }
    Stack<String> stack=new Stack<>();

    StringBuilder sb=new StringBuilder();
    String [] slist=path.split("/");
        for(int i=0;i<slist.length;i++){
        //当前文件或者空 步操作
        if(slist[i].equals(".")||slist[i].length()==0){
            continue;
        }
        else if(slist[i].equals("..")){
            //如果要返回上一级就必然检查是否为空
            if(!stack.isEmpty()){
                stack.pop();
            }

        }
        else{
            //否则继续遍历
            stack.push(slist[i]);
        }
    }
        if (stack.isEmpty())
                //题干说了开头都要/
                return "/";

    StringBuffer res = new StringBuffer();
        for (int i = 0; i < stack.size(); i++) {
        res.append("/" + stack.get(i));
    }
        return res.toString();
}
}


