package random;

import java.sql.SQLOutput;

public class RemoveElement {
//    public int removeElement(int[] nums, int val) {
//          int len=nums.length;
//          int index=-1,count=0;
//          for ( int i=0;i<len;i++){
//              if(val==nums[i]){
//                  index=i;
//                  count++;
//              }
//              if(index!=-1){
//                  nums[index]=nums[i];
//                  index=-1;
//              }
//
//          }
//        return  len-count;
//    }
public void removeElement(int[] nums, int val) {
    int len=nums.length;
    int index=-1,count=0;
    for ( int i=0;i<len;i++){
        if(val==nums[i]){
            index=i;
            count++;
            continue;
        }
        if(index!=-1){
            nums[index]=nums[i];
            index=-1;
        }

    }

        for (int i=0;i<len-count;i++){

            System.out.print(nums[i]);
        }


}

public static  void main(String[] args){
    RemoveElement removeElement=new RemoveElement();
    int[] nums = {0,1,2,2,3,0,4,2};int  val = 2;
    removeElement.removeElement(nums,val);


}

}
