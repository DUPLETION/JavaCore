package lesson26._02_streamCreation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //stream пустой empty
        Stream.empty();
        //из коллекции
        List.of(1,2,3).stream();
        Set.of(1,2,3).stream();
        //из Map
        new HashMap<>().entrySet().stream();
        //из массива
        Arrays.stream(new int[]{1,2,3,});
        //из конкретных элекментов
        Stream.of(1,2,3);

    }
}
