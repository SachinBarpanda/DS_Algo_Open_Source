package Lec41;

public class Reverse_Linked_List {
    public static void main(String[] args) {
        Reverse_Linked_List ll = new Reverse_Linked_List();
        ll.addLast(1);ll.addLast(6);ll.addLast(9);
        ll.addLast(24);ll.addLast(35);
        ll.Display();
        Reverse_Linked_List ll1 = new Reverse_Linked_List();
        ll1.addLast(1);ll1.addLast(2);ll1.addLast(11);
        ll1.addLast(12);ll1.addLast(15);
        ll1.Display();
//        ll.head = reverseList(ll.head);
//        ll.Display();
        Reverse_Linked_List ansLL = new Reverse_Linked_List();

        ansLL.head = ll.MergeList(ll.head, ll1.head);
        ansLL.Display();
    }
    public Node MergeList(Node head1, Node head2){
        Node ansHead = new Node();
        Node temp = ansHead;
        while(head1!=null && head2!=null){
            if(head1.data < head2.data){
                ansHead.next = head1;
                ansHead = ansHead.next;
                head1 = head1.next;
            }else{
                ansHead.next = head2;
                ansHead = ansHead.next;
                head2 = head2.next;
            }
        }
        if(head1!=null){
            ansHead.next = head1;
        }
        if(head2!=null){
            ansHead.next = head2;
        }
        return temp.next;

    }
    public static Node reverseList(Node head){
        Node curr = head;
        Node prev = head;
        curr = curr.next;
        prev.next = null;
        while(curr!=null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
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
            tail = temp;
            tail.next = null;
            size--;
            return temp.data;
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
