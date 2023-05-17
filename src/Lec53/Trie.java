package Lec53;

import java.util.HashMap;

public class Trie {

    private class Node{
        char data;
        HashMap<Character,Node> children  = new HashMap<>();
        boolean isTerminal = false;
    }

    private Node root;
    public Trie(){
        Node nn = new Node();
        nn.data = '*';
        this.root = nn;
    }
    public void insert(String word){
        Node temp = root;
        for(int i = 0 ; i < word.length();i++){
            if(temp.children.containsKey(word.charAt(i))){
                temp = temp.children.get(word.charAt(i));
            }else{
                Node nn = new Node();
                nn.data = word.charAt(i);
                temp.children.put(word.charAt(i),nn);
                temp = nn;
            }
        }
        temp.isTerminal = true;
    }
    public boolean search(String word){
        Node temp = root ;
        for(int i = 0; i < word.length() ; i++){
            char ch = word.charAt(i);
            if(temp.children.containsKey(ch)){
                temp = temp.children.get(ch);
            }else{
                return false;
            }
        }
        return temp.isTerminal;
    }
    public boolean startsWith(String word){
        Node temp = root;
        for (int i = 0; i <word.length() ; i++) {
            char ch = word.charAt(i);
            if(temp.children.containsKey(ch)){
                temp = temp.children.get(ch);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
