package bytedance.dynamicplanning_greed;


import java.util.Arrays;
import java.util.Comparator;

public class MaxEnvelope {
    /* public int maxEnvelopes(int[][] envelopes) {
          if (envelopes.length == 0 || envelopes == null || envelopes[0].length == 0) {
              return 0;
          }
          Arrays.sort(envelopes, new Comparator<int[]>() {
              @Override
              public int compare(int[] o1, int[] o2) {

                  if (o1[0] == o2[0])
                      return o2[1] - o1[1];
                  return o1[0] - o2[0];
              }
          });

          for( int i=0;i<envelopes.length;i++){
              System.out.println("\n");
              for(int j=0;j<envelopes[0].length;j++){
                  System.out.print(envelopes[i][j]);

              }

          }

          int res = 1;
          int max;
          for (int i = 0; i < envelopes.length-1; i++) {
              max = 1;
              /*if (i == envelopes.length - 1) {
                  res = Math.max(1, res);
                  break;
              }
              for (int j = i; j < envelopes.length - 1; j++) {
                  if (envelopes[j][0] < envelopes[j + 1][0] && envelopes[j][1] < envelopes[j + 1][1]) {
                      max++;
                      res = Math.max(max, res);
                  } else {
                      break;
                  }
              }
          }


          return res;*/
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes == null || envelopes.length == 0) {
            return 0;
        }

        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });

        int len = envelopes.length;
        int[] dp = new int[len];
        int max = 0;

        for (int i = 0; i < len; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if(envelopes[j][0] < envelopes[i][0] && envelopes[j][1] < envelopes[i][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if(max < dp[i]) {
                max = dp[i];
            }
        }

        return max;
    }





    public static void main(String[] args) {
        MaxEnvelope maxEnvelope = new MaxEnvelope();
        int[][] test = {{4, 5}, {4, 6}, {6, 7}, {2, 3}, {1, 1}};
        System.out.println(maxEnvelope.maxEnvelopes(test));
    }

}
