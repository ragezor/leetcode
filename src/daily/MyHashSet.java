package daily;

import java.util.Iterator;
import java.util.LinkedList;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/114729992
public class MyHashSet {

    private  static  final  int BASE=769;
    private LinkedList [] data;
    /** Initialize your data structure here. */
    public MyHashSet() {
        data= new LinkedList[BASE];
        for (int i = 0; i <BASE ; i++) {
            data[i]=new LinkedList();
        }

    }

    public void add(int key) {
        int h = hash(key);
        Iterator<Integer> iterator = data[h].iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element == key) {
                return;
            }
        }
        data[h].offerLast(key);



    }

    public void remove(int key) {
        int h = hash(key);
        Iterator<Integer> iterator = data[h].iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element == key) {
                data[h].remove(element);
                return;
            }
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int h = hash(key);
        Iterator<Integer> iterator = data[h].iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element == key) {
                return true;
            }
        }
        return false;
    }

    private static int hash(int key) {
        return key % BASE;
    }

}
