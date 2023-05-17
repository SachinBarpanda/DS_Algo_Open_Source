package Lec50;

import java.util.ArrayList;

public class MyHashMap<K,V> {
    public class Node{
        K key;
        V value;
        Node next;
    }
    ArrayList<Node> bucket;
    private int size;
    public MyHashMap(){
        this(4);//constructor can be called from class
    }
    public MyHashMap(int cap){
        bucket = new ArrayList<>();
        for (int i = 0; i < cap; i++) {
            bucket.add(null);
        }

    }
    private void rehashing(){
        ArrayList<Node> nba = new ArrayList<>();
        for (int i = 0; i < 2 * bucket.size() ; i++) {
            nba.add(null);
        }
        ArrayList<Node> oba = bucket;
        bucket = nba;
        for(Node temp : oba){
            while(temp!=null){
                put(temp.key, temp.value);
                temp = temp.next;
            }
        }
    }
    public void put(K key, V value){
        int idx = hashfun(key);
        Node temp = bucket.get(idx);
        while(temp!=null){
            if(temp.key.equals(key)){
                temp.value = value;
                return;
            }
            temp = temp.next;
        }
        size++;
        Node nn = new Node();
        nn.key = key;
        nn.value = value;
        temp = bucket.get(idx);
        nn.next = temp;
        bucket.set(idx,nn);
        double lf = ((1.0 * size)/bucket.size());
        double thf = 2.0;
        if(lf>thf){
            rehashing();
        }
    }
    public boolean containsKey(K key){
        int idx = hashfun(key);
        Node temp = bucket.get(idx);
        while(temp!=null){
            if(temp.key.equals(key)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public V get(K key){
        int idx = hashfun(key);
        Node temp = bucket.get(idx);
        while(temp!=null){
            if(temp.key.equals(key)){
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }

    public V remove(K key){
        int idx = hashfun(key);
        Node curr = bucket.get(idx);
        Node prev = null;
        while(curr!=null){
             if(curr.key.equals(key)){
                 break;
             }
             prev = curr ;
             curr = curr.next;
        }
        if(prev == null){
            bucket.set(idx,curr.next);
            curr.next = null;
            size--;
            return curr.value;
        }
        else if(curr !=null){
            prev.next= curr.next;
            curr.next = null;
            size--;
            return curr.value;
        }else{
            return null;
        }
    }

    public int hashfun(K key){
        int bn = key.hashCode() % bucket.size();
        if(bn<0){
            bn+=bucket.size();
        }
        return bn;
    }
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        String s = "{";
        for(Node temp : bucket){
            while(temp!=null){
                s = s + temp.key + " = " +  temp.value + ", ";
                temp = temp.next;
            }
        }
        return s+"}";
    }
}
