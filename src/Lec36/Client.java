package Lec36;

public class Client {
    public static void main(String[] args) {
        P obj = new C();
        System.out.println(obj.d);
        System.out.println(obj.d1);
        System.out.println(((C)(obj)).d);//typecasting C here
        System.out.println(((C)(obj)).d2);

        obj.fun1();
        ((C)obj).fun2();
        ((C)(obj)).fun2();
        obj.fun();
        System.out.println(add(2,3,4,6,7,4,7,45,34,34,342,32));
    }
    public static int add(int...a){
        int sum = 0 ;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        return sum;
    }
}

