package lesson25._04_finterface._03_function;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //T -> R
        Function<Double, Long> function = d -> Math.round(d);
        System.out.println(function.apply(125.789));

    }
}
