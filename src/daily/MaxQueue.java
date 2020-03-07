package daily;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/104710579
public class MaxQueue {
    int QueueHead = 0;
    int QueueTail = 0;
    int[] Queue;
    int MaxQueueHead = 0;
    int MaxQueueTail = 0;
    int[] MaxQueue;

    public MaxQueue() {
        Queue = new int[10000];
        MaxQueue = new int[10000];

    }

    public int max_value() {
        if (MaxQueueHead == MaxQueueTail) {
            return -1;
        }
        return MaxQueue[MaxQueueHead];

    }

    public void push_back(int value) {
        Queue[QueueTail++] = value;
        while (MaxQueueHead != MaxQueueTail && MaxQueue[MaxQueueTail-1] < value) {
            //找到value合适的位置
            MaxQueueTail--;
        }
        MaxQueue[MaxQueueTail++] = value;


    }

    public int pop_front() {
        if (QueueHead==QueueTail){
            return  -1;
        }
        int res = Queue[QueueHead];
        if(res == MaxQueue[MaxQueueHead]){
            MaxQueueHead++;
        }
        QueueHead++;
        return  res;

    }
}

