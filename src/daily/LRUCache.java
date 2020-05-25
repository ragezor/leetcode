package daily;

import java.util.HashMap;
//总结地址：https://blog.csdn.net/qq_43491066/article/details/106327324
public class LRUCache {
    //map存储key和节点
    HashMap<Integer,Node> map=new HashMap<>();
    //尾巴 头
    Node tail= new Node(0, 0);
    Node head= new Node(0, 0);
    //最大容量
    int max_len;

    //定义节点
    public static class  Node{
        int key,val;
        Node pre,next;
        Node(int key,int val){
            this.key=key;
            this.val=val;
        }


    }
    //初始化容量和双向链表
    public LRUCache(int capacity) {
        max_len=capacity;
        head.next=tail;
        tail.pre=head;

    }

    public int get(int key) {
        //如果密钥 (key) 存在于缓存中，则获取密钥的值（总是正数），否则返回 -1。
        if(map.containsKey(key)){
            Node tem=map.get(key);
            remove(tem);
            add(tem);
            return  tem.val;
        }
        else {
            return -1;
        }

    }

    public void put(int key, int value) {
        //写入数据 put(key, value) - 如果密钥已经存在，则变更其数据值；如果密钥不存在，则插入该组「密钥/数据值」
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        //满了删头节点
        if(max_len==map.size()){
            remove(head.next);
        }
        //add里已经更改map了

        add(new Node(key, value));



    }
//加 都加在末尾 也加map
    public void add(Node node){
        map.put(node.key,node);
        Node pre_tail=tail.pre;
        pre_tail.next=node;
        node.pre=pre_tail;
        node.next=tail;
        tail.pre=node;
  }

  public void remove(Node node){
        //删除节点 删除map和node
        map.remove(node.key);
        node.pre.next=node.next;
        node.next.pre=node.pre;

  }

  public static  void main(String[]args){
      LRUCache cache = new LRUCache( 2 /* 缓存容量 */ );
      cache.put(1, 1);
      cache.put(2, 2);
      System.out.println(cache.get(1));       // 返回  1
      cache.put(3, 3);    // 该操作会使得密钥 2 作废
      System.out.println(cache.get(2));       // 返回 -1 (未找到)
      cache.put(4, 4);    // 该操作会使得密钥 1 作废
      System.out.println(cache.get(1));       // 返回 -1 (未找到)
      System.out.println(cache.get(3));       // 返回  3
      System.out.println(cache.get(4));       // 返回  4



  }
}
