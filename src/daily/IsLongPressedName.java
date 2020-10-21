package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/109193571
public class IsLongPressedName {
    public boolean isLongPressedName(String name, String typed) {
     int i=0,j=0;
     while(j<typed.length()){
         if(i<name.length()&&name.charAt(i)==typed.charAt(j)){
             i++;
             j++;
         }
         else if(j>0&&typed.charAt(j-1)==typed.charAt(j)){
             j++;
         }
         else {
             return  false;
         }
     }
     return  i==name.length();
    }

    public static  void main(String[] args){
        IsLongPressedName isLongPressedName=new IsLongPressedName();
        String name = "saeed", typed = "ssaaedd";
        System.out.println(isLongPressedName.isLongPressedName(name,typed));
    }

}
