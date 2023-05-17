package Lec42;

public class Remove_Cycle {
    public static void main(String[] args) throws Exception {
        Remove_Cycle rc = new Remove_Cycle();
        rc.addLast(1);rc.addLast(2);rc.addLast(3);
        rc.addLast(4);rc.addLast(5);rc.addLast(6);
        rc.addLast(7);rc.addLast(8);
        rc.Display();
        rc.createCycle();
//        rc.cycleRemoval2();
//        rc.cycleRemoval1();
        rc.cycleRemoval3();
        rc.Display();

    }
    public void cycleRemoval3(){
        Node meet = hasCycle(head);
        if(meet==null){
            return;
        }
        Node slow = head;
        Node fast = meet;
        while(slow.next != fast.next){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }
    public void cycleRemoval2(){
        Node meet = hasCycle(head);
        if(meet==null){
            return;
        }
        Node slow = head;
        Node fast = meet.next;
        int count = 1;
        while(fast!=meet){
            fast = fast.next;
            count++;
        }
        fast = head;
        for (int i = 0; i < count; i++) {
            fast = fast.next;
        }
        while(slow.next!=fast.next){
            fast = fast.next;
            slow = slow.next;
        }
        fast.next = null;
    }
    public void cycleRemoval1(){
        Node meet = hasCycle(head);
        if(meet==null){
            return;
        }
        Node start = head;
        Node temp = meet;
        while(temp.next!=start){
            if(temp!=meet){
                temp = temp.next;
            }else{
                start = start.next;
                temp = temp.next;
            }
        }
        temp.next = null;
        return;

    }
    public void createCycle() throws Exception {
        Node nn = getNode(2);
        this.tail.next = nn;
    }

    public Node hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return slow;
            }
        }
        return null;
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
