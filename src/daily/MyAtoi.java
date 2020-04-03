package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/105288670
public class MyAtoi {
    public int myAtoi(String str) {
        char[] res=str.toCharArray();
        int len=res.length;
        int index=0;
        boolean negative=false;
        while(index<len&&res[index]==' '){
            index++;
        }
        if(index==len){
            return 0;
        }
        if(res[index]=='-'){
            negative=true;
            index++;

        }
        else if(res[index]=='+'){
            index++;
        }
        else if(!Character.isDigit(res[index])){
            return 0;
        }
        int num=0;

        while(index<len&&Character.isDigit(res[index])){
            int digit=res[index]-'0';
            if(num>(Integer.MAX_VALUE-digit)/10){
                return  negative? Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            else {
                num=num*10+digit;
                index++;
            }
        }
        return  negative? -num:num;

    }

    public static  void main(String[] args){
        MyAtoi myAtoi=new MyAtoi();
        String test1="-91283472332";
        System.out.println(myAtoi.myAtoi(test1));
    }
}
