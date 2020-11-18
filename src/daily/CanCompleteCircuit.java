package daily;

public class CanCompleteCircuit {
    //总结地址https://blog.csdn.net/qq_43491066/article/details/109775052
    public int canCompleteCircuit(int[] gas, int[] cost) {

        if (gas == null || cost == null || gas.length == 0 || gas.length != cost.length) {
            return -1;
        }
        int start=0, sum=0,total=0;
        for (int i = 0; i <gas.length ; i++) {
            total+=gas[i]-cost[i];
            if(sum<0){
                sum=gas[i]-cost[i];
                start=i;
            }
            else {
                sum+=gas[i]-cost[i];
            }

        }
        return   total>=0?start:-1;

    }

}
