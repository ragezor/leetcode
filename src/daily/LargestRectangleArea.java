package daily;
import  java.util.*;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106438130
public class LargestRectangleArea {
        public int largestRectangleArea(int[] heights) {
            Stack<Integer> stack=new Stack<>();//栈 维护宽度
            stack.push(-1);//入一个-1保证最小
            int maxarea=0;
            for(int i=0;i<heights.length;++i){
                while(stack.peek()!=-1&&heights[stack.peek()]>=heights[i])//如果这个比栈顶小，栈顶出栈，更新maxarea
                    maxarea = Math.max(maxarea, heights[stack.pop()] * (i - stack.peek() - 1));
                stack.push(i);//i入栈，成为现在栈顶，也是最大

            }
            while(stack.peek()!=-1)//边界 全出
                maxarea=Math.max(maxarea,heights[stack.pop()]*(heights.length-stack.peek()-1));
            return maxarea;

        }
    }


