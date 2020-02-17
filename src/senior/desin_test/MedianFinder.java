package senior.desin_test;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103730043
import  java.util.*;
public class MedianFinder {
        /** initialize your data structure here. */
        PriorityQueue<Integer> maxHeap,minHeap;
        public MedianFinder() {
            maxHeap=new PriorityQueue<>();
            minHeap=new PriorityQueue<>();
        }

        public void addNum(int num) {
            maxHeap.add(num);
            minHeap.add(-maxHeap.poll()); //将maxheap堆的最小值的负数加入到minHeap堆中
            if(maxHeap.size()<minHeap.size())
                maxHeap.add(-minHeap.poll()); //将minheap堆的最小值的负数(即最大值）加入到maxHeap堆中
        }

        public double findMedian() {
            return maxHeap.size()>minHeap.size() ? (double)maxHeap.peek() : ((double)(maxHeap.peek()-minHeap.peek())/2);
        }
    };

