package InterviewSummary.mockInterview;
/*
题干：在一条环路上有 N 个加油站，其中第 i 个加油站有汽油 gas[i] 升。
你有一辆油箱容量无限的的汽车，从第 i 个加油站开往第 i+1 个加油站需要消耗汽油 cost[i] 升。你从其中的一个加油站出发，开始时油箱为空。
如果你可以绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1。
说明:
如果题目有解，该答案即为唯一答案。
输入数组均为非空数组，且长度相同。
输入数组中的元素均为非负数。
————————————————
想法：用一个sum来记录现在这哥起点的的加的气和消耗的气的总差值
start记录开始的位置
total记录 加的气和消耗的气的总差值
遍历一遍如果油箱没油了
就从现在结束的位置开始下一轮而不用 从之前开始的位置的后一个
显而易见的是
因为开始的那个位置加的油一定大于消耗的油
也就是开始位置其实是加油的过程
即使这样跑到现在的位置油箱也没油 可见如果不要开始那一段就更没油
所以直接从现在结束的位置开始作为新的起点即可
————————————————

总结地址：https://blog.csdn.net/qq_43491066/article/details/104193440
 */
public class canCompleteCircuit {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // 参数检验
        if (gas == null || cost == null || gas.length == 0 || gas.length != cost.length) {
            return -1;
        }

        // 记录访问的起始点
        int start = 0;
        // 加的气和消耗的气的总差值
        int total = 0;
        // 从start位置开始，加的气和消耗的气的总差值
        int sum = 0;

        for (int i = 0; i < gas.length; i++) {
            total += (gas[i] - cost[i]);

            // 如是油箱没有油了
            if (sum < 0) {
                // 重新设置油箱中的油
                sum = gas[i] - cost[i];
                // 记录新的起点位置
                start = i;
            } else {
                // 油箱中还有油，更新油箱中的油数
                sum += (gas[i] - cost[i]);
            }
        }

        return total >= 0 ? start : -1;
    }
}


