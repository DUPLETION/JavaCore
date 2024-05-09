package lesson25._03_var_usage;



public class Main1 {


    public static void main(String[] args) {
        int x = 70;
        int y = 30;
        Operable operable = () -> {
            // x = 20; - использовать не можем. должны быть final
            return x + y;
        };

        //x = 20; - тоже не можем исменять
        System.out.println(operable.operate());

    }
}
