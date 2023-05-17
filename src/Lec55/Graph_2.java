package Lec55;

import java.util.*;

public class Graph_2 {
    HashMap<Integer, HashMap<Integer,Integer>> map;
    public Graph_2(int v){
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1 , int v2 , int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }

    public void display(){
        for(int i : map.keySet()){
            System.out.println(i + "->"+ map.get(i));
        }
    }
    public boolean BFS(int src , int des){
        Queue<Integer> q = new LinkedList();
        HashSet<Integer> set = new HashSet<>();
        q.add(src);
        while(!q.isEmpty()){
            int a = q.poll();
            if(set.contains(a)){
                continue;
            }
            set.add(a);
            if(a==des){
                return true;
            }
            for(int x : map.get(a).keySet()){
                if(!set.contains(x)) {
                    q.add(x);
                }
            }
        }
        return false;
    }
    public boolean DFS(int src , int des){
        Stack<Integer> st =  new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        st.push(src);
        while(!st.isEmpty()){
            int x = st.pop();
            if(visited.contains(x)){
                continue;
            }
            visited.add(x);
            if(x==des){
                return true;
            }
            for(int i : map.get(x).keySet()){
                if(!st.contains(i)) {
                    st.push(i);
                }
            }
        }
        return false;
    }
    public void BFT(){
        HashSet<Integer> set = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        for(int key : map.keySet()){
            if(!set.contains(key)){
                q.add(key);
                while(!q.isEmpty()){
                    int i = q.poll();
                    if(set.contains(i)){
                        continue;
                    }
                    set.add(i);
                    System.out.print(i+" ");
                    for(int x : map.get(i).keySet()){
                        if(!set.contains(x)) {
                            q.add(x);
                        }
                    }
                }
            }
        }
    }
    public void DFT(){
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        for(int src : map.keySet()){
            if(!visited.contains(src)){
                st.add(src);
                while(!st.isEmpty()){
                    int i = st.pop();
                    if(visited.contains(i)){
                        continue;
                    }
                    System.out.print(i+" ");
                    visited.add(i);
                    for(int x : map.get(i).keySet()){
                        if(!visited.contains(x)){
                            st.push(x);
                        }
                    }
                }
            }
        }
    }
    public boolean hasCycle(){
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        for(Integer src : map.keySet()){
            if(!visited.contains(src)){
                q.add(src);
                while(!q.isEmpty()){
                    int i = q.poll();
                    if(visited.contains(i)){
                        return true;
                    }
                    visited.add(i);
                    for(int x : map.get(i).keySet()){
                        if(!visited.contains(x)){
                            q.add(x);
                        }
                    }
                }
            }
        }
        return false;
    }
    public int countComponent(){
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        for(Integer src : map.keySet()){
            if(!visited.contains(src)){
                count++;
                q.add(src);
                while(!q.isEmpty()){
                    int i = q.poll();
                    if(visited.contains(i)){
                        continue;
                    }
                    visited.add(i);
                    for(int x : map.get(i).keySet()){
                        if(!visited.contains(x)){
                            q.add(x);
                        }
                    }
                }
            }
        }
        return count;
    }
    public void listView2D(){
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        for(int src : map.keySet()){
            List<Integer> list = new ArrayList<>();
            if(!visited.contains(src)){
                st.add(src);
                while(!st.isEmpty()){
                    int i = st.pop();
                    if(visited.contains(i)){
                        continue;
                    }
                    visited.add(i);
                    list.add(i);
                    for(int x : map.get(i).keySet()){
                        if(!visited.contains(x)){
                            st.push(x);
                        }
                    }
                }
            }
            ans.add(new ArrayList<>(list));
        }
        for(List a : ans){
            if(!a.isEmpty()){
                System.out.print(a+" ");
            }
        }
    }
}
