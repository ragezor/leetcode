package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/104939987
public class IsRectangleOverlap {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

            return !(rec1[2] <= rec2[0] ||
                    rec1[3] <= rec2[1] ||
                    rec1[0] >= rec2[2] ||
                    rec1[1] >= rec2[3]);
        }

    public  static  void main(String[] args){
        IsRectangleOverlap isRectangleOverlap=new IsRectangleOverlap();
        int [] rec1={0,0,2,2};
        int [] rec2={1,1,3,3};
        System.out.println(isRectangleOverlap.isRectangleOverlap(rec1,rec2));

    }
}
