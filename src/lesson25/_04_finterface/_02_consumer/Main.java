package lesson25._04_finterface._02_consumer;

import java.util.Locale;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        //T -> void
        Consumer<String> toUpperCaseConsumer = str -> System.out.println(str.toUpperCase());
        Consumer<String> toLowerCaseConsumer = str -> System.out.println(str.toLowerCase());
        toUpperCaseConsumer.accept("hello");
        toLowerCaseConsumer.accept("HELLO");
        toLowerCaseConsumer.andThen(toUpperCaseConsumer).accept("AsDf");
    }
}
