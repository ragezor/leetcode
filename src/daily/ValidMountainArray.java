package daily;

public class ValidMountainArray {
    //总结地址：https://blog.csdn.net/qq_43491066/article/details/109462238
    public boolean validMountainArray(int[] A) {
        if(A==null){
            return  false;
        }
        int len=A.length;
        if(len<3){
            return false;
        }
        int index=0;
        while(index<len-1&&A[index]<A[index+1]){
            index++;
        }
        if(index==0||index==len-1){
            return  false;
        }
        while (index<len-1&&A[index]>A[index+1]){
            index++;
        }
        return  index==len-1;



    }
    public  static  void main(String [] args){
        ValidMountainArray validMountainArray=new ValidMountainArray();
        int []A={0,3,2,1};
        System.out.println(validMountainArray.validMountainArray(A));
    }


}
