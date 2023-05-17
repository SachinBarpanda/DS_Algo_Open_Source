package Lec41;

public class Sort_List {
    public static void main(String[] args) {
        Sort_List ll = new Sort_List();
        ll.addLast(24);ll.addLast(35);
        ll.addLast(1);ll.addLast(6);ll.addLast(9);
        ll.Display();
        ll.head = ll.separate(ll.head);
        ll.Display();
    }
    public Node separate(Node head){
        if(head==null || head.next == null){
            return head;
        }
        Node mid = findMid(head);
        Node midNext = mid.next;
        mid.next = null;
        Node toJoin2 = separate(head);
        Node toJoin1 = separate(midNext);
        return mergeSingleList(toJoin1, toJoin2);
    }
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public Node mergeSingleList(Node head1 , Node head2){
        Node temp = new Node();
        Node head= temp;
        while(head1!=null && head2!=null){
            if(head1.data < head2.data){
                temp.next = head1;
                temp = temp.next;
                head1= head1.next;
            }else{
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }
        }
        if(head1!=null){
            temp.next = head1;
        }
        if(head2!=null){
            temp.next = head2;
        }
        return head.next;
    }
    private static class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;
    public void addFirst(int item) {
        if (size == 0) {
            Node newNode = new Node();
            newNode.data = item;
            this.head = newNode;
            this.tail = newNode;
            this.size++;
        } else {
            Node newNode = new Node();
            newNode.data = item;
            newNode.next = head;
            this.head = newNode;
            this.size++;
        }
    }

    public void addLast(int item) {
        if (size == 0) {
            addFirst(item);
        } else {
            Node newNode = new Node();
            newNode.data = item;
            tail.next = newNode;
            tail = newNode;
            this.size++;
        }
    }

    public Node GetNode(int k) throws Exception {
        Node temp = head;
//        if(k==0){
//            return head;
//        }else{
//            while(k--!=0){
//                temp = temp.next;
//            }
//            return temp;
//        }
        if (k < 0 || k >= size) {
            throw new Exception("Index valid de bklol");
        }
        for (int i = 1; i <= k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void addatindex(int k, int item) throws Exception {
        if (k == 0) {
            addFirst(item);
        } else if (k == size - 1) {
            addLast(item);
        } else {
            Node newNode = new Node();
            newNode.data = item;
            Node kPrev = GetNode(k - 1);
            newNode.next = kPrev.next;
            kPrev.next = newNode;
            size++;
        }
    }

    public int GetFirst() throws Exception {
        if (size == 0) {
            throw new Exception("bklol khali hai");
        }
        return head.data;
    }

    public int GetLast() throws Exception {
        if (size == 0) {
            throw new Exception("bklol khali hai");
        }
        return tail.data;
    }

    public int GetAIndex(int k) throws Exception {
        return GetNode(k).data;
    }

    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(".");
    }

    public int removeFirst() throws Exception {
        if (size == 0) {
            throw new Exception("bklol khali hai");
        }
        Node temp = head;
        head = head.next;
        if (size == 1) {
            tail = null;
        }
        size--;
        temp.next = null;
        return temp.data;
    }

    public int removeLast() throws Exception {
        if (size == 0) {
            throw new Exception("bklol khali hai");
        }
        if (size == 1) {
            return removeFirst();
        } else {
            Node temp = GetNode(size - 2);
            int data = tail.data;
            tail = temp;
            tail.next = null;
            size--;
            return data;
        }
    }

    public int removeAtIndex(int k) throws Exception {
        if (k == 0) {
            return removeFirst();
        }
        if (k == size - 1) return removeLast();
        Node curr = GetNode(k);
        Node prev = GetNode(k - 1);
        prev.next = curr.next;
        curr.next = null;
        size--;
        return curr.data;
    }
}
