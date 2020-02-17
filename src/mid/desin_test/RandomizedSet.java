package mid.desin_test;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103055472

import  java.util.*;
public class RandomizedSet {

        List<Integer> sub;
        HashMap<Integer,Integer> hm;
        Random rand;
        /** Initialize your data structure here. */
        public RandomizedSet() {


            sub =new ArrayList<Integer>();
            hm=new HashMap<Integer,Integer>();
            rand =new Random();

        }

        /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
        public boolean insert(int val) {
            if(hm.containsKey(val)){
                return false;
            }
            else{
                sub.add(val);
                hm.put(val,sub.size()-1);
                return true;
            }



        }

        /** Removes a value from the set. Returns true if the set contained the specified element. */
        public boolean remove(int val) {
            if(!hm.containsKey(val)){
                return false;
            }
            else{//换位置，再删
                int val_index=hm.get(val);
                if(val_index<sub.size()-1){
                    int lastElement=sub.get(sub.size()-1);
                    sub.set(val_index,lastElement);
                    hm.put(lastElement,val_index);
                }
                hm.remove(val);
                sub.remove(sub.size()-1);
                return true;
            }

        }

        /** Get a random element from the set. */
        public int getRandom() {
            return sub.get(rand.nextInt(sub.size()));
        }


/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */


}
