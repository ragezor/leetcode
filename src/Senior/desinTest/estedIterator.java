package Senior.desinTest;
import  java.util.*;
/*
*题干
* 给定一个嵌套的整型列表。设计一个迭代器，使其能够遍历这个整型列表中的所有整数。
*列表中的项或者为一个整数，或者是另一个列表。
* 想法：看题干这道题就是用已经有的接口的几个方法，来实现hasnext和next的功能
*我们可以在初始化迭代器的时候就直接把结果遍历出来，递归遍历列表中的数据，是整数就放入List，不是则再递归遍历，代码结构简单。
*最后全都是整数就很好判断了
* 总结地址：https://blog.csdn.net/qq_43491066/article/details/104092431
 */

    /**
     * // This is the interface that allows for creating nested lists.
     * // You should not implement it, or speculate about its implementation
     * public interface NestedInteger {
     *
     *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
     *     public boolean isInteger();
     *
     *     // @return the single integer that this NestedInteger holds, if it holds a single integer
     *     // Return null if this NestedInteger holds a nested list
     *     public Integer getInteger();
     *
     *     // @return the nested list that this NestedInteger holds, if it holds a nested list
     *     // Return null if this NestedInteger holds a single integer
     *     public List<NestedInteger> getList();
     * }
     */
    /*public class NestedIterator implements Iterator<Integer> {

        private List<Integer> list;
        private int index;

        public NestedIterator(List<NestedInteger> nestedList) {
            list = integerIterator(nestedList);
            index = -1;
        }

        @Override
        public Integer next() {
            if (this.hasNext())  return list.get(++index);
            return null;
        }

        @Override
        public boolean hasNext() {
            if (index + 1 < list.size()) return true;
            return false;
        }

        private static List<Integer> integerIterator(List<NestedInteger> nestedIntegerList) {
            ArrayList<Integer> list = new ArrayList<>(nestedIntegerList.size());
            for (NestedInteger tmp : nestedIntegerList) {
                if (tmp.isInteger())
                    list.add(tmp.getInteger());
                else
                    list.addAll(integerIterator(tmp.getList()));
            }
            return list;
        }
    }



/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */




