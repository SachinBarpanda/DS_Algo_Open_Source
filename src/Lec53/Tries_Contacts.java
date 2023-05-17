package Lec53;

import java.util.HashMap;
import java.util.Scanner;

public class Tries_Contacts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tries_Contacts tc = new Tries_Contacts();
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            if(s.equals("add")){
                tc.add(sc.next());
            }else if(s.equals("find")){
                System.out.println(tc.search(sc.next()));
            }
        }
    }
    private  class Node{
        char c;
        HashMap<Character,Node> map = new HashMap<>();
        boolean isTerminal = false;
        int count ;
    }
    private Node root;
    public Tries_Contacts(){
        Node nn = new Node();
        nn.c = '*';
        this.root = nn;
    }

    public  void add(String word){
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(node.map.containsKey(ch)){
                node = node.map.get(ch);
                node.count++;
            }else{
                Node nn = new Node();
                nn.c = word.charAt(i);
                node.map.put(ch,nn);
                node = nn;
                node.count = 1;
            }
        }
        node.isTerminal = true;
    }
    public  int search(String word){
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(node.map.containsKey(ch)){
                node = node.map.get(ch);
            }else{
                return 0;
            }
        }
        return node.count;
    }
}
