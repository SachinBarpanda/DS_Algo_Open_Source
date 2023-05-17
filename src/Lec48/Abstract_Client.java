package Lec48;

public class Abstract_Client {
    public static void main(String[] args) {
        Abstract_Demo ab = new Abstract_Child();
        Abstract_Demo a = new Abstract_Demo() {
            @Override
            public void fun4() {

            }

            @Override
            public void fun21() {

            }
        };
        ab.fun4();
    }
}
