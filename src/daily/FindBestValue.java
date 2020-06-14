package daily;

import java.util.Arrays;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106742600
public class FindBestValue {
       public int findBestValue(int[] arr, int target) {
            Arrays.sort(arr);
            int n = arr.length;
            int[] prefix = new int[n + 1];
            for (int i = 1; i <= n; ++i) {
                prefix[i] = prefix[i - 1] + arr[i - 1];
            }
            int r = arr[n - 1];
            int ans = 0, diff = target;
            for (int i = 1; i <= r; ++i) {
                int index = Arrays.binarySearch(arr, i);
                if (index < 0) {
                    index = -index - 1;
                }
                int cur = prefix[index] + (n - index) * i;
                if (Math.abs(cur - target) < diff) {
                    ans = i;
                    diff = Math.abs(cur - target);
                }
            }
            return ans;
        }


        public  static  void main (String[] args){
           FindBestValue findBestValue=new FindBestValue();
           int[] arr = {4,9,3};
           int target = 10;

            System.out.println(findBestValue.findBestValue(arr,target));
        }
    }

