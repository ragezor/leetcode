package offer;

public class ReverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        int len=s.length();
        StringBuffer stringBuffer=new StringBuffer();
        int index=(len+n)%len;
        for (int i =index ; i <len ; i++) {
            stringBuffer.append(s.charAt(i));

        }
        for (int i = 0; i <index ; i++) {
            stringBuffer.append(s.charAt(i));
        }
        return  stringBuffer.toString();

    }

    public  static  void  main(String[] args){
        ReverseLeftWords reverseLeftWords=new ReverseLeftWords();
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseLeftWords.reverseLeftWords(s,k));
    }
}
