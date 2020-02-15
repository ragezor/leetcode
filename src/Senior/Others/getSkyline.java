package Senior.Others;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103771081
import java.util.*;
public class getSkyline {
        public List<List<Integer>> getSkyline(int[][] buildings) {

            int[][] arrange=new int[2*buildings.length][2];
            List<List<Integer>>ans = new ArrayList<>();
            if(buildings.length<=0){
                return ans;
            }
            for(int i=0;i<buildings.length;i++){

                arrange[2*i][0]=buildings[i][0];
                arrange[2*i][1]=-buildings[i][2];
                arrange[2*i+1][0]=buildings[i][1];
                arrange[2*i+1][1]=buildings[i][2];

            }
            //sort
            Arrays.sort(arrange,new Comparator<int[]>(){
                public int compare(int[] o1,int[] o2){
                    if(o1[0]!=o2[0]){
                        return o1[0]-o2[0];
                    }else{
                        return o1[1]-o2[1];//这里区间可以拼接，所以start在前 end 在后
                    }
                }
            });
            // for height calculation
            PriorityQueue<Integer> que = new PriorityQueue(11,new Comparator<Integer>(){
                public int compare(Integer o1,Integer o2){
                    return o2-o1;
                }
            });

            int pre=0;
            int cp=0;
            //sweep
            for(int i=0;i<arrange.length;i++){

                if(arrange[i][1]<0){
                    //start
                    que.offer(-arrange[i][1]);
                }else que.remove(arrange[i][1]);//end

                int now=0;
                //now height
                if(que.size()>0){
                    now=que.peek();
                }
                // they are different store change point
                if(now!=pre){
                    List<Integer> subans=new ArrayList<>();
                    cp=arrange[i][0];
                    pre=now;
                    subans.add(cp);
                    subans.add(pre);
                    ans.add(subans);
                }
            }
            return ans;
        }
    }



