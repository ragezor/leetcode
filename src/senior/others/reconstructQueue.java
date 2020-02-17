package senior.others;
import  java.util.*;
/*
*题干 ：假设有打乱顺序的一群人站成一个队列。 每个人由一个整数对(h, k)表示，其中h是这个人的身高，k是排在这个人前面且身高大于或等于h的人数。 编写一个算法来重建这个队列。
*想法：每个人前边的人如果比它矮 就影响不了他的第二个值 也就是说我们可以首先排序
*如果身高相同就按照k值排序 排序过后在遍历 k之就是它的坐标
* 总结地址 ：https://blog.csdn.net/qq_43491066/article/details/104104993
 */
public class reconstructQueue {
    public int[][] reconstructQueue(int[][] people) {
        //自定义比较器 高的在前边 k小的在前边
        Arrays.sort(people,new Comparator<int []>(){
            public int compare(int []a,int[]b){
                if(a[0]!=b[0]) return b[0]-a[0];
                else return  a[1]-b[1];
            }
        });

        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < people.length; i++) {
            //根据k值插入
            int[] person = people[i];
            res.add(person[1], person);
        }
        return res.toArray(new int[people.length][]);
    }

}
