package daily;

import java.util.Arrays;

public class CountPrime {
    //埃式筛
    public int countPrimes(int n) {
        int []isPrime = new int[n];
        Arrays.fill(isPrime,1);
        int ans = 0;
        for(int i = 2; i < n; i++){
            if(isPrime[i] == 1)
            {
                ans++;
            }
            //强转为long
            if((long)i * i < n){
                for(int j = i; j < n; j += i){
                    isPrime[j] = 0;
                }
            }
        }
        return ans;
    }
}
