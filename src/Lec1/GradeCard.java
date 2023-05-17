package Lec1;

public class GradeCard {
    public static void main(String[] args) {
        int marks = 56;
        if(marks>=75){
            System.out.println("A");
        }else if(marks >= 65 && marks< 75){
            System.out.println("B");
        }else if(marks >= 55 && marks< 65){
            System.out.println("C");
        }else if(marks >= 45 && marks< 55){
            System.out.println("D");
        }else if( marks< 45){
            System.out.println("Fail");
        }else{
            System.out.println("Invalid Input");
        }
    }
}
