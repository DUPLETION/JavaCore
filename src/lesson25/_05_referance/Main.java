package lesson25._05_referance;

import lesson25._01_base.Breed;
import lesson25._01_base.Cat;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Ссылка на статический метод
        //Function<String, Boolean> function = str -> Boolean.valueOf(str);
        Function<String, Boolean> function = Boolean::valueOf;;
        System.out.println(function.apply("True"));

        System.out.println("__________________________________________");
        //Ссылка на не статический метод конкретного объекта

        var cat = new Cat("Cat1", Breed.GARBAGE, 5);
        //Function<Cat, String> catFunction = c -> c.getName();
        Function<Cat, String> catFunction = Cat::getName;
        System.out.println(catFunction.apply(cat));

        System.out.println("--------------");
        //Ссылка на не статический метод не конкретного объекта, но конкретного типа
        //Function<String, String> strFunction = str-> str.toUpperCase;
        Function<String, String> strFunction = String::toUpperCase;
        System.out.println(strFunction.apply("bla-bla-bla"));

        //Ссылка на конструктор

        System.out.println("--------------");
        Supplier<Cat> catSupplier = Cat:: new;
        System.out.println(catSupplier.get());

        Function<String, Cat> catBuilder = Cat::new;
        System.out.println(catBuilder.apply("Cat2"));


    }
}
