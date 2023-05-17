package Lec52;

public class Generic_Heap_Client {
    public static void main(String[] args) {
        Generic_Heap<Cars> gp = new Generic_Heap();
        gp.add(new Cars(200,10,"White")) ;
        gp.add(new Cars(1000,20,"Grey")) ;// new Cars(1000,20,"Grey");
        gp.add(new Cars(345,3,"Red"));//arr[2] = new Cars(345,3,"Red");
        gp.add(new Cars(34,89,"Black")) ;//arr[3] =;
        gp.add(new Cars(8907,6,"Yellow")) ;//arr[4] = ;
        gp.Display();
    }

}
