package Lec48;

public class LinkedListClient {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.addLast("Raj");
        ll.addLast("Riya");
        ll.addLast("Ankit");
        ll.addLast("Kunal");

        LinkedList<Character> ll1 = new LinkedList<>();
        ll1.addLast('a');
        ll1.addLast('b');
        ll1.addLast('c');
        ll1.addLast('d');

        LinkedList<Integer> ll2 = new LinkedList<>();
        ll2.addLast(2);
        ll2.addLast(21);
        ll2.addLast(-1);
        ll2.addLast(219);
        ll.Display();
        ll1.Display();
        ll2.Display();
    }
}
