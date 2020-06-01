package daily;
import java.util.*;
//总结地址；https://blog.csdn.net/qq_43491066/article/details/106467174
public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxamount=candies[0];
        for (int c: candies
             ) {
            maxamount=Math.max(c,maxamount);
        }
        int minamount=maxamount-extraCandies;
        List<Boolean> res=new ArrayList<>();
        for (int candi:candies
             ) {
            if (candi>=minamount){
                res.add(true);
            }
            else {
                res.add(false);
            }

        }
        return  res;
    }
    public static  void main(String[] args){
        KidsWithCandies kidsWithCandies=new KidsWithCandies();
        int [] candies={2,3,5,1,3};
        List<Boolean> res=new LinkedList<>();
        res=kidsWithCandies.kidsWithCandies(candies,3);
        System.out.println(res.toString());
    }
}
