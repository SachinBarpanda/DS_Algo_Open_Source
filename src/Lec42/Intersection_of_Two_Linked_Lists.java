package Lec42;

public class Intersection_of_Two_Linked_Lists {
    public static void main(String[] args) throws Exception {
        Intersection_of_Two_Linked_Lists ll = new Intersection_of_Two_Linked_Lists();
        ll.addLast(4);ll.addLast(1);
        ll.addLast(8);ll.addLast(4);ll.addLast(5);
        ll.Display();
        Intersection_of_Two_Linked_Lists ll1 = new Intersection_of_Two_Linked_Lists();
        ll1.addLast(5);ll1.addLast(6);ll1.addLast(1);
        ll1.tail.next = ll.getNode(2);
        ll1.Display();
        Intersection_of_Two_Linked_Lists ll2 = new Intersection_of_Two_Linked_Lists();
        ll2.head = ll2.Intersection(ll.head, ll1.head);
        if(ll2.head !=null){
            System.out.println(ll2.head.data);
        }else{
            System.out.println("Not found");
        }
    }

    public Node Intersection(Node head1 , Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1!=temp2){
            if(temp1 == null){
                temp1 = head2;
            }else {
                temp1 = temp1.next;
            }
            if(temp2 == null){
                temp2 = head1;
            }else{
                temp2 = temp2.next;
            }
        }
        return temp1;
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

    public Node getNode(int k) throws Exception {
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
            Node kPrev = getNode(k - 1);
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
        return getNode(k).data;
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
            Node temp = getNode(size - 2);
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
        Node curr = getNode(k);
        Node prev = getNode(k - 1);
        prev.next = curr.next;
        curr.next = null;
        size--;
        return curr.data;
    }
}
