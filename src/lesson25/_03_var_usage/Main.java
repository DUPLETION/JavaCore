package lesson25._03_var_usage;

public class Main {
    static int x = 10;
    static int y = 20;

    public static void main(String[] args) {
        System.out.println("x =  " + x);
        System.out.println("y =  " + y);
        Operable operable = () -> {
            x = 30;
            return x + y;
        };
        System.out.println(operable.operate());

    }
}
