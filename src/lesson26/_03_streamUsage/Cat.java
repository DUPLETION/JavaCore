package lesson26._03_streamUsage;

import lombok.Value;

import java.util.Objects;

@Value

public class Cat implements Comparable<Cat> {

    String name;
    int age;

    @Override
    public int compareTo(Cat cat) {
        return name.compareTo(cat.name);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
