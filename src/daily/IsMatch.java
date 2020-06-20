package daily;

public class IsMatch {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/106869401
    public boolean isMatch(String s, String p) {
        //p为空 s为空才能匹配
        if (p.isEmpty()){
            return  s.isEmpty();
        }
        //第一个位置匹配山
        boolean first_match=!s.isEmpty()&&(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.');
        //第二个位置为*
        if(p.length()>=2&&p.charAt(1)=='*')  {
            //全部能匹配上或者p的后半部分匹配全部s
            return (isMatch(s,p.substring(2))||(first_match&&isMatch(s.substring(1),p)));
        }
        else {
            //或者全部匹配
            return  first_match&&isMatch(s.substring(1),p.substring(1));
        }
    }

    public  static  void main(String[] args){
        IsMatch isMatch=new IsMatch();
       String  s = "ab"
       ,p= ".*c";
        System.out.println(isMatch.isMatch(s,p));
    }

}
