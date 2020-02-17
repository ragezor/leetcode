package senior.desin_test;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/103704380
import  java.util.*;
public class LRUCache {


        Node head=new Node(0,0);
        Node tail=new Node(0,0);
        Map<Integer,Node> map=new HashMap<>();
        int max_len;

        class Node{//定义双向链表的节点
            Node prev,next;//前驱后继
            int key,value;//对应hashmap的key和value
            Node(int key,int value){
                this.key=key;
                this.value=value;
            }
        }

        public LRUCache(int capacity) {
            max_len=capacity;//容量
            head.next=tail;//建立双向链表
            tail.prev=head;

        }

        public int get(int key) {

            if(map.containsKey(key)){//如果已经存在，更新位置到链表尾
                Node tem=map.get(key);
                remove(tem);//删除tem
                add(tem);//加到队尾

                return tem.value;
            }else{
                return -1;
            }

        }

        public void put(int key, int value) {
            if(map.containsKey(key)){
                remove(map.get(key));//有 删掉，为了更新到队尾
            }
            if(map.size()==max_len){
                remove(head.next);//满了删表头

            }
            add(new Node(key,value));//都要加到队尾

        }

        public void remove(Node node){//删
            map.remove(node.key);
            node.prev.next=node.next;
            node.next.prev=node.prev;
        }


        public void add(Node node){//加队尾
            map.put(node.key,node);
            Node pre_tail=tail.prev;
            pre_tail.next=node;
            node.prev=pre_tail;
            node.next=tail;
            tail.prev=node;
        }
    }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */




