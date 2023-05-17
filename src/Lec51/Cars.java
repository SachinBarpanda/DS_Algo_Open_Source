package Lec51;

public class Cars  {//implements Comparable<Cars>{
    int speed;
    int price;
    String color;

    public Cars(){

    }
    public Cars(int price , int speed , String color){
        this.speed = speed;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString(){
        return "P="+this.price+" S="+this.speed+" C="+this.color;
    }

//    @Override
//    public int compareTo(Cars o) {
////        return o.price - this.price;
////        return this.speed - o.speed;
//        return this.color.compareTo(o.color);
//    }
}
