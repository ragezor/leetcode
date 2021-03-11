package offer;

public class ReverseWords {
    public String reverseWords(String s) {
      String []strs=s.trim().split(" ");
      StringBuffer res= new StringBuffer();
        for (int i = strs.length-1; i >=0 ; i--) {
            if(strs[i].equals("")){
                continue;
            }
            res.append(strs[i]+" ");

        }
        return  res.toString().trim();
    }


}
