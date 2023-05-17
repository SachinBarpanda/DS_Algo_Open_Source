package Lec53;

public class Trie_Client {
    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("app");
        t.insert("apple");
        t.insert("raj");
        t.insert("rajesh");
        t.insert("go");
        t.insert("google");
        t.insert("man");
        t.insert("mango");
        t.insert("rat");
        t.insert("ankit");
        t.insert("ankita");
        System.out.println(t.search("ap"));
        System.out.println(t.search("app"));
        System.out.println(t.startsWith("ap"));
    }

}
