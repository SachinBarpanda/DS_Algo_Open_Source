package Lec52;

import java.util.ArrayList;
class Main1{
    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.add(2);
        hp.add(3);
        hp.add(5);
        hp.add(1);
        hp.add(7);
        hp.add(-2);
        hp.add(4);
        hp.add(-7);
        hp.add(-11);
        hp.Display();
        System.out.println(hp.remove());
        System.out.println(hp.getMin());
        hp.Display();
    }
}

public class Generic_Heap <T extends Comparable<T>>{

    public int large(T pi , T ci){//pi is more prior than ci
        return pi.compareTo(ci);
    }

    private ArrayList<T> list = new ArrayList<>();
    public void add(T item){
        list.add(item);
        upheapify(list.size()-1);
    }
    private void upheapify(int ci){
        int pi = (ci-1)/2;
        if(large(list.get(ci),list.get(pi))>0){//try changing if to while just for fun
            swap(pi,ci);
            upheapify(pi);
        }
    }
    private void swap(int i , int j ){
        T ith = list.get(i);
        T jth = list.get(j);
        list.set(i,jth);
        list.set(j,ith);
    }
    public T getMin(){
        return list.get(0);
    }
    public void Display(){
        System.out.println(list);
    }
    public T remove(){
        swap(0,list.size()-1);
        T rv = list.remove(list.size()-1);
        downHeapify(0);
        return rv;
    }
    private void downHeapify(int pi){
        int lci = 2*pi+1;
        int rci = 2*pi+2;
        int mini=pi;
        if(list.size()>lci && large(list.get(lci),list.get(mini))>0){//lci ki priority zada hai mini se
            mini = lci;
        }
        if(list.size()>rci && large(list.get(rci),list.get(mini))>0){
            mini = rci;
        }
        if(mini!=pi){
            swap(mini,pi);
            downHeapify(mini);
        }
    }

}
