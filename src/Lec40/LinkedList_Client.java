package Lec40;

public class LinkedList_Client {
    public static void main(String[] args) throws Exception {
        LinkedList ll = new LinkedList();
        ll.addFirst(29);
        ll.addFirst(20);
        ll.addFirst(-5);
        ll.Display();
        ll.addLast(40);
        ll.addatindex(2,-9);
        ll.Display();
        ll.addFirst(200);
        ll.addFirst(300);
        ll.addFirst(201);
        ll.addFirst(202);
        System.out.println(ll.GetFirst());
        System.out.println(ll.GetLast());
        System.out.println(ll.GetAIndex(2));
        ll.Display();
        System.out.println(ll.removeFirst());
        ll.Display();
        System.out.println(ll.removeLast());
        ll.Display();
        System.out.println(ll.removeAtIndex(2));
        ll.Display();
    }
}
