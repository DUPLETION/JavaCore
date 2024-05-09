package lesson25._01_base;

public interface Searchable<T> {
    boolean test(Cat cat, T value);
}
